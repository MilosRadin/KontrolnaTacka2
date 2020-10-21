package com.ftninfomatika.kontrolnatacka2.models;

import java.util.Date;

public class Glumac {


    private int id;
    private String ime, prezime, biografija,  fotografija, filmovi;
    private double ocena;
    private Date datumRodjenja, datumSmrti;

    public Glumac(int id, String ime, String prezime, String biografija, String fotografija, String filmovi, double ocena, Date datumRodjenja, Date datumSmrti) {
        this.id = id;
        this.ime = ime;
        this.prezime = prezime;
        this.biografija = biografija;
        this.fotografija = fotografija;
        this.filmovi = filmovi;
        this.ocena = ocena;
        this.datumRodjenja = datumRodjenja;
        this.datumSmrti = datumSmrti;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getBiografija() {
        return biografija;
    }

    public void setBiografija(String biografija) {
        this.biografija = biografija;
    }

    public String getFotografija() {
        return fotografija;
    }

    public void setFotografija(String fotografija) {
        this.fotografija = fotografija;
    }

    public String getFilmovi() {
        return filmovi;
    }

    public void setFilmovi(String filmovi) {
        this.filmovi = filmovi;
    }

    public double getOcena() {
        return ocena;
    }

    public void setOcena(double ocena) {
        this.ocena = ocena;
    }

    public Date getDatumRodjenja() {
        return datumRodjenja;
    }

    public void setDatumRodjenja(Date datumRodjenja) {
        this.datumRodjenja = datumRodjenja;
    }

    public Date getDatumSmrti() {
        return datumSmrti;
    }

    public void setDatumSmrti(Date datumSmrti) {
        this.datumSmrti = datumSmrti;
    }
}
