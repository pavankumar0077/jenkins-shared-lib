def call(String dockerhub, String ImageName, String ImageTag){

    sh """
    trivy image ${DockerRepo}/${ImageName}:${ImageTag} > scan.txt
    cat scan.txt
    """
}