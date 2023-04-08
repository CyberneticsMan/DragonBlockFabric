package me.cyberneticsman.dbf.core.system.ki;

import me.cyberneticsman.dbf.core.system.ki.base.Ki;
import me.cyberneticsman.dbf.utils.KiType;

public class PlainKi extends Ki {
	public PlainKi() {
		super(KiType.KI, 1, 10000);
	}

	@Override
	public void spend(int amount) {

	}
}
