# Kiosk - Self-Service Cafe Ordering System

A Java Swing desktop application simulating a self-service cafe kiosk. Customers can browse drinks and pastries, customize sizes/temperatures/warming options, apply discounts, and generate receipts.

## OOP Concepts Demonstrated
- **Abstraction:** `Product` abstract base class
- **Inheritance:** `Drink` and `Pastry` extending `Product`
- **Polymorphism:** Overridden `calculatePrice()` and `getDetails()` methods
- **Encapsulation:** Private fields and controlled methods across `CustomerOrder` and `OrderLine`
- **Exception Handling:** Custom `InvalidQuantityException` and `NumberFormatException` handling

## How to Run (Windows)
1. Double-click `build.bat` to compile the source code.
2. Double-click `run.bat` to launch the Kiosk GUI.
