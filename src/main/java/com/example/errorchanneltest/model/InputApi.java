package com.example.errorchanneltest.model;

import java.util.List;
import java.util.Map;
import lombok.Data;

@Data
public class InputApi {

    private String id;

    private EventType type;

    private List<String> object;

    private String source;

    private Map<String, String> contextObject;

}
