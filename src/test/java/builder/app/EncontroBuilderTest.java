package builder.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.fail;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class EncontroBuilderTest {

    @Test
    void deveRetornarExcecaoParaEncontroSemClube() {
        try {
            EncontroBuilder encontroBuilder = new EncontroBuilder();
            Encontro encontro = encontroBuilder
                    .setObra("Duna")
                    .setData(LocalDate.of(2026, 12, 12))
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Clube inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaEncontroSemObra() {
        try {
            EncontroBuilder encontroBuilder = new EncontroBuilder();
            Encontro encontro = encontroBuilder
                    .setClube("Leitores de Duna")
                    .setData(LocalDate.of(2026, 12, 12))
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Obra inválida", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaEncontroSemData() {
        try {
            EncontroBuilder encontroBuilder = new EncontroBuilder();
            Encontro encontro = encontroBuilder
                    .setClube("Leitores de Duna")
                    .setObra("Duna")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Data inválida", e.getMessage());
        }
    }

    @Test
    void deveRetornarEncontroValido() {
        EncontroBuilder encontroBuilder = new EncontroBuilder();
        Encontro encontro = encontroBuilder
                .setClube("Leitores de Duna")
                .setObra("Duna")
                .setData(LocalDate.of(2026, 12, 12))
                .build();

        assertNotNull(encontro);
    }

    @Test
    void deveRetornarEncontroOnlineComMetaDeLeitura() {
        EncontroBuilder encontroBuilder = new EncontroBuilder();
        Encontro encontro = encontroBuilder
                .setClube("Cine Sexta")
                .setObra("Arcane")
                .setData(LocalDate.of(2026, 12, 5))
                .setLinkReuniao("meet.lore/cine-sexta")
                .setCapituloMeta(6)
                .setAlertaSpoiler(true)
                .build();

        assertEquals("meet.lore/cine-sexta", encontro.getLinkReuniao());
        assertEquals(6, encontro.getCapituloMeta());
        assertEquals(true, encontro.isAlertaSpoiler());
        assertNull(encontro.getLocal());
    }
}
