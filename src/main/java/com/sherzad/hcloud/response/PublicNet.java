package com.sherzad.hcloud.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PublicNet {

    private IPv4 ipv4;
    private IPv6 ipv6;
    private String floatingIps;

    @Getter
    @Setter
    public static class IPv4 {

        private String ip;
        private boolean blocked;

        @JsonProperty("dns_ptr")
        private String dnsPtr;
    }

    @Getter
    @Setter
    public static class IPv6 {

        private String ip;
        private boolean blocked;
        private List<DnsPtr> dnsPtr;
    }
}
