package com.TAP-Demo1.stepdefinitions;

import com..utils.ElementUtils;
import org.junit.Assert;
import com..driverfactory.DriverFactory;
import com.TAP-Demo1.pages.ManageRolesInUserManagementPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class ManageRolesInUserManagement extends DriverFactory {
ManageRolesInUserManagementPage manageRolesPage = new ManageRolesInUserManagementPage(driver);
@Given("the user is in the User Management module")
public void the_user_is_in_the_user_management_module() {
manageRolesPage.navigateToUserManagementModule();
}
@When("the user clicks on the Roles tab")
public void the_user_clicks_on_the_roles_tab() {
manageRolesPage.clicksOnRolesTab();
}
@Then("the roles list is displayed without errors")
public void the_roles_list_is_displayed_without_errors() {
manageRolesPage.isRolesListDisplayed();
}
@And("each role shows the correct Role Name, Type, and Status")
public void each_role_shows_the_correct_role_name_type_and_status() {
manageRolesPage.verifyRolesListDetails();
}
@And("the list is scrollable if necessary")
public void the_list_is_scrollable_if_necessary() {
manageRolesPage.isRolesListScrollable();
}
@Given("the admin enters {string} in the search bar")
public void the_admin_enters_role_name_in_the_search_bar(String roleName) {
manageRolesPage.enterRoleNameInSearchBar(roleName);
}
@And("the admin clicks the search button")
public void the_admin_clicks_the_search_button() {
manageRolesPage.clicksOnSearchButton();
}
@Then("the roles list updates to show only matching roles")
public void the_roles_list_updates_to_show_only_matching_roles() {
manageRolesPage.isRolesListUpdated();
}
@And("the correct roles based on the search criteria are displayed")
public void the_correct_roles_based_on_the_search_criteria_are_displayed() {
manageRolesPage.verifyDisplayedRoles();
}
@And("an appropriate message is shown if no roles match the search")
public void an_appropriate_message_is_shown_if_no_roles_match_the_search() {
manageRolesPage.isNoRolesMatchMessageDisplayed();
}
@When("the admin clicks on the Create button")
public void the_admin_clicks_on_the_create_button() {
manageRolesPage.clicksOnCreateButton();
}
@And("in the pop-up modal, enters {string} as the Role Name")
public void in_the_pop_up_modal_enters_role_name_as_the_role_name(String roleName) {
manageRolesPage.enterRoleNameInModal(roleName);
}
@And("enters {string} as the Description")
public void enters_description_as_the_description(String description) {
manageRolesPage.enterDescriptionInModal(description);
}
@And("clicks the Create button")
public void clicks_the_create_button() {
manageRolesPage.clicksOnCreateButtonInModal();
}
@Then("the pop-up modal should close after creation")
public void the_pop_up_modal_should_close_after_creation() {
manageRolesPage.isModalClosed();
}
@And("the new role should appear in the roles list")
public void the_new_role_should_appear_in_the_roles_list() {
manageRolesPage.isNewRoleDisplayedInList();
}
@And("the new role should display the correct Role Name as {string} and Status as Active")
public void the_new_role_should_display_the_correct_role_name_as_and_status_as_active(String roleName) {
manageRolesPage.verifyNewRoleDetails(roleName);
}
@And("the admin leaves the Description field empty")
public void the_admin_leaves_the_description_field_empty() {
manageRolesPage.leaveDescriptionFieldEmpty();
}
@When("the admin clicks the edit icon for an existing role")
public void the_admin_clicks_the_edit_icon_for_an_existing_role() {
manageRolesPage.clicksOnEditIconForExistingRole();
}
@And("the admin modifies the Role Name and/or Description in the pop-up modal")
public void the_admin_modifies_the_role_name_and_or_description_in_the_pop_up_modal() {
manageRolesPage.modifyRoleDetailsInModal();
}
@And("the admin clicks the Save button")
public void the_admin_clicks_the_save_button() {
manageRolesPage.clicksOnSaveButton();
}
@Then("the updated role details are reflected in the roles list")
public void the_updated_role_details_are_reflected_in_the_roles_list() {
manageRolesPage.verifyUpdatedRoleDetails();
}
@When("the admin identifies an inactive role in the list")
public void the_admin_identifies_an_inactive_role_in_the_list() {
manageRolesPage.identifyInactiveRole();
}
@And("the admin clicks the toggle button to activate the role")
public void the_admin_clicks_the_toggle_button_to_activate_the_role() {
manageRolesPage.clicksOnToggleToActivateRole();
}
@Then("the role status changes to Active immediately upon toggle")
public void the_role_status_changes_to_active_immediately_upon_toggle() {
manageRolesPage.isRoleStatusActive();
}
@And("the updated status is visible in the roles list")
public void the_updated_status_is_visible_in_the_roles_list() {
manageRolesPage.isUpdatedStatusVisible();
}
@When("the admin identifies an active role in the list")
public void the_admin_identifies_an_active_role_in_the_list() {
manageRolesPage.identifyActiveRole();
}
@And("the admin clicks the toggle button to deactivate the role")
public void the_admin_clicks_the_toggle_button_to_deactivate_the_role() {
manageRolesPage.clicksOnToggleToDeactivateRole();
}
@Then("the role status changes to Inactive immediately upon toggle")
public void the_role_status_changes_to_inactive_immediately_upon_toggle() {
manageRolesPage.isRoleStatusInactive();
}
@When("the admin clicks the Cancel button")
public void the_admin_clicks_the_cancel_button() {
manageRolesPage.clicksOnCancelButton();
}
@Then("the pop-up modal should close without saving data")
public void the_pop_up_modal_should_close_without_saving_data() {
manageRolesPage.isModalClosedWithoutSaving();
}
@And("the roles list should remain unchanged")
public void the_roles_list_should_remain_unchanged() {
manageRolesPage.isRolesListUnchanged();
}
@When("the user observes the roles list")
public void the_user_observes_the_roles_list() {
manageRolesPage.isRolesListVisible();
}
@Then("each role should have an Edit icon available")
public void each_role_should_have_an_edit_icon_available() {
manageRolesPage.verifyEditIconAvailability();
}
@And("each role should have a toggle button for status")
public void each_role_should_have_a_toggle_button_for_status() {
manageRolesPage.verifyToggleButtonAvailability();
}
@And("the Create button should be visible and functional")
public void the_create_button_should_be_visible_and_functional() {
manageRolesPage.isCreateButtonVisibleAndFunctional();
}
@When("the user identifies an active role in the list")
public void the_user_identifies_an_active_role_in_the_list() {
manageRolesPage.identifyActiveRoleForToggle();
}
@Then("the role status should change to Inactive")
public void the_role_status_should_change_to_inactive() {
manageRolesPage.isRoleStatusInactiveAfterToggle();
}
@Then("the role status should change back to Active")
public void the_role_status_should_change_back_to_active() {
manageRolesPage.isRoleStatusActiveAfterToggle();
}
@Then("the roles list displays pagination controls")
public void the_roles_list_displays_pagination_controls() {
manageRolesPage.isPaginationControlsDisplayed();
}
@When("the user clicks the Next button")
public void the_user_clicks_the_next_button() {
manageRolesPage.clicksOnNextButton();
}
@Then("the next set of roles is displayed")
public void the_next_set_of_roles_is_displayed() {
manageRolesPage.isNextSetOfRolesDisplayed();
}
@When("the user clicks the Previous button")
public void the_user_clicks_the_previous_button() {
manageRolesPage.clicksOnPreviousButton();
}
@Then("the previous set of roles is displayed")
public void the_previous_set_of_roles_is_displayed() {
manageRolesPage.isPreviousSetOfRolesDisplayed();
}

@Given("the user navigates to the user management module")
public void the_user_navigates_to_the_user_management_module() {
manageRolesPage.navigateToUserManagementModule();
}
@When("the admin clicks on the roles tab")
public void the_admin_clicks_on_the_roles_tab() {
manageRolesPage.clicksOnRolesTab();
}
@When("the admin enters a valid role name {string} and description {string}")
public void the_admin_enters_a_valid_role_name_and_description(String roleName, String description) {
manageRolesPage.enterRoleName(roleName);
manageRolesPage.enterRoleDescription(description);
}
@When("the admin clicks the create button")
public void the_admin_clicks_the_create_button() {
manageRolesPage.clicksCreateButton();
}
@When("the user clicks the toggle button to deactivate the role")
public void the_user_clicks_the_toggle_button_to_deactivate_the_role() {
manageRolesPage.clicksToggleButtonToDeactivateRole();
}
@Then("the updated status should be visible in the roles list after each toggle")
public void the_updated_status_should_be_visible_in_the_roles_list_after_each_toggle() {
manageRolesPage.isUpdatedStatusVisibleInRolesList();
}
@Then("the new role should display the correct role name {string}, description {string}, status as active")
public void the_new_role_should_display_the_correct_role_name_description_status_as_active(String roleName, String description) {
manageRolesPage.isRoleDisplayedCorrectly(roleName, description, "active");
}
@Then("the status remains inactive after refreshing the page")
public void the_status_remains_inactive_after_refreshing_the_page() {
manageRolesPage.refreshPage();
manageRolesPage.isRoleActive();
}
@When("the user clicks the toggle button again to activate the role")
public void the_user_clicks_the_toggle_button_again_to_activate_the_role() {
manageRolesPage.clicksToggleButtonToActivateRole();
}
@When("the admin refreshes the page")
public void the_admin_refreshes_the_page() {
manageRolesPage.refreshPage();
}
@Then("the status remains active after refreshing the page")
public void the_status_remains_active_after_refreshing_the_page() {
manageRolesPage.isRoleActive();
}
@Then("the updated role name description are displayed correctly")
public void the_updated_role_name_description_are_displayed_correctly() {
manageRolesPage.areRoleDetailsDisplayedCorrectly();
}
@Then("the pop-up modal closes after saving")
public void the_pop_up_modal_closes_after_saving() {
manageRolesPage.isModalOpen();
}
}