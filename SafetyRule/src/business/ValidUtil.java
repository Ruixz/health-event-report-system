/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author skipper
 */
public class ValidUtil {
    public boolean validStr(String input){
        if(input==null||input.trim().isEmpty()){
            return false;
        }
        return true;
    }
    
    public boolean validDate(String date){
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    try {
        sdf.parse(date);
        return true;
    }
    catch(ParseException ex) {
        return false;
    }
    }
    
    public boolean validInt(String integer){
        try{
            Integer.parseInt(integer);
            return true;
        }catch(NumberFormatException nfe){
            return false;
        } 
    }
}
