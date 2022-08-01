package pharmacy;

public class Main {

    public static void main(String[] args) {
        Pharmacy pharmacy = new Pharmacy();
        pharmacy.addDrug(new Drug("Paracetamol", 500));
        pharmacy.addDrug (new Drug("Ibuprofen", 200));
        Citizen citizen = new Citizen("Test", 55);
        Citizen citizen1 = new Citizen ("Test2", 25);
        pharmacy.buyDrug(citizen, "Paracetamol");
        pharmacy.buyDrug (citizen1, "Paracetamol");
    }
}
