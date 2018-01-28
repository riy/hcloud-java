package com.sherzad.hcloud.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

/**
 * https://docs.hetzner.cloud/#resources-datacenters-get
 */
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class DatacentersResponse {

    private List<Datacenter> datacenters;
    private Long recommendation;
    private Meta meta;
    private Error error;
}
