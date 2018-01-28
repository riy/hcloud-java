package com.sherzad.hcloud.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

/**
 * https://docs.hetzner.cloud/#resources-locations-get
 */
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class LocationsResponse {

    private List<Location> locations;
    private Meta meta;
    private Error error;
}
