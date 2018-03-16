package com.sherzad.hcloud.common;

public enum ActionAttribute {

    ID("id"),
    COMMAND("command"),
    STATUS("status"),
    PROGRESS("progress"),
    STARTED("started"),
    FINISHED("finished");

    private String description;

    ActionAttribute(String description) {
        this.description = description;
    }
}
