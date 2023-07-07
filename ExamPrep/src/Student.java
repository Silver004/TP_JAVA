public class Student {
    private long id;
    private static String type = "A";
    public static String addType(String newType){
        type += newType;
        return type;
    }
}
