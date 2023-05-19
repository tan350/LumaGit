pipeline {
    agent any

    stages {
        stage('Get source code') {
            steps {
                git 'https://github.com/tan350/LumaGit.git'
                echo 'Get source code of Application'
            }
        }
        
        stage('Build code') {
            steps {
                bat script: 'mvn compile'
                echo 'Build code of Application'
            }
        }
        stage('Run Tests') {
            steps {
                bat script: 'mvn test -Dbrowser-localfirefox'
                echo 'Test Application'
            }
        }
        
        stage('Deploy') {
            steps {
                echo 'Deploy application'
            }
        }
        
    }
    post{
        always{
            emailext body: 'Summary', subject: 'Pipeline Status', to: 'tasharma@Bebotechnologies.com'
        }
    }
}
