package com.sherzad.hcloud.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

/**
 * https://docs.hetzner.cloud/#resources-server-types-get-1
 */
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class ServerTypeResponse {

    private ServerType serverType;
    private Error error;
}
