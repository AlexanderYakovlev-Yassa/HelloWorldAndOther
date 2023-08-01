package pl.twerd.alex.helloworld.model;

public class Cat {

    private int number;
    private String name;
    private String type;


    public Cat() {
        int number = 0;
        this.number = 3;
    }

    public Cat(int number, String name, String type) {
        this.number = number;
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cat{");
        sb.append("name='").append(name).append('\'');
        sb.append(", type='").append(type).append('\'');
        sb.append(", number='").append(number).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
