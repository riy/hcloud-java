package com.sherzad.hcloud.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RebuildServerRequest {

    private String image; // Corresponds with Image.name
}
