package ss7.thuc_hanh;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2] ;
        animals[0] = new Tiger() ;
        animals[1] = new Chicken() ;
        System.out.println(animals[1].mekeSount());
    }
}
