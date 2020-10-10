/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author cospina
 */
public class Room {
    @SerializedName("Room #:")
    private int number;
    @SerializedName("Guests:")
    private Guest[] guests;
    @SerializedName("Days staying:")
    private int days;
    @SerializedName("Room fee:")
    private double fee;
    
}
