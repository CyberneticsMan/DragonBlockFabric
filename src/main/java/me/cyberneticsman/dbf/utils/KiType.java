package me.cyberneticsman.dbf.utils;

import lombok.Getter;

public enum KiType {
	KI("Ki"),
	GODLY_KI("Godly Ki");


	@Getter
	private final String name;

	KiType(String name) {
		this.name = name;
	}
}
