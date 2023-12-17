package zoo;

public class Cat implements Animal {
    private String name;
    public Cat(String name) {
      this.name = name;
    }

    @Override
    public void saySomething() {
        System.out.println("my name is : " + this.name);
    }

    @Override
    public void sleep() {
        System.out.println("cat is sleeping");
    }


}
