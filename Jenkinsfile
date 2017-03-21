#!groovy

pipeline {
    agent any
    stage('Cleanup') {
        sh "sbt clean compile"
      }

    stage('Test') {
        sh "sbt test"
    }

    stage('Publish-Local') {
        sh "sbt publish-local"
    }

    post {
        always {
            echo 'Execution completed.'
        }
    }

}