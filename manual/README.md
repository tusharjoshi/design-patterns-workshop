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

### Build manual using podman container

```bash
./manual/podmanbuild.sh
```
