package org.naic.ui.pages;

import org.naic.ui.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MainPage extends NavigationMenu {

    public MainPage() {
        PageFactory.initElements(Driver.getDriver(),
                this);
    }


    public int checkLink() {

        int counter = 0;

        List<WebElement> allLinks = Driver.getDriver().findElements(By.linkText(superMenu.toString()));
        for (WebElement link : allLinks) {
            System.out.println(link.getText() + " - " + link.getAttribute("href"));
            counter++;
        }

        return counter;
    }
}