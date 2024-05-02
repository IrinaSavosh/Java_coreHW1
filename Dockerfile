FROM openjdk:latest

WORKDIR /usr/src/app

COPY ./src/main/java .
RUN javac -sourcepath . -d out ./HomeWork1/App/App.java
EXPOSE 8001
WORKDIR /usr/src/app/out
CMD java -classpath . HomeWork1.App.App