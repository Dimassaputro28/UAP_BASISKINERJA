package ArrayList;

public class Main {
    public static void main(String[] args) {
        CarRider dimas = new CarRider("Dimas", 18, "085215833109");
        CarRider saputro = new CarRider("Saputro", 19, "0852041810222");
        CarRider alfi = new CarRider("Alfi", 20, "0852041810111");
        CarRider asyam = new CarRider("Asyam", 17, "0852041810000");

        CarData data = new CarData();
        data.addCar("SUV", "N 8273 GH", " Range Rover");
        data.addCar("SPORT", "N 3334 RZ", " Aston Martin");
        data.addCar("TRUCK", "N 9832 RF", " Volvo");
        data.addCar("PICK UP", "N 0201 PO", " Toyota");
        data.listOfCar();
        System.out.println();

        RentArchive arsip = new RentArchive();
        arsip.Rent(dimas, data.getCarList().get(1), 9);
        arsip.Rent(saputro, data.getCarList().get(2), 3);
        arsip.Rent(alfi, data.getCarList().get(3), 2);
        arsip.Rent(asyam, data.getCarList().get(2), 8);
        System.out.println();
        arsip.info();

    }
}
