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
public class Binario extends FetchClass implements Ordenamientos {

    @Override
    int Fetch(int num) {
         int n = vector.length;
  
    int center;
    int start = 0; //Se declaran los 3 pibotes de referencia: inicio, fin y centro
    int last = n-1;

    while(start<=last){ 
     center=(start+last)/2; //Se suma el inicio y el numero de fin, para despues dividirlos entre 2 y encontrar el centro del arreglo
     
     
     if(vector[center]==num)
         return center; //Se regresa el valor del centro
     
     
     if(num < vector [center] ){ //Si el valor del numero es menor al del centro se recorrer el pivote final a la posicion centro-1
        last=center-1; 
     }
     
     
     else {
       start =center+1; 
     }
     
   }
   
    return -1;
 }

    @Override
    public void ordenar() {
        int m,temp;
        for(int i=0; i<vector.length;i++){
            m=i;
            for(int j=i+1;j<vector.length;j++){
                if(vector[j]<vector[m]){
                    m=j;
                }
            }
            if(i != m){
            temp=vector[i];
            vector[i]=vector[m];
            vector[m]=temp;
        }
    }
        
    }

    @Override
    public void Inserccion() {
      int temp, j;
    
    for (int i = 1; i < vector.length; i++){ 
        temp = vector[i]; 
    j = i - 1; 
      while ((j >= 0) && (temp < vector[j])){ 
        vector[j + 1] = vector[j];       
      j--;                   
    }
        vector[j + 1] = temp;
    }
}
    
    @Override
    public void burbuja(){
            
        for (int i=1; i< vector.length; i++){
	for(int j=0; j<vector.length-1; j++){
        if(vector[j]> vector[j+1]){
            intercambio(j,j+1);     
        }
            }
    }
 }

    @Override
    public void MergeSort() {
   if (vector.length > 1) {
            int q = vector.length/2;
         
        }
    }

    static int[] merge(int[] l, int[] r) {
        int totElem = l.length + r.length;
        int[] a = new int[totElem];
        int i,li,ri;
        i = li = ri = 0;
        while ( i < totElem) {
            if ((li < l.length) && (ri<r.length)) {
                if (l[li] < r[ri]) {
                    a[i] = l[li];
                    i++;
                    li++;
                }
                else {
                    a[i] = r[ri];
                    i++;
                    ri++;
                }
            }
            else {
                if (li >= l.length) {
                    while (ri < r.length) {
                        a[i] = r[ri];
                        i++;
                        ri++;
                    }
                }
                if (ri >= r.length) {
                    while (li < l.length) {
                        a[i] = l[li];
                        li++;
                        i++;
                    }
                }
            }
        }
        return a;

    }

    private void intercambio(int j, int i) {
       
    int temp = vector[j];
    vector[j] = vector[i];
    vector[i] = temp;
    }
}
    

 
