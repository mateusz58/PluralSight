Project name
Project description

Code style
js-standard-style

Tech/framework used
Built with



Project prepare
1) Mark directory Java as root source
2) Mark directory test as test
3) Build project

Maven
allows for clear framework and libraries management which is important especially while working in teams
Installation
Using JDK 1.11 is recomended. Project was test on this JDK version.
1) Open project with your IDE eg. IntellJI, Eclipse
2) Set checkstyle to google-checkstyle
3) Run Maven-compile or use command 'xjc -d src -p com.example.xjc example.xsd' in terminal
4) Run maven clean install 
5) You can run Maven-verify to check, if project builds correctly.


