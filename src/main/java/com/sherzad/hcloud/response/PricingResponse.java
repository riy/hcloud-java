package com.sherzad.hcloud.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

/**
 * https://docs.hetzner.cloud/#resources-pricing-get
 */
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class PricingResponse {

    private Pricing pricing;
    private Error error;
}
