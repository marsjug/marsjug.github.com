package data;

import io.quarkiverse.roq.data.runtime.annotations.DataMapping;

import java.time.LocalDate;
import java.util.List;

@DataMapping(value = "archive-reunions", parentArray = true)
public record ArchiveReunions(List<Saison> list) {
    public record Saison(String year, List<Reunion> reunions){
    }

    public record Reunion(String title, List<Speaker> speakers, String date, String slides) {
        public LocalDate localDate() {
            return LocalDate.parse(date());
        }
    }

    public record Speaker(String name, String profile) {
    }
}
