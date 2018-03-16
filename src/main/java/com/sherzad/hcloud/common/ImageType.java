package com.sherzad.hcloud.common;

public enum ImageType {
    SNAPSHOT("snapshot"),
    BACKUP("backup"),
    SYSTEM("system");

    private String description;

    ImageType(String description) {
        this.description = description;
    }
}
