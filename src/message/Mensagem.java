package message;

import java.awt.Component;

import javax.swing.JOptionPane;

import entity.Animal;

public class Mensagem {
	
	/* M�todo - mensangem que inicia o jogo */
	public int inicio() {
	    return JOptionPane.showConfirmDialog(null, "Imagine em um animal.", "! GAME ANIMAL !", 2);
	  }
	
	// String msgImaginou = "O animal que voc� imaginou ";
	 
	  /* M�todo - Mensagem que pergunta se o animal vive ...? */
	  public int pergunta(Animal a) {
	    return JOptionPane.showConfirmDialog(null, msgImaginou() + a.getFeature() + "?", "Informe", 0);
	  }
	  
	
	  /* Pegunta para confirmar se o animal est� correto */	  
	  public int isAnimal (Animal a, int resp) {
		  
	    if (resp == 0)
	      return JOptionPane.showConfirmDialog(null, msgImaginou() + a.getRespSim() + "?", "Informe", 0); 
	    return JOptionPane.showConfirmDialog(null, msgImaginou() + a.getRespNao() + "?", "Informe", 0);
	  }
	  
	  /* M�todo para inserir valor de animal n�o cadastrado */
	  
	  public String inserirAnimal(Animal a, String mensagem) {
	    while (true) {
	      String valor = JOptionPane.showInputDialog((Component)null, mensagem);
	      if (valor == null)
	        mostraMensagem("INFORME ALGUM VALOR!"); 
	      if (valor != null)
	        return valor; 
	    } 
	  }
	  
	  public void mostraMensagem(String mensagem) {
	    JOptionPane.showMessageDialog(null, mensagem);
	  }
	  
	  public String msgImaginou() {
		  return "O animal que voc� imaginou ";
	  }
	  
}
