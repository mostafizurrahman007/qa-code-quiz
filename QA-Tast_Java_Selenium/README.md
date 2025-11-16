# Login Portal UI Automation (Selenium + Aquality + TestNG)

## Overview
This is a small automation project I created to test the prototype login portal from the assignment.  
The frontend team provided the basic UI without any testing, so my job was to add automated checks that show whether the login flow works properly.

I used Java, Selenium, TestNG, and the Aquality Framework**, plus Allure for reporting.

## Why I Used This Stack
The instructions mentioned Jest/Cypress, but also said I can choose any framework with justification.  
I picked Selenium + Aquality because:
- I’m more comfortable with Java/Selenium
- Aquality gives a clean page-object structure
- Easy setup, easy to maintain, works well for simple UI flows like this

## What I Tested
I automated three main scenarios:

1. Valid login – correct username/password should redirect.
2. Empty fields – login shouldn’t work when both fields are blank.
3. Invalid login – wrong credentials shouldn’t allow access.

All tests are written using page objects (`MainPage`, `RedirectedPage`)

The app runs at: http://localhost:8081

## How to Run the Frontend
```bash

npm install
npm start

# Run Tests + Allure Report (Single Workflow)

1. Run TestNG tests
mvn clean test

2. Generate and open Allure report
allure serve target/allure-results

This will open an interactive HTML report showing the test results.