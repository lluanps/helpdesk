package com.luan.helpdesk.domain.enums;

public enum Perfil {
	
	ADMIN(0, "ROLE_ADMIN"),
	CLIENTE(1, "ROLE_CLIENTE"),
	INSTRUTOR(2, "ROLE_INSTRUTOR");
	
	private Integer codigo;
	private String descricao;

	private Perfil(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static Perfil toEnum(Integer cod) {
		if (cod == null) {
			return null;
		}
		for (Perfil p : Perfil.values()) {
			if (cod.equals(p.getCodigo())) {
				return p;
			}
		}
		throw new IllegalArgumentException("Perfil inválido");
	}

}
