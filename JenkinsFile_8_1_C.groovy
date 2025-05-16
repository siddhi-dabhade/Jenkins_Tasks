pipeline {
    agent any

    environment {
        DIRECTORY_PATH = ''
        TESTING_ENVIRONMENT = 'Testing_Env'
        PRODUCTION_ENVIRONMENT = 'Siddhi_Dabhade' 
    }
    
    stages {
        stage('Build') {
            steps {
                script {
                    echo 'Building the application'
                    echo 'Tool: Maven'
                }
            }
        }

        stage('Unit and Integration Tests') {
            steps {
                script {
                    echo 'Running unit and integration tests'
                    echo 'Tool: JUnit'
                }
            }
        }

        stage('Code Analysis') {
            steps {
                script {
                    echo 'Integrate a code analysis tool to analyse the code and ensure it meets industry standards'
                    echo 'Tool: SonarQube'
                }
            }
        }

        stage('Security Scan') {
            steps {
                script {
                    echo 'Perform a security scan on the code using a tool to identify any vulnerabilities'
                    echo 'Tool: Docker Scout'
                }
            }
        }

        stage('Deploy to Staging') {
            steps {
                script {
                    echo 'Deploy the application to a staging server'
                    echo 'Tool: AWS EC2 instance'
                }
            }
        }

        stage('Integration Tests on Staging') {
            steps {
                script {
                    echo 'Run integration tests on the staging environment to ensure the application functions as expected in a production-like environment'
                    echo 'Tool: Testcontainers'
                }
            }
        }

        stage('Deploy to Production') {
            steps {
                script {
                    echo 'Deploy the application to a production server'
                    echo 'Tool: AWS EC2 Instance'
                }
            }
        }

        stage('Commit') {
            steps {
                script {
                    echo 'Commited.'
                }
            }
        }

        stage('Second Commit') {
            steps {
                script {
                    echo 'Second update Commited.'
                }
            }
        }
    }
}
