package com.SpringWithMongoDB.springmongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface serverRepository extends MongoRepository<entity,String> {
    public entity findByName(String Name);
    public entity findByServerId(String serverId);
    public void deleteByServerId(String serverId);
}
