package com.sherzad.hcloud.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ServerTypePrice {

    private String location;

    @JsonProperty("price_hourly")
    private Price priceHourly;

    @JsonProperty("price_monthly")
    private Price priceMonthly;
}
