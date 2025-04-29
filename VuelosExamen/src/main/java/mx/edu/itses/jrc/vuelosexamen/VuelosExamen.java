/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mx.edu.itses.jrc.vuelosexamen;

import controller.VuelosControler;
import modelo.Vuelos;
import view.VueloView;

/**
 *
 * @author juras
 */
public class VuelosExamen {

    static Vuelos model;
    static VueloView view;
    static VuelosControler controler;
    public static void main(String[] args){
        model = new Vuelos();
        view = new VueloView();
        controler = new VuelosControler(model, view); 
        controler.CRUDVuelo(model);
    }
}
