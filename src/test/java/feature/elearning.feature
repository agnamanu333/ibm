Feature: signup functionality

  Background: background session
    Given user is in homepage

  @register
  Scenario Outline: signup with valid data
    When user click on signup button
    When user enter valid firstname "<firstname>" and lastname "<lastname>"
    When user enter valid Email "<email>"
    When user enter Username "<username>" and Pass"<pass>"
    When user  enter Confirm pass "<pass>"
    When user enter phone "<phone>"
    Then click on register

    Examples: 
      | firstname | lastname | email                 | username   | pass      | phone      |
      | Agna      | Manu     | agnamanu369@gmail.com | agnaali123 | sarang123 | 1234567890 |

  @login
  Scenario Outline: loginwith invalid data
    When user enter invalid username"<username>" and password "<pass>"
    Then user click on login button
    Then validation msg appears

    Examples: 
      | username | password |
      | agnaali  | sarang12 |

  @login1
  Scenario Outline: loginwith valid data
    When user enter valid username"<username>" and password "<pass>"
    Then user clicks on login button

    Examples: 
      | username   | pass      |
      | agnaali369 | sarang123 |

  @test2
  Scenario Outline: forget password
    When user click forget password
    Then user enter the invalid username"<user>"
    Then click on send message
    Then validation msgs appears

    Examples: 
      | user     |
      | agnaali3 |

  @test2
  Scenario Outline: forget password with valid credentials
    When user clicks forget password
    Then user enter the valid email or username"<user>"
    Then clicks on send message
    Then validation message is on screen

    Examples: 
      | user       |
      | agnaali369 |

  @test3
  Scenario Outline: catalogue
    When user enters valid username"<username>" and password "<pass>"
    Then user clicks login button
    Then user click on catalogue
    Then user click on the homepage
    Then user click on compose message
    Then user click on send to option
    Then enter data "<search>"
    And user enter data on subject"<invite>"
    Then user again click send msg
    And user receives msg from page 
    Then user logout the profile

    Examples: 
      | username   | pass      | search | invite     |
      | agnaali369 | sarang123 | agna   | invitation |

  @test4
  Scenario Outline: edit profile
    When user enters valid user"<username>" and pass"<pass>"
    Then user clicks login option
    Then user clicks on the homepage
    Then click on the edit option
    

    Examples: 
      | username   | pass      |
      | agnaali369 | sarang123 |
