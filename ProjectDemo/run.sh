#!/bin/bash
set -e
#javac -d ./webapp/WEB-INF/classes/ src/main/java/com/controller/*.java -classpath /usr/share/java/servlet-api-3.1.jar

#mv DemoServ.class /home/vikas/Project/src/main/webapp/WEB-INF/classes/
#mv SqServlet.class /home/vikas/Project/src/main/webapp/WEB-INF/classes/
rm -r /opt/tomcat/apache-tomcat-8.5.53/webapps/ProjectDemo

cp -r /home/vikas/Downloads/ProjectDemo/target/ProjectDemo /opt/tomcat/apache-tomcat-8.5.53/webapps
#cp  /home/vikas/Downloads/SpringMvcPro/webapp/WEB-INF/web.xml /opt/tomcat/apache-tomcat-8.5.53/webapps/SpringMvcPro-1.0-SNAPSHOT/WEB-INF/
#cp  /home/vikas/Downloads/SpringMvcPro/webapp/WEB-INF/dad-frontcontroller-dispatcher-servlet.xml /opt/tomcat/apache-tomcat-8.5.53/webapps/SpringMvcPro-1.0-SNAPSHOT/WEB-INF/


#rm -r /opt/tomcat/apache-tomcat-8.5.53/webapps/webapp
#cp -r /home/vikas/Downloads/demo\ \(2\)/webapp/ /opt/tomcat/apache-tomcat-8.5.53/webapps