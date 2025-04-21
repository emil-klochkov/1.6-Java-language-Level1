# README: Java Backend Exercises
# 🧩 Ex1 — Without Generics
## 1. Main.java

Runs a demo using the NoGenericMethods class with different data types.

## 2. NoGenericMethods.java

A class that uses Object type variables, without generics.

Stores three values and prints them using the printObjects method.

# 🧩 Ex2 — Generic Methods
## 1. Main.java

Demonstrates the use of the generic method printThree with different data types.

## 2. GenericMethods.java

Contains the method printThree<T, U, V>, which prints three arguments of any type.

## 3. Person.java

A model class with firstName, lastName, and age fields, and a custom toString() for readable output.

# 🧩 Lvl2Ex1 — Generics + Fixed Argument
## 1. Main.java

Calls the printMixed method with a Person object, a string, and a number.

## 2. GenericMethods.java

printMixed<T, V> combines generic arguments with a fixed String argument in the middle.

## 3. Person.java

Same structure as the previous Person class.

# 🧩 Lvl2Ex2 — Generics + Varargs
## 1. Main.java

Demonstrates the printVarArgs method, passing a variable number of arguments of different types.

## 2. GenericMethods.java

Contains two methods:

printMixed<T, V> — same as in Lvl2Ex1.

printVarArgs(Object... args) — accepts any number of arguments of any type and prints them one by one.

## 3. Person.java

Same model class used throughout previous examples.
