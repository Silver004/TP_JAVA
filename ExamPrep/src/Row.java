public class Row {
    private int number;
    private String content;

    @Override
    public boolean equals(Object o){
        Row row = (Row) o;
        return number == row.number;
    }

    @Override
    public int hashCode(){
        return content.length();
    }

    public Row(int number, String content) {
        this.number = number;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Row{" +
                "number=" + number +
                ", content='" + content + '\'' +
                '}';
    }
}
