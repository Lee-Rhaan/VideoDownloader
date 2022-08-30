## VideoDownloader
|Java|Maven|Selenium|Batch Scripting|
|---|---|---|---|
---
Instead of the time consuming task of having to go to Youtube to search for a video and then copy the video url + Then go to google to search for a youtube video downloader and paste the link in order to download a specific video...

Now you can leave all that up to your pc.

All you have to do is just to provide the video name, and this program will take care of the rest for you.

---

## Overview:

- This is a Selenium based Automation program.
- This program takes a video name as input.
- It then opens the YouTube domain and retrieves the specified video.
- Copies the video url.
- Opens the SaveFrom site, search, convert and downloads the specified YouTube video.

---

## Additional Information:

### ChromeDriver

- Contained in this repo along with the code, you'll find a zip folder containing the chromedriver.
- Extract it somewhere on your pc.
- Then go to the main class of this program, and point the location of the web driver system property to where the chromedriver is extracted/located on your pc.

### Video Downloader JAR

- Contained in the target folder in this projects repo, you'll find an already packaged JAR file.
- Remove it and rebuild the project (enter this command in the project directory): mvn clean package 
> NOTE: I've added the JAR just for reference purposes.
> The same type of JAR file should appear once you've build the project successfuly.

### Batch Script

- Contained in this projects repo, you'll notice an already made batch script as well.
- Edit the script with notepad/notepad++
- Copy the location of the Video Downloader JAR once it has been successfuly build.
- Place the path in the {place_holder) field and save the script.

> Now you're ready to go!!!

