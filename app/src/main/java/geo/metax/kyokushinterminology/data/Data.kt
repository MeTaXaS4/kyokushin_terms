package geo.metax.kyokushinterminology.data


val kihonWaza = listOf(
    Word(WordType.KIHON,"Tsuki", "Punch"),
    Word(WordType.KIHON,"Uchi", "Strike"),
    Word(WordType.KIHON,"Uke", "Block"),
    Word(WordType.KIHON,"Geri", "Kick")
)
val buki = listOf(
    Word(WordType.BUKI,"Ashi", "Foot or Leg"),
    Word(WordType.BUKI,"Chusoku", "Ball (middle) of the foot"),
    Word(WordType.BUKI,"Haisho", "Backhand"),
    Word(WordType.BUKI,"Haisoku", "Instep of the Foot"),
    Word(WordType.BUKI,"Haito", "Inner Knife Hand"),
    Word(WordType.BUKI,"Hiji", "Elbow"),
    Word(WordType.BUKI,"Hiraken", "Flat Fist"),
    Word(WordType.BUKI,"Hiza", "Knee"),
    Word(WordType.BUKI,"Kakato", "Heel"),
    Word(WordType.BUKI,"Keiko", "Chicke Beak"),
    Word(WordType.BUKI,"Koken", "Wrist Top"),
    Word(WordType.BUKI,"Kote", "Forearm"),
    Word(WordType.BUKI,"Nakayubi Ippon Ken", "Middle Finger Knuckle Fist"),
    Word(WordType.BUKI,"Nukite", "Spear Hand"),
    Word(WordType.BUKI,"Oyayubi Ippon Ken", "Thumb Knuckle Fist"),
    Word(WordType.BUKI,"Ryutoken", "Dragon’s Head Fist"),
    Word(WordType.BUKI,"Seiken", "ForeFist (correct fist)"),
    Word(WordType.BUKI,"Shotei", "Palm Heel"),
    Word(WordType.BUKI,"Shuto", "Knife Hand"),
    Word(WordType.BUKI,"Sokuto", "Outside Edge of the Foot"),
    Word(WordType.BUKI,"Tune", "Shin"),
    Word(WordType.BUKI,"Te", "Hand"),
    Word(WordType.BUKI,"Teisoku", "Arch of the Foot"),
    Word(WordType.BUKI,"Tetsui", "Hammer Fist"),
    Word(WordType.BUKI,"Toho", "Sword Peak Hand"),
    Word(WordType.BUKI,"Uraken", "BackFist")
)
val targets = listOf(
    Word(WordType.TARGETS,"Age", "Rising"),
    Word(WordType.TARGETS,"Ago", "Chin or Jaw"),
    Word(WordType.TARGETS,"Atama", "Head"),
    Word(WordType.TARGETS,"Chudan", "Middle Level"),
    Word(WordType.TARGETS,"Ganmen", "Face"),
    Word(WordType.TARGETS,"Gedan", "Lower Level"),
    Word(WordType.TARGETS,"Hidari", "Left"),
    Word(WordType.TARGETS,"Hizo", "Spleen"),
    Word(WordType.TARGETS,"Jodan", "Upper Level"),
    Word(WordType.TARGETS,"Kake", "Hooked"),
    Word(WordType.TARGETS,"Kansetsu", "Joint (or limb)"),
    Word(WordType.TARGETS,"Kintama (Kin)", "Groin, Testicles (gold jewels)"),
    Word(WordType.TARGETS,"Komekami", "Temple"),
    Word(WordType.TARGETS,"Kubi", "Neck"),
    Word(WordType.TARGETS,"Mae", "Front, Forward"),
    Word(WordType.TARGETS,"Mawashi", "Round, Circular"),
    Word(WordType.TARGETS,"Me", "Eyes"),
    Word(WordType.TARGETS,"Migi", "Right"),
    Word(WordType.TARGETS,"Nodo", "Throat"),
    Word(WordType.TARGETS,"Oroshi", "Descending"),
    Word(WordType.TARGETS,"Sakotsu", "Collarbone"),
    Word(WordType.TARGETS,"Sayu", "Left and Right"),
    Word(WordType.TARGETS,"Soto", "Outside"),
    Word(WordType.TARGETS,"Tobi", "Jumping"),
    Word(WordType.TARGETS,"Uchi", "Inside"),
    Word(WordType.TARGETS,"Ura", "Reverse, Backwards")
)
val kazu = listOf(
    Word(WordType.KAZU,"Ichi", "One"),
    Word(WordType.KAZU,"Ni", "Two"),
    Word(WordType.KAZU,"San", "Three"),
    Word(WordType.KAZU,"Shi, Yon", "Four"),
    Word(WordType.KAZU,"Go", "Five"),
    Word(WordType.KAZU,"Roku", "Six"),
    Word(WordType.KAZU,"Shichi, Nana", "Seven"),
    Word(WordType.KAZU,"Hachi", "Eight"),
    Word(WordType.KAZU,"Ku", "Nine"),
    Word(WordType.KAZU,"Ju", "Ten"),
    Word(WordType.KAZU,"San Ju", "Thirty"),
    Word(WordType.KAZU,"Hyaku", "Hundred")
)
val tsukiWaza = listOf(
    Word(WordType.TSUKI,"Seiken Oi Tsuki", "Forefist Lunge Punch"),
    Word(WordType.TSUKI,"Seiken Morote Tsuki", "Forefist Two-Handed Punch"),
    Word(WordType.TSUKI,"Seiken Gyaku Tsuki", "Forefist Reverse Punch"),
    Word(WordType.TSUKI,"Seiken Tate Tsuki", "Forefist Vertical Punch"),
    Word(WordType.TSUKI,
        "Seiken Jun Tsuki",
        "Forefist Side (corresponding) Punch"
    ),
    Word(WordType.TSUKI,"Seiken Shita Tsuki", "Forefist Lower Punch")
)
val geriWaza = listOf(
    Word(WordType.GERI,"Hiza Ganmen Geri", "Knee Face Kick"),
    Word(WordType.GERI,"Kin Geri", "Groin Kick"),
    Word(WordType.GERI,"Mae Geri", "Front Kick"),
    Word(WordType.GERI,"Mae KeAge", "Front Rising Kick"),
    Word(WordType.GERI,"Soto Mawashi Geri", "Outside Round Kick"),
    Word(WordType.GERI,"Uchi Mawashi Geri", "Inside Round Kick"),
    Word(WordType.GERI,"Yoko KeAge", "Side Rising Kick"),
    Word(WordType.GERI,"Mawashi Geri", "Round Kick"),
    Word(WordType.GERI,"Kansetsu Geri", "Joint Kick"),
    Word(WordType.GERI,"Yoko Geri", "Side Kick"),
    Word(WordType.GERI,"Ushiro Geri", "Back Kick"),
    Word(WordType.GERI,"Mae Kakato Geri", "Front Hell Kick"),
    Word(WordType.GERI,"Ago Geri", "Chin/Jaw Kick"),
    Word(WordType.GERI,"Tobi Mae Geri", "Jumping Front Kick")
)
val dachi = listOf(
    Word(WordType.DACHI,"Yoi Dachi", "Ready Stance"),
    Word(WordType.DACHI,"Fudo Dachi (Shizen Tai)", "Immobile Stance"),
    Word(WordType.DACHI,"Zenkutsu Dachi", "Forward Leaning Stance"),
    Word(WordType.DACHI,"Uchi Hachiji Dachi", "Inside Character “8” Stance"),
    Word(WordType.DACHI,"Sanchin Dachi", "Three Point Stance"),
    Word(WordType.DACHI,"Kokutsu Dachi", "Back Leaning Stance"),
    Word(WordType.DACHI,"Musubi Dachi", "Open Foot (connected) Stance"),
    Word(WordType.DACHI,"Kiba Dachi", "Horseback Stance"),
    Word(WordType.DACHI,"Neko Ashi Dachi", "Cat Stance"),
    Word(WordType.DACHI,"Tsuru Ashi Dachi", "Crane Stance"),
    Word(WordType.DACHI,
        "Moro Ashi Dachi",
        "One Foot Forward (two-foot) stance"
    ),
    Word(WordType.DACHI,"Heisoku Dachi", "Closed Foot Stance"),
    Word(WordType.DACHI,"Heiko Dachi", "Parallel Stance"),
    Word(WordType.DACHI,"Kake Dachi", "Hooked Stance"),
    Word(WordType.DACHI,"Soto Hachiji Dachi", "Outside Character “8” Stance"),
    Word(WordType.DACHI,"Shiko Dachi", "Sumo Stance"),
    Word(WordType.DACHI,"Kumite Dachi", "Fighting Stance"),
    Word(WordType.DACHI,"Han Mi", "Half Body Stance"),
    Word(WordType.DACHI,"Migi Ashi Mae", "Right Foot Forward"),
    Word(WordType.DACHI,"Hidari Ashi Mae", "Left Foot Forward")
)
val uchiWaza = listOf(
    Word(WordType.UCHI,"Seiken Ago Uchi", "Forefist Chin / Jaw Strike"),
    Word(WordType.UCHI,"Seiken Furi Uchi", "Forefist Hook Strike"),
    Word(WordType.UCHI,
        "Tetsui Oroshi Ganmen Uchi",
        "Hammer Fist Descending Face Strike"
    ),
    Word(WordType.UCHI,"TetsuiKomeKami Uchi", "Hammer Fist Temple Strike"),
    Word(WordType.UCHI,"Tetsui Hizo Uchi", "Hammer Fist Spleen Strike"),
    Word(WordType.UCHI,
        "Tetsui Mae Yoko Uchi",
        "Hammer Fist Forward Side Strike"
    ),
    Word(WordType.UCHI,"Tetsui Yoko Uchi", "Hammer Fist Side Strike"),
    Word(WordType.UCHI,"Uraken Ganmen Uchi", "BackFist Face Strike"),
    Word(WordType.UCHI,"Uraken Sayu Uchi", "BackFist Left and Right Strike"),
    Word(WordType.UCHI,"Uraken Hizo Uchi", "BackFist Spleen Strike"),
    Word(WordType.UCHI,
        "Uraken Oroshi Ganmen Uchi",
        "BackFist Descending Face Strike"
    ),
    Word(WordType.UCHI,"Uraken Mawashi Uchi", "BackFist Round Strike"),
    Word(WordType.UCHI,"Nihon Nukite", "Four-Fingered Spear Hand"),
    Word(WordType.UCHI,"Shotei Uchi", "Palm Heel Strike"),
    Word(WordType.UCHI,"Shuto Sakotsu Uchi", "Knife Hand Collarbone Strike"),
    Word(WordType.UCHI,
        "Shuto Yoko Ganmen Uchi",
        "Knife Hand Side Face Strike"
    ),
    Word(WordType.UCHI,
        "Shuto Sakotsu Uchi Komi",
        "Knife Hand Collarbone Driving Strike"
    ),
    Word(WordType.UCHI,"Shuto Hizo Uchi", "Knife Hand Spleen Strike"),
    Word(WordType.UCHI,"Shuto Uchi Uchi", "Knife Hand Inside Strike"),
    Word(WordType.UCHI,"Hiji Ate", "Elbow Strike"),
    Word(WordType.UCHI,"Mae Hiji Ate", "Forward Elbow Strike"),
    Word(WordType.UCHI,"Age Hiji Ate", "Rising Elbow Strike")
)
val ukeWaza = listOf(
    Word(WordType.UKE,"Jodan Uke", "Upper Block"),
    Word(WordType.UKE,"Gedan Barai", "Lower Parry"),
    Word(WordType.UKE,"Chudan Uchi Uke", "Middle Area Inside Block"),
    Word(WordType.UKE,"Chudan Soto Uke", "Middle Area Outside Block"),
    Word(WordType.UKE,
        "Morote Chudan Uchi Uke",
        "Two-Handed Middle Area Inside Block"
    ),
    Word(WordType.UKE,"SHuto Uke", "Knife Hand Block"),
    Word(WordType.UKE,"Juji Uke", "Crossed Block"),
    Word(WordType.UKE,"Kake Uke", "Hooked Block"),
    Word(WordType.UKE,"Shotei Uke", "Palm Heel Block"),
    Word(WordType.UKE,"Mawashi Uke", "Round Block")
)
val kihonJutsugo = listOf(
    Word(WordType.KIHONJUTUGO,"Ariggato Gozaimasu", "Thank You (polite)"),
    Word(WordType.KIHONJUTUGO,"Budo", "Martial Way"),
    Word(WordType.KIHONJUTUGO,"Bunkai", "Application (analysis)"),
    Word(WordType.KIHONJUTUGO,"Dan", "Grade (Black Belt)"),
    Word(WordType.KIHONJUTUGO,"Do", "Way"),
    Word(WordType.KIHONJUTUGO,"Dojo", "Training Hall (Way, Place)"),
    Word(WordType.KIHONJUTUGO,"Dojo Kun", "Training Hall Oath"),
    Word(WordType.KIHONJUTUGO,"Kun", "Oath"),
    Word(WordType.KIHONJUTUGO,"DoGi (Gi)", "Karate Uniform (Way clothes)"),
    Word(WordType.KIHONJUTUGO,"Hajime", "Begin"),
    Word(WordType.KIHONJUTUGO,"Hanshi", "Honorable Master"),
    Word(WordType.KIHONJUTUGO,"Ibuki", "Forced Tension Breathing"),
    Word(WordType.KIHONJUTUGO,"Kumite", "Full-Contact Fighting"),
    Word(WordType.KIHONJUTUGO,"Kamaete", "Take Ready Position"),
    Word(WordType.KIHONJUTUGO,"Karate", "Empty Hand"),
    Word(WordType.KIHONJUTUGO,"Kata", "Form"),
    Word(WordType.KIHONJUTUGO,"Ki", "Inner Energy"),
    Word(WordType.KIHONJUTUGO,"Kiai", "Explosive Scream"),
    Word(WordType.KIHONJUTUGO,"Kihon", "Basics"),
    Word(WordType.KIHONJUTUGO,"Kime", "Focus"),
    Word(WordType.KIHONJUTUGO,"Kohai", "Junior Student"),
    Word(WordType.KIHONJUTUGO,"Kyokushin", "Ultimate Truth"),
    Word(WordType.KIHONJUTUGO,"Kyu", "Rank (Below Black Belt)"),
    Word(WordType.KIHONJUTUGO,"Maai", "Interval (between opponents)"),
    Word(WordType.KIHONJUTUGO,"Makiwara", "Striking Post (straw wrapped)"),
    Word(WordType.KIHONJUTUGO,"Mawatte", "Turn"),
    Word(WordType.KIHONJUTUGO,"Mokuso", "Meditation (silent thought)"),
    Word(WordType.KIHONJUTUGO,"Naore", "Retu to Starting Position"),
    Word(WordType.KIHONJUTUGO,"Nogare", "Calm Controlled Breathing"),
    Word(WordType.KIHONJUTUGO,"Obi", "Belt (sash)"),
    Word(WordType.KIHONJUTUGO,"Okuriashi", "Shuffle Step (sending foot)"),
    Word(WordType.KIHONJUTUGO,"Onegaishimasu", "Please (polite)"),
    Word(WordType.KIHONJUTUGO,"Osu", "Patience and Determination"),
    Word(WordType.KIHONJUTUGO,"Otagai", "Each Other"),
    Word(WordType.KIHONJUTUGO,"Rei (… ni Rei)", "Bow (Bow to …)"),
    Word(WordType.KIHONJUTUGO,"Renraku", "Combinations"),
    Word(WordType.KIHONJUTUGO,"Sheishin", "Spirit"),
    Word(WordType.KIHONJUTUGO,"Seiza", "Formal Kneeling (correct sitting)"),
    Word(WordType.KIHONJUTUGO,"Sempai", "Senior(1st & 2nd Dan)"),
    Word(WordType.KIHONJUTUGO,"Sensei", "Teacher (born before) (3rd & 4th Dan)"),
    Word(WordType.KIHONJUTUGO,"Shomen", "Front (correct face) of the Dojo"),
    Word(WordType.KIHONJUTUGO,"Shihan", "Expert (5th, 6th & 7th Dan)"),
    Word(WordType.KIHONJUTUGO,"Sosai", "President"),
    Word(WordType.KIHONJUTUGO,"Tameshiwari", "Breaking Test"),
    Word(WordType.KIHONJUTUGO,"Waza", "Technique(s)"),
    Word(WordType.KIHONJUTUGO,"Yame", "Stop"),
    Word(WordType.KIHONJUTUGO,"Yasume", "Rest, at Ease"),
    Word(WordType.KIHONJUTUGO,"Yoi", "Ready")
)
val taikaiJutsugo = listOf(
    Word(WordType.TAIKAIJUTSUGO,"Aka", "Red"),
    Word(WordType.TAIKAIJUTSUGO,"Awasete Ippon", "Adds Up to One Point"),
    Word(WordType.TAIKAIJUTSUGO,"Chui", "Warning"),
    Word(WordType.TAIKAIJUTSUGO,"Encho", "Overtime Round (extension)"),
    Word(WordType.TAIKAIJUTSUGO,"Fukushin", "Corner Judge (assistant referee)"),
    Word(WordType.TAIKAIJUTSUGO,"Fukushin Shugo", "Referees’ Conference"),
    Word(WordType.TAIKAIJUTSUGO,"Genten", "Penalty"),
    Word(WordType.TAIKAIJUTSUGO,"Hantei", "Decision"),
    Word(WordType.TAIKAIJUTSUGO,"Hkiwake", "Draw, Tie"),
    Word(WordType.TAIKAIJUTSUGO,"Ippon", "One Point"),
    Word(WordType.TAIKAIJUTSUGO,"Kachi", "Win"),
    Word(WordType.TAIKAIJUTSUGO,"Senshuken Taikai", "Championship Tournament"),
    Word(WordType.TAIKAIJUTSUGO,"Shikaku", "Disqualification"),
    Word(WordType.TAIKAIJUTSUGO,"Shiro", "White"),
    Word(WordType.TAIKAIJUTSUGO,"Shushin", "Referee"),
    Word(WordType.TAIKAIJUTSUGO,"Waza Ari", "Half Point (has a technique)"),
    Word(WordType.TAIKAIJUTSUGO,"Zokko", "Resume Fighting")
)

val allData = mutableListOf(
    kihonWaza,
    buki,
    targets,
    kazu,
    tsukiWaza,
    geriWaza,
    dachi,
    uchiWaza,
    ukeWaza,
    kihonJutsugo,
    taikaiJutsugo
).flatten()