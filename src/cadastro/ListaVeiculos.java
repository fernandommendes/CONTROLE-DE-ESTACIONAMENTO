package cadastro;

import java.util.ArrayList;

import dados.RegVeiculo;

public class ListaVeiculos {
	
	public static ArrayList<RegVeiculo> listaVeiculo = new ArrayList<RegVeiculo>();
	
	public static void incluirVeiculo(RegVeiculo obj) {
		listaVeiculo.add(obj);
	}
	
	public static RegVeiculo pesqPlacaVeic(String placa) {
		for (RegVeiculo obj : listaVeiculo) {
			if (obj.getPlaca()==placa) {
				return obj;
			}
		}
		return null;
	}
	
	public static ArrayList<RegVeiculo> pesqCarroEstacinado() {
		ArrayList<RegVeiculo> resp = new ArrayList<RegVeiculo>();
		for (RegVeiculo obj : listaVeiculo) {
			if (obj.getSaida()==null){
				resp.add(obj);
			}
		}
		return resp;
	}
	
}

