package com.SpringWithMongoDB.springmongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class serverServiceImp implements serverService{

    @Autowired
    private serverRepository serverrepository;
    @Override
    public List<entity> fetchServersList() {
        return serverrepository.findAll();
    }

    @Override
    public entity updateServersById(String serverId, entity server) {
        entity serverDb = serverrepository.findByServerId(serverId);
        if (Objects.nonNull(server.getName()) && !"".equalsIgnoreCase(server.getName())){
            serverDb.setName(server.getName());
        }
        return serverrepository.save(serverDb);
    }

    @Override
    public entity fetchServersByName(String serverName) {
        return serverrepository.findByName(serverName);
    }

    @Override
    public entity fetchServersById(String serverId) {
        return serverrepository.findByServerId(serverId);
    }

    @Override
    public void deleteById(String serverId) {
        serverrepository.deleteByServerId(serverId);
    }



}
