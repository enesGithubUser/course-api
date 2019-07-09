package com.gncky.courseapi.topic;

import lombok.Data;

@Data
public class Topic {

    public String id;
    public String name;
    public String description;

    public Topic(String id, String name, String desc){

        this.id = id;
        this.name = name;
        this.description = desc;

    }
}
