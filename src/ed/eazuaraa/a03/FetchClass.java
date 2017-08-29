/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.eazuaraa.a03;

/**
 *
 * @author eazuara
 */
public abstract class FetchClass  {
    
   protected int[] vector;
   
   abstract int Fetch(int n);

    public int[] getVector() {
        return vector;
    }

    public void setVector(int[] vector) {
        this.vector = vector;
    }
    
    public int[] RandomV(int n){
       int[] vector = new int [n];
       
        for (int i=0; i<vector.length; i++){
         vector[i] = (int)(Math.random()*10);
        }
        return vector;
    }
    
    
    public String showVector(){
        String show;
        show = "[ ";
        for(int i=0;i<vector.length;i++){
            show = show + vector[i];
            if(i<vector.length-1){
                show = show + ", ";
            }
            
        }show = show + " ]";
        return show;
    }

    public void showFetch(int n){
        if(n==1){
        System.out.println("El numero no esta en el arrego");
                }else{
            System.out.println("El numero esta en la posicion"+n);
        }
          
}
}

