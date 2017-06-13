/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Bona
 */
public class Karya_ilmiah {
    private String id_dokumen;
    private String judul;
    private String tgl_upload;
    private String abstrak;
    private String disiplin_ilmu;
    private String nama_penerbit;
    private int tahun_terbit;
    private String nama_jurnal;
    private String tipe_jurnal;
    private int volume;
    private String pembiaya;
    private int biaya;

    public String getId_dokumen() {
        return id_dokumen;
    }

    public void setId_dokumen(String id_dokumen) {
        this.id_dokumen = id_dokumen;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getTgl_upload() {
        return tgl_upload;
    }

    public void setTgl_upload(String tgl_upload) {
        this.tgl_upload = tgl_upload;
    }

    public String getAbstrak() {
        return abstrak;
    }

    public void setAbstrak(String abstrak) {
        this.abstrak = abstrak;
    }

    public String getDisiplin_ilmu() {
        return disiplin_ilmu;
    }

    public void setDisiplin_ilmu(String disiplin_ilmu) {
        this.disiplin_ilmu = disiplin_ilmu;
    }

    public String getNama_penerbit() {
        return nama_penerbit;
    }

    public void setNama_penerbit(String nama_penerbit) {
        this.nama_penerbit = nama_penerbit;
    }

    public int getTahun_terbit() {
        return tahun_terbit;
    }

    public void setTahun_terbit(int tahun_terbit) {
        this.tahun_terbit = tahun_terbit;
    }

    public String getNama_jurnal() {
        return nama_jurnal;
    }

    public void setNama_jurnal(String nama_jurnal) {
        this.nama_jurnal = nama_jurnal;
    }

    public String getTipe_jurnal() {
        return tipe_jurnal;
    }

    public void setTipe_jurnal(String tipe_jurnal) {
        this.tipe_jurnal = tipe_jurnal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getPembiaya() {
        return pembiaya;
    }

    public void setPembiaya(String pembiaya) {
        this.pembiaya = pembiaya;
    }

    public int getBiaya() {
        return biaya;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }
    
}
