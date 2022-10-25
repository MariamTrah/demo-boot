pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "M1"
    }

    stages {
        stage('Checkout') {
            steps {
                // Get some code from a GitHub repository
                git branch : 'main',url:'https://github.com/MariamTrah/demo-boot.git'
            }

        }
        stage('Cleaning workspace '){
            steps{
                echo "begining of cleaning workspace : "
                sh 'mvn clean'
                script{
                    try{
                        
                    }catch(Exception e){
                        
                    }
                }
            }
        }
        stage('Compile') {
            steps {
                // Get some code from a GitHub repository
                sh 'mvn compile'
                sh 'mvn package'
            }
            post{
                success{
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
        stage('conteneurisation '){
            steps{
                echo "deplo"
                sh 'docker run -d --name demo-boot  -p 8180:8080 demo-boot'
            }
        }
        
    
}
}
