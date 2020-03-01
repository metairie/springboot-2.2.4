



# springboot-2.2.4

## Rest service

## React



## Container CentOS8

### buildah

is the tool to create image, it's connected to docker hub to retrieve images

> build the genuine Dockerfile
>
> buildah build-using-dockerfile Dockerfile

### podman

Podman is iso docker command

list images

> podman image list
>   REPOSITORY                  TAG      IMAGE ID       CREATED         SIZE
>   <none>                      <none>   6d86c63e5447   7 seconds ago   517 MB
>   docker.io/library/openjdk   latest   6adc576f6a58   2 weeks ago     498 MB

tag an image

>  podman tag 6d86c63e5447 springboot-2.2.4:latest

run an image

> podman run -it -p8080:8080 springboot-2.2.4:latest