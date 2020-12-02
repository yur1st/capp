package model;

public class Guy {

    private static int id;
    private String name;
    private String lastName;


    public Guy(String name, String lastName) {
        this.id = getId();
        this.name = name;
        this.lastName = lastName;
    }

    public Integer getId() {
        id++;
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
