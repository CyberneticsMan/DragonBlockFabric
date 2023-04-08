package me.cyberneticsman.dbf.core.system.ki.base;

import lombok.Getter;
import me.cyberneticsman.dbf.utils.KiType;
import me.cyberneticsman.dbf.utils.Spendable;

public abstract class Ki implements Spendable {

	@Getter
	private final int usageCost;

	@Getter
	private final int maxPoolSize;

	@Getter
	private final KiType type;

	public Ki(KiType type, int usageCost, int maxPoolSize) {
		this.type = type;
		this.usageCost = usageCost;
		this.maxPoolSize = maxPoolSize;
	}

	@Override
	public void spend() {

	}
}
