@echo off
mvn -f .\pom.xml package
java -cp .\target\idbs_mars_rover-1.0-SNAPSHOT.jar com.codemanship.marsrover.Program