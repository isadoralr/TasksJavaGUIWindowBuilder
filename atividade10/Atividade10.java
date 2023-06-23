package atividade10;

public abstract class Atividade10 {
		private double media;
		double calcularMedia(double n1, double n2, double n3){
	    media = (n1 + n2 + n3)/3;
		return media;
		}
		String verificarAprovacao(){
		if (media < 5){
			return "reprovado";
		}else if (media >= 5 & media <7){
			return "em exame";
		}else { 
			return "aprovado";
			}
		}
		}
