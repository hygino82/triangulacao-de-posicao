@echo off
call mvn clean package
call docker build -t br.dev.hygino/TriangulacaoPosicao .
call docker rm -f TriangulacaoPosicao
call docker run -d -p 9080:9080 -p 9443:9443 --name TriangulacaoPosicao br.dev.hygino/TriangulacaoPosicao