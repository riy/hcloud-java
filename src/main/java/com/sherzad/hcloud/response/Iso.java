package com.sherzad.hcloud.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.time.ZonedDateTime;

@Getter
@Setter
public class Iso {

    private Long id;
    private String name;
    private String description;
    private String type;
    private ZonedDateTime deprecated;

}
