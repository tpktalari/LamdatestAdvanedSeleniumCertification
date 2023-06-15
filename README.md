# Lamdatest Advanced Selenium Assesment

This project demonstrates how to configure and run TestNG tests in parallel using Maven, Eclipse, and LambdaTest.

[ Note : The file "Selenium Advanced_Assignment Problem Scenario & Instructions_1" given by the lamda test
  and in the instructions to write the test script there is slight deviation.
  As mentioned in the step 8 [Click the ‘LEARN MORE’ link for Testing Whiz. The page should open
  in the same window], 'LEARN MORE' is not available instead other link is available. hence I assume that 
  as 'LEARN MORE' link and gave soft assertion hence test script will always outputs a soft assertion error. ] 

## Prerequisites

- Java Development Kit (JDK) 11 or higher
- Apache Maven
- Eclipse IDE

## Setup

1. Clone the repository:

2. Open the project in Eclipse.

3. Set up your LambdaTest account and obtain the access key and secret key.

4. Configure the testng.xml file with your test configurations, including parallel execution settings 
   and LambdaTest desired capabilities.
   
## Running the Tests

To run the tests on the LambdaTest Cloud Selenium Grid:

1. Open the terminal in your Gitpod workspace.

2. Execute the following commands to set up the environment and run the tests:

tasks:
  - init: mvn install -DskipTests=false
  
It will install the all dependencies during this process the execution will also starts as I have specified
surefire plugin in project configuration file, it will trigger the testng.xml file.

These commands will update the package manager, install OpenJDK 11, set the default Java version, build the project skipping the tests, and then run the tests using the TestNG XML configuration file specified in testng.xml.

3. Once the tests are executed on the LambdaTest Cloud Selenium Grid, I will receive test IDs or           	execution details as output or logs.

4. Recorded the final Test ID(s) and any relevant information from the test execution on LambdaTest.
	