## Widening Conversion

Widening conversion, also known as implicit conversion or promotion, occurs when you convert a smaller data type into a larger data type. This conversion is done automatically by the Java compiler.

### Example:

```
public class WideningConversion {
    public static void main(String[] args) {
        int intValue = 10;
        long longValue = intValue; // Widening conversion from int to long
        float floatValue = longValue; // Widening conversion from long to float

        System.out.println("int value: " + intValue);
        System.out.println("long value: " + longValue);
        System.out.println("float value: " + floatValue);
    }
}

```

In this example, the int value is implicitly converted to a long, and then the long value is implicitly converted to a float. This is allowed because widening conversions involve moving from a smaller data type to a larger data type where there is no loss of precision.

## Narrowing Conversion:

Narrowing conversion, also known as explicit conversion or casting, occurs when you convert a larger data type into a smaller data type. This conversion requires explicit casting and may result in loss of data.

### Example:

```
public class NarrowingConversion {
    public static void main(String[] args) {
        double doubleValue = 123.456;
        long longValue = (long) doubleValue; // Narrowing conversion from double to long
        int intValue = (int) longValue; // Narrowing conversion from long to int

        System.out.println("double value: " + doubleValue);
        System.out.println("long value: " + longValue);
        System.out.println("int value: " + intValue);
    }
}

```

In this example, the double value is explicitly cast to a long, and then the long value is explicitly cast to an int. This is allowed, but note that there may be loss of precision, especially when moving from a floating-point type to an integer type.
