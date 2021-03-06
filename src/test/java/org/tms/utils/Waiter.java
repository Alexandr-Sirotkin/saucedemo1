package org.tms.utils;

import java.time.Duration;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;
import org.tms.driver.DriverSingleton;

public class Waiter {

  private final static int WAIT_TIMEOUT_SECONDS = 5;
  private final static int TIMEOUT_SECONDS = 500;

  private Waiter() {
  }

  public static void waitForElementToBeClickable(WebElement element) {
    new FluentWait<>(DriverSingleton.getInstance().getDriver()).withTimeout(Duration.ofSeconds(WAIT_TIMEOUT_SECONDS))
        .pollingEvery(Duration.ofMillis(TIMEOUT_SECONDS)).ignoring(NoSuchElementException.class)
        .until((ExpectedCondition<Boolean>) webDriver -> element.isDisplayed() && element
            .isEnabled());
  }
}
