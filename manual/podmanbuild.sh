#!/bin/zsh

podman run -i -v $(pwd):/documents/ docker.io/asciidoctor/docker-asciidoctor ash ./manual/buildmanual