package com.sherzad.hcloud.response;

import java.time.ZonedDateTime;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Action {

    private Long id;
    private String command;
    private ActionStatus status;
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

    public enum ActionStatus {
        RUNNING("running"),
        SUCCESS("success"),
        ERROR("error");

        private String description;

        ActionStatus(String description) {
            this.description = description;
        }
    }
}
