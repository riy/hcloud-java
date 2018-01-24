package com.sherzad.hcloud.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Datacenter {

    private Integer id;
    private String name;
    private String description;
    private Location location;

    @Getter
    @Setter
    public static class Location {

        private Integer id;
        private String name;
        private String description;
        private String country;
        private String city;
        private Double latitude;
        private Double longitude;
    }
}
