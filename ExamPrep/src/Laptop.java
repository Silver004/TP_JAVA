public class Laptop {
    public long serial;
    public String description;

    public Laptop(long serial, String description) {
        this.serial = serial;
        this.description = description;
    }
    Laptop(){}
    Laptop getType(){
        return this;
    }
    void do1(){}
    @Override
    public String toString() {
        return "Laptop{" +
                "serial=" + serial +
                ", description='" + description + '\'' +
                '}';
    }
}
