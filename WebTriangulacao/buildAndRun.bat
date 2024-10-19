@echo off
call mvn clean package
call docker build -t br.dev.hygino/WebTriangulacao .
call docker rm -f WebTriangulacao
call docker run -d -p 9080:9080 -p 9443:9443 --name WebTriangulacao br.dev.hygino/WebTriangulacao