package com.sherzad.hcloud.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Price {

    private Double net;
    private Double gross;
}
