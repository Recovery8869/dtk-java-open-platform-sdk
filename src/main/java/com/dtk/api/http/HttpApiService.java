package com.dtk.api.http;

import com.dtk.api.constant.DtkApiConstant;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * dtk api: HttpAPIService
 *
 * @author 1
 * @date 2020/11/10 11:37
 */
@Component
@Slf4j
public class HttpApiService {
    private final CloseableHttpClient closeableHttpClient;
    private final RequestConfig requestConfig;
    private static final int HTTP_SUCCESS_STATUS_CODE = 200;
    private static RequestConfig config;
    private static CloseableHttpClient httpClient;

    public HttpApiService(CloseableHttpClient closeableHttpClient, RequestConfig requestConfig) {
        this.closeableHttpClient = closeableHttpClient;
        this.requestConfig = requestConfig;
    }

    @PostConstruct
    private void init() {
        config = this.requestConfig;
        httpClient = this.closeableHttpClient;
    }

    /**
     * 不带参数的get请求，如果状态码为200，则返回body，如果不为200，则返回null
     *
     * @param url url
     * @return result json
     */
    public static String doGet(String url) throws IOException {
        // 声明 http get 请求
        HttpGet httpGet = new HttpGet(url);
        httpGet.setHeader("Accept-Encoding", "gzip");
        // 装载配置信息
        httpGet.setConfig(config);
        // 发起请求
        return getResultJson(httpGet);
    }

    private static String getResultJson(HttpUriRequest request) throws IOException {
        CloseableHttpResponse response = httpClient.execute(request);
        // 判断状态码是否为200
        if (HTTP_SUCCESS_STATUS_CODE == response.getStatusLine().getStatusCode()) {
            // 返回响应体的内容
            return EntityUtils.toString(response.getEntity(), DtkApiConstant.Charset.UTF_8);
        } else {
            request.abort();
            log.error(String.format("%s-----%s", response.getStatusLine().toString(),
                    request.getURI().toString()));
            return DtkApiConstant.EMPTY_STR;
        }
    }

    /**
     * 带参数的get请求，如果状态码为200，则返回body，如果不为200，则返回null
     *
     * @param url url
     * @return parameter map
     * @throws URISyntaxException URISyntaxException
     * @throws IOException        IOException
     */
    public static String doGet(String url, Map<String, String> map) throws URISyntaxException, IOException {
        URIBuilder uriBuilder = new URIBuilder(url);
        if (map != null) {
            // 遍历map,拼接请求参数
            map.forEach(uriBuilder::setParameter);
        }

        // 调用不带参数的get请求
        return doGet(uriBuilder.build().toString());
    }

    /**
     * 带参数的post请求
     *
     * @param url  url
     * @param json body info
     * @return result json
     */
    public String doPost(String url, String json) throws IOException {
        // 声明httpPost请求
        HttpPost httpPost = new HttpPost(url);
        httpPost.setHeader("Accept-Encoding", "gzip");
        // 装载配置信息
        httpPost.setConfig(config);
        // 创建请求内容
        StringEntity entity = new StringEntity(json, ContentType.APPLICATION_JSON);
        httpPost.setEntity(entity);

        // 发起请求
        return getResultJson(httpPost);
    }

    /**
     * 带参数的post请求
     *
     * @param url url
     * @param map body info
     * @return result body
     * @throws IOException IOException
     */
    public HttpResult doPost(String url, Map<String, String> map) throws IOException {
        // 声明httpPost请求
        HttpPost httpPost = new HttpPost(url);
        // 加入配置信息
        httpPost.setConfig(config);
        // 判断map是否为空，不为空则进行遍历，封装from表单对象
        if (map != null) {
            List<NameValuePair> list = new ArrayList<>();
            map.forEach((key, value) -> list.add(new BasicNameValuePair(key, value)));
            // 构造from表单对象
            UrlEncodedFormEntity urlEncodedFormEntity = new UrlEncodedFormEntity(list, DtkApiConstant.Charset.UTF_8);
            // 把表单放到post里
            httpPost.setEntity(urlEncodedFormEntity);
        }

        // 发起请求
        CloseableHttpResponse response = httpClient.execute(httpPost);
        return new HttpResult(response.getStatusLine().getStatusCode(), EntityUtils.toString(response.getEntity(),
                DtkApiConstant.Charset.UTF_8));
    }
}
