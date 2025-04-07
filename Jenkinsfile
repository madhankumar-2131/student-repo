pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building project...'
            }
        }
        stage('Test') {
            steps {
                echo 'Running tests...'
            }
        }
    }

    post {
        success {
            emailext (
                subject: "${env.JOB_NAME} - Build #${env.BUILD_NUMBER} - SUCCESS ✅",
                body: "Good job!\nBuild passed: ${env.BUILD_URL}",
                recipientProviders: [[$class: 'DevelopersRecipientProvider']],
                to: 'madhan19072004@gmail.com'
            )
        }
        failure {
            emailext (
                subject: "${env.JOB_NAME} - Build #${env.BUILD_NUMBER} - FAILED ❌",
                body: "Oops! Something went wrong.\nCheck details: ${env.BUILD_URL}",
                recipientProviders: [[$class: 'DevelopersRecipientProvider']],
                to: 'madhan19072004@gmail.com'
            )
        }
    }
}
