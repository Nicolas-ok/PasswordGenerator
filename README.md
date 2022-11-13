# PasswordGenerator

This project is a Java console application to generate random passwords and perform a password strength check.

I decided to carry out this initial project after a talk with a relative about a problem with his home banking. Helping him and seeing that his access passwords were VERY SIMPLE, I decided to instruct him on the use of passwords and the importance of making them more "robust". That's where this idea came from.
Create a password generator with its respective strength checker.


Features:

1- Generating a Password:

The user must answer with Y or N to the questions that are asked to know if they want to include lowercase, uppercase, numbers or symbols in their password.
In the next step you need to enter the desired length of the password.
An alphabet is generated in a string containing the options selected by the user.
The number of characters requested by the user when entering the length of the password is generated. These characters are placed back to back to form a completely random chain according to the user's needs.
Randomly generated password is displayed in the console

2- Verification of the security of a password:

Strength verification is based on the following criteria:

Password uses lowercase letters
The password uses uppercase letters
Password uses Numbers
Password uses symbols
Password length is 8 or more (8 is usually the minimum length required for an acceptable password)
Password length is 16 or more (16 is considered the minimum length for a good password)
This is used to calculate a score for the password used, it returns a message which shows the user if their
password is weak/average/good/excellent

3- Visualization of useful information:

This is a minor feature in that it shows the user information about the points to consider to improve the security of a password.
