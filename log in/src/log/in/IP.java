/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package log.in;

import java.time.LocalDateTime;

/**
 *
 * @author aless
 */
public class IP {
    private LocalDateTime timeStamp;
    private String name;
    private String ipAddress;
    private boolean accessResult;

    public IP(LocalDateTime timeStamp, String name, String ipAddress, boolean accessResult) {
        this.timeStamp = timeStamp;
        this.name = name;
        this.ipAddress = ipAddress;
        this.accessResult = accessResult;
    }
    
    
}
