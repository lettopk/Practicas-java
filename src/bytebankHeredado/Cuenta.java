package bytebankHeredado;

//entidad cuenta:
public abstract class Cuenta {
	// atributos
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular = new Cliente();
	
	private static int total = 0 ;
	
	
	public Cuenta (int agencia, int numero) {
		
		if (agencia<=0) {
			System.out.println("No se permite el cero");
			this.agencia = 1;
		}else {
			this.agencia = agencia;
			this.numero = numero;
			System.out.println("Estoy creando una cuenta nueva");
		}
		total++;
		System.out.println("se vanc creando: "+ total + " cuentas");
	}
	// no retorna valor
	public  abstract void depositar (double valor);
	
	// retorna valor
	public boolean retirar (double valor) {
		if (valor >0 && this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
		
	}
	public boolean transferir (double valor, Cuenta cuenta){
		if (this.saldo >= valor && valor > 0 ) {
			this.retirar(valor);
			cuenta.depositar (valor);
			return true;
		}
		return false;
		
	}
	
	public double getSaldo (){
		return this.saldo;
	}
	
	
	
	public int getAgencia() {
		return agencia;
	}
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal () {
		return Cuenta.total;
	}
	
}
