pipeline {
    agent any
    
    stages {
        stage('Git Clone') {
            steps {
                // Utilisation de Git pour cloner le dépôt GitHub
                git credentialsId: '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', url: 'https://github.com/moufadal-Goulamhoussen974/TPDevOps'
            }
        }
        
        // Ajoute d'autres étapes pour construire et déployer ton projet
        // par exemple :
        // stage('Build') {
        //     steps {
        //         // Commandes pour construire ton projet ici
        //     }
        // }
        // stage('Deploy') {
        //     steps {
        //         // Commandes pour déployer ton projet ici
        //     }
        // }
    }
}
