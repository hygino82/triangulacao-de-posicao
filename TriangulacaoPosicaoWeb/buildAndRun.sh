#!/bin/sh
mvn clean package && docker build -t br.dev.hygino/TriangulacaoPosicao .
docker rm -f TriangulacaoPosicao || true && docker run -d -p 9080:9080 -p 9443:9443 --name TriangulacaoPosicao br.dev.hygino/TriangulacaoPosicao