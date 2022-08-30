@echo off

echo NOTE: use underscores to represent a space (e.g. funny_video_compilation)
echo.
echo The more specific the video name, the better the search results
echo.
echo Enter video name below:
echo.
set /p videoName=

start cmd.exe /k "cd C:\Users\{jar_location_placeholder} & java -jar VideoDownloader.jar %videoName%"

