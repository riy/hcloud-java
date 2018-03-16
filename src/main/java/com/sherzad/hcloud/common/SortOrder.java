package com.sherzad.hcloud.common;

public enum SortOrder {
    ASC("asc"),
    DESC("desc");

    private String description;

    SortOrder(String description) {
        this.description = description;
    }

}
