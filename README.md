#MyProject Info
In this Maven java project, I have added a main class that will class two other classes.
I have also added unit tests for those classes.

To execute the main class, run: **mvn package exec:java**.
This will return the results as
Girish
Add Numbers:30
These are the two print statements that I have added in my main class.

##Commands
 These commands are to clean, compile, run tests and then create a jar

1. **mvn clean** - Cleans the project, removes jars.
2. **mvn compile** - Compiles the project and create a target directory with the class files.
3. **mvn test-compile** - Compiles the test directory and creates a tes-classes directory under target with class files for the tests.
4. **mvn test** - Runs the unit tests.
5. **mvn install** - Creates a jar for the project in target directory.

##Calculator Task  
I have added two interfaces.  
1. **SimpleCalculatorInterface** - This has methods of add, subtract, multiply, divide.  
2. **ScientificCalculatorInterface** - This extends the previous interface and also has methods of sin, cosine, tan, log, square, squareroot, logarithmic.

Each interface has a class that implements the interface. Main.java has the instantiations for the classes and prints out the results.  
**For Results:**  
Run **mvn package exec:java** or  
Run the main class.
