package dados;

import java.util.GregorianCalendar;
import utilitarios.LtpUtil;

public class RegVeiculo {
	
	private static int sequencia;
	
	private int numReg;
	private String placa;
	private GregorianCalendar entrada;
	private GregorianCalendar saida;
	
	
	public RegVeiculo(String placa) {
		numReg = ++sequencia;
		this.placa = placa;
		entrada = new GregorianCalendar();
	}


	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public GregorianCalendar getSaida() {
		return saida;
	}


	public void setSaida(GregorianCalendar saida) {
		this.saida = saida;
	}


	public int getNumReg() {
		return numReg;
	}


	public GregorianCalendar getEntrada() {
		return entrada;
	}
	
	public String toString(){
		return 
				"Nº registro: " + numReg + "\n" +
				"Placa: " + placa + "\n" +
				"Entrada: " + LtpUtil.formatarData(entrada, "dd/MM/yyyy HH:mm:ss") + "\n" +
				"Saida: " + (saida==null?"Veiculo Estácionado":LtpUtil.formatarData(saida, "dd/MM/yyyy HH:mm:ss")) + "\n";
	}
	
	
}
