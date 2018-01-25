package com.sherzad.hcloud.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class ServerResponse {

    private Server server;
    private Action action;
    private String rootPassword;
    private Error error;
}
