pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                git 'https://github.com/tan350/LumaGit.git'
                echo 'Build Application'
            }
        }
        
        stage('Test') {
            steps {
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
