FROM maven:3.6.3-openjdk-8 as builder
WORKDIR /project
ADD . ./
USER root
RUN mkdir -p /root/.m2 \
    && mkdir /root/.m2/repository

RUN mvn -q clean package -Dmaven.test.skip=true

FROM adoptopenjdk/openjdk8:alpine-jre
COPY --from=builder project/target/app.jar ./app.jar

CMD ["java","-Dspring.data.mongodb.uri=mongodb://mongo_db:27017/volumes",  "-jar", "app.jar"]