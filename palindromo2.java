package tarea3finalizadaconéxito;

public class palindromo2 {
    public boolean espalindromo(String cadena){
    boolean valor=true;
    int i,ind;    
    String cadena2="";
    
    for (int x=0; x < cadena.length(); x++) {
        if (cadena.charAt(x) != ' ')
            cadena2 += cadena.charAt(x);
    }
    
    cadena=cadena2;    
    ind=cadena.length();
    
    for (i= 0 ;i < (cadena.length()); i++){        
       if (cadena.substring(i, i+1).equals(cadena.substring(ind - 1, ind)) == false ) {
          
            valor=false;
            break;
       }
       ind--;
    }
    return valor;
}
}

