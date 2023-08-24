package animals;

public class Cat extends Animal {
    @Override
    public String makeNoise() {
        return super.makeNoise() + "meow meow";
    }
}
