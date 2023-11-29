package day39_a_polymorphisim.book;

public abstract class EBook extends Book implements Downloadable {

    double size; //mg

    public abstract void open();


}