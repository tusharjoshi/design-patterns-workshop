# Design Patterns Workshop Manual

The concepts discussed in workshop as well as example source code details.

## How To Generate the Manual

You can generate the e-book files manually with Asciidoctor.
If you run the following you will get HTML, Epub and PDF output files:

```bash
bundle install
bundle exec rake book:build
```

## Apple M1 Mac updates

Nokogiri gen needs specific settings for installation on Apple M1 Macs [as mentioned here](https://www.jvt.me/posts/2022/05/01/nokogiri-m1-mac/)

```bash
bundle config force_ruby_platform true
bundle install
bundle exec rake book:build
```

Output shall be

```txt
Converting to HTML...
 -- HTML output at ./build/book-template.html
Converting to EPub...
 -- Epub output at ./build/book-template.epub
Converting to PDF... (this one takes a while)
 -- PDF output at ./build/book-template.pdf
```

## Building with podman container

### Pull the image for use

```bash
podman pull --platform linux/arm64 docker.io/uwebarthel/docker-asciidoctor # Apple M1 arm64
podman pull docker.io/asciidoctor/docker-asciidoctor
```

### Start the container

```bash
podman run -it -v $(pwd):/documents/ docker.io/uwebarthel/docker-asciidoctor # Apple M1 arm64
podman run -it -v $(pwd):/documents/ docker.io/asciidoctor/docker-asciidoctor
```

### Use the following commands to generate books in the container

```bash
asciidoctor-pdf -r asciidoctor-diagram -a index -D ./build book/design-patterns-workshop.adoc 
asciidoctor-pdf -r asciidoctor-diagram -a index -D ./build book/design-patterns-workshop.adoc 
asciidoctor -r asciidoctor-diagram -D ./build -a data-uri book/design-patterns-workshop.adoc 
```
