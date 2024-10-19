@echo off
call mvn clean package
call docker build -t br.dev.hygino/LocalTriangulacao .
call docker rm -f LocalTriangulacao
call docker run -d -p 9080:9080 -p 9443:9443 --name LocalTriangulacao br.dev.hygino/LocalTriangulacao