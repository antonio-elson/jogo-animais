package dao;

import java.util.ArrayList;

import java.util.List;

import entity.Animal;

/* Implementação do Objeto Animal */
public class AnimalDAOImpl implements AnimalDAO {
	private List<Animal> animais = new ArrayList<Animal>();

	/*  - Construtor do objeto, salva os dados na memória
	 *  - criado para compor o início do inicio do jogo */
	public AnimalDAOImpl() {

		Animal a1 = new Animal();
		a1.setId(Integer.valueOf(1));
		a1.setFeature("Vive na selva");
		a1.setRespSim("Leão");
		a1.setRespNao("Peixe");
		a1.setRespNoFilho((Integer.valueOf(0)));
		this.animais.add(a1);
	}

	/* Construtor salvar, implementando na Interface AnimalDAO */
	public void salvar(Animal animal) {
		this.animais.add(animal);
	}

	public List<Animal> getAnimais() {
		return this.animais;
	}

	public void setAnimais(List<Animal> animais) {
		this.animais = animais;
	}
	
}
