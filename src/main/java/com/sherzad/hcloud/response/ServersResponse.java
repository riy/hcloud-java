package com.sherzad.hcloud.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

/**
 * https://docs.hetzner.cloud/#resources-servers-get
 */
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class ServersResponse {

    private List<Server> servers;
    private Meta meta;
    private Error error;
}
