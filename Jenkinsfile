pipeline {
    agent any

    stages {
        stage('Build Java') {
            steps {
                echo "Compiling Java Program"
                sh 'javac src/Student.java'
            }
        }

        stage('Generate HTML') {
            steps {
                echo "Running Java Program"
                sh 'java -cp src Student'
            }
        }

        stage('Archive HTML Output') {
            steps {
                archiveArtifacts artifacts: 'web/index.html', onlyIfSuccessful: true
            }
        }
    }
}
