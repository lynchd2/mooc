import java.util.*;

public class Main {
    public static void main(String[] args) {
        RegistrationPlate reg1 = new RegistrationPlate("FI", "ABC-123");
        RegistrationPlate reg2 = new RegistrationPlate("FI", "UXE-465");
        RegistrationPlate reg3 = new RegistrationPlate("D", "B WQ-431");

        ArrayList<RegistrationPlate> finnish = new ArrayList<RegistrationPlate>();
        finnish.add(reg1);
        finnish.add(reg2);

        RegistrationPlate newPlate = new RegistrationPlate("FI", "ABC-123");
        VehicleRegister vr = new VehicleRegister();
        if (!finnish.contains(newPlate)) {
            finnish.add(newPlate);
        }
        System.out.println("Finnish: " + finnish);
        // if the equals method hasn't been overwritten, the same registration plate is repeated in the list


        vr.add(reg1, "Arto");
        vr.add(reg3, "Jürgen");

        System.out.println("owners:");
        System.out.println(vr.get(reg1));
        System.out.println("reg plates:");
        vr.printRegistrationPlates();
        System.out.println("all owners:");
        vr.printOwners();
    }
}