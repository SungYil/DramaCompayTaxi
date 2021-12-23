FROM adoptopenjdk:openjdk11 AS builder

#gradle 빌드를 하기위한 파일 복사 및 웹어플리케이션 소스 복사
COPY gradlew .
COPY gradle gradle
COPY build.gradle .
COPY settings.gradle .
COPY src src

#gradlew에 권한을 부여한 뒤 gradlew를 사용해 실행가능한 jar 파일생성.
RUN chmod +x ./gradlew
RUN ./gradlew bootJar

FROM adoptopenjdk:openjdk11

#builder 이미지에서 build/libs/*.jar 파일을 해당 파일명으로 복사
COPY --from=builder build/libs/*.jar DramaCompay.jar

EXPOSE 8080

#jar 파일 실행
ENTRYPOINT ["java","-jar","/app.jar"]