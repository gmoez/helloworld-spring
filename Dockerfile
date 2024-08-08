FROM openjdk:8
EXPOSE 8080
ARG VERSION
ADD helloworld-${VERSION}.jar helloworld-${VERSION}.jar
ENTRYPOINT ["java","-jar","helloworld-${VERSION}.jar"]
