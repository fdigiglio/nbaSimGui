import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.text.html.parser.ContentModel;


import java.net.*;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.Icon;

public class Gui{

    JFrame window;
    Container box;
    JPanel contentPanel, conferencePanel, eastPanel, westPanel, teamPanel, tradePanel, teamTradePanel, simPanel;
    JPanel cardsPanel, cardsPanel2, boxScorePanel, playerStatsPanel, standingsPanel, seasonStatsPanel, playoffPanel;
    JLabel playLabel, rosterLabel, historyLabel, tradeLabel, freeAgencyLabel, extraLabel;
    JLabel welcomeLabel, yearLabel, championLabel, statsLabel;
    JLabel phillyLogo, bucksLogo, bullsLogo, caveliersLogo, celticsLogo, clippersLogo, grizzliesLogo, hawksLogo, heatLogo, hornetsLogo, jazzLogo, kingsLogo, knicksLogo, lakersLogo, magicLogo, mavericksLogo, netsLogo, nuggetsLogo, pacersLogo, pelicansLogo, pistonsLogo, raptorsLogo, rocketsLogo, spursLogo, sunsLogo, thunderLogo, timberwolvesLogo, trailblazersLogo, warriorsLogo, wizardsLogo;
    JLabel teamLogo, nbaTrophy, totalTrophy;
    JLabel easternConferenceLogo;
    JLabel westernConferenceLogo;
    JLabel backUp;
    JLabel switchButton;
    JLabel tradeButton, confirmTrade;
    JLabel firstRoundLabelE, semiFinalsLabelE, eastConfFinalLabel, finalsLabel, firstRoundLabelW, semiFinalsLabelW, westConfFinalLabel;
    public int teamNum = 0;
    int totalTradeNum = 0;
    int tradeClick = 0;
    int year = 2021;
    int secondYear = year + 1;
    Font welcomeFont = new Font("Impact", Font.BOLD, 57);
    JLabel fkLogo;
    ArrayList<ArrayList<String>> playerStats = new ArrayList<ArrayList<String>>();
    ArrayList<ArrayList<String>> playoffPlayerStats = new ArrayList<ArrayList<String>>();
    ArrayList<String> seasonStats = new ArrayList<String>();
    ArrayList<Team> firstRoundStats = new ArrayList<Team>();
    ArrayList<Team> semiFinals = new ArrayList<Team>();
    ArrayList<Team> conferenceFinals = new ArrayList<Team>();
    ArrayList<Team> finals = new ArrayList<Team>();
    ArrayList<String> firstRoundSeries = new ArrayList<String>();
    ArrayList<String> semiFinalsSeries = new ArrayList<String>();
    ArrayList<String> conferenceFinalsSeries = new ArrayList<String>();
    ArrayList<String> finalsSeries = new ArrayList<String>();
    ArrayList<Game> boxScore;

    
    //Each team total of 200 shot tendency

