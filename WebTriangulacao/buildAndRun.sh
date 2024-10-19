#!/bin/sh
mvn clean package && docker build -t br.dev.hygino/WebTriangulacao .
docker rm -f WebTriangulacao || true && docker run -d -p 9080:9080 -p 9443:9443 --name WebTriangulacao br.dev.hygino/WebTriangulacao