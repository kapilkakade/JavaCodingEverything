Feature: User login

	Scenario: Succesful login
		Given the user is on nopCommerce login page
		When the user entered valid credentials (username: "test123@gmail.com", password: "Test@123")
		And the user clicks on login button
		Then the user should be redirected to My account page
		And the welcome message should be displayed