class Duck extends Animal implements Flyable {
    String name ;
    public Duck(String name) {
        this.name = name ;
    }
    @override
    public void sound(){
        System.out.println("quack! quack!") ;
    }
    public void fly() {
        System.out.println("quack fly!") ;
    }
    public void glide() {
        System.out.println("quack glide!") ;
    }
    public void clean(Animal animal) {
        System.out.println(this.name + " Cleaning " + animal) ;
    }
}