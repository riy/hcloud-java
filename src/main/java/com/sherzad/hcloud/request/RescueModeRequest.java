package com.sherzad.hcloud.request;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RescueModeRequest {

    private RescueModeType type;
    private List<Long> sshKeys; // Only available for types linux32 and linux64

    public enum RescueModeType {
        LINUX32("linux32"),
        LINUX64("linux64"),
        FREEBSD64("freebsd64");

        private String description;

        RescueModeType(String description) {
            this.description = description;
        }

    }
}
