package com.sherzad.hcloud.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * https://docs.hetzner.cloud/#resources-servers-delete
 */
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)

public class ActionsResponse {

    private List<Action> actions;
}
