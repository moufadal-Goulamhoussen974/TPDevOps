pipeline {
    agent any
    
    stages {
        stage('Git Clone') {
            steps {
                git branch: 'main', credentialsId: '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', url: 'https://github.com/moufadal-Goulamhoussen974/TPDevOps.git'
            }
        }
    }
}

