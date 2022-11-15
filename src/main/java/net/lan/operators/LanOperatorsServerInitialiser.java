package net.lan.operators;


import net.fabricmc.api.DedicatedServerModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.command.v1.CommandRegistrationCallback;
import net.lan.operators.commands.LanDeOpCommand;
import net.lan.operators.commands.LanOpCommand;

@Environment(EnvType.SERVER)
public class LanOperatorsServerInitialiser implements DedicatedServerModInitializer
{

    @Override
    // Initialize the differents parts of the mod when lauched on server
    public void onInitializeServer()
    {

        //register commands
        CommandRegistrationCallback.EVENT.register((dispatcher, dedicated) ->
        {
            LanOpCommand.register(dispatcher);
            LanDeOpCommand.register(dispatcher);
        });
    }

}