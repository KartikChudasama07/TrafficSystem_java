public class TrafficSignal {

    // THE FOLLOWING ARE THE ANSI COLOR CODES USED TO APPLY COLORS(BACKGROUND COLORS) IN TERMINAL --

        final static String Brightred = "\u001b[31;1m";
        final static String Brightyellow = "\u001b[33;1m";
        final static String Brightgreen = "\u001b[32;1m";
        final static String Brightwhite = "\u001b[37;1m";
        final static String Backgroundblack = "\u001b[40m";
        final static String Green = "\u001b[42m";
        final static String Red = "\u001b[41m";
        final static String Yellow = "\u001b[43m";
        final static String White = "\u001B[47m";
        final static String Black = "\u001b[40;1m";
        final static String Reset = "\u001b[0m";
        
    // FOLLOWING IS THE FIRST FUNCTION CALLED FROM MAIN FUNCTION TO TURN SIGNAL ON 
    // IT DISPLAYS THE SIGNAL WITH ALL LIGHTS ON.
    public static void TurnOnSignal(){        
        System.out.print("\n");    
        System.out.println("___  THIS PROGRAM DEPICTS A TRAFFIC SYSTEM FOR A CROSSROAD  ____");
        System.out.print("\n");  

        // PRINTING PATTERN OF THE TRAFFIC SIGNAL FOR ALL LIGHTS ON.
        for(int i=1;i<=13;i++){
            for(int j=1;j<=13;j++){
                if((i<9 && j<5)||(j>9 && i<9))
                    System.out.print(Reset + "  ");  
                    
                else if(i==1 || i==5 || i==9 || i ==13 || j==1 || j==5 || j==9 || j==13)
                    System.out.print(Black + Brightwhite + "  ");
                    
                else if(i>9 && i<13 && j>1 && j<5)
                    System.out.print(Green + Brightwhite + "  ");  
                    
                else if(i>1 && i<5 && j>5 && j<9)
                    System.out.print(Red + Brightwhite + "  ");
                    
                else if(i>5 && i<9 && j>5 && j<9)
                    System.out.print(Yellow + Brightwhite + "  ");

                else if(i>9 && i<13 && j>5 && j<9)
                    System.out.print(Green + Brightwhite + "  ");
                    
                else if(i>9 && i<13 && j>9 && j<13)
                    System.out.print(Green + Brightwhite + "  ");
            }
            System.out.print("\n");

        }
        // HERE THE FUCNTION CAN BE DELAY FOR THE GIVEN TIME(MILISECONDS) 
        // IT DIPICTS THAT ALL LIGHTS ARE BEEN ON FOR THE GIVEN TIME.
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        RedSignal();
    }

    // FOLLOWING IS A FUNCTION CALLED BY THE TurnOnSignal() ie. PREVIOUS FUNCTION.
    // IT DISPLAYS THE SIGNAL WITH RED LIGHT ON.
    public static void RedSignal(){        
        System.out.print("\033c");      // CLEARS THE TERMINAL(OUTPUT FROM PREVIOUS FUNCTION),  
        System.out.print("\n\n");    
        System.out.println("___  THIS PROGRAM DEPICTS A TRAFFIC SYSTEM FOR A CROSSROAD  ____");
        System.out.print("\n"); 

        // PRINTING PATTERN OF THE TRAFFIC SIGNAL FOR RED LIGHT ON. 
        for(int i=1;i<=13;i++){
            for(int j=1;j<=13;j++){
                if((i<9 && j<5)||(j>9 && i<9))
                    System.out.print(Reset + "  ");  
                    
                else if(i==1 || i==5 || i==9 || i ==13 || j==1 || j==5 || j==9 || j==13)
                    System.out.print(Black + Brightwhite + "  ");
                    
                else if(i>9 && i<13 && j>1 && j<5)
                    System.out.print(White + Brightwhite + "  ");  
                    
                else if(i>1 && i<5 && j>5 && j<9)
                    System.out.print(Red + Brightwhite + "  ");
                    
                else if(i>5 && i<9 && j>5 && j<9)
                    System.out.print(White + Brightwhite + "  ");

                else if(i>9 && i<13 && j>5 && j<9)
                    System.out.print(White + Brightwhite + "  ");
                    
                else if(i>9 && i<13 && j>9 && j<13)
                    System.out.print(White + Brightwhite + "  ");
            }
            System.out.print("\n");
        }
        // HERE THE FUCNTION CAN BE DELAY FOR THE GIVEN TIME(MILISECONDS) 
        // IT DIPICTS THAT RED LIGHT IS BEEN ON FOR THE GIVEN TIME.
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LeftGreensignal();
    }

    // FOLLOWING IS A FUNCTION CALLED BY THE RedSignal() ie. PREVIOUS FUNCTION.
    // IT DISPLAYS THE SIGNAL WITH LEFT GREEN LIGHT ON.
    public static void LeftGreensignal(){        
        System.out.print("\033c");
        System.out.print("\n\n");    
        System.out.println("___  THIS PROGRAM DEPICTS A TRAFFIC SYSTEM FOR A CROSSROAD  ____");
        System.out.print("\n");  

        // PRINTING PATTERN OF THE TRAFFIC SIGNAL FOR LEFT GREEN LIGHT ON. 
        for(int i=1;i<=13;i++){
            for(int j=1;j<=13;j++){
                if((i<9 && j<5)||(j>9 && i<9))
                    System.out.print(Reset + "  ");  
                    
                else if(i==1 || i==5 || i==9 || i ==13 || j==1 || j==5 || j==9 || j==13)
                    System.out.print(Black + Brightwhite + "  ");
                    
                else if(i>9 && i<13 && j>1 && j<5)
                    System.out.print(Green + Brightwhite + "  ");  
                    
                else if(i>1 && i<5 && j>5 && j<9)
                    System.out.print(Red + Brightwhite + "  ");
                    
                else if(i>5 && i<9 && j>5 && j<9)
                    System.out.print(White + Brightwhite + "  ");

                else if(i>9 && i<13 && j>5 && j<9)
                    System.out.print(White + Brightwhite + "  ");
                    
                else if(i>9 && i<13 && j>9 && j<13)
                    System.out.print(White + Brightwhite + "  ");
            }
            System.out.print("\n");
        }
        // HERE THE FUCNTION CAN BE DELAY FOR THE GIVEN TIME(MILISECONDS) 
        // IT DIPICTS THAT LEFT GREEN LIGHT IS BEEN ON FOR THE GIVEN TIME.
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        YellowSignal();
    }

    // FOLLOWING IS A FUNCTION CALLED BY THE LeftGreensignal() ie. PREVIOUS FUNCTION.
    // IT DISPLAYS THE SIGNAL WITH YELLOW LIGHT ON.
    public static void YellowSignal(){        
        System.out.print("\033c");
        System.out.print("\n\n");    
        System.out.println("___  THIS PROGRAM DEPICTS A TRAFFIC SYSTEM FOR A CROSSROAD  ____");
        System.out.print("\n");  

        // PRINTING PATTERN OF THE TRAFFIC SIGNAL FOR YELLOW LIGHT ON. 
        for(int i=1;i<=13;i++){
            for(int j=1;j<=13;j++){
                if((i<9 && j<5)||(j>9 && i<9))
                    System.out.print(Reset + "  ");  
                    
                else if(i==1 || i==5 || i==9 || i ==13 || j==1 || j==5 || j==9 || j==13)
                    System.out.print(Black + Brightwhite + "  ");
                    
                else if(i>9 && i<13 && j>1 && j<5)
                    System.out.print(Green + Brightwhite + "  ");  
                    
                else if(i>1 && i<5 && j>5 && j<9)
                    System.out.print(White + Brightwhite + "  ");
                    
                else if(i>5 && i<9 && j>5 && j<9)
                    System.out.print(Yellow + Brightwhite + "  ");

                else if(i>9 && i<13 && j>5 && j<9)
                    System.out.print(White + Brightwhite + "  ");
                    
                else if(i>9 && i<13 && j>9 && j<13)
                    System.out.print(White + Brightwhite + "  ");
            }
            System.out.print("\n");
        }
        // HERE THE FUCNTION CAN BE DELAY FOR THE GIVEN TIME(MILISECONDS) 
        // IT DIPICTS THAT YELLOW LIGHT IS BEEN ON FOR THE GIVEN TIME.
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        GreenSignal();
    }

    // FOLLOWING IS A FUNCTION CALLED BY THE YellowSignal() ie. PREVIOUS FUNCTION.
    // IT DISPLAYS THE SIGNAL WITH ALL GREEN LIGHTS ON.
    public static void GreenSignal(){        
        System.out.print("\033c");
        System.out.print("\n\n");    
        System.out.println("___  THIS PROGRAM DEPICTS A TRAFFIC SYSTEM FOR A CROSSROAD  ____");
        System.out.print("\n");  
        
        // PRINTING PATTERN OF THE TRAFFIC SIGNAL FOR ALL GREEN LIGHTS ON. 
        for(int i=1;i<=13;i++){
            for(int j=1;j<=13;j++){
                if((i<9 && j<5)||(j>9 && i<9))
                    System.out.print(Reset + "  ");  
                    
                else if(i==1 || i==5 || i==9 || i ==13 || j==1 || j==5 || j==9 || j==13)
                    System.out.print(Black + Brightwhite + "  ");
                    
                else if(i>9 && i<13 && j>1 && j<5)
                    System.out.print(Green + Brightwhite + "  ");  
                    
                else if(i>1 && i<5 && j>5 && j<9)
                    System.out.print(White + Brightwhite + "  ");
                    
                else if(i>5 && i<9 && j>5 && j<9)
                    System.out.print(White + Brightwhite + "  ");

                else if(i>9 && i<13 && j>5 && j<9)
                    System.out.print(Green + Brightwhite + "  ");
                    
                else if(i>9 && i<13 && j>9 && j<13)
                    System.out.print(Green + Brightwhite + "  ");
            }
            System.out.print("\n");
        }
        // HERE THE FUCNTION CAN BE DELAY FOR THE GIVEN TIME(MILISECONDS) 
        // IT DIPICTS THAT ALL GREEN LIGHTS ARE BEEN ON FOR THE GIVEN TIME.
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        RedSignal();        // THE FUNCTION RedSignal() IS CALLED SO THE CODE CONTINUES INSTEAD OF RETURNING TO MAIN FUNCTION. 
    }

    public static void main(String[] args){
        
        // SINCE THE CODE NEVER RETURNS BACK TO THE MAIN FUNCTION, IT CAN EITHER BE TURNED 'ON' OR 'OFF'.
        TurnOnSignal(); 
        
        // RedSignal();
        // LeftGreensignal();
        // YellowSignal();
        // GreenSignal();
        return ;
    }
}

// STRUCTURE PATTERN FOR SIGNAL 

//          0 0 0 0 0          1
//          0       0          2
//          0       0          3
//          0       0          4
//          0 0 0 0 0          5
//          0       0          6
//          0       0          7
//          0       0          8
//  0 0 0 0 0 0 0 0 0 0 0 0 0  9 
//  0       0       0       0  10
//  0       0       0       0  11
//  0       0       0       0  12
//  0 0 0 0 0 0 0 0 0 0 0 0 0  13

//  1 2 3 4 5 6 7 8 9 0 1 2 3    
