import java.util.*;

public class RunProgram {
    public static void main(String[] args) {
        //Processing p1 = new Processing(10);
        //Processing p2 = new Processing(20);

        /*List<Integer> numbers = Arrays.asList(2,3,4);
        numbers.stream()
                .map(i->i*3)
                .map(i->i*i).
                filter(i->i%2 == 0)
                .forEach(System.out::println);*/
        //Compute.process(10,20);
        /*Set<Row> rows = new HashSet<>();
        rows.add(new Row(1, "NIZAR"));
        rows.add(new Row(2, "SONAR"));
        rows.add(new Row(1, "QUBE"));
        rows.add(new Row(1, "CLOUD"));
        rows.add(new Row(2,"JUNIT"));
        System.out.println(rows);*/
        /*Set<String> identifiers = new TreeSet<>((a,b)->a.length()-b.length());
        identifiers.add("A200");
        identifiers.add("A300458");
        identifiers.add("A4001");

        identifiers.forEach(System.out::println);*/
        //School x = new School(1,"SIGMA");
        //Reachable r1 = (a,b)->a+b;
        //Reachable r2 = a,b -> a+b;
        //Reachable r3 = (a,b)-> return a+b;
        //Reachable r4 = (a,b)->{return a+b};
        //Reachable r5 = (a,b)->{return a+b;};

        //Object x = new Macbook(12,"2020","M1");
        //Laptop y = new Macbook(12,"2020","M1");
        //System.out.println(x);
        //System.out.println(y);
        //Macbook y = new Laptop();

        //String type1 = Student.addType("B");
        //String type2 = Student.addType("C");
        //System.out.println(type1);
        //System.out.println(type2);

        List<String> collection = new ArrayList<String>();
        collection.add("abc");
        collection.add(1,"ef");
        collection.add(0,"abc");
        collection.add(0,"abc");
        System.out.println(collection);
    }
}
