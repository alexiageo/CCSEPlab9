FROM gradle:5.4.1-jdk8-alpine as build
WORKDIR /home/gradle
ENV GRADLE_USER_HOME /home/gradle

# Speed up by caching deps
COPY --chown=gradle:gradle build.gradle /home/gradle
RUN gradle --no-daemon --info getDeps -g/home/gradle

COPY --chown=gradle:gradle . /home/gradle
ARG GRADLETASK=build
RUN gradle --info $GRADLETASK -g/home/gradle

FROM openjdk:8-jre-slim
COPY --from=build /home/gradle/build/libs/app.jar /app/
WORKDIR /app
CMD java -jar app.jar
