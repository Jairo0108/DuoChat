package org.powernukkit.plugins;

import cn.nukkit.Player;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerMessageEvent;


public class DuoChatListener implements Listener {

        @EventHandler
        public void modificarChat(PlayerMessageEvent event){
            Player jugador = event.getPlayer();
            String mensaje = event.getMessage();
            String[] filtro = {"Hack", "Noob","ez"};

            for (int i=0; i < filtro.length; i++){
                if (mensaje.toLowerCase().contains(filtro[i])){
                    String a = "";
                    for (int c = 0; c < filtro[i].length(); i++) {
                        a = a + "*";
                    }
                    event.setMessage(mensaje.replace(filtro[i], a));
                }
            }
            event.setMessage(mensaje);
        }
    }


