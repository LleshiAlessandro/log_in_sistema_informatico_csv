/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package log.in;

/**
 *
 * @author aless
 */
public class IpFail {
    private String ip;
    private int counter;

    public IpFail(String ip, int counter) {
        this.ip = ip;
        this.counter = counter;
    }

    public String getIp() {
        return ip;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
    
    @Override
    public String toString(){
        return " ip: " + ip + " counter fails: " + counter + "\n";
    }
}
