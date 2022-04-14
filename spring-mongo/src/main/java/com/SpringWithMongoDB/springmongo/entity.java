package com.SpringWithMongoDB.springmongo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
@Document("servers")
public class entity {
    @Field("serverId")
    private String serverId;
    @Field("name")
    private String name;
    @Field("framework")
    private String framework;
    @Field("language")
    private String language;

    public String getServerId() {
        return serverId;
    }
    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    public String getName() {
        return name;
    }

    public String getLanguage() {
        return language;
    }

    public String getFramework() {
        return framework;
    }

    public entity() {
    }
}
