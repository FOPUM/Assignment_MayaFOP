/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment_mayafop;

/**
 *
 * @author Ming
 */
public class MiscFunc {
    public String upperLetter(String name){
        String modifiedString="";
        if(name != null){
            if(!name.isEmpty()){
                String[] stringTemp = name.split(" ");

                for (int i = 0; i < stringTemp.length; i++) {

                    String firstLetStr = stringTemp[i].substring(0, 1);
                    String remLetStr = stringTemp[i].substring(1);
                    if(!stringTemp[i].equals("and")){
                        firstLetStr = firstLetStr.toUpperCase();
                    }
                    remLetStr = remLetStr.toLowerCase();
                    if(modifiedString.equals(" ")){
                        modifiedString = firstLetStr + remLetStr + " ";
                    }else{
                        modifiedString += firstLetStr + remLetStr + " ";
                    }
                }
            }
        } 
        return modifiedString;
    }
    
    public String formatDay(String a){
        String b = null;
        if(a != null){
            if(a.equals("MON")){
                b = "Monday";
            }else if(a.equals("TUES")){
                b = "Tuesday";
            }else if(a.equals("WED")){
                b = "Wednesday";
            }else if(a.equals("THURS")){
                b = "Thursday";
            }else if(a.equals("FRI")){
                b = "Friday";
            }else if(a.equals("SAT")){
                b = "Saturday";
            }else if(a.equals("SUN")){
                b = "Sunday";
            }
        }
        return b;
    }
    
    public String formatFullDay(String a){
        String b = null;
        if(a != null){
            if(a.equals("Monday")){
                b = "MON";
            }else if(a.equals("Tuesday")){
                b = "TUES";
            }else if(a.equals("Wednesday")){
                b = "WED";
            }else if(a.equals("Thursday")){
                b = "THURS";
            }else if(a.equals("Friday")){
                b = "FRI";
            }else if(a.equals("Saturday")){
                b = "SAT";
            }else if(a.equals("Sunday")){
                b = "SUN";
            }
        }
        return b;
    }
    
    public String formatTime(String a){
        String b = null;
        if(a != null){
            if(a.equals("07:00:00")){
                b = "7:00am";
            }else if(a.equals("08:00:00")){
                b = "8:00am";
            }else if(a.equals("09:00:00")){
                b = "9:00am";
            }else if(a.equals("10:00:00")){
                b = "10:00am";
            }else if(a.equals("11:00:00")){
                b = "11:00am";
            }else if(a.equals("12:00:00")){
                b = "12:00pm";
            }else if(a.equals("13:00:00")){
                b = "1:00pm";
            }else if(a.equals("14:00:00")){
                b = "2:00pm";
            }else if(a.equals("15:00:00")){
                b = "3:00pm";
            }else if(a.equals("16:00:00")){
                b = "4:00pm";
            }else if(a.equals("17:00:00")){
                b = "5:00pm";
            }else if(a.equals("18:00:00")){
                b = "6:00pm";
            }else if(a.equals("19:00:00")){
                b = "7:00pm";
            }
        }
        return b;
    }
    
    public String formatFullTime(String a){
        String b = null;
        if(a != null){
            if(a.equals("7:00am")){
                b = "07:00:00";
            }else if(a.equals("8:00am")){
                b = "08:00:00";
            }else if(a.equals("9:00am")){
                b = "09:00:00";
            }else if(a.equals("10:00am")){
                b = "10:00:00";
            }else if(a.equals("11:00am")){
                b = "11:00:00";
            }else if(a.equals("12:00pm")){
                b = "12:00:00";
            }else if(a.equals("1:00pm")){
                b = "13:00:00";
            }else if(a.equals("2:00pm")){
                b = "14:00:00";
            }else if(a.equals("3:00pm")){
                b = "15:00:00";
            }else if(a.equals("4:00pm")){
                b = "16:00:00";
            }else if(a.equals("5:00pm")){
                b = "17:00:00";
            }else if(a.equals("6:00pm")){
                b = "18:00:00";
            }else if(a.equals("7:00pm")){
                b = "19:00:00";
            }
        }
        return b;
    }
    
    public String formatToShortProgramme(String name){
        String programme = null;
        if(name.equals("Software Engineer")){
            programme = "SE";
        }else if(name.equals("Data Science")){
            programme = "DS";
        }else if(name.equals("Artificial Intelligence")){
            programme = "AI";
        }else if(name.equals("Computer System and Networking")){
            programme = "CSN";
        }else if(name.equals("Information System")){
            programme = "IS";
        }else if(name.equals("Multimedia")){
            programme = "MM";
        }else if(name.equals("ALL")){
            programme = "ALL";
        }
        
        return programme;
    }
    
    public String formatToFullProgramme(String name){
        String programme = null;
        if(name.equals("SE")){
            programme = "Software Engineer";
        }else if(name.equals("DS")){
            programme = "Data Science";
        }else if(name.equals("AI")){
            programme = "Artificial Intelligence";
        }else if(name.equals("CSN")){
            programme = "Computer System and Networking";
        }else if(name.equals("IS")){
            programme = "Information System";
        }else if(name.equals("MM")){
            programme = "Multimedia";
        }else if(name.equals("ALL")){
            programme = "ALL";
        }else{
            programme = "Error";
        }
        return programme;
    }

    public String formatToFullCategory(String name){
        String category = null;
        if(name.equals("UC")){
            category = "University Course";
        }else if(name.equals("KELF")){
            category = "KELF";
        }else if(name.equals("PCC")){
            category = "Programme Core Course";
        }else if(name.equals("FCC")){
            category = "Faculty Core Course";
        }else if(name.equals("FEC")){
            category = "Faculty Elective Course";
        }else if(name.equals("SEC")){
            category = "Specialisation Elective Course";
        }else if(name.equals("ALL")){
            category = "ALL";
        }else{
            category = "Error";
        }
        return category;
    }
}
