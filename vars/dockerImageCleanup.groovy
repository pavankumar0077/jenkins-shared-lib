def call(String dockerhub, String ImageName, String ImageTag){

    sh """
    docker rmi ${DockerRepo}/${ImageName}:${ImageTag}
    """
}