package com.kreezcraft.betterwithregime;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("betterwithregime")
public class BetterWithRegime
{
    public static BetterWithRegime instance;
    public static final String MODID = "betterwithregime";

    public BetterWithRegime() {
        instance = this;
        MinecraftForge.EVENT_BUS.register(this);
    }


    private void setup(FMLCommonSetupEvent event) { LOGGER.info("Setup of Better With Regime Recipes is being loaded!"); }



    private void clientRegistries(FMLClientSetupEvent event) { LOGGER.info("ClientRegistries of Better With Regime Recipes is being loaded!"); }



    private static final Logger LOGGER = LogManager.getLogger("Better With Regime recipes");
}
