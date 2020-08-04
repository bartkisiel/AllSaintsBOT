package AllSaintsBOT.verses;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class VerseListener extends ListenerAdapter {
    private static final Logger logger = LoggerFactory.getLogger(VerseListener.class);
    public static JDA jda;
    public List<Verse> verses = new ArrayList<>();

    public VerseListener(List<Verse> verses) {
        this.verses = VerseData.verseAdder(verses);
    }

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        EmbedBuilder embedBuilder = new EmbedBuilder();
        Random random = new Random();
        int randomNumber = random.nextInt(verses.size()) + 1;
        Optional<Verse> result = verses
                .stream()
                .filter(v -> v.getId() == randomNumber)
                .findFirst();

        Verse verse = result.orElse(null);

        if(event.getAuthor().isBot()) {
            return;
        }

         if (event.getMessage().getContentRaw().equalsIgnoreCase("!werset")) {
            if(verse == null) {
                embedBuilder.setDescription("We couldn't find a verse for you, please try again...");
            }
            embedBuilder.setTitle(verse.getSiglum());
            embedBuilder.setDescription(verse.getVerse());
            embedBuilder.setColor(0xbf9000);
            embedBuilder.setImage(verse.getImageAdress());
            embedBuilder.setFooter("Czytaj więcej na: " + "https://biblia.deon.pl");
            event.getChannel().sendMessage(embedBuilder.build()).queue();
        }
    }

}
