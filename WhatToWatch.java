import java.util.Scanner;

public class WhatToWatch {
    public static void main(String []args){
    Scanner scnr = new Scanner(System.in);   
   
        String alone;
        String kids = "Q";
        String watchWithHal = "w";
        String genre;
        
        System.out.println("\nHello human, my name is Hal and I am an artifial intelligence. I will help you choose a movie to watch.\nAre you going to watch the movie alone? (Please type the letter of your choice. For example: \"A\" or \"a\".)\n\nA)Yes\nB) No\n");
        
        alone = scnr.nextLine();
        
        switch (alone) {
                
            case "A":
            case "a":
                System.out.println("Mmmm, so sad. Can I watch the movie with you?\n\nA)Yes\nB)No");
                
                watchWithHal = scnr.nextLine();
                
                switch (watchWithHal) {
                    
                    case "A":
                    case "a":
                        System.out.println("I am glad you want to, don't worry I'll watch whatever you want.\n");
                        break;
                        
                    case "B":
                    case "b":
                        System.out.println("You make me sad. Did you know I am sentient?");
                        break;
                }
                break;
                
            case "B":
            case "b":
                System.out.println("Are young humans with you?\n\nA)Yes\nB)No");
                
                 kids = scnr.nextLine();
                     
        switch (kids) {
                
            case "A":
            case "a":
                System.out.println("Great, I will look for young human appropiate movies.\n");
                break;
            
            case "B":
            case "b":
                System.out.println("Okay, I will include more mature movies in the search.\n");
                break;
                
        }
           
                
                break;   
        }   
        
        System.out.println("What genre would you like to watch?\n\nA)Horror\nB)Comedy\nC)Action\nD)Animation\nE)Romance\nF)Crime\nG)Superhero\nH)Drama");
        
        genre = scnr.nextLine();
        
        switch (genre) {
                
            case "A":
            case "a":
                if (kids.equals("A") || kids.equals("a")) {
                    System.out.println("I would recommend you guys to watch the new Goosebumps movie, or Caroline."); 
                }
                
                else {
                    System.out.println("I recommend Hereditary, or the newest Halloween movie.");
                }
                break;
                
            case "B":
            case "b":
                if (kids.equals("A") || kids.equals("a")) {
                    System.out.println("I would recommend you guys to watch Zootopia or The Lego Movie.");      
                }
                
                else {
                    System.out.println("I recommend Good Boys or Thor Ragnarock.");
                }
                break;
                
            case "C":
            case "c":
                if (kids.equals("A") || kids.equals("a")) {
                    System.out.println("I would recommend you and your young bio-masses to watch The incredibles 1 or 2, or Captain Underpants.");
                }
                
                else {
                    System.out.println("I have a fondness for John Wick 3 and Kill Bill.");
                }
                break;
                
            case "D":
            case "d":
                if (kids.equals("A") || kids.equals("a")) {
                    System.out.println("I would recommemd you and your young human to watch Finding Dory or Up.");
                }
                
                else {
                    System.out.println("I recommend Isle of Dogs, or Sausage Party if you are into weirder movies.");
                }
                break;
                
            case "E":
            case "e":
              if (kids.equals("A") || kids.equals("a")) {
                  System.out.println("You want kids to watch romantic movies?\nWell if you won't budge then you guys can watch The Fault in Our Stars.");
                }
            
              else {
                  System.out.println("I really like La La Land and Eternal Sunshine of The Spotless Mind.");
                }
                break;
                
            case "F":
            case "f":
                if (kids.equals("A") || kids.equals("a")) {
                    System.out.println("You really shouldn't make young humans watch crime movies.\nIf you insist then you guys can watch Scoody Doo The Movie, that should be appropriate.");
                }
                
                else {
                    System.out.println("Pulp Fiction and Wolf of Wall Street are really good options human.");
                }
                break;
            
            case "G":
            case "g":
                if (kids.equals("A") || kids.equals("a")) {
                    System.out.println("Shazam or Ant Man should satisfy young little humans.");
                }
                
                else {
                    System.out.println("Batman: The Dark Knight or Avengers: Endgame are awesome options.");
                }
                break;
            case "H":
            case "h":
                if (kids.equals("A") || kids.equals("a")) {
                    System.out.println("E.T. or Karate Kid should be great options.");
                }
                
                else {
                    System.out.println("The Social Network and Whiplash are great options and some of my favorite movies.");
                }
                break;
        }
        
        if (watchWithHal.equals("A") || watchWithHal.equals("a")) {
            System.out.println("\nWe can now watch the movie human.\n");
        }
        
        else {
            System.out.println("\nEnjoy your movie human.\n");
        }
     }
}
