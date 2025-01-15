pipeline{
    agent any
    stages{
        stage("Clean Up"){
            steps{
                deleteDir()

            }

        }
        stage("clone Repo"){
            steps{
                sh "git clone https://github.com/tamojit02/Selenium_Samrt_UI.git"
            }
        }

        stage("Build"){
            steps{
                dir("Selenium_Samrt_UI"){
                    sh "mvn clean install"
                }
            }
        }

        stage("Test"){
                    steps{
                        dir("Selenium_Samrt_UI"){
                            sh "mvn test"
                        }
                    }
                 }

    }

}