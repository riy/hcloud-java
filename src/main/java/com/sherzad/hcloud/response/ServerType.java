package com.sherzad.hcloud.response;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ServerType {

    private Integer id;
    private String name;
    private String description;
    private Integer cores;
    private Integer memory;
    private Integer disk;
    private List<Price> prices;
    private String storageType;

    @Getter
    @Setter
    public static class Price {

        private String location;
        private PriceType priceHourly;
        private PriceType priceMonthly;

        @Getter
        @Setter
        public static class PriceType {

            private Double net;
            private Double gross;
        }
    }
}
