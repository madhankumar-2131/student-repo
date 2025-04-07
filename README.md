# 🎓 Student Project Submission Platform

A simple web application where students can submit their project titles and view/edit them in a dynamic table.

## 🌐 Tech Stack

- **Frontend**: HTML, CSS, JavaScript
- **Backend**: Java (can be extended for server-side logic)
- **CI/CD**:
  - ✅ **Jenkins** for backend (Java) build and test
  - ✅ **GitHub Actions** for frontend deployment
- **Deployment**: [Click here..](https://madhankumar-2131.github.io/student-repo/)

---

##📩 Email Notifications
Jenkins sends custom email updates to notify build status:

✅ Success – includes job name, build number, and link.

❌ Failure – immediate alert with build logs.



![madj](https://github.com/user-attachments/assets/1159e23b-6c85-4827-9d0e-7f01ae2dfb38)


###🔁 Jenkins Workflow in My Project
🛠️ Build Stage
Compiles Java code and checks for build issues.

🧪 Test Stage
Currently echoes a message; can be extended for JUnit or other testing tools.

🚀 Deploy Stage
Simulates deployment to GitHub Pages (useful for full-stack expansion).

📧 Email Notification
Uses emailext plugin to notify the developer (me!) after every build.


![madhan](https://github.com/user-attachments/assets/4ea8323d-9aa7-4ce7-b8ae-1d5dda9bcd59)


## 🛠️ Features

- 🌗 Toggle between Light/Dark mode
- 📥 Student name and project submission form
- 📋 Dynamic table to list submissions
- ✏️ Edit / 🗑️ Delete functionality
- 💾 Data persistence via `localStorage`
- 📱 Fully responsive design

---
![Screenshot (131)](https://github.com/user-attachments/assets/7a952b77-1588-418b-890f-5df51a8d021b)

## 🚀 DevOps CI/CD Workflow

### 🔧 Jenkins Pipeline (Backend Java Build/Test)



 ### 📂 Folder Structure

 



![vs](https://github.com/user-attachments/assets/95df2c9a-6559-483b-80f0-1b3fb655da45)



###💡 Sample Jenkins Pipeline

```groovy
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
                echo 'Deploying to GitHub Pages --> https://madhankumar-2131.github.io/student-repo/'
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

