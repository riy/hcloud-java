package com.sherzad.hcloud.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

/**
 * https://docs.hetzner.cloud/#resources-server-types-get
 */
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class ServerTypesResponse {

    private List<ServerType> serverTypes;
    private Meta meta;
    private Error error;
}
