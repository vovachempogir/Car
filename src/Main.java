import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car ladaGranta = new Car("Lada","Granta",1.7,"Желтый",2015,"Россия");
        ladaGranta.seasonalTireCheck(ladaGranta);
        System.out.println();

        Car audiA850LTDIQuattro = new Car("Audi","A8 50 L TDI quattro",3.0,"Черный",2020,"Германия");
        audiA850LTDIQuattro.Car();
        System.out.println();

        Car bmwZ8 = new Car("BMW","Z8",3.0,"Черный",2021,"Германия");
        bmwZ8.Car();
        System.out.println();

        Car kiaSportage4Generation = new Car("Kia","Sportage 4 generation",2.4,"Красный",2018,"Южная Корея");
        kiaSportage4Generation.Car();
        System.out.println( );

        Car hundaiAvante = new Car("Hundai", "Avante", 1.6, "Оранжевый", 2016, "Южная Корея");
        hundaiAvante.Car();
        System.out.println( );

        Car default1 = new Car();
        default1.Car();

    }
}