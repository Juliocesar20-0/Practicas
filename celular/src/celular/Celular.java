package celular;

/**
 *
 * @author Chino
 */
public class Celular {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        SmartPhone iPhone13 = new SmartPhone("iPhone 14 Pro Max", "Apple", (int) 529.00);
        BasicPhone Samsung35 = new BasicPhone("Samsung A35", "Samsung", (int) 200.50);
        Phone Huawei25 = new Phone(" Huawei P50", "Huawei", (int) 525);
        iPhone13.display();
        Samsung35.display();
        Huawei25.display();
    }
