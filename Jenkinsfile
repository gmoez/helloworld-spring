node {

    stage('chekout') {
        /* Cloning the Repository to our Workspace */

        checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/gmoez/helloworld-spring.git']]])
    }
    
    stage('Build') {
        build 'buildjob' /* youn need to build a maven project job that pull the source code from the Github repos and build the application using maven */
    }

    stage('Build Docker image') {
        /* This builds the actual image */
        echo "copying artifact generated"
        sh ("cp ../buildjob/target/helloworld-1.0-SNAPSHOT.jar .")
        echo "building image"
        sh ("docker build -t springboot:latest .")
    }
    
    stage('Deploy application') {
        /* qsdThis builds the actualsq image */
        echo "Running conntainer"
        sh ("docker stop spring")
        sh ("docker rm spring")
        sh ("docker run -dt --name spring -p 8081:8080 springboot:latest")
    }
    }