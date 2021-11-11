pipeline {
    agent any

    tools {
        
        maven "M3"
        jdk 'OPENJDK-11'
    }

    stages {
        stage('Build') {
            steps {

                sh "mvn -Dmaven.test.failure.ignore=true clean package"

                
            }

            
        }
    }
}
