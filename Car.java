package KURS;
public class Main {
import HW.project.factory.service.Color;
import HW.project.factory.service.Option;
import HW.project.factory.service.Wheel;
import HW.project.exception_project.Null;
    public static void main(String[] args) {
        public static void main (String[]args) throws Null {
            Color colorServise = new Color();
            Wheel wheelServise = new Wheel();
            OptionServise optionServise = new OptionServise();
            Factory Factory = new Factory();

            CarSale sale = new CarSale(color, wheel, optionS, race, Factory, cargo);

            Options[] options = {Options.VOICE, Option.BLUETH, Option.CONDITIONER};

            Builder builder = new Builder(Color.BLACK, Model.X2, Wheel.R21, Engine.HIGH, options, Turbo.MAX);
            Car litcar = race.takeCarFromFactoryOrCreateHim(builder);
            System.out.println(litcar);

            Car car = sale.takeOrder(new CarBuilder(Color.BLACK, Model.X2, Wheel.R21, Engine.HIGH, options, Turbo.MAX));
            Car tCar = sale.takeOrder(new CarBuilder(Color.WHITE, Model.POLO, Wheel.R18, Engine.MEDIUM, options, Drive.FULL));
            Car cCar = sale.takeOrder(new CarBuilder(Color.WHITE, Model.RAV4, Wheel.R11, Engine.LOW, options, Cargo.EAT));

            System.out.println(race);
            System.out.println(sale);
        }
    }
