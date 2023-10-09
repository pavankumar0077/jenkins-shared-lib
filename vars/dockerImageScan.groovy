def call(credentialsId, String dockerhub, String ImageName, String ImageTag){
    withDockerRegistry(credentialsId: credentialsId)

    sh """
    trivy image ${DockerRepo}/${ImageName:${ImageTag}} > scan.txt
    cat scan.txt
    """
}