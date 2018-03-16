package com.sherzad.hcloud.common;

public enum ImageAttribute {

    ID("id"),
    NAME("name"),
    CREATED("created");

    private String description;

    ImageAttribute(String description) {
        this.description = description;
    }
}
