package com.igor32648.mycreepypasta.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity 
public class Historia {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nomeHistoria;
	private String sinopseHistoria;
	@Enumerated(EnumType.STRING)
	private Categoria categoria;
	private BigDecimal popularidade;
	private LocalDate dataPublicacao;
	private String historia;
	private String urlHistoria;
	private String urlImagem;
	
	public Historia() {
		super();
	}
	@Autowired
	LocalDate data;
	
	public String getNomeHistoria() {
		return nomeHistoria;
	}
	public Historia(String nomeHistoria, String sinopseHistoria, Categoria categoria, String historia, String urlHistoria,
			String urlImagem) {
		super();
		this.nomeHistoria = nomeHistoria;
		this.sinopseHistoria = sinopseHistoria;
		this.categoria = categoria;
		this.dataPublicacao = data.now();
		this.historia = historia;
		this.urlHistoria = urlHistoria;
		this.urlImagem = urlImagem;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public void setNomeHistoria(String nomeHistoria) {
		this.nomeHistoria = nomeHistoria;
	}
	public BigDecimal getPopularidade() {
		return popularidade;
	}
	public void setPopularidade(BigDecimal popularidade) {
		this.popularidade = popularidade;
	}
	public LocalDate getDataPublicacao() {
		return dataPublicacao;
	}
	public void setDataPublicacao(LocalDate dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
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
	public String getSinopseHistoria() {
		return sinopseHistoria;
	}
	public void setSinopseHistoria(String sinopseHistoria) {
		this.sinopseHistoria = sinopseHistoria;
	}
	public String getUrlImagem() {
		return urlImagem;
	}
	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}

}
