package com.sherzad.hcloud.response;

import java.time.ZonedDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Image {

    private Integer id;
    private String type;
    private String status;
    private String name;
    private String description;
    private Double imageSize;
    private Double diskSize;
    private ZonedDateTime created;
    private CreatedFrom createdFrom;
    private Long boundTo;
    private String osFlavor;
    private String osVersion;
    private boolean rapidRedeploy;

    @Getter
    @Setter
    public static class CreatedFrom {

        private Integer id;
        private String name;
    }
}
