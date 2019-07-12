pipeline{
    agent any
      stages {
        stage('SCM Checkout - Clone github'){
			steps{
          	git 'https://github.com/patilume/Ant-WebProject.git'
				}
			}
			
		stage('Initialize - Clean work dirs'){
			steps{
				withAnt(installation: 'ant', jdk: 'jdk') {
				sh 'ant init'
				}
			}
		}
		
	}
}
