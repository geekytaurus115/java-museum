
public class GeekyTaurus {
    /*
     * ******** What is Class ********
     * --> Class is a description of an object's property and behaviour
     * --> Creating class is as good as creating data type
     * --> Class is defining a category of data
     * 
     * 
     * ******** Objects ********
     * --> Object is a real world entity
     * --> Object is an instance of a class
     * --> Object consumes memory to hold property values
     * 
     * 
     */
}

class Box {
    private int length, breadth, height;

    public void setDimensions(int l, int b, int h) {
        length = l;
        breadth = b;
        height = h;
    }

    public void showDimension() {
        System.out.println("L=" + length + ", B=" + breadth + ", H=" + height);
    }
}
