package entity;

/* Entidade que representa um nó da arvore binaria de Animal */
public class Animal {
	
	/* Atributos */
	  private Integer id;
	  
	  private String feature;
	  
	  private String respSim;
	  
	  private String respNao;
	  
	  private Integer noPai;
	  
	  private Integer respNoFilho;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFeature() {
		return feature;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}

	public String getRespSim() {
		return respSim;
	}

	public void setRespSim(String resoSim) {
		this.respSim = resoSim;
	}

	public String getRespNao() {
		return respNao;
	}

	public void setRespNao(String respNao) {
		this.respNao = respNao;
	}

	public Integer getNoPai() {
		return noPai;
	}

	public void setNoPai(Integer heranPai) {
		this.noPai = heranPai;
	}

	public Integer getRespNoFilho() {
		return respNoFilho;
	}

	public void setRespNoFilho(Integer respHerFilho) {
		this.respNoFilho = respHerFilho;
	}

	@Override
	public String toString() {
		return "Animal [id=" + id + ", feature=" + feature + ", resoSim=" + respSim + ", respNao=" + respNao
				+ ", heranPai=" + noPai + ", respHerFilho=" + respNoFilho + "]";
	}
	  
	   
}
