#estagio de compilacao
FROM ubuntu:lastest AS build

#instale o Open JDK 17
RUN apt-get update
RUN apt-get install openjdk-17-jdk -y
RUN apt-get install maven -y

#Copie o codigo fonte para o container
COPY . .

#Copiple o projeto com maven
RUN mvc clean install

#Estagio de execao
FROM openjdk:17-jdk-slim

#exponha a porta 8080
EXPOSE 8080

#Copie o arquivo jar da etapa de conpilacao para o container de execucao
COPY --from=build /target/loja.jar app.jar

#Defina o comando de inicializacao da aplicacao
ENTRYPOINT ["java", "-jar", "app.jar"]