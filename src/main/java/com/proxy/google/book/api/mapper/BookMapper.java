package com.proxy.google.book.api.mapper;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookMapper {

    @Autowired
    private ObjectMapper objectMapper;

    /*
    public Collection<Volume> toList(JSONObject volumes){

    }*/


}
