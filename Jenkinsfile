
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
                   
                    sh 'pwd'
                    sh 'ls -ltr'
                    sh 'cd target'
                    sh 'echo $HOME'
                    sh 'cd $HOME/workspace/springbootpipeline_test/target | ls -ltr'
                    //sh 'java -jar *.jar'
                
                }
            }   
                stage ('test'){
                
                    steps{
                    
                    sh 'curl http://localhost:8080'
                    
                    
                    }
                
      
                
                }
    }
}
