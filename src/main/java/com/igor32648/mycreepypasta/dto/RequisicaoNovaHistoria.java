package com.igor32648.mycreepypasta.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import com.igor32648.mycreepypasta.model.Historia;

public class RequisicaoNovaHistoria {
	@NotBlank @Max(50)
	private String nomeHistoria;
	@Max(255)
	private String sinopseHistoria;
	@NotBlank @Max(10000)
	private String historia;
	@Min(100) @Max(255)
	private String urlHistoria;
	@Max(255)
	private String urlimagem;

	public String getNomeHistoria() {
		return nomeHistoria;
	}

	public void setNomeHistoria(String nomeHistoria) {
		this.nomeHistoria = nomeHistoria;
	}

	public String getSinopseHistoria() {
		return sinopseHistoria;
	}

	public void setSinopseHistoria(String sinopseHistoria) {
		this.sinopseHistoria = sinopseHistoria;
	}

	public String getHistoria() {
		return historia;
	}

	public void setHistoria(String historia) {
		this.historia = historia;
	}

	public String getUrlHistoria() {
		return urlHistoria;
	}

	public void setUrlHistoria(String urlHistoria) {
		this.urlHistoria = urlHistoria;
	}

	public String getUrlImagem() {
		return urlImagem;
	}

	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}

	private String urlImagem;

	public Historia toHistoria() {
		Historia historia = new Historia(this.nomeHistoria, this.sinopseHistoria, 
				this.historia, this.urlHistoria, this.urlImagem);
		return historia;
	}

}
