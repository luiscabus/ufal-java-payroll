
# Welcome to my payroll (Refactored)!

Hi! I'm a CS Grad at **Universidade Federal de Alagoas - UFAL**. My professor, Baldoíno Fonseca, have instructed us to build a simple amateur payroll software in **JAVA** with the functionalities described below. After that we were requested to refactor ir.

## Compiling and running

- javac -d /bin/ src/*.java
- cd bin/
- java Main


# Caveat

The refactor should consider 3 fixing at least 3 code smells. 
The approach started turning the not-OO project into OO. (https://github.com/luiscabus/ufal-java-payroll/commit/43a9a99361c5a82f4aca08d72aa1ec28d843cc34). 
Then the following patterns were found and fixed:


### Class extraction (bad smell: large class)

All the code was inside the Main class. The code has been restructured, classes have been extracted from there and created as new. Functionality remains the same, but code is more organized. 

### Method extraction (bad smell: duplicated code)

Some code to show Employees information was repeated across different methods. This code was extracted to a method that can then be reused without code duplication. 

Some code to insert sample Employees was repeated, a constructor was then created to help with this. (https://github.com/luiscabus/ufal-java-payroll/commit/70057eea85b77341225940cbccc14fc0990638f0).

Some code to find out week day name was turned into a method. (https://github.com/luiscabus/ufal-java-payroll/commit/db5757107a96f6a3aadc8610d6562efbf53917d0).

Menu options were turned into a method (https://github.com/luiscabus/ufal-java-payroll/commit/6328906ccc70f36a6dcc8e548b5ca8ad87391db2). Same amount of code, but better maintainability and readability on the main method.

### Long Methods (bad smell: super long methods)

Code split into different methods that handle specific and unique things, instead of having a long method to handle lots of different behaviors. 

Some code to receive input to create a new Employee was repeated and the method was too long with different functionalities. 
New Class and new Methods were created to handle the inputs, without duplucation, code is more readable.  (https://github.com/luiscabus/ufal-java-payroll/commit/0de7c80bedeb46ba937d0a1a78ae4fbc2461993b).

Utilyze code reuse to write less code (https://github.com/luiscabus/ufal-java-payroll/commit/0a6338656df79d54a1e39ba3cfcdf3369a9eb05c).

### Creation of Objects

An array was being used to store strings that contained information about an specific Employee. Now an Object is used to do the same. Code is much more readable and understandable (https://github.com/luiscabus/ufal-java-payroll/commit/4603f2aa40366a0783e06229cf86b3519a448a82). 




> Written with [StackEdit](https://stackedit.io/).