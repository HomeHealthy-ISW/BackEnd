pipeline {
 agent any
 tools {
 maven 'MAVEN_3_6_3'
 jdk 'JDK_1_11'
 }
 stages {
 stage ('Compile Stage') {
 steps {
 withMaven(maven : 'MAVEN_3_6_3') {
 bat 'mvn clean compile'
 }
 }
 }
 stage ('Testing Stage') {
 steps {
 withMaven(maven : 'MAVEN_3_6_3') {
 bat 'mvn test'
 }
 }
 }
 stage('sonarQube Analysis'){
 steps{
 withSonarQubeEnv('sonarQube'){
 bat 'mvn clean package verify sonar:sonar -Dsonar.projectKey=HomeHealthy'
 }
 }
 }
 stage ('package Stage') {
 steps {
 withMaven(maven : 'MAVEN_3_6_3') {
 bat 'mvn package'
 }
 }
 }



 }
}