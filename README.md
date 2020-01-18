# Sentinel - Selenium Automation Framework in Java

A Selenium framework that implements the [Page Object Model](http://cheezyworld.com/2010/11/09/ui-tests-not-brittle/) (POM) using [Object Oriented Programming](https://en.wikipedia.org/wiki/Object-oriented_programming) (OOP) concepts. It abstracts out most of the complexity of Selenium to allow users to focus on automating tests and not spend time dealing with the technical details of implementing an automation framework.

## Quickstart
For those wanting to go crazy without reading lots of docs, get the [sentinel.example Project](https://github.com/dougnoel/sentinel.example), and checkout the [Sentinel Javadocs](https://dougnoel.github.io/sentinel/), especially the steps package. Sentinel is intended to be included in your test automation and used as a jar file. If you are writing tests, you should **NOT** be modifying the Sentinel code itself.

People wondering where they can write @Given, @When, and @Then steps should first be asking what has been written and attempting to reuse that instead of writing their own. If you are writing your own more than 1% of the time then you are not using the framework as intended and wasting time (or working on something really weird).

# Section 1: Using Sentinel

## 1.0 Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### 1.1 Prerequisites

What things you need to install the software and how to install them:
 * Integrated Development Environment (Eclipse Suggested)
 * Java (1.8 or later)
 * Maven (2.5.4 or later)
 * GitHub Account

### 1.2 Installation

#### 1.2.1 Generate a GitHub Personal Access Token
Note: You must have Maven installed and have an account on [github.com](https://github.com) Instructions modified from: [Create a GitHub personal access token](https://help.github.com/en/github/authenticating-to-github/creating-a-personal-access-token-for-the-command-line).

1. [Verify your email address](https://help.github.com/en/articles/verifying-your-email-address), if it hasn't been verified yet.
2. In the upper-right corner of any page, click your profile photo, then click **Settings**.
3. In the left sidebar, click **Developer settings**.
4. In the left sidebar, click **Personal access tokens**.
5. Click **Generate new token**.
6. Name the token **Package Read/Write**
7. Select the **write:packages** scope. This will auto-select the **read:packages** and **repo** scopes you need as well.
8. Click **Generate token**.
9. Click  to copy the token to your clipboard. For security reasons, after you navigate off the page, you will not be able to see the token again.

#### 1.2.2 Maven settings.xml file


#### 1.2.2 Install the Project 
First you need to install the project and open it.

**On the command line:**
Clone the project from git.

```
git clone https://github.com/dougnoel/sentinel.git
```
1. Open Eclipse
2. File -> Open Projects from File system...
3. Next to Import Source click the Directory button and browse to the installed location.
4. Click the Finish button.


#### 1.2.2 Install Traprange into your Local Maven Repo
Install Traprange to your local Maven Repo either from the command line, or from inside Eclipse.

**On the command line:**

```
cd [your project dir]/sentinel
mvn install:install-file -Dfile=src/main/resources/lib/traprange/traprange-1.1.1.jar -DgroupId=com.giaybac -DartifactId=traprange -Dversion=1.1.1 -Dpackaging=jar -DpomFile=src/main/resources/lib/traprange/pom.xml
```

**In Eclipse:**

1. From the Run menu select Run Configurations...
2. On the left-hand side select Maven Build.
3. Click the New Configuration button in the upper left-hand corner of the dialog. It looks like a piece of paper with a yellow plus sign on top of it.
4. Name the new configuration "Install Traprange".
5. Under the Base Directory textbox, click the **Workspace** button.
6. Select the Sentinel project and click the **Ok** button.
6. Copy and paste the code below into the Goals text box.
7. Click the Run button.

```
install:install-file -Dfile=src/main/resources/lib/traprange/traprange-1.1.1.jar -DgroupId=com.giaybac -DartifactId=traprange -Dversion=1.1.1 -Dpackaging=jar -DpomFile=src/main/resources/lib/traprange/pom.xml
```

#### 1.2.3 Build the Project in Eclipse
After installing Traprange successfully, you need to build the Maven project to make sure all the repositories are included.

1. Right-Click on the project in the Project Explorer.
2. Maven -> Update Project...
3. Wait for the status bar in the lower right-hand corner to finish before continuing.

## 2.0 - 4.0
These sections have been moved to the [sentinel.example Project](https://github.com/dougnoel/sentinel.example). Please refer to that Readme for how to create and execute tests.

## 5.0 Deployment

Add additional notes about how to deploy this on a live system in Bamboo/Jenkins/etc.

### 5.1 Building a Jar File

To build a file for release, open up the pom.xml and change the version number using [Semantic Versioning](http://semver.org/) to the next release number. Alternately an X.X.X-SNAPSHOT version can be created.

Then just run:

```
mvn package
```
The jar file will be located in the target directory.

To install it locally:

```
mvn install:install-file -Dfile=sentinel-1.0.0-SNAPSHOT.jar -DgroupId=com.dougnoel -DartifactId=sentinel -Dversion=1.0.0-SNAPSHOT -Dpackaging=jar -DgeneratePom=true
```

## 6.0 Additional Documentation & Resources

### 6.1 Javadocs
Sentinel comes with Javadocs which describe its classes in great detail. This includes examples of how you can use the generic Cucumber steps that are already included. The [Sentinel Javadocs](https://dougnoel.github.io/sentinel/) are updated on github with every new version.

The Javadocs can also be easily generated by running the following command.

```
mvn javadoc:javadoc
```
The files are generated in the project root folder under the default path of target/site/apidocs and can be accessed by opening up the index.html file contained within that folder.

Every method should have a Javadoc comment describing what it does, its parameters, what it returns (if not void), and any exceptions it throws. We follow the [Liferay-Portal Javadoc Guidelines](https://github.com/liferay/liferay-portal/blob/master/readme/ADVANCED_JAVADOC_GUIDELINES.markdown) for writing Javadoc contents.

### 6.2 Built With

* [Cucumber](https://cucumber.io/) - BDD Testing Framework
* [Cucumber Extent Reporter](http://www.vimalselvam.com/cucumber-extent-reporter/) Interface between Cucumber Results and Extent Reports.
* [Commons Lang](https://commons.apache.org/proper/commons-lang/) - Apache Commons Lang 3 for common Java language options
* [Extent Reports](http://extentreports.com/) - A report framework for automation testing.
* [HttpComponents](http://hc.apache.org/) - Apache HttpComponents for API testing.
* [Jackson](https://github.com/FasterXML/jackson) - Libraries for reading YAML, JSON and other config files.
* [Log4j2](https://logging.apache.org/log4j/2.x/) - Apache logging framework.
* [PDFBox](https://pdfbox.apache.org/) - Apache library for reading PDF files.
* [Maven](https://maven.apache.org/) - Apache dependency management.
* [Maven Javadoc Plugin](https://maven.apache.org/plugins/maven-javadoc-plugin/) - Plugin to allow maven to generate Javadocs.
* [Saucelabs](https://saucelabs.com/) - Multi-Platform, multi-browser external testing service.
* [Selenium](https://www.seleniumhq.org/) - The automation framework workhorse.
* [Swagger Parser](https://github.com/swagger-api/swagger-parser) - Reads Swagger API files, allowing us to use them as API Objects.
* [Traprange](https://github.com/thoqbk/traprange) - Independent library developed using PDFBox to deal with tables in PDFs.
* [Unirest](http://unirest.io/java.html) - A simple API library used for the API testing functionality.

### 6.3 Web Drivers

The web drivers used by Sentinel are stored in drivers/os to make sure there is only one place to fix driver compatibility issues. Chrome auto updates, and so is the one that will go of date most often. While we could pull the driver from a path and let each implementation install the drivers, this can become problematic in CI/CD environments where we do not control the system. This also reduces the learning curve for using Sentinel.

* [Chromedriver](http://chromedriver.chromium.org/) 2.42 - Driver for automating Google Chrome.
* [Geckodriver](https://github.com/mozilla/geckodriver/releases) - Driver for automating Mozilla Firefox.
* [Safari](https://webkit.org/blog/6900/webdriver-support-in-safari-10/) - Safari driver is embedded in Safari.
* [IE Driver](http://selenium-release.storage.googleapis.com/index.html) - Driver for automating IE.

## 7.0 Versioning

We use [Semantic Versioning](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/dougnoel/sentinel/tags). 

## 8.0 Authors

* **Doug Noël** - *Architect* - Initial work.

## 9.0 License

This project is licensed under the Apache Commons 2.0 License - see the [LICENSE.md](LICENSE.md) file for details

## 10.0 Acknowledgments

* Some design choices inspired by [Cheezy's Page Object gem](https://github.com/cheezy/page-object).