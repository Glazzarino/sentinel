package com.dougnoel.sentinel.steps;

import com.dougnoel.sentinel.configurations.ConfigurationManager;

import cucumber.api.java.en.When;

public class AccountSteps {

	private static final String DEFAULT = "default";
	private static final String USERNAME = "username";
	private static final String PASSWORD = "password";
    
    /**
     * Enters username and password information into specified fields based on the environment, and optionally
     * a specific account or account type for the environment.
     * <p>
     * <b>Gherkin Examples:</b>
     * <ul>
     * <li>I fill the account information into the username field and password field</li>
     * <li>I fill the account information for account Tester into the username box and the password box</li>
     * <li>I fill the account information for account SystemEnv into the username field and the password field</li>
     * </ul>
     * @param usingAccountName String if we have a user account, get the info from its account
     * @param account String user account
     * @param usernameField String username field
     * @param passwordField String password field
     * @throws Throwable this exists so that any uncaught exceptions result in the test failing
     */
    @When("^I fill the account information( for account (.*?))? into the (.*?) and the (.*?)$")
    public static void fillAccountInfoIntoUsernameAndPasswordFields(String usingAccountName, String account, String usernameField, String passwordField) throws Throwable {
        if (usingAccountName == null) {
            TextSteps.enterText(ConfigurationManager.getAccountInformation(DEFAULT,USERNAME), usernameField);
            TextSteps.enterText(ConfigurationManager.getAccountInformation(DEFAULT,PASSWORD), passwordField);            
        } else {
        	TextSteps.enterText(ConfigurationManager.getAccountInformation(account,USERNAME), usernameField);
        	TextSteps.enterText(ConfigurationManager.getAccountInformation(account,PASSWORD), passwordField); 
        }           
    }

    /**
     * Enters password information into the specified field based on the environment, and optionally
     * a specific account or account type for the environment.
     * <p>
     * <b>Gherkin Examples:</b>
     * <ul>
     * <li>I fill the password into the password field</li>
     * <li>I fill the password for account Tester into the password box</li>
     * <li>I fill the password for account SystemEnv into the password field</li>
     * </ul>
     * @param usingAccountName String if we have a user account, get the info from its account
     * @param account String user account
     * @param passwordField String password field
     * @throws Throwable this exists so that any uncaught exceptions result in the test failing
     */
    @When("^I fill the password( for account (.*?))? into the (.*?)$")
    public static void fillPasswordField(String usingAccountName, String account, String passwordField) throws Throwable {
        if (usingAccountName == null) {
        	TextSteps.enterText(ConfigurationManager.getAccountInformation(DEFAULT,PASSWORD), passwordField);            
        } else {
        	TextSteps.enterText(ConfigurationManager.getAccountInformation(account,PASSWORD), passwordField); 
        }           
    }
    
    /**
     * Enters username  information into specified fields based on the environment, and optionally
     * a specific account or account type for the environment.
     * <p>
     * <b>Gherkin Examples:</b>
     * <ul>
     * <li>I fill the username into the username field</li>
     * <li>I fill the username for account Tester into the username box</li>
     * <li>I fill the username for account SystemEnv into the User Name field</li>
     * </ul>
     * @param usingAccountName String if we have a user account, get the info from its account
     * @param account String user account
     * @param usernameField String username field
     * @throws Throwable this exists so that any uncaught exceptions result in the test failing
     */
    @When("^I fill the username( for account (.*?))? into the (.*?)$")
    public static void fillUsernameField(String usingAccountName, String account, String usernameField) throws Throwable {
        if (usingAccountName == null) {
        	TextSteps.enterText(ConfigurationManager.getAccountInformation(DEFAULT,USERNAME), usernameField);
        } else {
        	TextSteps.enterText(ConfigurationManager.getAccountInformation(account,USERNAME), usernameField);
        }           
    }
    
}
