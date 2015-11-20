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
    static int PlayerHP;
    static int PlayerGold;
    static int PlayerStamina;
    static int PlayerDamage;
    static int SkeletonHP;
    static int DemonHP;
    static int ElementalHP;
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
System.out.println("What is your name?");
} else if(answer.contains("n"));

goodAnswer = true;
{
        
        String name = sc.nextLine();
        System.out.println("Hello " + name + ", Welcome to the town of Aelshire.");
        System.out.println("You receive a quest, but you must travel through a forest. What do you do?");
        System.out.println("Drink Health Potion? (1)");
        System.out.println("Drink Stamina Potion? (2)");
        System.out.println("Walk into the forest? (3)");
        System.out.println("Deny Quest (4)");
        answer = sc.nextLine().toLowerCase();
        if (answer.contains("1")) {
            goodAnswer = true;
            System.out.println("You feel healthy");
        } else if (answer.contains("2")) {
            goodAnswer = true;
            System.out.println("You feel refreshed");
        } else if (answer.contains("3")) {
            goodAnswer = true;
            System.out.println("You enter the forest..");
            fight();
        } else if (answer.contains("4")) {
            goodAnswer = true;
            System.out.println("You go home");
        }
}
}
    
    public static void fight() {
        System.out.println("You run into a Skeleton! Fight? (1)");
        System.out.println("Run from Skeleton (2)");
        answer = sc.nextLine().toLowerCase();
        if (answer.contains("1")) {
            goodAnswer = true;
            System.out.println("Fighting Skeleton..");
          int number = rand.nextInt(6);
            System.out.println("You take "+ number +" damage from the Skeleton");
            System.out.println("-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            int PlayerStamina = rand.nextInt(11);
            int PlayerDamage = rand.nextInt(16);
            System.out.println("You use "+ PlayerStamina +" stamina and do "+ PlayerDamage+" to the skeleton");
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            int PlayerGold = rand.nextInt(101);
            System.out.println("You defeat the Goblin and aquire "+ PlayerGold +" gold!");
        
        } else if (answer.contains("2")) {
        goodAnswer = true;
        System.out.println("You go home");
    }
        }
   
}
    




//You continue walking forward
//You encounter a Skeleton! Fight?
//Fight Skeleton..
//Run from Skeleton
//Take ? damage from Skeleton
//You use 7 Stamina
//You defeat the Skeleton! Aquire 80 gold and a Short Sword!
//You continue walking forward
//You find a shop keeper
//Buy Iron Helmet (50 gold)
//Buy Elderwood Bow (100 gold)
//Buy Long Sword (70 gold)
//You encounter an Elemental Wraith! (30 HP)
//Flee from Elemental Wraith?
//Take 7 damage from Elemental Wraith
//Fight Elemental Wraith? 
//Take 15 damage from Elemental Wraith (44 HP)
//You do 12 damage to the Elemental Wraith
//You use 8 Stamina
//Take 6 damage from Elemental Wraith
//You do 10 damage to the Elemental Wraith (38)
//You use 6 Stamina (5 S)
//Take 9 damage from Elemental Wraith (29 HP)
//You use 5 Stamina
//Elemental Wraith is defeated!
//You gain 500 gold and 100 XP! Level up! (Level 2)
//End of Dungeon 1

//static boolean goo dAnswer = false;
//public static void start(){
//while(!goodAnswer);
//System.out.println("Do you want to play a game?");
//answer = eli.nextline().toLowerCase();
//static boolean goodAnswer;
//if(answer.contains("y")){
//goodAnswer = true;
//System.out.println("Great, let's go!);
//} else if(answer.contains("n"));
//goodAnswer = true;
//System.out.println("Bye!");
//} else {
//System.out.println("I don't understand.");
//}
