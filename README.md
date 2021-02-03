# BankAccount

## Overview
1. Read a .csv file of names, ssn, account type, and deposit
2. Use a proper data structure to hold all these accounts
3. Both checking and savings accounts share "deposit()", "withdraw()", "transfer()", and "information()" methods
4. Checkings accounts have a 12-digit card number and a 4-digit PIN
5. Savings accounts have a safety deposit box, identified by a 3-digit number and accessed with a 4-digit code
6. The 11-digit account number of the checkings accounts will start with "1"
7. The 11-digit account number of the savings accounts will start with "2"
8. Both accounts will use an interface that determines the base interest rate
9. Checking accounts will use 15% of the base rate
10. Savings accounts will use 0.25 points less than the base rate
11. The "information()" method should reveal relevant account information as well as information specific to the checking or savings account

## Ideas
1. Develop a robust application architecture
2. Use an interface API to receive information from a developer's application
3. Use abstract classes and methods
4. Read data from a file and store it in an appropriate data structure
5. Generate random numbers and work with Spring API

## Run
1. Clone the file and put in your java ide
2. Download the "NewBankAccounts.csv" test file
3. In the "BankAccountApp.java" file, line 9, change "C:\\Users\\AndyJ\\Downloads\\NewBankAccounts.csv" to the path where you save the "NewBankAccounts.csv" test file
4. Run the code
