#Feature: Calculate result of operation on numbers
#  I should be able to calculate the given numbers

#  Scenario: Calculate sum of two integer numbers using data tables
#    Given If I have two numbers
#      | 40 | 10 |
#    When I add both the numbers
#    Then I will get sum of these numbers
#
#  Scenario Outline: Calculate sum of two integer numbers using examples
#    Given If I have "<number1>" and "<number2>" numbers
#    When I add both the numbers
#    Then I will get sum of these numbers
#    Examples:
#      | number1 | number2 |
#      | 40      | 10      |
#      | 60      | 40      |
#
#  Scenario: Calculate sum of two integer numbers using simple data driver
#    Given If I have "10" and "20" numbers
#    When I add both the numbers
#    Then I will get sum of these numbers