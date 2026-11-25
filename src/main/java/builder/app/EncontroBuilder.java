package builder.app;

import java.time.LocalDate;

public class EncontroBuilder {

    private Encontro encontro;

    public EncontroBuilder() {
        encontro = new Encontro();
    }

    public Encontro build() {
        if (encontro.getClube().equals("")) {
            throw new IllegalArgumentException("Clube inválido");
        }
        if (encontro.getObra().equals("")) {
            throw new IllegalArgumentException("Obra inválida");
        }
        if (encontro.getData() == null) {
            throw new IllegalArgumentException("Data inválida");
        }
        return encontro;
    }

    public EncontroBuilder setClube(String clube) {
        encontro.setClube(clube);
        return this;
    }

    public EncontroBuilder setObra(String obra) {
        encontro.setObra(obra);
        return this;
    }

    public EncontroBuilder setData(LocalDate data) {
        encontro.setData(data);
        return this;
    }

    public EncontroBuilder setHorario(String horario) {
        encontro.setHorario(horario);
        return this;
    }

    public EncontroBuilder setLocal(String local) {
        encontro.setLocal(local);
        return this;
    }

    public EncontroBuilder setLinkReuniao(String linkReuniao) {
        encontro.setLinkReuniao(linkReuniao);
        return this;
    }

    public EncontroBuilder setCapituloMeta(int capituloMeta) {
        encontro.setCapituloMeta(capituloMeta);
        return this;
    }

    public EncontroBuilder setLimiteParticipantes(int limiteParticipantes) {
        encontro.setLimiteParticipantes(limiteParticipantes);
        return this;
    }

    public EncontroBuilder setAlertaSpoiler(boolean alertaSpoiler) {
        encontro.setAlertaSpoiler(alertaSpoiler);
        return this;
    }

    public EncontroBuilder setPerguntasDiscussao(String perguntasDiscussao) {
        encontro.setPerguntasDiscussao(perguntasDiscussao);
        return this;
    }
}
