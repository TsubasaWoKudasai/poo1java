public class Conta {
	
	private String NomeC ;

	private Double SaldoC;

	private String NumeroC;

	private String TipoC;

	private Integer NumeroC = 0;

	
	public Conta(String NomeC, Double SaldoC, String NumeroC, String Tipoc) {
		super();
		this.NomeC = NomeC;
		this.SaldoC = SaldoC;
		this.NumeroC = NumeroC;
		this.Tipoc = Tipoc;
	}
	
	public void depositar(Double Val) {
		if(Tipoc.equals("PF")) {
		Val -= Val * 0.02;
		} else {
		Val -= Val * 0.01;
		}
		SaldoC = SaldoC + Val;
		imprimeSaldo();
	}
	
	public Double sacar(Double Val) {
		Double ValS = Val;
		if(Val > SaldoC && Tipoc.equals("PF")) {
			Val = 0.0;
			System.out.println("Nao pode fazer o saque maior que o valor da conta " +  getSandoCFormatado());
		} else {
			SaldoC = SaldoC - Val;
			if (NumeroC > 3) {
				if(Tipoc.equals("PF")) {
				ValS -= ValS * 0.02;
				} else {
				ValS -= ValS * 0.01;
				}
			}
			imprimeSaldo();
		}
		NumeroC++;
		return ValS;
	}
	
	private String getSandoCFormatado() {
		return new DecimalFormat("#0.00").format(SaldoC);
	}
	
	public void imprimeSaldo() {
		System.out.println(NomeC + " tem R$" + getSandoCFormatado() + " na conta.");
	}
	
	
	public String getNome() { return NomeC;}

	public void setNome(String NomeC) { this.NomeC = NomeC;}

	public Double getSaldoC() { return SaldoC; }

	public void setSaldoC(Double SaldoC) {this.SaldoC = SaldoC;}

	public String getNumeroC() {return NumeroC;}

	public void setNumeroC(String NumeroC) {this.NumeroC = NumeroC;}

	public String getTipoC() {return Tipoc; }

	public void setTipoC(String Tipoc) {this.Tipoc = Tipoc; }
	
	
}