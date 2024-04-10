import newApp
pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Building the project'
                // Add build steps here (e.g., Maven, Gradle)
            }
        }
        stage('Test') {
            steps {
                echo 'Running tests'
                newApp = new newApp()
                newApp.call()
                // Add test execution steps here
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying the project'
                // Add deployment steps here (e.g., Docker, Kubernetes)
            }
        }
    }
    post {
        always {
            echo 'Cleaning up'
            // Add cleanup steps here
        }
        success {
            echo 'Project deployment successful'
        }
        failure {
            echo 'Project deployment failed'
        }
    }
}
