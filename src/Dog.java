import zoo.Animal;

public class Dog implements Animal {
    private String name;

    public Dog(String name) {
       this.name = name;
    }

    @Override
    public String toString() {
        return "I am a dog with the name " + this.name;
    }

    public String describe() {
        return "I am a dog with the name " + this.name;
    }

    public void saySomething() {
        System.out.println("my name is : " + this.name);
    }

    @Override
    public void sleep() {
        System.out.println("the dog is sleeping");
    }
}
