package com.sherzad.hcloud.response;

import java.time.ZonedDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sherzad.hcloud.common.ImageType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Image {

    private Long id;
    private ImageType type;
    private ImageStatus status;
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
    private OsFlavor osFlavor;

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

    public enum ImageStatus {
        CREATING("creating"),
        AVAILABLE("available");

        private String description;

        ImageStatus(String description) {
            this.description = description;
        }

    }

    public enum OsFlavor {
        UBUNTU("ubuntu"),
        CENTOS("centos"),
        DEBIAN("debian"),
        FEDORA("fedora"),
        UNKNOWN("unknown");

        private String description;

        OsFlavor(String description) {
            this.description = description;
        }

    }

}
