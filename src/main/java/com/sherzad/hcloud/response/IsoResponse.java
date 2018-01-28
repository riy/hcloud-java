package com.sherzad.hcloud.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

/**
 * https://docs.hetzner.cloud/#resources-isos-get-1
 */
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class IsoResponse {

    private Iso iso;
    private Error error;
}
