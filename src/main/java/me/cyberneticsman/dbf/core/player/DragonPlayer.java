package me.cyberneticsman.dbf.core.player;

import lombok.Getter;
import lombok.Setter;
import me.cyberneticsman.dbf.core.system.ki.base.Ki;
import me.cyberneticsman.dbf.utils.KiUser;
import net.minecraft.entity.player.PlayerEntity;

public class DragonPlayer implements KiUser {
	@Getter
	private final PlayerEntity player;


	@Setter
	private Ki ki;

	public DragonPlayer(PlayerEntity player) {
		this.player = player;
	}

	@Override
	public void UseKi() {
		getKi().spend();
	}

	@Override
	public void UseKi(int amount) {
		getKi().spend(amount);
	}

	@Override
	public Ki getKi() {
		return ki;
	}
}
