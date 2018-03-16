package com.sherzad.hcloud.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChangeServerTypeRequest {

    @JsonProperty("upgrade_disk")
    private boolean upgradeDisk;

    @JsonProperty("server_type")
    private String serverType;
}
