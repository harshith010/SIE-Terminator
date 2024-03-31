pipeline {
    agent any
    stages {
        stage('init') {
            steps {
                echo "Starting new Project"
                echo "--------------------"
            }
        }
    }
}