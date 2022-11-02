package ru.yandex.qatools.htmlelements.matchers;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.yandex.qatools.htmlelements.matchers.mockfactory.MockFactory;
import ru.yandex.qatools.htmlelements.matchers.testelements.CustomBlock;
import ru.yandex.qatools.htmlelements.matchers.testpages.PageWithCustomBlock;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.not;
import static ru.yandex.qatools.htmlelements.matchers.WebElementMatchers.exists;

/**
 * @author Alexander Tolmachev starlight@yandex-team.ru
 *         Date: 30.09.12
 */
public class DoesElementExistTest {
    private WebDriver driver = MockFactory.mockDriver();

    @Test
    public void doesElementExist() {
        WebElement element = MockFactory.mockLocatableElement(By.className(CustomBlock.CLASS_NAME), driver);
        PageWithCustomBlock page = new PageWithCustomBlock(driver);

        assertThat(element, exists());
        assertThat(page.getBlock(), exists());
    }


    @Test
    public void doesElementNotExist() {
        WebElement element = MockFactory.mockNotLocatableElement(driver);
        PageWithCustomBlock page = new PageWithCustomBlock(driver);

        assertThat(element, not(exists()));
        assertThat(page.getBlock(), not(exists()));
    }
}