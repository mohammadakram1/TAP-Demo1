package com.TAP-Demo1.stepdefinitions;

import com..utils.ElementUtils;
import org.junit.Assert;
import com..driverfactory.DriverFactory;
import com.TAP-Demo1.pages.ClientManagementAddCompanyPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class ClientManagementAddCompany extends DriverFactory {
ClientManagementAddCompanyPage clientManagementPage = new ClientManagementAddCompanyPage(driver);
@Given("the user is logged in to the application with valid credentials")
public void the_user_is_logged_in_to_the_application_with_valid_credentials() {
clientManagementPage.loginWithValidCredentials();
}
@When("the user locates the application menu")
public void the_user_locates_the_application_menu() {
clientManagementPage.locateApplicationMenu();
}
@When("the user clicks on the {string} option")
public void the_user_clicks_on_the_option(String option) {
clientManagementPage.clicksOnOption(option);
}
@Then("the user is redirected to the Client Management module")
public void the_user_is_redirected_to_the_Client_Management_module() {
clientManagementPage.isRedirectedToClientManagementModule();
}
@Then("the Client Management dashboard is displayed with all relevant options")
public void the_Client_Management_dashboard_is_displayed_with_all_relevant_options() {
clientManagementPage.isDashboardDisplayed();
}
@When("the user clicks on the {string} button")
public void the_user_clicks_on_the_button(String button) {
clientManagementPage.clicksOnButton(button);
}
@When("the user enters a valid Company Name {string}")
public void the_user_enters_a_valid_Company_Name(String companyName) {
clientManagementPage.enterCompanyName(companyName);
}
@Then("a success message should be displayed indicating the company was created successfully")
public void a_success_message_should_be_displayed_indicating_the_company_was_created_successfully() {
clientManagementPage.isSuccessMessageDisplayed();
}
@Then("the new company should appear in the company list/search results")
public void the_new_company_should_appear_in_the_company_list_search_results() {
clientManagementPage.isCompanyInList();
}
@When("I enter {string} in the search bar")
public void i_enter_in_the_search_bar(String companyName) {
clientManagementPage.enterInSearchBar(companyName);
}
@Then("matching companies should be displayed based on the entered keyword")
public void matching_companies_should_be_displayed_based_on_the_entered_keyword() {
clientManagementPage.areMatchingCompaniesDisplayed();
}
@When("the user clicks on a company from the company list")
public void the_user_clicks_on_a_company_from_the_company_list() {
clientManagementPage.clicksOnCompanyFromList();
}
@When("the user clicks on the Basic Information tab")
public void the_user_clicks_on_the_Basic_Information_tab() {
clientManagementPage.clicksOnBasicInformationTab();
}
@Then("the Basic Information section is displayed for the selected company")
public void the_Basic_Information_section_is_displayed_for_the_selected_company() {
clientManagementPage.isBasicInformationSectionDisplayed();
}
@Then("all relevant fields for Basic Information are visible and editable")
public void all_relevant_fields_for_Basic_Information_are_visible_and_editable() {
clientManagementPage.areBasicInformationFieldsEditable();
}
@When("I click on the Add Region button")
public void i_click_on_the_Add_Region_button() {
clientManagementPage.clicksOnAddRegionButton();
}
@When("I enter valid Region details {string}")
public void i_enter_valid_Region_details(String regionName) {
clientManagementPage.enterRegionDetails(regionName);
}
@Then("a success message is displayed indicating the Region was added successfully")
public void a_success_message_is_displayed_indicating_the_Region_was_added_successfully() {
clientManagementPage.isRegionSuccessMessageDisplayed();
}
@Then("the added Region appears in the Region list/dropdown")
public void the_added_Region_appears_in_the_Region_list_dropdown() {
clientManagementPage.isRegionInList();
}
@When("the user selects the existing Region from the dropdown")
public void the_user_selects_the_existing_Region_from_the_dropdown() {
clientManagementPage.selectExistingRegion();
}
@When("the user clicks on the Add Basin button")
public void the_user_clicks_on_the_Add_Basin_button() {
clientManagementPage.clicksOnAddBasinButton();
}
@When("the user enters valid Basin details")
public void the_user_enters_valid_Basin_details() {
clientManagementPage.enterBasinDetails();
}
@Then("a success message is displayed indicating the Basin was added successfully")
public void a_success_message_is_displayed_indicating_the_Basin_was_added_successfully() {
clientManagementPage.isBasinSuccessMessageDisplayed();
}
@Then("the added Basin appears in the Basin list/dropdown")
public void the_added_Basin_appears_in_the_Basin_list_dropdown() {
clientManagementPage.isBasinInList();
}
@When("the user selects the existing Basin from the dropdown")
public void the_user_selects_the_existing_Basin_from_the_dropdown() {
clientManagementPage.selectExistingBasin();
}
@When("the user clicks on the Add District button")
public void the_user_clicks_on_the_Add_District_button() {
clientManagementPage.clicksOnAddDistrictButton();
}
@When("the user enters valid District details")
public void the_user_enters_valid_District_details() {
clientManagementPage.enterDistrictDetails();
}
@Then("a success message is displayed indicating the District was added successfully")
public void a_success_message_is_displayed_indicating_the_District_was_added_successfully() {
clientManagementPage.isDistrictSuccessMessageDisplayed();
}
@Then("the added District appears in the District list")
public void the_added_District_appears_in_the_District_list() {
clientManagementPage.isDistrictInList();
}
@When("the user clicks on the Add Formation button")
public void the_user_clicks_on_the_Add_Formation_button() {
clientManagementPage.clicksOnAddFormationButton();
}
@When("the user enters valid Formation details with Formation Name {string}, Formation Description {string}, Formation Date {string}, Formation Type {string}, Formation Duration {string}")
public void the_user_enters_valid_Formation_details(String formationName, String formationDescription, String formationDate, String formationType, String formationDuration) {
clientManagementPage.enterFormationDetails(formationName, formationDescription, formationDate, formationType, formationDuration);
}
@Then("a success message is displayed indicating the Formation was added successfully")
public void a_success_message_is_displayed_indicating_the_Formation_was_added_successfully() {
clientManagementPage.isFormationSuccessMessageDisplayed();
}
@Then("the added Formation appears in the Formation list")
public void the_added_Formation_appears_in_the_Formation_list() {
clientManagementPage.isFormationInList();
}
@Given("the user fills in the Region with {string}")
public void the_user_fills_in_the_Region_with(String region) {
clientManagementPage.fillInRegion(region);
}
@Given("the user fills in the Basin with {string}")
public void the_user_fills_in_the_Basin_with(String basin) {
clientManagementPage.fillInBasin(basin);
}
@Given("the user fills in the District with {string}")
public void the_user_fills_in_the_District_with(String district) {
clientManagementPage.fillInDistrict(district);
}
@Given("the user fills in the Formation with {string}")
public void the_user_fills_in_the_Formation_with(String formation) {
clientManagementPage.fillInFormation(formation);
}
@When("the user clicks the Save button")
public void the_user_clicks_the_Save_button() {
clientManagementPage.clicksOnSaveButton();
}
@Then("a success message is displayed indicating all Basic Information was saved successfully")
public void a_success_message_is_displayed_indicating_all_Basic_Information_was_saved_successfully() {
clientManagementPage.isBasicInfoSuccessMessageDisplayed();
}
@Then("all details are retained and displayed correctly in the Basic Information section")
public void all_details_are_retained_and_displayed_correctly_in_the_Basic_Information_section() {
clientManagementPage.areBasicInfoDetailsCorrect();
}
@When("the user clicks on the Contacts tab")
public void the_user_clicks_on_the_Contacts_tab() {
clientManagementPage.clicksOnContactsTab();
}
@Then("the Contacts section is displayed for the selected company")
public void the_Contacts_section_is_displayed_for_the_selected_company() {
clientManagementPage.isContactsSectionDisplayed();
}
@Then("all existing contacts for the company are listed")
public void all_existing_contacts_for_the_company_are_listed() {
clientManagementPage.areContactsListed();
}
@When("the user clicks on the Add New Contact button")
public void the_user_clicks_on_the_Add_New_Contact_button() {
clientManagementPage.clicksOnAddNewContactButton();
}
@When("the user fills in all mandatory fields:")
public void the_user_fills_in_all_mandatory_fields(io.cucumber.datatable.DataTable dataTable) {
clientManagementPage.fillInMandatoryFields(dataTable);
}
@Then("a success message is displayed indicating the contact was created successfully")
public void a_success_message_is_displayed_indicating_the_contact_was_created_successfully() {
clientManagementPage.isContactSuccessMessageDisplayed();
}
@Then("the new contact appears in the Contacts list")
public void the_new_contact_appears_in_the_Contacts_list() {
clientManagementPage.isContactInList();
}
@Given("the user is in the Contacts section")
public void the_user_is_in_the_Contacts_section() {
clientManagementPage.navigateToContactsSection();
}
@When("the user searches for the newly created contact by name or email")
public void the_user_searches_for_the_newly_created_contact_by_name_or_email() {
clientManagementPage.searchForContact();
}
@Then("the newly created contact should be displayed in the Contacts list")
public void the_newly_created_contact_should_be_displayed_in_the_Contacts_list() {
clientManagementPage.isNewContactDisplayed();
}
@Then("the contact details (Name, Email, Company, Phone Number, Status) should be visible and correct")
public void the_contact_details_should_be_visible_and_correct() {
clientManagementPage.areContactDetailsCorrect();
}
@Given("the user is on the Client Management Page")
public void the_user_is_on_the_Client_Management_Page() {
clientManagementPage.navigateToClientManagementPage();
}
@When("the user enters {string} in the search bar for contacts")
public void the_user_enters_in_the_search_bar_for_contacts(String keyword) {
clientManagementPage.enterInContactSearchBar(keyword);
}
@Then("matching contacts should be displayed based on the entered keyword")
public void matching_contacts_should_be_displayed_based_on_the_entered_keyword() {
clientManagementPage.areMatchingContactsDisplayed();
}
@When("the user selects an existing contact")
public void the_user_selects_an_existing_contact() {
clientManagementPage.selectExistingContact();
}
@When("the user toggles the Proposal Approval checkbox")
public void the_user_toggles_the_Proposal_Approval_checkbox() {
clientManagementPage.toggleProposalApprovalCheckbox();
}
@When("the user changes the Status from Active to Inactive")
public void the_user_changes_the_Status_from_Active_to_Inactive() {
clientManagementPage.changeContactStatus();
}
@Then("a success message is displayed indicating the contact was updated successfully")
public void a_success_message_is_displayed_indicating_the_contact_was_updated_successfully() {
clientManagementPage.isContactUpdateSuccessMessageDisplayed();
}
@Then("the contact's Proposal Approval and Status are updated correctly in the Contacts list")
public void the_contact_s_Proposal_Approval_and_Status_are_updated_correctly_in_the_Contacts_list() {
clientManagementPage.isContactUpdatedInList();
}
@When("the user clicks on the user profile icon")
public void the_user_clicks_on_the_user_profile_icon() {
clientManagementPage.clicksOnUserProfileIcon();
}
@When("the user selects the {string} option")
public void the_user_selects_the_option(String option) {
clientManagementPage.selectLogoutOption(option);
}
@Then("the user should be redirected to the login page")
public void the_user_should_be_redirected_to_the_login_page() {
clientManagementPage.isRedirectedToLoginPage();
}
@Then("a message should be displayed indicating successful logout")
public void a_message_should_be_displayed_indicating_successful_logout() {
clientManagementPage.isLogoutMessageDisplayed();
}

@Given("the user clicks on the add company button")
public void the_user_clicks_on_the_add_company_button() {
clientManagementAddCompanyPage.clickAddCompanyButton();
}
@Given("the user clicks on the contacts tab")
public void the_user_clicks_on_the_contacts_tab() {
clientManagementAddCompanyPage.clickContactsTab();
}
@When("the user can select a company from the search results")
public void the_user_can_select_a_company_from_the_search_results() {
clientManagementAddCompanyPage.selectCompanyFromSearchResults();
}
@When("the user selects the logout option")
public void the_user_selects_the_logout_option() {
clientManagementAddCompanyPage.selectLogoutOption();
}
@When("the user clicks on the search button")
public void the_user_clicks_on_the_search_button() {
clientManagementAddCompanyPage.clickSearchButton();
}
@When("the user clicks on the save button")
public void the_user_clicks_on_the_save_button() {
clientManagementAddCompanyPage.clickSaveButton();
}
@When("the user can select a contact from the search results")
public void the_user_can_select_a_contact_from_the_search_results() {
clientManagementAddCompanyPage.selectContactFromSearchResults();
}
@Given("the user clicks on the client management option")
public void the_user_clicks_on_the_client_management_option() {
clientManagementAddCompanyPage.clickClientManagementOption();
}
}