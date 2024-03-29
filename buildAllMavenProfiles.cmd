cd %~dp0
del java8-okhttp-gson\pom.xml
del java8-okhttp-gson\build.gradle
rmdir java8-okhttp-gson\src\main  /s /q
del java8-okhttp-gson-versioned\pom.xml
del java8-okhttp-gson-versioned\build.gradle
rmdir java8-okhttp-gson-versioned\src\main  /s /q
del java8-jersey2\pom.xml
del java8-jersey2\build.gradle
rmdir java8-jersey2\src\main  /s /q
del java8-retrofit2\pom.xml
del java8-retrofit2\build.gradle
rmdir java8-retrofit2\src\main  /s /q
rmdir csharp-net35\src\Sphereon.SDK.Extraction.Keyword  /s /q
rmdir csharp-net45\src\Sphereon.SDK.Extraction.Keyword  /s /q

call mvn -Pjava8-jersey2 clean install
start mvn -Pjava8-okhttp-gson clean install
start mvn -Pjava8-okhttp-gson_versioned clean install
start mvn -Pjava8-retrofit2 clean install
start mvn -Pcsharp-net45 clean install
start mvn -Pcsharp-net35 clean install
start mvn -Pjavascript clean install
start mvn -Ptypescript-angular2 clean install
start mvn -Phtml-docs clean install
