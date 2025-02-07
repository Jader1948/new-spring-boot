package academy.devdojo.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
public class Producer {

    private Long id;
    private String name;
    @Getter
    private static List<Producer> producers = new ArrayList<>();

    static{
        var mappa = new Producer(1L, "Mappa");
        var kyotoAnimation = new Producer(2L, "Kyoto Animation");
        var madHouse = new Producer(3L, "MadHouse");
        producers.addAll(List.of(mappa, kyotoAnimation, madHouse));
    }

}
