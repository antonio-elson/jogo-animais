package model;

import dao.AnimalDAOImpl;
import entity.Animal;
import message.Mensagem;

public class ControllerJogo {
	/* Inicia o jogo */
	public void inicia() {

		int respInicio;
		Mensagem msg = new Mensagem();
		Metodos funcoes = new Metodos();
		AnimalDAOImpl dao = new AnimalDAOImpl();
		boolean controle = false;
		int flag = 0;

		/* Loop para jogar enquanto o valor respInicio == 0 */
		do {
			respInicio = msg.inicio();

			if (respInicio != 0)
				continue;

			while (true) {

				Animal animal = dao.getAnimais().get(flag);
				int respPergunta = msg.pergunta(animal);
				Animal filho = funcoes.retornaNoFilho(dao.getAnimais(), dao.getAnimais().get(flag), respPergunta);

				if (filho == null) {

					int respIsAnimal = msg.isAnimal(animal, respPergunta);

					if (respIsAnimal == 0) {
						msg.mostraMensagem("Uhu! Acertei!!!");
						controle = true;
					} else {
						dao.salvar(funcoes.cadastraNovo(funcoes.retornaMaiorId(dao.getAnimais()), animal,
								respPergunta, flag));
						controle = true;
					}

				} else {
					flag = dao.getAnimais().indexOf(filho);
				}
				
				/* Reseta os valores caso controle == true para iniciar o jogo novamente */
				if (controle) {
					flag = 0;
					controle = false;
					break;
				}
			}
		} while (respInicio == 0);
	}
}
