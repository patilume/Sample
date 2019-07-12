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
		
		stage('Initialize - Create work dirs'){
			steps{
				withAnt(installation: 'ant', jdk: 'jdk') {
				sh 'ant init'
				}
			}
		}
		
		stage('Initialize - Copy resources in the build folder'){
			steps{
				withAnt(installation: 'ant', jdk: 'jdk') {
				sh 'ant resources'
				}
			}
		}
		
		stage('Resolve dependencies'){
			steps{
				withAnt(installation: 'ant', jdk: 'jdk') {
				sh 'ant resolve'
				}
			}
		}
		
		stage('Compile'){
			steps{
				withAnt(installation: 'ant', jdk: 'jdk') {
				sh 'ant build'
				}
			}
		}
		
		stage('Archive the application'){
			steps{
				withAnt(installation: 'ant', jdk: 'jdk') {
				sh 'ant war'
				}
			}
		}
		
	}
}
