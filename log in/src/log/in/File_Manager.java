/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package log.in;

import java.util.*;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class File_Manager {
    private String file = "LogAccessi.csv";
    private ArrayList<IP> address = new ArrayList();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    
    public ArrayList<IP> readFile(){
        try(BufferedReader reader = new BufferedReader (new FileReader(file))){
            String line;
            reader.readLine();//così salto la prima riga
            while((line = reader.readLine()) != null){
                String[] column = line.split(",");
                IP i = new IP (LocalDateTime.parse(column[0], formatter),column[1], column[2],Boolean.parseBoolean(column[3]));
                address.add(i);//dovrei avere il mio address riempito di IP (ovvero riempito dalle righe del mio file)
                               //e dovrebbe essere localDateTime, String, String e boolean
            }
        }
        catch(IOException e){
            e.getMessage();
        }
        return address;
    }
    
    public String output(){
        return address.toString();
    }
}