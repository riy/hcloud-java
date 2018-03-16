package com.sherzad.hcloud.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateFloatingIpRequest {

    /*
     * May be ipv4 or ipv6
     */
    private String type;
    private Long server;
    private String description;
}
