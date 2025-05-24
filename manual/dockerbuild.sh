#!/bin/zsh

docker run -i --rm -v $(pwd):/documents/ docker.io/asciidoctor/docker-asciidoctor ash ./manual/buildmanual