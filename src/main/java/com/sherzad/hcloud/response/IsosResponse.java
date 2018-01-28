package com.sherzad.hcloud.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

/**
 * https://docs.hetzner.cloud/#resources-isos-get
 */
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class IsosResponse {

    private List<Iso> isos;
    private Meta meta;
    private Error error;
}
