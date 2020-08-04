package AllSaintsBOT.saints;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.MonthDay;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SaintListener extends ListenerAdapter {
    private static final Logger logger = LoggerFactory.getLogger(SaintListener.class);
    public static JDA jda;
    public List<Saint> saints = new ArrayList<>();

    public SaintListener(List<Saint> saints) {
        this.saints = SaintsData.saintsAdder(saints);

    }

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        EmbedBuilder embedBuilder = new EmbedBuilder();
        MonthDay today = MonthDay.now();

        Optional<Saint> result = saints
                .stream()
                .filter(s -> s.getDate().equals(today))
                .findFirst();
        Saint todaySaint = result.orElse(null);

        if(event.getAuthor().isBot()) {
            return;
        }

        if(event.getMessage().getContentRaw().equalsIgnoreCase("!swiety")) {
                embedBuilder.setColor(0x66d8ff);

                if(todaySaint.isFemale() == false){
                    embedBuilder.setTitle("Na Chwałę Pana! Święty na dzisiaj to: " + todaySaint.getName());
                }
                else {
                    embedBuilder.setTitle("Na Chwałę Pana! Święta na dzisiaj to: " + todaySaint.getName());
                }
                embedBuilder.setFooter("Czytaj więcej na: " + "https://brewiarz.pl/czytelnia/swieci/daty.php");
                embedBuilder.setDescription(todaySaint.getDescription());
                embedBuilder.setImage(todaySaint.getImgAdress());
                event.getChannel().sendMessage(embedBuilder.build()).queue();

                if(todaySaint == null){
                    event.getChannel().sendMessage("W naszej bazie danych nie ma Świętego na dzisiaj. Możesz poszukać na: " +
                        "https://brewiarz.pl/czytelnia/swieci/daty.php3").queue();
            }
        }
    }
}
