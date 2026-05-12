
Feature: ManageRolesInUserManagement @feature_manage_roles

  Background: 
    Given the user is in the User Management module

  @roles_list_verification
  Scenario Outline: Manage Roles in User Management Module
    When the user clicks on the Roles tab
    Then the roles list is displayed without errors
    And each role shows the correct Role Name, Type, and Status
    And the list is scrollable if necessary

  Examples:
    | Role Name      | Type        | Status   |
    | Admin          | Full Access | Active   |
    | User           | Limited     | Active   |
    | Guest          | Read Only   | Inactive |

  @role_search
  Scenario Outline: Admin Searches for a Specific Role
    Given the admin enters <role_name> in the search bar
    And the admin clicks the search button
    Then the roles list updates to show only matching roles
    And the correct roles based on the search criteria are displayed
    And an appropriate message is shown if no roles match the search

    Examples:
      | role_name |
      | Admin     |

@valid-role-creation
Scenario Outline: Manage Roles in User Management Module
  When the admin clicks on the Create button
  And in the pop-up modal, enters <role_name> as the Role Name
  And enters <description> as the Description
  And clicks the Create button
  Then the pop-up modal should close after creation
  And the new role should appear in the roles list
  And the new role should display the correct Role Name as <role_name> and Status as Active

  Examples:
    | role_name | description                                      |
    | Admin     | This role is for managing user permissions and access. |

  @valid_role_creation
  Scenario Outline: Manage Roles in User Management Module
    When the admin clicks on the Create button
    And the admin enters <role_name> as the Role Name
    And the admin leaves the Description field empty
    And the admin clicks the Create button
    Then the pop-up modal should close after creation
    And the new role should appear in the roles list
    And the new role should display the correct Role Name as <role_name> and Status as Active

    Examples:
      | role_name |
      | Admin     |

  @update-role
  Scenario Outline: Admin can successfully update the details of an existing role
    When the admin clicks on the Roles tab
    And the admin clicks the edit icon for an existing role
    And the admin modifies the Role Name and/or Description in the pop-up modal
    And the admin clicks the Save button
    Then the pop-up modal closes after saving
    And the updated role details are reflected in the roles list
    And the updated Role Name and Description are displayed correctly

  Examples:
    | Role Name       | Description          |
    | New Role Name   | New Role Description  |

  @activate_inactive_role
  Scenario Outline: Manage Roles in User Management Module
    When the admin clicks on the Roles tab
    And the admin identifies an inactive role in the list
    And the admin clicks the toggle button to activate the role
    Then the role status changes to Active immediately upon toggle
    And the updated status is visible in the roles list
    And the admin refreshes the page
    Then the status remains Active after refreshing the page

  Examples:
    | username | password |
    | admin    | admin123 |

  @deactivate_active_role
  Scenario Outline: Verify that the admin can successfully deactivate an active role
    When the admin clicks on the Roles tab
    And the admin identifies an active role in the list
    And the admin clicks the toggle button to deactivate the role
    Then the role status changes to Inactive immediately upon toggle
    And the updated status is visible in the roles list
    And the admin refreshes the page
    Then the status remains Inactive after refreshing the page

  Examples:
    | role_status |
    | Active      |

  @cancel_role_creation
  Scenario Outline: Verify that the admin can cancel the role creation process without saving any data
    When the admin clicks on the Create button
    And the admin enters a valid Role Name as <role_name>
    And the admin clicks the Cancel button
    Then the pop-up modal should close without saving data
    And the roles list should remain unchanged

    Examples:
      | role_name     |
      | Admin Role    |

  @verify_role_actions
  Scenario Outline: Manage Roles in User Management Module
    When the user navigates to the User Management module
    And the user clicks on the Roles tab
    And the user observes the roles list
    Then each role should have an Edit icon available
    And each role should have a toggle button for status
    And the Create button should be visible and functional

  Examples:
    | username | password |
    | user1    | pass1    |

  @toggle-role-status
  Scenario Outline: Manage Roles in User Management Module
    When the user clicks on the Roles tab
    And the user identifies an active role in the list
    And the user clicks the toggle button to deactivate the role
    Then the role status should change to Inactive
    And the user clicks the toggle button again to activate the role
    Then the role status should change back to Active
    And the updated status should be visible in the roles list after each toggle

  Examples:
    | role_status |
    | Active      |

  @create_role
  Scenario Outline: Manage Roles in User Management Module
    When the admin clicks on the Create button
    And the admin enters a valid Role Name <role_name>
    And the admin enters a valid Description <description>
    And the admin clicks the Create button
    Then the pop-up modal should close after creation
    And the new role should appear in the roles list
    And the new role should display the correct Role Name <role_name>, Description <description>, and Status as Active

    Examples:
      | role_name | description                                                  |
      | Admin     | This role allows the admin to manage users and permissions. |

  @roles-pagination
  Scenario Outline: Manage Roles in User Management Module
    When the user clicks on the Roles tab
    And the user observes the roles list
    Then the roles list displays pagination controls
    When the user clicks the Next button
    Then the next set of roles is displayed
    When the user clicks the Previous button
    Then the previous set of roles is displayed

  Examples:
    | username | password |
    | user1    | pass1    |
