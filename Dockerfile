FROM openjdk:8
EXPOSE 8080
ARG VERSION
ENV APP_VERSION=${VERSION}
ADD helloworld-${VERSION}.jar helloworld-${VERSION}.jar
ENTRYPOINT ["/bin/bash","-c", "java -jar helloworld-${APP_VERSION}.jar"]
