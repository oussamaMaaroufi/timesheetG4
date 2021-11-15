pipeline {
    agent any

    tools {
        
        //maven "M3"
        //jdk 'OPENJDK-11'
    }

    stages {
        stage('Sonar Quick scane ') {
            steps {

                sh "mvn sonar:sonar -Dsonar.login=50853e50afdf05af75d127629d234a87dd30e939"

                
            }

            
        }
         stage('Build and Deploy') {
            steps {

                sh "mvn clean install -DskipTests"

                
            }

            
        }

        stage('Push IMAGE TO DOCKER HUB') {
            steps {

                sh "docker login"
                sh "docker build -t hamatrabelsi/timesheet:${currentBuild.number}" 
                sh "docker push hamatrabelsi/timesheet:${currentBuild.number}"

                
            }

            
        }
    }
}
