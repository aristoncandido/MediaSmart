
package com.mycompany.mediainteligentes;

import java.util.Scanner;


public class MediaInteligentes {

    public static void main(String[] args) {
          Scanner tec =new Scanner(System.in);
      
        System.out.println("Quantos alunos deseja calcular a média?");
        int q_aluno =  tec.nextInt();
        double media = 0;
        String alunos = null;
        
        
        
        for(int i = 1; i <=q_aluno; i++){
            System.out.println("--->Média do Aluno "+i+"°<---"  );
            for (int j = 1; j <= 2; j++) {
                System.out.println("Digite "+j+"° a nota:");
                  double nota =  tec.nextInt();
                  nota += nota;
                  media = nota;
                  media =(media)/2;
                 
                  
                  
                  
                  
                  
                  
                
            }
             alunos = "Aluno "+i+"° -> MÉDIA: "+media;
             System.out.println("------------");
             System.out.println(alunos);
             System.out.println("------------");
        }
        
       
        
    }
}
