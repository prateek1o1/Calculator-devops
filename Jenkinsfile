pipeline {
    agent any

    stages {
        stage('Git Pull') {
            steps {
                git 'https://github.com/prateek1o1/calculator-devops.git'
            }
        }
         
        stage('Maven Build') {
            steps {
                    sh 'mvn clean install'
            }
        }
        stage('Build Docker Images') {
            steps {
                sh 'docker build -t prateek1o1/calculator:latest .'
            }
        }
          stage('Publish Docker Images') {
            steps {
                withDockerRegistry([ credentialsId: "docker-jenkins", url: "" ]) {
                    sh 'docker push prateek1o1/calculator:latest'
                }
            }
        }
        stage('Clean Docker Images') {
            steps {
                sh 'docker rmi -f prateek1o1/calculator:latest'
            }
        }
        stage('Deploy and Run Image'){
            steps {
                ansiblePlaybook becomeUser: null, colorized: true, disableHostKeyChecking: true, installation: 'Ansible', inventory: 'inventory', playbook: 'playbook.yml', sudoUser: null
            }
        }
    }
     post {
        always {
            sh 'docker logout'
        }
    }
}
