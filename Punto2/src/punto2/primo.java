// los numeros 0, 1, 4 no son primos
package punto2;

public class primo {
    private float num;

    public float getNum() {
        return num;
    }

    public void setNum(float num) {
        this.num = num;
    }
    
    public boolean EvaluarNumero(){
      if(num == 0 || num == 1 || num == 4){
          return false;
      }else{
       for(int i = 2; i < num / 2; i++){
          if(num % i == 0){
              return false;
            }
        }   
      }
        return true; //nota: si no se puede con los de arriba es que si es primo
    }
}
