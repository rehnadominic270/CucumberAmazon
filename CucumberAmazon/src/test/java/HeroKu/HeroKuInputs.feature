Feature: Test HeroKuInputs is accepting inputs

  Scenario Outline: Test HeroKuInputs is accepting inputs
    Given The website HeroKuInputs is available
    When Able to Enter the <inputs> inputs
    Then Verify the results <results>

    Examples: 
      | inputs | results |
      |      1 |       1 |
      |      5 |       5 |
