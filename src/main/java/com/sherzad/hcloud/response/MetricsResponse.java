package com.sherzad.hcloud.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

/**
 * https://docs.hetzner.cloud/#resources-servers-get-2
 */
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class MetricsResponse {

    private Metrics metrics;
}
