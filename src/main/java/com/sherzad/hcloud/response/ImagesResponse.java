package com.sherzad.hcloud.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

/**
 * https://docs.hetzner.cloud/#resources-images-get
 */
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class ImagesResponse {

    private List<Image> images;
    private Meta meta;
    private Error error;
}
