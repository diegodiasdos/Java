class Gerente{
  String nome;
  double salario;
   // metodo 
  void aumentaSalario(){
      this.aumentaSalario(0.1);
  }
   //metodo 
   // sobrecarg
 void aumentaSalario(double taxa){
      this.salario += this.salario *taxa;
  } 

}
