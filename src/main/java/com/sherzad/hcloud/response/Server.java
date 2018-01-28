package com.sherzad.hcloud.response;

import java.time.ZonedDateTime;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Server {

    private Long id;
    private String name;
    private String status;
    private ZonedDateTime created;

    @JsonProperty("public_net")
    private PublicNet publicNet;

    @JsonProperty("server_type")
    private ServerType serverType;

    private Datacenter datacenter;
    private Image image;
    private Iso iso;

    @JsonProperty("rescue_enabled")
    private boolean rescueEnabled;

    private boolean locked;

    @JsonProperty("backup_windows")
    private String backupWindow;

    @JsonProperty("outgoing_traffic")
    private Long outgoingTraffic;

    @JsonProperty("ingoing_traffic")
    private Long ingoingTraffic;

    @JsonProperty("included_traffic")
    private Long includedTraffic;
}
