/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
package matrix;

/**
 *
 * @author NEERAJ
 */

import java.util.Scanner;
/**
     * @param args the command line arguments
     */
public class Matrix {
	static void multiply(int m1[][],int m2[][])
	{int mat[][]=new int[m1.length][m1[0].length];
	int n=m1.length;
		System.out.println("Multiplying the matrices : ");
for(int i = 0; i < n; i++)
{
for(int j = 0; j < n; j++)
{
for(int k = 0; k < n; k++)
{
mat[i][j] = mat[i][j] + m1[i][k] * m2[k][j];
}
}
}
System.out.println("Product :");
for (int i = 0; i < n; i++)
{
for(int j = 0; j < n; j++)
{
System.out.print(mat[i][j] + " ");
}
System.out.println();
}
		
	}
	static void add(int M1[][],int M2[][])
	{int resMatrix[][]=new int[M1.length][M1[0].length];
		for(int i = 0; i < resMatrix.length; i++){
      for(int j = 0; j < resMatrix[i].length; j++){
        resMatrix[i][j] = M1[i][j] + M2[i][j];
      }
    }
	 System.out.println("Result Matrix : " );
        for (int i=0;i<M1.length;i++){
            for (int j=0;j<M1[i].length;j++) {
                System.out.print(" " + resMatrix[i][j] + "\t");
            }
            System.out.println();
            
        }
	}

    
    public static void main(String[] args) {
     
        
       int option=0;
	
    int rowM=0, colM=0;
    Scanner in = new Scanner(System.in);
    System.out.println("ENTER OPTION :1 FOR MULTIPLICARION AND 2 FOR ADDITION");
	option=in.nextInt();
	if(option==2){
    System.out.print("Enter Number of Rows and Columns of Matrix : ");
    rowM = in.nextInt();
    colM = in.nextInt();}
	if(option==1){
		 System.out.print("Enter BASE of Matrix : ");
		 int n=in.nextInt();
		 rowM=n;
		 colM=n;
	}
    
    int M1[][] = new int[rowM][colM];
    int M2[][] = new int[rowM][colM];

        
    System.out.print("Enter elements of First Matrix : ");
    
    for(int i = 0; i < rowM; i++){
      for(int j = 0; j < colM; j++){
        M1[i][j] = in.nextInt();
      }
    }
    System.out.println("First Matrix : " );
    for(int i = 0; i < rowM; i++){
      for(int j = 0; j < colM; j++){
        System.out.print(" " +M1[i][j]+"\t");
      }
      System.out.println();
    }
        
    System.out.print("Enter elements of Second Matrix : ");    
    for(int i = 0; i < rowM; i++){
      for(int j = 0; j < colM; j++){
        M2[i][j] = in.nextInt();
      }
	}
	
	if(option==2) add(M1,M2);//ADDITION
		  if(option==1)multiply(M1,M2);//MULTIPLICARION
		  
	  
    
        
    
    
        
  
   
        
        



in.close();
}
}
  

   
