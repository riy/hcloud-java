package com.sherzad.hcloud.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Datacenter {

    private Long id;
    private String name;
    private String description;
    private Location location;

    @JsonProperty("server_types")
    private ServerTypes serverTypes;

    @Getter
    @Setter
    public static class ServerTypes {

        public List<Long> supported;
        public List<Long> available;
    }
}
