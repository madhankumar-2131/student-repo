pipeline {
    agent any

    environment {
        PROJECT_NAME = 'student-project-platform'
    }

    stages {
        stage('Build Java Code') {
            steps {
                bat 'mkdir build'
                bat 'javac -d build src\\Student.java'
            }
        }

        stage('Copy HTML Files') {
            steps {
                bat 'xcopy html build\\html /E /I /Y'
            }
        }

        stage('Deploy to Render') {
            steps {
                echo 'Deploying to Render...'
                // You can add your deployment script here
            }
        }
    }

    post {
        success {
            mail to: 'madhan19072004@gmail.com',
                 subject: "${env.PROJECT_NAME} - Build #${env.BUILD_NUMBER} - SUCCESS 🎉",
                 body: "Good news! Build #${env.BUILD_NUMBER} of ${env.PROJECT_NAME} succeeded!"
        }

        failure {
            mail to: 'madhan19072004@gmail.com',
                 subject: "${env.PROJECT_NAME} - Build #${env.BUILD_NUMBER} - FAILED ❌",
                 body: "Oops! Build #${env.BUILD_NUMBER} of ${env.PROJECT_NAME} failed. Please check the Jenkins logs."
        }
    }
}
