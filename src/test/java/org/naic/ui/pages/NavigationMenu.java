package org.naic.ui.pages;

import org.naic.ui.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class NavigationMenu {

    public NavigationMenu() {
        PageFactory.initElements(Driver.getDriver(),
                this);
    }

    @FindBy(linkText = "superMenuLinkPathWillGoHere")
    public WebElement superMenu;




}
