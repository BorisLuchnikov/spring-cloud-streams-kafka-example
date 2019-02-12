# spring-kafka-streams-example

###Example Kafka Streams and Spring Cloud Stream

##### build project
```
mvn clean package
```

##### command run docker-compose
```
docker-compose -f ./docker/spring-kafka-stream.yml up
```

##### command run docker-compose with 4 instance input app
```
docker-compose -f ./docker/spring-kafka-stream.yml up --scale input=4
```

##### rest for send messages to Kafka
```
http://localhost:8081/message?message=m&count=3&partitionCount=6
```

##### Configurations
```
spring.cloud.stream.instanceCount - кол-во инстансов приложения слушателя
spring.cloud.stream.kafka.binder.autoAddPartitions - автоматическое создание партиций в топике Kafka
spring.cloud.stream.kafka.binder.minPartitionCount - минимальное кол-во партиций в топике Kafka
spring.cloud.stream.bindings.message-in.consumer.concurrency - кол-во потоков слушателей в одном инстансе приложения
spring.cloud.stream.instanceCount * spring.cloud.stream.bindings.message-in.consumer.concurrency - кол-во партиций в топике Kafka
```
