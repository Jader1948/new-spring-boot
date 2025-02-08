package academy.devdojo.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@ToString
public class Anime {
    private Long id;
    //@JsonProperty(value = "name2")
    private String name;
    @Getter
    private static List<Anime> animes = new ArrayList<>();

    static {
        var jigorukaraku = new Anime(1L, "jigorukaraku");
        var kososuba = new Anime(2L, "kososuba");
        var drStone = new Anime(3L, "drStone");
        animes.addAll(List.of(jigorukaraku, kososuba, drStone));
    }

}
