public class Car implements Drive {

    @Override
    public void driveOn() {
        // 100 строк кода
        changeGear();
    }

    @Override
    public void driveOff() {
        changeGear();
        // 5 строк кода
    }

    protected void changeGear() {
        // 30 строк кода
    }
}
