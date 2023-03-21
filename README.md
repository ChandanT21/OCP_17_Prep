# Chapter 1: Building Blocks

---
### Objectives:
- Handling date, time, text, numeric, and boolean values
  - Use primitive and wrapper classes including Math API, parentheses, type promotion, and
  casting to evaluate arithmetic and boolean expressions
- Utilizing Java Object-Oriented Approach
  - Declare and instantiate Java Objects, and explain the object life-cycle including 
  creation, reassigning references, and garbage collection
  - Understand variable scopes, use local variable type inference, apply encapsulation, 
  and make objects immutable

---
### Notes:
- JDK (Java Development Kit) contain the minimum software you need to do Java Development
  - Key Commands: 
    - javac: _Converts_ **.java** _source file into_ **.class** _bytecode_ (ex. javac Zoo.java)
      - javac `-d <directory>`: option used to specify a different target directory
      - java or javac `-cp <classpath>`: option used to specify the class path (alternative `-classpath <classpath>`
      & `--class-path <classpath>`)
    - java: _Launches JVM (Java Virtual Machine) and executes the program_ (ex. java Zoo)
      - To skip the explicit compilation step use the single-file source programs (used for testing small programs) (ex. java Zoo.java arg1 arg2)
    - jar: _Java Archive file is a ZIP file of mainly Java class files packaged together_
      - Useful when the class files are located elsewhere or in special JAR files
      - `java -cp ".:/tmp/someOtherLocation:/tmp/myJar.jar" myPacakge.MyClass`
        - the `.` indicates that you want to include the current directory in the classpath
        - the rest of command says to look for loose class files (or packages) in `someOtherLocation` and `myJar.jar`
        - Windows uses `;` to separate parts of the classpath; other OS use `:`
        - You can use `*` to match all the JARs in a directory
      - Creating a JAR file in current directory: `jar -cvf myNewJarFile.jar .`
        - Alternative create JAR file in a specified directory `jar -cvf myNewJarFile.jar -C dir .`
        - `-cvf`: `--create --verbose --file`
    - javadoc: _Generates documentation_
  - Released every 6 months on the Oracle's website or download from OpenJDK
- JRE (Java Runtime Environment) was a subset of the JDK that was used for running a program
but could not compile one. (Used in Java 8 and earlier)
- Java comes with a large suite of API (Application Programming Interface)
- IDE (Integrated Development Environment) used to make writing and running code easier- 


- Class Structure
  - All the various objects of all the different classes represent the state of the program
  - Java classes have 2 primary elements (or members of the class): Fields & Methods 
- Method Signature
  - `{Access Modifier}` `return_type` methodName (0...`parameter_type` `parameter`...n) {...}
