package Q4;

class Bicycle {

    private Owner owner;

    // No-Arg Constructor
    public Bicycle() {
        owner = new Owner("Unknown", "0000000000");
    }

    // Parameterized Constructor
    public Bicycle(Owner owner) {
        this.owner = owner;
    }

    // Getter
    public Owner getOwner() {
        return owner;
    }

    // Setter
    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}