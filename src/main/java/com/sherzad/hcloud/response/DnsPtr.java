package com.sherzad.hcloud.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DnsPtr {

    private String ip;

    @JsonProperty("dns_ptr")
    private String dnsPtr;
}
