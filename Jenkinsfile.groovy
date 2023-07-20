pipeline {
    agent any
    triggers {
        cron('H/5 * * * *') 
    }
    stages {
        stage('Git Clone') {
            steps {
                git branch: 'main',  url: 'https://github.com/moufadal-Goulamhoussen974/TPDevOps.git'
            }
              stage('Run Tests') {
            steps {
                sh 'cat /var/lib/jenkins/workspace/Test/Test.html | grep "Ceci est un paragraphe de texte."' 
            }
        }
    }
}
}
