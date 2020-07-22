FROM tomcat:9.0

MAINTAINER BALAJIR

COPY war-test.war /usr/local/tomcat/webapps/

WORKDIR /usr/local/tomcat

CMD ["catalina.sh","run"]
