pipeline {
    agent any
    tools {
        maven "mymaven"
    }
    stages {
        stage("checkout code") {
            steps {
                git url: 'https://github.com/surendra661/FLIGHT-BOKKING-APP.git', branch: 'main'
            }
        }
        stage("BUILD") {
            steps {
                sh "mvn clean install"
            }
        }
        stage("TESTING") {
            steps {
                echo "testing with maven"
            }
        }
    }
}