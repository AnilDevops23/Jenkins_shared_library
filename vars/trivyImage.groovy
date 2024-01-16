def call() {
    sh 'trivy image anildevops23/youtube:latest > trivyimage.txt'
}
