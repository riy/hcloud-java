package com.sherzad.hcloud.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

/**
 * https://docs.hetzner.cloud/#resources-locations-get-1
 */
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class LocationResponse {

    private Location location;
    private Error error;
}
