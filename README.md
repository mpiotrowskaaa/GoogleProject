# Automated Tests - Readme

This repository contains automated tests for the Google website using Selenium WebDriver. The tests are designed to run on Windows, using Chrome version 113.

## Table of Contents
- [Setup](#setup)
- [Technologies](#technologies)
- [Test Descriptions](#test-descriptions)
- [Future Works](#future-work)

## Setup

To set up and run the tests locally, follow these steps:

1. Clone the repository to your local machine.

2. Make sure you have the following prerequisites installed:
    - Java Development Kit (JDK) 8 or above
    - Maven
    - Chrome browser (version 113)

3. Download the appropriate version of the ChromeDriver executable for Chrome version 113 from the official ChromeDriver website (https://sites.google.com/a/chromium.org/chromedriver/downloads). Make sure to place the chromedriver executable in a directory that is included in the system's PATH variable.


## Technologies

The project is built using the following technologies and dependencies:

- Java - version 11.0.8
- TestNG - version 7.7.1
- Selenium Java - version 4.9.1
- ChromeDriver - version 113
- Project Lombok - version 1.18.24

## Test Descriptions
- verifyElementsOnGoogleFrameTest

 This test verifies that all elements on the Google pop-up frame are displayed correctly. It opens the Google main page, navigates to the pop-up frame, and verifies the presence of all expected elements.

- openMicrosoftLinkedinPageTest

This test opens the Google main page, closes the pop-up frame if present, searches for the text "Microsoft" in the main input, verifies that the search results page is displayed, and opens the search result for "Microsoft - LinkedIn".

Please note that these tests are designed to run on Windows with Chrome version 113. If you encounter any issues or errors, please ensure that you have the correct environment set up.

If you have any questions or need further assistance, please reach out to the repository maintainers.

## Future Works

- Support for Multiple Browsers
- Capturing Screenshots on Test Failure
- Update to Java 17

Happy testing!
