@echo off
SET DEVELOPMENT_HOME= E:\SalesforceCigniti\WebAutomation
cd %DEVELOPMENT_HOME%
call  mvn clean install
call  mvn exec:java
PAUSE
