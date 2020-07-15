Feature: As a user, I want to look for something on a dummy search engine

Scenario: I do my research and get some dummy results

Given I am on the search engine dummy home page "http://duckduckgo.com"
And I enter a dummy string "Selenium"
When I press the dummy search button
Then I should see some dummy results