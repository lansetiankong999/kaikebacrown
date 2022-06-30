package com.jump.kaikebacrown.domain.token;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Auto-generated: 2022-06-30 15:39:54
 *
 * @author www.jsons.cn
 * @website http://www.jsons.cn/json2java/
 */
public class Data {

    @JsonProperty("access_token")
    private String accessToken;

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getAccessToken() {
        return accessToken;
    }

}