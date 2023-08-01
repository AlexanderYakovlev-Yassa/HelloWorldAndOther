package pl.twerd.alex.helloworld.model;

public class Man {

    private String name;
    private int age;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = "Name: " + name;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Man{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
