package com.sherzad.hcloud.response;

import java.util.List;

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
        private String dnsPtr;
    }

    @Getter
    @Setter
    public static class IPv6 {

        private String ip;
        private boolean blocked;
        private List<DnsPtr> dnsPtr;

        @Getter
        @Setter
        public static class DnsPtr {

            private String ip;
            private String dnsPtr;
        }
    }
}
