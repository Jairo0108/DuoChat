package org.powernukkit.plugins;

import cn.nukkit.plugin.PluginBase;

public class DuoChatPlugin extends PluginBase {
        @Override
        public void onLoad() {
            this.getLogger().info("---------------------------------------------------");
            this.getLogger().info("INICIALIZANDO DUOCHAT / INITIALIZING PLUGIN DUOCHAT");
            this.getLogger().info("              Autores / Authors                    ");
            this.getLogger().info("                  Jairo0108                        ");
        }
        @Override
        public void onEnable() {

            this.getLogger().info("DUOCHAT ESTA FUNCIONANDO / DUOCHAT IS WORKING");
            getServer().getPluginManager().registerEvents(new DuoChatListener(), this);
        }
        @Override
        public void onDisable() {

            this.getLogger().info("DuoChat esta desactivado / Duochat is deactivated");
        }


}
