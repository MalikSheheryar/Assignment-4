    package com.example.connect;

    import java.util.ArrayList;
    public class HardCodedProfiles {
        static ArrayList<Profile> profiles = new ArrayList<>();

        public static ArrayList<Profile> hardCodedProfiles() {

            Profile p1=new Profile("Harisbhatti01","hm26284205@gmail.com","Haris@999","lahore",20,"Haris","Bachelors","Bhatti","yet to be seen",new ArrayList<Hobbies> (){{
                add(Hobbies.SINGING);
                add(Hobbies.GUITAR);
                add(Hobbies.COOKING);}},Religion.ISLAM,Gender.MALE);
            Profile p2=new Profile("tahirkaboy","Hasaantahir66@gmail.com","Tahir@77","lahore",18,"Hassaan","Bachelors","Rehmani","Mama's boy",new ArrayList<Hobbies> (){{
                add(Hobbies.SKETCHING);
                add(Hobbies.COOKING);
                add(Hobbies.PROGRAMMING);}},Religion.ISLAM,Gender.MALE);
            Profile p3=new Profile("SaimSaeed5","SaimSheikh07@gmail.com","Comsats@67","lahore",19,"saim","Bachelors","Sheikh","Foodie",new ArrayList<Hobbies> (){{
                add(Hobbies.PROGRAMMING);
                add(Hobbies.DANCE);
                add(Hobbies.GAMING);}},Religion.ISLAM,Gender.MALE);
            Profile p4=new Profile("Ayesha99", "sassygal123", "love4@life", "lahore", 25, "Ayesha", "Bachelors", "Khokhar", "I love adventure and trying new foods",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.PAINTING);
                        add(Hobbies.PHOTOGRAPHY);
                        add(Hobbies.READING);
                    }}, Religion.ISLAM, Gender.FEMALE);

            Profile p5=new Profile("AbdullahSheikh", "techgeek", "coding@123", "lahore", 28, "Abdullah", "Masters", "Sheikh", "Passionate about technology and innovation",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.PROGRAMMING);
                        add(Hobbies.GAMING);
                        add(Hobbies.READING);
                    }}, Religion.ISLAM, Gender.MALE);

            Profile p6=new Profile("Sophia77", "melodymaker", "music@123", "Karachi", 22, "Sophia", "Bachelors", "Jutt","Music is life, love concerts and jamming sessions",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.SINGING);
                        add(Hobbies.GUITAR);
                        add(Hobbies.DANCE);
                    }}, Religion.BUDDHISM, Gender.FEMALE);

            Profile p7=new Profile("Mahmood123", "sportsguru", "gameon@123", "lahore", 27, "Mahmood", "Masters", "Malik", "Athletic and competitive, love all sports",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.SPORTS);
                        add(Hobbies.BINGE_WATCHING);
                        add(Hobbies.COOKING);
                    }}, Religion.ISLAM, Gender.MALE);

            Profile p8=new Profile("IsmailButt", "artsy", "painter@123", "lahore", 30, "Ismail", "Masters", "Butt", "Expressing emotions through art, passionate about painting",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.PAINTING);
                        add(Hobbies.PHOTOGRAPHY);
                        add(Hobbies.READING);
                    }}, Religion.ISLAM, Gender.FEMALE);

            Profile p9=new Profile("Bajwa88", "adventurelover", "explore@123", "lahore", 24, "Usman", "Bachelors", "Bajwa", "Always seeking new adventures and challenges",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.READING);
                        add(Hobbies.BINGE_WATCHING);
                        add(Hobbies.PHOTOGRAPHY);         }}, Religion.ISLAM, Gender.MALE);

            Profile p10=new Profile("UsamaBhatti9", "booklover", "novels@123", "Karachi", 26, "Usama", "Masters", "Rajput", "Lost in the world of books, avid reader and literature enthusiast",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.READING);
                        add(Hobbies.WRITING);
                        add(Hobbies.COOKING);
                    }}, Religion.ISLAM, Gender.MALE);
            Profile p11=new Profile("Javeria489", "foodlover", "foodie@123", "Islamabad", 29, "Javeria", "Bachelors", "Qureshi", "Passionate about food, love trying new cuisines",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.COOKING);
                        add(Hobbies.BAKING);
                        add(Hobbies.DIYS);
                    }}, Religion.ISLAM, Gender.FEMALE);

            Profile p12=new Profile("HaseebKhokhar4", "traveler", "travel&123", "Islamabad", 32, "Haseeb", "Masters", "Bhukhari", "Wanderlust, love exploring new cultures and destinations",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.CHESS);
                        add(Hobbies.PHOTOGRAPHY);
                        add(Hobbies.DIYS);
                    }}, Religion.ISLAM, Gender.MALE);


            Profile p13=new Profile("Rana777", "naturelover", "nature@123", "Karachi", 23, "Ehsan", "Bachelors", "Rana", "Hiking, camping, and stargazing enthusiast",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.CHESS);
                        add(Hobbies.BINGE_WATCHING);
                        add(Hobbies.PHOTOGRAPHY);
                    }}, Religion.ISLAM, Gender.MALE);

            Profile p14=new Profile("Laiba88", "fitguru", "fitness@123", "Karachi", 28, "Laiba", "Bachelors", "Arain", "Dedicated to fitness and living a healthy lifestyle",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.BAKING);
                        add(Hobbies.SKETCHING);
                        add(Hobbies.DIYS);
                    }}, Religion.ISLAM, Gender.FEMALE);

            Profile p15=new Profile("Abbas78", "animallover", "pets@123", "Islamabad", 31, "Abbas", "Masters", "Rana", "Passionate about animals, advocate for animal rights",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.BAKING);
                        add(Hobbies.PHOTOGRAPHY);
                        add(Hobbies.WOOD_CRAFT);
                    }}, Religion.ISLAM, Gender.MALE);

            Profile p16=new Profile("GulAhmed8", "fashionlover", "style@123", "Karachi", 27, "Gul Ahmed", "Masters", "Virk", "Fashion is my passion, love styling and creating new looks",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.GAMING);
                        add(Hobbies.PHOTOGRAPHY);
                        add(Hobbies.WOOD_CRAFT);
                    }}, Religion.ISLAM, Gender.MALE);
            Profile p17=new Profile("RidaBhatti9", "naturelover", "explore@123", "Islamabad", 29, "Rida", "Masters", "Bhatti", "Passionate about nature and wildlife conservation",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.COOKING);
                        add(Hobbies.PHOTOGRAPHY);
                        add(Hobbies.SINGING);
                    }}, Religion.ISLAM, Gender.FEMALE);

            Profile p18=new Profile("Yaqoob8", "techwizard", "tech@128", "Islamabad", 31, "Yaqoob", "Masters", "Muhammadi", "Technology enthusiast, love coding and exploring new tech gadgets",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.PROGRAMMING);
                        add(Hobbies.GAMING);
                        add(Hobbies.PHOTOGRAPHY);
                    }}, Religion.ISLAM, Gender.MALE);

            Profile p19=new Profile("Shenazkhan1", "fitguru", "fitnes@123", " Karachi", 26, "Shenaz", "Bachelors", "Khan", "Dedicated to fitness and well-being, enjoy yoga and outdoor workouts",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.CHESS);
                        add(Hobbies.SEWING);
                        add(Hobbies.COOKING);
                    }}, Religion.ISLAM, Gender.FEMALE);

            Profile p20=new Profile("Dawood1", "animallover", "love@134", "Karachi", 34, "Dawood", "Masters", "Mochi", "Passionate about animal welfare and rescue missions",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.SINGING);
                        add(Hobbies.COOKING);
                        add(Hobbies.PHOTOGRAPHY);
                    }}, Religion.ISLAM,Gender.MALE);
            Profile p21 = new Profile("ZainShah1", "zainshah1@gmail.com", "Zain@1234", "Lahore", 23, "Zain", "Bachelors", "Shah", "Love exploring new technologies and gadgets",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.PROGRAMMING);
                        add(Hobbies.GAMING);
                        add(Hobbies.PHOTOGRAPHY);
                    }}, Religion.ISLAM, Gender.MALE);

            Profile p22 = new Profile("MariaJutt2", "mariajutt2@gmail.com", "Maria@5678", "Karachi", 24, "Maria", "Masters", "Jutt", "Passionate about arts and crafts",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.PAINTING);
                        add(Hobbies.SKETCHING);
                        add(Hobbies.SEWING);
                    }}, Religion.ISLAM, Gender.FEMALE);

            Profile p23 = new Profile("AhmedRaja3", "ahmedraja3@gmail.com", "Ahmed@9101", "Islamabad", 26, "Ahmed", "Bachelors", "Raja", "Sports enthusiast, love playing football",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.SPORTS);
                        add(Hobbies.GAMING);
                        add(Hobbies.BINGE_WATCHING);
                    }}, Religion.ISLAM, Gender.MALE);

            Profile p24 = new Profile("SaraAli4", "saraali4@gmail.com", "Sara@1122", "Lahore", 27, "Sara", "Masters", "Ali", "Avid reader and writer",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.READING);
                        add(Hobbies.WRITING);
                        add(Hobbies.COOKING);
                    }}, Religion.ISLAM, Gender.FEMALE);

            Profile p25 = new Profile("UsmanKhan5", "usmankhan5@gmail.com", "Usman@3344", "Karachi", 25, "Usman", "Bachelors", "Khan", "Fitness freak, love to stay in shape",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.DIYS);
                        add(Hobbies.SPORTS);
                        add(Hobbies.COOKING);
                    }}, Religion.ISLAM, Gender.MALE);

            Profile p26 = new Profile("AminaShafi6", "aminashafi6@gmail.com", "Amina@5566", "Islamabad", 28, "Amina", "Masters", "Shafi", "Baking and trying new recipes",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.BAKING);
                        add(Hobbies.COOKING);
                        add(Hobbies.PHOTOGRAPHY);
                    }}, Religion.ISLAM, Gender.FEMALE);

            Profile p27 = new Profile("HassanIqbal7", "hassaniqbal7@gmail.com", "Hassan@7788", "Lahore", 29, "Hassan", "Bachelors", "Iqbal", "Music lover, play guitar and sing",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.GUITAR);
                        add(Hobbies.SINGING);
                        add(Hobbies.DANCE);
                    }}, Religion.ISLAM, Gender.MALE);

            Profile p28 = new Profile("NidaKhan8", "nidakhan8@gmail.com", "Nida@9900", "Karachi", 30, "Nida", "Masters", "Khan", "Love to travel and explore new places",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.WOOD_CRAFT);
                        add(Hobbies.PHOTOGRAPHY);
                        add(Hobbies.BAKING);
                    }}, Religion.ISLAM, Gender.FEMALE);

            Profile p29 = new Profile("AliButt9", "alibutt9@gmail.com", "Ali@1234", "Islamabad", 22, "Ali", "Bachelors", "Butt", "Chess player, enjoy strategic games",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.CHESS);
                        add(Hobbies.PROGRAMMING);
                        add(Hobbies.GAMING);
                    }}, Religion.ISLAM, Gender.MALE);

            Profile p30 = new Profile("SanaSheikh10", "sanasheikh10@gmail.com", "Sana@5678", "Lahore", 31, "Sana", "Masters", "Sheikh", "Fashion enthusiast, love designing clothes",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.SEWING);
                        add(Hobbies.SHOPPING);
                        add(Hobbies.PHOTOGRAPHY);
                    }}, Religion.ISLAM, Gender.FEMALE);

            Profile p31 = new Profile("BilalJutt11", "bilaljutt11@gmail.com", "Bilal@9101", "Karachi", 21, "Bilal", "Bachelors", "Jutt", "Enjoy playing and watching sports",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.SPORTS);
                        add(Hobbies.PHOTOGRAPHY);
                        add(Hobbies.COOKING);
                    }}, Religion.ISLAM, Gender.MALE);

            Profile p32 = new Profile("AmnaRana12", "amnarana12@gmail.com", "Amna@1122", "Islamabad", 26, "Amna", "Masters", "Rana", "Love DIY projects and home decor",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.DIYS);
                        add(Hobbies.PAINTING);
                        add(Hobbies.PHOTOGRAPHY);
                    }}, Religion.ISLAM, Gender.FEMALE);

            Profile p33 = new Profile("KashifAli13", "kashifali13@gmail.com", "Kashif@3344", "Lahore", 23, "Kashif", "Bachelors", "Ali", "Tech enthusiast, always up for new gadgets",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.PROGRAMMING);
                        add(Hobbies.GAMING);
                        add(Hobbies.PHOTOGRAPHY);
                    }}, Religion.ISLAM, Gender.MALE);

            Profile p34 = new Profile("FatimaShah14", "fatimashah14@gmail.com", "Fatima@5566", "Karachi", 25, "Fatima", "Masters", "Shah", "Cooking and trying new cuisines",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.COOKING);
                        add(Hobbies.BAKING);
                        add(Hobbies.SKETCHING);
                    }}, Religion.ISLAM, Gender.FEMALE);

            Profile p35 = new Profile("ZubairIqbal15", "zubairiqbal15@gmail.com", "Zubair@7788", "Islamabad", 29, "Zubair", "Bachelors", "Iqbal", "Fitness enthusiast, enjoy gym workouts",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.SPORTS);
                        add(Hobbies.DIYS);
                        add(Hobbies.PHOTOGRAPHY);
                    }}, Religion.ISLAM, Gender.MALE);

            Profile p36 = new Profile("ZaraKhan16", "zarakhan16@gmail.com", "Zara@9900", "Lahore", 27, "Zara", "Masters", "Khan", "Love singing and dancing",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.SINGING);
                        add(Hobbies.DANCE);
                        add(Hobbies.PHOTOGRAPHY);
                    }}, Religion.ISLAM, Gender.FEMALE);

            Profile p37 = new Profile("HamzaButt17", "hamzabutt17@gmail.com", "Hamza@1234", "Karachi", 28, "Hamza", "Bachelors", "Butt", "Passionate about cars and racing",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.SPORTS);
                        add(Hobbies.PHOTOGRAPHY);
                        add(Hobbies.GAMING);
                    }}, Religion.ISLAM, Gender.MALE);

            Profile p38 = new Profile("SadiaAli18", "sadiaali18@gmail.com", "Sadia@5678", "Islamabad", 24, "Sadia", "Masters", "Ali", "Photography and capturing moments",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.PHOTOGRAPHY);
                        add(Hobbies.PAINTING);
                        add(Hobbies.SKETCHING);
                    }}, Religion.ISLAM, Gender.FEMALE);

            Profile p39 = new Profile("TariqShafi19", "tariqshafi19@gmail.com", "Tariq@9101", "Lahore", 32, "Tariq", "Bachelors", "Shafi", "Tech enthusiast, love coding",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.PROGRAMMING);
                        add(Hobbies.GAMING);
                        add(Hobbies.BINGE_WATCHING);
                    }}, Religion.ISLAM, Gender.MALE);

            Profile p40 = new Profile("NaziaRaja20", "naziaraja20@gmail.com", "Nazia@1122", "Karachi", 30, "Nazia", "Masters", "Raja", "Cooking and experimenting with recipes",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.COOKING);
                        add(Hobbies.BAKING);
                        add(Hobbies.PHOTOGRAPHY);
                    }}, Religion.ISLAM, Gender.FEMALE);
            Profile p41 = new Profile("FaisalAhmed1", "faisalahmed1@gmail.com", "Faisal@1234", "Lahore", 24, "Faisal", "Bachelors", "Ahmed", "Enjoys hiking and outdoor activities",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.SPORTS);
                        add(Hobbies.PHOTOGRAPHY);
                        add(Hobbies.BAKING);
                    }}, Religion.ISLAM, Gender.MALE);

            Profile p42 = new Profile("AsmaIqbal2", "asmaiqbal2@gmail.com", "Asma@5678", "Karachi", 27, "Asma", "Masters", "Iqbal", "Loves reading novels and writing short stories",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.READING);
                        add(Hobbies.WRITING);
                        add(Hobbies.SKETCHING);
                    }}, Religion.ISLAM, Gender.FEMALE);

            Profile p43 = new Profile("NadeemShah3", "nadeemshah3@gmail.com", "Nadeem@9101", "Islamabad", 29, "Nadeem", "Bachelors", "Shah", "Tech geek, always up for new gadgets",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.PROGRAMMING);
                        add(Hobbies.GAMING);
                        add(Hobbies.PHOTOGRAPHY);
                    }}, Religion.ISLAM, Gender.MALE);

            Profile p44 = new Profile("SairaAli4", "sairaali4@gmail.com", "Saira@1122", "Lahore", 25, "Saira", "Masters", "Ali", "Avid traveler, loves exploring new cultures",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.DIYS);
                        add(Hobbies.PHOTOGRAPHY);
                        add(Hobbies.BAKING);
                    }}, Religion.ISLAM, Gender.FEMALE);

            Profile p45 = new Profile("FarhanKhan5", "farhankhan5@gmail.com", "Farhan@3344", "Karachi", 31, "Farhan", "Bachelors", "Khan", "Fitness enthusiast, enjoys gym workouts",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.SPORTS);
                        add(Hobbies.DIYS);
                        add(Hobbies.PHOTOGRAPHY);
                    }}, Religion.ISLAM, Gender.MALE);

            Profile p46 = new Profile("NidaSheikh6", "nidasheikh6@gmail.com", "Nida@5566", "Islamabad", 28, "Nida", "Masters", "Sheikh", "Love for painting and arts",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.PAINTING);
                        add(Hobbies.SKETCHING);
                        add(Hobbies.SEWING);
                    }}, Religion.ISLAM, Gender.FEMALE);

            Profile p47 = new Profile("RizwanJutt7", "rizwanjutt7@gmail.com", "Rizwan@7788", "Lahore", 26, "Rizwan", "Bachelors", "Jutt", "Music lover, plays guitar and sings",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.GUITAR);
                        add(Hobbies.SINGING);
                        add(Hobbies.DANCE);
                    }}, Religion.ISLAM, Gender.MALE);

            Profile p48 = new Profile("AishaAli8", "aishaali8@gmail.com", "Aisha@9900", "Karachi", 22, "Aisha", "Masters", "Ali", "Photography and capturing moments",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.PHOTOGRAPHY);
                        add(Hobbies.PAINTING);
                        add(Hobbies.SKETCHING);
                    }}, Religion.ISLAM, Gender.FEMALE);

            Profile p49 = new Profile("ZahidButt9", "zahidbutt9@gmail.com", "Zahid@1234", "Islamabad", 33, "Zahid", "Bachelors", "Butt", "Enjoys reading and writing tech blogs",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.READING);
                        add(Hobbies.WRITING);
                        add(Hobbies.PROGRAMMING);
                    }}, Religion.ISLAM, Gender.MALE);

            Profile p50 = new Profile("HinaShafi10", "hinashafi10@gmail.com", "Hina@5678", "Lahore", 24, "Hina", "Masters", "Shafi", "Passionate about baking and cooking",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.BAKING);
                        add(Hobbies.COOKING);
                        add(Hobbies.PHOTOGRAPHY);
                    }}, Religion.ISLAM, Gender.FEMALE);

            Profile p51 = new Profile("ImranIqbal11", "imraniqbal11@gmail.com", "Imran@9101", "Karachi", 26, "Imran", "Bachelors", "Iqbal", "Tech enthusiast, love exploring new technologies",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.PROGRAMMING);
                        add(Hobbies.GAMING);
                        add(Hobbies.PHOTOGRAPHY);
                    }}, Religion.ISLAM, Gender.MALE);

            Profile p52 = new Profile("KiranKhan12", "kirankhan12@gmail.com", "Kiran@1122", "Islamabad", 27, "Kiran", "Masters", "Khan", "Nature lover, enjoys hiking and outdoor activities",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.SPORTS);
                        add(Hobbies.PHOTOGRAPHY);
                        add(Hobbies.BAKING);
                    }}, Religion.ISLAM, Gender.FEMALE);

            Profile p53 = new Profile("YasirRaja13", "yasirraja13@gmail.com", "Yasir@3344", "Lahore", 29, "Yasir", "Bachelors", "Raja", "Love for DIY projects and home decor",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.DIYS);
                        add(Hobbies.PAINTING);
                        add(Hobbies.PHOTOGRAPHY);
                    }}, Religion.ISLAM, Gender.MALE);

            Profile p54 = new Profile("MariamShah14", "mariamshah14@gmail.com", "Mariam@5566", "Karachi", 25, "Mariam", "Masters", "Shah", "Passionate about arts and crafts",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.PAINTING);
                        add(Hobbies.SKETCHING);
                        add(Hobbies.SEWING);
                    }}, Religion.ISLAM, Gender.FEMALE);

            Profile p55 = new Profile("ZainAli15", "zainali15@gmail.com", "Zain@7788", "Islamabad", 31, "Zain", "Bachelors", "Ali", "Enjoys playing and watching sports",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.SPORTS);
                        add(Hobbies.PHOTOGRAPHY);
                        add(Hobbies.GAMING);
                    }}, Religion.ISLAM, Gender.MALE);

            Profile p56 = new Profile("AyeshaButt16", "ayeshabutt16@gmail.com", "Ayesha@9900", "Lahore", 30, "Ayesha", "Masters", "Butt", "Loves reading novels and writing short stories",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.READING);
                        add(Hobbies.WRITING);
                        add(Hobbies.SKETCHING);
                    }}, Religion.ISLAM, Gender.FEMALE);

            Profile p57 = new Profile("SaadShafi17", "saadshafi17@gmail.com", "Saad@1234", "Karachi", 22, "Saad", "Bachelors", "Shafi", "Tech geek, always up for new gadgets",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.PROGRAMMING);
                        add(Hobbies.GAMING);
                        add(Hobbies.PHOTOGRAPHY);
                    }}, Religion.ISLAM, Gender.MALE);

            Profile p58 = new Profile("AnamIqbal18", "anamiqbal18@gmail.com", "Anam@5678", "Islamabad", 26, "Anam", "Masters", "Iqbal", "Avid traveler, loves exploring new cultures",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.DANCE);
                        add(Hobbies.PHOTOGRAPHY);
                        add(Hobbies.BAKING);
                    }}, Religion.ISLAM, Gender.FEMALE);

            Profile p59 = new Profile("UmerKhan19", "umerkhan19@gmail.com", "Umer@9101", "Lahore", 28, "Umer", "Bachelors", "Khan", "Fitness enthusiast, enjoys gym workouts",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.SPORTS);
                        add(Hobbies.DIYS);
                        add(Hobbies.PHOTOGRAPHY);
                    }}, Religion.ISLAM, Gender.MALE);

            Profile p60 = new Profile("FarahSheikh20", "farahsheikh20@gmail.com", "Farah@1122", "Karachi", 24, "Farah", "Masters", "Sheikh", "Love for painting and arts",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.PAINTING);
                        add(Hobbies.SKETCHING);
                        add(Hobbies.SEWING);
                    }}, Religion.ISLAM, Gender.FEMALE);
            Profile p61 = new Profile("AdeelRaza21", "adeelraza21@gmail.com", "Adeel@1234", "Lahore", 27, "Adeel", "Bachelors", "Raza", "Enjoys playing chess and solving puzzles",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.CHESS);
                        add(Hobbies.READING);
                        add(Hobbies.PHOTOGRAPHY);
                    }}, Religion.ISLAM, Gender.MALE);

            Profile p62 = new Profile("ZaraAhmed22", "zaraahmed22@gmail.com", "Zara@5678", "Karachi", 23, "Zara", "Masters", "Ahmed", "Loves baking and trying new recipes",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.BAKING);
                        add(Hobbies.COOKING);
                        add(Hobbies.PHOTOGRAPHY);
                    }}, Religion.ISLAM, Gender.FEMALE);

            Profile p63 = new Profile("BilalKhan23", "bilalkhan23@gmail.com", "Bilal@9101", "Islamabad", 29, "Bilal", "Bachelors", "Khan", "Tech enthusiast, enjoys programming and gaming",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.PROGRAMMING);
                        add(Hobbies.GAMING);
                        add(Hobbies.SPORTS);
                    }}, Religion.ISLAM, Gender.MALE);

            Profile p64 = new Profile("HinaAli24", "hinaali24@gmail.com", "Hina@1122", "Lahore", 25, "Hina", "Masters", "Ali", "Enjoys painting and arts and crafts",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.PAINTING);
                        add(Hobbies.SKETCHING);
                        add(Hobbies.SEWING);
                    }}, Religion.ISLAM, Gender.FEMALE);

            Profile p65 = new Profile("TariqSheikh25", "tariqsheikh25@gmail.com", "Tariq@3344", "Karachi", 30, "Tariq", "Bachelors", "Sheikh", "Loves sports and outdoor activities",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.SPORTS);
                        add(Hobbies.BAKING);
                        add(Hobbies.COOKING);
                    }}, Religion.ISLAM, Gender.MALE);

            Profile p66 = new Profile("SanaIqbal26", "sanaiqbal26@gmail.com", "Sana@5566", "Islamabad", 24, "Sana", "Masters", "Iqbal", "Enjoys reading and writing",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.READING);
                        add(Hobbies.WRITING);
                        add(Hobbies.PHOTOGRAPHY);
                    }}, Religion.ISLAM, Gender.FEMALE);

            Profile p67 = new Profile("AhsanMalik27", "ahsanmalik27@gmail.com", "Ahsan@7788", "Lahore", 32, "Ahsan", "Bachelors", "Malik", "Tech enthusiast, loves coding and new gadgets",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.PROGRAMMING);
                        add(Hobbies.GAMING);
                        add(Hobbies.PHOTOGRAPHY);
                    }}, Religion.ISLAM, Gender.MALE);

            Profile p68 = new Profile("FarihaRaza28", "fariharaza28@gmail.com", "Fariha@9900", "Karachi", 27, "Fariha", "Masters", "Raza", "Enjoys painting and arts and crafts",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.PAINTING);
                        add(Hobbies.SKETCHING);
                        add(Hobbies.SEWING);
                    }}, Religion.ISLAM, Gender.FEMALE);

            Profile p69 = new Profile("UsmanShah29", "usmanshah29@gmail.com", "Usman@1234", "Islamabad", 25, "Usman", "Bachelors", "Shah", "Loves sports and outdoor activities",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.SPORTS);
                        add(Hobbies.BAKING);
                        add(Hobbies.COOKING);
                    }}, Religion.ISLAM, Gender.MALE);

            Profile p70 = new Profile("AyeshaAli30", "ayeshaali30@gmail.com", "Ayesha@5678", "Lahore", 28, "Ayesha", "Masters", "Ali", "Enjoys reading and writing",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.READING);
                        add(Hobbies.WRITING);
                        add(Hobbies.PHOTOGRAPHY);
                    }}, Religion.ISLAM, Gender.FEMALE);

            Profile p71 = new Profile("RehanAhmed31", "rehanahmed31@gmail.com", "Rehan@9101", "Karachi", 26, "Rehan", "Bachelors", "Ahmed", "Tech enthusiast, enjoys programming and gaming",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.PROGRAMMING);
                        add(Hobbies.GAMING);
                        add(Hobbies.SPORTS);
                    }}, Religion.ISLAM, Gender.MALE);

            Profile p72 = new Profile("SaraSheikh32", "sarasheikh32@gmail.com", "Sara@1122", "Islamabad", 24, "Sara", "Masters", "Sheikh", "Enjoys painting and arts and crafts",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.PAINTING);
                        add(Hobbies.SKETCHING);
                        add(Hobbies.SEWING);
                    }}, Religion.ISLAM, Gender.FEMALE);

            Profile p73 = new Profile("NaveedKhan33", "naveedkhan33@gmail.com", "Naveed@3344", "Lahore", 30, "Naveed", "Bachelors", "Khan", "Loves sports and outdoor activities",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.SPORTS);
                        add(Hobbies.BAKING);
                        add(Hobbies.COOKING);
                    }}, Religion.ISLAM, Gender.MALE);

            Profile p74 = new Profile("SaminaRaza34", "saminaraza34@gmail.com", "Samina@5566", "Karachi", 26, "Samina", "Masters", "Raza", "Enjoys reading and writing",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.READING);
                        add(Hobbies.WRITING);
                        add(Hobbies.PHOTOGRAPHY);
                    }}, Religion.ISLAM, Gender.FEMALE);

            Profile p75 = new Profile("AhmedMalik35", "ahmedmalik35@gmail.com", "Ahmed@7788", "Islamabad", 32, "Ahmed", "Bachelors", "Malik", "Tech enthusiast, loves coding and new gadgets",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.PROGRAMMING);
                        add(Hobbies.GAMING);
                        add(Hobbies.PHOTOGRAPHY);
                    }}, Religion.ISLAM, Gender.MALE);

            Profile p76 = new Profile("HinaKhan36", "hinakhan36@gmail.com", "Hina@9900", "Lahore", 24, "Hina", "Masters", "Khan", "Enjoys painting and arts and crafts",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.PAINTING);
                        add(Hobbies.SKETCHING);
                        add(Hobbies.SEWING);
                    }}, Religion.ISLAM, Gender.FEMALE);

            Profile p77 = new Profile("AsadAli37", "asadali37@gmail.com", "Asad@1234", "Karachi", 25, "Asad", "Bachelors", "Ali", "Loves sports and outdoor activities",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.SPORTS);
                        add(Hobbies.BAKING);
                        add(Hobbies.COOKING);
                    }}, Religion.ISLAM, Gender.MALE);

            Profile p78 = new Profile("SabaSheikh38", "sabasheikh38@gmail.com", "Saba@5678", "Islamabad", 27, "Saba", "Masters", "Sheikh", "Enjoys reading and writing",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.READING);
                        add(Hobbies.WRITING);
                        add(Hobbies.PHOTOGRAPHY);
                    }}, Religion.ISLAM, Gender.FEMALE);

            Profile p79 = new Profile("AliAhmed39", "aliahmed39@gmail.com", "Ali@9101", "Lahore", 29, "Ali", "Bachelors", "Ahmed", "Tech enthusiast, enjoys programming and gaming",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.PROGRAMMING);
                        add(Hobbies.GAMING);
                        add(Hobbies.SPORTS);
                    }}, Religion.ISLAM, Gender.MALE);

            Profile p80 = new Profile("KiranMalik40", "kiranmalik40@gmail.com", "Kiran@1122", "Karachi", 26, "Kiran", "Masters", "Malik", "Enjoys painting and arts and crafts",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.PAINTING);
                        add(Hobbies.SKETCHING);
                        add(Hobbies.SEWING);
                    }}, Religion.ISLAM, Gender.FEMALE);
            Profile p81 = new Profile("HassanAkram41", "hassanakram41@gmail.com", "Hassan@1234", "Lahore", 31, "Hassan", "Masters", "Akram", "Loves hiking and outdoor adventures",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.SPORTS);
                        add(Hobbies.READING);
                        add(Hobbies.PHOTOGRAPHY);
                    }}, Religion.ISLAM, Gender.MALE);

            Profile p82 = new Profile("FatimaIqbal42", "fatimaiqbal42@gmail.com", "Fatima@5678", "Karachi", 28, "Fatima", "Bachelors", "Iqbal", "Enjoys cooking and experimenting with new recipes",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.COOKING);
                        add(Hobbies.BAKING);
                        add(Hobbies.PHOTOGRAPHY);
                    }}, Religion.ISLAM, Gender.FEMALE);

            Profile p83 = new Profile("AhmadSiddiqui43", "ahmadsiddiqui43@gmail.com", "Ahmad@9101", "Islamabad", 27, "Ahmad", "Masters", "Siddiqui", "Tech enthusiast, loves coding and gaming",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.PROGRAMMING);
                        add(Hobbies.GAMING);
                        add(Hobbies.SPORTS);
                    }}, Religion.ISLAM, Gender.MALE);

            Profile p84 = new Profile("AishaKhan44", "aishakhan44@gmail.com", "Aisha@1122", "Lahore", 24, "Aisha", "Bachelors", "Khan", "Enjoys painting and arts and crafts",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.PAINTING);
                        add(Hobbies.SKETCHING);
                        add(Hobbies.SEWING);
                    }}, Religion.ISLAM, Gender.FEMALE);

            Profile p85 = new Profile("RehmanAli45", "rehmanali45@gmail.com", "Rehman@3344", "Karachi", 29, "Rehman", "Masters", "Ali", "Loves sports and outdoor activities",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.SPORTS);
                        add(Hobbies.BAKING);
                        add(Hobbies.COOKING);
                    }}, Religion.ISLAM, Gender.MALE);

            Profile p86 = new Profile("MariamShah46", "mariamshah46@gmail.com", "Mariam@5566", "Islamabad", 26, "Mariam", "Bachelors", "Shah", "Enjoys reading and writing",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.READING);
                        add(Hobbies.WRITING);
                        add(Hobbies.PHOTOGRAPHY);
                    }}, Religion.ISLAM, Gender.FEMALE);

            Profile p87 = new Profile("UsmanRaza47", "usmanraza47@gmail.com", "Usman@7788", "Lahore", 32, "Usman", "Masters", "Raza", "Tech enthusiast, loves coding and new gadgets",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.PROGRAMMING);
                        add(Hobbies.GAMING);
                        add(Hobbies.PHOTOGRAPHY);
                    }}, Religion.ISLAM, Gender.MALE);

            Profile p88 = new Profile("FizaAhmed48", "fizaahmed48@gmail.com", "Fiza@9900", "Karachi", 24, "Fiza", "Bachelors", "Ahmed", "Enjoys painting and arts and crafts",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.PAINTING);
                        add(Hobbies.SKETCHING);
                        add(Hobbies.SEWING);
                    }}, Religion.ISLAM, Gender.FEMALE);

            Profile p89 = new Profile("SalmanKhan49", "salmankhan49@gmail.com", "Salman@1234", "Islamabad", 30, "Salman", "Masters", "Khan", "Loves sports and outdoor activities",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.SPORTS);
                        add(Hobbies.BAKING);
                        add(Hobbies.COOKING);
                    }}, Religion.ISLAM, Gender.MALE);

            Profile p90 = new Profile("ZainabAli50", "zainabali50@gmail.com", "Zainab@5678", "Lahore", 25, "Zainab", "Bachelors", "Ali", "Enjoys reading and writing",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.READING);
                        add(Hobbies.WRITING);
                        add(Hobbies.PHOTOGRAPHY);
                    }}, Religion.ISLAM, Gender.FEMALE);

            Profile p91 = new Profile("OmarHassan51", "omarhassan51@gmail.com", "Omar@9101", "Karachi", 28, "Omar", "Masters", "Hassan", "Tech enthusiast, enjoys programming and gaming",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.PROGRAMMING);
                        add(Hobbies.GAMING);
                        add(Hobbies.SPORTS);
                    }}, Religion.ISLAM, Gender.MALE);

            Profile p92 = new Profile("SadiaKhan52", "sadiakhan52@gmail.com", "Sadia@1122", "Islamabad", 27, "Sadia", "Bachelors", "Khan", "Enjoys painting and arts and crafts",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.PAINTING);
                        add(Hobbies.SKETCHING);
                        add(Hobbies.SEWING);
                    }}, Religion.ISLAM, Gender.FEMALE);

            Profile p93 = new Profile("FarhanAli53", "farhanali53@gmail.com", "Farhan@3344", "Lahore", 29, "Farhan", "Masters", "Ali", "Loves sports and outdoor activities",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.SPORTS);
                        add(Hobbies.BAKING);
                        add(Hobbies.COOKING);
                    }}, Religion.ISLAM, Gender.MALE);

            Profile p94 = new Profile("AminaShah54", "aminashah54@gmail.com", "Amina@5566", "Karachi", 26, "Amina", "Bachelors", "Shah", "Enjoys reading and writing",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.READING);
                        add(Hobbies.WRITING);
                        add(Hobbies.PHOTOGRAPHY);
                    }}, Religion.ISLAM, Gender.FEMALE);

            Profile p95 = new Profile("YasirRaza55", "yasirraza55@gmail.com", "Yasir@7788", "Islamabad", 32, "Yasir", "Masters", "Raza", "Tech enthusiast, loves coding and new gadgets",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.PROGRAMMING);
                        add(Hobbies.GAMING);
                        add(Hobbies.PHOTOGRAPHY);
                    }}, Religion.ISLAM, Gender.MALE);

            Profile p96 = new Profile("NidaAhmed56", "nidaahmed56@gmail.com", "Nida@9900", "Lahore", 24, "Nida", "Bachelors", "Ahmed", "Enjoys painting and arts and crafts",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.PAINTING);
                        add(Hobbies.SKETCHING);
                        add(Hobbies.SEWING);
                    }}, Religion.ISLAM, Gender.FEMALE);

            Profile p97 = new Profile("FaisalKhan57", "faisalkhan57@gmail.com", "Faisal@1234", "Karachi", 31, "Faisal", "Masters", "Khan", "Loves sports and outdoor activities",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.SPORTS);
                        add(Hobbies.BAKING);
                        add(Hobbies.COOKING);
                    }}, Religion.ISLAM, Gender.MALE);

            Profile p98 = new Profile("HiraAli58", "hiraali58@gmail.com", "Hira@5678", "Islamabad", 28, "Hira", "Bachelors", "Ali", "Enjoys reading and writing",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.READING);
                        add(Hobbies.WRITING);
                        add(Hobbies.PHOTOGRAPHY);
                    }}, Religion.ISLAM, Gender.FEMALE);

            Profile p99 = new Profile("ZubairHassan59", "zubairhassan59@gmail.com", "Zubair@9101", "Lahore", 27, "Zubair", "Masters", "Hassan", "Tech enthusiast, enjoys programming and gaming",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.PROGRAMMING);
                        add(Hobbies.GAMING);
                        add(Hobbies.SPORTS);
                    }}, Religion.ISLAM, Gender.MALE);

            Profile p100 = new Profile("RabiaShah60", "rabiashah60@gmail.com", "Rabia@1122", "Karachi", 24, "Rabia", "Bachelors", "Shah", "Enjoys painting and arts and crafts",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.PAINTING);
                        add(Hobbies.SKETCHING);
                        add(Hobbies.SEWING);
                    }}, Religion.ISLAM, Gender.FEMALE);
            Profile p101 = new Profile("Tishnagi", "areebsssss@gmail.com", "hassaankihunjaan1@", "Daska", 20, "Areeba", "Bachelors", "Jutt", "Enjoys irritating hassaan for no reason",
                    new ArrayList<Hobbies>() {{
                        add(Hobbies.PROGRAMMING);
                        add(Hobbies.SHOPPING);
                        add(Hobbies.BINGE_WATCHING);
                    }}, Religion.ISLAM, Gender.FEMALE);
            profiles.add(p2);
            profiles.add(p101);

            profiles.add(p81);
            profiles.add(p82);
            profiles.add(p83);
            profiles.add(p84);
            profiles.add(p85);
            profiles.add(p86);
            profiles.add(p87);
            profiles.add(p88);
            profiles.add(p89);
            profiles.add(p90);
            profiles.add(p91);
            profiles.add(p92);
            profiles.add(p93);
            profiles.add(p94);
            profiles.add(p95);
            profiles.add(p96);
            profiles.add(p97);
            profiles.add(p98);
            profiles.add(p99);
            profiles.add(p100);
            profiles.add(p61);
            profiles.add(p62);
            profiles.add(p63);
            profiles.add(p64);
            profiles.add(p65);
            profiles.add(p66);
            profiles.add(p67);
            profiles.add(p68);
            profiles.add(p69);
            profiles.add(p70);
            profiles.add(p71);
            profiles.add(p72);
            profiles.add(p73);
            profiles.add(p74);
            profiles.add(p75);
            profiles.add(p76);
            profiles.add(p77);
            profiles.add(p78);
            profiles.add(p79);
            profiles.add(p80);


            profiles.add(p41);
            profiles.add(p42);
            profiles.add(p43);
            profiles.add(p44);
            profiles.add(p45);
            profiles.add(p46);
            profiles.add(p47);
            profiles.add(p48);
            profiles.add(p49);
            profiles.add(p50);
            profiles.add(p51);
            profiles.add(p52);
            profiles.add(p53);
            profiles.add(p54);
            profiles.add(p55);
            profiles.add(p56);
            profiles.add(p57);
            profiles.add(p58);
            profiles.add(p59);
            profiles.add(p60);
            profiles.add(p21);
            profiles.add(p22);
            profiles.add(p23);
            profiles.add(p24);
            profiles.add(p25);
            profiles.add(p26);
            profiles.add(p27);
            profiles.add(p28);
            profiles.add(p29);
            profiles.add(p30);
            profiles.add(p1);

            profiles.add(p3);
            profiles.add(p4);
            profiles.add(p5);
            profiles.add(p6);
            profiles.add(p7);
            profiles.add(p8);
            profiles.add(p9);
            profiles.add(p10);
            profiles.add(p11);
            profiles.add(p12);
            profiles.add(p13);
            profiles.add(p14);
            profiles.add(p15);
            profiles.add(p16);
            profiles.add(p17);
            profiles.add(p18);
            profiles.add(p19);
            profiles.add(p20);
            return profiles;
        }
    }
