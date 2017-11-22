/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dtmanager;

import java.util.Date;

/**
 *
 * @author LENOVO
 */
public interface DataChecker 
{
    public int Validate(String[] Text);
    public int Validate(String PassWord1, String PassWord2);
    public int Validate(String Contact);
    public int Validate(int[] numbers);
}
