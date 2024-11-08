package data;

import io.quarkiverse.roq.data.runtime.annotations.DataMapping;

import java.util.List;

@DataMapping(value = "locations", parentArray = true)
public record Locations(List<Location> list) {

    public record Location(String name, String id, String info){}

    public Location get(String id) {
        return list.stream().filter(s -> s.id.equals(id)).findFirst().orElse(null);
    }
}
