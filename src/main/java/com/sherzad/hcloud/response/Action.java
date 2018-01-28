package com.sherzad.hcloud.response;

import java.time.ZonedDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Action {

    private Long id;
    private String command;
    private String status;
    private Long progress;
    private ZonedDateTime started;
    private ZonedDateTime finished;
    private List<Resources> resources;
    private Error error;

    @Getter
    @Setter
    public static class Resources {

        private Long id;
        private String type;
    }
}
