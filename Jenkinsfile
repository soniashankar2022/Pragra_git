pipeline {
  agent any
  stages {
    stage('hi') {
      steps {
        echo 'hbhjk'
        archiveArtifacts(artifacts: 'target/*.jar', fingerprint: true)
      }
    }

    stage('new') {
      steps {
        echo 'hello'
        sh '''pipeline {
    agent any
    parameters {
        choice(name: \'UBUNTU\', choices: [\'18.10\', \'19.04\'], description: \'Choose Ubuntu Release\')
        string(name: \'PERSON\', defaultValue: \'Eric\', description: \'Name\')
    }
    stages {
        stage(\'Build\') {
            steps {
                script {
                    // Asking for input to proceed
                    def userInput = input(
                        id: \'proceedInput\',
                        message: "Proceed?",
                        parameters: [choice(name: \'PROCEED\', choices: [\'yes\', \'no\'], description: \'Proceed?\')],
                        submitter: \'admin\'
                    )
                    // Checking the user input
                    if (userInput == \'yes\') {
                        echo "Building on Ubuntu ${UBUNTU}, Hello ${PERSON}!"
                        sh \'chmod +x app.sh\'
                        sh \'./app.sh\'
                    } else {
                        error("Build aborted by the user.")
                    }
                }
            }
        }
    }
}
'''
        }
      }

    }
  }