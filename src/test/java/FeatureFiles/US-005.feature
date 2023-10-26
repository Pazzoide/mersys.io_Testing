Feature: Position Transactions in Human Resources

  Background:
    Given Navigate to website
    When User sending the keys
      | username | turkeyts       |
      | password | TechnoStudy123 |
    And Click on the element
      | loginButton       |

  Scenario:Adding a Position to Human Resources
    And Click on the element
      | humanResourcesBtn |
      | setupBtn          |
      | positionsBtn      |
      | addButton            |
    And User sending the keys
      | nameBox      | Computer Teacher |
      | shortNameBox | Comp_T           |
    And Click on the element
      | saveBtn |
    And Text verification process
      | successMessage | created |

  Scenario:Editing a Position in Human Resources
    And Click on the element
      | humanResourcesBtn |
      | setupBtn          |
      | positionsBtn      |
    And User sending the keys
      | searchName | Computer Teacher |
    And Click on the element
      | searchButton |
      | editButton   |
    And User sending the keys
      | nameBox      | Mentoring Teacher |
      | shortNameBox | Mntr_T            |
    And Click on the element
      | saveBtn |
    And Text verification process
      | successMessage | updated |

  Scenario:Deleting a Position in Human Resources
    And Click on the element
      | humanResourcesBtn |
      | setupBtn          |
      | positionsBtn      |
    And User sending the keys
      | searchName | Mentoring Teacher |
    And Click on the element
      | searchButton |
      | deleteIcon   |
      | deleteButton   |
    And Text verification process
      | successMessage | deleted |