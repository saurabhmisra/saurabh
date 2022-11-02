package ru.yandex.qatools.htmlelements.testelements;

import org.openqa.selenium.support.FindBy;

import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.Link;

/**
 * @author Alexander Tolmachev starlight@yandex-team.ru
 *         Date: 13.02.13
 * @author Artem Koshelev artkoshelev@yandex-team.ru
 *         Date: 12.10.14
 */
@Name(SearchArrowData.SEARCH_ARROW_NAME)
@FindBy(className = SearchArrowData.SEARCH_ARROW_CLASS)
public class SearchArrowWithRequestSample extends SearchArrow {

    @FindBy(className = SearchArrowData.SEARCH_REQUEST_SAMPLE_CLASS)
    private Link searchRequestSample;

    public Link getSearchRequestSample() {
        return searchRequestSample;
    }
}
