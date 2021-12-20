package com.firsov.design_patterns.the_behavioral_State.second;

import com.firsov.design_patterns.the_behavioral_State.second.UI.Player;
import com.firsov.design_patterns.the_behavioral_State.second.UI.UI;

public class Demo {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
