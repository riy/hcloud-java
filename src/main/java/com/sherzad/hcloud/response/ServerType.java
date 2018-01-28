package com.sherzad.hcloud.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

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
    private List<ServerTypePrice> prices;

    @JsonProperty("storage_type")
    private String storageType;
}
