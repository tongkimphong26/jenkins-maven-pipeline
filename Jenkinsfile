pipeline {
    agent any

    tools {
        jdk 'JDK11'
        maven 'Maven 3.9.12'
    }

    stages {
        stage('Build') {
            steps {
                echo 'Building Maven project...'
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                echo 'Running JUnit tests...'
                sh 'mvn test'
            }
        }
    }

    post {
        always {
            junit 'target/surefire-reports/*.xml'
        }
    }
}
