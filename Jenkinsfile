
pipeline {
    agent { any { image 'maven:3.3.3' } }
    stages {
        stage('build') {
            steps {
                sh 'mvn --version'
                sh 'mvn clean install'
            }
        }
            stage('run'){
                steps{
                   
                    sh 'sudo su -s /bin/bash jenkins'
                    sh 'cd /var/lib/jenkins/workspace/springbootpipeline_test/target'
                    sh 'java -jar *.jar'
                
                }
            }   
                stage ('test'){
                
                    steps{
                    
                    sh 'curl http://localhost:8082'
                    
                    
                    }
                
      
                
                }
    }
}
