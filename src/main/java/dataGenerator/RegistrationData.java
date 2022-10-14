package dataGenerator;

public class RegistrationData {
    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private String password;
    private String city;
    private String postalCode;
    private String mobilePhone;

    public RegistrationData(){

    }
    public RegistrationData(String firstName, String lastName, String address, String email, String password, String city, String postalCode, String mobilePhone){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.password = password;
        this.city = city;
        this.postalCode = postalCode;
        this.mobilePhone = mobilePhone;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }
    public static RegistrationData generateUser(){
        RegistrationData randomUser = new RegistrationData();
        randomUser.setFirstName(DataCreation.generateFirstName());
        randomUser.setLastName(DataCreation.generateLastName());
        randomUser.setEmail(DataCreation.generateEmail());
        randomUser.setAddress(DataCreation.generateAddress());
        randomUser.setPassword(DataCreation.generatePassword());
        randomUser.setCity(DataCreation.generateCity());
        randomUser.setPostalCode(DataCreation.generatePostalCode());
        randomUser.setMobilePhone(DataCreation.generateMobile());
        return randomUser;
    }
}
