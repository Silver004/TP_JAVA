public class Example {
    public static void main(String[] args) {
        Short s = 15;
        Boolean b;
        // insert code here
        //b = (Number instanceof s);
        b = (s instanceof Short);
        System.out.println(b);
        //b = s.instanceof(Short);
        boolean a = (s instanceof Number);
        System.out.println(a);
        //b = s.instanceof(Object);
        //b = (s instanceof String);

    }

}
