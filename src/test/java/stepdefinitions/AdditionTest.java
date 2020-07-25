package stepdefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

public class AdditionTest {
    int num1, num2, sum;

    @Given("If I have \"(.*)\" and \"(.*)\" numbers")
    public void if_i_have_two_integer_numbers(int number1, int number2) {
        num1 = number1;
        num2 = number2;
    }

    @Given("If I have two numbers")
    public void if_i_have_two_numbers(DataTable numbers) {
        List<List<String>> dataValue = numbers.raw();
        String no1 = String.valueOf(dataValue.get(0).get(0));
        String no2 = String.valueOf(dataValue.get(0).get(1));
        num1 = Integer.valueOf(no1);
        num2 = Integer.valueOf(no2);
    }

    @When("I add both the numbers")
    public void i_add_both_the_numbers() {
        sum = num1 + num2;
    }

    @Then("I will get sum of these numbers")
    public void i_will_get_sum_of_these_numbers() {
        System.out.println("Sum of two numbers is = " + sum);
    }

}
