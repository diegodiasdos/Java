public class aleatorio{

 public static void main  (String[] args)
  {
      java.util.Random gerador = new java.util.Random();
       
      double numero = gerador.nextDouble () * 1000;

      System.out.println("numero"+numero); 
 
   }

}
