package testeheranca;

public class GerenteVendas extends Vendedor{
    protected String senha;
    protected int numVendedores;
    
  public GerenteVendas(String n, String c, int r, double s, double h){
        this.nomeCompleto = n;
        this.cpf = c;
        this.registro = r;
        this.salarioBase = s;
        this.horaExtra = h;
    }
    
    public boolean darAumento(Vendedor vend, double aumento, String senha){
        if (this.registro == vend.getRegistro()){
            if (this.senha == senha){
                if (aumento>100){
                    this.salarioBase = aumento*this.salarioBase;
                    return true;
                }
                else
                    return false;
            }
            else
                return false;    
        }
        else
            return false;   
    }
    
    public void exibirResumo(){
        System.out.println("Registro: " + this.registro);
        System.out.println("Nome: " + this.nomeCompleto);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Salario do Mes: " + this.calcularSalarioMes());
        System.out.println("Comissao: " + this.calcularComissao());
        System.out.println("Ferias: " + this.calcularFerias());
        System.out.println("Decimo Terceiro: " + this.calcularDecTer());
    }
    
    public void contabilizarVendedor(){
        this.numVendedores = this.numVendedores + 1;
    }
}
