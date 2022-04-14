# Springboot-with-MongoDB
In this project I implemented different APIs in springboot with the help of mongoDB database.

**Installation requirements:**
- Intellij IDEA
- MongoDB
- - One should have basic knowledge on commands such as creation insertion updation deletion.
- Insomnia http client

**step1:**
_Go to https://start.spring.io/ and generate a new project with following dependencies_
- spring data MongoDB
- spring web
- testcontainers
- the tomcat server is embadded in the generated project.So it will help to do save time in doing server settings

**step2:**
_After generating the project open the intellij idea and open the generated project._

**step3:**
_Go to src > resources > application.properties file and add spring.data.mongodb.uri=mongodb://localhost:27017/database_name_

**step4:**
_Now start creating our rest APIs_
- create the following java files:
- - serverController
- - serverServiceImp
- create the following Interface files:
- - serverRepository
- - serverService

**step5:**
 _Start implementing the crud APIs by creating the corresponding methods and implementations in the corresponding classes and interfaces_.
 - to use the mongoDB database ,first we need to inherit the MongoRepository<> in the repository Interface.
 
 **step6:**
 _Once the implementation done run the project._
 - open **Insomnia http client** that we downloaded.
 - create crud requests and test how the API requests are being handled.


