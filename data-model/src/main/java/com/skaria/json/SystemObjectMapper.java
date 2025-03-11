package com.skaria.json;

import com.fasterxml.jackson.databind.ObjectMapper;

public class SystemObjectMapper {

    private static ObjectMapper mapper;

    private SystemObjectMapper() {}

    public static synchronized ObjectMapper getInstance(){
        if(mapper == null){
            mapper = new ObjectMapper();
        }
        return mapper;
    }
}
