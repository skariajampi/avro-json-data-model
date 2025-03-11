package com.skaria.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

public interface JsonPrintable {

    default String toJson() {
        return toJson(false);
    }

    default String toJson(boolean prettyPrint){
        ObjectMapper objectMapper = SystemObjectMapper.getInstance();
        ObjectWriter writer = objectMapper.writer();
        writer = prettyPrint ? writer.withDefaultPrettyPrinter(): writer;
        try {
           return writer.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            return String.format("Error serializing %s: due to exception : %s", getClass().getName(), e.getMessage());
        }
    }

}
