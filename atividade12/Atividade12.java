package atividade12;

//Car Maintenance Checker
public class Atividade12 {
		int ano;
		String modelo;
		String cor;
		double quilometragem;
		
		String verificarManutencao(double quilometragem) {
			if (quilometragem<25000) {
			return("Tudo ok!");
			}else if (quilometragem>=25000 & quilometragem<=75000){
				return("Realizar revisão parcial!");
			}else {
				return("Realizar revisão completa!");
		}
		}
		String mudarCor(String cori){
		cor = cori;
		return cor;
	}		
}