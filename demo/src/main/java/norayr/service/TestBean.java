package norayr.service;

public class TestBean {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TestBean(String name) {
        this.name = name;
    }

    public TestBean() {
    }

    private String name;
}
