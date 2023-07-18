public class Cat {
    private int ID;
    private int age;

    public Cat(int ID, int age) {
        this.ID = ID;
        this.age = age;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "ID=" + ID +
                ", age=" + age +
                '}';
    }
}
