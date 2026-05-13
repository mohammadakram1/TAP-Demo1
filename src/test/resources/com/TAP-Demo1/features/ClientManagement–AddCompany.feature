
Feature: ClientManagement–AddCompany
  @feature_client_management
  Background: 
    Given the user is logged in to the application with valid credentials

  @navigate_to_client_management
  Scenario Outline: Client Management – Add Company, Configure Basic Information & Manage Contacts
    When the user locates the application menu
    And the user clicks on the "Client Management" option
    Then the user is redirected to the Client Management module
    And the Client Management dashboard is displayed with all relevant options

  Examples:
    | username | password |
    | <username> | <password> |

  @add-company
  Scenario Outline: Client Management – Add Company
    When the user clicks on the "Add Company" button
    And the user enters a valid Company Name <company_name>
    And the user clicks on the "Save" button
    Then a success message should be displayed indicating the company was created successfully
    And the new company should appear in the company list/search results

    Examples:
      | company_name            |
      | Tech Innovations Inc.   |

@search_company
Scenario Outline: Client Management – Add Company, Configure Basic Information & Manage Contacts
  When I enter <company_name> in the search bar
  And I click on the search button
  Then matching companies should be displayed based on the entered keyword
  And the user can select a company from the search results

  Examples:
    | company_name |
    | TechCorp     |

  @view_basic_information
  Scenario Outline: Client Management – Add Company, Configure Basic Information & Manage Contacts
    When the user clicks on a company from the company list
    And the user clicks on the Basic Information tab
    Then the Basic Information section is displayed for the selected company
    And all relevant fields for Basic Information are visible and editable

    Examples:
      | company_name |
      | Company A    |
      | Company B    |

@add-region
Scenario Outline: Client Management – Add Company, Configure Basic Information & Manage Contacts
  When I click on the Add Region button
  And I enter valid Region details <region_name>
  And I click on the Save button
  Then a success message is displayed indicating the Region was added successfully
  And the added Region appears in the Region list/dropdown

Examples:
  | region_name      |
  | North America    |

  @add-basin
  Scenario Outline: Client Management – Add Company, Configure Basic Information & Manage Contacts
    When the user selects the existing Region from the dropdown
    And the user clicks on the Add Basin button
    And the user enters valid Basin details
    And the user clicks on the Save button
    Then a success message is displayed indicating the Basin was added successfully
    And the added Basin appears in the Basin list/dropdown

  Examples:
    | region         | basin_details       |
    | <existing_region> | <valid_basin_details> |

  @add-district
  Scenario Outline: Client Management – Add Company, Configure Basic Information & Manage Contacts
    When the user selects the existing Basin from the dropdown
    And the user clicks on the Add District button
    And the user enters valid District details
    And the user clicks on the Save button
    Then a success message is displayed indicating the District was added successfully
    And the added District appears in the District list

  Examples:
    | District details       |
    | Valid District Name    |

@valid_formation_addition
Scenario Outline: Client Management – Add Company, Configure Basic Information & Manage Contacts
  When the user clicks on the "Add Formation" button
  And the user enters valid Formation details with Formation Name "<formation_name>", Formation Description "<formation_description>", Formation Date "<formation_date>", Formation Type "<formation_type>", Formation Duration "<formation_duration>"
  And the user clicks on the "Save" button
  Then a success message is displayed indicating the Formation was added successfully
  And the added Formation appears in the Formation list

Examples:
  | formation_name     | formation_description     | formation_date | formation_type | formation_duration |
  | Sample Formation 1 | Description for Sample 1  | 2023-01-01     | Type A         | 6 months          |
  | Sample Formation 2 | Description for Sample 2  | 2023-02-01     | Type B         | 12 months         |

@valid-basic-info
Scenario Outline: Client Management – Add Company, Configure Basic Information & Manage Contacts
  Given the user fills in the Region with <region>
  And the user fills in the Basin with <basin>
  And the user fills in the District with <district>
  And the user fills in the Formation with <formation>
  When the user clicks the "Save" button
  Then a success message is displayed indicating all Basic Information was saved successfully
  And all details are retained and displayed correctly in the Basic Information section

  Examples:
    | region          | basin                | district            | formation        |
    | North America   | Appalachian Basin    | Washington County   | Marcellus Shale  |

@navigate_to_contacts
Scenario Outline: Client Management – Add Company, Configure Basic Information & Manage Contacts
  When the user clicks on the “Contacts” tab
  Then the Contacts section is displayed for the selected company
  And all existing contacts for the company are listed

Examples:
  | company_name |
  | <company_name> |

@add_contact_success
Scenario Outline: Client Management – Add Company, Configure Basic Information & Manage Contacts
  When the user clicks on the "Add New Contact" button
  And the user fills in all mandatory fields:
    | First Name | Last Name | Email                  | Company           |
    | <first_name> | <last_name> | <email>              | <company>        |
  And the user clicks on the "Save" button
  Then a success message is displayed indicating the contact was created successfully
  And the new contact appears in the Contacts list

Examples:
  | first_name | last_name | email                  | company           |
  | John       | Doe       | john.doe@example.com   | Example Company   |

@verify_contact_displayed
Scenario Outline: Client Management – Add Company, Configure Basic Information & Manage Contacts
  Given the user is in the Contacts section
  When the user searches for the newly created contact by name or email
  Then the newly created contact should be displayed in the Contacts list
  And the contact details (Name, Email, Company, Phone Number, Status) should be visible and correct

Examples:
  | name          | email               | company       | phone number | status   |
  | John Doe     | john.doe@example.com| Example Inc.  | 123-456-7890 | Active   |

@search_contact
Scenario Outline: Client Management – Add Company, Configure Basic Information & Manage Contacts
  Given the user is on the Client Management Page
  When the user enters <keyword> in the search bar for contacts
  And the user clicks on the search button
  Then matching contacts should be displayed based on the entered keyword
  And the user can select a contact from the search results

  Examples:
    | keyword   |
    | John Doe  |

  @feature_client_management
  @update-contact
  Scenario Outline: Client Management – Add Company, Configure Basic Information & Manage Contacts
    Given the user selects an existing contact
    When the user toggles the Proposal Approval checkbox
    And the user changes the Status from Active to Inactive
    And the user clicks the Save button
    Then a success message is displayed indicating the contact was updated successfully
    And the contact's Proposal Approval and Status are updated correctly in the Contacts list

  Examples:
    | contact_name |
    | Existing Contact 1 |

  @feature_client_management
  @logout-success
  Scenario Outline: Client Management – Add Company, Configure Basic Information & Manage Contacts
    When the user clicks on the user profile icon
    And the user selects the "Logout" option
    Then the user should be redirected to the login page
    And a message should be displayed indicating successful logout

  Examples:
    | action                |
    | Click on the user profile icon |
    | Select the "Logout" option      |
