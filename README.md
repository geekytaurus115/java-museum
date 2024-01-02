# All-About-Java

This repo contains Java Theory and Projects

### Check Java Version

```
java --version
```

### Compile Java Code

```
javac MyClass.java
```

### Run Java code

```
java MyClass //where MyClass is the class name inside program
```

### Compile and Run together

```
javac MyProgram.java && java MyProgram
```

## Simple Java Program and Execution Steps

```
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

```

#### Class Declaration

`public class HelloWorld {`: This line declares a class named HelloWorld. In Java, every program is organized as one or more classes.

#### Main Method

`public static void main(String[] args) {:` This line declares the main method, which is the entry point of a Java program. It's the method that gets executed when you run your Java program.

#### Printing "Hello, World!"

`System.out.println("Hello, World!");`: This line uses the `System.out.println` statement to print the string "Hello, World!" to the console. The `println` method is a part of the `PrintStream` class, and it prints the specified message followed by a newline.

#### Compilation

```
javac HelloWorld.java
```

This command compiles the source code and generates a bytecode file named HelloWorld.class.

#### Execution

```
java HelloWorld
```

This command runs the compiled bytecode, and you should see the output:

```
Hello, World!
```

### Summary

A Java program starts execution from the `main` method, and the statements within the main method are executed sequentially. The `System.out.println` statement is a common way to output information to the console. The process involves compiling the source code into bytecode and then running the bytecode using the JVM.
