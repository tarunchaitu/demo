pipeline {
  agent { label 'master' }
  stages {
    stage('Source') { // Get code
      steps {
          step([$class: 'WsCleanup'])
          checkout scm
      }
    }
    stage('Compile') { // Compile and do unit testing
      steps {
        // run Gradle to execute compile and unit testing
        sh '''javac GenerateRandomNumber.java
              java  GenerateRandomNumber'''
      }
    }
  }
}
