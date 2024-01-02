
public class GeekyTaurus {
    int y = 3;
    float x = y; // Widening Conversion, no error

    float p = 3.4f;
    int q = p; // narrowing conversion, ERROR

    int k = (int) p; // No Error

    float i = 3.5; // narrowing conversion, Error

    float j = 3.5f; // No Error

}
