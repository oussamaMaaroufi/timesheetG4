pipeline {
	agent any 
	
	environment { 
        registry = "oumay55/repodocker" 
        registryCredential = 'dockerHub'
        dockerImage = '' 
    }
	stages{

			stage('Clean and package'){
				steps{
					sh "mvn clean package"
					
				}				
			}

			stage('Sonar'){
				steps{
                   sh "mvn sonar:sonar"
                }
			} 

			stage('Deploy'){
				steps{
					sh "mvn deploy"
				}				
			}

			stage('Building Image'){
				steps {
 				script {
 					echo 'Building our Docker Image oumay55/repodocker...'
                	sh 'docker build -t oumay55/repodocker.'
 				}
 			}
			 }

			 stage('Deploy Image'){
			 	steps{
			 		script{
			 			docker.withRegistry( '', registryCredential ) 
                         {dockerImage.push()}
			 		}
			 	}
			 }

			

		
 			
 			

			
	}
}