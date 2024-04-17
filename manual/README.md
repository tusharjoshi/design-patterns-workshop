# Design Patterns Workshop Manual

The concepts discussed in workshop as well as example source code details.

## Building with podman container

### Ensure podman machine is having access to user home

```bash
podman machine init --cpus=4 --disk-size=60 --memory=6096 -v $HOME:$HOME
```

### Pull the image for use

```bash

podman pull --platform linux/arm64 docker.io/asciidoctor/docker-asciidoctor # Apple M1 arm64
podman pull docker.io/asciidoctor/docker-asciidoctor
```

### Start the container

Ensure you start the container from the root directory of this project, that will mean `manual` folder is available in the listing

```bash
podman run -it -v $(pwd):/documents/ docker.io/asciidoctor/docker-asciidoctor
```

### Use the following commands to generate books in the container

```bash
cd manual
asciidoctor-pdf -r asciidoctor-diagram -a index -D ./build book/design-patterns-workshop.adoc 
asciidoctor-epub3 -r asciidoctor-diagram -a index -D ./build book/design-patterns-workshop.adoc 
asciidoctor -r asciidoctor-diagram -D ./build -a data-uri book/design-patterns-workshop.adoc 
```
