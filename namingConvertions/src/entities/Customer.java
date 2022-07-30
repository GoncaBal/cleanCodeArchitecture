package entities;

public class Customer extends Person {

    private int cityId;


    public Customer() {
    }

    public Customer(int id, String firstName, String lastName, int birthOfYear, String nationalIdentity, int cityId) {
        super(id, firstName, lastName, birthOfYear, nationalIdentity);
        this.cityId = cityId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
