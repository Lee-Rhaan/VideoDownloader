package com.study.project.domain;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static com.study.project.impl.DownloadVideoImpl.*;
import static com.study.project.util.ApplicationConstants.*;

/**
 * This class contains the web driver logic specifically designed for the SaveFrom site.
 */

public class SaveFromWebDriver {

    /**
     * Using the YouTube video url as a reference to search, convert and download specific video.
     *
     * @param youtubeVideoURL used as a reference to search, convert and download video
     */
    public static void convertAndDownloadVideo(String youtubeVideoURL) {
        WebDriver webDriver = configureWebDriver(new ChromeDriver(), 90L, 100L);
        setupSearchQuery(webDriver, SAVEFROM_URL, SAVEFROM_SEARCH_BOX_NAME, youtubeVideoURL);

        if (executeSearch(webDriver, SAVEFROM_CONVERT_BUTTON_ID)) {
            retrieveResponse(webDriver, SAVEFROM_DOWNLOAD_BUTTON_CLASS_NAME);
        }

        closeCurrentPage(webDriver);
    }
}
