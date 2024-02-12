# SampleBackendServer

Execute the mvn build

```mvn clean package```

Go to backend-server/target location and start the server using following command

```java -jar backend-server-1.0-SNAPSHOT.jar```

*HTTP Request*

`curl -X <HTTP_METHOD> 'http://localhost:4567/hello' \
--header 'Content-Type: application/json' \
--data '{"requestId":"This is request Id"}'`

- Repalce <HTTP_METHOD> with GET, POST, PUT or DELETE method
