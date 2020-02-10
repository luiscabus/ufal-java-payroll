
# Welcome to my payroll (Refactored)!

Hi! I'm a CS Grad at **Universidade Federal de Alagoas - UFAL**. My professor, Baldoíno Fonseca, have instructed us to build a simple amateur payroll software in **JAVA** with the functionalities described below. After that we were requested to refactor ir.

## Compiling and running

- javac -d /bin/ src/*.java
- cd bin/
- java Main


# Caveat

The refactor should consider 3 fixing at least 3 code smells. The approach started turning the not-OO project into OO. Then the following patterns were found and fixed.


### Class extraction (bad smell: large class)

All the code was inside the Main class. The code has been restructured, classes have been extracted from there and created as new. Functionality remains the same, but code is more organized. 

### Method extraction 

Some code to show Employees information was repeated across different methods. This code was extracted to a method that can then be reused without code duplication. 

### Long Methods








> Written with [StackEdit](https://stackedit.io/).