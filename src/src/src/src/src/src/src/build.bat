@echo off
if not exist bin mkdir bin
javac -d bin src\*.java
echo Build complete!
pause
