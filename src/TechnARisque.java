

public class TechnARisque extends Technicien implements ARisque {

    public TechnARisque(String firstname, String lastname, int age, String entryYear, int base) {
        super(firstname, lastname, age, entryYear, base);
    }

    @Override
    public double calculerSalaire() {
        return super.calculerSalaire();
    }

    @Override
    public double getPrime() {
        return 200;
    }
}
