import io.quarkiverse.roq.frontmatter.runtime.model.DocumentPage;
import io.quarkiverse.roq.frontmatter.runtime.model.RoqCollection;
import io.quarkus.qute.TemplateExtension;
import io.quarkus.qute.TemplateGlobal;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

@TemplateExtension
public class Extensions {

    public static Collection<DocumentPage> future(RoqCollection collection) {
        return collection.stream().filter(d -> d.date().isAfter(ZonedDateTime.now())).toList();
    }

    public static Collection<DocumentPage> past(RoqCollection collection) {
        return collection.stream().filter(d -> d.date().isBefore(ZonedDateTime.now())).toList();
    }


}
