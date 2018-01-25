package com.sherzad.hcloud.response;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Error {

    private String code;
    private String message;
    private Details details;

    @Getter
    @Setter
    public static class Details {

        private List<Field> fields;

        @Getter
        @Setter
        public static class Field {

            private String name;
            private List<String> messages;
        }
    }
}
