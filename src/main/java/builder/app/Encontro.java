package builder.app;

import java.time.LocalDate;

public class Encontro {

    private String clube;
    private String obra;
    private LocalDate data;
    private String horario;
    private String local;
    private String linkReuniao;
    private int capituloMeta;
    private int limiteParticipantes;
    private boolean alertaSpoiler;
    private String perguntasDiscussao;

    public Encontro() {
        this.clube = "";
        this.obra = "";
    }

    public String getClube() {
        return clube;
    }

    public void setClube(String clube) {
        this.clube = clube;
    }

    public String getObra() {
        return obra;
    }

    public void setObra(String obra) {
        this.obra = obra;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getLinkReuniao() {
        return linkReuniao;
    }

    public void setLinkReuniao(String linkReuniao) {
        this.linkReuniao = linkReuniao;
    }

    public int getCapituloMeta() {
        return capituloMeta;
    }

    public void setCapituloMeta(int capituloMeta) {
        this.capituloMeta = capituloMeta;
    }

    public int getLimiteParticipantes() {
        return limiteParticipantes;
    }

    public void setLimiteParticipantes(int limiteParticipantes) {
        this.limiteParticipantes = limiteParticipantes;
    }

    public boolean isAlertaSpoiler() {
        return alertaSpoiler;
    }

    public void setAlertaSpoiler(boolean alertaSpoiler) {
        this.alertaSpoiler = alertaSpoiler;
    }

    public String getPerguntasDiscussao() {
        return perguntasDiscussao;
    }

    public void setPerguntasDiscussao(String perguntasDiscussao) {
        this.perguntasDiscussao = perguntasDiscussao;
    }
}
