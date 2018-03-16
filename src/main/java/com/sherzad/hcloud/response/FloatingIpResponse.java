package com.sherzad.hcloud.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FloatingIpResponse {

    @JsonProperty("floating_ip")
    public FloatingIp floatingIp;
}
