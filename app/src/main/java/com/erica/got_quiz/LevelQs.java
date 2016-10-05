package com.erica.got_quiz;

/**
 * Created by schif_000 on 5/10/2016.
 */
public class LevelQs {

    public static void addQuestions(DbHelper dbHelper) {

        // level 1
        Question q1 = new Question("How many dragons does Daenery’s have?", "0", "4", "2","3", "3");
        dbHelper.addQuestion(q1);

        Question q2 = new Question("What is the sigil of House Lannister?","Rose","Lion","Stag","Mockingbird", "Lion");
        dbHelper.addQuestion(q2);
        Question q3 = new Question("Who is the youngest Stark child?","Bran","Arya","Rickon","Tommen","Rickon");
        dbHelper.addQuestion(q3);
        Question q4 = new Question("Who was the lover of Renly Baratheon?","Loras Tyrell","Margaery Tyrell","Brienne of Tarth","Tommen", "Loras Tyrell");
        dbHelper.addQuestion(q4);

        Question q5 = new Question("Who is the most trusted advisor of the King?","The Master of Coin","The Hand of the King","Chief Advisor","Tommen", "The Hand of the King");
        dbHelper.addQuestion(q5);
        Question q6 = new Question("Where is Winterfell?","The Crownlands","North of the Wall","The North","The West", "The North");
        dbHelper.addQuestion(q6);
        Question q7 = new Question("How many kingdoms are there in Westeros?","6","7","8","4", "7");
        dbHelper.addQuestion(q7);

        Question q8 = new Question("Who are the Wardens of the West?","The Lannisters","The Starks","The Freys", "The Tyrells", "The Lannisters");
        dbHelper.addQuestion(q8);
        Question q9 = new Question("Where is Brienne from?","The Reach","Qarth","Storm's End","Tarth","Tarth");
        dbHelper.addQuestion(q9);
        Question q10 = new Question("Jamie is Cersei’s...","Husband","Twin Brother","Father","Cousin","Twin Brother");
        dbHelper.addQuestion(q10);

        Question q11 = new Question("What does Ramsey Bolton take away from Theon?","His manhood","His title","His money","his lunch", "His manhood");
        dbHelper.addQuestion(q11);
        Question q12 = new Question("Who sentences Ned Stark to death?","Robert Baratheon","Tywin Lannister","John Arryn","Joffrey Baratheon","Joffrey Baratheon");
        dbHelper.addQuestion(q12);
        Question q13 = new Question("What is the capital of Westeros?","Highgarden","King's Landing","Casterly Rock","Storm's End", "King's Landing");
        dbHelper.addQuestion(q13);

        Question q14 = new Question("Who helps Arya and her friends escape from Harrenhal?","Jaqen H'ghar","Gendry","Tywin Lannister","Roose Bolton", "Jaqen H'ghar");
        dbHelper.addQuestion(q14);
        Question q15 = new Question("What god(s) do the Northerners follow?","The Seven","The Drowned God","The Old Gods","The Great Other", "The Old Gods");
        dbHelper.addQuestion(q15);
        Question q16 = new Question("What were the last word of the Mad King?","Burn them all","End it quick","Traitor","I will burn you", "Burn them all");
        dbHelper.addQuestion(q16);

        Question q17 = new Question("What is Jamie Lannister commonly known as?","The Kinslayer","The Kingslayer","The Half-man","The Hand of the King", "The Kingslayer");
        dbHelper.addQuestion(q17);
        Question q18 = new Question("Where is the Iron Throne situated?","The Sept of Baelor","Flea Bottom","The Dragon Pit","The Red Keep", "The Red Keep");
        dbHelper.addQuestion(q18);
        Question q19 = new Question("What the name of Ned Stark’s wife?","Lysa","Cersei","Catelyn","Sansa", "Catelyn");
        dbHelper.addQuestion(q19);

        // level 2

        Question q20 = new Question("Who killed Ned Stark’s father?","The Wildlings","The Mad King","Roose Bolton","Jamie Lannister", "The Mad King");
        dbHelper.addQuestion(q20);

        Question q21 = new Question("Who pushes Bran from the tower at Winterfell?","Jamie Lannister","Cersei Lannister","Maester Luwin","Sansa Stark", "Jamie Lannister");
        dbHelper.addQuestion(q21);
        Question q22 = new Question("What is the name of Ned’s brother who was chief ranger of the Night’s Watch?", "Rickard Stark", "Robb Stark", "Benjin Stark","Brandon Stark", "Benjin Stark");
        dbHelper.addQuestion(q22);
        Question q23 = new Question("How do you stop the corpses resurrected by the White Walkers?", "Cut off their heads", "Fire", "You can’t", "Drown them", "Fire");
        dbHelper.addQuestion(q23);

        Question q24 = new Question("What is the religious centre of King’s Landing?", "The God’s Eye", "The Sept of the Seven", "The Temple of the Seven","The Sept of Baelor", "The Sept of Baelor");
        dbHelper.addQuestion(q24);
        Question q25 = new Question("Why is Harrenhal in ruins?", "It was burnt my dragon fire", "Its age", "War","It was never finished", "It was burnt my dragon fire");
        dbHelper.addQuestion(q25);
        Question q26 = new Question("Where is Craster’s Keep?", "North of the wall", "The Gift", "The Lands of Always Winter","The North", "North of the wall");
        dbHelper.addQuestion(q26);

        Question q27 = new Question("What god(s) do the Faceless Men follow?", "The Drowned God", "The Red God", "The Many Faced God","The Faceless God", "The Many Faced God");
        dbHelper.addQuestion(q27);
        Question q28 = new Question("Where is the House of Black and White?", "Pentos", "Braavos", "Lys","Volantis", "Braavos");
        dbHelper.addQuestion(q28);
        Question q29 = new Question("What is the name of Catelyn’s sister?", "Loretta", "Lisa", "Lizzie","Lysa ", "Lysa ");
        dbHelper.addQuestion(q29);

        Question q30 = new Question("Which Targaryen ancestor conquered Westeros?", "Maegor the Cruel", "Aegon the Conqueror", "Daenys the Dreamer","Aemon Blackfyre", "Aegon the Conqueror");
        dbHelper.addQuestion(q30);
        Question q31 = new Question("What is the name of Tyrion’s squire in King’s Landing?", "Lancel Lannister", "Stannis Baratheon", "Podrick Payne","Bronn of the Blackwater", "Podrick Payne");
        dbHelper.addQuestion(q31);
        Question q32 = new Question("Which name is Tyrion not referred to as?", "The Small One", "Half-man", "The Imp","A Demon Monkey", "The Small One");
        dbHelper.addQuestion(q32);

        Question q33 = new Question("Who removes Ned Stark’s head?", "Joffrey Baratheon", "Ilyn Payne", "Jamie Lannister","The Hound", "Ilyn Payne");
        dbHelper.addQuestion(q33);
        Question q34 = new Question("What is the sigil of House Mormont?", "Sparrow", "Crocodile", "Bear","Fish", "Bear");
        dbHelper.addQuestion(q34);
        Question q35 = new Question("Who removes Jamie’s hand?", "Brienne", "Locke", "Robb Stark","The Hound", "Locke");
        dbHelper.addQuestion(q35);

        Question q36 = new Question("What animal is Brienne forced to fight at Harrenhal?", "Bear", "Lion", "Wolf","Dragon", "Bear");
        dbHelper.addQuestion(q36);
        Question q37 = new Question("Who is Arya’s Dancing Master?", "The Hound", "Jaqen H’ghar", "Syrio Forel","Ser Rodrick", "Syrio Forel");
        dbHelper.addQuestion(q37);
        Question q38 = new Question("What is the name of Jon’s Wildling lover?", "Bridget", "Ingrid", "Ygritte","Yara", "Ygritte");
        dbHelper.addQuestion(q38);

        // level 3

        Question q39 = new Question("What is the ancestral seat of House Arryn?", "Casterly Rock", "Highgarden", "The Dredfort","the Eyrie", "the Eyrie");
        dbHelper.addQuestion(q39);

        Question q40 = new Question("What lost civilization do the Targaryens come from", "Valeryia", "Volantis", "Ghis","Asshai", "Valeryia");
        dbHelper.addQuestion(q40);
        Question q41 = new Question("Who serves as Hand of the King after Tywin Lannister?", "Tyrion Lannister", "Kevan Lannister", "Mace Tyrell", "Lord Varys", "Kevan Lannister");
        dbHelper.addQuestion(q41);
        Question q42 = new Question("Where is Samwell Tarley from?", "The Reach", "The West", "The Vale","The Crownlands", "The Reach");
        dbHelper.addQuestion(q42);

        Question q43 = new Question("Where was Daenerys born?", "King’s Landing", "Pentos", "Valyria","Dragonstone", "Dragonstone");
        dbHelper.addQuestion(q43);
        Question q44 = new Question("What does Drogo give Daenerys as a wedding gift?", "Dragon eggs", "Slaves", "Horse","Gold", "Horse");
        dbHelper.addQuestion(q44);
        Question q45 = new Question("Who is Jon Snow’s mother?", "Wylla", "Lyanna Stark", "Catelyn Stark","Ygritte", "Lyanna Stark");
        dbHelper.addQuestion(q45);

        Question q46 = new Question("Who is the  long-standing maester in service to Winterfell?", "Maester Luwin", "Maester Garwin", "Maester Pycelle","Maester Qyburn", "Maester Luwin");
        dbHelper.addQuestion(q46);
        Question q47 = new Question("Who does Jon kills to prove loyalty to The King Beyond the Wall?", "Jeor Mormont", "Alliser Thorne", "Qhorin Halfhand","Benjin Stark", "Qhorin Halfhand");
        dbHelper.addQuestion(q47);
        Question q48 = new Question("What are the Targaryen words?", "Ours is the Fury", "Fire & Blood", "Death by Fire","Fire & Power", "Fire & Blood");
        dbHelper.addQuestion(q48);

        Question q49 = new Question("Where does the warlock take Daenerys’s dragons?", "The House of the Undying", "Warlock Castle", "Vaes Dothrak","The House of Mysteries", "The House of the Undying");
        dbHelper.addQuestion(q49);
        Question q50 = new Question("Where does Tywin Lannister die?", "In his bed ", "On the toilet", "On the battlefield","Casterly Rock", "On the toilet");
        dbHelper.addQuestion(q50);
        Question q51 = new Question("What does Daenerys rename Slaver’s Bay?", "The Bay of Fire", "Dragon Bay", "The Bay of Dragons","The Bay of Broken Chains", "The Bay of Dragons");
        dbHelper.addQuestion(q51);

        Question q52 = new Question("What is the name of the sword given to Jon Snow by Jeor Mormont?", "Ice", "Longclaw", "Saviour","Dawn", "Longclaw");
        dbHelper.addQuestion(q52);
        Question q53 = new Question("What is the name of the Red God?", "R'hllor", "The Great Other", "Craster", "Hizdahr ", "R'hllor");
        dbHelper.addQuestion(q53);
        Question q54 = new Question("Who speaks for Daenerys at the gates of Qarth?", "Jaqen H'ghar", "Xaro Xhoan Daxos", "Hizdahr zo Loraq", "Daario Naharis", "Xaro Xhoan Daxos");
        dbHelper.addQuestion(q54);

        Question q55 = new Question("What is the name of Jon’s direwolf?", "Shadown", "Snow", "Grey Wind","Ghost", "Ghost");
        dbHelper.addQuestion(q55);
        Question q56 = new Question("Who is the captain of the Unsullied?", "Red Flea", "Grey Worm", "Vermin","Black Rat", "Grey Worm");
        dbHelper.addQuestion(q56);
        Question q57 = new Question("Who was the most recent King Beyond the Wall?", "Raymund Redbeard", "Mance Rayder", "Tormund Giantsbain","The Lord of Bones", "Mance Rayder");
        dbHelper.addQuestion(q57);

        // level 4

        Question q58 = new Question("What is the name of Arya’s direwolf?", "Lady", "Summer", "Nymeria","Arrow", "Nymeria");
        dbHelper.addQuestion(q58);

        Question q59 = new Question("How is Stannis defeated at the battle of the Blackwater?", "With wildfire", "By the Lannister & Tyrell armies", "Surrenders","With dragons", "By the Lannister & Tyrell armies");
        dbHelper.addQuestion(q59);
        Question q60 = new Question("Who are the wardens of the South?", "The Tarleys", "The Tyrells", "The Lannisters","The Clegans", "The Tyrells");
        dbHelper.addQuestion(q60);
        Question q61 = new Question("Who kills Robb Stark?", "Walder Frey", "Black Walder", "Roose Bolton","Jamie Lannister", "Roose Bolton");
        dbHelper.addQuestion(q61);

        Question q62 = new Question("Where does Daenerys go after Qarth?", "Astapor", "Yunki", "Meeren","Vaes Dothrak", "Astapor");
        dbHelper.addQuestion(q62);
        Question q63 = new Question("What is the name of Robb Stark's wife?", "Talisa", "Tysha", "Tara", "Talia", "Talisa");
        dbHelper.addQuestion(q63);
        Question q64 = new Question("What sickness does Jorah contract?", "Greyscale", "Dragonskin", "Leprosy","Dragonscale", "Greyscale");
        dbHelper.addQuestion(q64);

        Question q65 = new Question("Who dismisses Jamie from him the Kingsguard?", "Cersei Lannister", "Joffrey Baratheon", "Tommen Baratheon","Tywin Lannister", "Tommen Baratheon");
        dbHelper.addQuestion(q65);
        Question q66 = new Question("What god(s) do the Ironborn follow?", "The Iron God", "The Old Gods", "The Drowned God", "The Red God", "The Drowned God");
        dbHelper.addQuestion(q66);
        Question q67 = new Question("What are the words of House Baratheon?", "We do not sow", "Family, duty, honor", "Ours is the fury","Growing strong", "Ours is the fury");
        dbHelper.addQuestion(q67);

        Question q68 = new Question("Who kills Shae?", "Tywin Lannister", "Tyrion Lannister", "Joffrey Baratheon","The Mountain", "Tyrion Lannister");
        dbHelper.addQuestion(q68);
        Question q69 = new Question("What is Theon’s sister's name?", "Asha", "Osha", "Yara","Tara", "Yara");
        dbHelper.addQuestion(q69);
        Question q70 = new Question("What does Varys call his spies?", "Little Spiders", "Shadows", "Little Birds","Eyes and Ears", "Little Birds");
        dbHelper.addQuestion(q70);

        Question q71 = new Question("Who do with Daenerys and Viserys stay in Pentos?", "Illyrio Mopatis", "Sera Seastar", "Daemon Blackfyre","Magister Ignatius ", "Illyrio Mopatis");
        dbHelper.addQuestion(q71);
        Question q72 = new Question("What happened to Varys’s man parts?", "Eaten", "Burnt in a fire", "Fed to a dog","Thrown away", "Burnt in a fire");
        dbHelper.addQuestion(q72);
        Question q73 = new Question("Who does Edmure Tully marry?", "Walda Frey", "Roslin Frey", "Wilmer Frey","Rose Frey", "Roslin Frey");
        dbHelper.addQuestion(q73);

        Question q74 = new Question("What was the name of Daenerys’s stillborn son?", "Rhaegal", "Vaego", "Viserion","Rhaego", "Rhaego");
        dbHelper.addQuestion(q74);
        Question q75 = new Question("Why is Ser Davos called the Onion Knight?", "He smells like onions", "He sold onions", "He smuggled onions into a besieged castle","His head is shaped like an onion", "He smuggled onions into a besieged castle");
        dbHelper.addQuestion(q75);
        Question q76 = new Question("Who give Daenerys her dragon eggs on her wedding day?", "Viserys Targaryen", "Illyrio Mopatis", "Jorah Mormont","Drogo", "Illyrio Mopatis");
        dbHelper.addQuestion(q76);

        // level 5

        Question q77 = new Question("Who’s death does Oberyn Martell wish to avenge?", "Elia Martell", "Doran Martell", "Rhaegar Targaryen","Ellaria Sand", "Elia Martell");
        dbHelper.addQuestion(q77);

        Question q78 = new Question("At the wall, what does three blasts of the horn mean?", "Wildlings", "White Walkers", "Rangers","Giants", "White Walkers");
        dbHelper.addQuestion(q78);
        Question q79 = new Question("Who leads the Brotherhood Without Banners?", "Melisandre", "Thoros of Myr", "Beric Dondarrion","Catelyn Stark", "Beric Dondarrion");
        dbHelper.addQuestion(q79);
        Question q80 = new Question("What was the name of Ned Stark’s father?", "Rickard Stark", "Brandon Stark", "Robb Stark","Benjin Stark", "Rickard Stark");
        dbHelper.addQuestion(q80);

        Question q81 = new Question("Who tends Jamie’s wounds after losing his hand?", "Talisa", "Qyburn", "Maester Luwin","Maester Pycelle", "Qyburn");
        dbHelper.addQuestion(q81);
        Question q82 = new Question("Where does Sam find dragon glass?", "Craster's Keep", "The Fist of the First Men", "Old town","The Gift", "The Fist of the First Men");
        dbHelper.addQuestion(q82);
        Question q83 = new Question("What is Oberyn Martell's alias?", "The Spear of Dorne", "The Red Snake", "The Red Viper", "The Yellow Cobra", "The Red Viper");
        dbHelper.addQuestion(q83);

        Question q84 = new Question("What is the name given to basteds in the Vale?", "Hill", "Waters", "Stone", "Rivers", "Stone");
        dbHelper.addQuestion(q84);
        Question q85 = new Question("How are Maester Aemon and Daenerys related?", "She is his great grand niece", "They're cousins", "They're siblings","She is his grand daughter", "She is his great grand niece");
        dbHelper.addQuestion(q85);
        Question q86 = new Question("Who was the last giant?", "Mika", "Walla", "Wun Wun","Wun Tu", "Wun Wun");
        dbHelper.addQuestion(q86);

        Question q87 = new Question("Who was the father of Tywin Lannister?", "Titon Lannister", "Lyton Lannister", "Kevan Lannister","Tytos Lannister", "Tytos Lannister");
        dbHelper.addQuestion(q87);
        Question q88 = new Question("Where is Missandei from?", "Tarth", "Astapor", "Naarth","Lys", "Naarth");
        dbHelper.addQuestion(q88);
        Question q89 = new Question("How many children did Robert Baratheon have?", "16", "3", "7","6", "16");
        dbHelper.addQuestion(q89);

        Question q90 = new Question("What three castles of the Night’s Watch were still manned?", "Castle Black, Eastwatch, the Shadow Tower", "Castle Black, Snowgate, Eastwatch ", "Castle Black, Westwatch, the Sea Tower","Castle Black, Winterfell, Westwatch", "Castle Black, Eastwatch, the Shadow Tower");
        dbHelper.addQuestion(q90);
        Question q91 = new Question("Where is Daenerys’s handmaiden Doreah purchased from?", "A Volantian brothel", "The fighting pits of Meeren", "A pleasure house in Lys","A Slaver in Astapor", "A pleasure house in Lys");
        dbHelper.addQuestion(q91);
        Question q92 = new Question("Who does Tyrion tell he will marry Marcella to Robyn Arryn?", "Little Finger", "Lord Varys", "Cersei Lannister","Maester Pycelle", "Little Finger");
        dbHelper.addQuestion(q92);

        Question q93 = new Question("What was the name of Aegon the Conqueror’s dragon?", "Vhaegar", "Meraxes", "Vermithor","Balerion", "Balerion");
        dbHelper.addQuestion(q93);
        Question q94 = new Question("What are the words of House Lannister", "As Rish as a Lannister", "Hear me Roar", "A Lannister Always Pays his Debts","Power is Power", "Hear me Roar");
        dbHelper.addQuestion(q94);
        Question q95 = new Question("According to Petyr Baelish, what is chaos?", "A pit", "Chaos", "A ladder","Inevitable", "A ladder");
        dbHelper.addQuestion(q95);

        // level 6

        Question q96 = new Question("Where does Varys from?", "Lys", "Volantis", "Westeros","Pentos", "Lys");
        dbHelper.addQuestion(q96);

        Question q97 = new Question("How many brothers did Theon Greyjoy have?", "3", "2", "4","1", "2");
        dbHelper.addQuestion(q97);
        Question q98 = new Question("Where do the Stonemen live?", "Volantis", "Old Valeryia", "Dragonstone","Essos", "Old Valeryia");
        dbHelper.addQuestion(q98);
        Question q99 = new Question("The gods of the faith of the seven are:", "Teacher, smith, wife, warrior, stranger, shepherd, healer", "father, smith, warrior, mother, maiden, crone, stranger", "stallion, drowned god, shepherd, maiden, many faced god, crone, baby","father, blacksmith, soldier, virgin, wife, shepherd, reaper", "father, smith, warrior, mother, maiden, crone, stranger");
        dbHelper.addQuestion(q99);

        Question q100 = new Question("What is the name of the ancestral Valyrian sword of House Stark", "Oath Keeper", "Longclaw", "Wolfsbane","Ice", "Ice");
        dbHelper.addQuestion(q100);
        Question q101 = new Question("What does Tyrion proclaim himself to be the god of?", "Gold", "Whores", "Drinking","Tits & wine", "Tits & wine");
        dbHelper.addQuestion(q101);
        Question q102 = new Question("What was the name of Tyrion’s first wife?", "Tysha", "Shae", "Sansa","Lysa", "Tysha");
        dbHelper.addQuestion(q102);

        Question q103 = new Question("What are the names of Daenerys’s dragons?", "Drogon, Viserys, Rheago", "Drogon, Viserion, Rhaegal", "Rhaegal, Balerion, Viserion","Balerion, Varys, Rhaegar", "Drogon, Viserion, Rhaegal");
        dbHelper.addQuestion(q103);
        Question q104 = new Question("What did Ned Stark refuse to have on his wedding night?", "A duel", "Milk of the Poppy", "A Bedding Ceremony","Wine", "A Bedding Ceremony");
        dbHelper.addQuestion(q104);
        Question q105 = new Question("What do the Warlocks drink that turns their lips blue?", "Essence of Nightshade", "Shade of the Evening", "Milk of ther Poppy","Tears of Lys", "Shade of the Evening");
        dbHelper.addQuestion(q105);

        Question q106 = new Question("What was Daenerys’s mother’s name?", "Daenys", "Rhaenys", "Rhaella","Visenya", "Rhaella");
        dbHelper.addQuestion(q106);
        Question q107 = new Question("Who was Jamie Lannister supposed to marry before joining the Kingsguard?", "Lysa Arryn", "Lyanna Mormont", "Yara Greyjoy","Catelyn Stark", "Lysa Arryn");
        dbHelper.addQuestion(q107);
        Question q108 = new Question("As a child, who did Cersei think she would marry?", "Robert Baratheon", "Rhaegar Targaryen", "Stannis Baratheon","Arthur Dayne", "Rhaegar Targaryen");
        dbHelper.addQuestion(q108);

        Question q109 = new Question("What does Valar Dohaeris mean?", "All men must die", "All men must serve", "All men must bow","All men must dine", "All men must serve");
        dbHelper.addQuestion(q109);
        Question q110 = new Question("Where is Melisandre from?", "Braavos", "Asshai", "Lys","Valyria", "Asshai");
        dbHelper.addQuestion(q110);
        Question q111 = new Question("What is Ollena Tyrell also known as?", "Lady of the Rose", "The Queen of the Rose", "The Queen of Thorns","Lady of the Garden", "The Queen of Thorns");
        dbHelper.addQuestion(q111);

        Question q112 = new Question("What song plays before the bloodbath at the Red Wedding?", "The Rat Cook", "The Bear and the Maiden Fair", "The Rains of Castermere","The Dornish Man’s Wife", "The Rains of Castermere");
        dbHelper.addQuestion(q112);
        Question q113 = new Question("Who was burnt alive on Drogo's funeral pyre?", "Miri Maz Duur", "Mari Domir", "Doreah","Maego", "Miri Maz Duur");
        dbHelper.addQuestion(q113);
        Question q114 = new Question("What kingdom is Littlefinger from?", "The Riverlands", "The Vale", "The Stormlands","The Westerlands", "The Vale");
        dbHelper.addQuestion(q114);

        //level 7

        Question q115 = new Question("What is the name of Rasmey Bolton’s lover?", "Sarah", "Violet", "Holly","Myranda", "Myranda");
        dbHelper.addQuestion(q115);

        Question q116 = new Question("Who stabs Jon Snow last when he is murdered?", "Ed", "Olly", "Aliiser Thorne","Pip", "Olly");
        dbHelper.addQuestion(q116);
        Question q117 = new Question("Who was the second wealthiest family in the Westerlands?", "The CLeganes", "The Freys", "The Rains","The Castermeres", "The Rains");
        dbHelper.addQuestion(q117);
        Question q118 = new Question("Who killed Baelon Greyjoy", "Yara Greyjoy", "Victarion Greyjoy", "Euron Greyjoy","Aeron Greyjoy", "Euron Greyjoy");
        dbHelper.addQuestion(q118);

        Question q119 = new Question("What is the name of the whore Littlefinger uses to seduce Loras Tyrell?", "Olen", "Mika", "Olyvar","Ros", "Olyvar");
        dbHelper.addQuestion(q119);
        Question q120 = new Question("Where was Robb Stark born?", "Winterfell", "Riverrun", "The God's Wood","The Twins", "Riverrun");
        dbHelper.addQuestion(q120);
        Question q121 = new Question("Where was Robb Stark’s wife from?", "Pentos", "Volantis", "Braavos","Meeren", "Volantis");
        dbHelper.addQuestion(q121);

        Question q122 = new Question("What is Serio Forel’s official title?", "First Sword of Braavos", "The Master Sword of Braavos", "Grand Dancing Master","Chief Water Dancer", "First Sword of Braavos");
        dbHelper.addQuestion(q122);
        Question q123 = new Question("How many swords allegedly make up the Iron Throne?", "700", "1000", "500","2000", "1000");
        dbHelper.addQuestion(q123);
        Question q124 = new Question("Which member of the Kingsguard does Joffrey have hit Sansa?", "Barristan Selmy", "Jamie Lannister", "Meryn Trant","Illyn Payne", "Meryn Trant");
        dbHelper.addQuestion(q124);

        Question q125 = new Question("What is the name of the throne of the Iron Islands?", "Throne of the Ironborn", "Throne of the Sea", "The Sea Throne","The Salt Throne", "The Salt Throne");
        dbHelper.addQuestion(q125);
        Question q126 = new Question("What was Renly’s position on the Small Council?", "Master of Festivals", "Master of Ships", "Master of the Harvest","Master of Coin", "Master of Ships");
        dbHelper.addQuestion(q126);
        Question q127 = new Question("Who replaced Varys as the Master of Wisperers?", "Mace Tyrell", "Qyburn", "Ollena Tyrell","Maester Pycelle", "Qyburn");
        dbHelper.addQuestion(q127);

        Question q128 = new Question("What are the animals that appear on the sigil of House Clegane?", "Jackals ", "Hawks", "Dogs","Snakes", "Dogs");
        dbHelper.addQuestion(q128);
        Question q129 = new Question("What were the dying words of John Arryn?", "The line is strong", "The seed is strong", "Blood will flow","The seed will grow", "The seed is strong");
        dbHelper.addQuestion(q129);
        Question q130 = new Question("What were the names of Daenerys’s murdered niece and nephew?", "Aegon and Rhaenys", "Jaehaerys and Daenys ", "Aegon and Rhaella","Aerys and Visenya", "Aegon and Rhaenys");
        dbHelper.addQuestion(q130);

        Question q131 = new Question("What does Arya tell Lady Crane her name is?", "Maggie", "Mercy", "Mary","Marcy", "Mercy");
        dbHelper.addQuestion(q131);
        Question q132 = new Question("What is the name of the Master who Drogon kills in Astapor?", "Hizdahr", "Xaro", "Kraznys","Grazdan", "Kraznys");
        dbHelper.addQuestion(q132);
        Question q133 = new Question("What is the name of Daenerys's green dragon?", "Drogon", "Viserion", "Rhaegal","Balerion", "Rhaegal");
        dbHelper.addQuestion(q133);


        //Question q = new Question("", "", "", "","", "");
        //dbHelper.addQuestion(q);
    }

}