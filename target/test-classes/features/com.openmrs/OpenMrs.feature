Feature: Open MRS tests

  @openMRS
  Scenario: Register a patient
    Given the user logs in to OpenMRS with following credentials
      | username | admin    |
      | password | Admin123 |
    When the user registers a new patient with following information:
      | GivenName    | birsen           |
      | FamilyName   | duman            |
      | Gender       | Female           |
      | Day          | 13               |
      | Month        | August           |
      | Year         | 1991             |
      | Address      | 2200 E Devon ave |
      | PhoneNumber  | 3147148390       |
      | RelationType | Doctor           |
      | RelativeName | Patel            |
    Then the user validate the patient name and familyName
      | GivenName  | birsen |
      | FamilyName | duman  |

