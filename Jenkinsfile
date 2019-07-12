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
		
		stage('Run JUnit test'){
			steps{
				withAnt(installation: 'ant', jdk: 'jdk') {
				sh 'ant test'
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
		
		stage('Deploy - Deploy to WildFly'){
			steps{
				sshagent(['tomcat-deploy']) {
				sh 'scp -o StrictHostKeyChecking=no webapp/target/*.war ec2-user@13.232.243.118:/opt/wildfly/standalone/deployments/'
				}
			}
		}
		
	}
}
