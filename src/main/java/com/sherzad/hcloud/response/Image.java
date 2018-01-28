package com.sherzad.hcloud.response;

import java.time.ZonedDateTime;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Image {

    private Long id;
    private String type;
    private String status;
    private String name;
    private String description;

    @JsonProperty("image_size")
    private Double imageSize;

    @JsonProperty("disk_size")
    private Double diskSize;
    private ZonedDateTime created;

    @JsonProperty("created_from")
    private CreatedFrom createdFrom;

    @JsonProperty("bound_to")
    private Long boundTo;

    @JsonProperty("os_flavor")
    private String osFlavor;

    @JsonProperty("os_version")
    private String osVersion;

    @JsonProperty("rapid_redeploy")
    private boolean rapidRedeploy;

    @Getter
    @Setter
    public static class CreatedFrom {

        private Long id;
        private String name;
    }
}
