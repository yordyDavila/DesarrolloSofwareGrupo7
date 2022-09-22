public class Calculadora{
    //metodo - multiplicar
      public float multiplicar(float x, float y){
          return x*y;
      }
      public float dividir(float x, float y){
          return x/y;
      }
      public float sumar(float x, float y){
          return x+y;
      }
      public float restar(float x, float y){
          return x-y;
      }
    Calculadora() {
        System.out.println("-------------------\nCALCULADORA\n-------------------\n");
    
        //resultado - atributo
        float resultado = this.multiplicar(5, 8);
        System.out.println( resultado );       
    }  
}