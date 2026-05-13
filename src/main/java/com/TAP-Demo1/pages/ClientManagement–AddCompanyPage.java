package com.TAP-Demo1.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.utils.ElementUtils;
import org.junit.Assert;

public class ClientManagementAddCompanyPage {
    private WebDriver driver;
    private ElementUtils elementUtils;

    @FindBy(id = "addCompanyButton")
    private WebElement addCompanyButton;
    @FindBy(id = "contactsTab")
    private WebElement contactsTab;
    @FindBy(id = "searchButton")
    private WebElement searchButton;
    @FindBy(id = "saveButton")
    private WebElement saveButton;
    @FindBy(id = "clientManagementOption")
    private WebElement clientManagementOption;
    @FindBy(id = "companySearchResults")
    private WebElement companySearchResults;
    @FindBy(id = "contactSearchResults")
    private WebElement contactSearchResults;

    public ClientManagementAddCompanyPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickAddCompanyButton() {
        elementUtils.clickElement(addCompanyButton);
    }

    public void clickContactsTab() {
        elementUtils.clickElement(contactsTab);
    }

    public void clickSearchButton() {
        elementUtils.clickElement(searchButton);
    }

    public void clickSaveButton() {
        elementUtils.clickElement(saveButton);
    }

    public void clickClientManagementOption() {
        elementUtils.clickElement(clientManagementOption);
    }

    public void selectCompanyFromSearchResults() {
        elementUtils.clickElement(companySearchResults);
    }

    public void selectContactFromSearchResults() {
        elementUtils.clickElement(contactSearchResults);
    }

