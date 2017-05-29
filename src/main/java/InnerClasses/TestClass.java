package InnerClasses;// Unpublished Work (c) 2017 Deere & Company

public class TestClass {
    public static void main(String[] args){
        OuterClass.HelperClass helperClass = new OuterClass.HelperClass();

        OuterClass outerClass = new OuterClass();
        OuterClass.NonStaticInnerClass nonStaticInnerClass = outerClass.new NonStaticInnerClass();
    }
}
