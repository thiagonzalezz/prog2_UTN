package animals;

public final class Dog extends Animal {
    @Override
    public String makeNoise() {
        return super.makeNoise() + " woof woof";
    }
}
