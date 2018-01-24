package com.sherzad.hcloud.response;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ServersResponse {

    private List<Server> servers;
    private Meta meta;
}
