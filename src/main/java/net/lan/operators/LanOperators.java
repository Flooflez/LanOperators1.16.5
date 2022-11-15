package net.lan.operators;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v1.CommandRegistrationCallback;
import net.lan.operators.commands.LanDeOpCommand;
import net.lan.operators.commands.LanOpCommand;

public class LanOperators implements ModInitializer {

	@Override
	public void onInitialize() {
		CommandRegistrationCallback.EVENT.register((dispatcher, dedicated) ->
		{
			LanOpCommand.register(dispatcher);
			LanDeOpCommand.register(dispatcher);
		});
	}
}