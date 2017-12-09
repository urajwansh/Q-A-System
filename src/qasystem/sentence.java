/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qasystem;

/**
 *
 * @author utk
 */
public class sentence {
   
        String sen;
        int rank=0;
        
        public void inputString(String line)
        {
        sen=line;
        }
        public String outputString()
        {
         return sen;   
        }
        public void incRank()
        {
        rank++;
        }
        public int outputRank()
        {
        return rank;
        }
        
   
    
    
}
