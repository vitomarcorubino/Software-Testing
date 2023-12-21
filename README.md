# 🔍 Testing homework
In this repository you can find two modules with testing classes of Java methods using three different testing methodologies: specification-based testing, Structural testing and property-based testing.

## 🔬 Specification-based testing
It is a testing methodology which examines whether the required inputs yield the expected results.
Specification-based testing, therefore, does not focus on the implementation and for this reason is also called black-box testing.
Using 7 steps approach of Specification-based methodology we tested `toCamelCase()` method, which format an input string according to camelCase naming convention.

## 🛡️ Structural testing
It is a white-box testing approach which tests the structure of the source code.
A **code coverage** report has been generated to identify code segments not covered by the test suite. The report indicated that the test suite covers 100% of the lines of code to be tested.
In addition, **Mutation Testing** has been performed using [PIT Mutation Testing](https://pitest.org/) tool, which purposefully insert bugs in the existing code to verify if the test suite is robust enough to detect them. The report produced by PIT indicates that the test suite killed all the 22 generated mutations.

## 📊 Property-based testing
It is a testing methodology which express the property we want to test and let the test framework choose several examples.
Using [jqwik](https://jqwik.net/) test engine we tested `findPrimeIndex()` method, which returns the index of the first (or last) occurrence of a prime number within a list of integers.
In relation to this type of test, statistics on generated inputs can be found in the [documentation](https://drive.google.com/file/d/1jiPd1M9VZr7YKUYfh1UiloI-DSH2-JkQ/view?usp=sharing).

## 🗂️ Repository Structure
* [`toCamelCase()`](/src/main/java/homework1/CaseUtils.java) source code
* [`findPrimeIndex()`](/src/main/java/homework2/PrimeIndex.java) source code
* [`toCamelCase()`](/src/test/java/homework1) testing code
* [`findPrimeIndex()`](/src/test/java/homework2/PrimeIndexTest.java) testing code

## 📚 Documentation
[![Google Drive](https://img.shields.io/badge/Google%20Drive-4285F4?style=for-the-badge&logo=googledrive&logoColor=white)](https://drive.google.com/file/d/1jiPd1M9VZr7YKUYfh1UiloI-DSH2-JkQ/view?usp=sharing)

## 🌐 Collaborators:
* Rubino Vito Marco <br>
[![Github](https://img.shields.io/badge/GitHub-100000?logo=github&logoColor=white)](https://github.com/vitomarcorubino) [![LinkedIn](https://img.shields.io/badge/LinkedIn-%230077B5.svg?logo=linkedin&logoColor=white)](https://www.linkedin.com/in/vitomarcorubino/) [![Stack Overflow](https://img.shields.io/badge/-Stackoverflow-FE7A16?logo=stack-overflow&logoColor=white)](https://stackoverflow.com/users/11417498/marco-rubino) 
* Signorile Simone <br>
[![Github](https://img.shields.io/badge/GitHub-100000?logo=github&logoColor=white)](https://github.com/simonesignorile)
