public class Compute {
    public static void process(Integer a, Integer b){
        System.out.println("Processing integer");
    }
    public static void process(long a, long b){
        System.out.println("Processing long");
    }
    public static void process(int... a){
        System.out.println("Processing int...");
    }
}
