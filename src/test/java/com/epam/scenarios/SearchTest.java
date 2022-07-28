package com.epam.scenarios;

import com.epam.pages.GoogleResultsPage;
import com.epam.pages.GoogleSearchPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SearchTest extends BaseTest {

    private GoogleSearchPage googleSearchPage;
    private GoogleResultsPage googleResultsPage;

    @BeforeEach
    public void setPages() {
        System.out.println("Execute pages setting");
        googleSearchPage = new GoogleSearchPage(getDriver());
        googleResultsPage = new GoogleResultsPage(getDriver());
    }


    @Test
    public void searchQueryTest () {
//        googleSearchPage.navigateTo();
//        googleSearchPage.search("Selenium");
//        googleResultsPage.assertSearchResults("Selenium");
    }
 }
