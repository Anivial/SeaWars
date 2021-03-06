package com.team5.seawar.utils;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;

/**
 * Created with love by Team 5
 */

public class Assets {
    private AssetManager manager = new AssetManager();

    private static Assets instance = null;

    protected Assets(){

    }

    public static Assets getInstance() {
        if(instance == null) {
            instance = new Assets();
        }
        return instance;
    }

    public void load() {
        // MenuScreen
        manager.load("Menutextures/background.png", Texture.class);
        manager.load("Menutextures/play.png", Texture.class);
        manager.load("Menutextures/exit.png", Texture.class);
        manager.load("Menutextures/playpush.png",Texture.class);
        manager.load("Menutextures/exitpush.png",Texture.class);
        manager.load("Menutextures/credit.png",Texture.class);
        manager.load("Menutextures/creditpush.png",Texture.class);
        manager.load("Menutextures/MapEditor.png",Texture.class);
        manager.load("Menutextures/MapEditorpush.png",Texture.class);

        manager.load("Menutextures/NewGame.png", Texture.class);
        manager.load("Menutextures/NewGamepush.png", Texture.class);
        manager.load("Menutextures/Load.png", Texture.class);
        manager.load("Menutextures/Loadpush.png", Texture.class);
        manager.load("Menutextures/Back.png", Texture.class);
        manager.load("Menutextures/Backpush.png", Texture.class);




        // PlayScreen
        manager.load("Maptextures/hexPointeur.png", Texture.class);
        manager.load("Maptextures/hexPortee.png", Texture.class);
        manager.load("Maptextures/hexPorteeMax.png", Texture.class);
        manager.load("Maptextures/cible.png", Texture.class);
        manager.load("Maptextures/hexSelected.png", Texture.class);

        manager.load("Maptextures/hexEau.png", Texture.class);
        manager.load("Maptextures/hexTerre.png", Texture.class);
        manager.load("Maptextures/hexPhare.png", Texture.class);
        manager.load("Maptextures/hexPhareJ1.png", Texture.class);
        manager.load("Maptextures/hexPhareJ2.png", Texture.class);
        manager.load("Maptextures/void.png", Texture.class);

        manager.load("Shiptextures/FregateH_J1.png", Texture.class);
        manager.load("Shiptextures/FregateHD_J1.png", Texture.class);
        manager.load("Shiptextures/FregateBD_J1.png", Texture.class);
        manager.load("Shiptextures/FregateB_J1.png", Texture.class);
        manager.load("Shiptextures/FregateBG_J1.png", Texture.class);
        manager.load("Shiptextures/FregateHG_J1.png", Texture.class);
        manager.load("Shiptextures/FregateH_J2.png", Texture.class);
        manager.load("Shiptextures/FregateHD_J2.png", Texture.class);
        manager.load("Shiptextures/FregateBD_J2.png", Texture.class);
        manager.load("Shiptextures/FregateB_J2.png", Texture.class);
        manager.load("Shiptextures/FregateBG_J2.png", Texture.class);
        manager.load("Shiptextures/FregateHG_J2.png", Texture.class);
        manager.load("Shiptextures/FregateH_end.png", Texture.class);
        manager.load("Shiptextures/FregateHD_end.png", Texture.class);
        manager.load("Shiptextures/FregateBD_end.png", Texture.class);
        manager.load("Shiptextures/FregateB_end.png", Texture.class);
        manager.load("Shiptextures/FregateBG_end.png", Texture.class);
        manager.load("Shiptextures/FregateHG_end.png", Texture.class);

        manager.load("Shiptextures/AmiralH_J1.png", Texture.class);
        manager.load("Shiptextures/AmiralHD_J1.png", Texture.class);
        manager.load("Shiptextures/AmiralBD_J1.png", Texture.class);
        manager.load("Shiptextures/AmiralB_J1.png", Texture.class);
        manager.load("Shiptextures/AmiralBG_J1.png", Texture.class);
        manager.load("Shiptextures/AmiralHG_J1.png", Texture.class);
        manager.load("Shiptextures/AmiralH_J2.png", Texture.class);
        manager.load("Shiptextures/AmiralHD_J2.png", Texture.class);
        manager.load("Shiptextures/AmiralBD_J2.png", Texture.class);
        manager.load("Shiptextures/AmiralB_J2.png", Texture.class);
        manager.load("Shiptextures/AmiralBG_J2.png", Texture.class);
        manager.load("Shiptextures/AmiralHG_J2.png", Texture.class);
        manager.load("Shiptextures/AmiralH_end.png", Texture.class);
        manager.load("Shiptextures/AmiralHD_end.png", Texture.class);
        manager.load("Shiptextures/AmiralBD_end.png", Texture.class);
        manager.load("Shiptextures/AmiralB_end.png", Texture.class);
        manager.load("Shiptextures/AmiralBG_end.png", Texture.class);
        manager.load("Shiptextures/AmiralHG_end.png", Texture.class);

        //Effects
        manager.load("Effects/explosionDegat.png", Texture.class);
        manager.load("Effects/explosionMort.png", Texture.class);

        //UI
        manager.load("UI/Joueur1.png", Texture.class);
        manager.load("UI/Joueur2.png", Texture.class);
        manager.load("UI/Tour1.png", Texture.class);
        manager.load("UI/Tour2.png", Texture.class);
        manager.load("UI/Victoire_1_1.png", Texture.class);
        manager.load("UI/Victoire_1_2.png", Texture.class);
        manager.load("UI/Victoire_2_1.png", Texture.class);
        manager.load("UI/Victoire_2_2.png", Texture.class);
        manager.load("UI/ShipSelect.png", Texture.class);
        manager.load("UI/MoveShip.png", Texture.class);
        manager.load("UI/AttackTurn.png", Texture.class);
        manager.load("UI/MapEditionState.png", Texture.class);
        manager.load("UI/SizeEditionState.png", Texture.class);
        manager.load("UI/validerCarte.png", Texture.class);
        manager.load("UI/shipCreation.png",Texture.class);

        //Sounds
        manager.load("Sounds/menu_music.mp3", Music.class);
        manager.load("Sounds/playscreen_music.mp3", Music.class);
        manager.load("Sounds/playscreen_music2.mp3",Music.class);
        manager.load("Sounds/choice.ogg", Sound.class);
        manager.load("Sounds/new_player.ogg", Sound.class);
        manager.load("Sounds/transition.ogg", Sound.class);
        manager.load("Sounds/deplacement_bateau.ogg", Sound.class);
        manager.load("Sounds/tir_degat.ogg", Sound.class);
        manager.load("Sounds/tir_mort.ogg", Sound.class);
        manager.load("Sounds/zoom.ogg", Sound.class);
        manager.load("Sounds/dezoom.ogg", Sound.class);
        manager.load("Sounds/playscreen_music3.mp3",Music.class);

    }

    public Texture getTexture(String fileName){
        return manager.get(fileName, Texture.class);
    }

    public Music getMusic(String fileName){
        return manager.get(fileName, Music.class);
    }

    public Sound getSound(String fileName){
        return manager.get(fileName, Sound.class);
    }

    public void finishLoading(){
        manager.finishLoading();
    }

    public void dispose(){
        manager.dispose();
    }
}
