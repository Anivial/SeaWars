package com.team5.seawar.screens.playstates;

import com.team5.seawar.inputHandler.Inputs;
import com.team5.seawar.player.Player;
import com.team5.seawar.screens.PlayScreen;
import com.team5.seawar.utils.Assets;

public class ShipSelect implements State {
    private PlayScreen playScreen;
    private Player player;
    private Player ennemie;

    private static ShipSelect instance = new ShipSelect();

    private ShipSelect(){
    }

    public static ShipSelect getInstance(){
        return instance;
    }

    public static void init(PlayScreen playScreen){
        instance.playScreen = playScreen;
        instance.player = playScreen.getMap().getPlayer1();
        instance.ennemie = playScreen.getMap().getPlayer2();
        instance.playScreen.getBanniereNouveauTour().setTextures(Assets.getInstance().getTexture("UI/Joueur1.png"), Assets.getInstance().getTexture("UI/Tour1.png"));
        instance.playScreen.getBanniereNouveauTour().start();
    }

    public void update(float dt){
        if (player.hasFinished()){
            playScreen.changeState(EndTurn.getInstance(player));
        }
        if ((Inputs.isPressed(Inputs.A) || Inputs.isPressed(Inputs.CLICK)) && player.getShips().contains(playScreen.getCurrentCase().getShip(), true) && !playScreen.getCurrentCase().getShip().hasFinished()){
            if (playScreen.getCurrentCase().getShip().canMove()) {
                playScreen.changeState(MoveShip.getInstance(playScreen.getCurrentCase(), player, ennemie));
            } else {
                playScreen.changeState(AttackTurn.getInstance(playScreen.getCurrentCase(), player, ennemie));
            }
        } else if (Inputs.isPressed(Inputs.R1)){
            if (player.getShips().contains(playScreen.getCurrentCase().getShip(), true)){
                playScreen.getPosition().set(player.nextShip(playScreen.getCurrentCase().getShip()));
            } else {
                playScreen.getPosition().set(player.nextShip());
            }
        } else if (Inputs.isPressed(Inputs.START)){
            playScreen.changeState(EndTurn.getInstance(player));
        }
    }

    public void draw(){
    }

    public void drawUI(){
        playScreen.getBatch().draw(Assets.getInstance().getTexture("UI/ShipSelect.png"), 870, 35, 1787/5, 760/5);
    }

    public void newTurn() {
        if (player.equals(playScreen.getMap().getPlayer1())) {
            player = playScreen.getMap().getPlayer2();
            ennemie = playScreen.getMap().getPlayer1();
            playScreen.getBanniereNouveauTour().setTextures(Assets.getInstance().getTexture("UI/Joueur2.png"), Assets.getInstance().getTexture("UI/Tour2.png"));
        } else {
            player = playScreen.getMap().getPlayer1();
            ennemie = playScreen.getMap().getPlayer2();
            playScreen.getBanniereNouveauTour().setTextures(Assets.getInstance().getTexture("UI/Joueur1.png"), Assets.getInstance().getTexture("UI/Tour1.png"));
        }
        player.newTurn();
        playScreen.getPosition().set(player.nextShip());
        playScreen.getBanniereNouveauTour().start();
        Assets.getInstance().getSound("Sounds/new_player.ogg").play(.5f);
    }
}
