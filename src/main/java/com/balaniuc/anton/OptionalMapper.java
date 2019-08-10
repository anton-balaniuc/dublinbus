package com.balaniuc.anton;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Optional;

public class OptionalMapper extends ObjectMapper {

    public <T> Optional<T> getValue(String content, Class<T> valueType){
        try {
            return  Optional.ofNullable(super.readValue(content, valueType));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return Optional.empty();

    }
}
