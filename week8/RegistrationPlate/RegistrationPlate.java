public class RegistrationPlate {

    private final String regCode;
    private final String country;

    public RegistrationPlate(String regCode, String country) {
       this.regCode = regCode;
       this.country = country;
    }

    @Override
    public String toString(){
        return country + " " + regCode;
    }

    public String getCountry() {
    	return this.country;
    }

    public String regCode(){
    	return this.regCode;
    }

    @Override
    public boolean equals(Object object) {
    	if(object == null) {
    		return false;
    	}

        RegistrationPlate compared = (RegistrationPlate) object;

        if (getClass() != object.getClass()) {
            return false;
        }
        if (this.regCode() != compared.regCode()) {
            return false;
        }

        if (this.country == null || !this.country.equals(compared.getCountry())) {
            return false;
        }

        return true;    
    }

    public int hashCode() {
        if (this.regCode() == null || this.getCountry() == null) {
            return 7;
        }
        return this.regCode().hashCode() + this.getCountry().hashCode();
    }

}