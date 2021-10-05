
pipeline {
    agent { any { image 'maven:3.3.3' } }
    stages {
        stage('build') {
            steps {
                sh 'mvn clean package'
                sh 'mvn clean install'
            }
        }
           
    }
}
