#!/bin/sh
mvn clean package && docker build -t br.dev.hygino/LocalTriangulacao .
docker rm -f LocalTriangulacao || true && docker run -d -p 9080:9080 -p 9443:9443 --name LocalTriangulacao br.dev.hygino/LocalTriangulacao