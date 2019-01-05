package com.fhdev.sdtesting.enums;

public enum CertaOuErrada {
	
	CERTA(1, "Certa"),
	ERRADA(2, "Errada");
	
	private int codigo;
	private String descricao;
	
	private CertaOuErrada(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	//Método que retorna um objeto do tipo CertaOuErrada
		public static CertaOuErrada toEnum(Integer codigo) {
			
			if(codigo == null) {
				return null;
			}
			
			for (CertaOuErrada x : CertaOuErrada.values()) {
				
				if(codigo.equals(x.getCodigo())) {
					return x;
				}
			}
			
			throw new IllegalArgumentException("Id inválido: " + codigo);
			
		}
	
}
