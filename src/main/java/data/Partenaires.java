package data;

import io.quarkiverse.roq.data.runtime.annotations.DataMapping;

import java.util.List;

@DataMapping(value = "partenaires", parentArray = true)
public record Partenaires(List<Partenaire> list) {
    public record Partenaire(String name, String image, String url){}
}
