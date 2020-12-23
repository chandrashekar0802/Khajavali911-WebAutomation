@echo off
SET DEVELOPMENT_HOME= C:\Walmart\BDDPOC\WebAutomaionV1\WebAutomation
cd %DEVELOPMENT_HOME%
call  mvn clean install
call  mvn exec:java
PAUSE
