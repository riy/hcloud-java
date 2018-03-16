package com.sherzad.hcloud.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AttachIsoToServerRequest {

    /**
     * Corresponds to Iso.name
     */
    @JsonProperty("iso")
    public String iso;

}
