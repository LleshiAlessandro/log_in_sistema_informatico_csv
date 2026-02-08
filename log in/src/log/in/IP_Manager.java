/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package log.in;

import java.util.ArrayList;

/**
 *
 * @author aless
 */
public class IP_Manager {
    private File_Manager file = new File_Manager();
    private ArrayList<CounterFail> counters = new ArrayList();// mi serve a sapere quanti fail ha fatto 1 utente
    private ArrayList<IP> address = file.readFile();//su address ho tutto il contenuto del file con i tipi giusti degli attributi
    
    public int FailCounter(){
        /*dovrei controllare che i nomi e in base al nome l'accesso che ha fatto
          se è positivo non aumento il counter di counters, in caso l'accesso sia fallito
          il  counter di counters dovrà aumentare, ma come faccio ad aumentare il counter di un oggetto
          CounterFail ben preciso contenuto in una lista di CounterFail?
        */
        return -1;
    }
    
    public String suspiciousIP(){
        /*dovrei controllare che indirizzo ip e poi controlare com'è andato l'accesso,
          se quell indirizzo ip ha fatto troppi accessi sbagliati allora è sospetto
        */
        return null;
    }
}
