# Bank Account Management System

This project simulates a **Bank Account Management System** using **Hibernate ORM** to manage customer bank accounts, perform deposit and withdrawal operations, and record transaction history.

## Project Overview

The system allows customers to:
- Create accounts with different types (Savings, Checking)
- Deposit and withdraw money from their accounts
- View transaction history for each account

### Technologies Used:
- **Java** (Programming Language)
- **Hibernate** (Object-Relational Mapping for database interactions)
- **Postgres** (Database)
- **Maven** (For dependency management)

## Project Structure

The project consists of the following main classes:

### 1. `Customer` Class
Represents the customer, who has multiple bank accounts.

Attributes:
- `id`: Unique identifier for the customer.
- `name`: Name of the customer.
- `email`: Email address of the customer.
- `bankAccounts`: List of bank accounts associated with the customer.

### 2. `BankAccount` Class
Represents a bank account. Each account belongs to a specific customer.

Attributes:
- `accountNumber`: Unique identifier for the bank account.
- `balance`: The current balance in the account.
- `type`: The type of account (Savings, Checking).
- `customer`: The customer who owns the account.

Methods:
- `deposit(amount)`: Deposits a specified amount into the account.
- `withdraw(amount)`: Withdraws a specified amount from the account.
- `recordTransaction(amount, type)`: Records a transaction (Deposit/Withdraw).


### 4. `Main` Class
The entry point of the application, where:
- A customer is created.
- Two bank accounts are created for that customer.
- A deposit and withdrawal operation is performed on the accounts.
- Transactions are recorded for each operation.


