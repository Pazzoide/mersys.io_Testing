Feature: Subject Categories in Education Settings

  Background:
    Given Navigate to website
    When User sending the keys
      | username | turkeyts       |
      | password | TechnoStudy123 |
    And Click on the element
      | loginButton          |

  Scenario: Adding a Subject Category in Education Settings
    And Click on the element
      | educationButton      |
      | setupButton          |
      | subjectCategoriesBtn |
      | addButton               |
    And User sending the keys
      | nameBox | Sayisal |
      | code | 05      |
    And Click on the element
      | saveBtn |
    And Text verification process
      | successMessage | created |

  Scenario: Editing a Subject Category in Education Settings
    And Click on the element
      | educationButton      |
      | setupButton          |
      | subjectCategoriesBtn |
    And User sending the keys
      | searchName | Sayisal|
    And Click on the element
      | searchButton |
      | editButton   |
    And User sending the keys
      | nameBox      | Sozel |
      | code | 04      |
    And Click on the element
      | saveBtn |
    And Text verification process
      | successMessage | updated |

  Scenario: Deleting a Subject Category in Education Settings
    And Click on the element
      | educationButton      |
      | setupButton          |
      | subjectCategoriesBtn |
    And User sending the keys
      | searchName | Sozel|
    And Click on the element
      | searchButton |
      | deleteIcon   |
      | deleteButton   |
    And Text verification process
      | successMessage | deleted |