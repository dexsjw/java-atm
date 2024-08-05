# Practice Exercise
## ATM Machine App

### Create a program that:
- has a menu system where the user select an option using an int 
- user can 
	- Check Balance
	- Deposit Money
	- Withdraw Money
	- Exit the app
- balance should be stored using double 
- **`Optional:`** user has to enter pin code in order to access the menu

#### Hints:
- while or do while loop for menu system
- System.console().readLine() for reading inputs

### Test cases
1. Deposit `500`
1. Withdraw `600` -> **`fail`**
1. Withdraw `10.88`
1. Check balance
1. Enter menu item 8 -> **`fail`**
1. Exit

### Optional Challenge
- take in argument for username
- one is main-account owner, one is sub-account owner
- sub-account owner can only `1.check balance` and `2.deposit money`
- print out `'Not authorised'` for other actions.
