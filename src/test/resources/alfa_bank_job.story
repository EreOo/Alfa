Meta:
@category basic

Narrative:
As a user
I want go to yandex or google. Find Alfa bank site.
Open site and go to vacancies.(job.alfabank.ru).
Click on "About working in the bank" and save text from the bottom of the page to TXT file.
File name must have: date, time, browser name and search site name.


Scenario: User open search site, find Alfa bank vacancies and save text from "About working in the bank".
Given User open <search site> and find Alfa bank site
When User go to About working in the bank
Then User save text to file

Examples:
|search site|
|https://www.yandex.ru/|
|https://www.google.ru|