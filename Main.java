public class Main {
    public static void main(String[] args) {
        Cow Hostage = new Cow() ;
        Hostage.sound() ;
        Duck firstDuck = new Duck("Donald") ;
        Duck secondDuck = new Duck("Daisy") ;
        firstDuck.sound() ;
        firstDuck.clean(Hostage) ;
        firstDuck.clean(secondDuck) ;
        secondDuck.clean(firstDuck) ;
        Owl Furs = new Owl() ;
        Furs.sound() ;
        Pig Piglet = new Pig() ;
        Piglet.sound() ;
    }
}