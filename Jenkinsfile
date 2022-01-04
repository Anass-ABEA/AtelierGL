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
				sh 'docker build -t xcoderxcoder/petclinic_jf:latest .'
			}
    }
    stage('Deploy Image') {
      steps {
          sh 'docker push xcoderxcoder/petclinic_jf:latest'
      }
    }
  }
}
