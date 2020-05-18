/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progtech_szalloda;

/**
 *
 * @author renyh
 */
public class NotCorrectLengthException extends Exception{
    public NotCorrectLengthException(String uzenet){
        super(uzenet);
    }
}