    Player philly1 = new Player("Ben Simmons", 82, 92, 90, 20, 0, "PG", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\philly\\benSimmons.png");
    Player philly2 = new Player("Seth Curry", 80, 79, 80, 25, 15, "SG", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\philly\\sethCurry.png");
    Player philly3 = new Player("Tobias Harris", 87, 85, 80, 45, 10, "SF", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\philly\\tobiasHarris.png");
    Player philly4 = new Player("Joel Embiid", 93, 89, 80, 50, 20, "PF", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\philly\\joelEmbiid.png");
    Player philly5 = new Player("Andre Drummond", 84, 93, 69, 30, 0, "C", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\philly\\andreDrummond.png");
    
    Player bucks1 = new Player("Jrue Holiday", 84, 90, 90, 25, 20, "PG", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\jrueHoliday.png");
    Player bucks2 = new Player("Khris Middleton", 89, 80, 80, 45, 30, "SG", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\khrisMiddleton.png");
    Player bucks3 = new Player("Giannnis Antetokounmpo", 96, 97, 85, 65, 10, "SF", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\giannis.png");
    Player bucks4 = new Player("Bobby Portis", 80, 76, 85, 10, 10, "PF", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\bobbyPortis.png");
    Player bucks5 = new Player("Brook Lopez", 78, 80, 65, 10, 10, "C", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\brookLopez.png");

    Player bulls1 = new Player("Lonzo Ball", 83, 85, 93, 25, 25, "PG", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\lonzoBall.png");
    Player bulls2 = new Player("Zach LaVine", 91, 84, 80, 40, 30, "SG", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\zachLavine.png");
    Player bulls3 = new Player("DeMar DeRozan", 86, 85, 80, 55, 5, "SF", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\demarDerozan.png");
    Player bulls4 = new Player("Patrick Williams", 75, 83, 72, 15, 5, "PF", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\patrickWilliams.png");
    Player bulls5 = new Player("Nikola Vucevic", 88, 86, 80, 35, 30, "C", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\nikolaVucevic.png");

    Player cavs1 = new Player("Darius Garlans", 84, 81, 82, 20, 30, "PG", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\dariusGarland.png");
    Player cavs2 = new Player("Collin Sexton", 88, 85, 78, 40, 25, "SG", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\collinSexton.png");
    Player cavs3 = new Player("Isaac Okoro", 74, 77, 76, 25, 0, "SF", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\isaacOkoro.png");
    Player cavs4 = new Player("Evan Mobley", 79, 82, 79, 25, 10, "PF", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\evanMobley.png");
    Player cavs5 = new Player("Jarrett Allen", 78, 87, 79, 30, 0, "C", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\jarrettAllen.png");

    Player celtics1 = new Player("Dennis Schroeder", 74, 78, 80, 20, 10, "PG", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\dennisShroeder.png");
    Player celtics2 = new Player("Marcus Smart", 80, 79, 70, 15, 10, "SG", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\marcusSmart.png"); 
    Player celtics3 = new Player("Jaylen Brown", 90, 89, 80, 45, 20, "SF", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\jaylenBrown.png");
    Player celtics4 = new Player("Jayson Tatum", 96, 87, 82, 40, 35, "PF", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\jaysonTatum.png");
    Player celtics5 = new Player("Robert Williams", 75, 86, 78, 20, 0, "C", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\robertWilliams.png");

    Player clippers1 = new Player("Reggie Jackson", 79, 82, 90, 10, 20, "PG", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\reggieJackson.png");
    Player clippers2 = new Player("Paul George", 90, 90, 87, 5, 25, "SG", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\paulGeorge.png");
    Player clippers3 = new Player("Kawhi Leonard", 93, 93, 87, 45, 25, "SF", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\kawhiLeonard.png");
    Player clippers4 = new Player("Serge Ibaka", 82, 81, 70, 10, 10, "PF", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\sergeIbaka.png");
    Player clippers5 = new Player("DeMarcus Cousins", 79, 79, 69, 10, 5, "C", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\ivicaZubac.png");

    Player grizzlies1 = new Player("Ja Morant", 87, 83, 85, 40, 10, "PG", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\jaMorant.png");
    Player grizzlies2 = new Player("Dillon Brooks", 80, 86, 80, 20, 15, "SF", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\dillonBrooks.png");
    Player grizzlies3 = new Player("Kyle Anderson", 78, 79, 75, 10, 25, "SG", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\kyleAnderson.png");
    Player grizzlies4 = new Player("Jaren Jackson Jr.", 83, 84, 75, 30, 10, "PF", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\jarenJackson.png");
    Player grizzlies5 = new Player("Steven Adams", 86, 84, 79, 40, 0, "C", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\stevenAdams.png");

    Player hawks1 = new Player("Trae Young", 89, 83, 84, 25, 35, "PG", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\traeYoung.png");
    Player hawks2 = new Player("Bogdan Bogdanovic", 80, 79, 75, 10, 25, "SG", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\bogdanBogdanovic.png");
    Player hawks3 = new Player("De'Andre Hunter", 83, 79, 77, 10, 20, "SF", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\deandreHunter.png");
    Player hawks4 = new Player("John Collins", 85, 80, 73, 40, 5, "PF", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\johnCollins.png");
    Player hawks5 = new Player("Clint Capela", 82, 88, 72, 25, 0, "C", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\clintCapela.png");

    Player heat1 = new Player("Kyle Lowry", 81, 80, 84, 25, 20, "PG", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\kyleLowry.png");
    Player heat2 = new Player("Victor Oladipo", 78, 85, 77, 25, 15, "SG", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\victorOladipo.png");
    Player heat3 = new Player("Tyler Herro", 85, 80, 76, 25, 30, "SF", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\tylerHerro.png");
    Player heat4 = new Player("Jimmy Butler", 92, 92, 85, 45, 10, "PF", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\jimmyButler.png");
    Player heat5 = new Player("Bam Adebayo", 86, 89, 82, 35, 5, "C", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\bamAdebayo.png");

    Player hornets1 = new Player("LaMelo Ball", 86, 81, 85, 25, 35, "PG", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\lameloBall.png");
    Player hornets2 = new Player("Terry Rozier", 83, 80, 75, 25, 20, "SG", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\terryRozier.png");
    Player hornets3 = new Player("Gordon Hayward", 86, 80, 79, 35, 10, "SF", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\gordonHayward.png");
    Player hornets4 = new Player("Miles Bridges", 78, 82, 77, 20, 10, "PF", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\milesBridges.png");
    Player hornets5 = new Player("Mason Plumlee", 76, 80, 72, 20, 0, "C", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\masonPlumlee.png");
    
    Player jazz1 = new Player("Mike Conley", 80, 82, 84, 20, 10, "PG", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\mikeConley.png");
    Player jazz2 = new Player("Donovan Mitchell", 90, 86, 82, 40, 25, "SG", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\donovanMitchell.png");
    Player jazz3 = new Player("Jordan Clarkson", 84, 79, 76, 25, 20, "SF", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\jordanClarkson.png");
    Player jazz4 = new Player("Joe Ingles", 80, 80, 74, 15, 25, "PF", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\joeIngles.png");
    Player jazz5 = new Player("Rudy Gobert", 83, 98, 78, 25, 0, "C", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\rudyGobert.png");

    Player kings1 = new Player("De'Aaron Fox", 88, 87, 82, 40, 25, "PG", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\dearronFox.png");
    Player kings2 = new Player("Buddy Hield", 79, 80, 75, 5, 25, "SG", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\buddyHield.png");
    Player kings3 = new Player("Tyrese Haliburton", 81, 79, 76, 25, 15, "SF", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\tyreseHaliburton.png");
    Player kings4 = new Player("Marvin Bagley III", 82, 80, 75, 25, 5, "PF", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\marvinBagley.png");
    Player kings5 = new Player("Richaun Holmes", 83, 82, 78, 20, 0, "C", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\richaunHolmes.png");

    Player knicks1 = new Player("Derrick Rose", 85, 81, 85, 25, 10, "PG", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\derrickRose.png");
    Player knicks2 = new Player("R.J Barrett", 85, 80, 80, 35, 5, "SG", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\rjBarrett.png");
    Player knicks3 = new Player("Evan Fournier", 80, 75, 62, 25, 15, "SF", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\evanFournier.png");
    Player knicks4 = new Player("Julius Randle", 90, 85, 87, 50, 10, "PF", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\juliusRandle.png");
    Player knicks5 = new Player("Mitchell Robinson", 76, 90, 60, 25, 0, "C", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\mitchellRobinson.png");

    Player lakers1 = new Player("Russell Westbrook", 85, 81, 85, 35, 10, "PG", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\russellWestbrook.png");
    Player lakers2 = new Player("Kendrick Nunn", 79, 81, 70, 10, 20, "SG", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\kendrickNunn.png");
    Player lakers3 = new Player("LeBron James", 93, 96, 98, 35, 25, "SF", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\lebronJames.png");
    Player lakers4 = new Player("Carmelo Anthony", 78, 83, 69, 15, 20, "PF", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\carmeloAnthony.png");
    Player lakers5 = new Player("Anthony Davis", 94, 97, 75, 35, 25, "C", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\anthonyDavis.png");

    Player magic1 = new Player("Markelle Fultz", 82, 79, 78, 30, 15, "PG", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\markelleFultz.png");
    Player magic2 = new Player("Cole Anthony", 79, 77, 75, 25, 15, "SG", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\coleAnthony.png");
    Player magic3 = new Player("Terrence Ross", 78, 79, 77, 20, 25, "SF", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\terrenceRoss.png");
    Player magic4 = new Player("Johnathan Isaac", 83, 88, 80, 30, 10, "PF", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\johnathanIsaac.png");
    Player magic5 = new Player("Wendell Carter Jr.", 81, 84, 72, 30, 0, "C", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\wendellCarter.png");

    Player mavericks1 = new Player("Luka Doncic", 97, 87, 95, 45, 30, "PG", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\lukaDoncic.png");
    Player mavericks2 = new Player("Tim Hardaway Jr.", 84, 78, 72, 10, 25, "SG", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\timHardaway.png");
    Player mavericks3 = new Player("Reggie Bullock", 77, 80, 73, 10, 15, "SF", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\reggieBullock.png");
    Player mavericks4 = new Player("Kristaps Porzingis", 86, 83, 75, 15, 30, "PF", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\nikolaVucevic.png");
    Player mavericks5 = new Player("Willie Cauley-Stein", 79, 78, 68, 20, 0, "C", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\nikolaVucevic.png");
    
    Player nets1 = new Player("Kyrie Irving", 96, 89, 80, 15, 25, "PG", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\kyrieIrving.png");
    Player nets2 = new Player("James Harden", 96, 85, 98, 15, 30, "SG", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\jamesHarden.png");
    Player nets3 = new Player("Joe Harris", 75, 83, 70, 5, 15, "SF", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\joeHarris.png");
    Player nets4 = new Player("Kevin Durant", 97, 91, 85, 35, 15, "SF", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\kevinDurant.png");
    Player nets5 = new Player("Blake Griffin", 72, 73, 69, 15, 0, "C", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\blakeGriffin.png");

    Player nuggets1 = new Player("Jamal Murray", 86, 85, 85, 30, 15, "PG", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\jamalMurray.png");
    Player nuggets2 = new Player("Monte Morris", 77, 79, 78, 5, 10, "SG", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\monteMorris.png");
    Player nuggets3 = new Player("Michael Porter Jr.", 85, 82, 75, 30, 20, "SF", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\michaelPorter.png");
    Player nuggets4 = new Player("Aaron Gordon", 79, 83, 78, 20, 10, "PF", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\aaronGordon.png");
    Player nuggets5 = new Player("Nikola Jokic", 95, 84, 95, 40, 20, "C", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\nikolaJokic.png");

    Player pacers1 = new Player("Malcom Brogdon", 84, 86, 86, 25, 20, "PG", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\malcomBrogdon.png");
    Player pacers2 = new Player("Caris LeVert", 85, 80, 79, 30, 10, "SG", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\carisLevert.png");
    Player pacers3 = new Player("T.J Warren", 84, 81, 78, 25, 20, "SF", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\tjWarren.png");
    Player pacers4 = new Player("Domantas Sabonis", 88, 84, 85, 45, 10, "PF", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\domantasSabonis.png");
    Player pacers5 = new Player("Myles Turner", 81, 94, 78, 10, 20, "C", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\mylesTurner.png");

    Player pelicans1 = new Player("De'Vonte Graham", 76, 85, 87, 20, 10, "PG", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\devonteGraham.png");
    Player pelicans2 = new Player("Nickeil Alexander-Walker", 73, 78, 76, 10, 10, "SG", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\nickeilAlexander.png");
    Player pelicans3 = new Player("Brandon Ingram", 89, 84, 80, 35, 15, "SF", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\brandonIngram.png");
    Player pelicans4 = new Player("Zion Williamson", 94, 85, 82, 45, 5, "PF", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\zionWilliamson.png");
    Player pelicans5 = new Player("Jonas Valancunis", 82, 84, 79, 25, 0, "C", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\jonasValancunis.png");

    Player pistons1 = new Player("Cade Cunningham", 75, 76, 78, 30, 15, "PG", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\cadeCunningham.png");
    Player pistons2 = new Player("Killian Hayes", 70, 73, 76, 25, 15, "SG", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\killianHayes.png");
    Player pistons3 = new Player("Jerami Grant", 85, 83, 78, 40, 20, "SF", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\jeramiGrant.png");
    Player pistons4 = new Player("Saddiq Bey", 78, 75, 76, 15, 15, "PF", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\saddiqBey.png");
    Player pistons5 = new Player("Kelly Olynyk", 80, 79, 75, 25, 0, "C", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\kellyOlynyk.png");

    Player raptors2 = new Player("Fred Vanvleet", 84, 81, 75, 20, 30, "PG", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\fredVanvleet.png");
    Player raptors3 = new Player("Gary Trent Jr.", 79, 78, 75, 15, 20, "SG", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\garyTrent.png");
    Player raptors1 = new Player("OG Anunoby", 83, 80, 84, 30, 20, "SF", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\ogAnunoby.png");
    Player raptors4 = new Player("Pascal Siakam", 84, 84, 79, 40, 5, "PF", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\pascalSiakam.png");
    Player raptors5 = new Player("Chris Boucher", 78, 80, 70, 25, 0, "C", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\chrisBoucher.png");
    
    Player rockets1 = new Player("John Wall", 83, 82, 78, 20, 15, "PG", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\johnWall.png");
    Player rockets2 = new Player("Jalen Green", 79, 80, 79, 30, 10, "SG", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\jalenGreen.png");
    Player rockets3 = new Player("Kevin Porter Jr.", 84, 80, 78, 30, 20, "SF", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\kevinPorter.png");
    Player rockets4 = new Player("Christian Wood", 84, 84, 78, 35, 5, "PF", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\christianWood.png");
    Player rockets5 = new Player("Kenyon Martin Jr.", 80, 75, 98, 20, 25, "C", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\kjMartin.png");

    Player suns1 = new Player("Chris Paul", 88, 87, 98, 30, 10, "PG", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\chrisPaul.png");
    Player suns2 = new Player("Devin Booker", 92, 85, 79, 45, 20, "SG", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\devinBooker.png");
    Player suns3 = new Player("Mikal Bridges", 80, 86, 75, 10, 20, "SF", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\mikalBridges.png");
    Player suns4 = new Player("Jae Crowder", 79, 88, 75, 10, 25, "PF", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\jaeCrowder.png");
    Player suns5 = new Player("De'Andre Ayton", 84, 83, 70, 40, 0, "C", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\deandreAyton.png");

    Player spurs1 = new Player("Dejounte Murray", 85, 81, 80, 30, 15, "PG", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\dejounteMurray.png");
    Player spurs2 = new Player("Devin Vassel", 75, 82, 79, 10, 25, "SG", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\devinVassel.png");
    Player spurs3 = new Player("Thad Young", 83, 85, 80, 35, 5, "SF", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\thadYoung.png");
    Player spurs4 = new Player("Keldon Johnson", 79, 73, 5, 20, 15, "PF", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\keldonJohnson.png");
    Player spurs5 = new Player("Jakob Poltl", 76, 89, 70, 25, 0, "C", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\jakobPoettel.png");
    
    Player thunder1 = new Player("Josh Giddey", 75, 75, 77, 20, 20, "PG", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\joshGiddey.png");
    Player thunder2 = new Player("Shai Gilgeous-Alexander", 88, 86, 80, 40, 30, "SG", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\shai.png");
    Player thunder3 = new Player("Lugwents Dort", 77, 85, 75, 25, 15, "SF", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\luDort.png");
    Player thunder4 = new Player("Aleksej Pokusevski", 79, 75, 78, 20, 25, "PF", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\poku.png");
    Player thunder5 = new Player("Derrick Favors", 74, 80, 72, 25, 0, "C", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\derrickFavors.png");

    Player timberwolves1 = new Player("D'Angelo Russell", 83, 81, 82, 25, 20, "PG", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\dlo.png");
    Player timberwolves2 = new Player("Anthony Edwards", 86, 80, 79, 40, 10, "SG", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\anthonyEdwards.png");
    Player timberwolves3 = new Player("Malik Beasley", 80, 79, 78, 15, 20, "SF", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\malikBeasley.png");
    Player timberwolves4 = new Player("Naz Reid", 74, 80, 73, 10, 0, "PF", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\nazReid.png");
    Player timberwolves5 = new Player("Karl-Anthony Towns", 92, 83, 82, 35, 30, "C", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\kat.png");

    Player blazer1 = new Player("Damian Lillard", 97, 88, 90, 20, 40, "PG", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\damianLillard.png");
    Player blazer2 = new Player("CJ McCollum", 85, 84, 84, 25, 10, "SG", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\cjMcCollum.png");
    Player blazer3 = new Player("Robert Covington", 79, 90, 75, 10, 20, "SF", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\robertCovington.png");
    Player blazer4 = new Player("Larry Nance Jr.", 76, 79, 72, 15, 5, "PF", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\larryNance.png");
    Player blazer5 = new Player("Jusif Nurkic", 84, 82, 70, 22, 3, "C", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\jusufNurkic.png");

    Player warriors1 = new Player("Stephen Curry", 99, 84, 85, 25, 45, "PG", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\stephCurry.png");
    Player warriors2 = new Player("Klay Thompson", 92, 90, 70, 10, 30, "SG", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\klayThompson.png");
    Player warriors3 = new Player("Andrew Wiggins", 84, 87, 75, 25, 15, "SF", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\andrewWiggins.png");
    Player warriors4 = new Player("Draymond Green", 74, 99, 92, 20, 5, "PF", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\draymondGreen.png");
    Player warriors5 = new Player("James Wiseman", 79, 82, 60, 25, 0, "C", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\jamesWiseman.png");
    
    Player wizards1 = new Player("Spencer Dinwiddie", 80, 80, 80, 15, 10, "PG", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\spencerDinwiddie.png");
    Player wizards2 = new Player("Bradely Beal", 98, 85, 80, 40, 25, "SG", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\bradleyBeal.png");
    Player wizards3 = new Player("Kyle Kuzma", 74, 79, 75, 20, 10, "SF", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\kyleKuzma.png");
    Player wizards4 = new Player("Davis Bertans", 76, 78, 75, 5, 20, "PF", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\davisBertans.png");
    Player wizards5 = new Player("Thomas Bryant", 75, 78, 75, 25, 0, "C", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\playerFaces\\thomasBryant.png");

    //East
    Team philly = new Team("Philadelphia 76ers", "E","PHI", philly1, philly2, philly3, philly4, philly5, "N", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\philly.png");
    Team bucks = new Team("Milwaukee Bucks", "E", "MIL", bucks1, bucks2, bucks3, bucks4, bucks5, "F", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\bucks.png");
    Team bulls = new Team("Chicago Bulls", "E", "CHI", bulls1, bulls2, bulls3, bulls4, bulls5, "N", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\bulls.png");
    Team cavs = new Team("Clevland Cavaliers", "E", "CLE", cavs1, cavs2, cavs3, cavs4, cavs5, "S", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\caveliers.png");
    Team celtics = new Team("Boston Celtics", "E", "BOS", celtics1, celtics2, celtics3, celtics4, celtics5, "N", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\celtics.png");
    Team hawks = new Team("Atlanta Hawks", "E", "ATL", hawks1, hawks2, hawks3, hawks4, hawks5, "S", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\hawks.png");
    Team heat = new Team("Miami Heat", "E", "MIA", heat1, heat2, heat3, heat4, heat5, "S", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\heat.png");
    Team hornets = new Team("Charlotte Hornets", "E", "CHA", hornets1, hornets2, hornets3, hornets4, hornets5, "N", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\hornets.png");
    Team knicks = new Team("New York Knicks", "E", "NYK", knicks1, knicks2, knicks3, knicks4, knicks5, "S", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\knicks.png");
    Team magic = new Team("Orlando Magic", "E", "ORL", magic1, magic2, magic3, magic4, magic5, "N", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\magic.png");
    Team nets = new Team("Brooklyn Nets", "E", "BKN", nets1, nets2, nets3, nets4, nets5, "N", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\nets.png");
    Team pacers = new Team("Indiana Pacers", "E", "IND", pacers1, pacers2, pacers3, pacers4, pacers5, "F", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\pacers.png");
    Team pistons = new Team("Detroit Pistons", "E", "DET", pistons1, pistons2, pistons3, pistons4, pistons5, "S", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\pistons.png");
    Team raptors = new Team("Toronto Raptors", "E", "TOR", raptors1, raptors2, raptors3, raptors4, raptors5, "N", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\raptors.png");
    Team wizards = new Team("Washington Wizards", "E", "WAS", wizards1, wizards2, wizards3, wizards4, wizards5, "F", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\wizards.png");
    //West
    Team clippers = new Team("Los Angeles Clippers", "W", "LAC", clippers1, clippers2, clippers3, clippers4, clippers5, "S", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\clippers.png");
    Team grizzlies = new Team("Memphis Grizzlies", "W", "MEM", grizzlies1, grizzlies2, grizzlies3, grizzlies4, grizzlies5, "F", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\grizzlies.png");
    Team jazz = new Team("Utah Jazz", "W", "UTA", jazz1, jazz2, jazz3, jazz4, jazz5, "N", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\jazz.png");
    Team kings = new Team("Sacramento Kings", "W", "SAC", kings1, kings2, kings3, kings4, kings5, "F", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\kings.png");
    Team lakers = new Team("Los Angeles Lakers", "W", "LAL", lakers1, lakers2, lakers3, lakers4, lakers5, "S", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\lakers.png");
    Team mavericks = new Team("Dallas Mavericks", "W", "DAL", mavericks1, mavericks2, mavericks3, mavericks4, mavericks5, "S", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\mavericks.png");
    Team nuggets = new Team("Denver Nuggets", "W", "DEN", nuggets1, nuggets2, nuggets3, nuggets4, nuggets5, "S", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\nuggets.png");
    Team pelicans = new Team("New Orleans Pelicans", "W", "NOR", pelicans1, pelicans2, pelicans3, pelicans4, pelicans5, "F", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\pelicans.png");
    Team rockets = new Team("Houston Rockets", "W", "HOU", rockets1, rockets2, rockets3, rockets4, rockets5, "F", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\rockets.png");
    Team spurs = new Team("San Antonio Spurs", "W","SAN", spurs1, spurs2, spurs3, spurs4, spurs5, "N", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\spurs.png");
    Team suns = new Team("Phoenix Suns", "W", "PHO", suns1, suns2, suns3, suns4, suns5, "S", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\suns.png");
    Team timberwolves = new Team("Minnesota Timberwolves", "W", "MIN", timberwolves1, timberwolves2, timberwolves3, timberwolves4, timberwolves5, "F", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\timberwolves.png");
    Team thunder = new Team("Oklahoma City Thunder", "W", "OKC", thunder1, thunder2, thunder3, thunder4, thunder5, "F", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\thunder.png");
    Team blazers = new Team("Portland Trailblazers", "W","POR", blazer1, blazer2, blazer3, blazer4, blazer5, "N", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\blazers.png");
    Team warriors = new Team("Golden State Warriors", "W", "GSW", warriors1, warriors2, warriors3, warriors4, warriors5, "F", "C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\warriors.png");

    Team[] nbaTeams = {philly, bucks, bulls, cavs, celtics, hawks, heat, hornets, knicks, magic, nets, pacers, pistons, raptors, wizards, clippers, grizzlies, jazz, kings, lakers, mavericks, nuggets, pelicans, rockets, spurs, suns, thunder, timberwolves, blazers, warriors};
    
    Team[] nbaDivionTeam = {philly, celtics, nets, raptors, knicks, cavs, pistons, pacers, bucks, bulls, hawks, wizards, hornets, magic, heat, jazz, blazers, thunder, timberwolves, nuggets, spurs, grizzlies, rockets, mavericks, pelicans, warriors, clippers, kings, suns, lakers};

    Season season = new Season(nbaDivionTeam);

    public Gui(){

        window = new JFrame("NBA Simulator");
        window.setSize(1920, 1080);
        window.getContentPane().setBackground(Color.WHITE);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setUndecorated(true);
        window.setResizable(false);
        window.setLayout(null);
        window.getContentPane().setPreferredSize(new Dimension(1920, 1080));
        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);

        box = window.getContentPane();
        box.setVisible(true);
        box.validate();
        box.repaint();

        playLabel = new JLabel("");
        playLabel.setBounds(0, -1, 200, 208);
        playLabel.setIcon(new ImageIcon(("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\play3.png")));

        rosterLabel = new JLabel("");
        rosterLabel.setBounds(0, 202, 200, 179);
        rosterLabel.setIcon(new ImageIcon(("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\roster2.png")));
        
        historyLabel = new JLabel("");
        historyLabel.setBounds(0, 375, 200, 203);
        historyLabel.setIcon(new ImageIcon(("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\history2.png")));

        tradeLabel = new JLabel("");
        tradeLabel.setBounds(0, 574, 200, 226);
        tradeLabel.setIcon(new ImageIcon(("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\trade2.png")));

        freeAgencyLabel = new JLabel("");
        freeAgencyLabel.setBounds(0, 795, 200, 205);
        freeAgencyLabel.setIcon(new ImageIcon(("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\money3.png")));

        extraLabel = new JLabel("");
        extraLabel.setBounds(0, 1000, 200, 89);
        extraLabel.setIcon(new ImageIcon(("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\exit.png")));
        extraLabel.addMouseListener(new MouseAdapter(){
            
            @Override
            public void mouseClicked(MouseEvent evt){
                System.exit(0);
            }

            @Override
            public void mouseEntered(MouseEvent evt){
                extraLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent evt){

            }
        });

        contentPanel = new JPanel();
        contentPanel.setBounds(200, 0, 1720, 1080);
        contentPanel.setBackground(new Color(233, 255, 243));
        contentPanel.setVisible(true);
        contentPanel.setLayout(null);

        conferencePanel = new JPanel();
        conferencePanel.setBounds(0, 0, 1720, 1080);
        conferencePanel.setBackground(new Color(233, 255, 243));
        conferencePanel.setVisible(false);
        conferencePanel.setLayout(null);

        eastPanel = new JPanel();
        eastPanel.setBounds(0, 0, 1720, 1080);
        eastPanel.setBackground(new Color(233, 255, 243));
        eastPanel.setVisible(false);
        eastPanel.setLayout(null);

        westPanel = new JPanel();
        westPanel.setBounds(0, 0, 1720, 1080);
        westPanel.setBackground(new Color(233, 255, 243));
        westPanel.setVisible(false);
        westPanel.setLayout(null);

        teamPanel = new JPanel();
        teamPanel.setBounds(0, 0, 1720, 1080);
        teamPanel.setBackground(new Color(233, 255, 243));
        teamPanel.setVisible(false);
        teamPanel.setLayout(null);

        tradePanel = new JPanel();
        tradePanel.setBounds(0, 0, 1720, 1080);
        tradePanel.setBackground(new Color(233, 255, 243));
        tradePanel.setVisible(false);
        tradePanel.setLayout(null);

        teamTradePanel = new JPanel();
        teamTradePanel.setBounds(0, 0, 1720, 1080);
        teamTradePanel.setBackground(new Color(233, 255, 243));
        teamTradePanel.setVisible(false);
        teamTradePanel.setLayout(null);

        simPanel = new JPanel();
        simPanel.setBounds(0, 0, 1720, 1080);
        simPanel.setBackground(new Color(233, 255, 243));
        simPanel.setVisible(false);
        simPanel.setLayout(null);

        playoffPanel = new JPanel(){
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                //Left side Bracket First side Bracket
                g.drawLine(25, 90, 215, 90);
                g.drawLine(25, 230, 215, 230);
                g.drawLine(25, 370, 215, 370);
                g.drawLine(25, 510, 215, 510);
                g.drawLine(25, 650, 215, 650);
                g.drawLine(25, 790, 215, 790);
                g.drawLine(25, 930, 215, 930);
                g.drawLine(25, 1070, 215, 1070);

                //Connecting Lines
                g.drawLine(215, 90, 215, 230);
                g.drawLine(215, 370, 215, 510);
                g.drawLine(215, 650, 215, 790);
                g.drawLine(215, 930, 215, 1070);

                //Left side Bracket Semi Finals
                g.drawLine(215, 160, 455, 160);
                g.drawLine(215, 440, 455, 440);
                g.drawLine(215, 720, 455, 720);
                g.drawLine(215, 1000, 455, 1000);

                //Connecting Lines
                g.drawLine(455, 160, 455, 440);
                g.drawLine(455, 720, 455, 1000);

                //Left side Bracket Conf Finals
                g.drawLine(455, 300, 695, 300);
                g.drawLine(455, 860, 695, 860);

                //Connecting Lines
                g.drawLine(695, 300, 695, 860);

                //Left side Bracket Finals
                g.drawLine(695, 440, 935, 440);

                //Right Side Bracket ==================================================
                //Right Side Bracket First Side 
                g.drawLine(1505, 90, 1695, 90);
                g.drawLine(1505, 230, 1695, 230);
                g.drawLine(1505, 370, 1695, 370);
                g.drawLine(1505, 510, 1695, 510);
                g.drawLine(1505, 650, 1695, 650);
                g.drawLine(1505, 790, 1695, 790);
                g.drawLine(1505, 930, 1695, 930);
                g.drawLine(1505, 1070, 1695, 1070);

                //Right Side Connecting Side
                g.drawLine(1505, 90, 1505, 230);
                g.drawLine(1505, 370, 1505, 510);
                g.drawLine(1505, 650, 1505, 790);
                g.drawLine(1505, 930, 1505, 1070);

                //Right Side Semi Finals
                g.drawLine(1315, 160, 1505, 160);
                g.drawLine(1315, 440, 1505, 440);
                g.drawLine(1315, 720, 1505, 720);
                g.drawLine(1315, 1000, 1505, 1000);

                //Right Side Connecting
                g.drawLine(1315, 160, 1315, 440);
                g.drawLine(1315, 720, 1315, 1000);

                //Right Side Conf Finals
                g.drawLine(1125, 300, 1315, 300);
                g.drawLine(1125, 860, 1315, 860);

                //Connecting Lines
                g.drawLine(1125, 300, 1125, 860);

                //Right Side Bracket Finals
                g.drawLine(885, 720, 1125, 720);

                JLabel westFirst = new JLabel("First Round");
                westFirst.setBounds(65, 0, 150, 25);
                westFirst.setFont(new Font("Impact", Font.PLAIN, 20));
                westFirst.setVisible(true);
                this.add(westFirst);

                JLabel westSemis = new JLabel("Western Semis");
                westSemis.setBounds(275, 0, 150, 25);
                westSemis.setFont(new Font("Impact", Font.PLAIN, 20));
                westSemis.setVisible(true);
                this.add(westSemis);

                JLabel westFinals = new JLabel("WCF");
                westFinals.setBounds(550, 0, 150, 25);
                westFinals.setFont(new Font("Impact", Font.PLAIN, 20));
                westFinals.setVisible(true);
                this.add(westFinals);

                JLabel Finals = new JLabel("FK Finals");
                Finals.setBounds(860, 0, 150, 25);
                Finals.setFont(new Font("Impact", Font.PLAIN, 20));
                Finals.setVisible(true);
                this.add(Finals);

                JLabel eastFinals = new JLabel("ECF");
                eastFinals.setBounds(1200, 0, 150, 25);
                eastFinals.setFont(new Font("Impact", Font.PLAIN, 20));
                eastFinals.setVisible(true);
                this.add(eastFinals);

                JLabel eastSemis = new JLabel("East Semis");
                eastSemis.setBounds(1350, 0, 150, 25);
                eastSemis.setFont(new Font("Impact", Font.PLAIN, 20));
                eastSemis.setVisible(true);
                this.add(eastSemis);

                JLabel eastFirst = new JLabel("First Round");
                eastFirst.setBounds(1560, 0, 150, 25);
                eastFirst.setFont(new Font("Impact", Font.PLAIN, 20));
                eastFirst.setVisible(true);
                this.add(eastFirst);

                //East Seeds
                JLabel firstSeed = new JLabel("1");
                firstSeed.setBounds(30, 65, 150, 25);
                firstSeed.setFont(new Font("Impact", Font.PLAIN, 20));
                firstSeed.setVisible(true);
                this.add(firstSeed);

                JLabel secondSeed = new JLabel("8");
                secondSeed.setBounds(30, 205, 150, 25);
                secondSeed.setFont(new Font("Impact", Font.PLAIN, 20));
                secondSeed.setVisible(true);
                this.add(secondSeed);

                JLabel thirdSeed = new JLabel("4");
                thirdSeed.setBounds(30, 345, 150, 25);
                thirdSeed.setFont(new Font("Impact", Font.PLAIN, 20));
                thirdSeed.setVisible(true);
                this.add(thirdSeed);

                JLabel fourthSeed = new JLabel("5");
                fourthSeed.setBounds(30, 485, 150, 25);
                fourthSeed.setFont(new Font("Impact", Font.PLAIN, 20));
                fourthSeed.setVisible(true);
                this.add(fourthSeed);

                JLabel fifthSeed = new JLabel("3");
                fifthSeed.setBounds(30, 625, 150, 25);
                fifthSeed.setFont(new Font("Impact", Font.PLAIN, 20));
                fifthSeed.setVisible(true);
                this.add(fifthSeed);

                JLabel sixthSeed = new JLabel("6");
                sixthSeed.setBounds(30, 765, 150, 25);
                sixthSeed.setFont(new Font("Impact", Font.PLAIN, 20));
                sixthSeed.setVisible(true);
                this.add(sixthSeed);

                JLabel seventhSeed = new JLabel("2");
                seventhSeed.setBounds(30, 905, 150, 25);
                seventhSeed.setFont(new Font("Impact", Font.PLAIN, 20));
                seventhSeed.setVisible(true);
                this.add(seventhSeed);

                JLabel eigthSeed = new JLabel("7");
                eigthSeed.setBounds(30, 1045, 150, 25);
                eigthSeed.setFont(new Font("Impact", Font.PLAIN, 20));
                eigthSeed.setVisible(true);
                this.add(eigthSeed);

                //West
                JLabel firstSeedWest = new JLabel("1");
                firstSeedWest.setBounds(1680, 65, 150, 25);
                firstSeedWest.setFont(new Font("Impact", Font.PLAIN, 20));
                firstSeedWest.setVisible(true);
                this.add(firstSeedWest);

                JLabel secondSeedWest = new JLabel("8");
                secondSeedWest.setBounds(1680, 205, 150, 25);
                secondSeedWest.setFont(new Font("Impact", Font.PLAIN, 20));
                secondSeedWest.setVisible(true);
                this.add(secondSeedWest);

                JLabel thirdSeedWest = new JLabel("4");
                thirdSeedWest.setBounds(1680, 345, 150, 25);
                thirdSeedWest.setFont(new Font("Impact", Font.PLAIN, 20));
                thirdSeedWest.setVisible(true);
                this.add(thirdSeedWest);

                JLabel fourthSeedWest = new JLabel("5");
                fourthSeedWest.setBounds(1680, 485, 150, 25);
                fourthSeedWest.setFont(new Font("Impact", Font.PLAIN, 20));
                fourthSeedWest.setVisible(true);
                this.add(fourthSeedWest);

                JLabel fifthSeedWest = new JLabel("3");
                fifthSeedWest.setBounds(1680, 625, 150, 25);
                fifthSeedWest.setFont(new Font("Impact", Font.PLAIN, 20));
                fifthSeedWest.setVisible(true);
                this.add(fifthSeedWest);

                JLabel sixthSeedWest = new JLabel("6");
                sixthSeedWest.setBounds(1680, 765, 150, 25);
                sixthSeedWest.setFont(new Font("Impact", Font.PLAIN, 20));
                sixthSeedWest.setVisible(true);
                this.add(sixthSeedWest);

                JLabel seventhSeedWest = new JLabel("2");
                seventhSeedWest.setBounds(1680, 905, 150, 25);
                seventhSeedWest.setFont(new Font("Impact", Font.PLAIN, 20));
                seventhSeedWest.setVisible(true);
                this.add(seventhSeedWest);

                JLabel eigthSeedWest = new JLabel("7");
                eigthSeedWest.setBounds(1680, 1045, 150, 25);
                eigthSeedWest.setFont(new Font("Impact", Font.PLAIN, 20));
                eigthSeedWest.setVisible(true);
                this.add(eigthSeedWest);


            }
        };
        playoffPanel.setBounds(0, 0, 1720, 1080);
        playoffPanel.setBackground(new Color(233, 255, 243));
        playoffPanel.setVisible(false);
        playoffPanel.setLayout(null);
        

        welcomeLabel = new JLabel("<html><body>Welcome to the Simulator! <br> &ensp; Use panel on the side!</body></html>");
        welcomeLabel.setBounds(685, 35, 700, 175);
        welcomeLabel.setFont(welcomeFont);
        welcomeLabel.setVisible(true);
        
        fkLogo = new JLabel();
        fkLogo.setBounds(575, 225, 900, 393);
        // fkLogo.setBounds(1500, 10, 383, 167);
        fkLogo.setIcon(new ImageIcon(("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\otherImages\\fk22Logo4.png")));

        box.add(welcomeLabel);
        box.add(fkLogo);



        playLabel.addMouseListener(new MouseAdapter(){
            int playCount = 0;
            @Override
            public void mouseClicked(MouseEvent evt){
                playCount++;
                if(playCount % 2 != 0){
                    teamPanel.setVisible(false);
                    tradePanel.setVisible(false);
                    teamTradePanel.setVisible(false);
                    tradePanel.removeAll();
                    teamTradePanel.removeAll();
                    teamPanel.removeAll();
                    teamPanel.revalidate();
                    teamPanel.repaint();
                    eastPanel.setVisible(false);
                    westPanel.setVisible(false);
                    fkLogo.setVisible(false);
                    welcomeLabel.setVisible(false);
                    playoffPanel.removeAll();
                    playoffPanel.setVisible(false);
                    firstRoundSeries.clear();
                    firstRoundStats.clear();
                    semiFinalsSeries.clear();
                    semiFinals.clear();
                    conferenceFinals.clear();
                    conferenceFinalsSeries.clear();
                    finals.clear();
                    finalsSeries.clear();
                    // seasonStats.clear();
                    // playerStats.clear();
                    // playoffPlayerStats.clear();
                    
                    simPanel.setVisible(true);
                    playSeason();
                    simPanel.repaint();
                    simPanel.revalidate();
                } else if(playCount % 2 == 0){
                    simPanel.removeAll();
                    simPanel.setVisible(false);
                    playPlayoffs();
                }
                
                //Stats to work correctly after season
                //Need to configure the games and season stats
                //Display a playoff bracket during playoffs (CHECK)
                //Display Stats in a certain sector of screen (Check for SEASON) GLITCH WITH STATS 
                //Possibly clear each array in use for season method to solve issue, no issue with playoffs and we use arraylist
            }

            @Override
            public void mouseEntered(MouseEvent evt){
                playLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent evt){

            }
        });

        rosterLabel.addMouseListener(new MouseAdapter(){
            int rosterCounter = 0;
            @Override
            public void mouseClicked(MouseEvent evt){
                rosterCounter++;
                tradeClick++;
                if(rosterCounter % 2 != 0){
                    teamPanel.setVisible(false);
                    tradePanel.setVisible(false);
                    teamTradePanel.setVisible(false);
                    simPanel.setVisible(false);
                    tradePanel.removeAll();
                    teamTradePanel.removeAll();
                    simPanel.removeAll();
                    teamPanel.removeAll();
                    teamPanel.revalidate();
                    teamPanel.repaint();
                    eastPanel.setVisible(false);
                    westPanel.setVisible(false);
                    fkLogo.setVisible(false);
                    fkLogo.removeAll();
                    setConference();
                } else if(rosterCounter % 2 == 0){
                    teamPanel.setVisible(false);
                    tradePanel.setVisible(false);
                    teamTradePanel.setVisible(false);
                    simPanel.setVisible(false);
                    tradePanel.removeAll();
                    teamTradePanel.removeAll();
                    simPanel.removeAll();
                    teamPanel.removeAll();
                    teamPanel.revalidate();
                    teamPanel.repaint();
                    eastPanel.setVisible(false);
                    westPanel.setVisible(false);
                    fkLogo.setVisible(false);
                    conferencePanel.setVisible(true);
                }
                
                
            }

            @Override
            public void mouseEntered(MouseEvent evt){
                rosterLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent evt){

            }
        });

        tradeLabel.addMouseListener(new MouseAdapter(){
            int num = 0;

            @Override
            public void mouseClicked(MouseEvent evt){
                num++;
                if(num % 2 != 0){
                    simPanel.setVisible(false);
                    simPanel.removeAll();
                    playoffPanel.setVisible(false);
                    playoffPanel.removeAll();
                    setUpTrade();
                } else if(num % 2 == 0){
                    teamPanel.setVisible(false);
                    tradePanel.setVisible(false);
                    simPanel.setVisible(false);
                    simPanel.removeAll();
                    playoffPanel.setVisible(false);
                    playoffPanel.removeAll();
                    teamPanel.removeAll();
                    teamPanel.revalidate();
                    teamPanel.repaint();
                    eastPanel.setVisible(false);
                    westPanel.setVisible(false);
                    fkLogo.setVisible(false);
                    teamTradePanel.removeAll();
                    tradePanel.removeAll();
                    teamTradePanel.removeAll();
                    teamTradePanel.revalidate();
                    tradePanel.revalidate();
                    for(int i = 0; i < nbaTeams.length; i++){
                        nbaTeams[i].setTradeOn(false);
                    }
                }
                
            }

            @Override
            public void mouseEntered(MouseEvent evt){
                tradeLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent evt){

            }
        });

        box.add(playLabel);
        box.add(rosterLabel);
        box.add(historyLabel);
        box.add(tradeLabel);
        box.add(freeAgencyLabel);
        box.add(extraLabel);
        box.add(contentPanel);
        box.validate();
        box.repaint();

    }


    public void setConference(){
        

        easternConferenceLogo = new JLabel();
        easternConferenceLogo.setBounds(550, 250, 300, 300);
        easternConferenceLogo.setIcon(new ImageIcon(("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\easternConference.png")));

        easternConferenceLogo.addMouseListener(new MouseAdapter(){
            
            @Override
            public void mouseClicked(MouseEvent evt){
                setEastTeams();
                
            }

            @Override
            public void mouseEntered(MouseEvent evt){
                easternConferenceLogo.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent evt){

            }
        });

        westernConferenceLogo = new JLabel();
        westernConferenceLogo.setBounds(860, 250, 300, 300);
        westernConferenceLogo.setIcon(new ImageIcon(("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\westernConference.png")));

        westernConferenceLogo.addMouseListener(new MouseAdapter(){
            
            @Override
            public void mouseClicked(MouseEvent evt){
                setWestTeams();
                
            }

            @Override
            public void mouseEntered(MouseEvent evt){
                westernConferenceLogo.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent evt){

            }
        });

        westernConferenceLogo.setVisible(true);
        easternConferenceLogo.setVisible(true);
        conferencePanel.add(easternConferenceLogo);
        conferencePanel.add(westernConferenceLogo);
        conferencePanel.setVisible(true);
        contentPanel.add(conferencePanel);
        contentPanel.revalidate();
        contentPanel.repaint();
    }

    public void setEastTeams(){
        new BoxLayout(contentPanel, 0);
        westernConferenceLogo.setVisible(false);
        easternConferenceLogo.setVisible(false);
        conferencePanel.setVisible(false);
        eastPanel.setVisible(true);

        
        phillyLogo = new JLabel();
        phillyLogo.setBounds(60, 50, 300, 300);
        phillyLogo.setIcon(new ImageIcon(("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\philly.png")));

        bucksLogo = new JLabel();
        bucksLogo.setBounds(385, 50, 300, 300);
        bucksLogo.setIcon(new ImageIcon(("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\bucks.png")));

        bullsLogo = new JLabel();
        bullsLogo.setBounds(710, 50, 300, 300);
        bullsLogo.setIcon(new ImageIcon(("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\bulls.png")));

        caveliersLogo = new JLabel();
        caveliersLogo.setBounds(1035, 50, 300, 300);
        caveliersLogo.setIcon(new ImageIcon(("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\caveliers.png")));

        celticsLogo = new JLabel();
        celticsLogo.setBounds(1360, 50, 300, 300);
        celticsLogo.setIcon(new ImageIcon(("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\celtics.png")));

        hawksLogo = new JLabel();
        hawksLogo.setBounds(60, 395, 300, 300);
        hawksLogo.setIcon(new ImageIcon(("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\hawks.png")));

        heatLogo = new JLabel();
        heatLogo.setBounds(385, 395, 300, 300);
        heatLogo.setIcon(new ImageIcon(("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\heat.png")));
        
        hornetsLogo = new JLabel();
        hornetsLogo.setBounds(710, 395, 300, 300);
        hornetsLogo.setIcon(new ImageIcon(("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\hornets.png")));

        knicksLogo = new JLabel();
        knicksLogo.setBounds(1035, 395, 300, 300);
        knicksLogo.setIcon(new ImageIcon(("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\knicks.png")));

        magicLogo = new JLabel();
        magicLogo.setBounds(1360, 395, 300, 300);
        magicLogo.setIcon(new ImageIcon(("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\magic.png")));

        netsLogo = new JLabel();
        netsLogo.setBounds(60, 740, 300, 300);
        netsLogo.setIcon(new ImageIcon(("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\nets.png")));

        pacersLogo = new JLabel();
        pacersLogo.setBounds(385, 740, 300, 300);
        pacersLogo.setIcon(new ImageIcon(("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\pacers.png")));

        pistonsLogo = new JLabel();
        pistonsLogo.setBounds(710, 740, 300, 300);
        pistonsLogo.setIcon(new ImageIcon(("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\pistons.png")));

        raptorsLogo = new JLabel();
        raptorsLogo.setBounds(1035, 740, 300, 300);
        raptorsLogo.setIcon(new ImageIcon(("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\raptors.png")));

        wizardsLogo = new JLabel();
        wizardsLogo.setBounds(1360, 740, 300, 300);
        wizardsLogo.setIcon(new ImageIcon(("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\wizards.png")));


        phillyLogo.addMouseListener(new MouseAdapter(){
            
            @Override
            public void mouseClicked(MouseEvent evt){
                System.out.println(teamNum);
                teamNum = 0;
                philly.setChamps(3);
                setTeamRoster();
                
            }

            @Override
            public void mouseEntered(MouseEvent evt){
                phillyLogo.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent evt){

            }
        });

        bucksLogo.addMouseListener(new MouseAdapter(){
            
            @Override
            public void mouseClicked(MouseEvent evt){
                teamNum = 1;
                bucks.setChamps(2);
                setTeamRoster();
                
            }

            @Override
            public void mouseEntered(MouseEvent evt){
                bucksLogo.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent evt){

            }
        });

        bullsLogo.addMouseListener(new MouseAdapter(){
            
            @Override
            public void mouseClicked(MouseEvent evt){
                teamNum = 2;
                bulls.setChamps(6);
                setTeamRoster();
                
            }

            @Override
            public void mouseEntered(MouseEvent evt){
                bullsLogo.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent evt){

            }
        });

        caveliersLogo.addMouseListener(new MouseAdapter(){
            
            @Override
            public void mouseClicked(MouseEvent evt){
                teamNum = 3;
                cavs.setChamps(1);
                setTeamRoster();
                
            }

            @Override
            public void mouseEntered(MouseEvent evt){
                caveliersLogo.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent evt){

            }
        });

        celticsLogo.addMouseListener(new MouseAdapter(){
            
            @Override
            public void mouseClicked(MouseEvent evt){
                teamNum = 4;
                celtics.setChamps(17);
                setTeamRoster();
                
            }

            @Override
            public void mouseEntered(MouseEvent evt){
                celticsLogo.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent evt){

            }
        });

        hawksLogo.addMouseListener(new MouseAdapter(){
            
            @Override
            public void mouseClicked(MouseEvent evt){
                teamNum = 5;
                hawks.setChamps(1);
                setTeamRoster();
                
            }

            @Override
            public void mouseEntered(MouseEvent evt){
                hawksLogo.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent evt){

            }
        });

        heatLogo.addMouseListener(new MouseAdapter(){
            
            @Override
            public void mouseClicked(MouseEvent evt){
                teamNum = 6;
                heat.setChamps(39);
                setTeamRoster();
                
            }

            @Override
            public void mouseEntered(MouseEvent evt){
                heatLogo.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent evt){

            }
        });

        hornetsLogo.addMouseListener(new MouseAdapter(){
            
            @Override
            public void mouseClicked(MouseEvent evt){
                teamNum = 7;
                hornets.setChamps(0);
                setTeamRoster();
                
            }

            @Override
            public void mouseEntered(MouseEvent evt){
                hornetsLogo.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent evt){

            }
        });

        knicksLogo.addMouseListener(new MouseAdapter(){
            
            @Override
            public void mouseClicked(MouseEvent evt){
                teamNum = 8;
                knicks.setChamps(2);
                setTeamRoster();
                
            }

            @Override
            public void mouseEntered(MouseEvent evt){
                knicksLogo.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent evt){

            }
        });

        magicLogo.addMouseListener(new MouseAdapter(){
            
            @Override
            public void mouseClicked(MouseEvent evt){
                teamNum = 9;
                magic.setChamps(0);
                setTeamRoster();
                
            }

            @Override
            public void mouseEntered(MouseEvent evt){
                magicLogo.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent evt){

            }
        });

        netsLogo.addMouseListener(new MouseAdapter(){
            
            @Override
            public void mouseClicked(MouseEvent evt){
                teamNum = 10;
                nets.setChamps(0);
                setTeamRoster();
                
            }

            @Override
            public void mouseEntered(MouseEvent evt){
                netsLogo.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent evt){

            }
        });

        pacersLogo.addMouseListener(new MouseAdapter(){
            
            @Override
            public void mouseClicked(MouseEvent evt){
                teamNum = 11;
                pacers.setChamps(0);
                setTeamRoster();
                
            }

            @Override
            public void mouseEntered(MouseEvent evt){
                pacersLogo.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent evt){

            }
        });

        pistonsLogo.addMouseListener(new MouseAdapter(){
            
            @Override
            public void mouseClicked(MouseEvent evt){
                teamNum = 12;
                pistons.setChamps(3);
                setTeamRoster();
                
            }

            @Override
            public void mouseEntered(MouseEvent evt){
                pistonsLogo.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent evt){

            }
        });

        raptorsLogo.addMouseListener(new MouseAdapter(){
            
            @Override
            public void mouseClicked(MouseEvent evt){
                teamNum = 13;
                raptors.setChamps(1);
                setTeamRoster();
                
            }

            @Override
            public void mouseEntered(MouseEvent evt){
                raptorsLogo.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent evt){

            }
        });

        wizardsLogo.addMouseListener(new MouseAdapter(){
            
            @Override
            public void mouseClicked(MouseEvent evt){
                teamNum = 14;
                wizards.setChamps(1);
                setTeamRoster();
                
            }

            @Override
            public void mouseEntered(MouseEvent evt){
                wizardsLogo.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent evt){

            }
        });


        JLabel[] teamsArray = {phillyLogo, bucksLogo, bullsLogo, caveliersLogo, celticsLogo, hawksLogo, heatLogo, hornetsLogo, knicksLogo, magicLogo, netsLogo, pacersLogo, pistonsLogo, raptorsLogo, wizardsLogo};

        for(JLabel x : teamsArray){
            eastPanel.add(x);
            x.setVisible(true);
        }
        eastPanel.setVisible(true);
        eastPanel.revalidate();
        eastPanel.repaint();
        contentPanel.add(eastPanel);
        contentPanel.revalidate();
        contentPanel.repaint();
    }
    //===========================================================================================================================================================

    public void setWestTeams(){
        new BoxLayout(contentPanel, 0);
        westernConferenceLogo.setVisible(false);
        easternConferenceLogo.setVisible(false);
        conferencePanel.setVisible(false);
        westPanel.setVisible(true);

        
        clippersLogo = new JLabel();
        clippersLogo.setBounds(60, 50, 300, 300);
        clippersLogo.setIcon(new ImageIcon(("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\clippers.png")));

        grizzliesLogo = new JLabel();
        grizzliesLogo.setBounds(385, 50, 300, 300);
        grizzliesLogo.setIcon(new ImageIcon(("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\grizzlies.png")));

        jazzLogo = new JLabel();
        jazzLogo.setBounds(710, 50, 300, 300);
        jazzLogo.setIcon(new ImageIcon(("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\jazz.png")));

        kingsLogo = new JLabel();
        kingsLogo.setBounds(1035, 50, 300, 300);
        kingsLogo.setIcon(new ImageIcon(("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\kings.png")));

        lakersLogo = new JLabel();
        lakersLogo.setBounds(1360, 50, 300, 300);
        lakersLogo.setIcon(new ImageIcon(("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\lakers.png")));

        mavericksLogo = new JLabel();
        mavericksLogo.setBounds(60, 395, 300, 300);
        mavericksLogo.setIcon(new ImageIcon(("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\mavericks.png")));

        nuggetsLogo = new JLabel();
        nuggetsLogo.setBounds(385, 395, 300, 300);
        nuggetsLogo.setIcon(new ImageIcon(("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\nuggets.png")));
        
        pelicansLogo = new JLabel();
        pelicansLogo.setBounds(710, 395, 300, 300);
        pelicansLogo.setIcon(new ImageIcon(("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\pelicans.png")));

        rocketsLogo = new JLabel();
        rocketsLogo.setBounds(1035, 395, 300, 300);
        rocketsLogo.setIcon(new ImageIcon(("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\rockets.png")));

        spursLogo = new JLabel();
        spursLogo.setBounds(1360, 395, 300, 300);
        spursLogo.setIcon(new ImageIcon(("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\spurs.png")));

        sunsLogo = new JLabel();
        sunsLogo.setBounds(60, 740, 300, 300);
        sunsLogo.setIcon(new ImageIcon(("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\suns.png")));

        thunderLogo = new JLabel();
        thunderLogo.setBounds(385, 740, 300, 300);
        thunderLogo.setIcon(new ImageIcon(("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\thunder.png")));

        timberwolvesLogo = new JLabel();
        timberwolvesLogo.setBounds(710, 740, 300, 300);
        timberwolvesLogo.setIcon(new ImageIcon(("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\timberwolves.png")));

        trailblazersLogo = new JLabel();
        trailblazersLogo.setBounds(1035, 740, 300, 300);
        trailblazersLogo.setIcon(new ImageIcon(("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\blazers.png")));

        warriorsLogo = new JLabel();
        warriorsLogo.setBounds(1360, 740, 300, 300);
        warriorsLogo.setIcon(new ImageIcon(("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\warriors.png")));


        clippersLogo.addMouseListener(new MouseAdapter(){
            
            @Override
            public void mouseClicked(MouseEvent evt){
                teamNum = 15;
                clippers.setChamps(0);
                setTeamRoster();
                
            }

            @Override
            public void mouseEntered(MouseEvent evt){
                clippersLogo.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent evt){

            }
        });

        grizzliesLogo.addMouseListener(new MouseAdapter(){
            
            @Override
            public void mouseClicked(MouseEvent evt){
                teamNum = 16;
                grizzlies.setChamps(0);
                setTeamRoster();
                
            }

            @Override
            public void mouseEntered(MouseEvent evt){
                grizzliesLogo.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent evt){

            }
        });

        jazzLogo.addMouseListener(new MouseAdapter(){
            
            @Override
            public void mouseClicked(MouseEvent evt){
                teamNum = 17;
                jazz.setChamps(0);
                setTeamRoster();
                
            }

            @Override
            public void mouseEntered(MouseEvent evt){
                jazzLogo.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent evt){

            }
        });

        kingsLogo.addMouseListener(new MouseAdapter(){
            
            @Override
            public void mouseClicked(MouseEvent evt){
                teamNum = 18;
                kings.setChamps(0);
                setTeamRoster();
                
            }

            @Override
            public void mouseEntered(MouseEvent evt){
                kingsLogo.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent evt){

            }
        });

        lakersLogo.addMouseListener(new MouseAdapter(){
            
            @Override
            public void mouseClicked(MouseEvent evt){
                teamNum = 19;
                lakers.setChamps(18);
                setTeamRoster();
                
            }

            @Override
            public void mouseEntered(MouseEvent evt){
                lakersLogo.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent evt){

            }
        });

        mavericksLogo.addMouseListener(new MouseAdapter(){
            
            @Override
            public void mouseClicked(MouseEvent evt){
                teamNum = 20;
                mavericks.setChamps(1);
                setTeamRoster();
                
            }

            @Override
            public void mouseEntered(MouseEvent evt){
                mavericksLogo.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent evt){

            }
        });

        nuggetsLogo.addMouseListener(new MouseAdapter(){
            
            @Override
            public void mouseClicked(MouseEvent evt){
                teamNum = 21;
                nuggets.setChamps(0);
                setTeamRoster();
                
            }

            @Override
            public void mouseEntered(MouseEvent evt){
                nuggetsLogo.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent evt){

            }
        });

        pelicansLogo.addMouseListener(new MouseAdapter(){
            
            @Override
            public void mouseClicked(MouseEvent evt){
                teamNum = 22;
                pelicans.setChamps(0);
                setTeamRoster();
                
            }

            @Override
            public void mouseEntered(MouseEvent evt){
                pelicansLogo.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent evt){

            }
        });

        rocketsLogo.addMouseListener(new MouseAdapter(){
            
            @Override
            public void mouseClicked(MouseEvent evt){
                teamNum = 23;
                rockets.setChamps(2);
                setTeamRoster();
                
            }

            @Override
            public void mouseEntered(MouseEvent evt){
                rocketsLogo.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent evt){

            }
        });

        spursLogo.addMouseListener(new MouseAdapter(){
            
            @Override
            public void mouseClicked(MouseEvent evt){
                teamNum = 24;
                spurs.setChamps(5);
                setTeamRoster();
                
            }

            @Override
            public void mouseEntered(MouseEvent evt){
                spursLogo.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent evt){

            }
        });

        sunsLogo.addMouseListener(new MouseAdapter(){
            
            @Override
            public void mouseClicked(MouseEvent evt){
                teamNum = 25;
                suns.setChamps(0);
                setTeamRoster();
                
            }

            @Override
            public void mouseEntered(MouseEvent evt){
                sunsLogo.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent evt){

            }
        });

        thunderLogo.addMouseListener(new MouseAdapter(){
            
            @Override
            public void mouseClicked(MouseEvent evt){
                teamNum = 26;
                thunder.setChamps(0);
                setTeamRoster();
                
            }

            @Override
            public void mouseEntered(MouseEvent evt){
                thunderLogo.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent evt){

            }
        });

        timberwolvesLogo.addMouseListener(new MouseAdapter(){
            
            @Override
            public void mouseClicked(MouseEvent evt){
                teamNum = 27;
                timberwolves.setChamps(0);
                setTeamRoster();
                
            }

            @Override
            public void mouseEntered(MouseEvent evt){
                timberwolvesLogo.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent evt){

            }
        });

        trailblazersLogo.addMouseListener(new MouseAdapter(){
            
            @Override
            public void mouseClicked(MouseEvent evt){
                teamNum = 28;
                blazers.setChamps(1);
                setTeamRoster();
                
            }

            @Override
            public void mouseEntered(MouseEvent evt){
                trailblazersLogo.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent evt){

            }
        });

        warriorsLogo.addMouseListener(new MouseAdapter(){
            
            @Override
            public void mouseClicked(MouseEvent evt){
                teamNum = 29;
                warriors.setChamps(6);
                setTeamRoster();
                
            }

            @Override
            public void mouseEntered(MouseEvent evt){
                warriorsLogo.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent evt){

            }
        });


        JLabel[] teamsArray = {clippersLogo, grizzliesLogo, jazzLogo, kingsLogo, lakersLogo, mavericksLogo, nuggetsLogo, pelicansLogo, rocketsLogo, spursLogo, sunsLogo, thunderLogo, timberwolvesLogo, trailblazersLogo, warriorsLogo};

        for(JLabel x : teamsArray){
            westPanel.add(x);
            x.setVisible(true);
        }
        westPanel.setVisible(true);
        westPanel.revalidate();
        westPanel.repaint();
        contentPanel.add(westPanel);
        contentPanel.revalidate();
        contentPanel.repaint();
    }

    //============================================================================================================================================================================

    //Dynamic Method for each team to set roster menu
    public void setTeamRoster(){
        JLabel[] teamsLogo = {phillyLogo, bucksLogo, bullsLogo, caveliersLogo, celticsLogo, hawksLogo, heatLogo, hornetsLogo, knicksLogo, magicLogo, netsLogo, pacersLogo, pistonsLogo, raptorsLogo, wizardsLogo};
        JLabel[] westLogos = {clippersLogo, grizzliesLogo, jazzLogo, kingsLogo, lakersLogo, mavericksLogo, nuggetsLogo, pelicansLogo, rocketsLogo, spursLogo, sunsLogo, thunderLogo, timberwolvesLogo, trailblazersLogo, warriorsLogo};


        // westernConferenceLogo.setVisible(false);
        // easternConferenceLogo.setVisible(false);
        eastPanel.setVisible(false);

        String[] columnNames = {"Name", "Position", "Score Rating", "Def. Rating", ""};
        Player[] playerArrays = nbaTeams[teamNum].getPlayerArray();
        Object[][] playerData = new Object[5][5];

        for(int i = 0; i < playerData.length; i++){
            for(int j = 0; j < 1; j++){
                playerData[i][j] = playerArrays[i].getPlayerName();
            }
            for(int j = 1; j < 2; j++){
                playerData[i][j] = playerArrays[i].getPosition();
            }
            for(int j = 2; j < 3; j++){
                playerData[i][j] = playerArrays[i].getOffensiveRating();
            }
            for(int j = 3; j < 4; j++){
                playerData[i][j] = playerArrays[i].getDefensiveRating();
            }
            for(int j = 4; j < 5; j++){
                playerData[i][j] = new ImageIcon(playerArrays[i].getPlayerFace());
            }
        }


        JTable table = new JTable(playerData, columnNames){

                    @Override
                    public Dimension getPreferredScrollableViewportSize(){
                        return new Dimension(1660 ,getRowHeight() * 5);
                    }

                    public Class getColumnClass(int column){
                        return (column == 4) ? Icon.class : Object.class;
                    }
                };


                
                JScrollPane sp = new JScrollPane(table);
                sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
                sp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
                table.setFillsViewportHeight(true);     
                table.setRowHeight(148);
                table.getColumnModel().getColumn(0).setPreferredWidth(475);
                
                for(int i = 1; i < 4; i++){
                    table.getColumnModel().getColumn(i).setPreferredWidth(5);
                }
                table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);   
                table.setEnabled(false);
                table.setBackground(new Color(220, 255, 243));
                table.setFont(welcomeFont);
                
                
                welcomeLabel.setVisible(false);

                //Sets Layout Manager as well as panel where the roster table will appear
                FlowLayout cardLayout = new FlowLayout(FlowLayout.LEADING, 25, 0);
                cardsPanel = new JPanel();
                cardsPanel.setBounds(0, 300, 1720, 880);
                cardsPanel.setBackground(new Color(230, 255, 243));
                cardsPanel.setVisible(true);
                cardsPanel.setLayout(cardLayout);

                //Sets Team Logo Label
                teamLogo = new JLabel();
                teamLogo.setBounds(0, 0, 300, 300);
                String filePath = nbaTeams[teamNum].getTeamLogo();
                teamLogo.setIcon(new ImageIcon(filePath));
                teamLogo.setVisible(true);

                

                nbaTrophy = new JLabel();
                nbaTrophy.setBounds(1000, 0, 300, 278);
                nbaTrophy.setIcon(new ImageIcon(("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\otherImages\\nbaTrophyResize.png")));
                
                totalTrophy = new JLabel("x" + nbaTeams[teamNum].getChamps());
                totalTrophy.setBounds(1235, 0, 300, 300);
                totalTrophy.setFont(new Font("Impact", Font.BOLD, 100));

                cardsPanel.add(sp);
                teamPanel.add(cardsPanel);
                teamPanel.add(teamLogo);
                teamPanel.add(nbaTrophy);
                teamPanel.add(totalTrophy);
                teamPanel.setVisible(true);
                teamPanel.revalidate();
                teamPanel.repaint();
                contentPanel.add(teamPanel);


    }

    
    //Trade Method
    public void trade(){
        setUpTrade();

    }

    public void setUpTrade(){

        
        new BoxLayout(contentPanel, 0);
        
        conferencePanel.setVisible(false);
        eastPanel.setVisible(false);
        westPanel.setVisible(false);
        teamTradePanel.setVisible(true);

        easternConferenceLogo = new JLabel();
        easternConferenceLogo.setBounds(280, 0, 300, 300);
        easternConferenceLogo.setIcon(new ImageIcon(("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\easternConference.png")));

        westernConferenceLogo = new JLabel();
        westernConferenceLogo.setBounds(1140, 0, 300, 300);
        westernConferenceLogo.setIcon(new ImageIcon(("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\westernConference.png")));

        
        

        //EastLogos
        phillyLogo = new JLabel();
        phillyLogo.setBounds(20, 300, 157, 157);
        Image phillyIcon = new ImageIcon("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\philly.png").getImage().getScaledInstance(157, 157, Image.SCALE_SMOOTH);
        phillyLogo.setIcon(new ImageIcon(phillyIcon));
        JLabel phillyButton = createOffToggleButton(86, 460, 25, 12);

        bucksLogo = new JLabel();
        bucksLogo.setBounds(185, 300, 157, 157);
        Image bucksIcon = new ImageIcon("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\bucks.png").getImage().getScaledInstance(157, 157, Image.SCALE_SMOOTH);
        bucksLogo.setIcon(new ImageIcon(bucksIcon));
        JLabel bucksButton = createOffToggleButton(248, 460, 25, 12);

        bullsLogo = new JLabel();
        bullsLogo.setBounds(350, 300, 157, 157);
        Image bullsIcon = new ImageIcon("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\bulls.png").getImage().getScaledInstance(157, 157, Image.SCALE_SMOOTH);
        bullsLogo.setIcon(new ImageIcon(bullsIcon));
        JLabel bullsButton = createOffToggleButton(412, 460, 25, 12);

        caveliersLogo = new JLabel();
        caveliersLogo.setBounds(515, 300, 157, 157);
        Image cavsIcon = new ImageIcon("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\caveliers.png").getImage().getScaledInstance(157, 157, Image.SCALE_SMOOTH);
        caveliersLogo.setIcon(new ImageIcon(cavsIcon));
        JLabel cavsButton = createOffToggleButton(576, 460, 25, 12);

        celticsLogo = new JLabel();
        celticsLogo.setBounds(680, 300, 157, 157);
        Image celticsIcon = new ImageIcon("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\celtics.png").getImage().getScaledInstance(157, 157, Image.SCALE_SMOOTH);
        celticsLogo.setIcon(new ImageIcon(celticsIcon));
        JLabel celticsButton = createOffToggleButton(740, 460, 25, 12);

        hawksLogo = new JLabel();
        hawksLogo.setBounds(20, 567, 157, 157);
        Image hawksIcon = new ImageIcon("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\hawks.png").getImage().getScaledInstance(157, 157, Image.SCALE_SMOOTH);
        hawksLogo.setIcon(new ImageIcon(hawksIcon));
        JLabel hawksButton = createOffToggleButton(86, 727, 25, 12);

        heatLogo = new JLabel();
        heatLogo.setBounds(185, 567, 157, 157);
        Image heatIcon = new ImageIcon("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\heat.png").getImage().getScaledInstance(157, 157, Image.SCALE_SMOOTH);
        heatLogo.setIcon(new ImageIcon(heatIcon));
        JLabel heatButton = createOffToggleButton(248, 727, 25, 12);

        hornetsLogo = new JLabel();
        hornetsLogo.setBounds(350, 567, 157, 157);
        Image hornetsIcon = new ImageIcon("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\hornets.png").getImage().getScaledInstance(157, 157, Image.SCALE_SMOOTH);
        hornetsLogo.setIcon(new ImageIcon(hornetsIcon));
        JLabel hornetsButton = createOffToggleButton(412, 727, 25, 12);

        knicksLogo = new JLabel();
        knicksLogo.setBounds(515, 567, 157, 157);
        Image knicksIcon = new ImageIcon("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\knicks.png").getImage().getScaledInstance(157, 157, Image.SCALE_SMOOTH);
        knicksLogo.setIcon(new ImageIcon(knicksIcon));
        JLabel knicksButton = createOffToggleButton(576, 727, 25, 12);

        magicLogo = new JLabel();
        magicLogo.setBounds(680, 567, 157, 157);
        Image magicIcon = new ImageIcon("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\magic.png").getImage().getScaledInstance(157, 157, Image.SCALE_SMOOTH);
        magicLogo.setIcon(new ImageIcon(magicIcon));
        JLabel magicButton = createOffToggleButton(740, 727, 25, 12);

        netsLogo = new JLabel();
        netsLogo.setBounds(20, 834, 157, 157);
        Image netsIcon = new ImageIcon("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\nets.png").getImage().getScaledInstance(157, 157, Image.SCALE_SMOOTH);
        netsLogo.setIcon(new ImageIcon(netsIcon));
        JLabel netsButton = createOffToggleButton(86, 990, 25, 12);

        pacersLogo = new JLabel();
        pacersLogo.setBounds(185, 834, 157, 157);
        Image pacersIcon = new ImageIcon("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\pacers.png").getImage().getScaledInstance(157, 157, Image.SCALE_SMOOTH);
        pacersLogo.setIcon(new ImageIcon(pacersIcon));
        JLabel pacersButton = createOffToggleButton(248, 990, 25, 12);

        pistonsLogo = new JLabel();
        pistonsLogo.setBounds(350, 834, 157, 157);
        Image pistonIcon = new ImageIcon("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\pistons.png").getImage().getScaledInstance(157, 157, Image.SCALE_SMOOTH);
        pistonsLogo.setIcon(new ImageIcon(pistonIcon));
        JLabel pistonsButton = createOffToggleButton(412, 990, 25, 12);

        raptorsLogo = new JLabel();
        raptorsLogo.setBounds(515, 834, 157, 157);
        Image raptorsIcon = new ImageIcon("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\raptors.png").getImage().getScaledInstance(157, 157, Image.SCALE_SMOOTH);
        raptorsLogo.setIcon(new ImageIcon(raptorsIcon));
        JLabel raptorsButton = createOffToggleButton(576, 990, 25, 12);

        wizardsLogo = new JLabel();
        wizardsLogo.setBounds(680, 834, 157, 157);
        Image wizardsIcon = new ImageIcon("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\wizards.png").getImage().getScaledInstance(157, 157, Image.SCALE_SMOOTH);
        wizardsLogo.setIcon(new ImageIcon(wizardsIcon));
        JLabel wizardsButton = createOffToggleButton(740, 990, 25, 12);
        
        

        //East Logo Methods
        
        JOptionPane.showMessageDialog(tradePanel,"Please only select TWO teams.","Alert",JOptionPane.WARNING_MESSAGE);   
        phillyLogo.addMouseListener(new MouseAdapter(){
            
            int num = 0;
            @Override
            public void mouseClicked(MouseEvent evt){
                teamNum = 0;
                num++;
                if(num % 2 != 0){
                    setSwitchOn(phillyButton, philly);
                    totalTradeNum+=1;
                    System.out.println(num%2 != 0);
                } else if(num % 2 == 0){
                    totalTradeNum-=1;
                    setSwitchOff(phillyButton, philly);
                    System.out.println(num%2 == 0);
                }
            }

            @Override
            public void mouseEntered(MouseEvent evt){
                phillyLogo.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent evt){
            }
        });
        

        bucksLogo.addMouseListener(new MouseAdapter(){
            
            int num = 0;
            @Override
            public void mouseClicked(MouseEvent evt){
                teamNum = 1;
                num++;
                if(num % 2 != 0){
                    setSwitchOn(bucksButton, bucks);
                    totalTradeNum+=1;
                    
                } else if(num % 2 == 0){
                    totalTradeNum-=1;
                    setSwitchOff(bucksButton, bucks);
                    
                }
                
            }

            @Override
            public void mouseEntered(MouseEvent evt){
                bucksLogo.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent evt){

            }
        });

        bullsLogo.addMouseListener(new MouseAdapter(){
            
            int num = 0;
            @Override
            public void mouseClicked(MouseEvent evt){
                teamNum = 2;
                num++;
                if(num % 2 != 0){
                    setSwitchOn(bullsButton, bulls);
                    totalTradeNum+=1;
                    
                } else if(num % 2 == 0){
                    setSwitchOff(bullsButton, bulls);
                    totalTradeNum-=1;
                }
                
            }

            @Override
            public void mouseEntered(MouseEvent evt){
                bullsLogo.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent evt){

            }
        });

        caveliersLogo.addMouseListener(new MouseAdapter(){
            int num = 0;
            @Override
            public void mouseClicked(MouseEvent evt){
                teamNum = 3;
                num++;
                if(num % 2 != 0){
                    setSwitchOn(cavsButton, cavs);
                    totalTradeNum+=1;
                    
                } else if(num % 2 == 0){
                    setSwitchOff(cavsButton, cavs);
                    totalTradeNum-=1;
                }
                
            }

            @Override
            public void mouseEntered(MouseEvent evt){
                caveliersLogo.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent evt){

            }
        });

        celticsLogo.addMouseListener(new MouseAdapter(){
            int num = 0;
            @Override
            public void mouseClicked(MouseEvent evt){
                teamNum = 4;
                num++;
                if(num % 2 != 0){
                    setSwitchOn(celticsButton, celtics);
                    totalTradeNum+=1;
                    System.out.println(num%2 != 0);
                } else if(num % 2 == 0){
                    totalTradeNum-=1;
                    setSwitchOff(celticsButton, celtics);
                    System.out.println(num%2 == 0);
                }
                
            }

            @Override
            public void mouseEntered(MouseEvent evt){
                celticsLogo.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent evt){

            }
        });

        hawksLogo.addMouseListener(new MouseAdapter(){
            int num = 0;
            @Override
            public void mouseClicked(MouseEvent evt){
                teamNum = 5;
                num++;
                if(num % 2 != 0){
                    setSwitchOn(hawksButton, hawks);
                    totalTradeNum+=1;
                    System.out.println(num%2 != 0);
                } else if(num % 2 == 0){
                    totalTradeNum-=1;
                    setSwitchOff(hawksButton, hawks);
                    System.out.println(num%2 == 0);
                }
                
            }

            @Override
            public void mouseEntered(MouseEvent evt){
                hawksLogo.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent evt){

            }
        });

        heatLogo.addMouseListener(new MouseAdapter(){
            int num = 0;
            @Override
            public void mouseClicked(MouseEvent evt){
                teamNum = 6;
                num++;
                if(num % 2 != 0){
                    setSwitchOn(heatButton, heat);
                } else if(num % 2 == 0){
                    setSwitchOff(heatButton, heat);
                }
                
            }

            @Override
            public void mouseEntered(MouseEvent evt){
                heatLogo.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent evt){

            }
        });

        hornetsLogo.addMouseListener(new MouseAdapter(){
            int num = 0;
            @Override
            public void mouseClicked(MouseEvent evt){
                teamNum = 7;
                num++;
                if(num % 2 != 0){
                    setSwitchOn(hornetsButton, hornets);
                } else if(num % 2 == 0){
                    setSwitchOff(hornetsButton, hornets);
                }
                
            }

            @Override
            public void mouseEntered(MouseEvent evt){
                hornetsLogo.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent evt){

            }
        });

        knicksLogo.addMouseListener(new MouseAdapter(){
            int num = 0;
            @Override
            public void mouseClicked(MouseEvent evt){
                teamNum = 8;
                num++;
                if(num % 2 != 0){
                    setSwitchOn(knicksButton, knicks);
                } else if(num % 2 == 0){
                    setSwitchOff(knicksButton, knicks);
                }
                
            }

            @Override
            public void mouseEntered(MouseEvent evt){
                knicksLogo.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent evt){

            }
        });

        magicLogo.addMouseListener(new MouseAdapter(){
            int num = 0;
            @Override
            public void mouseClicked(MouseEvent evt){
                teamNum = 9;
                num++;
                if(num % 2 != 0){
                    setSwitchOn(magicButton, magic);
                } else if(num % 2 == 0){
                    setSwitchOff(magicButton, magic);
                }
                
            }

            @Override
            public void mouseEntered(MouseEvent evt){
                magicLogo.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent evt){

            }
        });

        netsLogo.addMouseListener(new MouseAdapter(){
            int num = 0;
            @Override
            public void mouseClicked(MouseEvent evt){
                teamNum = 10;
                num++;
                if(num % 2 != 0){
                    setSwitchOn(netsButton, nets);
                } else if(num % 2 == 0){
                    setSwitchOff(netsButton, nets);
                }
                
            }

            @Override
            public void mouseEntered(MouseEvent evt){
                netsLogo.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent evt){

            }
        });

        pacersLogo.addMouseListener(new MouseAdapter(){
            int num = 0;
            @Override
            public void mouseClicked(MouseEvent evt){
                teamNum = 11;
                num++;
                if(num % 2 != 0){
                    setSwitchOn(pacersButton, pacers);
                } else if(num % 2 == 0){
                    setSwitchOff(pacersButton, pacers);
                }
                
            }

            @Override
            public void mouseEntered(MouseEvent evt){
                pacersLogo.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent evt){

            }
        });

        pistonsLogo.addMouseListener(new MouseAdapter(){
            int num = 0;
            @Override
            public void mouseClicked(MouseEvent evt){
                teamNum = 12;
                num++;
                if(num % 2 != 0){
                    setSwitchOn(pistonsButton, pistons);
                } else if(num % 2 == 0){
                    setSwitchOff(pistonsButton, pistons);
                }
                
            }

            @Override
            public void mouseEntered(MouseEvent evt){
                pistonsLogo.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent evt){

            }
        });

        raptorsLogo.addMouseListener(new MouseAdapter(){
            int num = 0;
            @Override
            public void mouseClicked(MouseEvent evt){
                teamNum = 13;
                num++;
                if(num % 2 != 0){
                    setSwitchOn(raptorsButton, raptors);
                } else if(num % 2 == 0){
                    setSwitchOff(raptorsButton, raptors);
                }
                
            }

            @Override
            public void mouseEntered(MouseEvent evt){
                raptorsLogo.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent evt){

            }
        });

        wizardsLogo.addMouseListener(new MouseAdapter(){
            int num = 0;
            @Override
            public void mouseClicked(MouseEvent evt){
                teamNum = 14;
                num++;
                if(num % 2 != 0){
                    setSwitchOn(wizardsButton, wizards);
                } else if(num % 2 == 0){
                    setSwitchOff(wizardsButton, wizards);
                }
                
            }

            @Override
            public void mouseEntered(MouseEvent evt){
                wizardsLogo.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent evt){

            }
        });
        
    
    



    //West Logos
        clippersLogo = new JLabel();
        clippersLogo.setBounds(883, 300, 157, 157);
        Image clippersIcon = new ImageIcon("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\clippers.png").getImage().getScaledInstance(157, 157, Image.SCALE_SMOOTH);
        clippersLogo.setIcon(new ImageIcon(clippersIcon));
        JLabel clippersButton = createOffToggleButton(946, 460, 25, 12);

        grizzliesLogo = new JLabel();
        grizzliesLogo.setBounds(1048, 300, 157, 157);
        Image grizzliesIcon = new ImageIcon("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\grizzlies.png").getImage().getScaledInstance(157, 157, Image.SCALE_SMOOTH);
        grizzliesLogo.setIcon(new ImageIcon(grizzliesIcon));
        JLabel grizzliesButton = createOffToggleButton(1108, 460, 25, 12);

        jazzLogo = new JLabel();
        jazzLogo.setBounds(1213, 300, 157, 157);
        Image jazzIcon = new ImageIcon("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\jazz.png").getImage().getScaledInstance(157, 157, Image.SCALE_SMOOTH);
        jazzLogo.setIcon(new ImageIcon(jazzIcon));
        JLabel jazzButton = createOffToggleButton(1272, 460, 25, 12);

        kingsLogo = new JLabel();
        kingsLogo.setBounds(1378, 300, 157, 157);
        Image kingsIcon = new ImageIcon("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\kings.png").getImage().getScaledInstance(157, 157, Image.SCALE_SMOOTH);
        kingsLogo.setIcon(new ImageIcon(kingsIcon));
        JLabel kingsButton = createOffToggleButton(1436, 460, 25, 12);

        lakersLogo = new JLabel();
        lakersLogo.setBounds(1543, 300, 157, 157);
        Image lakersIcon = new ImageIcon("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\lakers.png").getImage().getScaledInstance(157, 157, Image.SCALE_SMOOTH);
        lakersLogo.setIcon(new ImageIcon(lakersIcon));
        JLabel lakersButton = createOffToggleButton(1600, 460, 25, 12);

        mavericksLogo = new JLabel();
        mavericksLogo.setBounds(883, 567, 157, 157);
        Image mavsIcon = new ImageIcon("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\mavericks.png").getImage().getScaledInstance(157, 157, Image.SCALE_SMOOTH);
        mavericksLogo.setIcon(new ImageIcon(mavsIcon));
        JLabel mavericksButton = createOffToggleButton(946, 727, 25, 12);

        nuggetsLogo = new JLabel();
        nuggetsLogo.setBounds(1048, 567, 157, 157);
        Image nuggetsIcon = new ImageIcon("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\nuggets.png").getImage().getScaledInstance(157, 157, Image.SCALE_SMOOTH);
        nuggetsLogo.setIcon(new ImageIcon(nuggetsIcon));
        JLabel nuggetsButton = createOffToggleButton(1108, 727, 25, 12);
        
        pelicansLogo = new JLabel();
        pelicansLogo.setBounds(1213, 567, 157, 157);
        Image pelicansIcon = new ImageIcon("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\pelicans.png").getImage().getScaledInstance(157, 157, Image.SCALE_SMOOTH);
        pelicansLogo.setIcon(new ImageIcon(pelicansIcon));
        JLabel pelicansButton = createOffToggleButton(1272, 727, 25, 12);

        rocketsLogo = new JLabel();
        rocketsLogo.setBounds(1378, 567, 157, 157);
        Image rocketsIcon = new ImageIcon("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\rockets.png").getImage().getScaledInstance(157, 157, Image.SCALE_SMOOTH);
        rocketsLogo.setIcon(new ImageIcon(rocketsIcon));
        JLabel rocketsButton = createOffToggleButton(1436, 727, 25, 12);

        spursLogo = new JLabel();
        spursLogo.setBounds(1543, 567, 157, 157);
        Image spursIcon = new ImageIcon("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\spurs.png").getImage().getScaledInstance(157, 157, Image.SCALE_SMOOTH);
        spursLogo.setIcon(new ImageIcon(spursIcon));
        JLabel spursButton = createOffToggleButton(1600, 727, 25, 12);

        sunsLogo = new JLabel();
        sunsLogo.setBounds(883, 834, 157, 157);
        Image sunsIcon = new ImageIcon("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\suns.png").getImage().getScaledInstance(157, 157, Image.SCALE_SMOOTH);
        sunsLogo.setIcon(new ImageIcon(sunsIcon));
        JLabel sunsButton = createOffToggleButton(946, 990, 25, 12);

        thunderLogo = new JLabel();
        thunderLogo.setBounds(1048, 834, 157, 157);
        Image thunderIcon = new ImageIcon("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\thunder.png").getImage().getScaledInstance(157, 157, Image.SCALE_SMOOTH);
        thunderLogo.setIcon(new ImageIcon(thunderIcon));
        JLabel thunderButton = createOffToggleButton(1108, 990, 25, 12);

        timberwolvesLogo = new JLabel();
        timberwolvesLogo.setBounds(1213, 834, 157, 157);
        Image timberwolvesIcon = new ImageIcon("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\timberwolves.png").getImage().getScaledInstance(157, 157, Image.SCALE_SMOOTH);
        timberwolvesLogo.setIcon(new ImageIcon(timberwolvesIcon));
        JLabel timberwolvesButton = createOffToggleButton(1272, 990, 25, 12);

        trailblazersLogo = new JLabel();
        trailblazersLogo.setBounds(1378, 834, 157, 157);
        Image trailblazersIcon = new ImageIcon("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\blazers.png").getImage().getScaledInstance(157, 157, Image.SCALE_SMOOTH);
        trailblazersLogo.setIcon(new ImageIcon(trailblazersIcon));
        JLabel trailblazersButton = createOffToggleButton(1436, 990, 25, 12);

        warriorsLogo = new JLabel();
        warriorsLogo.setBounds(1543, 834, 157, 157);
        Image warriorsIcon = new ImageIcon("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\teamLogos\\warriors.png").getImage().getScaledInstance(157, 157, Image.SCALE_SMOOTH);
        warriorsLogo.setIcon(new ImageIcon(warriorsIcon));
        JLabel warriorsButton = createOffToggleButton(1600, 990, 25, 12);



      //West Logo Methods     
        clippersLogo.addMouseListener(new MouseAdapter(){
            int num = 0;
            @Override
            public void mouseClicked(MouseEvent evt){
                teamNum = 15;
                num++;
                if(num % 2 != 0){
                    setSwitchOn(clippersButton, clippers);
                } else if(num % 2 == 0){
                    setSwitchOff(clippersButton, clippers);
                }
                
            }

            @Override
            public void mouseEntered(MouseEvent evt){
                clippersLogo.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent evt){

            }
        });

        grizzliesLogo.addMouseListener(new MouseAdapter(){
            int num = 0;
            @Override
            public void mouseClicked(MouseEvent evt){
                teamNum = 16;
                num++;
                if(num % 2 != 0){
                    setSwitchOn(grizzliesButton, grizzlies);
                } else if(num % 2 == 0){
                    setSwitchOff(grizzliesButton, grizzlies);
                }
                
            }

            @Override
            public void mouseEntered(MouseEvent evt){
                grizzliesLogo.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent evt){

            }
        });

        jazzLogo.addMouseListener(new MouseAdapter(){
            int num = 0;
            @Override
            public void mouseClicked(MouseEvent evt){
                teamNum = 17;
                num++;
                if(num % 2 != 0){
                    setSwitchOn(jazzButton, jazz);
                } else if(num % 2 == 0){
                    setSwitchOff(jazzButton, jazz);
                }
                
            }

            @Override
            public void mouseEntered(MouseEvent evt){
                jazzLogo.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent evt){

            }
        });

        kingsLogo.addMouseListener(new MouseAdapter(){
            int num = 0;
            @Override
            public void mouseClicked(MouseEvent evt){
                teamNum = 18;
                num++;
                if(num % 2 != 0){
                    setSwitchOn(kingsButton, kings);
                } else if(num % 2 == 0){
                    setSwitchOff(kingsButton, kings);
                }
                
            }

            @Override
            public void mouseEntered(MouseEvent evt){
                kingsLogo.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent evt){

            }
        });

        lakersLogo.addMouseListener(new MouseAdapter(){
            int num = 0;
            @Override
            public void mouseClicked(MouseEvent evt){
                teamNum = 19;
                num++;
                if(num % 2 != 0){
                    setSwitchOn(lakersButton, lakers);
                } else if(num % 2 == 0){
                    setSwitchOff(lakersButton, lakers);
                }
                
            }

            @Override
            public void mouseEntered(MouseEvent evt){
                lakersLogo.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent evt){

            }
        });

        mavericksLogo.addMouseListener(new MouseAdapter(){
            int num = 0;
            @Override
            public void mouseClicked(MouseEvent evt){
                teamNum = 20;
                num++;
                if(num % 2 != 0){
                    setSwitchOn(mavericksButton, mavericks);
                } else if(num % 2 == 0){
                    setSwitchOff(mavericksButton, mavericks);
                }
                
            }

            @Override
            public void mouseEntered(MouseEvent evt){
                mavericksLogo.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent evt){

            }
        });

        nuggetsLogo.addMouseListener(new MouseAdapter(){
            int num = 0;
            @Override
            public void mouseClicked(MouseEvent evt){
                teamNum = 21;
                num++;
                if(num % 2 != 0){
                    setSwitchOn(nuggetsButton, nuggets);
                } else if(num % 2 == 0){
                    setSwitchOff(nuggetsButton, nuggets);
                }
                
            }

            @Override
            public void mouseEntered(MouseEvent evt){
                nuggetsLogo.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent evt){

            }
        });

        pelicansLogo.addMouseListener(new MouseAdapter(){
            int num = 0;
            @Override
            public void mouseClicked(MouseEvent evt){
                teamNum = 22;
                num++;
                if(num % 2 != 0){
                    setSwitchOn(pelicansButton, pelicans);
                } else if(num % 2 == 0){
                    setSwitchOff(pelicansButton, pelicans);
                }
                
            }

            @Override
            public void mouseEntered(MouseEvent evt){
                pelicansLogo.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent evt){

            }
        });

        rocketsLogo.addMouseListener(new MouseAdapter(){
            int num = 0;
            @Override
            public void mouseClicked(MouseEvent evt){
                teamNum = 23;
                num++;
                if(num % 2 != 0){
                    setSwitchOn(rocketsButton, rockets);
                } else if(num % 2 == 0){
                    setSwitchOff(rocketsButton, rockets);
                }
                
            }

            @Override
            public void mouseEntered(MouseEvent evt){
                rocketsLogo.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent evt){

            }
        });

        spursLogo.addMouseListener(new MouseAdapter(){
            int num = 0;
            @Override
            public void mouseClicked(MouseEvent evt){
                teamNum = 24;
                num++;
                if(num % 2 != 0){
                    setSwitchOn(spursButton, spurs);
                } else if(num % 2 == 0){
                    setSwitchOff(spursButton, spurs);
                }
                
            }

            @Override
            public void mouseEntered(MouseEvent evt){
                spursLogo.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent evt){

            }
        });

        sunsLogo.addMouseListener(new MouseAdapter(){
            int num = 0;
            @Override
            public void mouseClicked(MouseEvent evt){
                teamNum = 25;
                num++;
                if(num % 2 != 0){
                    setSwitchOn(sunsButton, suns);
                } else if(num % 2 == 0){
                    setSwitchOff(sunsButton, suns);
                }
                
            }

            @Override
            public void mouseEntered(MouseEvent evt){
                sunsLogo.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent evt){

            }
        });

        thunderLogo.addMouseListener(new MouseAdapter(){
            int num = 0;
            @Override
            public void mouseClicked(MouseEvent evt){
                teamNum = 26;
                num++;
                if(num % 2 != 0){
                    setSwitchOn(thunderButton, thunder);
                } else if(num % 2 == 0){
                    setSwitchOff(thunderButton, thunder);
                }
                
            }

            @Override
            public void mouseEntered(MouseEvent evt){
                thunderLogo.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent evt){

            }
        });

        timberwolvesLogo.addMouseListener(new MouseAdapter(){
            int num = 0;
            @Override
            public void mouseClicked(MouseEvent evt){
                teamNum = 27;
                num++;
                if(num % 2 != 0){
                    setSwitchOn(timberwolvesButton, timberwolves);
                } else if(num % 2 == 0){
                    setSwitchOff(timberwolvesButton, timberwolves);
                }
                
            }

            @Override
            public void mouseEntered(MouseEvent evt){
                timberwolvesLogo.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent evt){

            }
        });

        trailblazersLogo.addMouseListener(new MouseAdapter(){
            int num = 0;
            @Override
            public void mouseClicked(MouseEvent evt){
                teamNum = 28;
                num++;
                if(num % 2 != 0){
                    setSwitchOn(trailblazersButton, blazers);
                } else if(num % 2 == 0){
                    setSwitchOff(trailblazersButton, blazers);
                }
                
            }

            @Override
            public void mouseEntered(MouseEvent evt){
                trailblazersLogo.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent evt){

            }
        });

        warriorsLogo.addMouseListener(new MouseAdapter(){
            int num = 0;
            @Override
            public void mouseClicked(MouseEvent evt){
                teamNum = 29;
                num++;
                if(num % 2 != 0){
                    setSwitchOn(warriorsButton, warriors);
                } else if(num % 2 == 0){
                    setSwitchOff(warriorsButton, warriors);
                }
                
            }

            @Override
            public void mouseEntered(MouseEvent evt){
                warriorsLogo.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent evt){

            }
        });
    



        JLabel[] teamsArray = {phillyLogo, bucksLogo, bullsLogo, caveliersLogo, celticsLogo, hawksLogo, heatLogo, hornetsLogo, knicksLogo, magicLogo, netsLogo, pacersLogo, pistonsLogo, raptorsLogo, wizardsLogo, clippersLogo, grizzliesLogo, jazzLogo, kingsLogo, lakersLogo, mavericksLogo, nuggetsLogo, pelicansLogo, rocketsLogo, spursLogo, sunsLogo, thunderLogo, timberwolvesLogo, trailblazersLogo, warriorsLogo};
        
        JLabel[] buttonArray = {phillyButton, bucksButton, bullsButton, cavsButton, celticsButton, hawksButton, heatButton, hornetsButton, knicksButton, magicButton, netsButton, pacersButton, pistonsButton, raptorsButton, wizardsButton, clippersButton, grizzliesButton, jazzButton, kingsButton, lakersButton, mavericksButton, nuggetsButton, pelicansButton, rocketsButton, spursButton, sunsButton, thunderButton, timberwolvesButton, trailblazersButton, warriorsButton};
        
        for(JLabel x : teamsArray){
            teamTradePanel.add(x);
            x.setVisible(true);
        }

        for(JLabel x : buttonArray){
            teamTradePanel.add(x);
            x.setVisible(true);
        }



        JLabel lineSplit = new JLabel();
        lineSplit.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
        lineSplit.setBounds(860, 100, 1, 1080);

        tradeButton = new JLabel("TRADE");
        tradeButton.setBounds(811, 0, 100, 100);
        tradeButton.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        tradeButton.setFont(new Font("Impact", Font.BOLD, 36));
        
        
        
        tradeButton.addMouseListener(new MouseAdapter(){
            
            @Override
            public void mouseClicked(MouseEvent evt){
                setPlayerTrade();
            }

            @Override
            public void mouseEntered(MouseEvent evt){
                tradeButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent evt){

            }
        });

        tradeButton.setVisible(true);
        teamTradePanel.add(tradeButton);
        teamTradePanel.add(easternConferenceLogo);
        teamTradePanel.add(westernConferenceLogo);
        teamTradePanel.add(lineSplit);
        teamTradePanel.setVisible(true);
        teamTradePanel.revalidate();
        teamTradePanel.repaint();
        contentPanel.add(teamTradePanel);
        contentPanel.revalidate();
        contentPanel.repaint();
    }

    public void setPlayerTrade(){
        JOptionPane.showMessageDialog(tradePanel,"Please only select TWO player at a time.","Alert",JOptionPane.WARNING_MESSAGE);  
        teamTradePanel.setVisible(false);

        Team[] tradeTeams = new Team[2];
        // Team[] teamTemp = new Team[1];
        Player[] playerTemp = new Player[1];

        for(Team x: nbaTeams){
            if(x.getTradeOn() && tradeTeams[0] == null){
                tradeTeams[0] = x;
                x = null;
            } else if(x.getTradeOn() && tradeTeams[1] == null){
                tradeTeams[1] = x;
                x = null;
            }
        }

        Player[] teams1 = tradeTeams[0].getPlayerArray();
        Player[] teams2 = tradeTeams[1].getPlayerArray();

        

        //TEAM 1 TABLE ===============================================================================================================
        String[] columnNames = {"Name", "Position", "Trade?", ""};
        Object[][] playerData = new Object[5][4];
        //
        for(int i = 0; i < playerData.length; i++){
            for(int j = 0; j < 1; j++){
                playerData[i][j] = teams1[i].getPlayerName();
            }
            for(int j = 1; j < 2; j++){
                playerData[i][j] = teams1[i].getPosition();
            }
            for(int j = 2; j < 3; j++){
                playerData[i][j] = false;
            }
            for(int j = 3; j < 4; j++){
                playerData[i][j] = new ImageIcon(teams1[i].getPlayerFace());
            }
        }

        JTable table = new JTable(playerData, columnNames){

            @Override
            public Dimension getPreferredScrollableViewportSize(){
                return new Dimension(800, getRowHeight() * 5);
            }


            
            @Override
            public boolean isCellEditable(int rows, int column){
                if(column == 2){
                    return true;
                } else {
                    return false;
                }
            }
            
            public Class getColumnClass(int column){
                if(column == 3){
                    return (column == 3) ? Icon.class : Object.class;
                } else if(column == 2){
                    return Boolean.class;
                } else {
                    return String.class;
                }
                
            }

            
        };
        
        

        JScrollPane sp = new JScrollPane(table);
        sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        sp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        table.setFillsViewportHeight(true);     
        table.setFocusable(false);
        
        table.setRowHeight(148);
        table.getColumnModel().getColumn(0).setPreferredWidth(375);
        
        for(int i = 1; i < 3; i++){
            table.getColumnModel().getColumn(i).setPreferredWidth(2);
        }
        table.getColumnModel().getColumn(3).setPreferredWidth(120);
        
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);   
        
        table.setBackground(new Color(220, 255, 243));
        table.setFont(welcomeFont);
        

        FlowLayout cardLayout = new FlowLayout(FlowLayout.LEADING, 25, 0);
        cardsPanel = new JPanel();
        cardsPanel.setBounds(0, 300, 1720, 880);
        cardsPanel.setBackground(new Color(230, 255, 243));
        cardsPanel.setVisible(true);
        cardsPanel.setLayout(cardLayout);
        

        //Team 2 Table=================================================================================================
        
        String[] columnNames2 = {"Name", "Position", "Trade?", ""};
        Object[][] playerData2 = new Object[5][4];
        
        for(int i = 0; i < playerData2.length; i++){
            for(int j = 0; j < 1; j++){
                playerData2[i][j] = teams2[i].getPlayerName();
            }
            for(int j = 1; j < 2; j++){
                playerData2[i][j] = teams2[i].getPosition();
            }
            for(int j = 2; j < 3; j++){
                playerData2[i][j] = false;
            }
            for(int j = 3; j < 4; j++){
                playerData2[i][j] = new ImageIcon(teams2[i].getPlayerFace());
            }
        }

        JTable table2 = new JTable(playerData2, columnNames2){

            @Override
            public Dimension getPreferredScrollableViewportSize(){
                return new Dimension(800, getRowHeight() * 5);
            }


            
            @Override
            public boolean isCellEditable(int rows, int column){
                if(column == 2){
                    return true;
                } else {
                    return false;
                }
            }
            
            public Class getColumnClass(int column){
                if(column == 3){
                    return (column == 3) ? Icon.class : Object.class;
                } else if(column == 2){
                    return Boolean.class;
                } else {
                    return String.class;
                }
                
            }

            
        };
        
        

        JScrollPane sp2 = new JScrollPane(table2);
        sp2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        sp2.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        table2.setFillsViewportHeight(true);     
        table2.setFocusable(false);
        
        table2.setRowHeight(148);
        table2.getColumnModel().getColumn(0).setPreferredWidth(375);
        
        for(int i = 1; i < 3; i++){
            table2.getColumnModel().getColumn(i).setPreferredWidth(2);
        }
        table2.getColumnModel().getColumn(3).setPreferredWidth(120);
        
        table2.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);   
        
        table2.setBackground(new Color(220, 255, 243));
        table2.setFont(welcomeFont);
        

        FlowLayout cardLayout2 = new FlowLayout(FlowLayout.LEADING, 25, 0);
        cardsPanel2 = new JPanel();
        cardsPanel2.setBounds(860, 300, 1720, 880);
        cardsPanel2.setBackground(new Color(230, 255, 243));
        cardsPanel2.setVisible(true);
        cardsPanel2.setLayout(cardLayout2);
        
        


        JLabel lineSplit = new JLabel();
        lineSplit.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
        lineSplit.setBounds(860, 100, 1, 1080);


        confirmTrade = new JLabel("CONFIRM", SwingConstants.CENTER);
        confirmTrade.setBounds(761, 5, 200, 100);
        confirmTrade.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        confirmTrade.setAlignmentX(SwingConstants.CENTER);
        confirmTrade.setAlignmentY(SwingConstants.CENTER);
        confirmTrade.setFont(new Font("Impact", Font.BOLD, 36));
        
        
        
        confirmTrade.addMouseListener(new MouseAdapter(){
            int team1Slot = 0;
            @Override
            public void mouseClicked(MouseEvent evt){

                for(int i = 0; i < 5; i++){
                    if((boolean) table.getValueAt(i, 2)){
                        if(playerTemp[0] == null){
                           playerTemp[0] = teams1[i];
                           teams1[i] = null;
                           team1Slot = i;
                        } 
                    }   
                }

                for(int i = 0; i < 5; i++){
                    if((boolean) table2.getValueAt(i, 2)){
                        if(teams1[team1Slot] == null){
                            teams1[team1Slot] = teams2[i];
                            teams2[i] = null;
                            teams2[i] = playerTemp[0];
                            playerTemp[0] = null;
                        }
                        
                    }
                }


                tradeTeams[0].setPlayerArray(teams1);
                tradeTeams[1].setPlayerArray(teams2);

                

                for(int i = 0; i < nbaTeams.length; i++){
                    if(nbaTeams[i].getTradeOn() && nbaTeams[i] == null){
                        nbaTeams[i] = tradeTeams[0];
                    }
                }

                for(int i = 0; i < nbaTeams.length; i++){
                    if(nbaTeams[i].getTradeOn() && nbaTeams[i] == null){
                        nbaTeams[i] = tradeTeams[1];
                    }
                }

                

                for(int i = 0; i < playerData.length; i++){
                    for(int j = 0; j < 1; j++){
                        table.setValueAt(teams1[i].getPlayerName(), i, j);;
                    }
                    for(int j = 1; j < 2; j++){
                        table.setValueAt(teams1[i].getPosition(), i, j);
                    }
                    for(int j = 2; j < 3; j++){
                        table.setValueAt(false, i, j);
                    }
                    for(int j = 3; j < 4; j++){
                        table.setValueAt(new ImageIcon(teams1[i].getPlayerFace()), i, j);
                    }
                }

                for(int i = 0; i < playerData2.length; i++){
                    for(int j = 0; j < 1; j++){
                        table2.setValueAt(teams2[i].getPlayerName(), i, j);;
                    }
                    for(int j = 1; j < 2; j++){
                        table2.setValueAt(teams2[i].getPosition(), i, j);
                    }
                    for(int j = 2; j < 3; j++){
                        table2.setValueAt(false, i, j);
                    }
                    for(int j = 3; j < 4; j++){
                        table2.setValueAt(new ImageIcon(teams2[i].getPlayerFace()), i, j);
                    }
                }
                
                
                
            }

            @Override
            public void mouseEntered(MouseEvent evt){
                confirmTrade.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent evt){

            }
        });

        confirmTrade.setVisible(true);
        cardsPanel.add(sp);
        cardsPanel.add(sp2);
        tradePanel.add(cardsPanel);
        tradePanel.add(cardsPanel2);
        tradePanel.add(confirmTrade);
        tradePanel.setVisible(true);
        tradePanel.revalidate();
        tradePanel.repaint();
        contentPanel.add(tradePanel);

        


    }
    

    public JLabel createOffToggleButton(int xStarting, int yStarting, int xSize, int ySize){
        switchButton = new JLabel();
        switchButton.setBounds(xStarting, yStarting, xSize, ySize);
        Image buttonIcon = new ImageIcon("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\otherImages\\switchOffButton.png").getImage().getScaledInstance(xSize, ySize, Image.SCALE_SMOOTH);
        switchButton.setIcon(new ImageIcon(buttonIcon));
        return switchButton;
        
    }

    public void setSwitchOn(JLabel button, Team team){
        if(!team.getTradeOn()){
            Image buttonIcon = new ImageIcon("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\otherImages\\switchOnButton.png").getImage().getScaledInstance(25, 12, Image.SCALE_SMOOTH);
            button.setIcon(new ImageIcon(buttonIcon));
            team.setTradeOn(true);
            team.setTradeOn(true);
            teamTradePanel.revalidate();
            teamTradePanel.repaint();
        }
        
    }

    public void setSwitchOff(JLabel button, Team team){
        if(team.getTradeOn()){
            Image buttonIcon = new ImageIcon("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\otherImages\\switchOffButton.png").getImage().getScaledInstance(25, 12, Image.SCALE_SMOOTH);
            button.setIcon(new ImageIcon(buttonIcon));
            team.setTradeOn(false);
            team.setTradeOn(false);
            teamTradePanel.revalidate();
            teamTradePanel.repaint();
        }
    }


    //SIMULATION METHODS +++++++++++++++++++++++++++++++++++++=============================================+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++================================

    public void playSeason(){
        Sort sortArr = new Sort();

        yearLabel = new JLabel();
        yearLabel.setText(year + "-" + secondYear + " Season");
        yearLabel.setFont(new Font("Impact", Font.BOLD, 56));
        yearLabel.setBounds(375, 25, 500, 100);
        yearLabel.setVisible(true);

        Image fkIcon = new ImageIcon("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\otherImages\\fk22Logo4.png").getImage().getScaledInstance(300, 131, Image.SCALE_SMOOTH);
        fkLogo.setIcon(new ImageIcon(fkIcon));
        fkLogo.setBounds(50, 10, 300, 131);
        fkLogo.setVisible(true);
        boxScore = season.getSeasonGamesNew(playerStats, seasonStats);

        
        String[] columnNames2 = {"Game Number", "Team 1", "Score", "Team 2"};
        Object[][] playerData2 = new Object[boxScore.size()][4];
        for(int i = 0; i < playerData2.length; i++){
            
            for(int j = 0; j < 1; j++){
                playerData2[i][j] = "Game: " + (i+1);
            }
            for(int j = 1; j < 2; j++){
                playerData2[i][j] = boxScore.get(i).getTeamAbrv();
            }
            for(int j = 2; j < 3; j++){
                playerData2[i][j] = boxScore.get(i).getTeamScore();

            }
            for(int j = 3; j < 4; j++){
                playerData2[i][j] = boxScore.get(i).getTeamAbrv2();
            }
            
        }


        JTable table = new JTable(playerData2, columnNames2){
            @Override
            public Dimension getPreferredScrollableViewportSize(){
                return new Dimension(800, getRowHeight() * 5);
            }
        };
        
        JScrollPane sp2 = new JScrollPane(table);
        sp2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        sp2.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        for(int i = 0; i < 4; i++){
            table.getColumnModel().getColumn(i).setPreferredWidth(500);
        }
        table.setFillsViewportHeight(true);     
        table.setFocusable(false);
        table.setBounds(0, 0, 1400, 800);
        table.setEnabled(false);
        table.setFont(new Font("Impact", Font.BOLD, 32));
        table.setRowHeight(100);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);  
        ArrayList<String> pS = new ArrayList<String>();
        for(int i = 0; i < playerStats.size(); i++){
            for(int j = 0; j < playerStats.get(i).size(); j++){
                pS.add(playerStats.get(i).get(j));
            }
            
        }
        //SECOND TABLE (GAMES) ===========================================================================
        String[] columnNames3 = {"Game Number", "Player Pts"};
        Object[][] playerData3 = new Object[pS.size()][2];
        int numGames = 1;
        for(int i = 0; i < playerData3.length; i++){
            if(i % 10 == 0 && i != 0){
                numGames++;
            }
            for(int j = 0; j < 1; j++){
                playerData3[i][j] = "Game: " + (numGames);
            }
            for(int j = 1; j < 2; j++){
                playerData3[i][j] = pS.get(i);
            }
            
            
        }
        
        


        JTable table2 = new JTable(playerData3, columnNames3){
            @Override
            public Dimension getPreferredScrollableViewportSize(){
                return new Dimension(750, getRowHeight() * 3);
            }
        };
        
        JScrollPane sp3 = new JScrollPane(table2);
        sp3.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        sp3.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        table2.getColumnModel().getColumn(0).setPreferredWidth(150);
        table2.getColumnModel().getColumn(1).setPreferredWidth(600);
        table2.setFillsViewportHeight(true);     
        table2.setFocusable(false);
        table2.setBounds(0, 800, 1400, 100);
        table2.setEnabled(false);
        table2.setFont(new Font("Impact", Font.BOLD, 32));
        table2.setRowHeight(50);
        table2.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);  

        //THIRD TABLE (STANDINGS) ================================================================================
        String[] columnNames4 = {"Pos.", "", "Team Name", "W", "L", "D"};
        Object[][] playerData4 = new Object[nbaTeams.length][6];
        
        
        sortArr.sort(nbaTeams);

        for(int i = 0; i < playerData4.length; i++){
            for(int j = 0; j < 1; j++){
                playerData4[i][j] = "" + (i+1) + "";
            }
            for(int j = 1; j < 2; j++){
                Image nbaIcon = new ImageIcon(nbaTeams[i].getTeamLogo()).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
                playerData4[i][j] = new ImageIcon(nbaIcon);
            }
            for(int j = 2; j < 3; j++){
                playerData4[i][j] = nbaTeams[i].getTeamAbrv();
            }
            for(int j = 3; j < 4; j++){
                playerData4[i][j] = nbaTeams[i].getTeamWin();
            }
            for(int j = 4; j < 5; j++){
                playerData4[i][j] = nbaTeams[i].getTeamLoss();
            }
            for(int j = 5; j < 6; j++){
                playerData4[i][j] = nbaTeams[i].getTeamDraw();
            }
            
        }
        
        JTable table3 = new JTable(playerData4, columnNames4){
            @Override
            public Dimension getPreferredScrollableViewportSize(){
                return new Dimension(750, getRowHeight() * 5);
            }

            @Override
            public Class getColumnClass(int column){
                if(column == 1){
                    return (column == 1) ? Icon.class : Object.class;
                } else if(column == 0){
                    return Integer.class;
                } else {
                    return String.class;
                }
                
            }
        };
        
        JScrollPane sp4 = new JScrollPane(table3);
        sp4.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        sp4.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        table3.getColumnModel().getColumn(0).setPreferredWidth(75);
        
        table3.getColumnModel().getColumn(1).setPreferredWidth(150);
        for(int i = 2; i < 5; i++){
            table3.getColumnModel().getColumn(i).setPreferredWidth(125);
        }
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        table3.setDefaultRenderer(String.class, centerRenderer);
        
        table3.setFillsViewportHeight(true);     
        table3.setFocusable(false);
        table3.setBounds(860, 800, 600, 600);
        table3.setEnabled(false);
        table3.setFont(new Font("Impact", Font.BOLD, 32));
        table3.setRowHeight(100);
        table3.setLayout(new BorderLayout());
        table3.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);  


        //4th TABLE (SEASON STATS)====================================================


        String[] columnNames5 = {"Rank", "Player"};
        Object[][] playerData5 = new Object[seasonStats.size()][2];
        

        for(int i = 0; i < playerData5.length; i++){
            for(int j = 0; j < 1; j++){
                playerData5[i][j] = i+1 + "";
            }
            for(int j = 1; j < 2; j++){
                System.out.println(seasonStats.get(i));
                playerData5[i][j] = seasonStats.get(i);
            }
            
        }
        
        JTable table4 = new JTable(playerData5, columnNames5){
            @Override
            public Dimension getPreferredScrollableViewportSize(){
                return new Dimension(750, getRowHeight() * 5);
            }

            
        };
        
        JScrollPane sp5 = new JScrollPane(table4);
        sp5.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        sp5.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        table4.getColumnModel().getColumn(0).setPreferredWidth(75);
        table4.getColumnModel().getColumn(1).setPreferredWidth(525);
        DefaultTableCellRenderer centerRenderer2 = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        table4.setDefaultRenderer(String.class, centerRenderer2);
        
        table4.setFillsViewportHeight(true);     
        table4.setFocusable(false);
        table4.setBounds(1300, 800, 600, 350);
        table4.setEnabled(false);
        table4.setFont(new Font("Impact", Font.BOLD, 32));
        table4.setRowHeight(62);
        table4.setLayout(new BorderLayout());
        table4.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);  



        FlowLayout cardLayout2 = new FlowLayout(FlowLayout.LEADING, 25, 0);
        boxScorePanel = new JPanel();
        boxScorePanel.setBounds(20, 200, 840, 550);
        boxScorePanel.setBackground(new Color(230, 255, 243));
        boxScorePanel.setVisible(true);
        boxScorePanel.setLayout(cardLayout2);


        playerStatsPanel = new JPanel();
        playerStatsPanel.setLayout(new BorderLayout());
        playerStatsPanel.setBounds(45, 750, 819, 330);
        playerStatsPanel.setVisible(true);
        playerStatsPanel.setBackground(new Color(230, 255, 243));

        standingsPanel = new JPanel();
        standingsPanel.setLayout(new BorderLayout());
        standingsPanel.setBounds(930, 200, 600, 520);
        standingsPanel.setVisible(true);
        standingsPanel.setBackground(new Color(230, 255, 243));
        
        seasonStatsPanel = new JPanel();
        seasonStatsPanel.setLayout(new BorderLayout());
        seasonStatsPanel.setBounds(930, 730, 600, 350);
        seasonStatsPanel.setVisible(true);
        seasonStatsPanel.setBackground(new Color(230, 255, 243));

        boxScorePanel.add(sp2);
        playerStatsPanel.add(sp3);
        standingsPanel.add(sp4);
        seasonStatsPanel.add(sp5);
        simPanel.add(boxScorePanel);
        simPanel.add(playerStatsPanel);
        simPanel.add(standingsPanel);
        simPanel.add(seasonStatsPanel);
        simPanel.add(yearLabel);
        simPanel.add(fkLogo);
        simPanel.revalidate();
        simPanel.repaint();
        contentPanel.setVisible(true);
        contentPanel.add(simPanel);
        contentPanel.revalidate();
        contentPanel.repaint();
        
        


    } 

    public void playPlayoffs(){
        Sort sortArr = new Sort();

        yearLabel = new JLabel("");
        yearLabel.setText(year + "-" + secondYear + " Season");
        yearLabel.setFont(new Font("Impact", Font.BOLD, 32));

        Image fkIcon = new ImageIcon("C:\\Users\\frank\\Desktop\\java\\nbaSimGUI\\nbaResources\\otherImages\\fk22Logo4.png").getImage().getScaledInstance(300, 131, Image.SCALE_SMOOTH);
        fkLogo.setIcon(new ImageIcon(fkIcon));
        fkLogo.setBounds(760, 50, 300, 131);
        fkLogo.setVisible(true);

        season.getPlayoffGames(playoffPlayerStats, firstRoundStats, semiFinals, conferenceFinals, finals, firstRoundSeries, semiFinalsSeries, conferenceFinalsSeries, finalsSeries);
        
        
        //First Round
        for(int i = 0; i < firstRoundSeries.size(); i++){
            JLabel gameSeries = new JLabel("(" + firstRoundSeries.get(i) + ")");
            gameSeries.setFont(new Font("Impact", Font.PLAIN, 22));
            
            if(i == 0){
                gameSeries.setBounds(175, 60, 50, 25);
            } else if(i == 1){
                gameSeries.setBounds(175, 900, 50, 25);
            } else if(i == 2){
                gameSeries.setBounds(175, 620, 50, 25);
            } else if(i == 3){
                gameSeries.setBounds(175, 340, 50, 25);
            } else if(i == 4){
                gameSeries.setBounds(175, 480, 50, 25);
            } else if(i == 5){
                gameSeries.setBounds(175, 760, 50, 25);
            } else if(i == 6){
                gameSeries.setBounds(175, 1040, 50, 25);
            } else if(i == 7){
                gameSeries.setBounds(175, 200, 50, 25);
            } else if(i == 8){
                gameSeries.setBounds(1510, 60, 50, 25);
            } else if(i == 9){
                gameSeries.setBounds(1510, 900, 50, 25);
            } else if(i == 10){
                gameSeries.setBounds(1510, 620, 50, 25);
            } else if(i == 11){
                gameSeries.setBounds(1510, 340, 50, 25);
            } else if(i == 12){
                gameSeries.setBounds(1510, 480, 50, 25);
            } else if(i == 13){
                gameSeries.setBounds(1510, 760, 50, 25);
            } else if(i == 14){
                gameSeries.setBounds(1510, 1040, 50, 25);
            } else if(i == 15){
                gameSeries.setBounds(1510, 200, 50, 25);
            } 

            gameSeries.setVisible(true);
            playoffPanel.add(gameSeries);


        }


        for(int i = 0; i < firstRoundStats.size(); i++){
            JLabel team = new JLabel(firstRoundStats.get(i).getTeamAbrv());
            
            team.setFont(new Font("Impact", Font.BOLD, 32));
            if(i == 0){
                team.setBounds(75, 60, 150, 25);
            } else if(i == 1){
                team.setBounds(75, 900, 150, 25);
            } else if(i == 2){
                team.setBounds(75, 620, 150, 25);
            } else if(i == 3){
                team.setBounds(75, 340, 150, 25);
            } else if(i == 4){
                team.setBounds(75, 480, 150, 25);
            } else if(i == 5){
                team.setBounds(75, 760, 150, 25);
            } else if(i == 6){
                team.setBounds(75, 1040, 150, 25);
            } else if(i == 7){
                team.setBounds(75, 200, 150, 25);
            } 
            //West Teams
            else if(i == 8){
                team.setBounds(1575, 60, 150, 25);
            } else if(i == 9){
                team.setBounds(1575, 900, 150, 25);
            } else if(i == 10){
                team.setBounds(1575, 620, 150, 25);
            } else if(i == 11){
                team.setBounds(1575, 340, 150, 25);
            } else if(i == 12){
                team.setBounds(1575, 480, 150, 25);
            } else if(i == 13){
                team.setBounds(1575, 760, 150, 25);
            } else if(i == 14){
                team.setBounds(1575, 1040, 150, 25);
            } else if(i == 15){
                team.setBounds(1575, 200, 150, 25);
            }

            
            team.setVisible(true);
            playoffPanel.add(team);
        }


        //Second Round =====================================================================

        for(int i = 0; i < semiFinalsSeries.size(); i++){
            JLabel gameSeries = new JLabel("(" + semiFinalsSeries.get(i) + ")");
            gameSeries.setFont(new Font("Impact", Font.PLAIN, 22));
            
            if(i == 0){
                gameSeries.setBounds(410, 135, 50, 25);
            } else if(i == 1){
                gameSeries.setBounds(410, 975, 50, 25);
            } else if(i == 2){
                gameSeries.setBounds(410, 695, 50, 25);
            } else if(i == 3){
                gameSeries.setBounds(410, 415, 50, 25);
            } else if(i == 4){
                gameSeries.setBounds(1325, 135, 50, 25);
            } else if(i == 5){
                gameSeries.setBounds(1325, 975, 50, 25);
            } else if(i == 6){
                gameSeries.setBounds(1325, 695, 50, 25);
            } else if(i == 7){
                gameSeries.setBounds(1325, 415, 50, 25);
            } 

            gameSeries.setVisible(true);
            playoffPanel.add(gameSeries);


        }

        for(int i = 0; i < semiFinals.size(); i++){
            System.out.println(semiFinals.get(i));
            System.out.println(semiFinals.size());
            JLabel team = new JLabel(semiFinals.get(i).getTeamAbrv());
            JLabel seed = new JLabel(semiFinals.get(i).getSeed() + "");
            team.setFont(new Font("Impact", Font.BOLD, 32));
            seed.setFont(new Font("Impact", Font.PLAIN, 20));
            if(i == 0){
                seed.setBounds(225, 135, 50, 25);
                team.setBounds(270, 130, 150, 25);
            } else if(i == 1){
                seed.setBounds(225, 975, 50, 25);
                team.setBounds(270, 970, 150, 25);
            } else if(i == 2){
                seed.setBounds(225, 695, 50, 25);
                team.setBounds(270, 690, 150, 25);
            } else if(i == 3){
                seed.setBounds(225, 415, 50, 25);
                team.setBounds(270, 410, 150, 25);
            } 
            //West Teams
            else if(i == 4){
                seed.setBounds(1475, 135, 50, 25);
                team.setBounds(1405, 130, 150, 25);
            } else if(i == 5){
                seed.setBounds(1475, 975, 50, 25);
                team.setBounds(1405, 970, 150, 25);
            } else if(i == 6){
                seed.setBounds(1475, 695, 50, 25);
                team.setBounds(1405, 690, 150, 25);
            } else if(i == 7){
                seed.setBounds(1475, 415, 50, 25);
                team.setBounds(1405, 410, 150, 25);
            }
            team.setVisible(true);
            seed.setVisible(true);
            playoffPanel.add(team);
            playoffPanel.add(seed);
        }

        //Conference Finals

        for(int i = 0; i < conferenceFinalsSeries.size(); i++){
            JLabel gameSeries = new JLabel("(" + conferenceFinalsSeries.get(i) + ")");
            gameSeries.setFont(new Font("Impact", Font.PLAIN, 22));
            
            if(i == 0){
                gameSeries.setBounds(645, 275, 50, 25);
            } else if(i == 1){
                gameSeries.setBounds(645, 835, 50, 25);
            } else if(i == 2){
                gameSeries.setBounds(1145, 275, 50, 25);
            } else if(i == 3){
                gameSeries.setBounds(1145, 835, 50, 25);
            }
             

            gameSeries.setVisible(true);
            playoffPanel.add(gameSeries);


        }


        for(int i = 0; i < conferenceFinals.size(); i++){
            JLabel team = new JLabel(conferenceFinals.get(i).getTeamAbrv());
            JLabel seed = new JLabel(conferenceFinals.get(i).getSeed() + "");
            team.setFont(new Font("Impact", Font.BOLD, 32));
            seed.setFont(new Font("Impact", Font.PLAIN, 20));
            if(i == 0){
                seed.setBounds(465, 275, 50, 25);
                team.setBounds(510, 270, 150, 25);
            } else if(i == 1){
                seed.setBounds(465, 835, 50, 25);
                team.setBounds(510, 830, 150, 25);
            } else if(i == 2){
                seed.setBounds(1300, 275, 50, 25);
                team.setBounds(1225, 270, 150, 25);
            } else if(i == 3){
                seed.setBounds(1300, 835, 50, 25);
                team.setBounds(1225, 830, 150, 25);
            } 
            
            team.setVisible(true);
            seed.setVisible(true);
            playoffPanel.add(team);
            playoffPanel.add(seed);
        }

        //Finals
        for(int i = 0; i < finalsSeries.size(); i++){
            JLabel gameSeries = new JLabel("(" + finalsSeries.get(i) + ")");
            gameSeries.setFont(new Font("Impact", Font.PLAIN, 22));
            
            if(i == 0){
                gameSeries.setBounds(880, 415, 50, 25);
            } else if(i == 1){
                gameSeries.setBounds(905, 695, 50, 25);
            }
            
            gameSeries.setVisible(true);
            playoffPanel.add(gameSeries);

        }


        for(int i = 0; i < finals.size(); i++){
            JLabel team = new JLabel(finals.get(i).getTeamAbrv());
            JLabel seed = new JLabel(finals.get(i).getSeed() + "");
            team.setFont(new Font("Impact", Font.BOLD, 32));
            seed.setFont(new Font("Impact", Font.PLAIN, 20));
            if(i == 0){
                seed.setBounds(705, 415, 50, 25);
                team.setBounds(750, 410, 150, 25);
            } else if(i == 1){
                seed.setBounds(1110, 695, 50, 25);
                team.setBounds(1035, 690, 150, 25);
            }
            
            team.setVisible(true);
            seed.setVisible(true);
            playoffPanel.add(team);
            playoffPanel.add(seed);
        }
        
        simPanel.removeAll();
        playoffPanel.add(fkLogo);
        playoffPanel.setVisible(true);
        playoffPanel.revalidate();
        playoffPanel.repaint();
        contentPanel.add(playoffPanel);
        contentPanel.revalidate();
        contentPanel.repaint();

        
        
        //simPanel.add(yearLabel);
        

        



    }

}