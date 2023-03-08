/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

/**
 *
 * @author kchah
 */
import java.util.Scanner;

public class TestUserprofile {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("What is your name? ");
        String user = input.nextLine();
        
        System.out.print("What is the type of genre you like? ");
        String genre = input.nextLine();
        UserProfile a = new UserProfile(user, genre);
        
        System.out.println("Your userProfile has been created with"
                + " the name " + a.getUserID() + " and the genre " + a.getGenre() + ".");
    }
}
