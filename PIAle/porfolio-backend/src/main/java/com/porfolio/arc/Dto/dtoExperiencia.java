/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.porfolio.arc.Dto;

import javax.validation.constraints.NotBlank;


public class dtoExperiencia {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String descrpcionE;
    
    //Constructor

    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreE, String descrpcionE) {
        this.nombreE = nombreE;
        this.descrpcionE = descrpcionE;
    }
    //Getters y setter

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescrpcionE() {
        return descrpcionE;
    }

    public void setDescrpcionE(String descrpcionE) {
        this.descrpcionE = descrpcionE;
    }

    public String getDescripcionE() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
