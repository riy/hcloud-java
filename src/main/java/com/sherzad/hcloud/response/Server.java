package com.sherzad.hcloud.response;

import java.time.ZonedDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Server {

    private Integer id;
    private String name;
    private String status;
    private ZonedDateTime created;
    private PublicNet publicNet;
    private ServerType serverType;
    private Datacenter datacenter;
    private Image image;
    private Iso iso;
    private boolean rescueEnabled;
    private boolean locked;
    private String backupWindow;
    private Long outgoingTraffic;
    private Long ingoingTraffic;
    private Long includedTraffic;
}
