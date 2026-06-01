import java.util.*;
public class patterns{
    public static void main(String[] args){
        //square
        Scanner input = new Scanner(System.in);
        System.out.println("Enter square length");
        int n = input.nextInt();
        for(int i = 1;i <=n;i++){
            for(int j = 1;j<=n;j++){
              System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        int x = 4;
        int y = 5;
        rectangle(x,y);
        System.out.println();
        hollowsquare();
        System.out.println();
        halfpyramid();
        System.out.println();
        revhalfpyramid();
        System.out.println();
        rotatehalfpyramid();
        System.out.println();
        halfpyramidnums();
        System.out.println();
        halfpyramidrevnums();
        System.out.println();
        halfpyramidrevnumsalt();
        System.out.println();
        pyramidincrnum();
        System.out.println();
        halfpyramidbits();
        System.out.println();
        butterfly();
        System.out.println();
        rhombus();
        System.out.println();
        pyramid();
        System.out.println();
        pyramidstars();
        System.out.println();
        palindromicpyramid();
}
//rectangle
public static void rectangle(int x,int y){
for(int i =1;i<=x;i++){
            for(int j =1;j<= y;j++){
                System.out.print("*");
            }
             System.out.println();
        }
}
//hollowsquare
public static void hollowsquare(){
    int n =4;
    int m =5;
    for(int i = 1;i<=n;i++){
        for (int j = 1;j<=m;j++){
            if(i==1||j==1||i==n||j==m){
                System.out.print("*");
            }else{
            System.out.print(" ");}
        }
        System.out.println();
    }
}
//halfpyramid with stars
public static void halfpyramid(){
    int n = 5;
    for(int i =1;i<=n;i++){
        for(int j =1;j<=i;j++){
            System.out.print("*");
        }
    System.out.println();
    }
}
//upside down half pyramid
public static void revhalfpyramid(){
   int n=5;
   for(int i =n;i>=1;i--){
    for(int j =1;j<=i;j++){
        System.out.print("*");
   }
   System.out.println();
}

}
// half pyramid right aligned
public static void rotatehalfpyramid(){
    int n=4;
    for(int i =1 ;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");}

            for(int k =1;k<=i;k++){
                System.out.print("*");
        }
    System.out.println();
}
}
//half pyramid with numbers
public static void halfpyramidnums(){
    int n =5;
    for(int i =1;i<=n;i++){
        for(int j =1;j<=i;j++){
           System.out.print(j+" ");}
    
    System.out.println();}
}
//upside down half pyramid with numbers
public static void halfpyramidrevnums(){
    int n =5;
    for(int i =n;i>=1;i--){
        for(int j =1;j<=i;j++){
          System.out.print(j+" ");
        }
        System.out.println();
    }
}
//alternate method to print upside down pyramid with numbers
public static void halfpyramidrevnumsalt(){
    int n =5;
    for(int i =1;i<=n;i++){
        for(int j=1;j<=n-i+1;j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }
}
//half pyramid with increasing numbers
public static void pyramidincrnum(){
    int n = 5;
    int counter = 1;
    for(int i =1;i<=n;i++){
     for(int j =1;j<=i;j++){
        System.out.print(counter+" ");
        counter++;
     }
     System.out.println();
    }
}
//half pyramid with 0s and 1s
public static void halfpyramidbits(){
    int n =5;
    for(int i =1;i<=n;i++){
        for(int j =1;j<=i;j++){
          if((i+j)%2 ==0){
            System.out.print(0);}
          else{
            System.out.print(1);
          }
        }
        System.out.println();
}

}
//butterfly pattern
public static void butterfly(){
    int n =5;
    //UPPER HALF
    //outer loop  = rows
    for(int i=1;i<=n;i++){

        //inner loop stars printing on the left side
        for(int j =1;j<=i;j++){
            System.out.print("*");
        }
        //inner loop for spaces
        int spaces = 2 * (n-i);
        for(int j =1;j<=spaces;j++){
            System.out.print(" ");
        }
         //inner loop stars printing on the right side
        for(int j =1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    //LOWER HALF
    //outer loop for rows
    for(int i=n;i>=1;i--){
        
        //inner loop stars printing on the left side
        for(int j =1;j<=i;j++){
            System.out.print("*");
        }
        //inner loop for spaces
        int spaces = 2 * (n-i);
        for(int j =1;j<=spaces;j++){
            System.out.print(" ");
        }
         //inner loop stars printing on the right side
        for(int j =1;j<=i;j++){
            System.out.print( "*");
        }
        System.out.println();
    }
}
//solid rhombus
public static void rhombus(){
    int n =5;
    for(int i =1;i<=n;i++){
        //inner loop for spacing
        int spaces = n - i;
        for(int j = 1;j<=spaces;j++){
            System.out.print(" ");
        }
        //inner loop for stars
        for(int j =1;j<=n;j++){
            System.out.print("*");
    }
    System.out.println();
}
}
//full pyramid with numbers
public static void pyramid(){
    int n =5;
    for(int i=1;i<=n;i++){
       //loop for spaces
       for(int j =1;j<= n-i;j++){
        System.out.print(" ");
       }
       for(int j =1;j<=i;j++){
        System.out.print(i +" ");
       }
       System.out.println();
    }
}
public static void pyramidstars(){
    int n =5;
    for(int i =1;i<=n;i++){
        for(int j =1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j =1;j<=i;j++){
            System.out.print("*"+" ");
    }
    System.out.println();
    }
}
public static void palindromicpyramid(){
    int n =5;
   for(int i =1;i<=n;i++){
    for(int j =1;j<=n-i;j++){
        System.out.print(" ");
    }
    for(int j = i;j>=1;j--){
        System.out.print(j);
    }
    for(int j =2;j<=i;j++){
        System.out.print(j);
    }
    System.out.println();
   }
}
}