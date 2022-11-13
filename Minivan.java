public class Minivan extends Car{

    @Override
    public void driveOn() {
        super.driveOn();
        changeGear();
        // +10 строк специфичного кода
        changeGear();
    }

    @Override
    public void driveOff() {
        super.driveOff();
        changeGear();
        // +2 строк специфичного кода
    }
}
