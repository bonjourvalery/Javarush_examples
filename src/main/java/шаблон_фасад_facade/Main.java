package шаблон_фасад_facade;

public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.startCar();
        System.out.println();
        facade.stopCar();
    }
}
