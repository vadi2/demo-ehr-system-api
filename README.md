# Running

Run the application with:

```bash
./gradlew bootRun
```

# Testing

Create a new patient:

```bash
curl -X POST -H "Content-Type: application/json" -d '{"firstName":"John","lastName":"Doe","dateOfBirth":"1990-01-01","gender":"Male","phoneNumber":"1234567890","email":"john.doe@example.com"}' http://localhost:8080/api/patients
```

Get all patients:

```bash
curl http://localhost:8080/api/patients
```

Get a specific patient (replace {id} with the actual id):

```bash
curl http://localhost:8080/api/patients/{id}
```

# Database view
You can also check the H2 database console to verify the data:

* Open a web browser and go to http://localhost:8080/h2-console
* Use the following settings:
  * JDBC URL: jdbc:h2:mem:testdb
  * User Name: sa
  * Password: (leave blank)
* Click "Connect" and you should be able to see and query the PATIENTS table.
