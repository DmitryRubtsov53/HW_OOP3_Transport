public class Main {
    public static void main(String[] args) {

        System.out.println("Домашнее задание 2.3 ООП часть 3. Наследование - Транспорт *****************************");
        System.out.println();
        System.out.println("Список автомобилей :" + "\n");

        Car [] car = new Car[4];

        car[0] = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германия", "черный", 200, "купе", 2, 2.1,
                "АКПП", "А050ЕС102",null);
        car[1] = new Car("BMW", "Z8", 2021, "Германия", "черный", 250, "кабриалет", 5, 2.5,
                "", "А111ТТ002", "");
        car[2] = new Car("Kia", "Sportage", 2018, "Южная Корея", "красный", 210,null, 0, 0,
                "",null, null);
        car[3] = new Car("Hyundai", "Avante", 2016, "Южная Корея", "оранжевый", 170, null, 2, 1.7,
                "", "Р700Ся702", null);

        Car.printCar (car);

        System.out.println();
        System.out.println("Список поездов :" + "\n");

        Train [] train = new Train[2];

        train[0] = new Train("Ласточка", "В-901", 2011, "Россия", null, 301,
                3500, null, "Белорусский вокзал", "Минск-Пассажирский", 11);
        train[1] = new Train("Ленинград", "D-125", 2019, "Россия", null, 270,
                1700, null, "Ленинградский вокзал", "Ленинград-Пассажирский", 8);

        Train.printTrain (train);

        System.out.println("Список автобусов :" + "\n");

        Bus [] bus = new Bus[3];

        bus[0] = new Bus("НефАЗ", "A850", 2000, "Россия", "черный", 0, "купе", 100, 20.1,
                "МКПП", "А050ЕС102",null);
        bus[1] = new Bus("ПАЗ", "К1258", 2021, "Россия", "черный", 150, "кабриалет", 0, 0,
                "", "А111ТТ002", "");
        bus[2] = new Bus("КамАЗ", "Р0257", 2018, " ", "красный", 210,null, 110, 25,
                "",null, null);

        Bus.printBus (bus);
    }
}