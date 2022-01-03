public abstract  class Person {
    public String name;
    public String add;
    public int age;

    // Constructors
    public Person() {}

    public Person(String name, String add, int age) {
        this.name = name;
        this.add = add;
        this.age = age;
    }

    // Getters
    public  abstract String getName();

    public String getAdd() {
        return add;
    }

    public final int getAge() {
        return age;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public  void setAge(int age) {
        this.age = age;
    }
}