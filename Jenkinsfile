pipeline {
    agent any
    stages {
        stage('Clean'){
            steps{
                sh '''
                echo "[*] Cleaning project..."
                mvn clean
                '''
            }
        }
        stage('Test'){
            steps{
                sh '''
                echo "";
                echo "[*] Starting tests..."
                mvn test
                '''
            }
        }
        stage('Package'){
            steps{
                sh '''
                echo "";
                echo [*] Packaging Project...;
                mvn package
                echo "";
                echo [*] Pipleine Finished!;
                '''
            }
        }
    }
}
