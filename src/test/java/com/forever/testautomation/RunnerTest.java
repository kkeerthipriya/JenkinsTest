package com.forever.testautomation;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import net.serenitybdd.cucumber.CucumberWithSerenity;

/**
 * Created by Keerthi Parepalli on 6/5/2017.
 */

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "classpath:features/GiftCard.feature")
public class RunnerTest {

}

