pipeline{
    agent any
    stages{
        stage("Build"){
            steps{
                echo "Building ..."
            }
            post{
                success{
                    mail to : "sssandhu.singh387@gmail.com",
                    subject: "Build status EMail",
                    body: "Build was successful"
                }
            }
        }
        stage("Test"){
            steps{
                echo "Testing..."
            }
        }
        stages("Deploy"){
            steps{
                echo"Deploying..."
            }
        }
    }
}
