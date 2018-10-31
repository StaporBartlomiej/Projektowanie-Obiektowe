import com.google.common.collect.ImmutableSet;

public class Main {

    public static void main(String[] args) {

        KomorkaZwierzeca komorkaZwierzeca = KomorkaZwierzeca.builder()
                .komorka(Komorka.builder()
                        .blonaKomorkowa(ImmutableSet.of("blona1", "blona2"))
                        .jadroKomorkowe("jadro")
                        .blonaJadrowa(ImmutableSet.of("blona1", "blona2"))
                        .retikulumEndoplazmatyczne(ImmutableSet.of("retikulum1", "retikulum2"))
                        .rybosom(ImmutableSet.of("rybosom1", "rybosom2"))
                        .mitochondrium(ImmutableSet.of("mithochondrium1", "mitochondrium2"))
                        .wakuola(ImmutableSet.of("wakuola", "weakuola2"))
                        .lizosom(ImmutableSet.of("lizosom", "lizosom2"))
                        .cytoplazma(ImmutableSet.of("cytoplazma1", "cytoplazma2"))
                        .build())
                .build();

        KomorkaRoslinna komorkaRoslinna = KomorkaRoslinna.builder()
                .komorka(Komorka.builder()
                        .blonaKomorkowa(ImmutableSet.of("blona1", "blona2"))
                        .jadroKomorkowe("jadro")
                        .blonaJadrowa(ImmutableSet.of("blona1", "blona2"))
                        .retikulumEndoplazmatyczne(ImmutableSet.of("retikulum1", "retikulum2"))
                        .rybosom(ImmutableSet.of("rybosom1", "rybosom2"))
                        .mitochondrium(ImmutableSet.of("mithochondrium1", "mitochondrium2"))
                        .wakuola(ImmutableSet.of("wakuola", "weakuola2"))
                        .lizosom(ImmutableSet.of("lizosom", "lizosom2"))
                        .cytoplazma(ImmutableSet.of("cytoplazma1", "cytoplazma2"))
                        .build())
                .chloroplast(ImmutableSet.of("chloroplast1", "chloroplast2"))
                .scianaKomorkowa("sciana komorkowa")
                .build();
        System.out.println(komorkaRoslinna);
        System.out.println(komorkaZwierzeca);
    }
}
