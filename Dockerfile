FROM adoptopenjdk:11.0.10_9-jre-hotspot

#이미지를 관리하는 사람
LABEL maintainer="dkdkenen2006@gmail.com"

#이 어플이 도커 컨테이너 내부에서 8080포트를 가지고 감.
EXPOSE 8080

COPY DramaCompay-1.0-SNAPSHOT.jar .

#BUILD시 생성되는 jar 파일의 상대경로.
ARG JAR_FILE=DramaCompay-1.0-SNAPSHOT.jar

#JAR_FILE에 이름.
ADD ${JAR_FILE} DramaCompay.jar

#어플리케이션을 실행시키기 위한 명령어
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/DramaCompay.jar"]
