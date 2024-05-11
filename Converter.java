/**
 * Computing English language description for 12 hour clock
 * Author: Millicent Lesufi
 * 5 May  2024
 */

import java.util.HashMap;
import java.util.Scanner;

public class Converter
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            System.out.println("Enter a time or 'quit':");
            String choice = scanner.nextLine();
            if (!choice.equals("quit"))
            {
                
                HashMap<Integer, String> hours = new HashMap<>();
                hours.put(1, "one");
                hours.put(2, "two");
                hours.put(3, "three");
                hours.put(4, "four");
                hours.put(5, "five");
                hours.put(6, "six");
                hours.put(7, "seven");
                hours.put(8, "eight");
                hours.put(9, "nine");
                hours.put(10, "ten");
                hours.put(11, "eleven");
                hours.put(12, "twelve");

                // store minutes
                HashMap<Integer, String> minutes = new HashMap<>();
                minutes.put(0, "o'clock");
                minutes.put(5, "five past");
                minutes.put(10, "ten past");
                minutes.put(15, "quarter past");
                minutes.put(20, "twenty past");
                minutes.put(25, "twenty five past");
                minutes.put(30, "half past");
                minutes.put(35, "twenty five to");
                minutes.put(40, "twenty to");
                minutes.put(45, "quarter to");
                minutes.put(50, "ten to");
                minutes.put(55, "five to");

                // splitting the string into hour and minute parts
                String[] parts = choice.split(":");
                int hourPart = Integer.parseInt(parts[0]);
                int minutePart = Integer.parseInt(parts[1]);

                // converting the minutes to the nearest multiple of 5
                int convertedMinute = (int) (Math.round(minutePart / 5.0) * 5.0);

                for (Integer hour : hours.keySet())
                {
                    if (hour == hourPart)
                    {
                        for (Integer minute : minutes.keySet())
                        {
                            // works for the avtual times
                            if (minute == minutePart)
                            {
                                if (minutes.get(convertedMinute).endsWith("clock"))
                                {
                                    System.out.println(hours.get(hour) + " " + minutes.get(convertedMinute));
                                    break;
                                }
                                else if(minutes.get(convertedMinute).endsWith("to"))
                                {
                                    System.out.println(minutes.get(convertedMinute) +" "+ hours.get(hour+1));
                                    break;
                                }
                                    
                                else
                                {
                                    System.out.println(minutes.get(convertedMinute) + " " + hours.get(hour));
                                    break;
                                }
                                    
                            }
                            else if(minute==convertedMinute)
                            {
                                if(minutes.get(convertedMinute).endsWith("clock"))
                                {
                                    System.out.println("about " + hours.get(hour) + " " + minutes.get(convertedMinute));
                                    break;
                                }
                                else if(minutes.get(convertedMinute).endsWith("to"))
                                {
                                    System.out.println("about " + minutes.get(convertedMinute) +" "+ hours.get(hour+1));
                                    break;
                                } 
                                else
                                {
                                    System.out.println("about " + minutes.get(convertedMinute) + " " + hours.get(hour));
                                    break;
                                }   
                            }
                        }
                    }
                }
            }
            else
            {
                System.out.println("Done");
                break;
            }
        }
    }
}
