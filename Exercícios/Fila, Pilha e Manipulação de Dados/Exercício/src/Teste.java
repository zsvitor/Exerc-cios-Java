import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		
		Fila<String> comum = new Fila<>(10);
		Fila<String> prioritaria = new Fila<>(10);
		int atendimentoPrioritario = 0;
		
		Object escolha, escolhaTipoSenha;
		
		do {
			
			String valores[] = {"Solicitar nova senha", "Excluir uma senha", "Listar todas as senhas", "Visualizar o próximo a ser atendido", "Chamar o próximo a ser atendido", "Sair"};
			escolha = JOptionPane.showInputDialog(null, "Escolha uma Opção:", "Fila de Atendimento",JOptionPane.QUESTION_MESSAGE, null, valores, valores[0]);
			
			if(escolha.equals("Solicitar nova senha")) {
				String tipoSenha[] = {"Comum", "Prioritária"};
			    escolhaTipoSenha = JOptionPane.showInputDialog(null, "Escolha um Tipo:", "Tipo de Senha", JOptionPane.QUESTION_MESSAGE, null, tipoSenha, tipoSenha[0]);
			    String nomePaciente = JOptionPane.showInputDialog("Informe o nome do paciente:");
			    boolean existe = false;
			    if (!prioritaria.estaVazia()) {
			        int tamanhoPrioritaria = prioritaria.tamanho();
			        for (int i = 0; i < tamanhoPrioritaria; i++) {
			            String pacienteAtual = prioritaria.desenfileira();
			            if (pacienteAtual != null && pacienteAtual.equals(nomePaciente)) {
			                existe = true;
			            }
			            prioritaria.enfileira(pacienteAtual);
			        }
			    }
			    if (!comum.estaVazia() && !existe) {
			        int tamanhoComum = comum.tamanho();
			        for (int i = 0; i < tamanhoComum; i++) {
			            String pacienteAtual = comum.desenfileira();
			            if (pacienteAtual != null && pacienteAtual.equals(nomePaciente)) {
			                existe = true;
			            }
			            comum.enfileira(pacienteAtual);
			        }
			    }
			    if (existe) {
			        JOptionPane.showMessageDialog(null, "O paciente " + nomePaciente + " já possui uma senha.");
			    } 
			    else {
			        if (escolhaTipoSenha.equals("Comum")) {
			            comum.enfileira(nomePaciente);
			            JOptionPane.showMessageDialog(null, "Senha Comum Gerada.");
			        } 
			        else if (escolhaTipoSenha.equals("Prioritária")) {
			            prioritaria.enfileira(nomePaciente);
			            JOptionPane.showMessageDialog(null, "Senha Prioritária Gerada.");
			        }
			    }
			}
			else if(escolha.equals("Excluir uma senha")) {
				if(prioritaria.estaVazia() && comum.estaVazia()) {
					JOptionPane.showMessageDialog(null, "Não há senhas disponíveis.");
				}
				else {
					String nomePaciente = JOptionPane.showInputDialog("Informe o nome do paciente:");
					boolean removido = false;
					int tamanhoPrioritaria = prioritaria.tamanho();
					for(int i = 0; i < tamanhoPrioritaria; i++) {
						String pacienteAtual = prioritaria.desenfileira();
						if(pacienteAtual != null && pacienteAtual.equals(nomePaciente)) {
							JOptionPane.showMessageDialog(null, "Paciente " + nomePaciente + " removido da Fila Prioritária.");
							removido = true;
						}
						else {
							prioritaria.enfileira(pacienteAtual);
						}
					}
					if(!removido) {
						int tamanhoComum = comum.tamanho();
						for(int i = 0; i < tamanhoComum; i++) {
							String pacienteAtual = comum.desenfileira();
							if(pacienteAtual != null && pacienteAtual.equals(nomePaciente)) {
								JOptionPane.showMessageDialog(null, "Paciente " + nomePaciente + " removido da Fila Comum.");
								removido = true;
							}
							else {
								comum.enfileira(pacienteAtual);
							}
						}
					}
					if(!removido) {
						JOptionPane.showMessageDialog(null, "Paciente não encontrado.");
					}
				}
			}
			else if(escolha.equals("Listar todas as senhas")) {
				JOptionPane.showMessageDialog(null, "Senhas Comuns:\n" + comum.toString() + "\nSenhas Prioritárias:\n" + prioritaria.toString());
			}
			else if (escolha.equals("Visualizar o próximo a ser atendido")) {
			    if (atendimentoPrioritario >= 3) {
			        if (!comum.estaVazia()) {
			            JOptionPane.showMessageDialog(null, "Próximo a ser atendido:\nComum - " + comum.espiar());
			        } 
			        else if (!prioritaria.estaVazia()) {
			            JOptionPane.showMessageDialog(null, "Nenhum paciente na fila comum.\nPróximo a ser atendido: Prioritário - " + prioritaria.espiar());
			        } 
			        else {
			            JOptionPane.showMessageDialog(null, "Nenhum paciente na fila.");
			        }
			    } 
			    else {
			        if (!prioritaria.estaVazia()) {
			            JOptionPane.showMessageDialog(null, "Próximo a ser atendido:\nPrioritário - " + prioritaria.espiar());
			        } 
			        else if (!comum.estaVazia()) {
			            JOptionPane.showMessageDialog(null, "Próximo a ser atendido:\nComum - " + comum.espiar());
			        } 
			        else {
			            JOptionPane.showMessageDialog(null, "Nenhum paciente na fila.");
			        }
			    }
			}
			else if(escolha.equals("Chamar o próximo a ser atendido")) {
				if(atendimentoPrioritario < 3 && !prioritaria.estaVazia()) {
					JOptionPane.showMessageDialog(null, "Atendendo Paciente Prioritário: " + prioritaria.desenfileira());
					atendimentoPrioritario++;
				}
				else if(!comum.estaVazia()) {
					JOptionPane.showMessageDialog(null, "Atendendo Paciente Comum: " + comum.desenfileira());
					atendimentoPrioritario = 0;
				}
				else if(!prioritaria.estaVazia()) {
					JOptionPane.showMessageDialog(null, "Atendendo Paciente Prioritário: " + prioritaria.desenfileira());
					atendimentoPrioritario++;
				}
				else {
					JOptionPane.showMessageDialog(null, "Nenhum paciente na fila.");
				}
			}
			else if(escolha.equals("Sair")) {
				JOptionPane.showMessageDialog(null, "Programa Finalizado!");
				System.exit(0);
			}
			
		}while(escolha != "Sair");
		
	}

}