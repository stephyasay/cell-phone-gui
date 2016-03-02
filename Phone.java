/**
This Phone class models a cell phone. It uses different methods and fields to implement the functionality of a
phone. 

@author Stephanie Yasay
*/
public class Phone
{
    private String number, prevNum;  
 /**
The Phone constructor. This will not have anything displayed.
*/
    public Phone()
    {
        number = "";
        prevNum = "";
    }
/**
The setNumber method will display the current number.
*/
    
    public void setNumber(String displayNum)
    {
        number = displayNum;
    }  
/**
The addDigit method will add numbers to the number displayed on the field.
*/
    
    public void addDigit(char digit)
    {
        number = number + digit;
    }    
/**
The minusDigit method will delete the last entered digit. If the number field is less than 1, it will display a blank field
*/    
    
    public void minusDigit()
    {
        if(number.length() < 1)
        {
            number = "";
        } else {
            number = number.substring(0, number.length()-1);
        }
    }    
/**
The clear method will clear all numbers entered and displayed on the numbers field.
*/
    public void clear()
    {
        number = "";
    }    
/**
The setPrevNum method will set the prevNum field to the number stored in displayNum argument.
*/
    
    public void setPrevNum(String displayNum)
    {
        prevNum = displayNum;
    }   
   /**
The getNumber method will return the value of the number variable.
*/
    
    public String getNumber()
    {
        return number;
    }  
/**
The getPrevNum method will return the value of the prevNum variable.
*/
    
    public String getPrevNum()
    {
        return prevNum;
    }
}