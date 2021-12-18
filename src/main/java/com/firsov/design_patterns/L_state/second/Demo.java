package com.firsov.design_patterns.L_state.second;

import com.firsov.design_patterns.L_state.second.UI.Player;
import com.firsov.design_patterns.L_state.second.UI.UI;

public class Demo {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
