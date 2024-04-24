pipeline {
    agent any
    parameters {
        choice(name: 'OS', choices: ['linux', 'darwin', 'windows', 'all'], description: 'Pick OS')
        choice(name: 'ARCH', choices: ['amd64', 'arm64', 'x86-64'], description: 'Pick architecture')
    }
    stages {
        stage('Choose build param') {
            steps {
                echo "Build for platform ${params.OS}"
                echo "Build for arch: ${params.ARCH}"
            }
        }
    }
}
