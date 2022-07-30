pipeline {
    agent any
    tools{
        maven 'MAVEN_HOME'
    }
    stages{
        stage('Build Maven')
        {
            steps {
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], gitTool: '', userRemoteConfigs: [[url: 'https://github.com/Pooja123-user/EmployeeManagemetSystem/']]])
                bat 'mvn clean install'
                
                
            }
        }
        stage('Build docker image'){
            steps{
                script{
                    bat 'docker build -t pujadube12345/app .'
                }
            }
        }
        stage('Push image to Hub'){
            steps{
                script{withCredentials([string(credentialsId: 'dockerhubpwd', variable: 'dockerhubpwd')]) {
                    bat 'docker login -u pujadube12345 -p${dockerhubpwd}'
    // some block
}
                    bat 'docker push pujadube12345/app'
                    
                    
                }
            }
        }
    }
}    
