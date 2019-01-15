public class Main3 {
    public static void main(String[] args) {
        Box box = new Box(10);

        box.add( new Book("Fedor Dostojevski", "Crime and Punishment", 2) ) ;
        box.add( new Book("Robert Martin", "Clean Code", 1) );
        box.add( new Book("Kent Beck", "Test Driven Development", 0.7) );

        box.add( new Cd("Pink Floyd", "Dark Side of the Moon", 1973) );
        box.add( new Cd("Wigwam", "Nuclear Nightclub", 1975) );
        box.add( new Cd("Rendezvous Park", "Closer to Being Here", 2012) );

        System.out.println( box );
    }
}