- Comments
  - non-executable codes used to make it easier to read the code
    - Single line comment (//)
    - Multiple Line (/* */)
    - Javadoc Comment (/**  */) are read by the javadoc tools
- Classes & Source Files
  - A top-level class is often `public` which means any code can call it (but java does not require the type to be public)
  - You can put two types in the same file; given one is `public` and matches the filename.
  - Each file can contain only one `public` class
  - The filename must match the class name, including case, and hava a `.java` extension


- Main Method 
  - `public static void main (String[] args) {...}`
  - lets the JVM call our code
  - `static` keyword binds a method to its class, so it can be called by just the class name
  - parameter can be any of the following:
    - `String[] args` - array
    - `String options[]` - array
    - `String ... args` - varargs
  - Optional modifiers in main method: `... final ...`
- Package Declarations and Imports
  - Package names are mostly letters or numbers seperated by `.`
  - Classes in the same package are often imported together using a wildcard `*` symbol
    - This only brings in the classes directly under the package; not the child packages, fields, or methods
    - Ex. You wanted to use the following class `java.util.concurrent.atomic.AtomicInteger` then only the following 
    would work as a wildcard import `import java.util.concurrent.atomic.*;`
    - `java.lang` is a special package that is automatically imported
    - Java automatically looks in the current package for other classes so no need to import them
  - When importing a class names that is found in multiple packages, for example `Date` in `import java.uti.*` and 
  `import java.sql.*`, Java gives a compiler error (imports are ambiguous).
    - Solution 1: remove one of the imports
    - Solution 2: declare one of the imports, `import com.util.Date`, and leave the other import as wildcard
    - Solution 3: use one as import statement, and use tht other fully qualified class name `java.sql.Date sqlDate;`


- Ordering Elements in a Class (Acronym `PIC`)
  - Comments can go anywhere in the code
  - Package declaration (ex. `package abc;`) Req -`No` -- First line in the file (excluding comments and blank lines)
  - Import statements (ex. `import java.util.*`) Req -`No` -- Immediately after the package (if present)
  - Top-level type declaration (ex. `public Class C`) Req -`Yes` -- Immediately after the import (if any)
  - Field and Method (ex. `int value` & `void method()`) Req -`No` -- In any top-level element within a class

  
- Creating Object
  - Object is an instance of a class
    - To create an instance, write `new` before the class name and parentheses after it
    - ex. `Park brooklyn = new Park();`
      - Declare the type you will be creating and give it a variable name `Park Brooklyn` to give Java a place to 
      store a reference to the object
      - Write `new Park()` to actually create the object
    - 2 properties of a constructors
      - the name of the constructor matches the name of the class.
      - no return type 
      - purpose: to initialize fields
      - A `do nothing` default constructor is provided if your class has no constructor
  - Order of Initialization
    - Fields and instance initializer blocks are run in the order in which they appear in the file
    - Constructor runs after all fields and instance initializer blocks have run
    - You cannot refer to a variable before it ahs been defined
  - Instance Initializers
  - Order of Initialization


- Data Type
  - Primitive - _a single value in memory (such as a number or character)_
    - `boolean` - `True` or `False` - Min Val. (`n/a`) - Max Val. (`n/a`) - Default: `False`
    - `byte` - 8-bit integral value - Min Val. (`-128`) - Max Val. (`127`) - Default: `0`
    - `short` - 16-bit integral value - Min Val. (`-32,768`) - Max Val. (`32,767`) - Default: `0`
    - `int` - 32-bit integral value - (`-2,147,483,648`) - (`2,147,483,647`) - Default: `0`
    - `long` - 64-bit integral value - (`-2^63`) - (`2^63 - 1`) - Default: `0L` or `0l`
    - `float` - 32-bit floating point value - (`n/a`) - (`n/a`) - Default: `0.0f` or `0.0F`
    - `double` - 64-bit floating point value - (`n/a`) - (`n/a`) - Default: `0.0`
    - `char` - 16-bit Unicode value - Min Val. (`0`) - Max Val. (`65,535`) - Default: `\u0000`
    - When a number is present in the code, it's called a **literal**.
      - you can have `_` in number to make them easier to read (ex. `1_000_000`or `1____2`)
    - All primitive types have lowercase type names
  - Reference Variable - _can be assigned ot another object of the same or compatible type or a new object using the 
  `new` keyword_
    - All classes follow the practice of starting name with uppercase
    - Reference types can be used to call methods (assuming reference is not null)
    - Reference types can be assigned `null` (they don't currently refer to an object)
  - Wrapper Class
    - `boolean` -> `Boolean` -- Ex. `Boolean.valueOf(true)` -- Inherit Number: `No`
    - `byte` -> `Byte` -- Ex. `Byte.valueOf((byte) 1)` -- Inherit Number: `Yes`
    - `short` -> `Short` -- Ex. `Short.valueOf((short) 1)` -- Inherit Number: `Yes`
    - `int` -> `Integer` -- Ex. `Integer.valueOf(1)` -- Inherit Number: `Yes`
    - `long` -> `Long` -- Ex. `Long.valueOf(1)` -- Inherit Number: `Yes`
    - `float` -> `Float` -- Ex. `Float.valueOf((float) 1.0)` -- Inherit Number: `Yes`
    - `double` -> `Double` -- Ex. `Double.valueOf(1.0)` -- Inherit Number: `Yes`
    - `char` -> `Character` -- Ex. `Character.valueOf('c')` -- Inherit Number: `No`
      - All numeric class extend the `Number` class, and thus come with some helpful methods to return primitive value 
      of a wrapper instance (`byteValue()`, `longValue()`, `intValue()`, `doubleValue()`)
      - Boolean and Character wrapper classes include `booleanValue()` & `charValue()`
      - can result in loss of precision 
  - String Class
    - String -> int -- Ex. `int primitive = Integer.parseInt("123");`
    - String -> Integer -- Ex. `int wrapper = Integer.valueOf("123");`
    - **Multiline string**(text block): _starts and ends with `"""` and the content don't need escape characters_
      - Essential Whitespace: part of your String and its important
      - Incidental Whitespace: just happens to be their to make the codes easier to read
      - Text block requires a line break after the opening (cannot start and end on the same line)
    - Text block formatting
      - Formatting >> Meaning in regular String >> Meaning in text block
      - `\"` --> `"` --> `"`
      - `\"""` --> `n/a` - Invalid --> `"""`
      - `\"\"\"` --> `"""` --> `"""` 
      - Space (at the end of line) --> Space --> Ignored
      - `\s` --> 2 spaces --> 2 spaces
      - `\` (at the end of line) --> `n/a` - Invalid --> Omits new line on that line


- Declaring Variable
  - State the variable type along with giving it a name
  - Giving a variable a value is called **Initializing** ex (`String name = "Chase";` or `int num = 3;`)
  - 


---
### Keywords:
- **Classes**: _the basic building blocks with defined parts and characteristics_
- **Object**: _runtime instance of a class in memory; often referred to as an instance of 
a class in memory_
- **Reference**: _a variable that points to an object_
- **Field** (variable): _holds the state of the program_
- **Method** (function or procedure): _operate on the state_
- **Keyword**: _word with special meaning (ex. public, class, etc.)_
- **Parameter**: _method requiring information to be supplied to it from the calling method_
- **main()**: _java program begins execution with its main() method_
- **Access Modifier**: _declares the method's level of exposure to potential callers in the program_
- **Array**: _a fixed-size list of items that are all off the same type_
- **Varargs**: _variable argument list_
- **Packages**: _logical grouping of classes_
- **Import statement**: _an instruction to tell Java which packages to look in for classes_
- **Constructor**: _a special type of method that creates a new object_
- **Code Blocks**: _anywhere you see braces `{}` is a code block_
- **Instance Initializer Blocks**: _code blocks outside a method_
- **Primitive Data Type**: _8 built-in data types; building blocks of Java objects; hold their values in the memory 
where the variable is allocated_
- **Octal** (digits 0-9): _uses the number 0 as a prefix (ex. 017)_
- **Hexadecimal** (digits 0-9 and Letters A-F/a-f): _uses 0x or 0X as a prefix and is case-insensitive (ex. 0xFF)_
- **Binary** (digits 0-1): _uses the number 0 followed by b or B as a prefix (ex. 0b10,0B10)_
- **Reference Data Type**: _refers to an object (an instance of a class); a reference points to an object by storing 
the memory address where the object is located (concept referred to as **pointer**)_
- **Variable**: _a name for a piece of memory that stores data_

---
### Questions:
- How does the JVM run the bytecode on any machine?
- How to go about identifying the correct API to use for a given situation? 