# Selenium-Java-POM-TestNG-AllureReport

This repository contains a test automation framework developed using Selenium WebDriver, Java, Page Object Model (POM), TestNG, and Allure Report. The framework provides a structured approach for writing maintainable and scalable automated tests for web applications.

## Features

- Utilizes Selenium WebDriver to interact with web elements and perform actions on web pages.
- Implements the Page Object Model (POM) design pattern for better code organization and reusability.
- Uses TestNG as the testing framework for test execution, grouping, and reporting.
- Integrates Allure Report for detailed and visually appealing test reports.

## Setup

To set up the project locally, follow these steps:

1. Clone the repository:
   git clone https://github.com/qunoot-ahmed/Selenium-Java-POM-TestNG-AllureReport.git

2. Install the necessary dependencies:
   mvn install

3. Configure the test environment and update the relevant configuration files, such as `config.properties` or `testng.xml`.

4. Run the tests:
   mvn test

## Reporting

This framework generates detailed test reports using Allure Reporting. After running the tests, the results can be found at `allure-report` directory.


## Acknowledgments

I am grateful to the following resources and contributors for their inspiration in developing this framework:

- [Demo Testing website](https://tutorialsninja.com/demo)
- [Selenium WebDriver](https://www.selenium.dev/)
- [TestNG](https://testng.org/doc/)
- [Allure Report](https://docs.qameta.io/allure/)
