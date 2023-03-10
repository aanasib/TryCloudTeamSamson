package com.tryCloud.pages;
import com.tryCloud.utilities.BrowserUtils;
import com.tryCloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class DashboardPage {

    public DashboardPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='logo logo-icon']")
    public WebElement tryCloudIcon;

    @FindBy(xpath = "/html/body/header/div[1]/ul/li[1]/a")
    public WebElement dashboard;

    @FindBy(xpath = "/html/body/header/div[1]/ul/li[2]/a")
    public WebElement files;

    @FindBy(xpath = "/html/body/header/div[1]/ul/li[3]/a")
    public WebElement photos;

    @FindBy(xpath = "/html/body/header/div[1]/ul/li[4]/a")
    public WebElement Activity;

    @FindBy(xpath = "/html/body/header/div[1]/ul/li[5]/a")
    public WebElement Talk;

    @FindBy(xpath = "/html/body/header/div[1]/ul/li[6]/a")
    public WebElement Contacts;

    @FindBy(xpath = "/html/body/header/div[1]/ul/li[7]/a")
    public WebElement circles;

    @FindBy(xpath = "/html/body/header/div[1]/ul/li[8]/a")
    public WebElement calendar;

    @FindBy(xpath = "/html/body/header/div[1]/ul/li[9]/a")
    public WebElement deck;

    @FindBy(xpath = "//div[@class='header-menu unified-search']")
    public WebElement searchBar;

    @FindBy(xpath = "//div[@aria-label='Notifications']")
    public WebElement notificationIcon;

    @FindBy(xpath = "//div[@class='icon-contacts menutoggle']")
    public WebElement Connections;

    @FindBy(xpath = "//*[@id='expand']")
    public WebElement Groups;





    /**
     * This method will navigate user to the specific module in tryCloud application.
     * For example: if tab is equals to Activity, and module equals to Contacts,
     * Then method will navigate user to this page: http://qa2.trycloud.net/index.php/login?clear=1
     *
     * @param tab
     * @param module
     */
    public void navigateToModule(String tab, String module) {
        String tabLocator = "//span[normalize-space()='" + tab + "' and contains(@class, 'title title-level-1')]";
        String moduleLocator = "//span[normalize-space()='" + module + "' and contains(@class, 'title title-level-2')]";
        try {
            BrowserUtils.waitForClickablility(By.xpath(tabLocator), 5);
            WebElement tabElement = Driver.getDriver().findElement(By.xpath(tabLocator));
            new Actions(Driver.getDriver()).moveToElement(tabElement).pause(200).doubleClick(tabElement).build().perform();
        } catch (Exception e) {
            BrowserUtils.clickWithWait(By.xpath(tabLocator), 5);
        }
        try {
            BrowserUtils.waitForPresenceOfElement(By.xpath(moduleLocator), 5);
            BrowserUtils.waitForVisibility(By.xpath(moduleLocator), 5);
            BrowserUtils.scrollToElement(Driver.getDriver().findElement(By.xpath(moduleLocator)));
            Driver.getDriver().findElement(By.xpath(moduleLocator)).click();
        } catch (Exception e) {
//            BrowserUtils.waitForStaleElement(Driver.get().findElement(By.xpath(moduleLocator)));
            BrowserUtils.clickWithTimeOut(Driver.getDriver().findElement(By.xpath(moduleLocator)),  5);
        }
    }

}

