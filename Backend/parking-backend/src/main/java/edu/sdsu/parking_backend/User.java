package edu.sdsu.parking_backend;

import java.util.*;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public abstract class User 
{

    @Id
    private int userID;

    private String username;
    private String email;
    private String password;
    private String role;
    private boolean isLoggedIn = false;
    public boolean isLoggedIn() { return isLoggedIn; }
    Scanner scanner = new Scanner(System.in);

    void login() {

        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (email.equals(email) && password.equals(password)) {
            isLoggedIn = true;
            System.out.println("Login successful! Welcome, " + email + ".");
        } else {
            System.out.println("Invalid email or password.");
        }
    }

    float getUserID(float userID) {
        return this.userID;
    }

    void logout() {

        if (isLoggedIn) {
            isLoggedIn = false;
            System.out.println("Logging out");
        } else {
            System.out.println("Not logged in");
        }
    }
}