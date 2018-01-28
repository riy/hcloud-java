package com.sherzad.hcloud.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pricing {

    private String currency;

    @JsonProperty("vat_rate")
    private Double vatRate;
    private PriceImage image;

    @JsonProperty("floating_ip")
    private PriceFloatingIp floatingIp;
    private PriceTraffic traffic;

    @JsonProperty("server_backup")
    private PriceServerBackup serverBackup;

    @JsonProperty("server_types")
    private List<ServerType> serverTypes;

    @Getter
    @Setter
    public static class PriceImage {

        @JsonProperty("price_per_gb_month")
        private Price pricePerGbMonth;
    }

    @Getter
    @Setter
    public static class PriceFloatingIp {

        @JsonProperty("price_monthly")
        private Price priceMonthly;
    }

    @Getter
    @Setter
    public static class PriceTraffic {

        @JsonProperty("price_per_tb")
        private Price pricePerTb;
    }

    @Getter
    @Setter
    public static class PriceServerBackup {

        private Double percentage;
    }
}
