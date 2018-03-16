package com.sherzad.hcloud.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FloatingIpsResponse {

    @JsonProperty("floating_ips")
    public List<FloatingIp> floatingIps;
}
