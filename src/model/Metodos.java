package model;

import java.util.List;

import entity.Animal;
import message.Mensagem;

public class Metodos {
	
	/* M�todo para retornar n� filho de Animais cadastrados*/
	 public Animal retornaNoFilho(List<Animal> animais, Animal a, int respQuestion) {
		    for (Animal animal : animais) {
		      if (animal.getNoPai() == a.getId() && animal.getRespNoFilho().intValue() == respQuestion)
		        return animal; 
		    } 
		    return null;
		  }
		  
	 	
		  public int retornaMaiorId(List<Animal> animais) {
		    return animais.size() + 1;
		  }
		  
		  /* M�todo para cadastrar um novo Animal */
		  public Animal cadastraNovo(int id, Animal animal, int respPergunta, int flag) {
			  
		    Mensagem msg = new Mensagem();
		    Animal novoAnimal = new Animal();
		    novoAnimal.setId(Integer.valueOf(id));
		    novoAnimal.setRespSim(msg.inserirAnimal(animal, "Qual animal voc� imaginou?"));
		    novoAnimal.setNoPai(animal.getId());
		    novoAnimal.setRespNoFilho(Integer.valueOf(respPergunta));
		    
		    if (respPergunta == 0) {
		      novoAnimal.setRespNao(animal.getRespSim());
		      novoAnimal.setFeature(msg.inserirAnimal(animal, "Um(a) " + novoAnimal.getRespSim() + " ___ mas um(a) " + animal.getRespSim() + " n�o"));
		    } else {
		      novoAnimal.setRespNao(animal.getRespNao());
		      novoAnimal.setFeature(msg.inserirAnimal(animal, "Um(a) " + novoAnimal.getRespSim() + " ___ mas um(a) " + animal.getRespNao() + " n�o"));
		    } 
		    return novoAnimal;
		  }
}
