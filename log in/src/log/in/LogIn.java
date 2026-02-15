/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package log.in;

/**
 *
 * @author aless
 */
public class LogIn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File_Manager file = new File_Manager();
        
        IP_Manager i = new IP_Manager();
        
        System.out.println(file.readFile() + file.output());
        System.out.println(" ");
        System.out.print("1 " + i.FailCounter() + " 2 " + i.suspiciousIP());
    }
    
}
