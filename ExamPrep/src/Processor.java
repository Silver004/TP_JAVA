public class Processor extends Macbook{
    String model;

    public Processor(long serial, String description, String processor, String model) {
        super(serial, description, processor);
        this.model = model;
    }
    Processor(){}

}
