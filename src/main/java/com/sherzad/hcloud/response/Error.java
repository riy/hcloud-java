package com.sherzad.hcloud.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Error {

    private Code code;
    private String message;
    private Details details;

    @Getter
    @AllArgsConstructor
    public enum Code {
        FORBIDDEN("Insufficient permissions for this request"),
        INVALID_INPUT("Error while parsing or processing the input"),
        JSON_ERROR("Invalid JSON input in your request"),
        LOCKED("The item you are trying to access is locked (there is already an action running)"),
        NOT_FOUND("Entity not found"),
        RATE_LIMIT_EXCEEDED("Error when sending too many requests"),
        RESOURCE_LIMIT_EXCEEDED("Error when exceeding the maximum quantity of a resource for an account"),
        RESOURCE_UNAVAILABLE("The requested resource is currently unavailable"),
        SERVICE_ERROR("Error within a service"),
        UNIQUENESS_ERROR("One or more of the objects fields must be unique");

        private String description;
    }

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
