/**
 * This program displays the name dams that has a certain contribution percentage that is less
 * than the percentage of interest
 * Author: Millicent Lesufi
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Contribution 
{
    // this stores information about dams and their current level
    HashMap<String, Double> damInfo = new HashMap<String, Double>();
    ArrayList<String>  lists = new ArrayList<>();
    public static void main(String[] args)
    {
        Contribution cont = new Contribution();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the data file and percentage:");
        // reading input that has the filename and the percentage of interest
        String[] line = scanner.nextLine().split(" ");
        String file = line[0];
        double percentage = Double.parseDouble(line[1]);
        cont.loadFile(file);
        System.out.println("The total FSC is " + String.format("%.1f",cont.sum())+".");
        System.out.println("The dams that contribute less than " +  percentage+ " percent are:");

        for(String dam: cont.info().keySet())
        {
            if(cont.info().get(dam) < percentage)
            {
                if(!cont.isMin(cont.info()))
                    System.out.println(dam + " : " + String.format("%.1f",cont.info().get(dam)));
                else if(cont.isMin(cont.info()))
                {
                    System.out.println(dam + " : " + String.format("%.1f",cont.info().get(dam)));
                }
                
            }
        }


    }
    /**
     * This method reads the file 
     * and add each line to an arraylist
     * @param fileName file being read
     */
    public void loadFile(String fileName)
    {
        try
        {
            Scanner fileInput = new Scanner(new FileInputStream(fileName));
            while(fileInput.hasNextLine())
            {
                lists.add(fileInput.nextLine());
            }
            
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found");
            System.exit(0);
        }
    }

    /**
     * This method calculates the sum of the full supply capacity of all dams
     * @return the sum of the full supply capacity of all dams
     */
    public double sum()
    {
        String[] arraylist;
        double fullSupplyCapacity = 0;
        for(String list:lists)
        {
            arraylist = list.split(" "); 
            fullSupplyCapacity += Double.parseDouble(arraylist[2]);

        }
        return fullSupplyCapacity;
    }

    /**
     * this adds the dam information and their contribution percentage into a hashmap
     * @return hashmap containing the dam information and their percentage contribution
     */
    public HashMap<String,Double> info()
    {
        String[] arraylist;
        for(String list:lists)
        {
            arraylist = list.split(" ");
            // this is calculated as the full supply capacity of a dam multiply by a hundred
            // divided by the sum of all dams
            double contribution = ((Double.parseDouble(arraylist[2]))*100)/sum();
            damInfo.put(arraylist[0], contribution);
        }
        return damInfo;
    }

    /**
     * sorts the dams into order
     * they will be printed in ascending order based on percentage contribution
     * @param dams
     * @return
     */
    public boolean isMin(HashMap<String,Double> dams)
    {
        double prev=0;
        for(double value: dams.values())
        {
            if(value>prev)
            {
                return false;
            }
            prev = value;
        }
        return true;
    }
}
