package com.oneentropy.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.oneentropy.model.Component;

import java.io.File;
import java.io.IOException;

public class ResourceReader {

    public static final ObjectMapper OBJECT_MAPPER = new ObjectMapper(new YAMLFactory());

    public static Component readComponent(String path) throws IOException {
        Component component = OBJECT_MAPPER.readValue(new File(path), Component.class);
        return component;
    }

}
