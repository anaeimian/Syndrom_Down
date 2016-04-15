package com.example.arman.syndrom_down;

import java.io.Serializable;

/**
 * Created by Szamani on 12/22/2015.
 */
public class Database implements Serializable {
    public boolean[] khanevade = new boolean[5]; // last element is just for set activations
    public boolean[] andam = new boolean[11];
    public boolean[] mive = new boolean[6];
    public boolean[] heyvanat = new boolean[7];
    public boolean[] pooshak = new boolean[8];
    public boolean[] vasayel = new boolean[10];
    public boolean[] mashaghel = new boolean[4];
    public boolean[] rang = new boolean[4];
    public boolean[] khordani = new boolean[6];
    public boolean[] mafahim = new boolean[10];

    public boolean[] amr = new boolean[7];
    public boolean[] gozashte = new boolean[6];
    public boolean[] hessi = new boolean[7];

    public boolean[] kalame2 = new boolean[16];
    public boolean[] kalame3 = new boolean[5];

    public boolean[] zamir = new boolean[3];

    public Database() {
        khanevade[0] = true;
        andam[0] = true;
        mive[0] = true;
        heyvanat[0] = true;
        pooshak[0] = true;
        vasayel[0] = true;
        mashaghel[0] = true;
        rang[0] = true;
        khordani[0] = true;
        mafahim[0] = true;

        amr[0] = true;
        gozashte[0] = true;
        hessi[0] = true;

        kalame2[0] = true;
        kalame3[0] = true;

        zamir[0] = true;
    }

//    public void activate(String category, int index) {
//        switch (category) {
//            case "khanevade":
//                khanevade[index] = true;
//                break;
//            case "andam":
//                andam[index] = true;
//                break;
//            case "miveh":
//                mive[index] = true;
//                break;
//            case "heyvanat":
//                heyvanat[index] = true;
//                break;
//            case "pooshak":
//                pooshak[index] = true;
//                break;
//
//            case "vasayel":
//                vasayel[index] = true;
//                break;
//
//            case "mashaghel":
//                mashaghel[index] = true;
//                break;
//            case "rang":
//                rang[index] = true;
//                break;
//            case "khordani":
//                khordani[index] = true;
//                break;
//
//            case "mafahim":
//                mafahim[index] = true;
//                break;
//
//        }
//    }
}
