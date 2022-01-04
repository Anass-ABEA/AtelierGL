pipeline {
  environment {
    registry = "xcoderxcoder/petclinic_jenkinsfile"
    registryCredential = 'xcoderxcoder'
    dockerImage = ''
  }
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'mvn clean install package'
      }
    }
    stage('Building image') {
      steps {
        script {
          dockerImage = docker.build registry + ":$BUILD_NUMBER"
        }
      }
    }
    stage('Deploy Image') {
      steps {
          sh 'docker push bharathirajatut/nodeapp:latest'
      }
    }
  }
}
