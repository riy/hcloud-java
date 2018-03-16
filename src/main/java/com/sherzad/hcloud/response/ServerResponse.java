package com.sherzad.hcloud.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

/**
 * https://docs.hetzner.cloud/#resources-servers-get-1
 */
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class ServerResponse {

    private Server server;
    private Action action; // Comes back for "Create Server"
    private String rootPassword; // Comes back for "Create Server" and "Reset root Password of a Server"
    private Error error;
}
