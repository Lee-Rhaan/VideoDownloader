package com.study.project.impl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.util.StringUtils;

import java.util.concurrent.TimeUnit;

/**
 * This class contains all the necessary web driver logic in order to control the YouTube or SaveFrom site.
 */

public class DownloadVideoImpl {

    /**
     * Configures current domain
     *
     * @param webDriver used for automating browsers (In this case Chrome)
     * @param pageLoadTimeout the amount of time to wait for a page load to complete before throwing an error
     * @param implicitlyWait the amount of time the driver should wait when searching for a web element if it is not
     *                       immediately present
     * @return new Chrome web driver
     */
    public static WebDriver configureWebDriver(WebDriver webDriver, Long pageLoadTimeout,
                                               Long implicitlyWait) {
        webDriver.manage().window().maximize();
        webDriver.manage().deleteAllCookies();
        webDriver.manage().timeouts().pageLoadTimeout(pageLoadTimeout, TimeUnit.SECONDS);
        webDriver.manage().timeouts().implicitlyWait(implicitlyWait, TimeUnit.SECONDS);
        return webDriver;
    }

    /**
     * Opens the domain and types the required value into the search box.
     *
     * @param webDriver used for automating browsers (In this case Chrome)
     * @param url the domain to open
     * @param searchBoxName the "name" attribute of the domains search box
     * @param searchBoxValue character sequence to send to the domains search box
     */
    public static void setupSearchQuery(WebDriver webDriver, String url, String searchBoxName, String searchBoxValue) {
        webDriver.get(url);
        webDriver.findElement(By.name(searchBoxName)).sendKeys(searchBoxValue);
    }

    /**
     * Clicks the search button to execute the search. Then checks if the results of the search has been displayed.
     *
     * @param webDriver used for automating browsers (In this case Chrome)
     * @param searchButtonId the "id" attribute of the domains search button
     * @return true or false depending on if the results of the search has been displayed.
     */
    public static boolean executeSearch(WebDriver webDriver, String searchButtonId) {
        WebElement searchButton = webDriver.findElement(By.id(searchButtonId));
        searchButton.click();
        return searchButton.isDisplayed();
    }

    /**
     * Clicks video or downloads the video depending on the current domain.
     *
     * @param webDriver used for automating browsers (In this case Chrome)
     * @param buttonClassName the "className" attribute of the YouTube video or SaveFrom video download button
     */
    public static void retrieveResponse(WebDriver webDriver, String buttonClassName) {
        WebElement videoButton = webDriver.findElement(By.className(buttonClassName));
        videoButton.click();
    }

    /**
     * Close the current window. Quiting the browser if it's the last window currently open.
     *
     * @param webDriver used for automating browsers (In this case Chrome)
     */
    public static void closeCurrentPage(WebDriver webDriver) {
        webDriver.close();
    }

    /**
     * Removes underscores from video name
     *
     * @param videoName YouTube video name
     * @return video name with spaces instead of underscores
     */
    public static String cleanVideoName(String videoName) {
        if (StringUtils.isEmpty(videoName) || "null".equalsIgnoreCase(videoName)) {
            System.err.println("Video Name cannot be empty");
            return videoName;
        }

        videoName = videoName.replaceAll("_", " ");
        return videoName;
    }

}
