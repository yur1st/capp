package com.capp.tech.guy;

public class GuyWithAddressDTO {

    private Long guyId;
    private Long addressId;
    private String firstName;
    private String lastName;
    private String town;

    public Long getGuyId() {
        return guyId;
    }

    public void setGuyId(Long guyId) {
        this.guyId = guyId;
    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
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

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }
}
