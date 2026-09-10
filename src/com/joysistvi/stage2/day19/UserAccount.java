package com.joysistvi.stage2.day19;

public class UserAccount {

    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private String email;
    private String password;

    // Constructor
    public UserAccount(String firstName, String middleName, String lastName,
                       String address, String email, String password) {
        setFirstName(firstName);
        setMiddleName(middleName);
        setLastName(lastName);
        setAddress(address);
        setEmail(email);
        setPassword(password);
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        if (email.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Invalid email format.");
        }
    }

    public void setPassword(String password) {
        if (password.length() >= 8
                && password.matches(".*[A-Za-z].*")
                && password.matches(".*[0-9].*")
                && !password.contains(" ")) {
            this.password = password;
        } else {
            throw new IllegalArgumentException(
                    "Password must be at least 8 characters, contain a letter and a number, and have no spaces."
            );
        }
    }
}