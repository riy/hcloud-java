package com.sherzad.hcloud.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FloatingIp {

    private Long id;
    private String description;

    /**
     * May be ipv4 or ipv6
     */
    private String ip;
    private String type;
    private Long server;

    @JsonProperty("dns_ptr")
    private DnsPtr dnsPtr;

    @JsonProperty("home_location")
    private Location homeLocation;

    private boolean blocked;

}
