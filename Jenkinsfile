pipeline {
  agent { label 'master' }
  stages {
    stage('Source') { // Get code
      steps {
        // get code from our Git repository
        git 'https://github.com/tarunchaitu/demo.git'
      }
    }
    stage('Compile') { // Compile and do unit testing
      steps {
        // run Gradle to execute compile and unit testing
        sh '''javac GenerateRandomNumber.java
              java  GenerateRandomNumber'''
      }
    }
    stage('Deploy') {
      steps {
        sh ''' echo deploying code '''
      }
    }
  }
}
