public class Car extends Vehicle {
    private int numberOfSeats;

    public int getNumberOfSeats() {
        return numberOfSeats;
        }

    @Override
    public void start(){
        System.out.println("Samochód uruchomiony");
    }
    @Override
    public void stop(){
        System.out.println("Samochód zatrzymany");
    }

}
