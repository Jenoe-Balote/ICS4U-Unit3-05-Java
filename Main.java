/*
 * This program is a stub for the vehicle class.
 *
 * @author  Jenoe Balote
 * @version 1.0
 * @since   2021-12-30
 */

/**
 * Stub program for Vehicle class.
 * */
final class Main {

    /**
     * Prevents instantiation.
     * Throw an exception IllegalStateException when called.
     *
     * @throws IllegalStateException
     *
     */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * Prints a formatted String output.
     *
     * @param vehicle Vehicle class
     * */
    public static void formatted(final Vehicle vehicle) {
        System.out.println("\nLicense Plate: " + vehicle.getLicensePlate()
                + "\nColour: " + vehicle.getColour()
                + "\nNumber of Doors: " + vehicle.getNumOfDoors()
                + "\nMax Speed: " + vehicle.getMaxSpeed()
                + "\nCurrent Speed: " + vehicle.getSpeed());
    }

    /**
     * Creates 2 vehicle classes and uses its getters, setters and methods.
     *
     * @param args No args will be used.
     */
    public static void main(final String[] args) {

        final int numOfDoors1 = 4;
        final int numOfDoors2 = 2;
        final int maxSpeed1 = 350;
        final int maxSpeed2 = 400;
        final int accelerate1 = 100;
        final int accelerate2 = 115;
        final int brake = 70;

        // Printing properties of the vehicle classes.
        final Vehicle vehicle1 = new Vehicle(
            "", "", numOfDoors1, maxSpeed1);
        final Vehicle vehicle2 = new Vehicle(
            "", "", numOfDoors2, maxSpeed2);

        vehicle1.setLicensePlate("GVAK992");
        vehicle1.setColour("Black");
        vehicle1.accelerate(accelerate1);

        formatted(vehicle1);

        vehicle2.setColour("White");
        vehicle2.accelerate(accelerate2);
        vehicle2.brake(brake);

        formatted(vehicle2);

        System.out.println("\nDone.");
    }
}
