package academy.devdojo.domain;


import java.util.List;

public class Anime {
    private Long id;
    private String name;

    public Anime(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public static List<Anime> getAnimes(){
        Anime jigokuraku = new Anime(1L, "jigokuraku");
        Anime konosuba = new Anime(2L, "konosuba");
        Anime drStone = new Anime(3L, "drStone");
        return List.of(jigokuraku, konosuba, drStone);
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
