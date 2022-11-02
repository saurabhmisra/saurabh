package ru.yandex.qatools.htmlelements.matchers.common;

import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.openqa.selenium.WebElement;

/**
 * Checks if element is enabled or not.
 *
 * @author Alexander Tolmachev starlight@yandex-team.ru
 *         Date: 24.09.12
 */
public class IsElementEnabledMatcher extends TypeSafeMatcher<WebElement> {
    @Override
    protected boolean matchesSafely(WebElement element) {
        return element.isEnabled();
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("element is enabled");
    }

    @Override
    public void describeMismatchSafely(WebElement element, Description mismatchDescription) {
        mismatchDescription.appendText("element ").appendValue(element).appendText(" is not enabled");
    }

    /**
     * Creates matcher that checks if element is currently enabled.
     */
    @Factory
    public static Matcher<WebElement> isEnabled() {
        return new IsElementEnabledMatcher();
    }
}
