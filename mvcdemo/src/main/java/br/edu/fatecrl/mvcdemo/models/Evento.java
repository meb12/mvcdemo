package br.edu.fatecrl.mvcdemo.models;

public class Evento {
    private String nomeShow;
    private String local;
    private String data;

    public String getNomeShow() {
        return nomeShow;
    }

    public void setNomeShow(String nomeShow) {
        this.nomeShow = nomeShow;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Evento(String nomeShow, String local, String data) {
        this.nomeShow = nomeShow;
        this.local = local;
        this.data = data;
    }
}
