package com.sherzad.hcloud.request;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder

public class ServerRequest {

    private String name;

    @JsonProperty("server_type")
    private String serverType;
    private String datacenter;
    private String location;

    @JsonProperty("start_after_create")
    private boolean startAfterCreate;
    private String image;

    @JsonProperty("ssh_keys")
    private List<Long> sshKeys;

    @JsonProperty("user_data")
    private String userData;
}
