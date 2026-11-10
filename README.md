# Jenkins Maven Pipeline

## 1. Project Description
This project is a Java Maven application created to practice Continuous Integration (CI) using Jenkins Pipeline.

The pipeline automatically builds the project and runs unit tests whenever changes are detected in the GitHub repository.

## 2. Technologies Used
- Java 11
- Apache Maven 3.9.12
- Jenkins
- Git and GitHub
- JUnit

## 3. Build
Compile the source code using Maven:

```bash
mvn clean compile
```

## 4. Test
Run unit tests using Maven:

```bash
mvn test
```

## 5. Jenkins Pipeline
The Jenkins pipeline consists of the following stages:

- **Build:** Compile the Java source code.
- **Test:** Execute unit tests and check the results.

## 6. Jenkins Configuration
Jenkins uses the `Jenkinsfile` in this repository to define and execute the CI pipeline.

The pipeline is configured to retrieve source code from GitHub and automate the Build and Test stages.
