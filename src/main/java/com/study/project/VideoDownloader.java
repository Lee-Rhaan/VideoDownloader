package com.study.project;

import static com.study.project.domain.SaveFromWebDriver.convertAndDownloadVideo;
import static com.study.project.domain.YoutubeWebDriver.retrieveVideoURL;

public class VideoDownloader {

    static {
        //Setting system properties of ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C://chromedriver_win32//chromedriver.exe");
    }

    public static void main(String[] args) {
        String videoURL = retrieveVideoURL(args[0]);
        convertAndDownloadVideo(videoURL);
    }
}
