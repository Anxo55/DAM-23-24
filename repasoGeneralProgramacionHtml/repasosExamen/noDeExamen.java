package repasosExamen;

public class noDeExamen {

public static void main(String[] args) {
 
    int i=0;
    bucleext :
    while (i<20) {
        i++;
        for(int k=0; k<(20-i); k+=2) {
            if(i % 2 == 0) {
                continue bucleext;
            }
            System.out.println(" ");
        }
        for(int j=0; j<i; j++) {
            System.out.print("*");
        }
        System.out.println("");
        if(i==19) {
            break  bucleext;
        }
        
    }

}
}



