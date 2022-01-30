package ejercicio5;

public class invertido {
    private String numero;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public String InvertirNum(){
        //Primera forma de resolverlo mediante strings
       String p = "";
       for(int i = numero.length() - 1; i >= 0; i--){
           p += numero.charAt(i);
       }
        return p;

    }
    
    //Segunda forma para resolverlo, Para esto debemos cambiar el atributo "numero" a tipo int
//    int rest;
//    int inv = 0;
//    while(numero > 0){
//        rest = numero % 10;
//        numero = numero / 10;
//        inv = inv * 10 + rest;
//        
//    }
//        return inv;
   }

