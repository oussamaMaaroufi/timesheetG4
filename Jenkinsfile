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

			/*stage('Building Image'){
				steps{
					script{
						dockerImage = docker.build registry + ":$BUILD_NUMBER"
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
			 }*/
			 

			

		
stage('Push IMAGE TO DOCKER HUB') {
            steps {

                sh "docker login"
                sh "docker build -t oumay55/repodocker:${currentBuild.number}" 
                sh "docker push oumay55/repodocker:${currentBuild.number}"

                
            }

            
        }
			
	}
}