package leaky_Encapsulation_After;

class ToDo {
    private String name;

    public ToDo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }
}
