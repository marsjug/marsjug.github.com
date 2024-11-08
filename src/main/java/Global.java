import io.quarkus.qute.TemplateGlobal;

import java.time.format.DateTimeFormatter;
import java.util.Locale;

@TemplateGlobal
public class Global {

    public static DateTimeFormatter FULL_DATE_FORMAT = DateTimeFormatter.ofPattern("EEEE d MMMM yyyy", Locale.FRENCH);
    public static DateTimeFormatter TIME_FORMAT = DateTimeFormatter.ofPattern("HH'h'mm", Locale.FRENCH);

}
