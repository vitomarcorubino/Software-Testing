# 🔍 Testing homework
In this repository you can find two modules with testing classes of Java methods using three different testing methodologies: specification-based testing, Structural testing and property-based testing.

## 🔬 Specification-based testing
It is a testing methodology which examines whether the required inputs yield the expected results.
Specification-based testing, therefore, does not focus on the implementation and for this reason is also called black-box testing.
Using 7 steps approach of Specification-based methodology we tested `toCamelCase()` method, which format an input string according to camelCase naming convention.

## 🛡️ Structural testing
It is a white-box testing approach which tests the structure of the source code.
A **code coverage** report has been generated using [JaCoCo](https://www.eclemma.org/jacoco/) in order to identify code segments not covered by the test suite. The report indicated that the test suite covers 100% of the lines and branches of code to be tested.

### Run code coverage
To generate the code coverage report, run the following command using CLI within the project folder where the pom.xml file is located
```
mvn clean test
```
The report will be generated inside the folder at the path: [`/target/site/jacoco/`](target/site/jacoco/)

In addition, **Mutation Testing** has been performed using [PIT Mutation Testing](https://pitest.org/) tool, which purposefully insert bugs in the existing code to verify if the test suite is robust enough to detect them. The report produced by PIT indicates that the test suite killed all the 22 generated mutations.

### Run PIT Mutation Testing
To generate Mutation Testing report, run the following command using CLI within the project folder where the pom.xml file is located
```
mvn test-compile org.pitest:pitest-maven:mutationCoverage
```
The report will be generated inside the folder at the path: [`/target/pit-reports/`](target/pit-reports/)

## 📊 Property-based testing
It is a testing methodology which express the property we want to test and let the test framework choose several examples.
Using [jqwik](https://jqwik.net/) test engine we tested `findPrimeIndex()` method, which returns the index of the first (or last) occurrence of a prime number within a list of integers.
In relation to this type of test, statistics on generated inputs can be found in the [documentation](https://drive.google.com/file/d/1jiPd1M9VZr7YKUYfh1UiloI-DSH2-JkQ/view?usp=sharing).

## 🗂️ Repository Structure
### Source codes
* [`toCamelCase()`](src/main/java/homework1/CaseUtils.java) source code
* [`findPrimeIndex()`](src/main/java/homework2/PrimeIndex.java) source code
### Testing codes
* [`toCamelCase()`](src/test/java/homework1) testing code
* [`findPrimeIndex()`](src/test/java/homework2/PrimeIndexTest.java) testing code
### Reports
* [`JaCoCo`](target/site/jacoco/homework1/index.html) first homework coverage report
* [`PITest`](target/pit-reports/index.html) first homework mutation testing report

## 📚 Documentation
A full italian documentation can be found here: <br>

[![Google Drive](https://img.shields.io/badge/Google%20Drive-4285F4?style=for-the-badge&logo=googledrive&logoColor=white)](https://drive.google.com/file/d/18fLF54KV-DJmYSXrm7AEL91NvANbEqWO/view?usp=drivesdk) 

The documentation contains details about the selected tests and charts generated from the data collected during property-based testing.

## 🗒️Sheets
Google Sheets have been used to organize data:
* [Test cases planning and execution](https://docs.google.com/spreadsheets/d/1wr2W6ZA9yoIJNIwFlokRFOhL3d5EDhoPpnK5i1n1_rk/edit?usp=drive_link) <br>
Includes test cases for specification-based testing for planning and execution
* [Statistics data](https://docs.google.com/spreadsheets/d/1sUV3b7r_KZMjV7OaEgQO0Q5MveolsZyusIBerdMK5ks/edit?usp=drive_link) <br>
Includes data generated through Property-based testing and then visualized with statistics

## 🌐 Collaborators
* **Rubino Vito Marco** <br> Matricola: 755561 <br> Email: v.rubino16@studenti.uniba.it  <br> <br>
[![Gmail](https://img.shields.io/badge/Gmail-ff0000?logo=gmail&logoColor=white)](mailto:v.rubino16@studenti.uniba.it) [![Github](https://img.shields.io/badge/GitHub-100000?logo=github&logoColor=white)](https://github.com/vitomarcorubino) [![LinkedIn](https://img.shields.io/badge/LinkedIn-%230077B5.svg?logo=linkedin&logoColor=white)](https://www.linkedin.com/in/vitomarcorubino/) [![Stack Overflow](https://img.shields.io/badge/-Stackoverflow-FE7A16?logo=stack-overflow&logoColor=white)](https://stackoverflow.com/users/11417498/marco-rubino) <br>
* **Signorile Simone** <br> Matricola: 754729 <br> Email: s.signorile19@studenti.uniba.it <br> <br>
[![Gmail](https://img.shields.io/badge/Gmail-ff0000?logo=gmail&logoColor=white)](mailto:s.signorile19@studenti.uniba.it) [![Github](https://img.shields.io/badge/GitHub-100000?logo=github&logoColor=white)](https://github.com/simonesignorile)
