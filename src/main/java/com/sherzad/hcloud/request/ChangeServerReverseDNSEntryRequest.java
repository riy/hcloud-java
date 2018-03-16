package com.sherzad.hcloud.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChangeServerReverseDNSEntryRequest {

    /*
     * IPv4 or IPv6 address
     */
    private String ip;

    @JsonProperty("dns_ptr")
    private String dnsPtr;
}
