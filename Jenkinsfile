pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building your student platform...'
            }
        }

        stage('Test') {
            steps {
                echo 'Running tests...'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying to Render...'
            }
        }
    }

    post {
        success {
            emailext (
                subject: "✅ ${env.JOB_NAME} #${env.BUILD_NUMBER} succeeded",
                body: "Great job! The build succeeded.\n\nCheck it here: ${env.BUILD_URL}",
                to: 'madhan19072004@gmail.com'
            )
        }

        failure {
            emailext (
                subject: "❌ ${env.JOB_NAME} #${env.BUILD_NUMBER} failed",
                body: "Oops, the build failed.\n\nCheck it here: ${env.BUILD_URL}",
                to: 'madhan19072004@gmail.com'
            )
        }
    }
}
