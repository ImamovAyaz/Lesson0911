public abstract class Jeep extends Minivan{
    @Override
    public void driveOn() {
        super.driveOn();
        // +1 спец. строка
    }
/*
    @Override
    public void driveOff() {
        super.driveOff();
        // +3 спец. строка
    }*/

    @Override
    protected void changeGear(){
        super.changeGear();
    }
}
