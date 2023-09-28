pipeline {
    agent any
    tools{
        maven 'maven'
        jdk 'jdk-17'
    }

 

    stages {
    stage('Git checkout') {
            steps {
                git branch: 'main', credentialsId: 'github_credential', url: 'https://github.com/VignathaNVR/searchview-obrs.git'
            }
        }

 

 

 

        stage('Build'){
            steps {
                bat "mvn clean install -DskipTests"
            }
        }

 

 

 

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
       
 

 

 

       stage("Deployment") {
           steps{
    bat 'start /B mvnw spring-boot:run -Dserver.port=8001'
}
       }
    }
}
