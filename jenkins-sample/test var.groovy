pipeline {
    agent any

    stages {
        stage('My Environment Pipeline') {
            environment {
                var1 = "test_password"
            }
            steps {
                echo 'This is my first environment $var1'
            }
        }
    }
}