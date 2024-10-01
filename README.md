# Java-Project

Here's a sample `README.md` file for your Pizza Ordering Java Program:

```markdown
# Pizza Ordering System

This Java program simulates a simple pizza ordering system where users can choose between a vegetarian and non-vegetarian pizza, add extra cheese, extra toppings, and opt for takeaway. At the end of the selection process, the program provides the total bill.

## Features

- **Vegetarian and Non-Vegetarian Pizza Options**: The user can select between a vegetarian pizza priced at 300 and a non-vegetarian pizza priced at 400.
- **Optional Extras**:
  - Extra cheese can be added for an additional 100.
  - Extra toppings can be added for an additional 150.
  - Opt for takeaway with a backpack for an additional 20.
- **Billing**: At the end of the order process, the total price is calculated and displayed, including the cost of any added extras.

## How to Use

1. Clone the repository or download the source files.
2. Compile the `pizza.java` file.
   ```bash
   javac pizza.java
   ```
3. Run the program.
   ```bash
   java pizza
   ```
4. During the execution of the program, the user will be prompted with the following questions:
   - Whether they want a vegetarian or non-vegetarian pizza.
   - Whether they want extra cheese.
   - Whether they want extra toppings.
   - Whether they want to opt for takeaway.
   
   The responses will influence the final bill.

## Program Flow

1. **Select Pizza Type**: The program starts by asking the user if they want a vegetarian or non-vegetarian pizza.
2. **Add Extras**: The user can then decide if they want to add extra cheese or extra toppings to the pizza.
3. **Takeaway Option**: The user can choose to opt for takeaway, which adds an extra cost.
4. **Generate Bill**: The program will display a detailed bill including the base pizza price, extra cheese, extra toppings, takeaway fee, and the total amount.
5. **End Message**: A thank you message is displayed after the bill.

## Code Overview

### pizza Class
The `pizza` class contains:
- Properties such as the price, type of pizza (vegetarian or non-vegetarian), and additional costs for cheese, toppings, and takeaway.
- Methods for adding extra cheese (`addExtraCheese()`), adding extra toppings (`addExtraToppings()`), and opting for takeaway (`takeAway()`).
- A method to print the final bill (`getBill()`).

### Key Methods

- **addExtraCheese()**: Prompts the user if they want extra cheese and adjusts the total price accordingly.
- **addExtraToppings()**: Prompts the user if they want extra toppings and adjusts the total price accordingly.
- **takeAway()**: Prompts the user if they want to opt for takeaway and adjusts the total price accordingly.
- **getBill()**: Displays the final breakdown of the order and the total price.

## Example

```bash
DO YOU WANT EXTRA CHEESE? [Y/N]___y
DO YOU WANT EXTRA TOPPINGS? [Y/N]___n
DO YOU WANT TAKE-AWAY? [Y/N]___y
PIZZA: 300
EXTRA CHEESE: 100
TAKE AWAY: 20

TOTAL AMOUNT: 420

THANK YOU!!!! VISIT AGAIN!!...
```

## Dependencies

- Java Development Kit (JDK) version 8 or higher.

## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvements, feel free to open an issue or submit a pull request.
