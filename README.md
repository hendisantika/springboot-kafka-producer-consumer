# springboot-kafka-producer-consumer

### Things todo list:

1. Clone this repository: `git clone https://github.com/hendisantika/springboot-kafka-producer-consumer.git`
2. Navigate to the folder: `cd springboot-kafka-producer-consumer`
3. Run Kafka & ZooKeeper
4. Run the application: `mvn clean spring-boot:run`
5. Open POSTMAN App
6. Import POSTMAN Collection

API 1

```shell
curl --location 'localhost:8080/api/kafka' \
--header 'Content-Type: application/json' \
--data '{
    "field1": "Belajar",
    "field2": "Belajar"
}'
```

API 2

```shell
curl --location 'localhost:8080/api/kafka/v2' \
--header 'Content-Type: application/json' \
--data '{
    "title": "Belajar",
    "description": "KAFKA"
}'
```

Article Reference: https://medium.com/@Ankitthakur/apache-kafka-installation-on-mac-using-homebrew-a367cdefd273

or You can use Kafka Confluent:

* https://www.confluent.io/installation/
* https://docs.confluent.io/platform/current/installation/docker/installation.html?_ga=2.213328855.256678281.1669946497-1212763068.1669946497&_gac=1.222188010.1669962327.Cj0KCQiAvqGcBhCJARIsAFQ5ke6h7w-O06_GtJ7M-VWXUtw0dlHEtRDZPNmZ-cxNtDpfyOncDr2dA5oaAsgeEALw_wcB#tutorials-and-demos
* https://docs.confluent.io/platform/current/platform-quickstart.html#step-2-create-ak-topics-for-storing-your-data
