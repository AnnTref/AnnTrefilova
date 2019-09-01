public class Car {
        String make; //марка
        String model; //модель
        String color; //цвет
        int distance; // расстояние
        int weight; //масса
        boolean dtp; //дтп
        int volume; // объем бензобака
        Engine engine;// двигатель автомобиля

        public void Beep(){
            System.out.println("БИИИИП");
        }

        public void Benz(){
        Engine d = new Engine();
        int benz = d.getFuelCons()*distance;
        System.out.print(benz + " литров бензина израсходовано за "+ d.getFuelCons() + " км пути");
        }
}



