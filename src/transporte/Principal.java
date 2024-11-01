package transporte;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carro car = new Carro("Carro", "0000-0", null, null, 0, 0, 0, 0, null);
		Onibus Oni = new Onibus("Ônibus", "0000-00", null, null, 0, 0, 0, 0, 0);
		Caminhoes cam = new Caminhoes("Caminhão", "0000-000", null, null, 0, 0, 0, 0, 0);
		
		String valor;
		String anoAtual;
		
		Object[] opcoes = {"Veículos", "Sair"};
		Object opcao;
		
		do {
			opcao = JOptionPane.showInputDialog(null, "Escolha o que deseja fazer:",  "Gerenciador", JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
			
			if(opcao == "Veículos") {
				Object[] oopcoes = {"Carro", "Ônibus", "Caminhão", "Voltar"};
				Object oopcao;
				
				do {
					oopcao = JOptionPane.showInputDialog(null, "Escolha o que deseja fazer:",  "Gerenciador", JOptionPane.INFORMATION_MESSAGE, null, oopcoes, oopcoes[0]);
					
					if(oopcao == "Carro") {
						Object[] ooopcoes = {"Adicionar Carro", "Calcular IPVA", "Exibir Dados", "Voltar"};
						Object ooopcao;
						
						do {
							ooopcao = JOptionPane.showInputDialog(null, "Escolha o que deseja fazer:",  "Gerenciador", JOptionPane.INFORMATION_MESSAGE, null, ooopcoes, ooopcoes[0]);
							
							if(ooopcao == "Adicionar Carro") {
								 car = new Carro("Carro", "0000-0", null, null, 0, 0, 0, 0, null);
								
								car.setPlaca(JOptionPane.showInputDialog(null, "Informe a placa do carro:"));
								car.setMarca(JOptionPane.showInputDialog(null, "Informe a marca do carro:"));
								car.setModelo(JOptionPane.showInputDialog(null, "Informe o modelo do carro:"));
								while(true) {
									valor = JOptionPane.showInputDialog(null, "Informe a quantidade de assentos do carro");
					    			
					    			if(car.testeInt(valor)) {
					    				car.setAssentos(Integer.parseInt(valor));
							    		break;
					    			}else {
					    				JOptionPane.showMessageDialog(null, "Informe um valor válido!");
					    			}
					    		}
								
								while(true) {
									valor = JOptionPane.showInputDialog(null, "Informe o ano de fabricação do carro:");
									
					    			if(car.testeInt(valor)) {
					    				car.setAnoDeFabricacao(Integer.parseInt(valor));
							    		break;
					    			}else {
					    				JOptionPane.showMessageDialog(null, "Informe um valor válido!");
					    			}
					    		}
								
								car.setModificacao(JOptionPane.showInputDialog(null, "Informe se alguma modificação foi feita:"));
								while(true) {
									valor = JOptionPane.showInputDialog(null, "Informe o valor do carro para o cálculo do valor estimado:");
									
									if(car.testeDouble(valor)) {
										break;
									}else {
										JOptionPane.showMessageDialog(null, "Por favor, informe um valor válido!");
									}
								}
								
								while(true) {
									anoAtual = JOptionPane.showInputDialog(null, "Informe o ano atual para o cálculo do valor estimado:");
									
					    			if(car.testeInt(anoAtual)) {
							    		break;
					    			}else {
					    				JOptionPane.showMessageDialog(null, "Informe um valor válido!");
					    			}
					    		}
								
								car.valorEstimado(Double.parseDouble(valor), Integer.parseInt(anoAtual));
								
								
							}else if(ooopcao == "Calcular IPVA") {
								JOptionPane.showMessageDialog(null, car.calcularIPVA());
								
							}else if(ooopcao == "Exibir Dados") {
								JOptionPane.showMessageDialog(null, car.exibirDetalhes());
							}
						}while(ooopcao != "Voltar");
					}else if(oopcao == "Ônibus") {
						Object[] oooopcoes = {"Adicionar Ônibus", "Calcular IPVA", "Exibir Dados", "Voltar"};
						Object oooopcao;
						
						do {
							oooopcao = JOptionPane.showInputDialog(null, "Escolha o que deseja fazer:",  "Gerenciador", JOptionPane.INFORMATION_MESSAGE, null, oooopcoes, oooopcoes[0]);
							
							if(oooopcao == "Adicionar Ônibus") {
								Oni = new Onibus("Ônibus", "0000-00", null, null, 0, 0, 0, 0, 0);
								
								Oni.setPlaca(JOptionPane.showInputDialog(null, "Informe a placa do ônibus:"));
								Oni.setMarca(JOptionPane.showInputDialog(null, "Informe a marca do ônibus:"));
								Oni.setModelo(JOptionPane.showInputDialog(null, "Informe o modelo do ônibus:"));
								
								while(true) {
									valor = JOptionPane.showInputDialog(null, "Informe a quantidade de assentos do ônibus");
					    			
					    			if(Oni.testeInt(valor)) {
					    				Oni.setAssentos(Integer.parseInt(valor));
							    		break;
					    			}else {
					    				JOptionPane.showMessageDialog(null, "Informe um valor válido!");
					    			}
					    		}
								
								while(true) {
									valor = JOptionPane.showInputDialog(null, "Informe a quantidade de assentos preferenciais do ônibus");
					    			
					    			if(Oni.testeInt(valor)) {
					    				Oni.setAssentosPreferenciais(Integer.parseInt(valor));
							    		break;
					    			}else {
					    				JOptionPane.showMessageDialog(null, "Informe um valor válido!");
					    			}
					    		}
								
								while(true) {
									valor = JOptionPane.showInputDialog(null, "Informe o ano de fabricação do ônibus:");
									
					    			if(Oni.testeInt(valor)) {
					    				Oni.setAnoDeFabricacao(Integer.parseInt(valor));
							    		break;
					    			}else {
					    				JOptionPane.showMessageDialog(null, "Informe um valor válido!");
					    			}
					    		}
								
								
								while(true) {
									valor = JOptionPane.showInputDialog(null, "Informe o valor do ônibus para o cálculo do valor estimado:");
									
									if(Oni.testeDouble(valor)) {
										break;
									}else {
										JOptionPane.showMessageDialog(null, "Por favor, informe um valor válido!");
									}
								}
								
								while(true) {
									anoAtual = JOptionPane.showInputDialog(null, "Informe o ano atual para o cálculo do valor estimado:");
									
					    			if(Oni.testeInt(anoAtual)) {
							    		break;
					    			}else {
					    				JOptionPane.showMessageDialog(null, "Informe um valor válido!");
					    			}
					    		}
								
								Oni.valorEstimado(Double.parseDouble(valor), Integer.parseInt(anoAtual));
							}else if(oooopcao == "Calcular IPVA") {
								JOptionPane.showMessageDialog(null, Oni.calcularIPVA());
								
							}else if(oooopcao == "Exibir Dados") {
								JOptionPane.showMessageDialog(null, Oni.exibirDetalhes());
								
							}
						}while(oooopcao !="Voltar");
					}else if(oopcao == "Caminhão") {
						Object[] ooooopcoes = {"Adicionar Caminhão", "Calcular IPVA", "Exibir Dados", "Voltar"};
						Object ooooopcao;
						
						do {
							ooooopcao = JOptionPane.showInputDialog(null, "Escolha o que deseja fazer:",  "Gerenciador", JOptionPane.INFORMATION_MESSAGE, null, ooooopcoes, ooooopcoes[0]);
							
							
							if(ooooopcao == "Adicionar Caminhão") {
								cam = new Caminhoes("Caminhão", "0000-000", null, null, 0, 0, 0, 0, 0);
								
								cam.setPlaca(JOptionPane.showInputDialog(null, "Informe a placa do caminhão:"));
								cam.setMarca(JOptionPane.showInputDialog(null, "Informe a marca do caminhão:"));
								cam.setModelo(JOptionPane.showInputDialog(null, "Informe o modelo do caminhão:"));
								
								while(true) {
									valor = JOptionPane.showInputDialog(null, "Informe a quantidade de assentos do caminhão:");
					    			
					    			if(cam.testeInt(valor)) {
					    				cam.setAssentos(Integer.parseInt(valor));
							    		break;
					    			}else {
					    				JOptionPane.showMessageDialog(null, "Informe um valor válido!");
					    			}
					    		}
								
								while(true) {
									valor = JOptionPane.showInputDialog(null, "Informe a carga máxima do caminhão(em kg):");
									
									if(cam.testeDouble(valor)) {
										cam.setCargaMax(Double.parseDouble(valor));
										break;
									}else {
										JOptionPane.showMessageDialog(null, "Por favor, informe um valor válido!");
									}
								}
								
								while(true) {
									valor = JOptionPane.showInputDialog(null, "Informe o ano de fabricação do caminhão:");
									
					    			if(cam.testeInt(valor)) {
					    				cam.setAnoDeFabricacao(Integer.parseInt(valor));
							    		break;
					    			}else {
					    				JOptionPane.showMessageDialog(null, "Informe um valor válido!");
					    			}
					    		}
								
								
								while(true) {
									valor = JOptionPane.showInputDialog(null, "Informe o valor do caminhão para o cálculo do valor estimado:");
									
									if(cam.testeDouble(valor)) {
										break;
									}else {
										JOptionPane.showMessageDialog(null, "Por favor, informe um valor válido!");
									}
								}
								
								while(true) {
									anoAtual = JOptionPane.showInputDialog(null, "Informe o ano atual para o cálculo do valor estimado:");
									
					    			if(cam.testeInt(anoAtual)) {
							    		break;
					    			}else {
					    				JOptionPane.showMessageDialog(null, "Informe um valor válido!");
					    			}
					    		}
								cam.valorEstimado(Double.parseDouble(valor), Integer.parseInt(anoAtual));
							}else if(ooooopcao == "Calcular IPVA") {
								JOptionPane.showMessageDialog(null, cam.calcularIPVA());
								
							}else if(ooooopcao == "Exibir Dados") {
								JOptionPane.showMessageDialog(null, cam.exibirDetalhes());
							}
						}while(ooooopcao !="Voltar");
					}
				}while(oopcao != "Voltar");
			}
		}while(opcao != "Sair");

	}

}
