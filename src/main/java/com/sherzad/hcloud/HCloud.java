package com.sherzad.hcloud;

import java.util.Collections;

import com.sherzad.hcloud.response.ServersResponse;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

public class HCloud {

    private static final String API_ENDPOINT = "https://api.hetzner.cloud/v1";

    private final String token;
    private final HttpEntity<String> entity;
    private final RestTemplate restTemplate;

    public HCloud(final String token) {
        this.token = token;

        final HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        headers.add("Authorization", "Bearer " + token);
        this.entity = new HttpEntity<>("parameters", headers);

        restTemplate = new RestTemplate();
    }

    public ServersResponse getServers() {
        return restTemplate.exchange(API_ENDPOINT + "/servers", HttpMethod.GET, entity, ServersResponse.class).getBody();
    }

    public ServersResponse getServers(final String name) {
        return restTemplate.exchange(API_ENDPOINT + "/servers?" + name, HttpMethod.GET, entity, ServersResponse.class)
                .getBody();
    }
}
