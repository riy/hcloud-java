package com.sherzad.hcloud.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EnableServerBackupRequest {

    @JsonProperty("backup_window")
    public BackupWindow backupWindow;

    @AllArgsConstructor
    public enum BackupWindow {
        BETWEEN_22_AND_02("22-02"),
        BETWEEN_02_AND_06("02-06"),
        BETWEEN_06_AND_10("06-10"),
        BETWEEN_10_AND_14("10-14"),
        BETWEEN_14_AND_18("14-18"),
        BETWEEN_18_AND_22("18-22");

        private String description;
    }
}
