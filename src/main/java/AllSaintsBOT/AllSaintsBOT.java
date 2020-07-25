package AllSaintsBOT;

import AllSaintsBOT.saints.Saint;
import AllSaintsBOT.saints.SaintListener;
import AllSaintsBOT.verses.Verse;
import AllSaintsBOT.verses.VerseData;
import AllSaintsBOT.verses.VerseListener;
import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.security.auth.login.LoginException;
import java.util.ArrayList;
import java.util.List;

//Todo:

public class AllSaintsBOT{
    private static final Logger logger = LoggerFactory.getLogger(AllSaintsBOT.class);
    public static JDA jda;
    public static VerseData verseData;
    static List<Saint> saints = new ArrayList<>();
    static List<Verse> verses=  new ArrayList<>();

    public static void main(String[] args) throws LoginException {
        jda = new JDABuilder(AccountType.BOT)
                .setToken("")
                .setStatus(OnlineStatus.ONLINE)
                .setActivity(Activity.watching("Twoją duszę."))
                .addEventListeners(new SaintListener(saints))
                .addEventListeners(new VerseListener(verses))
                .build();
    }

}
