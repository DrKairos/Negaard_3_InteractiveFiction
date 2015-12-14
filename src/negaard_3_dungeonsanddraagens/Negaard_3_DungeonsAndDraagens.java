/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negaard_3_dungeonsanddraagens;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author DrKairos
 */
public class Negaard_3_DungeonsAndDraagens {

    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();
    static boolean goodAnswer = false;
    static String answer;
    static int PlayerHP = 50;
    static int PlayerGold = 0;
    static int PlayerStamina = 30;
    static int PlayerDamage = 5;
    static int PlayerXP = 0;
    static int SkeletonHP = 15;
    static int DemonHP = 20;
    static int ElementalHP = 30;
    static boolean playagain;
    static int counter = 5;
            

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        start();
    }

    public static void start() {
   


        System.out.println("Do you want to play a game?");
        answer = sc.nextLine().toLowerCase();
if(answer.contains("y")){
goodAnswer = true;
System.out.println("Great, let's go!");
System.out.println("What is your name?");
goodAnswer = true;
}


else if(answer.contains("n")) {
System.out.println("Why did you press start then?");
}

{
        
        String name = sc.nextLine();
        System.out.println("Hello " + name + ", Welcome to the town of Aelshire.");
        System.out.println("You receive a quest, but you must travel through a forest. What do you do?");
        System.out.println("Walk into the forest? (1)");
        System.out.println("Deny Quest (2)");
        answer = sc.nextLine().toLowerCase();
        if (answer.contains("1")) {
            goodAnswer = true;
            System.out.println("You enter the forest..");
            fightskeleton();
        } else if (answer.contains("2")) {
            goodAnswer = true;
            System.out.println("You go home");
        }
}
}
    
    public static void fightskeleton() {
        System.out.println("You run into a Skeleton! Fight? [1]");
        System.out.println("Run from Skeleton [2]");
        answer = sc.nextLine().toLowerCase();
        if (answer.contains("1")) {
            goodAnswer = true;
            System.out.println("Fighting Skeleton..");
          int number = rand.nextInt(6);
            System.out.println("You take "+ number +" damage from the Skeleton");
            System.out.println("-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            int PlayerStamina = rand.nextInt(11);
            int PlayerDamage = rand.nextInt(16);
            System.out.println("You use "+ PlayerStamina +" stamina and do "+ PlayerDamage+" damage to the Skeleton");
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=--=-=-");
            int PlayerGold = rand.nextInt(101);
            System.out.println("You defeat the Skeleton and aquire "+ PlayerGold +" gold!");
            fightdemon();
        
        } else if (answer.contains("2")) {
        goodAnswer = true;
        System.out.println("You go home");
    }
        }
    
    public static void fightdemon() {
        System.out.println("----------------------------");
        System.out.println("Continue walking forward? [1]");
        System.out.println("Go home? [2]") ;
        answer = sc.nextLine().toLowerCase();
        if (answer.contains("1")) {
            goodAnswer = true;
            System.out.println("You encounter a Demon! Fight? [1]");
            System.out.println("Run from Demon [2]");
            answer = sc.nextLine().toLowerCase();
            if (answer.contains("1")) {
                goodAnswer =true;
                System.out.println("Fighting Demon..");
                  int number = rand.nextInt(6);
            System.out.println("You take "+ number +" damage from the Demon");
            System.out.println("-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            int PlayerStamina = rand.nextInt(11);
            int PlayerDamage = rand.nextInt(16);
            System.out.println("You use "+ PlayerStamina +" stamina and do "+ PlayerDamage +" damage to the Demon");
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=--=-=-");
            int PlayerGold = rand.nextInt(101);
            System.out.println("You defeat the Demon and aquire "+ PlayerGold +" gold!");
            shopkeeper();
            
             } else if (answer.contains("2")) {
            goodAnswer = true;
            System.out.println("You run from the Demon");
            }
       
        } else if (answer.contains("2")) {
            goodAnswer = true;
            System.out.println("You go home");
        }
    }  
     public static void shopkeeper() {
        System.out.println("-----------------------------");
        System.out.println("You find a Shop Keeper! Shop?");
        System.out.println("Yes [1]"); 
        System.out.println("No [2]");
        answer = sc.nextLine().toLowerCase();
      
         if (answer.contains("1")) {
        goodAnswer = true;
        System.out.println("-Welcome to the shop-");
            System.out.println("Buy Iron Helmet (50 gold) [1]");
            System.out.println("Buy Elderwood Bow (100 gold) [2]");
            System.out.println("Buy Long Sword (70 gold) [3]");
           
            answer = sc.nextLine().toLowerCase();
            if (answer.contains("1")) {
                goodAnswer = true;
                System.out.println("You purchase the Iron Helmet (-50 Gold)");
                fightelemental();
            
            answer = sc.nextLine().toLowerCase();
            } else if (answer.contains("2")) {
                goodAnswer = true;
                System.out.println("You purchase the Elderwood Bow (-100 Gold)");
                fightelemental();
             
            answer = sc.nextLine().toLowerCase();
            } else if (answer.contains("3")) {
                goodAnswer = true;
                System.out.println("You purchase the Long Sword (-70 Gold)");
                fightelemental();
            } 
         if (answer.contains("2")) {
         goodAnswer = true;
         System.out.println("Ok");
         
        }
         }
    }
    

    
    public static void fightelemental() {
        System.out.println("----------------------------");
        System.out.println("Continue walking forward? [1]");
        System.out.println("Go home? [2]") ;
        answer = sc.nextLine().toLowerCase();
        if (answer.contains("1")) {
            goodAnswer = true;
            System.out.println("You encounter an Elemental Wraith!");
            System.out.println("Do you wish to fight this boss? Yes [1] No [2]");
            answer = sc.nextLine().toLowerCase();
            if (answer.contains("1")) {
                goodAnswer =true;
                System.out.println("Fighting Elemental Wraith..");
                  int number = rand.nextInt(20);
            System.out.println("You take "+ number +" damage from the Elemental Wraith");
            System.out.println("-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            int PlayerStamina = rand.nextInt(16);
            int PlayerDamage = rand.nextInt(26);
            System.out.println("You use "+ PlayerStamina +" stamina and do "+ PlayerDamage+" damage to the Elemental Wraith");
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=--=-=-");
            int PlayerGold = rand.nextInt(101);
            System.out.println("You defeat the Elemental Wraith and aquire "+ PlayerGold +" gold!");
            win();
            }
        } else if (answer.contains("2")) {
            goodAnswer = true;
            System.out.println("Run from Elemental Wraith");
            int number = rand.nextInt(8);
            System.out.println("You take "+ number +" damage from the Elemental Wraith");
            win();
        } 
    }
    
    public static void win() {
    System.out.println("-------------------");
    int PlayerGold = rand.nextInt(501);
    int PlayerXP = rand.nextInt(101);
    System.out.println("You gain "+ PlayerGold +" gold and "+ PlayerXP +" XP!");
    System.out.println("Level up! (Level 2)");
    System.out.println("-End of Dungeon 1-");
}
   
           }
    

       
    



  
