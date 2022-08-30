package com.study.project.domain;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.study.project.impl.DownloadVideoImpl.*;
import static com.study.project.util.ApplicationConstants.*;

/**
 * This class contains the web driver logic specifically designed for the YouTube site.
 */

public class YoutubeWebDriver {

    private static String youtubeVideoURL;

    /**
     * Search and select YouTube video in order to retrieve a copy of the video url.
     *
     * @param videoName YouTube video to search and open
     * @return youtube video url
     */
    public static String retrieveVideoURL(String videoName) {
        WebDriver webDriver = configureWebDriver(new ChromeDriver(), 60L, 70L);
        setupSearchQuery(webDriver, YOUTUBE_URL, YOUTUBE_SEARCH_BOX_NAME, cleanVideoName(videoName));

        if (executeSearch(webDriver, YOUTUBE_SEARCH_BUTTON_ID)) {
            retrieveResponse(webDriver, YOUTUBE_VIDEO_CLASS_NAME);
            youtubeVideoURL = webDriver.getCurrentUrl();
        }

        closeCurrentPage(webDriver);
        return youtubeVideoURL;
    }
}
