public class BeijingDuck extends Duck {
    public BeijingDuck(String name) {
        super(name) ;
    }
    @override
    public void clean(Animal animal) {
        System.out.println(this.name + " Cleaning " + animal) ;
    }
    public void beijingDuck() {
        System.out.println("I am Beijing Duck") ;
    }
}