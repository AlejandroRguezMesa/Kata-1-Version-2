/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kata1version2;

import java.util.Calendar;
import java.util.GregorianCalendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kata1Version2 {
    public static void main(String[] args) {
        Calendar date;
        date = GregorianCalendar.getInstance();
        date.set(1949, 9, 24);
        
        Person person = new Person("Blas", date);
        System.out.println(person.getName() + " tiene " + person.getAge()
                            + " años");
    }
    
}
