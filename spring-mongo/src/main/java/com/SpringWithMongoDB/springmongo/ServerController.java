package com.SpringWithMongoDB.springmongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ServerController {
    @Autowired
    private serverService serverservice;
    @GetMapping("/servers")
    public List<entity> fetchServersList(){
        return serverservice.fetchServersList();
    }

    @GetMapping("/servers/name/{serverName}")
    public entity fetchServersByName(@PathVariable("serverName") String serverName){
        return serverservice.fetchServersByName(serverName);
    }
    @GetMapping("/severs/serverId/{serverId}")
    public entity fetchServersById(@PathVariable("serverId") String serverId){
        return serverservice.fetchServersById(serverId);
    }

    @PutMapping("/servers/{serverId}")
    public entity updateServersById(@PathVariable("serverId") String serverId, @RequestBody entity server){
        return serverservice.updateServersById(serverId, server);
    }



    @DeleteMapping("/servers/{serverId}")
    public void deleteById(@PathVariable("serverId") String serverId)
    {
        serverservice.deleteById(serverId);
    }

}
