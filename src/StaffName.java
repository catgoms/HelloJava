public class StaffName {

    private String firstName, lastName;

    public StaffName(String first, String last) {
        this.firstName = first;
        this.lastName = last;
    }

    public String titledName(String u) {
        return u + " " + firstName.charAt(0) + ". " + lastName;
    }

    public static String testingName(String u, String i) {
        return u + " " + i;
    }
}
