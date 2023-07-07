public class School {
    private long id;
    private String name = "FST";
    public School(long id){
        this.id = id;
        System.out.println("A " + id);
    }
    public School(String name){
        this(name.length());
        this.name += name;
        System.out.println("B " + this.name);
    }

    public School(long id, String name){
        this("" + id++);
        this.id = id;
        this.name = name;
        System.out.println("C " + id);
    }
}
