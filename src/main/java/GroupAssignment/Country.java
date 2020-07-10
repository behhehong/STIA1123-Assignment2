package GroupAssignment;

public class Country {
    String countryName;
    int newCases, newDeaths;

    public Country(int nc, int nd, String cn){
        this.countryName = cn;
        this.newCases = nc;
        this.newDeaths = nd;
    }
}
