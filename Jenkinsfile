pipeline{
    agent any
      stages {
        stage('SCM Checkout - Clone github'){
			steps{
          	git 'https://github.com/patilume/Sample.git'
				}
			}
			
		stage('Initialize - Clean work dirs'){
			steps{
				withAnt(installation: 'ant', jdk: 'jdk') {
				sh 'ant clean'
				}
			}
		}
		
		stage('Initialize - Initialize work dirs'){
			steps{
				withAnt(installation: 'ant', jdk: 'jdk') {
				sh 'ant init'
				}
			}
		}
		
		stage('Copy the main resources in the classes build folder'){
			steps{
				withAnt(installation: 'ant', jdk: 'jdk') {
				sh 'ant resources'
				}
			}
		}
	}
}
