# Steps to run

- Run the Elastic docker compose - ``docker-compose up``
- Once the service is running, run the spring boot project - 
  `mvnw.cmd clean compile spring-boot:run`
  

# Rest API Endpoints
- GET ALL Persons
`curl --location --request GET 'localhost:8080/demo'`
  
- POST (Upsert) Persons

to insert (upsert)
````aidl
curl --location --request POST 'localhost:8080/demo/upsert' \
--header 'Content-Type: application/json' \
--data-raw '{
    "firstname" : "testfirstname123",
    "lastname" : "lastname123",
    "middlename": "middle123"
}'
````

to update (upsert)
```aidl
curl --location --request POST 'localhost:8080/demo/upsert' \
--header 'Content-Type: application/json' \
--data-raw '{
    "id": "rYa9QIABGZ-Aiirr3lPR",
    "firstname" : "testfirstname123",
    "lastname" : "lastname123",
    "middlename": "middle123"
}'
```

If the id is not null/empty then update will be executed, else insert