    ublic void verifyCompanyCreationSuccess(String expectedMessage) {
        String actualMessage = elementUtils.getElementText(companySearchResults);
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    ublic void verifyContactSelectionSuccess(String expectedMessage) {
        String actualMessage = elementUtils.getElementText(contactSearchResults);
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    public void loginWithValidCredentials() {
        try {
            WebElement usernameField = driver.findElement(By.id("username"));
            WebElement passwordField = driver.findElement(By.id("password"));
            WebElement loginButton = driver.findElement(By.id("loginButton"));

            elementUtils.clearAndSendKeys(usernameField, "validUser");
            elementUtils.clearAndSendKeys(passwordField, "validPassword");
            elementUtils.clickElement(loginButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterDistrictDetails(String district) {
        WebElement districtField = driver.findElement(By.id("district"));
        elementUtils.clearAndSendKeys(districtField, district);
    }

    public void isContactInList(String contactName) {
        WebElement contactElement = driver.findElement(By.xpath("//li[text()='" + contactName + "']"));
        Assert.assertTrue(elementUtils.isElementDisplayed(contactElement), "Contact is not displayed in the list!");
    }

    public void areBasicInformationFieldsEditable() {
        WebElement firstNameField = driver.findElement(By.id("firstName"));
        WebElement lastNameField = driver.findElement(By.id("lastName"));

        Assert.assertTrue(firstNameField.isEnabled(), "First name field is not editable!");
        Assert.assertTrue(lastNameField.isEnabled(), "Last name field is not editable!");
    }

    public void enterCompanyName(String companyName) {
        WebElement companyNameField = driver.findElement(By.id("companyName"));
        elementUtils.clearAndSendKeys(companyNameField, companyName);
    }

    public void changeContactStatus(String status) {
        WebElement statusDropdown = driver.findElement(By.id("contactStatus"));
        elementUtils.selectOptionInDropdown(statusDropdown, status);
    }

    public void clicksOnAddRegionButton() {
        WebElement addRegionButton = driver.findElement(By.id("addRegionButton"));
        elementUtils.clickElement(addRegionButton);
    }

    public void isBasinSuccessMessageDisplayed() {
        WebElement successMessage = driver.findElement(By.id("basinSuccessMessage"));
        String actualMessage = elementUtils.getElementText(successMessage);
        String expectedMessage = "Basin added successfully!";
        Assert.assertEquals(actualMessage, expectedMessage, "Success message does not match!");
    }

    public void enterBasinDetails(String basinDetails) {
        WebElement basinField = driver.findElement(By.id("basinDetails"));
        elementUtils.clearAndSendKeys(basinField, basinDetails);
    }

    public void isFormationInList(String formationName) {
        WebElement formationElement = driver.findElement(By.xpath("//li[text()='" + formationName + "']"));
        Assert.assertTrue(elementUtils.isElementDisplayed(formationElement), "Formation is not displayed in the list!");
    }

    public void isContactsSectionDisplayed() {
        WebElement contactsSection = driver.findElement(By.id("contactsSection"));
        Assert.assertTrue(elementUtils.isElementDisplayed(contactsSection), "Contacts section is not displayed!");
    }

    public void isNewContactDisplayed(String contactName) {
        WebElement newContactElement = driver.findElement(By.xpath("//li[text()='" + contactName + "']"));
        Assert.assertTrue(elementUtils.isElementDisplayed(newContactElement), "New contact is not displayed!");
    }

    public void isRegionSuccessMessageDisplayed() {
        WebElement regionSuccessMessage = driver.findElement(By.id("regionSuccessMessage"));
        String actualMessage = elementUtils.getElementText(regionSuccessMessage);
        String expectedMessage = "Region added successfully!";
        Assert.assertEquals(actualMessage, expectedMessage, "Region success message does not match!");
    }

    public void clicksOnUserProfileIcon() {
        WebElement userProfileIcon = driver.findElement(By.id("userProfileIcon"));
        elementUtils.clickElement(userProfileIcon);
    }

    public void locateApplicationMenu() {
        WebElement appMenu = driver.findElement(By.id("applicationMenu"));
        Assert.assertTrue(elementUtils.isElementDisplayed(appMenu), "Application menu is not displayed!");
    }

    public void isContactUpdateSuccessMessageDisplayed() {
        WebElement updateSuccessMessage = driver.findElement(By.id("contactUpdateSuccessMessage"));
        String actualMessage = elementUtils.getElementText(updateSuccessMessage);
        String expectedMessage = "Contact updated successfully!";
        Assert.assertEquals(actualMessage, expectedMessage, "Contact update success message does not match!");
    }

    public void isDistrictInList(String districtName) {
        WebElement districtElement = driver.findElement(By.xpath("//li[text()='" + districtName + "']"));
        Assert.assertTrue(elementUtils.isElementDisplayed(districtElement), "District is not displayed in the list!");
    }

    public void navigateToClientManagementPage() {
        WebElement clientManagementPageLink = driver.findElement(By.id("clientManagementPage"));
        elementUtils.clickElement(clientManagementPageLink);
    }

    public void toggleProposalApprovalCheckbox() {
        WebElement proposalApprovalCheckbox = driver.findElement(By.id("proposalApprovalCheckbox"));
        elementUtils.clickElement(proposalApprovalCheckbox);
    }

    public void areMatchingCompaniesDisplayed(String companyName) {
        WebElement companyElement = driver.findElement(By.xpath("//li[text()='" + companyName + "']"));
        Assert.assertTrue(elementUtils.isElementDisplayed(companyElement), "Matching company is not displayed!");
    }

    public void clicksOnContactsTab() {
        elementUtils.clickElement(contactsTab);
    }

    public void fillInMandatoryFields(String firstName, String lastName) {
        WebElement firstNameField = driver.findElement(By.id("firstName"));
        WebElement lastNameField = driver.findElement(By.id("lastName"));

        elementUtils.clearAndSendKeys(firstNameField, firstName);
        elementUtils.clearAndSendKeys(lastNameField, lastName);
    }

    public void areContactsListed(String contactName) {
        WebElement contactElement = driver.findElement(By.xpath("//li[text()='" + contactName + "']"));
        Assert.assertTrue(elementUtils.isElementDisplayed(contactElement), "Contact is not listed!");
    }

    public void fillInDistrict(String district) {
        WebElement districtField = driver.findElement(By.id("districtField"));
        elementUtils.clearAndSendKeys(districtField, district);
    }

    public void enterInSearchBar(String searchTerm) {
        WebElement searchBar = driver.findElement(By.id("searchBar"));
        elementUtils.clearAndSendKeys(searchBar, searchTerm);
    }

    public void clicksOnSaveButton() {
        elementUtils.clickElement(saveButton);
    }

    public void clicksOnAddDistrictButton() {
        WebElement addDistrictButton = driver.findElement(By.id("addDistrictButton"));
        elementUtils.clickElement(addDistrictButton);
    }

    public void fillInBasin(String basin) {
        WebElement basinField = driver.findElement(By.id("basinField"));
        elementUtils.clearAndSendKeys(basinField, basin);
    }

    public void isBasinInList(String basinName) {
        WebElement basinElement = driver.findElement(By.xpath("//li[text()='" + basinName + "']"));
        Assert.assertTrue(elementUtils.isElementDisplayed(basinElement), "Basin is not displayed in the list!");
    }

    public void isCompanyInList(String companyName) {
        WebElement companyElement = driver.findElement(By.xpath("//li[text()='" + companyName + "']"));
        Assert.assertTrue(elementUtils.isElementDisplayed(companyElement), "Company is not displayed in the list!");
    }

    public void isBasicInfoSuccessMessageDisplayed() {
        WebElement successMessage = driver.findElement(By.id("basicInfoSuccessMessage"));
        String actualMessage = elementUtils.getElementText(successMessage);
        String expectedMessage = "Basic information saved successfully!";
        Assert.assertEquals(actualMessage, expectedMessage, "Basic info success message does not match!");
    }

    public void isContactUpdatedInList(String contactName) {
        isContactInList(contactName);
    }

    public void clicksOnAddNewContactButton() {
        WebElement addNewContactButton = driver.findElement(By.id("addNewContactButton"));
        elementUtils.clickElement(addNewContactButton);
    }

    public void isContactSuccessMessageDisplayed() {
        WebElement contactSuccessMessage = driver.findElement(By.id("contactSuccessMessage"));
        String actualMessage = elementUtils.getElementText(contactSuccessMessage);
        String expectedMessage = "Contact added successfully!";
        Assert.assertEquals(actualMessage, expectedMessage, "Contact success message does not match!");
    }

    public void isBasicInformationSectionDisplayed() {
        WebElement basicInfoSection = driver.findElement(By.id("basicInformationSection"));
        Assert.assertTrue(elementUtils.isElementDisplayed(basicInfoSection), "Basic information section is not displayed!");
    }

    public void selectExistingBasin(String basinName) {
        WebElement basinDropdown = driver.findElement(By.id("basinDropdown"));
        elementUtils.selectOptionInDropdown(basinDropdown, basinName);
    }

    public void selectLogoutOption() {
        WebElement logoutOption = driver.findElement(By.id("logoutOption"));
        elementUtils.clickElement(logoutOption);
    }

    public void isLogoutMessageDisplayed() {
        WebElement logoutMessage = driver.findElement(By.id("logoutMessage"));
        String actualMessage = elementUtils.getElementText(logoutMessage);
        String expectedMessage = "You have been logged out successfully!";
        Assert.assertEquals(actualMessage, expectedMessage, "Logout message does not match!");
    }

    public void selectExistingRegion(String regionName) {
        WebElement regionDropdown = driver.findElement(By.id("regionDropdown"));
        elementUtils.selectOptionInDropdown(regionDropdown, regionName);
    }

    public void isRedirectedToLoginPage() {
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "http://localhost/login";
        Assert.assertEquals(actualUrl, expectedUrl, "Not redirected to the login page!");
    }

    public void enterFormationDetails(String formationDetails) {
        WebElement formationField = driver.findElement(By.id("formationDetails"));
        elementUtils.clearAndSendKeys(formationField, formationDetails);
    }

    public void searchForContact(String contactName) {
        WebElement searchBar = driver.findElement(By.id("contactSearchBar"));
        elementUtils.clearAndSendKeys(searchBar, contactName);
    }

    public void enterRegionDetails(String regionDetails) {
        WebElement regionField = driver.findElement(By.id("regionDetails"));
        elementUtils.clearAndSendKeys(regionField, regionDetails);
    }

    public void areBasicInfoDetailsCorrect(String expectedInfo) {
        WebElement infoElement = driver.findElement(By.id("basicInfoDetails"));
        String actualInfo = elementUtils.getElementText(infoElement);
        Assert.assertEquals(actualInfo, expectedInfo, "Basic info details are not correct!");
    }

    public void selectExistingContact(String contactName) {
        WebElement contactDropdown = driver.findElement(By.id("contactDropdown"));
        elementUtils.selectOptionInDropdown(contactDropdown, contactName);
    }

    public void clicksOnOption(WebElement option) {
        elementUtils.clickElement(option);
    }

    public void isRegionInList(String regionName) {
        WebElement regionElement = driver.findElement(By.xpath("//li[text()='" + regionName + "']"));
        Assert.assertTrue(elementUtils.isElementDisplayed(regionElement), "Region is not displayed in the list!");
    }

    public void isDistrictSuccessMessageDisplayed() {
        WebElement districtSuccessMessage = driver.findElement(By.id("districtSuccessMessage"));
        String actualMessage = elementUtils.getElementText(districtSuccessMessage);
        String expectedMessage = "District added successfully!";
        Assert.assertEquals(actualMessage, expectedMessage, "District success message does not match!");
    }

    public void clicksOnAddBasinButton() {
        WebElement addBasinButton = driver.findElement(By.id("addBasinButton"));
        elementUtils.clickElement(addBasinButton);
    }

    public void isDashboardDisplayed() {
        WebElement dashboard = driver.findElement(By.id("dashboard"));
        Assert.assertTrue(elementUtils.isElementDisplayed(dashboard), "Dashboard is not displayed!");
    }

    public void areContactDetailsCorrect(String expectedDetails) {
        WebElement contactDetailsElement = driver.findElement(By.id("contactDetails"));
        String actualDetails = elementUtils.getElementText(contactDetailsElement);
        Assert.assertEquals(actualDetails, expectedDetails, "Contact details are not correct!");
    }

    public void fillInFormation(String formation) {
        WebElement formationField = driver.findElement(By.id("formationField"));
        elementUtils.clearAndSendKeys(formationField, formation);
    }

    public void areMatchingContactsDisplayed(String contactName) {
        WebElement contactElement = driver.findElement(By.xpath("//li[text()='" + contactName + "']"));
        Assert.assertTrue(elementUtils.isElementDisplayed(contactElement), "Matching contact is not displayed!");
    }

    public void enterInContactSearchBar(String searchTerm) {
        WebElement contactSearchBar = driver.findElement(By.id("contactSearchBar"));
        elementUtils.clearAndSendKeys(contactSearchBar, searchTerm);
    }

    public void isFormationSuccessMessageDisplayed() {
        WebElement formationSuccessMessage = driver.findElement(By.id("formationSuccessMessage"));
        String actualMessage = elementUtils.getElementText(formationSuccessMessage);
        String expectedMessage = "Formation added successfully!";
        Assert.assertEquals(actualMessage, expectedMessage, "Formation success message does not match!");
    }

    public void fillInRegion(String region) {
        WebElement regionField = driver.findElement(By.id("regionField"));
        elementUtils.clearAndSendKeys(regionField, region);
    }

    public void isRedirectedToClientManagementModule() {
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "http://localhost/clientManagement";
        Assert.assertEquals(actualUrl, expectedUrl, "Not redirected to the client management module!");
    }

    public void clicksOnBasicInformationTab() {
        WebElement basicInfoTab = driver.findElement(By.id("basicInformationTab"));
        elementUtils.clickElement(basicInfoTab);
    }

    public void navigateToContactsSection() {
        WebElement contactsSectionLink = driver.findElement(By.id("contactsSectionLink"));
        elementUtils.clickElement(contactsSectionLink);
    }

    public void clicksOnCompanyFromList(String companyName) {
        WebElement companyElement = driver.findElement(By.xpath("//li[text()='" + companyName + "']"));
        elementUtils.clickElement(companyElement);
    }
}