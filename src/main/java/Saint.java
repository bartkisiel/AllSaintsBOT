import java.time.MonthDay;
import java.util.List;

public class Saint {
    private String name;
    private String description;
    private String imgAdress;
    private MonthDay date;
    boolean female;

    public Saint(String name, String description, String imgAdress, MonthDay date, boolean female) {
        this.name = name;
        this.description = description;
        this.imgAdress = imgAdress;
        this.date = date;
        this.female = female;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImgAdress() {
        return imgAdress;
    }

    public void setImgAdress(String imgAdress) {
        this.imgAdress = imgAdress;
    }

    public MonthDay getDate() {
        return date;
    }

    public void setDate(MonthDay date) {
        this.date = date;
    }

    public boolean isFemale() {
        return female;
    }

    public static class SaintsData {

        public static List<Saint> saintsAdder (List<Saint> saints) {
            saints.add(new Saint("Daniel, prorok",
                    "Był jednym w czterech wielkich proroków Starego Testamentu. O jego życiu opowiada starotestamentalna Księga Daniela. " +
                            "Bóg obdarzył go darem mądrości i rozeznania, to zaś uzdalniało go do objęcia wysokich stanowisk państwowych. Piastował je za panowania Nabonida, Cyrusa Wielkiego i Dariusza I. " +
                            "Zajął poczesne miejsce w ikonografii chrześcijańskiej. W niektórych regionach (Karyntia, Tyrol, Carrara i in.) długo uchodził za patrona górników.",
                    "https://brewiarz.pl/czytelnia/swieci/img/07/2107-daniel_1.jpg",
                    MonthDay.of(7, 21), false));

            saints.add(new Saint("Święta Maria Magdalena",
                    "Według biblijnej relacji Maria pochodziła z Magdali - \"wieży ryb\" nad Jeziorem Galilejskim, ok. 4 km na północny zachód od Tyberiady. Jezus wyrzucił z niej siedem złych duchów (Mk 16, 9; Łk 8, 2). Odtąd włącza się ona do grona Jego słuchaczy i wraz z innymi niewiastami troszczy się o wędrujących z Nim ludzi.",
                    "https://brewiarz.pl/czytelnia/swieci/img/07/2207-mariamagdalena_2.jpg",
                    MonthDay.of(7, 22), true));

            saints.add(new Saint("Święta Brygida Szwedzka",
                    "Brygida urodziła się w 1303 r. na zamku w Finstad koło Uppsali. " +
                            "Według żywotów Brygida miała od dziecka cieszyć się oznakami szczególnej przyjaźni Pana Jezusa. Kiedy miała 7 lat, ukazała się jej Najświętsza Maryja Panna i złożyła na jej głowie tajemniczą koronę. Trzy lata później zjawił się jej Chrystus na krzyżu.\n" +
                            "Postanowiła oddać się wyłącznie służbie Bożej i pełnieniu dobrych uczynków. Długie godziny poświęcała modlitwie. Mnożyła akty umartwienia i pokuty. Naglona objawieniami, pisała listy do możnych tego świata, napominając ich w imię Pana Boga. Królowi szwedzkiemu i zakonowi krzyżackiemu przepowiedziała kary Boże, które też niebawem na nich spadły."
                            + "Brygida pozostawiła po sobie księgę Objawień. Wkrótce znała ją cała Europa. Była wielokrotnie przepisywana. W księdze tej św. Brygida spisała przepowiednie dotyczące Kościoła, papieży żyjących w jej czasach, losów państw i ówczesnych panujących oraz odnośnie do przyszłości wielu innych osób. Była przekonana, że pisze to, co jej dyktował Chrystus.\n"
                            + " 1 października 1999 r. św. Jan Paweł II listem motu proprio ogłosił św. Brygidę współpatronką Europy (razem ze św. Katarzyną ze Sieny i św. Teresą Benedyktą od Krzyża). Św. Brygida jest także patronką Szwecji, pielgrzymów oraz dobrej śmierci."
                            + "Czasami siedzi przy pulpicie i spisuje swoje wizje. Jej atrybutami są: heraldyczny lew, korona; księga, którą pisze; ptasie pióro, pielgrzymi kapelusz, serce i krzyż.",
                    "https://brewiarz.pl/czytelnia/swieci/img/07/2307-brygida_2.jpg",
                    MonthDay.of(7, 23), true));


            saints.add(new Saint("Święta Kinga Dziewica",
                    "Kinga (Kunegunda) urodziła się w 1234 r. jako trzecia z kolei córka Beli IV, króla węgierskiego z dynastii Arpadów, i jego żony Marii, córki cesarza bizantyjskiego Teodora I Laskarisa.\n"
                            + "W Wojniczu małoletnia jeszcze Kinga spotkała się z Bolesławem Wstydliwym; tam też doszło do zawarcia umowy małżeńskiej. Ponieważ zamek w Krakowie, jak też w Sandomierzu, Tatarzy zupełnie zniszczyli, tak że się nie nadawał do zamieszkania, Bolesław i Kinga pozostali w Nowym Korczynie. Tu właśnie Kinga nakłoniła swego przyszłego męża do zachowania dozgonnej czystości, którą ślubowali oboje na ręce biskupa krakowskiego Prandoty. Dlatego historia nadała Bolesławowi przydomek \"Wstydliwy\". W tej formie czystości małżeńskiej Kinga spędziła z Bolesławem 40 lat."
                            + "W ikonografii przedstawiana jest w stroju klaryski lub księżnej, w ręku trzyma makietę klasztoru ze Starego Sącza, czasami bryłę soli, bywa w niej pierścień.",
                    "https://brewiarz.pl/czytelnia/swieci/img/07/2407-kinga_2.jpg",
                    MonthDay.of(7,24),
                    true));

            saints.add(new Saint("Święty Jakub Starszy, Apostoł",
                    "Św. Jakub Większy jest tym, który jest wymieniany w spisie Apostołów wcześniej - był powołany przez Jezusa, razem ze swym bratem Janem, jako jeden z Jego pierwszych uczniów (Mt 4, 21-22).\n" +
                            "Został zapewne powołany do grona uczniów Chrystusa już nad rzeką Jordan. Tam bowiem spotykamy jego brata, Jana (J 1, 37). Po raz drugi jednak Pan Jezus wezwał go w czasie połowu ryb. Wspomina o tym św. Łukasz (Łk 5, 1-11), dodając nowy szczegół - że było to po pierwszym cudownym połowie ryb. "
                            + " Jakub należał do uprzywilejowanych uczniów Pana Jezusa, którzy byli świadkami wskrzeszenia córki Jaira (Mk 5, 37; Łk 8, 51), przemienienia na górze Tabor (Mt 17, 1nn; Mk 9, 1; Łk 9, 28) oraz modlitwy w Ogrójcu (Mt 26, 37). Żywe usposobienie Jakuba i Jana sprawiło, że Jezus nazwał ich \"synami gromu\" (Mk 3, 17).\n"
                            + "Dzieje Apostolskie wspominają o św. Jakubie dwa razy: kiedy wymieniają go na liście Apostołów (Dz 1, 13) oraz przy wzmiance o jego męczeńskiej śmierci. Święty jest patronem Hiszpanii i Portugalii; ponadto m. in. zakonów rycerskich walczących z islamem, czapników, hospicjów, szpitali, kapeluszników, pielgrzymów, sierot.",
                    "https://brewiarz.pl/czytelnia/swieci/img/07/2507-jakub_4.jpg",
                    MonthDay.of(7,25),
                    false));

            saints.add(new Saint("Święci Anna i Joachim, rodzice Najświętszej Maryi Panny",
                    "Ewangelie nie przekazały o rodzicach Maryi żadnej wiadomości. Milczenie Biblii dopełnia bogata literatura apokryficzna.\n" +
                            "Anna pochodziła z rodziny kapłańskiej z Betlejem. Hebrajskie imię Anna w języku polskim znaczy tyle, co \"łaska\"" +
                            " Jest patronką diecezji opolskiej, miast, m.in. Hanoveru, oraz kobiet rodzących, matek, wdów, położnic, ubogich robotnic, górników kopalni złota, młynarzy, powroźników i żeglarzy.\n"
                            + "Joachim miał pochodzić z zamożnej i znakomitej rodziny z Galilei. Już samo jego imię miało być prorocze, gdyż oznacza tyle, co \"przygotowanie Panu\". W dawnej Polsce czczony był jako \"protektor Królestwa\". Kiedy Maryja była jeszcze dzieckiem, miał pożegnać ziemię. Razem ze św. Anną patronują małżonkom.",
                    "https://brewiarz.pl/czytelnia/swieci/img/07/2607-anna_3.jpg",
                    MonthDay.of(7,26),
                    false));

            saints.add(new Saint("Święty Innocenty I, papież",
                    "Innocenty pochodził z Albano koło Rzymu. Był synem papieża Anastazego I - podczas jego pontyfikatu był diakonem w Rzymie. Zajmował się bierzmowaniem, którego odtąd udzielać mogli tylko biskupi. Zakazał zawierania małżeństw biskupom, kapłanom i diakonom, lecz zgadzał się na to, by można je było zawierać przed wstąpieniem do stanu duchownego.\n"
                            + "Interweniował w sporach episkopatu afrykańskiego, które powstały wskutek potępienia herezji pelagianizmu. Działał energicznie, aby zażegnać niebezpieczeństwo nestorianizmu.",
                    "https://brewiarz.pl/czytelnia/swieci/img/07/2707-innocentyI_1.jpg",
                    MonthDay.of(7,27),
                    false));

            saints.add(new Saint("Święta Alfonsa Muttathupadathu\n" +
                    "od Niepokalanego Poczęcia, zakonnica",
                    "Anna Muttathuopadathu urodziła się 19 sierpnia 1910 r. w Kudumalorze w Kerali (Indie)."
                            + " Ciotka starała się nakłonić Annę do małżeństwa, odwodząc ją od pójścia do zakonu. Anna wykazała się jednak ogromną siłą ducha i nie uległa namowom opiekunki.\n"
                            + "Przez większość życia zakonnego znosiła ciężkie choroby i cierpienia duchowe, ofiarując je Najświętszemu Sercu Jezusa. Nigdy się nie skarżyła. Jej wstawiennictwu przypisywana jest seria cudownych uzdrowień, do których dochodziło wśród modlących się u jej grobu",
                    "https://brewiarz.pl/czytelnia/swieci/img/07/2807-alfonsa_1.jpg",
                    MonthDay.of(7,28),
                    true));

            saints.add(new Saint("Święta Marta",
                    "Marta pochodziła z Betanii, miasteczka położonego na wschodnim zboczu Góry Oliwnej, w pobliżu wioski Betfage, odległego od Jerozolimy o ok. 3 km drogi. Była siostrą Marii i Łazarza, których Chrystus darzył swą przyjaźnią. Bardzo wiele razy gościła Go w swoim domu. Św. Łukasz opisuje szczegółowo jedno ze spotkań (Łk 10, 38-42). Martę wspomina w Ewangelii św. Jan, odnotowując wskrzeszenie Łazarza.\n"
                            + "Św. Marta jest patronką gospodyń domowych, hotelarzy, kucharek, sprzątaczek i właścicieli zajazdów.",
                    "https://brewiarz.pl/czytelnia/swieci/img/07/2907-marta_3.jpg",
                    MonthDay.of(7,29),
                    true));

            saints.add(new Saint("Święty Piotr Chryzolog, biskup i doktor Kościoła",
                    "Piotr urodził się około 380 r. w miasteczku Imola.\n Jako biskup stolicy cesarskiej miał duży wpływ na kierunek rządów cesarzy. Do niego udawali się duchowni dygnitarze w różnych potrzebach, by pośredniczył między nimi a dworem cesarskim." +
                            " Jest patronem diecezji i miasta Imoli.",
                    "https://brewiarz.pl/czytelnia/swieci/img/07/3007-chryzolog_1.jpg",
                    MonthDay.of(7,30),
                    false));

            saints.add(new Saint("Święty Ignacy z Loyoli, prezbiter",
                    "Inigo Lopez urodził się w roku 1491 na zamku w Loyola w kraju Basków (Hiszpania), jako trzynaste dziecko w zamożnym rycerskim rodzie.\n"
                            + "Beatyfikacji Ignacego Loyoli dokonał papież Paweł V (w 1609 r.), a kanonizacji - Grzegorz XV (w 1623 r.). Św. Ignacy jest patronem trzech diecezji w kraju Basków; zakonu jezuitów; dzieci, matek oczekujących dziecka, kuszonych, skrupulantów, żołnierzy oraz uczestników rekolekcji - zarówno rekolektantów, jak i rekolekcjonistów. Jego relikwie spoczywają w rzymskim kościele di Gesu.",
                    "https://brewiarz.pl/czytelnia/swieci/img/07/3107-loyola_1.jpg",
                    MonthDay.of(7,31),
                    false));

            saints.add(new Saint("Święty Alfons Maria Liguori,\n" +
                    "biskup i doktor Kościoła",
                    "Alfons Maria urodził się 27 września 1696 r. w Marinelli pod Neapolem, w zamożnej rodzinie szlacheckiej. W dwa dni potem otrzymał chrzest. Jego ojciec marzył dla niego o karierze urzędniczej. W rodzinnym pałacu Alfons miał doskonałych nauczycieli. Wykazywał także od dziecka niezwykłą pilność do nauki i duże zdolności. Gdy ukończył szkołę podstawową, został wysłany na studia prawnicze na uniwersytet w Neapolu. Miał wtedy zaledwie 12 lat (1708). Kiedy miał zaledwie 17 lat, był już doktorem obojga praw.\n"
                            + "Kiedy nastał głód, sprzedał sprzęty i naczynia domu biskupiego, aby za to kupić chleb dla głodujących. Jako biskup nie tylko nie zmienił surowego trybu życia, ale go nawet obostrzył, twierdząc, że teraz musi pokutować za swoich wiernych. Sypiał mało, jadł tylko zupę, chleb i jarzyny, nosił włosiennicę i kolczasty łańcuch, biczował się często do krwi. Jest patronem zakonu redemptorystów; adwokatów, osób świeckich, spowiedników, teologów, zwłaszcza moralistów.",
                    "https://brewiarz.pl/czytelnia/swieci/img/08/0108-alfons_1.jpg",
                    MonthDay.of(8,01),
                    false));

            saints.add(new Saint("Święty Piotr Faber (Favre), prezbiter",
                    "Był z pochodzenia Sabaudczykiem.\n"
                            + "Wszędzie zjednywał sobie przyjaciół, przemawiał, pertraktował, prowadził dyskusje. Przede wszystkim udzielał ćwiczeń duchownych, a wedle zgodnej opinii wielu - czynił to po mistrzowsku. Wywarł w ten sposób wielki wpływ na duchownych, zakonników, dostojników kościelnych i świeckich.",
                    "https://brewiarz.pl/czytelnia/swieci/img/08/0208-faber_1.jpg",
                    MonthDay.of(8,02),
                    false));

            saints.add(new Saint("Święta Lidia",
                    "Lidia to postać znana z kart Nowego Testamentu. Mieszkała w Filippi, w Macedonii. Była zapewne osobą zamożną, bowiem purpura - tkanina, którą sprzedawała - stanowiła towar luksusowy. Kiedy św. Paweł przybył do miasta, w którym mieszkała, Lidia była poganką skłaniającą się ku monoteizmowi. Spotkawszy Apostoła, przyjęła chrzest." +
                            "Paweł pozyskał ją dla Chrystusa jako pierwszą pogankę w Europie w czasie swojej drugiej podróży, która obejmowała Małą Azję, Macedonię oraz Grecję. Jest patronką farbiarzy.",
                    "https://brewiarz.pl/czytelnia/swieci/img/08/0308-lidia_1.jpg",
                    MonthDay.of(8,03),
                    true));

            saints.add(new Saint("Święty Jan Maria Vianney, prezbiter",
                    "Jan urodził się w rodzinie ubogich wieśniaków w Dardilly koło Lyonu 8 maja 1786 r.\n" +
                            "Całe godziny przebywał na modlitwie przed Najświętszym Sakramentem. Sypiał zaledwie po parę godzin dziennie na gołych deskach. Kiedy w 1824 r. otwarto w wiosce szkółkę, uczył w niej prawd wiary. "
                            + "W dziesiątym roku pasterzowania przybyło do Ars ok. 20 000 ludzi. W ostatnim roku swojego życia miał przy konfesjonale ich ok. 80 000. Łącznie przez 41 lat jego pobytu w tym miejscu przez Ars przewinęło się około miliona ludzi.\n" +
                            "Jako męczennik cierpiący za grzeszników i ofiara konfesjonału, zmarł 4 sierpnia 1859 r., przeżywszy 73 lata. W pogrzebie skromnego proboszcza z Ars wzięło udział ok. 300 kapłanów i ok. 6000 wiernych. W ikonografii Święty przedstawiany jest w stroju duchownym ze stułą na szyi, często w otoczeniu dzieci.",
                    "https://brewiarz.pl/czytelnia/swieci/img/08/0408-jan_2.jpg",
                    MonthDay.of(8,04),
                    false));
            return saints;
        }
    }
}
