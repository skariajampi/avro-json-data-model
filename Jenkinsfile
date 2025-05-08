pipeline{
    agent any
    environment{
    VERSION =   '1.0.1'
    }
    stages{
        stage('Tools'){
            steps{
                sh '''
                git version
                java -version
                mvn -version
                '''
            }
        }
        stage('Build'){
            steps{
                dir('./avro-json-data-model'){
                sh '''
                                                echo "Executing Tests..."
                                                mvn clean test
                                                '''
                }

            }
        }
        stage('Package'){
        steps{
                        dir('./avro-json-data-model') {
                        sh '''
                                        echo "Packaging version ${VERSION}..."
                                        mvn clean package
                                        '''
                              }
                    }
        }
    }
}