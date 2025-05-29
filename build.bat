@echo off
if not exist "idbs_mars_rover" (
  if not exist ".git" (
	git clone https://github.com/bgrubaq/idbs_mars_rover
  )
)
cd idbs_mars_rover
git pull
call mvn -f .\pom.xml package
java -cp .\target\idbs_mars_rover-1.0-SNAPSHOT.jar com.codemanship.marsrover.Program
pause