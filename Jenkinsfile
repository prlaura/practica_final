pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh '''
                    echo "Building..."
                    ls -lah
		    javac -cp . Rechteck.java
                '''
            }
        }
	stage('Test') {
            steps {
                sh '''
                    echo "Testing..."
                '''
            }
        }
    }
}


