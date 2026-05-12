package com.TAP-Demo1.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.utils.ElementUtils;
import org.junit.Assert;

public class ManageRolesInUserManagementPage {
    private WebDriver driver;
    private ElementUtils elementUtils;

    public ManageRolesInUserManagementPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "rolesTab")
    private WebElement rolesTab;
    @FindBy(id = "searchBar")
    private WebElement searchBar;
    @FindBy(id = "searchButton")
    private WebElement searchButton;
    @FindBy(id = "createButton")
    private WebElement createButton;
    @FindBy(id = "roleNameInput")
    private WebElement roleNameInput;
    @FindBy(id = "descriptionInput")
    private WebElement descriptionInput;
    @FindBy(id = "modalCloseButton")
    private WebElement modalCloseButton;
    @FindBy(id = "rolesList")
    private WebElement rolesList;
    @FindBy(id = "editIcon")
    private WebElement editIcon;
    @FindBy(id = "toggleButton")
    private WebElement toggleButton;
    @FindBy(id = "noRolesMessage")
    private WebElement noRolesMessage;
    @FindBy(id = "paginationControls")
    private WebElement paginationControls;
    @FindBy(id = "nextButton")
    private WebElement nextButton;
    @FindBy(id = "previousButton")
    private WebElement previousButton;

    public void navigateToUserManagementModule() {
        // Implement navigation logic here
    }

    public void clicksOnRolesTab() {
        try {
            elementUtils.clickElement(rolesTab);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterRoleNameInSearchBar(String roleName) {
        try {
            elementUtils.clearAndSendKeys(searchBar, roleName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clicksOnSearchButton() {
        try {
            elementUtils.clickElement(searchButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clicksOnCreateButton() {
        try {
            elementUtils.clickElement(createButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterRoleNameInModal(String roleName) {
        try {
            elementUtils.clearAndSendKeys(roleNameInput, roleName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterDescriptionInModal(String description) {
        try {
            elementUtils.clearAndSendKeys(descriptionInput, description);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clicksOnSaveButton() {
        try {
            elementUtils.clickElement(createButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isModalClosed() {
        try {
            Assert.assertFalse(elementUtils.isElementDisplayed(modalCloseButton));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isNewRoleDisplayedInList() {
        // Implement logic to check if new role is displayed in the roles list
    }

    public void verifyNewRoleDetails(String roleName) {
        // Implement verification for the new role details
    }

    public void leaveDescriptionFieldEmpty() {
        // Implement logic to leave description field empty
    }

    public void clicksOnEditIconForExistingRole() {
        try {
            elementUtils.clickElement(editIcon);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void modifyRoleDetailsInModal() {
        // Implement logic to modify role details in the modal
    }

    public void identifyInactiveRole() {
        // Implement logic to identify inactive role
    }

    public void clicksOnToggleToActivateRole() {
        try {
            elementUtils.clickElement(toggleButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isRoleStatusActive() {
        // Implement logic to check if role status is active
    }

    public void isUpdatedStatusVisible() {
        // Implement logic to check if updated status is visible
    }

    public void refreshPage() {
        driver.navigate().refresh();
    }

    public void areRoleDetailsDisplayedCorrectly() {
        // Implement logic to verify role details are displayed correctly
    }

    public void isRolesListDisplayed() {
        try {
            Assert.assertTrue(elementUtils.isElementDisplayed(rolesList));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isRolesListUpdated() {
        // Implement logic to check if roles list is updated
    }

    public void verifyDisplayedRoles() {
        // Implement logic to verify displayed roles based on search criteria
    }

    public void isNoRolesMatchMessageDisplayed() {
        try {
            Assert.assertTrue(elementUtils.isElementDisplayed(noRolesMessage));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isRolesListVisible() {
        try {
            Assert.assertTrue(elementUtils.isElementDisplayed(rolesList));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isRolesListUnchanged() {
        // Implement logic to check if roles list remains unchanged
    }

    public void isPaginationControlsDisplayed() {
        try {
            Assert.assertTrue(elementUtils.isElementDisplayed(paginationControls));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clicksOnNextButton() {
        try {
            elementUtils.clickElement(nextButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isNextSetOfRolesDisplayed() {
        // Implement logic to check if next set of roles is displayed
    }

    public void clicksOnPreviousButton() {
        try {
            elementUtils.clickElement(previousButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isPreviousSetOfRolesDisplayed() {
        // Implement logic to check if previous set of roles is displayed
    }

    public void clicksToggleButtonToActivateRole() {
        try {
            elementUtils.clickElement(toggleButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isRoleDisplayedCorrectly(String expectedRoleName) {
        try {
            WebElement roleElement = driver.findElement(By.id("roleDisplay"));
            String actualRoleName = elementUtils.getElementText(roleElement);
            Assert.assertEquals(actualRoleName, expectedRoleName, "Role name does not match!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void verifyRolesListDetails() {
        try {
            // Logic to verify the details of roles list
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterRoleDescription(String description) {
        try {
            elementUtils.clearAndSendKeys(descriptionInput, description);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clicksOnToggleToDeactivateRole() {
        try {
            elementUtils.clickElement(toggleButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isRolesListScrollable() {
        try {
            boolean isScrollable = rolesList.getAttribute("scrollHeight").equals("0") ? false : true; 
            Assert.assertTrue(isScrollable, "Roles list is not scrollable!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isRoleStatusInactive() {
        try {
            WebElement statusElement = driver.findElement(By.id("roleStatus"));
            String actualStatus = elementUtils.getElementText(statusElement);
            Assert.assertEquals(actualStatus, "Inactive", "Role status is not inactive!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isRoleActive() {
        try {
            WebElement statusElement = driver.findElement(By.id("roleStatus"));
            String actualStatus = elementUtils.getElementText(statusElement);
            Assert.assertEquals(actualStatus, "Active", "Role status is not active!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clicksOnCancelButton() {
        try {
            WebElement cancelButton = driver.findElement(By.id("cancelButton"));
            elementUtils.clickElement(cancelButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isRoleStatusInactiveAfterToggle() {
        try {
            WebElement statusElement = driver.findElement(By.id("roleStatus"));
            String actualStatus = elementUtils.getElementText(statusElement);
            Assert.assertEquals(actualStatus, "Inactive", "Role status is still active after toggle!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void identifyActiveRoleForToggle() {
        try {
            WebElement activeRole = driver.findElement(By.xpath("//div[@class='activeRole']"));
            Assert.assertTrue(elementUtils.isElementDisplayed(activeRole), "Active role is not displayed!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isUpdatedStatusVisibleInRolesList() {
        try {
            WebElement updatedStatus = driver.findElement(By.id("updatedStatus"));
            Assert.assertTrue(elementUtils.isElementDisplayed(updatedStatus), "Updated status is not visible in roles list!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isModalOpen() {
        try {
            WebElement modal = driver.findElement(By.id("modalWindow"));
            Assert.assertTrue(elementUtils.isElementDisplayed(modal), "Modal is not open!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void verifyEditIconAvailability() {
        try {
            Assert.assertTrue(elementUtils.isElementDisplayed(editIcon), "Edit icon is not available!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void verifyToggleButtonAvailability() {
        try {
            Assert.assertTrue(elementUtils.isElementDisplayed(toggleButton), "Toggle button is not available!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isRoleStatusActiveAfterToggle() {
        try {
            WebElement statusElement = driver.findElement(By.id("roleStatus"));
            String actualStatus = elementUtils.getElementText(statusElement);
            Assert.assertEquals(actualStatus, "Active", "Role status is not active after toggle!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isCreateButtonVisibleAndFunctional() {
        try {
            Assert.assertTrue(elementUtils.isElementDisplayed(createButton), "Create button is not visible!");
            elementUtils.clickElement(createButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void verifyUpdatedRoleDetails() {
        // Logic to verify updated role details
    }

    public void clicksOnCreateButtonInModal() {
        try {
            WebElement createButtonInModal = driver.findElement(By.id("createButtonInModal"));
            elementUtils.clickElement(createButtonInModal);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isModalClosedWithoutSaving() {
        try {
            WebElement modal = driver.findElement(By.id("modalWindow"));
            Assert.assertFalse(elementUtils.isElementDisplayed(modal), "Modal is still open without saving!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}