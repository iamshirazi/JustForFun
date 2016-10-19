/*
 * Author: Matthew Shirazi
 * This program will calculate the amount of money you must pay for a phone plan.
 * 98% correct.
 */
package ca.hdsb.gwss.shirazi.ics3u.u4;

import java.util.Scanner;
import java.text.NumberFormat;

/**
 *
 * @author Matthew
 */
public class CellSell {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        final double PLAN_A_DAYTIME_COST = 0.25;
        final double PLAN_B_DAYTIME_COST = 0.45;
        final double PLAN_A_EVENING_COST = 0.15;
        final double PLAN_B_EVENING_COST = 0.35;
        final double PLAN_A_WEEKEND_COST = 0.20;
        final double PLAN_B_WEEKEND_COST = 0.25;        
        
        
        // VARIABLES
        double daytimeMinutes;        
        double eveningMinutes;        
        double weekendMinutes;
        double costPlanA, costPlanB;
               
        String cell;
        
        Scanner input = new Scanner(System.in);       
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        // INPUT
        System.out.println("Enter the Number of Daytime Minutes.");
        daytimeMinutes = input.nextInt();

        System.out.println("Enter the Number of Evening Minutes.");
        eveningMinutes = input.nextInt();

        System.out.println("Enter the Number of Weekend Minutes.");
        weekendMinutes = input.nextInt();

        // PROCESSING
        costPlanA = (eveningMinutes * PLAN_A_EVENING_COST) + (weekendMinutes * PLAN_A_WEEKEND_COST);
        if( daytimeMinutes > 100 ) {
            costPlanA = costPlanA + (daytimeMinutes - 100)* PLAN_A_DAYTIME_COST;
        }    
        costPlanB = (eveningMinutes * PLAN_B_EVENING_COST) + (weekendMinutes * PLAN_B_WEEKEND_COST);
        if  ( daytimeMinutes > 250 ) {
            costPlanB = costPlanB + (daytimeMinutes -250) * PLAN_B_WEEKEND_COST;
        }
        
        
//        double A = Math.abs((daytimeMinutes * PLAN_A_DAYTIME_COST) + (eveningMinutes * PLAN_A_EVENING_COST) + (weekendMinutes * w));
//        double B = Math.abs((daytimeMinutes * PLAN_B_DAYTIME_COST) + (eveningMinutes * ee) + (weekendMinutes * ww));
//
//        if (daytimeMinutes >= 100) {
//            A = Math.abs(((daytimeMinutes - 100) * PLAN_A_DAYTIME_COST) + (eveningMinutes * PLAN_A_EVENING_COST) + (weekendMinutes * w));
//        }
//        if (daytimeMinutes >= 250) {
//            B = Math.abs(((daytimeMinutes - 250) * PLAN_B_DAYTIME_COST) + (eveningMinutes * ee) + (weekendMinutes * ww));
//        }
//        if (daytimeMinutes < 100) {
//            A = Math.abs(((daytimeMinutes - daytimeMinutes) * PLAN_A_DAYTIME_COST) + (eveningMinutes * PLAN_A_EVENING_COST) + (weekendMinutes * w));
//        }
//        if (daytimeMinutes < 250) {
//            B = Math.abs(((daytimeMinutes - daytimeMinutes) * PLAN_B_DAYTIME_COST) + (eveningMinutes * ee) + (weekendMinutes * ww));
//        }

        // OUTPUT
        System.out.println("Plan A Costs " + money.format(costPlanA));

        System.out.println("Plan B Costs " + money.format(costPlanB));
      
        if (costPlanA == costPlanB) {
            System.out.println("Plan A and Plan B are the Same Price ");
        }
        
        if (costPlanA < costPlanB) {
            System.out.println("Plan A is Cheapest.");
        }
        if (costPlanA > costPlanB) {
            System.out.println("Plan B is Cheapest.");
        }
   
    }

}
