package com.SpringWithMongoDB.springmongo;

import org.springframework.stereotype.Service;

import java.util.List;

public interface serverService {
    public List<entity> fetchServersList();

    public entity updateServersById(String serverId, entity server);

    public entity fetchServersByName(String serverName);

    public entity fetchServersById(String serverId);

    public void deleteById(String serverId);


}
