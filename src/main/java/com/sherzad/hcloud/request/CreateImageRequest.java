package com.sherzad.hcloud.request;

import com.sherzad.hcloud.common.ImageType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateImageRequest {

    private String description;
    private ImageType type;
}
