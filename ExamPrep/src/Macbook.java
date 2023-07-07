public class Macbook extends Laptop{
    String processor;

    public Macbook(long serial, String description, String processor) {
        super(serial, description);
        this.processor = processor;
    }
    Macbook(){}
    void do2(){}
    @Override
    Laptop getType(){
        return this;
    }

    Processor getPocessor(){
        return new Processor();
    }


}
