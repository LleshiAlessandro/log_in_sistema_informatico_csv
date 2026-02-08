/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package log.in;

import java.util.*;
import java.io.*;
import static java.lang.Boolean.parseBoolean;
import java.time.LocalDateTime;

public class File_Manager {
    private String file = "LogAccessi.csv";
    private ArrayList<IP> address = new ArrayList();
    
    public File_Manager(){}
    
    public ArrayList<IP> readFile(){
        try(BufferedReader reader = new BufferedReader (new FileReader(file))){
            String line;
            reader.readLine(); //così che salto la prima riga
            while((line = reader.readLine()) != null){
                String[] column = line.split(",");
                IP e = new IP (LocalDateTime.parse(column[0]),column[0], column[1],parseBoolean(column[2]));
                address.add(e);//dovrei avere il mio address riempito di IP (ovvero riempito dalle righe del mio file)
                               //e dovrebbe essere localDateTime, String, String e boolean
            }
        }
        catch(IOException e){
            
        }
        return address;
    }
}
