import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main
{
	
	public static String[] choices = { "Dynamite", "Tornado", "Quicksand", "Pit", "Chain", "Gun", "Law", "Whip", "Sword", "Rock", "Death", "Wall", "Sun", "Camera", "Fire", "Chainsaw", "School", "Scissors", "Poison", "Cage", "Axe", "Peace",
			"Computer", "Castle", "Snake", "Blood", "Porcupine", "Vulture", "Monkey", "King", "Queen", "Prince", "Princess", "Police", "Woman", "Baby", "Man", "Home", "Train", "Car", "Noise", "Bicycle", "Tree", "Turnip", "Duck", "Wolf",
			"Cat", "Bird", "Fish", "Spider", "Cockroach", "Brain", "Community", "Cross", "Money", "Vampire", "Sponge", "Church", "Butter", "Book", "Paper", "Cloud", "Airplane", "Moon", "Grass", "Film", "Toilet", "Air", "Planet",
			"Guitar", "Bowl", "Cup", "Beer", "Rain", "Water", "TV", "Rainbow", "UFO", "Alien", "Prayer", "Mountain", "Satan", "Dragon", "Diamond", "Platinum", "Gold", "Devil", "Fence", "Video Game", "Math", "Robot", "Heart", "Electricity",
			"Lightning", "Medusa", "Power", "Laser", "Nuke", "Sky", "Tank", "Helicopter" };
	public static String[][] outcomes = {
			/*Dynamite Outcomes*/
			{ "outclasses Tornado", "clears Quicksand", "creates Pit", "explodes Chain", "outclasses Gun", "breaks Law", "explodes Whip", "explodes Sword", "explodes Rock", "causes Death", "explodes Wall", "smoke blots out Sun ",
					"explodes Camera", "starts Fire", "explodes Chainsaw", "explodes School", "explodes Scissors", "explodes Poison", "explodes Cage", "explodes Axe", "disturbs Peace", "explodes Computer", "explodes Castle",
					"explodes Snake", "spills Blood", "explodes Porcupine", "explodes Vulture", "explodes Monkey", "explodes King", "explodes Queen", "explodes Prince", "explodes Princess", "explodes Police", "explodes Woman",
					"explodes Baby", "explodes Man", "explodes Home", "explodes Train ", "explodes Car", "makes Noise", "explodes Bicycle", "explodes Tree", "explodes Turnip", "explodes Duck", "explodes Wolf", "explodes Cat",
					"explodes Bird", "explodes Fish", "explodes Spider", "explodes Cockroach" },
			/*Tornado Outcomes*/
			{ "outclasses Quicksand", "is Air Pit", "breaks Chain", "sweeps away Gun", "knows no Law", "sweeps away Whip", "sweeps away Sword", "sweeps away Rock", "causes Death", "destroys Wall", "blocks Sun", "challenges Camera",
					"starts Fire", "sweeps away Chainsaw", "destroys School", "sweeps away Scissors", "sweeps away Poison", "sweeps away Cage", "sweeps away Axe", "disturbs Peace", "destroys Computer", "destroys Castle",
					"sweeps away Snake", "spills Blood", "sweeps away Porcupine ", "sweeps away Vulture", "sweeps away Monkey", "sweeps away King", "sweeps away Queen", "sweeps away Prince", "sweeps away Princess", "sweeps away Police",
					"sweeps away Woman", "sweeps away Baby", "sweeps away Man", "destroys Home", "derails Train", "sweeps away Car ", "makes Noise", "sweeps away Bicycle", "sweeps away Tree", "sweeps away Turnip", "sweeps away Duck",
					"sweeps away Wolf", "sweeps away Cat", "sweeps away Bird", "sweeps away Fish", "sweeps away Spider", "wrecks Home of Cockroach", "confounds Brain" },
			/*Quicksand Outcomes*/
			{ "becomes Pit", "swallows Chain", "swallows Gun", "knows no Law", "too big for Whip", "swallows Sword", "swallows Rock", "causes Death", "protects Wall", "removes Sun", "swallows Camera", "engulfs Fire ", "swallows Chainsaw",
					"closes School", "swallows Scissors", "engulfs Poison", "surrounds Cage", "swallows Axe", "disturbs Peace", "swallows Computer", "protects Castle", "swallows Snake", "suffocates Blood", "swallows Porcupine",
					"swallows Vulture", "swallows Monkey", "swallows King", "swallows Queen", "swallows Prince", "swallows Princess", "swallows Police", "swallows Woman", "swallows Baby", "swallows Man", "ruins Home", "ruins Train (track)",
					"swallows Car", "engulfs Noise", "swallows Bicycle", "topples Tree", "swallows Turnip", "swallows Duck", "swallows Wolf", "swallows Cat", "swallows Bird (nest)", "swallows Fish", "swallows Spider", "swallows Cockroach",
					"swallows Brain", "threatens Community" },
			/*Pit Outcomes*/
			{ "swallows Chain", "swallows Gun", "knows no Law", "too deep for Whip", "swallows Sword", "swallows Rock", "causes Death", "protects Wall", "removes Sun", "swallows Camera", "contains Fire", "swallows Chainsaw",
					"endangers School", "swallows Scissors", "engulfs Poison", "becomes Cage", "swallows Axe", "disturbs Peace", "swallows Computer", "protects Castle", "swallows Snake", "contains Blood", "swallows Porcupine",
					"swallows Vulture", "swallows Monkey", "swallows King", "swallows Queen", "swallows Prince", "swallows Princess", "swallows Police", "swallows Woman", "swallows Baby", "swallows Man", "wrecks Home", "wrecks Train",
					"swallows Car", "echoes Noise", "swallows Bicycle", "prevents Tree (growth)", "swallows Turnip", "swallows Duck", "swallows Wolf", "swallows Cat", "swallows Bird (nest)", "contains Fish", "houses Spider",
					"houses Cockroach", "swallows Brain", "threatens Community", "swallows Cross " },
			/*Chain Outcomes*/
			{ "holds down Gun", "guards Law", "outclasses Whip", "nicks Sword", "pins down Rock", "chokes for Death", "protects Wall", "reflects Sun", "holds down Camera", "resists Fire", "holds down Chainsaw", "locks School",
					"dulls Scissors", "immune to Poison", "locks Cage", "nicks Axe", "keeps Peace", "smashes Computer", "locks Castle", "stronger than Snake", "constricts Blood", "restrains Porcupine", "restrains Vulture",
					"restrains Monkey", "restrains King", "restrains Queen", "restrains Prince", "restrains Princess", "restrains Police", "restrains Woman", "restrains Baby", "restrains Man", "locks Home", "holds back Train",
					"holds back Car", "clinks Noise", "locks Bicycle", "around Tree", "protects Turnip", "crushes Duck", "restrains Wolf", "restrains Cat", "crushes Bird", "smooshes Fish", "crushes Spider", "crushes Cockroach",
					"puzzles Brain", "protects Community", "holds Cross", "costs Money" },
			/*Law Outcomes*/
			{ "restricts Whip", "restricts Sword", "set in stone (Rock)", "prevents Death", "protects Wall", "explains Sun", "restricts Camera", "restricts Fire", "makes Chainsaw safe", "provides schools", "makes Scissors safe",
					"restricts Poison", "puts you in Cage", "makes Axe safe", "keeps Peace", "restricts Computer", "protects Castle", "protects Snake", "protects Blood", "protects Porcupine", "protects Vulture", "protects Monkey",
					"protects King", "protects Queen", "protects Prince", "protects Princess", "protects Police", "protects Woman", "protects Baby", "protects Man", "protects Home", "protects Train", "protects Car", "restricts Noise",
					"makes Bicycle safe", "protects Tree", "protects Turnip", "protects Duck", "protects Wolf", "protects Cat", "protects Bird", "protects Fish", "protects rare Spider", "kills Cockroach", "confounds Brain",
					"protects Community", "respects Cross", "costs Money", "chases Vampire", "cleans like Sponge" },
			/*Whip Outcomes*/
			{ "snags Sword", "shatters Rock", "causes Death", "marks up Wall", "burns like Sun", "shatters Camera", "burns like Fire", "snags Chainsaw", "terrorizes School", "snags Scissors", "shatters Poison bottle", "opens Cage door",
					"snags Axe", "disturbs Peace", "smashes Computer", "breaks into Castle", "stronger than Snake", "spills Blood", "scares Porcupine", "scares Vulture", "cracks Monkey", "tortures King", "tortures Queen", "tortures Prince",
					"tortures Princess", "thwarts Police", "tortures Woman", "scares Baby", "tortures Man", "breaks into Home", "holds up Train", "smashes Car window", "restricts Noise", "snags Bicycle", "around Tree", "splatters Turnip",
					"kills Duck", "drives Wolf", "scares Cat", "kills Bird", "kills Fish", "splatters Spider", "splatters Cockroach", "intimidates Brain", "threatens Community", "forces you onto Cross", "robs Money", "thwarts Vampire",
					"rips Sponge", "frightens Church" },
			/*Sword Outcomes*/
			{ "in the stone (Rock)", "causes Death", "scars Wall", "reflects Sun", "chops Camera", "(flaming) has Fire", "faster than Chainsaw", "terrorizes School", "outclasses Scissors", "faster than Poison", "picks Cage lock",
					"outclasses Axe", "breaks Peace", "smites Computer", "protects Castle", "chops up Snake", "spills Blood", "stabs Porcupine", "stabs Vulture", "stabs Monkey", "slays King", "slays Queen", "slays Prince", "slays Princess",
					"stabs Police", "stabs Woman", "stabs Baby", "stabs Man", "protects Home", "unhooks Train cars", "punctures Car tires", "makes Noise", "punctures Bicycle tires", "carves Tree", "cuts up Turnip", "stabs Duck",
					"slices Wolf", "dices Cat", "stabs Bird", "guts Fish", "minces Spider", "juliennes Cockroach", "chops up Brain", "protects Community", "serves Cross", "costs Money", "impales Vampire", "chops Sponge", "defends Church",
					"spreads Butter" },
			/*Rock Outcomes*/
			{ "indicates Death", "builds Wall", "shades Sun", "smashes Camera", "pounds out Fire", "dulls Chainsaw", "smashes School window", "smashes Scissors", "smashes Poison bottle", "crushes Cage lock", "chips Axe",
					"marks eternal Peace", "crushes Computer", "builds Castle", "crushes Snake", "contains Blood", "crushes Porcupine", "hits Vulture", "crushes Monkey", "crushes King", "crushes Queen", "crushes Prince", "crushes Princess",
					"crushes Police", "crushes Woman", "crushes Baby", "crushes Man", "builds Home", "blocks Train", "smashes Car window", "grinds Noise", "crushes Bicycle", "blocks Tree roots", "blocks Turnip roots", "hits Duck",
					"crushes Wolf", "crushes Cat", "hits Bird", "smooshes Fish", "squishes Spider", "squishes Cockroach", "crushes Brain", "solid Community", "supports Cross", "(rare) costs Money", "encases Vampire", "crushes Sponge",
					"smashes Church window", "splatters Butter", "crushes Book" },
			/*Death Outcomes*/
			{ "knows no Wall", "claims Sun", "ruins Camera", "cools Fire", "dismantles Chainsaw", "saddens School", "not caused by Scissors", "poisons all life", "inside Cage", "carries Axe", "- rest in Peace", "crashes Computer",
					"crumbles Castle", "claims Snake", "cools Blood", "claims Porcupine", "feeds Vulture", "claims Monkey", "claims King", "claims Queen", "claims Prince", "claims Princess", "claims Police", "claims Woman", "claims Baby",
					"claims Man", "saddens Home", "stops Train", "crashes Car", "rattle Noise", "crashes Bicycle", "claims Tree", "claims Turnip", "claims Duck", "claims Wolf", "claims Cat", "claims Bird", "claims Fish", "claims Spider",
					"claims Cockroach", "claims Brain", "saddens Community", "on the Cross", "(funeral) costs Money", "eludes Vampire", "dries Sponge", "saddens Church", "spoils Butter", "crumbles Book", "crumbles Paper" },
			/*Wall Outcomes*/
			{ "shades Sun", "blocks Camera", "blocks Fire", "too thick for Chainsaw", "supports School", "shelf holds Scissors", "not affected by Poison", "creates Cage", "resists Axe", "prevents Peace", "(firewall) protects Computer",
					"supports Castle", "blocks Snake", "shelf holds Blood", "blocks Porcupine", "blocks Vulture", "blocks Monkey", "blocks King", "blocks Queen", "blocks Prince", "blocks Princess", "blocks Police", "blocks Woman",
					"blocks Baby", "blocks Man", "supports Home", "blocks Train", "blocks Car", "blocks Noise", "blocks Bicycle", "blocks Tree roots", "blocks Turnip roots", "blocks Duck", "blocks Wolf", "blocks Cat", "blocks Bird",
					"blocks Fish", "houses Spider", "houses Cockroach", "challenges Brain", "surrounds Community", "supports Cross", "costs Money", "blocks Vampire", "too big for Sponge", "supports Church", "shelf holds Butter",
					"shelf holds Book", "shelf holds Paper", "outlasts Cloud" },
			/*Sun Outcomes*/
			{ "ruins Camera", "made of Fire", "warms Chainsaw worker", "shines on School", "melts Scissors", "not affected by Poison", "heats Cage", "melts Axe", "embodies Peace", "cooks Computer", "shines on Castle", "warms Snake",
					"warms Blood", "warms Porcupine", "warms Vulture", "warms Monkey", "warms King", "warms Queen", "warms Prince", "warms Princess", "warms Police", "warms Woman", "warms Baby", "warms Man", "warms Home", "shines on Train",
					"shines on Car", "makes no Noise", "shines on Bicycle", "feeds Tree", "feeds Turnip", "warms Duck", "warms Wolf", "warms Cat", "warms Bird", "warms Fish", "warms Spider", "warms Cockroach", "warms Brain",
					"warms Community", "shines on Cross", "saves Money", "kills Vampire", "dries up Sponge", "shines on Church", "melts Butter", "shines in Book", "shines through Paper", "burns off Cloud", "above Airplane" },
			/*Camera Outcomes*/
			{ "captures Fire", "captures Chainsaw", "captures School", "captures Scissors", "captures Poison", "captures Cage", "captures Axe", "captures Peace", "downloads onto Computer", "captures Castle", "captures Snake",
					"captures Blood", "captures Porcupine", "captures Vulture", "captures Monkey", "captures King", "captures Queen", "captures Prince", "captures Princess", "captures Police", "captures Woman", "captures Baby",
					"captures Man", "captures Home", "captures Train", "captures Car", "makes Noise", "captures Bicycle", "captures Tree", "captures Turnip", "captures Duck", "captures Wolf", "captures Cat", "captures Bird",
					"captures Fish", "captures Spider", "captures Cockroach", "captures Brain", "captures Community", "has Crosshair", "costs Money", "captures Vampire", "captures Sponge", "captures Church", "captures Butter",
					"outclasses Book", "pictures use Paper", "captures Cloud", "captures Airplane", "captures Moon" },
			/*Fire Outcomes*/
			{ "melts Chainsaw", "destroys School", "melts Scissors", "boils Poison", "melts Cage", "melts Axe", "breaks Peace", "burns Computer", "burns Castle", "burns Snake", "boils Blood", "burns Porcupine", "burns Vulture",
					"burns Monkey", "burns King", "burns Queen", "burns Prince", "burns Princess", "burns Police", "burns Woman", "burns Baby", "burns Man", "burns Home", "burns Train", "burns Car", "crackling Noise", "burns Bicycle",
					"burns down Tree", "cooks Turnip", "cooks Duck", "burns Wolf", "burns Cat", "cooks Bird", "cooks Fish", "burns Spider", "burns Cockroach", "burns Brain", "threatens Community", "burns Cross", "burns Money",
					"thwarts Vampire", "burns Sponge", "burns Church", "melts Butter", "burns Book", "burns Paper", "creates smoke Cloud", "consumes Airplane", "(campfire) by moonlight", "burns Grass" },
			/*Chainsaw Outcomes*/
			{ "destroys School", "outclasses Scissors", "more direct than Poison", "cuts through Cage", "outclasses Axe", "disturbs Peace", "gleefully ravages Computer", "ruins Castle", "chops up Snake", "splatters Blood",
					"kills Porcupine", "kills Vulture", "kills Monkey", "wounds King", "wounds Queen", "wounds Prince", "wounds Princess", "wounds Police", "wounds Woman", "scares Baby", "wounds Man", "destroys Home", "holds up Train",
					"destroys Car", "makes Noise", "destroys Bicycle", "cuts down Tree", "dices Turnip", "kills Duck", "wounds Wolf", "wounds Cat", "scares Bird", "splatters Fish", "slices Spider", "dices Cockroach", "burns Brain",
					"makes way for Community", "chops down Cross", "costs Money", "beheads Vampire", "cuts up Sponge", "terrorizes Church", "splatters Butter", "tears up Book", "tears up Paper", "produces Cloud", "terrorizes Airplane",
					"user drinks moonshine", "cuts Grass", "massacre Film" },
			/*School Outcomes*/
			{ "children use Scissors", "teaches about Poison", "is Cage for children", "makes you sharper than Axe", "requires Peace", "uses Computer", "teaches about Castle", "teaches about Snake", "teaches about Blood",
					"teaches about Porcupine", "teaches about Vulture", "teaches about Monkey", "teaches about King", "teaches about Queen", "teaches about Prince", "teaches about Princess", "trains Police", "teaches Woman", "teaches Baby",
					"teaches Man", "away from Home", "trains", "teaches Car use", "bell makes Noise", "teaches Bicycle safety", "yard has Tree", "teaches about Turnip", "teaches about Duck", "teaches about Wolf", "teaches about Cat",
					"teaches about Bird", "teaches about Fish", "houses Spider", "houses Cockroach", "nourishes Brain", "educates Community", "bans Cross", "lunch Money", "play about Vampire", "kitchen has Sponge", "ignores Church",
					"kitchen has Butter", "has Book", "makes you write Paper", "teaches about Cloud", "teaches about Airplane", "teaches about Moon", "yard has Grass", "shows Film", "has Toilet" },
			/*Scissors Outcomes*/
			{ "more direct than Poison", "pick lock of Cage", "sharper than Axe", "cut Peace symbol", "stab Computer keys", "carve into Castle", "stab Snake", "spurt Blood", "stab Porcupine", "stab Vulture", "cut Monkey's hair",
					"cut King's hair", "cut Queen's hair", "cut Prince's hair", "cut Princess' hair", "cut Police's hair", "cut Woman's hair", "cut Baby's hair", "cut Man's hair", "carve into Home", "trim dress Train", "stab Car tire",
					"make snipping Noise", "stab Bicycle tire", "carve into Tree", "cut Turnip", "stab Duck", "cut Wolf's hair", "cut Cat's hair", "stab Bird", "gut Fish", "stab Spider", "stab Cockroach", "stab Brain",
					"cut Community's hair", "carve into Cross", "cut up Money", "impale Vampire", "cut up Sponge", "carve into Church", "spread Butter", "cut up Book", "cut Paper", "swish through Cloud", "alert Airplane security",
					"reflect Moon", "cut Grass", "cut Film", "clog Toilet", "swish through Air" },
			/*Poison Outcomes*/
			{ "faster than Cage", "on Axe", "ruins Peace", "short-circuits Computer", "endangers Castle", "kills Snake", "targets Blood", "kills Porcupine", "kills Vulture", "kills Monkey", "kills King", "kills Queen", "kills Prince",
					"kills Princess", "kills Police", "kills Woman", "kills Baby", "kills Man", "endangers Home", "endangers Train", "impairs Car use", "makes no Noise", "kills Bicycle", "kills Tree", "in Turnip", "kills Duck",
					"kills Wolf", "kills Cat", "kills Bird", "kills Fish", "kills Spider", "kills Cockroach", "kills Brain", "endangers Community", "brings red Cross", "costs Money", "knocks out Vampire", "in Sponge", "endangers Church",
					"in Butter", "in Book", "soaks Paper", "in acid Rain Cloud", "endangers Airplane", "by moonlight", "kills Grass", "inspires Film", "on Toilet", "can be airborne", "endangers Planet" },
			/*Cage Outcomes*/
			{ "not affected by Axe", "keeps Peace", "contains Computer", "more fortified than Castle", "traps Snake", "boils Blood", "traps Porcupine", "traps Vulture", "traps Monkey", "traps King", "traps Queen", "traps Prince",
					"traps Princess", "traps Police", "imprisons Woman", "traps Baby", "imprisons Man", "becomes Home", "structure in Train", "(rollcage) protects Car", "door makes Noise", "contains Bicycle", "blocks Tree",
					"contains Turnip", "traps Duck", "traps Wolf", "traps Cat", "traps Bird", "traps Fish", "traps Spider", "traps Cockroach", "traps Brain", "protects Community", "makes you Cross", "costs Money", "traps Vampire",
					"knows no Sponge", "saddens Church", "has no Butter", "has no Book", "has no Paper", "Clouds freedom", "structure in Airplane", "blocks moonlight", "has no Grass", "has no Film", "has poor Toilet", "stagnates Air",
					"teaches Planet", "has no Guitar" },
			/*Axe Outcomes*/
			{ "disturbs Peace", "chops Computer", "sieges Castle", "chops Snake", "splatters Blood", "chops Porcupine", "chops Vulture", "cleaves Monkey", "cleaves King", "cleaves Queen", "cleaves Prince", "cleaves Princess",
					"cleaves Police", "cleaves Woman", "hurts Baby", "cleaves Man", "terrorizes Home", "holds up Train", "chops Car", "makes Noise", "chops Bicycle", "chops down Tree", "chops Turnip", "chops Duck", "cleaves Wolf",
					"chops Cat", "chops Bird", "chops Fish", "chops Spider", "chops Cockroach", "cleaves Brain", "clears way for Community", "chops down Cross", "costs Money", "beheads Vampire", "chops Sponge", "terrorizes Church",
					"chops Butter", "chops Book", "chops Paper", "creates Blood Cloud", "terrorizes Airplane", "reflects Moon", "chops Grass", "chops Film", "smashes Toilet", "flies through Air", "changes Planet", "chops Guitar",
					"chops Bowl" },
			/*Peace Outcomes*/
			{ "cleans up Computer", "protects Castle", "protects Snake", "spills no Blood", "protects Porcupine", "protects Vulture", "protects Monkey", "comforts King", "comforts Queen", "comforts Prince", "comforts Princess",
					"keeping Police", "comforts Woman", "protects Baby", "comforts Man", "protects Home", "protects Train", "protects Car", "without Noise", "protects Bicycle", "chops down Tree", "nurtures Turnip", "protects Duck",
					"protects Wolf", "protects Cat", "protects Bird", "protects Fish", "protects Spider", "protects Cockroach", "of mind (Brain)", "protects Community", "be with you on Cross", "saves Money", "bores Vampire",
					"cleanses like Sponge", "be with you in Church", "purifies Butter", "inspires Book", "inspires Paper", "clears Cloud", "protects Airplane", "by moonlight", "protects Grass", "allows Film", "cleans Toilet", "cleans Air",
					"saves Planet", "inspires Guitar", "cleans Bowl", "cleans Cup" },
			/*Computer Outcomes*/
			{ "depicts Castle", "depicts Snake", "boils Blood", "depicts Porcupine", "attracts Vulture", "enrages Monkey", "confuses King", "confuses Queen", "confuses Prince", "confuses Princess", "aids Police", "confuses Woman",
					"prevents Baby", "confuses Man", "in every Home", "controls Train", "enhances Car", "makes Noise", "designs Bicycle", "depicts Tree", "turns Brain into Turnip", "depicts Duck", "depicts Wolf", "depicts Cat",
					"depicts Bird", "screensaver Fish", "houses Spider", "houses Cockroach", "tires Brain", "shrinks Community", "depicts Cross", "costs Money", "attracts Vampire", "is time Sponge", "accounts for Church",
					"sexier than Butter", "writes Book", "kills Paper", "depicts Cloud", "guides Airplane", "depicts Moon", "depicts Grass", "downloads Film", "is Toilet", "measures Air", "shrinks Planet", "downloads Guitar",
					"pricier than Bowl", "pricier than Cup", "inspires Beer" },
			/*Castle Outcomes*/
			{ "houses Snake", "costs Blood", "protects Porcupine", "attracts Vulture", "houses Monkey", "houses King", "houses Queen", "houses Prince", "houses Princess", "enlists Police", "towers over Woman", "houses Baby",
					"towers over Man", "outclasses Home", "pricier than Train", "pricier than Car", "echoes Noise", "pricier than Bicycle", "taller than Tree", "contains Turnip", "contains Duck", "protects Wolf", "houses Cat",
					"houses Bird", "contains Fish", "houses Spider", "houses Cockroach", "intimidates Brain", "towers over Community", "taller than Cross", "costs Money", "houses Vampire", "is Money Sponge", "taller than Church",
					"contains Butter", "in Book", "in Paper", "in the Clouds", "pricier than Airplane", "blocks Moon", "grounds have Grass", "in Film", "has Toilet", "displaces Air", "on Planet", "contains Guitar", "contains Bowl",
					"contains Cup", "has Beer", "blocks Rain" },
			/*Snake Outcomes*/
			{ "poisons Blood", "scares Porcupine", "hides from Vulture", "bites Monkey", "bites King", "bites Queen", "bites Prince", "bites Princess", "bites Police", "bites Woman", "scares Baby", "bites Man", "creeps into Home",
					"terrorizes Train", "creeps into Car", "rattles Noise", "entangles Bicycle", "climbs Tree", "swallows Turnip", "eats Duck eggs", "bites Wolf", "bites Cat", "eats Bird eggs", "eats Fish", "eats Spider", "eats Cockroach",
					"intimidates Brain", "terrorizes Community", "climbs Cross", "swallows Money", "charms Vampire", "swallows Sponge", "creeps into Church", "eats Butter", "swallows Book", "nests in Paper", "not affected by Cloud",
					"on a Plane", "nocturnal with Moon", "in the Grass", "inspires Film", "hides in Toilet", "breathes Air", "lives on Planet", "hides in Guitar", "sleeps in Bowl", "tips over Cup", "spills Beer", "hunts despite Rain",
					"drinks Water" },
			/*Blood Outcomes*/
			{ "powers Porcupine", "powers Vulture", "powers Monkey", "powers King", "powers Queen", "powers Prince", "powers Princess", "powers Police", "powers Woman", "powers Baby", "powers Man", "stains Home", "coarses like Train",
					"stains Car", "makes no Noise", "stains Bicycle", "marks Tree", "stains Turnip", "powers Duck", "powers Wolf", "powers Cat", "powers Bird", "powers Fish", "powers Spider", "powers Cockroach", "powers Brain",
					"donations for Community", "on the Cross", "Money", "feeds Vampire", "stains Sponge", "stains Church", "stains Butter", "stains Book", "stains Paper", "red Cloud", "turns around Airplane", "red Moon", "covers Grass",
					"on Film", "fills Toilet", "consumes Air", "red Planet", "stains Guitar", "drips in Bowl", "drips in Cup", "drips in Beer", "flows like Rain", "thicker than Water", "on TV" },
			/*Porcupine Outcomes*/
			{ "pricks Vulture", "pricks Monkey", "pricks King", "pricks Queen", "pricks Prince", "pricks Princess", "pricks Police", "pricks Woman", "pricks Baby", "pricks Man", "scurries into Home", "creeps onto Train",
					"punctures Car tires", "makes no Noise", "punctures Bicycle tires", "lives among trees", "eats Turnip", "pricks Duck", "pricks Wolf", "pricks Cat", "pricks Bird", "eats Fish", "eats Spider", "eats Cockroach",
					"has Brain", "annoys Community", "makes you Cross", "shreds Money", "pricks Vampire", "catches Sponge", "scurries into Church", "licks Butter", "shreds Book", "shreds Paper", "makes fart Cloud", "terrorizes Airplane",
					"hunts by Moon", "eats Grass", "tears Film", "scrubs Toilet", "breathes Air", "lives on Planet", "sleeps in Guitar", "tips over Bowl", "tips over Cup", "spills Beer", "hunts despite Rain", "drinks Water", "on TV",
					"looks at Rainbow" },
			/*Vulture Outcomes*/
			{ "eats Monkey", "eats King", "eats Queen", "eats Prince", "eats Princess", "eats Police", "eats Woman", "eats Baby", "eats Man", "flies over Home", "flies over Train", "flies over Car", "makes no Noise", "flies over Bicycle",
					"flies over Tree", "flies over Turnip", "larger than Duck", "eats Wolf", "eats Cat", "is large Bird", "eats Fish", "eats Spider", "eats Cockroach", "has Brain", "annoys Community", "perches on Cross",
					"carries off Money", "delivers to Vampire", "carries off Sponge", "flies over Church", "eats Butter", "tears up Book", "tears up Paper", "flies among Clouds", "flies like Airplane", "hunts by Moon", "lands in Grass",
					"shreds Film", "doesn't need Toilet", "breathes Air", "lives on Planet", "scratches Guitar", "tips over Bowl", "tips over Cup", "spills Beer", "hunts despite Rain", "drinks Water", "on TV", "looks at Rainbow",
					"spots UFO" },
			/*Monkey Outcomes*/
			{ "flings poop at King", "flings poop at Queen", "flings poop at Prince", "flings poop at Princess", "flings poop at Police", "flings poop at Woman", "scares Baby", "flings poop at Man", "climbs on Home", "climbs on Train",
					"climbs on Car", "makes Noise", "climbs on Bicycle", "climbs Tree", "eats Turnip", "scares Duck", "enrages Wolf", "scares Cat", "scares Bird", "eats Fish", "eats Spider", "eats Cockroach", "has Brain",
					"irritates Community", "climbs Cross", "shreds Money", "irritates Vampire", "rips up Sponge", "climbs Church", "eats Butter", "rips up Book", "rips up Paper", "shrieks at Cloud", "flies on Airplane", "screeches at Moon",
					"sits on Grass", "rips out Film", "goes everywhere but Toilet", "breathes Air", "lives on Planet", "smashes Guitar", "smashes Bowl", "smashes Cup", "chugs Beer", "doesn't mind Rain", "drinks Water", "smashes TV",
					"glares at Rainbow", "shrieks at UFO", "infuriates Alien" },
			/*King Outcomes*/
			{ "rules over Queen", "rules over Prince", "rules over Princess", "governs Police", "rules Woman", "sires Baby", "rules Man", "taxes Home", "rides on Train", "rides in Car", "outLaws Noise", "rides Bicycle", "owns Tree",
					"eats Turnip", "eats Duck", "tames Wolf", "owns Cat", "eats Bird", "eats Fish", "steps on Spider", "steps on Cockroach", "has Brain", "rules Community", "erects Cross", "has Money", "could be Vampire", "owns Sponge",
					"funds Church", "eats Butter", "inspires Book", "writes Paper", "looks at Cloud", "flies on Airplane", "looks at Moon", "walks on Grass", "inspires Film", "uses Toilet", "breathes Air", "declares flat Planet",
					"outLaws Guitar", "eats from Bowl", "drinks from Cup", "drinks Beer", "walks in Rain", "drinks Water", "on TV", "looks at Rainbow", "disbelieves UFO", "disbelieves Alien", "in Prayer" },
			/*Queen Outcomes*/
			{ "rules over Prince", "rules over Princess", "governs Police", "rules Woman", "has Baby", "rules Man", "taxes Home", "rides on Train", "rides in Car", "outLaws Noise", "rides Bicycle", "owns Tree", "eats Turnip", "eats Duck",
					"tames Wolf", "owns Cat", "eats Bird", "eats Fish", "steps on Spider", "steps on Cockroach", "has Brain", "rules Community", "erects Cross", "has Money", "could be Vampire", "owns Sponge", "funds Church", "eats Butter",
					"inspires Book", "writes Paper", "looks at Cloud", "flies on Airplane", "looks at Moon", "walks on Grass", "inspires Film", "uses Toilet", "breathes Air", "lives on Planet", "Rocks Guitar", "eats from Bowl",
					"drinks from Cup", "drinks Beer", "walks in Rain", "drinks Water", "on TV", "looks at Rainbow", "disbelieves UFO", "disbelieves Alien", "in Prayer", "bosom is Mountain" },
			/*Prince Outcomes*/
			{ "rules over Princess", "governs Police", "rules Woman", "sires Baby", "rules Man", "lives in Home", "rides on Train", "rides in Car", "makes Noise", "rides Bicycle", "owns Tree", "eats Turnip", "eats Duck", "tames Wolf",
					"owns Cat", "eats Bird", "eats Fish", "steps on Spider", "steps on Cockroach", "has Brain", "rules Community", "wears Cross", "has Money", "could be Vampire", "owns Sponge", "attends Church", "eats Butter",
					"inspires Book", "writes Paper", "looks at Cloud", "flies on Airplane", "looks at Moon", "walks on Grass", "inspires Film", "uses Toilet", "breathes Air", "lives on Planet", "plays Guitar", "eats from Bowl",
					"drinks from Cup", "drinks Beer", "walks in Rain", "drinks Water", "on TV", "looks at Rainbow", "disbelieves UFO", "disbelieves Alien", "in Prayer", "climbs Mountain", "of darkness is Satan" },
			/*Princess Outcomes*/
			{ "governs Police", "rules Woman", "has Baby", "rules Man", "lives in Home", "rides on Train", "rides in Car", "makes Noise", "rides Bicycle", "owns Tree", "eats Turnip", "eats Duck", "tames Wolf", "owns Cat", "eats Bird",
					"eats Fish", "steps on Spider", "steps on Cockroach", "has Brain", "rules Community", "acts Cross", "has Money", "could be Vampire", "owns Sponge", "attends Church", "eats Butter", "inspires Book", "writes Paper",
					"looks at Cloud", "flies on Airplane", "looks at Moon", "walks on Grass", "inspires Film", "uses Toilet", "breathes Air", "lives on Planet", "plays Guitar", "eats from Bowl", "drinks from Cup", "drinks Beer",
					"walks in Rain", "drinks Water", "on TV", "looks at Rainbow", "disbelieves UFO", "disbelieves Alien", "in Prayer", "climbs Mountain", "enthralls Satan", "subdues Dragon" },
			/*Police Outcomes*/
			{ "arrests Woman", "saves Baby", "arrests Man", "protects Home", "commandeers Train", "impounds Car", "arrests Noisemaker", "recovers Bicycle", "climbs Tree", "eats Turnip", "eats Duck", "tranquilizes Wolf", "saves Cat",
					"eats Bird", "eats Fish", "steps on Spider", "steps on Cockroach", "has Brain", "protects Community", "acts Cross", "recovers Money", "could be Vampire", "cleans with Sponge", "patrols Church", "eats Butter",
					"Books 'em", "files Paperwork", "looks at Cloud", "flies on Airplane", "looks at Moon", "walks on Grass", "inspires Film", "uses Toilet", "breathes Air", "lives on Planet", "recovers Guitar", "eats from Bowl",
					"drinks from Cup", "drinks Beer", "works in Rain", "drinks Water", "on TV", "looks at Rainbow", "disbelieves UFO", "disbelieves Alien", "has a Prayer", "climbs Mountain", "disbelieves in Satan", "disbelieves in Dragon",
					"recovers Diamond" },
			/*Woman Outcomes*/
			{ "has Baby", "tempts Man", "lives in Home", "rides on Train", "drives Car", "makes Noise", "rides Bicycle", "plants Tree", "eats Turnip", "eats Duck", "tames Wolf", "owns Cat", "owns Bird", "owns Fish", "steps on Spider",
					"steps on Cockroach", "has Brain", "lives in Community", "acts Cross", "spends Money", "becomes Vampire", "cleans with Sponge", "attends Church", "eats Butter", "reads Book", "writes Paper", "looks at Cloud",
					"flies on Airplane", "aligns with Moon", "walks on Grass", "watches Film", "uses Toilet", "breathes Air", "lives on Planet", "plays Guitar", "eats from Bowl", "drinks from Cup", "drinks Beer", "walks in Rain",
					"drinks Water", "watches TV", "looks at Rainbow", "debunks UFO", "disproves Alien", "in Prayer", "climbs Mountain", "enthralls Satan", "tempts Dragon", "wears Diamond", "hair colored Platinum" },
			/*Baby Outcomes*/
			{ "tires Man", "lives in Home", "rides on Train", "rides in Car", "makes Noise", "carried on Bicycle", "up in a Tree", "throws Turnip", "chases Duck", "rides on Wolf", "scares Cat", "scares Bird", "eats Fish", "eats Spider",
					"eats Cockroach", "has Brain", "lives in Community", "makes parents Cross", "costs Money", "becomes Vampire", "eats Sponge", "disrupts Church", "eats Butter", "tears up Book", "rips up Paper", "makes gas Cloud",
					"annoys Airplane", "looks at Moon", "crawls in Grass", "on Film", "Toilet trained", "breathes Air", "lives on Planet", "ruins Guitar", "eats from Bowl", "drinks from Cup", "spills Beer", "plays in Rain", "drinks Water",
					"on TV", "looks at Rainbow", "draws UFO", "draws Alien", "answers Prayer", "lives on Mountain", "unaware of Satan", "subdues Dragon", "swallows Diamond", "plays with Platinum", "plays with Gold" },
			/*Man Outcomes*/
			{ "lives in Home", "rides on Train", "drives Car", "makes Noise", "rides Bicycle", "plants Tree", "eats Turnip", "eats Duck", "tames Wolf", "owns Cat", "flips Bird", "eats Fish", "steps on Spider", "steps on Cockroach",
					"has Brain", "lives in Community", "hangs on Cross", "spends Money", "becomes Vampire", "cleans with Sponge", "attends Church", "eats Butter", "reads Book", "writes Paper", "looks at Cloud", "flies on Airplane",
					"travels to Moon", "walks on Grass", "watches Film", "uses Toilet", "breathes Air", "lives on Planet", "plays Guitar", "eats from Bowl", "drinks from Cup", "drinks Beer", "plays in Rain", "drinks Water", "watches TV",
					"looks at Rainbow", "debunks UFO", "disproves Alien", "in Prayer", "climbs Mountain", "denounces Satan", "slays Dragon", "mines Diamond", "refines Platinum", "mines Gold", "exorcises Devil" },
			/*Home Outcomes*/
			{ "cozier than Train", "pricier than Car", "blocks Noise", "pricier than Bicycle", "yard has Tree", "garden has Turnip", "yard has Duck", "keeps out Wolf", "contains Cat", "contains Bird", "contains Fish", "houses Spider",
					"houses Cockroach", "requires Brains", "populates Community", "contains Cross", "costs Money", "blocks Vampire", "contains Sponge", "cozier than Church", "contains Butter", "contains Book", "contains Paper",
					"blocks Cloud", "cozier than Airplane", "blocks Moon", "yard has Grass", "in Film", "has Toilet", "has central Air", "on Planet", "contains Guitar", "contains Bowl", "contains Cup", "contains Beer", "blocks Rain",
					"plumbs Water", "has TV", "blocks Rainbow", "blocks UFO", "keeps out Alien", "answers Prayer", "atop Mountain", "denounces Satan", "blocks Dragon", "pricier than Diamond", "pricier than Platinum", "pricier than Gold",
					"envied by Devil", "has fence" },
			/*Train Outcomes*/
			{ "faster than Car", "makes Noise", "faster than Bicycle", "around Tree", "contains Turnip", "scares Duck", "scares Wolf", "scares Cat", "scares Bird", "contains Fish", "houses Spider", "houses Cockroach", "requires Brains",
					"serves Community", "Crossing", "costs Money", "outruns Vampire", "carries Sponge", "cozier than Church", "contains Butter", "contains Book", "contains Paper", "creates Cloud", "safer than Airplane", "reflects Moon",
					"whizzes through Grass", "in Film", "has Toilet", "is Air conditioned", "travels Planet", "carries Guitar", "carries Bowl", "carries Cup", "sells Beer", "blocks Rain", "plumbs Water", "has TV", "reflects Rainbow",
					"attracts UFO", "intrigues Alien", "answers Prayer", "climbs Mountain", "amuses Satan", "outruns Dragon", "pricier than Diamond", "pricier than Platinum", "pricier than Gold", "amuses Devil", "crashes through fence",
					"in Video Game" },
			/*Car Outcomes*/
			{ "makes Noise", "faster than Bicycle", "hits Tree", "carries Turnip", "hits Duck", "scares Wolf", "hits Cat", "hits Bird", "carries Fish", "houses Spider", "houses Cockroach", "requires Brains", "congests Community", "Crosses",
					"costs Money", "outruns Vampire", "is Money Sponge", "cozier than Church", "sexier than Butter", "has Book value", "has Paperwork", "creates Cloud", "to Airplane", "reflects Moon", "destroys Grass", "in Film",
					"has no Toilet", "is Air conditioned", "travels Planet", "radio plays Guitar", "carries Bowl", "has Cup holder", "makes Beer run", "drives in Rain", "coolant is Water", "can have TV", "reflects Rainbow", "attracts UFO",
					"intrigues Alien", "inspires Prayer", "climbs Mountain", "amuses Satan", "outruns Dragon", "pricier than Diamond", "pricier than Platinum", "pricier than Gold", "amuses Devil", "wrecks fence", "in Video Game",
					"to Math class" },
			/*Noise Outcomes*/
			{ "knocks over Bicycle", "in Tree", "locates Turnip", "scares Duck", "scares Wolf", "scares Cat", "scares Bird", "locates Fish", "attracts Spider", "kills Cockroach", "stimulates Brain", "annoys Community", "makes you Cross",
					"fine costs Money", "annoys Vampire", "envelops Sponge", "disrupts Church", "melts Butter", "ruins Book", "heard through Paper", "heard through Cloud", "disrupts Airplane", "travels to Moon", "in Grass", "track in Film",
					"of broken Toilet", "permeates Air", "heard across Planet", "amplified Guitar", "through Bowl", "through Cup", "inspires Beer", "heard in Rain", "across Water", "on TV", "spectrum Rainbow", "attracts UFO",
					"attracts Alien", "disrupts Prayer", "echoes across Mountain", "summons Satan", "attracts Dragon", "locates Diamond", "locates Platinum", "locates Gold", "louder than Devil", "heard over fence", "in Video Game",
					"wave Math", "navigates Robot" },
			/*Bicycle Outcomes*/
			{ "hits Tree", "runs over Turnip", "scares Duck", "outruns Wolf", "scares Cat", "scares Bird", "runs over Fish", "runs over Spider", "runs over Cockroach", "stimulates Brain", "across Community", "Crossing", "costs Money",
					"outruns Vampire", "carries Sponge", "to Church", "carries Butter", "carries Book", "delivers Paper", "makes dust Cloud", "safer than Airplane", "reflects Moon", "rides in Grass", "in Film", "has no Toilet",
					"displaces Air", "across Planet", "carries Guitar", "helmet is Bowl", "wins Cup", "inspires Beer", "rides in Rain", "splashes Water", "on TV", "reflects Rainbow", "attracts UFO", "intrigues Alien", "inspires Prayer",
					"climbs Mountain", "amuses Satan", "outruns Dragon", "shines like Diamond", "uses Platinum", "wins Gold", "faster than Devil", "hops fence", "in Video Game", "to Math class", "confuses Robot", "stimulates Heart" },
			/*Tree Outcomes*/
			{ "taller than Turnip", "shelters Duck", "shelters Wolf", "traps Cat", "houses Bird", "shelters Fish", "houses Spider", "shelters Cockroach", "has no Brain", "beautifies Community", "builds Cross", "doesn't grow Money",
					"hides Vampire", "outlives Sponge", "shades Church", "outlasts Butter", "creates Book", "creates Paper", "blocks Cloud", "diverts Airplane", "blocks Moon", "grows in Grass", "in Film", "becomes Toilet", "produces Air",
					"grows on Planet", "wood creates Guitar", "wood creates Bowl", "wood creates Cup", "inspires Beer", "loves Rain", "drinks Water", "on TV", "blocks Rainbow", "ensnares UFO", "ensnares Alien ship", "shelters Prayer",
					"grows on Mountain", "imprisons Satan", "shelters Dragon", "roots hide Diamond", "roots hide Platinum", "roots hide Gold", "imprisons Devil", "taller than fence", "wiser than Video Game", "doesn't need Math",
					"taller than Robot", "has no Heart", "conducts Electricity" },
			/*Turnip Outcomes*/
			{ "thrown at Duck", "thrown at Wolf", "thrown at Cat", "thrown at Bird", "simpler than Fish", "squashes Spider", "squashes Cockroach", "has no Brain", "feeds Community", "roots form Cross", "costs Money", "thrown at Vampire",
					"tastier than Sponge", "thrown at Church", "in Butter", "recipe Book", "stains Paper", "gas Cloud", "in Airplane food", "grows despite Moon", "grows in Grass", "stains Film", "ends up in Toilet", "odorizes Air",
					"grows on Planet", "thrown at Guitar", "stains Bowl", "stains Cup", "falls in Beer", "loves Rain", "drinks Water", "thrown at TV", "flavor Rainbow", "thrown at UFO", "disgusts Alien", "answers Prayer",
					"grows on Mountain", "disgusts Satan", "thrown at Dragon", "roots hide Diamond", "roots hide Platinum", "roots hide Gold", "disgusts Devil", "grows along fence", "healthier than Video Game", "doesn't need Math",
					"thrown at Robot", "good for Heart", "conducts Electricity", "hides from Lightning" },
			/*Duck Outcomes*/
			{ "flies from Wolf", "intimidates Cat", "larger than Bird", "eats Fish", "eats Spider", "eats Cockroach", "has Brain", "feeds Community", "acts Cross", "costs Money", "disgusts Vampire", "eats Sponge", "disrupts Church",
					"eats Butter", "recipe Book", "carries off Paper", "flies in Cloud", "blocks Airplane", "looks at Moon", "nests in Grass", "on Film", "goes everyhere but Toilet", "breathes Air", "lives on Planet", "ruins Guitar",
					"tips over Bowl", "tips over Cup", "drinks Beer", "loves Rain", "drinks Water", "on TV", "looks at Rainbow", "hides from UFO", "hides from Alien", "answers Prayer", "flies over Mountain", "doesn't interest Satan",
					"at Dragon restaurant", "swallows Diamond", "swallows Platinum", "lays Gold egg", "doesn't interest Devil", "flies over fence", "hunt Video Game", "doesn't need Math", "flies over Robot", "has Heart",
					"on wire despite Electricity", "hides from Lightning", "bites Medusa" },
			/*Wolf Outcomes*/
			{ "chases Cat", "chases Bird", "eats Fish", "eats Spider", "eats Cockroach", "has Brain", "frightens Community", "acts Cross", "steals Money", "amuses Vampire", "rips up Sponge", "disrupts Church", "eats Butter", "rips up Book",
					"rips up Paper", "creates dust Cloud", "howls at Airplane", "howls at Moon", "in Grass", "on Film", "doesn't use Toilet", "breathes Air", "lives on Planet", "bites Guitar", "drinks from Bowl", "knocks over Cup",
					"drinks Beer", "loves Rain", "drinks Water", "on TV", "howls at Rainbow", "hides from UFO", "chases Alien", "causes Prayer", "lives on Mountain", "bites Satan's heiny", "outruns Dragon", "swallows Diamond",
					"swallows Platinum", "swallows Gold", "bites Devil's heiny", "hops fence", "ravages Video Game", "doesn't need Math", "outruns Robot", "has Heart", "outruns Electricity", "outruns Lightning", "outruns Medusa",
					"has Power" },
			/*Cat Outcomes*/
			{ "chases Bird", "eats Fish", "eats Spider", "eats Cockroach", "has Brain", "amuses Community", "acts Cross", "steals Money", "entertains Vampire", "plays with Sponge", "disrupts Church", "licks Butter", "rips up Book",
					"rips up Paper", "creates dust Cloud", "rides on Airplane", "hunts by Moon", "in Grass", "on Film", "doesn't use Toilet", "breathes Air", "lives on Planet", "gut Guitar strings", "drinks from Bowl", "knocks over Cup",
					"drinks Beer", "hates Rain", "drinks Water", "sleeps on TV", "looks at Rainbow", "hides from UFO", "allergy kills Alien", "in Prayer", "lives on Mountain", "recognizes Satan", "outruns Dragon", "plays with Diamond",
					"colored Platinum", "colored Gold", "recognizes Devil", "atop fence", "hair ruins Video Game", "doesn't need Math", "outruns Robot", "has Heart", "9 lives despite Electricity", "9 lives despite Lightning",
					"outruns Medusa", "has spiritual Power", "chases Laser dot" },
			/*Bird Outcomes*/
			{ "eats Fish", "eats Spider", "eats Cockroach", "has Brain", "beautifies Community", "perches on Cross", "costs Money", "escapes Vampire", "carries off Sponge", "perches on Church", "dirties Butter", "carries off Book",
					"nests in Paper", "flies above Cloud", "flies like Airplane", "hunts by Moon", "flies over Grass", "on Film", "doesn't use Toilet", "breathes Air", "lives on Planet", "nests in Guitar", "bathes in Bowl",
					"knocks over Cup", "drinks Beer", "flies above Rain", "drinks Water", "on TV", "flies over Rainbow", "hides from UFO", "intrigues Alien", "in Prayer", "lives on Mountain", "recognizes Satan", "faster than Dragon",
					"carries off Diamond", "colored Platinum", "colored Gold", "recognizes Devil", "flies over fence", "brained Video Game", "doesn't need Math", "perches on Robot", "has Heart", "on wire despite Electricity",
					"attracts Lightning", "escapes Medusa", "has spiritual Power", "dodges Laser", "of Peace prevents Nuke" },
			/*Fish Outcomes*/
			{ "eats Spider", "eats Cockroach", "has Brain", "feeds Community", "thrown at Cross", "costs Money", "amuses Vampire", "swims over Sponge", "feeds Church", "in Butter", "recipe Book", "soaks Paper", "makes undersea Cloud",
					"feeds Airplane", "unaware of Moon", "in sea Grass", "on Film", "doesn't use Toilet", "breathes occasional Air", "lives on Planet", "soaks Guitar", "Bowl", "swims in Cup", "drinks Beer", "unaware of Rain",
					"breathes Water", "on TV", "is Rainbow trout", "hides from UFO", "intrigues Alien", "answers Prayer", "in Mountain lake", "unaware of Satan", "unaware of Dragon", "eyes like Diamonds", "colored Platinum", "colored Gold",
					"unaware of Devil", "swims under fence", "in Video Game", "doesn't need Math", "unaware of Robot", "has Heart", "dives from Electricity", "dives from Lightning", "disgusts Medusa", "has spiritual Power", "dodges Laser",
					"dodges torpedo Nuke", "unaware of Sky" },
			/*Spider Outcomes*/
			{ "bigger than Cockroach", "has Brain", "frightens Community", "crawls up Cross", "costs Money", "entertains Vampire", "nests in Sponge", "creeps into Church", "crawls across Butter", "behind Book", "crawls across Paper",
					"web like Cloud", "creeps into Airplane", "lives by Moon", "in Grass", "on Film", "hides in Toilet", "breathes Air", "lives on Planet", "hides in Guitar", "hides under Bowl", "crawls into Cup", "in your Beer",
					"doesn't mind Rain", "drinks Water", "crawls across TV", "unaware of Rainbow", "undetected by UFO", "intrigues Alien", "despite Prayer", "lives on Mountain", "amuses Satan", "amuses Dragon", "eyes like Diamonds",
					"web like Platinum", "colored Gold", "amuses Devil", "crawls over fence", "in Video Game", "doesn't need Math", "crawls over Robot", "has Heart", "hides from Electricity", "hides from Lightning", "amuses Medusa",
					"has Power of fear", "dodges Laser", "survives Nuke", "unaware of Sky", "creeps into Tank" },
			/*Cockroach Outcomes*/
			{ "has Brain", "annoys Community", "crawls up Cross", "nests in Money", "amuses Vampire", "nests in Sponge", "creeps into Church", "crawls across Butter", "behind Book", "nests between Papers", "swarms like Cloud",
					"creeps into Airplane", "nocturnal with Moon", "in Grass", "nests in Film", "hides in Toilet", "breathes Air", "lives on Planet", "hides in Guitar", "hides under Bowl", "crawls into Cup", "in your Beer",
					"doesn't mind Rain", "drinks Water", "crawls across TV", "unaware of Rainbow", "stows away with UFO", "stows away with Alien", "despite Prayer", "lives on Mountain", "amuses Satan", "eats Dragon eggs",
					"crawls across Diamonds", "crawls across Platinum", "crawls across Gold", "makes men Devils", "crawls over fence", "nests in Video Game", "doesn't need Math", "crawls over Robot", "has Heart", "hides from Electricity",
					"hides from Lightning", "amuses Medusa", "has survival Power", "too numerous for Laser", "survives Nuke", "unaware of Sky", "creeps into Tank", "creeps into Helicopter" },
			/*Brain Outcomes*/
			{ "builds Community", "envisions Cross", "desires Money", "foils Vampire", "like Sponge", "builds Church", "invents Butter", "writes Book", "writes Paper", "names Cloud", "invents Airplane", "travels to Moon",
					"landscapes Grass", "directs Film", "invents Toilet", "cleans Air", "discovers Planet", "learns Guitar", "invents Bowl", "invents Cup", "brews Beer", "adapts to Rain", "refines Water", "invents TV", "replicates Rainbow",
					"perceives UFO", "outsmarts Alien", "writes Prayer", "conquers Mountain", "invents Satan", "concocts Dragon", "desires Diamonds", "desires Platinum", "desires Gold", "invents Devil", "builds fence", "designs Video Game",
					"performs Math", "invents Robot", "regulates Heart", "conducts Electricity", "harnesses Lightning", "foils Medusa", "Power", "invents Laser", "invents Nuke", "conquers Sky", "invents Tank", "invents Helicopter",
					"invents Dynamite" },
			/*Community Outcomes*/
			{ "gathers by Cross", "makes Money", "hunts Vampire", "uses Sponge", "builds Church", "eats Butter", "library Books", "newsPaper", "population Cloud", "finances Airplane", "gathers by Moon", "gathers in Grass", "produces Film",
					"uses Toilet", "pollutes Air", "populates Planet", "plays Guitar", "uses Bowl", "uses Cup", "drinks Beer", "adapts to Rain", "pollutes Water", "watches TV", "looks at Rainbow", "spots UFO", "hunts Alien", "in Prayer",
					"lives on Mountain", "rebukes Satan", "hunts Dragon", "possesses Diamonds", "possesses Platinum", "possesses Gold", "rebukes Devil", "builds fence", "plays Video Game", "census uses Math", "uses Robots", "has Heart",
					"uses Electricity", "survives Lightning", "hunts Medusa", "uses Power", "uses Laser", "bans Nuke", "pollutes Sky", "funds Tank", "funds Helicopter", "uses Dynamite", "survives Tornado" },
			/*Cross Outcomes*/
			{ "costs Money", "thwarts Vampire", "impales Sponge", "atop Church", "impales Butter", "on good Book", "drawn on Paper", "clears Clouds", "blesses Airplane", "tracks on Moon", "erected in Grass", "on Film", "blesses Toilet",
					"winds move Air", "blesses Planet", "blesses Guitar", "blesses Bowl", "on holy Cup", "adorns Beer", "winds bring Rain", "blesses holy Water", "hangs over TV", "reflects Rainbow", "doesn't interest UFO",
					"doesn't interestAlien", "in Prayer", "atop Mountain", "denounces Satan", "denounces Dragon", "jewelry holds Diamond", "made of Platinum", "made of Gold", "denounces Devil", "tears down Fences", "platform Video Game",
					"adds for Math", "section diagram of Robot", "your Heart", "conducts Electricity", "attracts Lightning", "thwarts Medusa", "represents Power", "reflects Laser", "bans Nuke", "lights up Sky", "blesses Tank",
					"blesses Helicopter", "fingers before Dynamite", "fingers before Tornado", "above Quicksand" },
			/*Money Outcomes*/
			{ "bribes Vampire", "hires Sponge", "funds Church", "evades Butterfingers", "funds Book", "funds newsPaper", "clears Clouds", "bankrupts Airplane", "funds trip to Moon", "landscapes Grass", "funds Film", "fixes Toilet",
					"pollutes Air", "conquers Planet", "funds Guitar lessons", "fills Bowl", "fills Cup", "imports Beer", "flows like Rain", "floats on Water", "corrupts TV", "has new Rainbow colors", "doesn't interest UFO",
					"doesn't interest Alien", "answers Prayer", "buys Mountain", "brings souls to Satan", "enthralls Dragon", "mines Diamond", "is Platinum", "is Gold", "makes men Devils", "repairs fence", "develops Video Game",
					"uses Math", "funds Robot", "tricks Heart", "conducts Electricity", "vanishes like Lightning", "bribes Medusa", "brings Power", "funds Laser", "funds Nuke", "debt Sky high", "funds Tank", "funds Helicopter",
					"funds Dynamite", "for Tornado repairs", "debt is Quicksand", "Pit" },
			/*Vampire Outcomes*/
			{ "discards Sponge", "angers Church", "discards Butter", "in Book", "writes on Paper", "prefers Cloud", "flies on Airplane", "lives by Moon", "walks on Grass", "in Film", "uses Toilet", "breathes Air", "legendary across Planet",
					"plays Guitar", "discards Bowl", "discards Cup", "seduces with Beer", "stalks in Rain", "discards Water", "on TV", "never sees Rainbow", "before UFO", "before Alien", "laughs at Prayer", "flies over Mountain",
					"defines Satan", "outlives Dragon", "seduces with Diamond", "owns Platinum", "owns Gold", "defines Devil", "flies over fence", "in Video Game", "teaches Math", "before Robot", "has immortal Heart",
					"conducts Electricity", "resists Lightning", "outlives Medusa", "has great Power", "survives Laser", "survives Nuke", "flies in Sky", "survives Tank", "flies Helicopter", "survives Dynamite", "flies in Tornado",
					"flies over Quicksand", "lives in Pit", "escapes Chain" },
			/*Sponge Outcomes*/
			{ "cleans Church", "sops up Butter", "soaks Book", "soaks Paper", "denser than Cloud", "cleans Airplane", "looks like Moon", "sits on Grass", "cleans Film", "cleans Toilet", "uses Air pockets", "lives on Planet",
					"cleans Guitar", "cleans Bowl", "cleans Cup", "absorbs Beer", "absorbs Rain", "absorbs Water", "bob on TV", "creates Rainbow", "cleans UFO", "intrigues Alien", "answers Prayer", "pile Mountain", "cleanses Satan",
					"cleanses Dragon", "cleans Diamond", "cleans Platinum", "cleans Gold", "cleanses Devil", "cleans fence", "cleans Video Game", "doesn't use Math", "cleans Robot", "has no Heart", "conducts Electricity",
					"conducts Lightning", "cleanses Medusa", "has cleaning Power", "cleans Laser", "cleans Nuke", "cleans Skylight", "cleans Tank", "cleans Helicopter", "soaks Dynamite", "cleans after Tornado", "floats on Quicksand",
					"cleans Pit", "cleans Chain", "cleans Gun" },
			/*Church Outcomes*/
			{ "blesses Butter", "teaches Book", "program Paper", "dispells Cloud", "blesses Airplane", "blocks Moon", "sits on Grass", "bans Film", "has Toilet", "clears the Air", "across Planet", "bans Guitar", "has Bowl",
					"worships with Cup", "frowns on Beer", "blocks Rain", "blesses Water", "on TV", "blocks Rainbow", "disbelieves UFO", "disbelieves Alien", "in Prayer", "atop Mountain", "renounces Satan", "hunts Dragon",
					"collects Diamond", "collects Platinum", "collects Gold", "renounces Devil", "has fence", "bans Video Game", "accounts use Math", "frowns on Robot", "heals Heart", "uses Electricity", "attracts Lightning",
					"hunts Medusa", "has healing Power", "bans Laser", "bans Nuke", "lights up Sky", "bans Tank", "bans Helicopter", "survives Dynamite", "survives Tornado", "too big for Quicksand", "threatens Pit", "binds like Chain",
					"bans Gun", "creates Law" },
			/*Butter Outcomes*/
			{ "stains Book", "stains Paper", "aroma Cloud", "for Airplane food", "color of Moon", "flavors Grass", "stains Film", "ends up in Toilet", "aroma fills Air", "used across Planet", "greases Guitar", "fills Bowl", "fills Cup",
					"ruins Beer", "resists Rain", "resists Water", "smears TV", "grease Rainbow", "smears UFO", "trips Alien", "answers Prayer", "popcorn Mountain", "disgusts Satan", "disgusts Dragon", "smears Diamond", "smears Platinum",
					"smears Gold", "disgusts Devil", "stains fence", "ruins Video Game", "accounts use Math", "trips Robot", "bad for Heart", "before Electricity", "survives Lightning", "trips Medusa", "flavor Power", "smears Laser optics",
					"greases Nuke", "smears Skylight", "greases Tank", "greases Helicopter", "coats Dynamite", "taste Tornado", "floats on Quicksand", "fills hunger Pit", "greases Chain", "greases Gun", "stains Law", "greases Whip" },
			/*Book Outcomes*/
			{ "uses Paper", "about Clouds", "about airplanes", "about Moon", "about Grass", "better than Film", "entertains on Toilet", "makes musty Air", "about planets", "teaches Guitar", "about Bowls", "about cups", "about Beer",
					"blocks Rain", "jacket resists Water", "better than TV", "depicts Rainbow", "on UFOs", "about Aliens", "of Prayer", "about Mountain", "about Satan", "about Dragon", "about Diamond", "about Platinum", "about Gold",
					"about Devil", "sits on fence", "better than Video Game", "teaches Math", "about Robots", "about the Heart", "about Electricity", "about Lightning", "about Medusa", "knowledge is Power", "about Lasers", "about Nukes",
					"explains Sky", "about Tanks", "about Helicopters", "explains Dynamite", "explains Tornado", "story has Quicksand", "fills boredom Pit", "starts Chain reaction", "about Guns", "of Law", "makes you smart as Whip",
					"about Swords" },
			/*Paper Outcomes*/
			{ "fans Cloud", "Airplane", "Moon", "covers Grass", "reviews Film", "Toilet cover", "fans Air", "about planets", "wraps Guitar", "mache Bowl", "Cup", "Beer label", "blocks Rain", "floats on Water", "more info than TV",
					"cutout of Rainbow", "disproves UFO", "disproves Alien", "contains Prayer", "pile Mountain", "rebukes Satan", "rebukes Dragon", "receipt for Diamond", "note for Platinum", "note for Gold", "rebukes Devil",
					"thrown over fence", "label for Video Game", "tests Math", "describes Robot", "cutout of Heart", "defines Electricity", "defines Lightning", "about Medusa", "about Power", "defines Laser", "defines Nuke",
					"confetti fills Sky", "about Tanks", "about Helicopters", "encases Dynamite", "predicts Tornado", "floats on Quicksand", "covers Pit", "starts Chain reaction", "outLaws Gun", "explains Law", "wraps Whip", "wraps Sword",
					"covers Rock" },
			/*Cloud Outcomes*/
			{ "diverts Airplane", "blocks Moon", "over Grass", "ruins Film", "surrounds Toilet", "made of Air", "covers Planet", "adorns Guitar", "rains in Bowl", "rains in Cup", "rains in Beer", "produces Rain", "contains Water", "on TV",
					"blocks Rainbow", "blocks UFO", "blocks Alien ship", "despite Prayer", "over Mountain", "indicates Satan", "over Dragon", "over Diamond", "over Platinum", "over Gold", "indicates Devil", "over fence", "in Video Game",
					"cancels Math class", "over Robot", "makes Heart doubtful", "conducts Electricity", "brings Lightning", "over Medusa", "disrupts solar Power", "not affected by Laser", "diverts Nuke", "decorates Sky", "over Tank",
					"over Helicopter", "rains on Dynamite", "becomes Tornado", "over Quicksand", "over Pit", "starts Chain reaction", "too far for Gun", "knows no Law", "over Whip", "over Sword", "over Rock", "indicates Death" },
			/*Airplane Outcomes*/
			{ "eclipses Moon", "flies over Grass", "shows Film", "has Toilet", "flies through Air", "travels Planet", "carries Guitar", "carries Bowl", "carries Cup", "serves Beer", "flies over Rain", "has Water", "has TV",
					"flies over Rainbow", "spots UFO", "spots Alien ship", "inspires Prayer", "flies over Mountain", "scarier than Satan", "faster than Dragon", "pricier than Diamond", "pricier than Platinum", "pricier than Gold",
					"scarier than Devil", "flies over fence", "in Video Game", "pilot uses Math", "has Robot pilot", "stops Heart", "uses Electricity", "attracts Lightning", "flies over Medusa", "consumes Power", "carries Laser",
					"carries Nuke", "traverses Sky", "flies over Tank", "outflies Helicopter", "flies over Dynamite", "flies over Tornado", "flies over Quicksand", "flies over Pit", "flies over Chain", "bans Gun", "has many Laws",
					"bans Whip", "bans Sword", "flies over Rock", "can cause Death", "flies over Wall" },
			/*Moon Outcomes*/
			{ "has no Grass", "in Film", "has no Toilet", "has no Air", "orbits Planet", "adorns Guitar", "shaped like Bowl", "-shine in Cup", "-shine stronger than Beer", "far above Rain", "has no Water", "on TV", "far above Rainbow",
					"houses UFO", "houses Alien", "shines on Prayer", "far above Mountain", "confuses Satan", "shines on Dragon", "shines like Diamond", "colored Platinum", "colored Gold", "terrifies Devil", "far above fence",
					"patrol Video Game", "lander uses Math", "lander uses Robotics", "-light walk with sweetHeart", "has no Electricity", "far above Lightning", "far above Medusa", "visit uses Power", "too far for Laser",
					"too far for Nuke", "adorns Sky", "far above Tank", "too far for Helicopter", "suffocates Dynamite", "far above Tornado", "far above Quicksand", "crater Pit", "far above Chain", "too far for Gun", "has no Laws",
					"far above Whip", "adorns Sword", "is giant Rock", "symbolizes Death", "far above Wall", "eclipses Sun" },
			/*Grass Outcomes*/
			{ "blurry in Film", "becomes Toilet", "produces Air", "covers Planet", "inspires Guitar", "fills Bowl", "hides Cup", "stronger than Beer", "loves Rain", "drinks Water", "inspires TV", "causes Rainbow vision",
					"causes UFO sighting", "causes Alien sighting", "more visceral than Prayer", "grows on Mountain", "inspires Satan", "causes Dragon sighting", "hides Diamond", "hides Platinum", "hides Gold", "inspires Devil music",
					"overgrows fence", "inspires Video Game", "unlocks Math", "turns you into Robot", "speeds up Heart", "conducts Electricity", "survives Lightning", "starts Medusa conversation", "brings flower Power",
					"too widespread for Laser", "inspires Nuke rally", "smoke Clouds Sky", "gives cover from Tank", "too rough for Helicopter", "survives Dynamite", "survives Tornado", "hides Quicksand", "hides Pit", "hides Chain",
					"hides Gun", "breaks Law", "constructs Whip", "hides Sword", "overgrows Rock", "annual despite Death", "overgrows Wall", "prefers moderate Sun", "blurry in Camera" },
			/*Film Outcomes*/
			{ "in the can (Toilet)", "developer spoils Air", "entertains Planet", "score uses Guitar", "covers superBowl", "covers world Cup", "inspires Beer", "- singing in the Rain", "coats Water", "before TV", "has technicolor Rainbow",
					"about UFO", "about Alien", "disrupts Prayer", "set on Mountain", "about Satan", "about Dragon", "about Diamond thieves", "pricier than Platinum", "pricier than Gold", "about Devil", "projected on fence",
					"based on Video Game", "teaches Math", "about Robots", "has Heart", "teaches Electricity", "about Lightning", "features Medusa", "grants Power", "becomes Laser media", "depicts Nuke", "earnings Sky high", "rents Tank",
					"rents Helicopter", "effects use Dynamite", "about Tornado", "scene with Quicksand", "is the Pits", "edits Chained", "rents Guns", "about Lawmen", "hero uses Whip", "hero uses Sword", "starring the Rock",
					"glorifies Death", "projected on Wall", "production prefers Sun", "fills Camera", "captures Fire" },
			/*Toilet Outcomes*/
			{ "spoils Air", "pollutes Planet", "-mouthed Guitarist", "Bowl", "holds more than Cup", "soon contains Beer", "catches Rain", "uses Water", "less offensive than TV", "reflects Rainbow",
					"holds UFO (unidentified floating object)", "intrigues Alien", "answers Prayer", "holds Mountain", "smells of Satan", "confuses Dragon", "hides Diamond", "colored Platinum", "contains Gold", "smells like Devil",
					"can be fence", "disrupts Video Game", "easier than Math", "confuses Robots", "good for Heart", "conducts Electricity", "attracts Lightning", "less stinky than Medusa", "has stink Power", "reflects Laser",
					"smells like Nuke", "stinks Sky high", "Tank", "need diverts Helicopter", "stinkier than Dynamite", "survives Tornado", "contains Quicksand", "is the Pits", "uses Chain", "resists Gun", "flushes Law", "resists Whip",
					"resists Sword", "hard as Rock", "smells of Death", "more legal than Wall", "better without Sun", "flushes Camera", "douses Fire", "resists Chainsaw" },
			/*Air Outcomes*/
			{ "covers Planet", "Guitar", "tips over Bowl", "tips over Cup", "stales Beer", "creates Rain", "evaporates Water", "headed TV", "suspends Rainbow", "chokes UFO", "chokes Alien", "echoes Prayer", "chills Mountain",
					"chokes Satan", "freezes Dragon", "scatters Diamonds", "cools Platinum", "cools Gold", "chokes Devil", "wobbles fence", "freezes Video Game", "scatters Math homework", "tarnishes Robot", "feeds Heart",
					"conducts Electricity", "conducts Lightning", "freezes Medusa", "makes wind Power", "weakens Laser", "blows astray Nuke", "becomes Sky", "Tank", "tosses Helicopter", "blows out Dynamite", "creates Tornado",
					"escapes Quicksand", "fills Pit", "tarnishes Chain", "tarnishes Gun", "scatters Law Papers", "echoes Whip", "tarnishes Sword", "erodes Rock", "carries smell of Death", "buffets Wall", "cools heat of Sun",
					"knocks over Camera", "spreads Fire", "echoes Chainsaw", "headed schoolkids" },
			/*Planet Outcomes*/
			{ "reveres Guitar", "decorates Bowl", "decorates Cup", "drinks Beer", "develops Rain", "supports Water", "watches TV", "diverse as Rainbow", "houses UFO", "houses Alien", "in Prayer", "supports Mountain", "rebukes Satan",
					"rebukes Dragon", "creates Diamond", "creates Platinum", "creates Gold", "rebukes Devil", "builds Fences", "plays Video Games", "orbit uses Math", "uses Robots", "has Heartland", "conducts Electricity",
					"supports Lightning", "rebukes Medusa", "has untold Power", "survives Laser", "survives Nuke", "supports Sky", "survives Tank", "survives Helicopter", "survives Dynamite", "supports Tornado", "supports Quicksand",
					"crater is Pit", "supports food Chain", "survives Gun", "above our Laws", "Whips abound axis", "survives Sword", "supports Rock", "renews Death", "supports Wall", "orbits Sun", "too big for Camera",
					"mantle contains Fire", "survives Chainsaw", "goes to School", "uses Scissors" },
			/*Guitar Outcomes*/
			{ "at hollywood Bowl", "fills donation Cup", "inspires Beer", "notes like Rain", "echoes across Water", "on TV", "song about Rainbow", "group UFO", "intrigues Alien", "accompanies Prayer", "echoes across Mountain",
					"invokes Satan", "subdues Dragon", "shines like Diamond", "album goes Platinum", "album goes Gold", "invokes Devil", "heard over Fences", "sountracks Video Game", "notes use Math", "confuses Robot", "played with Heart",
					"uses Electricity", "fingered like Lightning", "hypnotizes Medusa", "Power ballad", "concert uses Laser", "rallies against Nuke", "echoes across Sky", "rallies against Tank", "rallies against Helicopter",
					"rallies against Dynamite", "cheers Tornado victim", "floats in Quicksand", "echoes Pit", "breaks Chain", "rallies against Gun", "breaks Law", "accompanies Whip", "stays Sword", "plays Rock", "song about Death",
					"echoes off Wall", "reflects Sun", "pricier than Camera", "on Fire", "sounds like Chainsaw", "distracts School", "strings resists Scissors", "poisons ears" },
			/*Bowl Outcomes*/
			{ "bigger than Cup", "-ing inspires Beer", "catches Rain", "holds Water", "sits on TV", "reflects Rainbow", "shapes UFO", "shapes Alien ship", "blesses Prayer", "holds food Mountain", "blesses Satan", "drowns Dragon",
					"holds Diamond", "made of Platinum", "made of Gold", "blesses Devil", "sits on Fences", "-ing Video Game", "parabolic Math", "splashes Robot", "holds Heart", "focuses Electricity", "focuses Lightning", "drowns Medusa",
					"focuses Power", "reflects Laser", "encases core of Nuke", "shaped Sky", "turreted Tank", "shaped Helicopter cockPit", "splashes Dynamite", "shaped Tornado shelter", "floats on Quicksand", "emerges from well Pit",
					"holds Chain", "splashes Gun", "knows no Law", "resists Whip", "splashes Sword", "made of Rock", "blessing transcends Death", "smashes against Wall", "focuses Sun", "lensed Camera", "snuffs out Fire",
					"splashes Chainsaw", "-ing after School", "splashes Scissors", "holds Poison", "rattles Cage" },
			/*Cup Outcomes*/
			{ "holds Beer", "catches Rain", "holds Water", "sits on TV", "reflects Rainbow", "shapes UFO", "shapes Alien ship", "accompanies Prayer", "for climbing Mountain", "blesses Satan", "attracts Dragon", "holds Diamond",
					"made of Platinum", "made of Gold", "blesses Devil", "sits on Fences", "splashes Video Game", "for Math champ", "splashes Robot", "hand over Heart", "conducts Electricity", "focuses Lightning", "attracts Medusa",
					"holds holy Power", "reflects Laser", "shaped Nuke", "reflects Sky", "ears for Tank", "ears for Helicopter", "ears for Dynamite", "ears for Tornado", "floats on Quicksand", "shaped Pit", "holds Chain", "splashes Gun",
					"toasts Law", "ears for Whip", "commands Sword", "made of Rock", "toasts Death", "smashes against Wall", "reflects Sun", "lensed Camera", "splashes Fire", "splashes Chainsaw", "for School record", "splashes Scissors",
					"holds Poison", "rattles Cage", "splashes Axe" },
			/*Beer Outcomes*/
			{ "despite Rain", "tastier than Water", "sits on TV", "flavor Rainbow", "invokes UFO sighting", "chokes Alien", "answers Prayer", "logo has Mountain", "logo depicts Satan", "logo has Dragon", "logo has Diamond",
					"colored Platinum", "colored Gold", "drinker is Devil", "sits on fence", "inspires Video Game", "measured with Math", "short-circuits Robot", "affects Heart", "conducts Electricity", "logo depicts Lightning",
					"chokes Medusa", "gives false Power", "diffracts Laser", "is Brain Nuke", "no matter what Sky", "affects Tank driving", "affects Helicopter driving", "soaks Dynamite", "after Tornado", "floats on Quicksand", "fills Pit",
					"rusts Chain", "inspires Gun", "breaks Law", "inspires Whip", "rusts Sword", "rolling Rock", "toasts Death", "on the Wall", "catches Sun", "inspires Camera", "by the Fire", "affects Chainsaw use", "angers School",
					"rusts Scissors", "can be Poison", "rusts Cage", "rusts Axe", "brings Peace" },
			/*Rain Outcomes*/
			{ "made of Water", "inspires TV", "creates Rainbow", "diverts UFO", "drowns Alien", "answers Prayer", "on the Mountain", "drowns Satan", "drowns Dragon", "cleans Diamond", "cleans Platinum", "cleans Gold", "drowns Devil",
					"rusts fence", "inspires Video Game", "measured with Math", "short-circuits Robot", "saddens Heart", "conducts Electricity", "brings Lightning", "drowns Medusa", "blacks out Power", "diffracts Laser", "diverts Nuke",
					"darkens Sky", "falls on Tank", "diverts Helicopter", "soaks Dynamite", "brings Tornado", "creates Quicksand", "fills Pit", "rusts Chain", "rusts Gun", "soaks Law Papers", "soaks Whip", "rusts Sword", "erodes Rock",
					"makes lonely Death", "leaks through Wall", "blocks Sun", "ruins Camera", "douses Fire", "thwarts Chainsaw use", "closes School", "rusts Scissors", "acidic Poison", "rusts Cage", "rusts Axe", "disturbs Peace",
					"short-circuits Computer" },
			/*Water Outcomes*/
			{ "damages TV", "creates Rainbow", "diverts UFO", "toxic to Alien", "answers Prayer", "rains on Mountain", "drowns Satan", "drowns Dragon", "cleans Diamond", "cleans Platinum", "cleans Gold", "drowns Devil", "rises over fence",
					"damages Video Game", "measured with Math", "short-circuits Robot", "strengthens Heart", "conducts Electricity", "attracts Lightning", "drowns Medusa", "creates hydro Power", "diffracts Laser", "short-circuits Nuke",
					"reflects Sky", "short-circuits Tank", "short-circuits Helicopter", "soaks Dynamite", "spout Tornado", "floats on Quicksand", "fills Pit", "rusts Chain", "rusts Gun", "has Laws", "soaks Whip", "rusts Sword",
					"erodes Rock", "causes Death", "cleans Wall", "reflects Sun", "ruins Camera", "douses Fire", "floods Chainsaw", "leak closes School", "rusts Scissors", "dilutes Poison", "rusts Cage", "rusts Axe", "inspires Peace",
					"short-circuits Computer", "floods Castle" },
			/*TV Outcomes*/
			{ "color Rainbow", "debunks UFO", "debunks Alien", "delivers Prayer", "broadcast over Mountain", "about Satan", "about Dragon", "sharp as Diamond", "wires are Platinum", "wires are Gold", "inspires Devil",
					"broadcast over fence", "before Video Game", "tech uses Math", "before Robot", "bad for Heart", "uses Electricity", "attracts Lightning", "about Medusa", "consumes Power", "media uses Laser", "about Nukes",
					"replaces Sky", "guides Tank", "news Helicopter", "character says Dynamite", "predicts Tornado", "time Quicksand", "is the Pits", "stolen despite Chain", "glorifies Guns", "regulators make Laws", "sharp as a Whip",
					"about Swords", "airs Rock concert", "glorifies Death", "hangs on Wall", "about Sun", "Camera", "reports Fire", "airs Chainsaw Film", "teaches School", "resists Scissors", "is Poison", "turns room into Cage",
					"show axed", "disturbs Peace", "before Computer", "about Castle", "run by snakes" },
			/*Rainbow Outcomes*/
			{ "attracts UFO", "intrigues Alien", "enhances Prayer", "over Mountain", "irritates Satan", "over Dragon", "indicates Diamond", "points to Platinum", "points to Gold", "irritates Devil", "over fence", "colored Video Game",
					"optics use Math", "over Robot", "cheers Heart", "wired Electricity", "after Lightning", "irritates Medusa", "Power", "colored Lasers", "after Nuke", "decorates Sky", "over Tank", "over Helicopter", "over Dynamite",
					"after Tornado", "over Quicksand", "over Pit", "color Chain", "resists Gun", "despite Law", "sharp as a Whip", "over Sword", "over Rock", "despite Death", "hits Wall", "diffracts Sun", "challenges Camera", "over Fire",
					"over Chainsaw", "over School", "colored Scissors", "resists Poison", "beyond Cage", "resists Axe", "indicates Peace", "colored Computer", "over Castle", "colored snakes", "after bloodshed" },
			/*UFO Outcomes*/
			{ "carries Alien", "despite Prayer", "flies over Mountain", "unaware of Satan", "spies on Dragon", "uses Diamond", "made of Platinum", "made of Gold", "unaware of Devil", "flies over fence", "in Video Game",
					"uses advanced Math", "commands Robot", "abducts Heart", "uses Electricity", "shoots Lightning", "outclasses Medusa", "uses advanced Power", "shoots Laser", "steals Nuke", "flies across Sky", "flies over Tank",
					"evades Helicopter", "resists Dynamite", "flies over Tornado", "flies over Quicksand", "flies over Pit", "vaporizes Chain", "resists Gun", "breaks physical Law", "resists Whip", "resists Sword", "vaporizes Rock",
					"causes Death", "flies over Wall", "flies to Sun", "evades Camera", "starts Fire", "resists Chainsaw", "flies over School", "resists Scissors", "resists Poison", "evades Cage", "resists Axe", "disturbs Peace",
					"uses Computer", "flies over Castle", "abducts Snake", "collects Blood", "vaporizes Porcupine" },
			/*Alien Outcomes*/
			{ "doesn't use Prayer", "terraforms Mountain", "unaware of Satan", "vaporizes Dragon", "steals Diamond", "colored Platinum", "colored Gold", "unaware of Devil", "vaporizes fence", "in Video Game", "uses advanced Math",
					"commands Robot", "dissects Heart", "uses Electricity", "shoots Lightning", "vaporizes Medusa", "uses advanced Power", "shoots Laser", "disarms Nuke", "from Sky", "vaporizes Tank", "vaporizes Helicopter",
					"vaporizes Dynamite", "dispels Tornado", "solidifies Quicksand", "flies over Pit", "vaporizes Chain", "vaporizes Gun", "breaks physical Law", "vaporizes Whip", "vaporizes Sword", "vaporizes Rock", "causes Death",
					"vaporizes Wall", "flies to Sun", "evades Camera", "starts Fire", "vaporizes Chainsaw", "vaporizes School", "vaporizes Scissors", "immune to Poison", "vaporizes Cage", "vaporizes Axe", "disturbs Peace", "uses Computer",
					"explores Castle", "vaporizes Snake", "has Blood", "vaporizes Porcupine", "vaporizes Vulture" },
			/*Prayer Outcomes*/
			{ "atop Mountain", "casts out Satan", "subdues Dragon", "for Diamond", "for Platinum", "for Gold", "casts out Devil", "knows no fence", "to win Video Game", "for Math grade", "routine like Robot", "heals Heart",
					"for low Electricity bill", "faster than Lightning", "dispels Medusa", "is spiritual Power", "more accurate than Laser", "against Nuke", "to Sky", "against Tank", "against Helicopter", "against Dynamite",
					"against Tornado", "solidifies Quicksand", "in Pit", "breaks Chain", "against Gun", "for fair Law", "against Whip", "against Sword", "atop Rock", "against Death", "knows no Wall", "for Sun", "not captured on Camera",
					"against Fire", "against Chainsaw", "starts School", "for straight Scissors cut", "heals Poison", "in Cage", "against Axe", "brings Peace", "salvages Computer", "in Castle", "rebukes Snake", "calms Blood",
					"protects like Porcupine", "dispels Vulture", "confuses Monkey" },
			/*Mountain Outcomes*/
			{ "houses Satan", "houses Dragon", "contains Diamond", "contains Platinum", "contains Gold", "houses Devil", "taller than fence", "outlasts Video Game", "height Math", "too rough for Robot", "stimulates Heart",
					"conducts Electricity", "attracts Lightning", "houses Medusa", "represents Power", "too big for Laser", "survives Nuke", "fills Sky", "too steep for Tank", "too high for Helicopter", "survives Dynamite",
					"bigger than Tornado", "contains Quicksand", "hides Pit", "can't be Chained", "echoes Gun", "outlasts Law", "echoes Whip", "unaffected by Sword", "made of Rock", "transcends Death", "forms Wall", "blocks Sun",
					"challenges Camera", "survives Fire", "survives Chainsaw", "rises above School", "unaffected by Scissors", "unaffected by Poison", "outlasts Cage", "survives Axe", "stands in Peace", "outlasts Computer",
					"taller than Castle", "houses Snake", "outlasts Blood", "houses Porcupine", "houses Vulture", "houses Monkey", "challenges old King" },
			/*Satan Outcomes*/
			{ "commands Dragon", "likes King Diamond", "tempts with Platinum", "tempts with Gold", "commands Devil", "knows no fence", "inspires Video Game", "good at Math", "laughs at Robot", "darkens Heart", "doesn't need Electricity",
					"brings Lightning", "commands Medusa", "has Power", "laughs at Laser", "laughs at Nuke", "darkens Sky", "laughs at Tank", "laughs at Helicopter", "laughs at Dynamite", "commands Tornado", "dispels Quicksand",
					"commands Pit", "unChained", "laughs at Gun", "knows no Law", "cracks Whip", "laughs at Sword", "hurls Rock", "after Death", "knows no Wall", "curses Sun", "evades Camera", "commands Fire", "evades Chainsaw",
					"enthralls schoolkids", "laughs at Scissors", "laughs at Poison", "escapes Cage", "laughs at Axe", "prevents Peace", "laughs at Computer", "has Castle", "is Snake", "poisons Blood", "sharper than Porcupine",
					"is soul Vulture", "owns Monkey", "possesses King", "possesses Queen" },
			/*Dragon Outcomes*/
			{ "hoards Diamond", "hoards Platinum", "hoards Gold", "commands Devil", "flies over fence", "in Video Game", "doesn't use Math", "torches Robot", "Heart", "conducts Electricity", "breathes Lightning", "torches Medusa",
					"has Power", "before Laser", "before Nuke", "flies across Sky", "before Tank", "before Helicopter", "before Dynamite", "flies over Tornado", "too big for Quicksand", "escapes Pit", "breaks Chain", "resists Gun",
					"knows no Law", "torches Whip", "resists Sword", "atop Rock", "causes Death", "flies over Wall", "flies across Sun", "before Camera", "breathes Fire", "before Chainsaw", "torches School", "resists Scissors",
					"breath is Poison", "escapes Cage", "resists Axe", "disturbs Peace", "before Computer", "terrorizes Castle", "bigger than Snake", "spills Blood", "outclasses Porcupine", "torches Vulture", "torches Monkey",
					"angers King", "angers Queen", "eats Prince" },
			/*Diamond Outcomes*/
			{ "pricier than Platinum", "pricier than Gold", "imprisons Devil", "harder than fence", "pricier than Video Game", "geometric Math", "pricier than Robot", "wins Heart", "withstands Electricity", "withstands Lightning",
					"enthralls Medusa", "focuses Power", "diffracts Laser", "survives Nuke", "with lucy in Sky", "harder than Tank", "engraves Helicopter", "survives Dynamite", "survives Tornado", "hides in Quicksand", "hides in Pit",
					"harder than Chain", "resists Gun", "bribes Lawman", "resists Whip", "engraves Sword", "hardest Rock", "'till Death", "engraves Wall", "catches Sun", "pricier than Camera", "resists Fire", "resists Chainsaw",
					"more desirable than School", "engraves Scissors", "resists Poison", "engraves Cage", "engraves Axe", "disturbs Peace", "pricier than Computer", "decorates Castle", "charms Snake", "outlasts Blood",
					"sharper than Porcupine", "attracts Vulture", "hypnotizes Monkey", "adorns King's crown", "adorns Queen's crown", "adorns Prince's crown", "adorns Princess' crown" },
			/*Platinum Outcomes*/
			{ "pricier than Gold", "tempts Devil", "funds fence", "pricier than Video Game", "market uses Math", "wired Robot", "wins Heart", "conducts Electricity", "conducts Lightning", "enthralls Medusa", "conducts Power", "wired Laser",
					"wired Nuke", "reflects Sky", "wired Tank", "decorates Helicopter", "survives Dynamite", "survives Tornado", "hides in Quicksand", "hides in Pit", "Chain", "decorates Gun", "bribes Lawman", "resists Whip",
					"decorates Sword", "rarer than Rock", "outlasts Death", "decorates Wall", "reflects Sun", "pricier than Camera", "resists Fire", "resists Chainsaw", "more desirable than School", "coated Scissors", "resists Poison",
					"coated Cage", "decorates Axe", "disturbs Peace", "wired Computer", "funds Castle", "charms Snake", "outlasts Blood", "harder than Porcupine", "attracts Vulture", "hypnotizes Monkey", "adorns King's crown",
					"adorns Queen's crown", "adorns Prince's crown", "adorns Princess' crown", "badged Police" },
			/*Gold Outcomes*/
			{ "tempts Devil", "funds fence", "pricier than Video Game", "market uses Math", "plated Robot", "wins Heart", "conducts Electricity", "conducts Lightning", "enthralls Medusa", "conducts Power", "wired Laser", "wired Nuke",
					"reflects Sky", "funds Tank", "funds Helicopter", "survives Dynamite", "survives Tornado", "hides in Quicksand", "hides in Pit", "Chain", "plated Gun", "bribes Lawman", "resists Whip", "decorates Sword",
					"rarer than Rock", "outlasts Death", "plated Wall", "reflects Sun", "pricier than Camera", "resists Fire", "resists Chainsaw", "more desirable than School", "plated Scissors", "resists Poison", "plated Cage",
					"plated Axe", "disturbs Peace", "wired Computer", "funds Castle", "charms Snake", "outlasts Blood", "harder than Porcupine", "attracts Vulture", "hypnotizes Monkey", "adorns King's crown", "adorns Queen's crown",
					"adorns Prince's crown", "adorns Princess' crown", "badged Police", "enthralls Woman" },
			/*Devil Outcomes*/
			{ "hops fence", "inspires Video Game", "quizzes Math", "glitches Robot", "darkens Heart", "cuts Electricity", "brings Lightning", "commands Medusa", "has Power", "rewires Laser", "inspires Nuke", "darkens Sky", "drives Tank",
					"crashes Helicopter", "lights Dynamite", "commands Tornado", "lures into Quicksand", "hides in Pit", "breaks Chain", "inspires Gun", "breaks Law", "cracks Whip", "wields Sword", "hurls Rock", "after Death",
					"in the Wall", "curses Sun", "blurs Camera", "commands Fire", "wields Chainsaw", "skips School", "resists Scissors", "uses Poison", "escapes Cage", "wields Axe", "disturbs Peace", "hacks Computer", "has Castle",
					"eats snakes", "poisons Blood", "sharper than Porcupine", "is soul Vulture", "burns Monkey", "tempts King", "tempts Queen", "tempts Prince", "tempts Princess", "evades Police", "possesses Woman", "possesses Baby" },
			/*Fence Outcomes*/
			{ "guards Video Game", "height Math", "blocks Robot", "saddens Heart", "uses Electricity", "attracts Lightning", "blocks Medusa", "around Power company", "blocks Laser", "guards Nuke", "blocks Sky", "blocks Tank",
					"guards Helicopter", "guards Dynamite", "survives Tornado", "above Quicksand", "around Pit", "made of Chain", "guards Gun", "breaks zoning Law", "resists Whip", "resists Sword", "made of Rock", "guards from Death",
					"forms Wall", "blocks Sun", "confuses Camera focus", "surrounds Fire", "guards Chainsaw", "around School", "resists Scissors", "resists Poison", "surrounds Cage", "resists Axe", "protects Peace", "around Computer",
					"around Castle", "blocks Snake", "guards Blood supply", "blocks Porcupine", "blocks Vulture", "blocks Monkey", "around King", "around Queen", "around Prince", "around Princess", "blocks Police", "around Woman",
					"around Baby", "around Man" },
			/*Video Game Outcomes*/
			{ "code uses Math", "turns you into Robot", "affects Heart", "uses Electricity", "attracts Lightning", "confuses Medusa", "consumes Power", "has Laser", "has Nuke", "simulates Sky", "has Tank", "has Helicopter", "has Dynamite",
					"graphics Tornado", "mental Quicksand", "mental Pit", "has Chain weapon", "uses Gun", "breaks fcc Law", "has Whip", "has Sword", "Rock soundtrack", "restarts after Death", "simulates walls", "replaces Sun",
					"multiple Camera angles", "catches Fire", "has Chainsaw", "after School", "more fun than Scissors", "mental Poison", "mental Cage", "has Axe", "disturbs Peace", "on Computer", "before Castle", "cables Snake",
					"glorifies Blood", "resists Porcupine", "sold by Vulture", "stars Monkey", "has King", "has Queen", "has Prince", "has Princess", "distracts Police", "entertains Woman", "confuses Baby", "entertains Man",
					"clutters Home" },
			/*Math Outcomes*/
			{ "navigates Robot", "darkens Heart", "calculates Electricity", "calculates Lightning", "confuses Medusa", "Brain Power", "formulates Laser", "formulates Nuke", "class denies Sky", "navigates Tank", "navigates Helicopter",
					"measures Dynamite", "predicts Tornado", "test like Quicksand", "is the Pits", "uses number Chain", "test inspires Gun", "formulates Law", "whiz sharp as Whip", "measures Sword swing", "schoolhouse Rock",
					"transcends Death", "measures Wall", "calculates Sun path", "shapes Camera lens", "measures Fire", "directs Chainsaw use", "bores School", "guides Scissors", "measures Poison", "mental Cage", "whiz sharper than Axe",
					"is peaceful", "on Computer", "measures Castle", "measures Snake", "calculates Blood count", "counts Porcupine quills", "test attracts Vulture", "enrages Monkey", "confuses King", "confuses Queen", "confuses Prince",
					"confuses Princess", "confuses Police", "confuses Woman", "confuses Baby", "confuses Man", "after homeroom", "word problem w/trains" },
			/*Robot Outcomes*/
			{ "envies Heart", "uses Electricity", "shoots Lightning", "tramples Medusa", "consumes Power", "shoots Laser", "launches Nuke", "pollutes Sky", "pilots Tank", "pilots Helicopter", "throws Dynamite", "chases Tornado",
					"detects Quicksand", "climbs out of Pit", "breaks Chain", "fires Gun", "three Laws", "resists Whip", "carries Sword", "hurls Rock", "knows no Death", "smashes through Wall", "reflects Sun", "has Camera", "resists Fire",
					"carries Chainsaw", "tramples School", "carries Scissors", "resists Poison", "bends bars of Cage", "carries Axe", "disturbs Peace", "uses Computer", "explores Castle", "steps on Snake", "has no Blood",
					"steps on Porcupine", "resists Vulture", "scares Monkey", "frightens King", "frightens Queen", "frightens Prince", "frightens Princess", "tramples Police", "carries off Woman", "carries off Baby", "overthrows Man",
					"enhances Home", "builds Train", "builds Car" },
			/*Heart Outcomes*/
			{ "uses bioelectricity", "survives Lightning", "Pities Medusa", "provides Power", "Laser surgery", "bans Nuke", "clears Sky", "bans Tank", "soars like Helicopter", "bans Dynamite", "survives Tornado", "rescues from Quicksand",
					"survives Pitfalls", "unChained", "bans Gun", "upholds Law", "stays Whip", "stays Sword", "like a Rock", "transcends Death", "knows no Wall", "of the Sun", "guides Camera", "on Fire", "bans Chainsaw", "excels at School",
					"guides Scissors", "bans Poison", "transcends Cage", "stays Axe", "upholds Peace", "excels at Computer", "builds Castle", "resists Snake", "pumps Blood", "outsmarts Porcupine", "outsmarts Vulture", "guides Monkey",
					"guides King", "guides Queen", "guides Prince", "guides Princess", "bolsters Police", "guides Woman", "protects Baby", "guides Man", "builds Home", "prefers Train", "invents eco Car", "makes Noise" },
			/*Electricity Outcomes*/
			{ "produces Lightning", "fries Medusa", "produces Power", "powers Laser", "short-circuits Nuke", "charges Sky", "short-circuits Tank", "short-circuits Helicopter", "natural Dynamite", "envelops Tornado", "charges Quicksand",
					"brightens Pit", "starts Chain reaction", "charges Gun", "has physical Law", "fries Whip", "charges Sword", "powers Rock music", "causes Death", "in Wall", "replicates Sun", "powers Camera", "starts Fire",
					"short-circuits Chainsaw", "bills School", "charges Scissors", "mixes Poison", "charges Cage", "charges Axe", "disturbs Peace", "short-circuits Computer", "bills Castle", "in cable Snake", "fries Blood",
					"fries Porcupine", "repels Vulture", "electrocutes Monkey", "electrocutes King", "electrocutes Queen", "electrocutes Prince", "electrocutes Princess", "electrocutes Police", "electrocutes Woman", "electrocutes Baby",
					"electrocutes Man", "bills Home", "short-circuits Train", "short-circuits Car", "makes Noise", "charges Bicycle" },
			/*Lightning Outcomes*/
			{ "strikes Medusa", "produces Power", "outclasses Laser", "short-circuits Nuke", "decorates Sky", "strikes Tank", "strikes Helicopter", "ignites Dynamite", "envelops Tornado", "creates Quicksand", "creates Pit",
					"starts Chain reaction", "charges Gun", "has physical Law", "fries Whip", "strikes Sword", "splits Rock", "causes Death", "strikes through Wall", "storm blocks Sun", "challenges Camera", "starts Fire",
					"outclasses Chainsaw", "strikes School", "charges Scissors", "deadlier than Poison", "charges Cage", "charges Axe", "disturbs Peace", "short-circuits Computer", "strikes Castle", "strikes Snake", "cooks Blood",
					"strikes Porcupine", "strikes Vulture", "strikes Monkey", "strikes King", "strikes Queen", "strikes Prince", "strikes Princess", "strikes Police", "strikes Woman", "scares Baby", "strikes Man", "strikes Home",
					"strikes Train", "(greased) Car", "makes Noise", "strikes Bicycle", "strikes Tree" },
			/*Medusa Outcomes*/
			{ "craves Power", "before Laser", "before Nuke", "curses Sky", "resists Tank", "evades Helicopter", "before Dynamite", "hides from Tornado", "plants Quicksand", "lives in Pit", "breaks Chain", "before Gun", "breaks Law",
					"cracks Whip", "wields Sword", "hurls Rock", "causes Death", "hides behind Wall", "curses Sun", "before Camera", "starts Fire", "before Chainsaw", "terrorizes School", "runs with Scissors", "deadlier than Poison",
					"escapes Cage", "wields Axe", "disturbs Peace", "before Computer", "terrorizes Castle", "head snakes", "freezes Blood", "petrifies Porcupine", "petrifies Vulture", "petrifies Monkey", "petrifies King", "petrifies Queen",
					"petrifies Prince", "petrifies Princess", "petrifies Police", "petrifies Woman", "petrifies Baby", "petrifies Man", "terrifies Home", "before Train", "before Car", "screeches Noise", "before Bicycle",
					"hides behind Tree", "discards Turnip" },
			/*Power Outcomes*/
			{ "charges Laser", "charges Nuke", "lines clutter Sky", "engages Tank", "deploys Helicopter", "plants Dynamite", "plant survives Tornado", "clears Quicksand", "lights Pit", "struggle food Chain", "play with Gun", "imposes Law",
					"cracks Whip", "wields Sword", "moves Rock", "of life and Death", "in Wall", "of Sun", "charges Camera", "to Fire you", "clears with Chainsaw", "superintends School", "charges Scissors", "assassinates w/Poison",
					"imposes Cage", "gives you the Axe", "breaks Peace", "crashes Computer", "sieges Castle", "hungry Snake", "sacrifices Blood", "fries Porcupine", "hungry Vulture", "fries Monkey", "overthrows King", "overthrows Queen",
					"supplants Prince", "supplants Princess", "governs Police", "corrupts Woman", "electrocutes Baby", "corrupts Man", "lights Home", "runs Train", "plant in Car", "makes Noise", "outperforms Bicycle", "consumes trees",
					"cooks Turnip", "cooks Duck" },
			/*Laser Outcomes*/
			{ "guides Nuke", "traverses Sky", "targets Tank", "targets Helicopter", "outclasses Dynamite", "penetrates Tornado", "burns off Quicksand", "lights Pit", "starts Chain reaction", "Gun", "upholds Law", "outclasses Whip",
					"outclasses Sword", "burns through Rock", "causes Death", "burns through Wall", "has power of Sun", "burns Camera", "starts Fire", "outclasses Chainsaw", "teaches School", "melts Scissors", "more exact than Poison",
					"melts Cage", "outlcasses Axe", "disturbs Peace", "backs up Computer", "targets Castle", "fries Snake", "cooks Blood", "fries Porcupine", "fries Vulture", "fries Monkey", "targets King", "targets Queen",
					"targets Prince", "targets Princess", "helps Police", "targets Woman", "targets Baby", "targets Man", "targets Home", "targets Train", "targets Car", "zap Noise", "melts Bicycle", "burns through Tree",
					"discintigrates Turnip", "fries Duck", "fries Wolf" },
			/*Nuke Outcomes*/
			{ "poisons Sky", "incinerates Tank", "incinerates Helicopter", "outclasses Dynamite", "outclasses Tornado", "incinerates Quicksand", "emerges from Pit", "starts Chain reaction", "outclasses Gun", "breaks Law",
					"incinerates Whip", "incinerates Sword", "incinerates Rock", "causes Death", "incinerates Wall", "has power of Sun", "incinerates Camera", "starts Fire", "incinerates Chainsaw", "incinerates School",
					"incinerates Scissors", "incinerates Poison", "incinerates Cage", "incinerates Axe", "breaks Peace", "incinerates Computer", "incinerates Castle", "incinerates Snake", "incinerates Blood", "incinerates Porcupine",
					"incinerates Vulture", "incinerates Monkey", "incinerates King", "incinerates Queen", "incinerates Prince", "incinerates Princess", "incinerates Police", "incinerates Woman", "incinerates Baby", "incinerates Man",
					"incinerates Home", "incinerates Train", "incinerates Car", "makes Noise", "incinerates Bicycle", "incinerates Tree", "incinerates Turnip", "incinerates Duck", "incinerates Wolf", "incinerates Cat" },
			/*Sky Outcomes*/
			{ "above Tank", "above Helicopter", "above Dynamite", "houses Tornado", "above Quicksand", "evades Pit", "above Chain", "above Gun", "is limit of Law", "above Whip", "above Sword", "above Rock", "transcends Death", "above Wall",
					"surrounds Sun", "challenges Camera", "above Fire", "above Chainsaw", "above School", "above Scissors", "above Poison", "evades Cage", "above Axe", "at Peace", "above Computer", "above Castle", "above Snake",
					"above Blood", "above Porcupine", "above Vulture", "above Monkey", "above King", "above Queen", "above Prince", "above Princess", "above Police", "above Woman", "above Baby", "above Man", "above Home", "above Train",
					"above Car", "makes no Noise", "above Bicycle", "above Tree", "above Turnip", "above Duck", "above Wolf", "above Cat", "above Bird" },
			/*Tank Outcomes*/
			{ "outclasses Helicopter", "resists Dynamite", "survives Tornado", "plows over Quicksand", "creates Pit", "breaks Chain", "has Gun", "imposes Law", "outclasses Whip", "outclasses Sword", "crumbles Rock", "brings Death",
					"crumbles Wall", "Cloud blocks Sun", "crushes Camera", "resists Fire", "outclasses Chainsaw", "crumbles School", "crushes Scissors", "more direct than Poison", "smashes through Cage", "outclasses Axe", "breaks Peace",
					"flattens Computer", "sieges Castle", "flattens Snake", "spills Blood", "squashes Porcupine", "attracts Vulture", "squishes Monkey", "squashes King", "squashes Queen", "squashes Prince", "squashes Princess",
					"outclasses Police", "squashes Woman", "squashes Baby", "squashes Man", "flattens Home", "barrels though Train", "flattens Car", "makes Noise", "flattens Bicycle", "knocks down Tree", "pulverizes Turnip",
					"squashes Duck", "squashes Wolf", "squashes Cat", "squashes Bird nest", "squooshes Fish" },
			/*Helicopter Outcomes*/
			{ "drops Dynamite", "flies over Tornado", "flies over Quicksand", "flies over Pit", "breaks Chain", "has Gun", "imposes Law", "flies over Whip", "flies over Sword", "flies over Rock", "causes Death", "flies over Wall",
					"Cloud blocks Sun", "carries Camera", "flies over Fire", "flies over Chainsaw", "flies over School", "flies over Scissors", "flies over Poison", "flies over Cage", "flies over Axe", "disturbs Peace", "uses Computer",
					"flies over Castle", "flies over Snake", "gets Blood pumping", "flies over Porcupine", "flies over Vulture", "flies over Monkey", "carries King", "carries Queen", "carries Prince", "carries Princess", "carries Police",
					"carries Woman", "carries Baby", "carries Man", "flies over Home", "faster than Train", "faster than Car", "makes Noise", "faster than Bicycle", "flies over Tree", "flies over Turnip", "flies over Duck",
					"flies over Wolf", "flies over Cat", "faster than Bird", "flies over Fish", "flies over Spider" }
			/*
			* www.umop.com/rps101/alloutcomes.htm
			* https://convertcase.net/
			* */ };
	public static Random aiChoiceDecider = new Random();
	public static int aiChoiceNumber;
	public static int userChoiceNumber;
	public static String userChoice;
	public static String aiChoice;
	public static int userPoints = 0;
	public static int aiPoints = 0;
	public static Scanner input = new Scanner(System.in);
	//-1:error  0:tie  1:player1 wins  2:player2 wins
	public static int DetermineOutcome(int player1Choice, int player2Choice, int numberOfChoices)
	{
		//number of choices cant be even or the game doesnt work properly
		if (numberOfChoices % 2 == 0 || player1Choice > numberOfChoices - 1 || player2Choice > numberOfChoices - 1)
			return -1;
		
		//tie
		if (player1Choice == player2Choice)
			return 0;
		
		for (int i = 1; i <= numberOfChoices/2; i++)
		{
			if (player2Choice == (player1Choice + i) % numberOfChoices)
				return 1;
		}
		return 2;
	}
	public static int signedModulo(int number, int modulo)
	{
		if (number >= 0)
		{
			return number % modulo;
		}
		else
		{
			//Add 'modulo' to 'number' until it is positive
			//return number + (modulo * ((number / -modulo) + 1));
			while (number < 0)
			{
				number += modulo;
			}
			return number;
		}
	}
	
	public static void decideOutcome()
	{
		int outcome = DetermineOutcome(userChoiceNumber, aiChoiceNumber, choices.length);
		System.out.println(outcome);
		if (outcome == 0)
		{

			System.out.println("It's a tie!!");
		}
		else if(outcome == 1 || outcome == 2)
		{
			int choiceIndex = (outcome == 1 ? userChoiceNumber : aiChoiceNumber);
			/*int outcomeIndex = signedModulo((outcome == 1 ? (userChoiceNumber - aiChoiceNumber): (aiChoiceNumber - userChoiceNumber)) - 2, 49);
			String outcomeMessage = outcomes[choiceIndex][outcomeIndex ];
			System.out.println("Choice Indexes: " + (choiceIndex) + ", " + outcomeIndex);
			System.out.printf("%s %s%n", (outcome == 1 ? userChoice : aiChoice), outcomeMessage);
			*/
			if(outcome == 1)
			{
				int outcomeIndex = userChoiceNumber < aiChoiceNumber ? aiChoiceNumber - userChoiceNumber : aiChoiceNumber - (userChoiceNumber - 100);
				System.out.printf("%s: %s%n", choices[choiceIndex], outcomes[choiceIndex][outcomeIndex - 1]);
				userPoints++;
			}
			else if (outcome == 2)
			{
				int outcomeIndex = aiChoiceNumber < userChoiceNumber ? userChoiceNumber - aiChoiceNumber : userChoiceNumber - (aiChoiceNumber - 100);
				System.out.printf("%s: %s%n", choices[choiceIndex], outcomes[choiceIndex ][outcomeIndex - 1]);
				aiPoints++;
			}
		}
	}
	
	public static void decideChoices()
	{
		aiChoiceNumber = aiChoiceDecider.nextInt(100);
		aiChoice = choices[aiChoiceNumber];
		userChoice = userChoice.substring(0, 1).toUpperCase() + userChoice.substring(1);
		for (int i = 0; i < choices.length; i++)
		{
			if (choices[i].equals(userChoice))
			{
				userChoiceNumber = i;
				break;
			}
		}
		System.out.printf("Your Choice: %s; Value in RPS101: %d%n", userChoice, userChoiceNumber);
		System.out.printf("Opponent's Choice: %s; Value in RPS101: %d%n", aiChoice, aiChoiceNumber);
		
	}
	
	public static void main(String[] args)
	{
		// Game Loop
		System.out.println(choices.length);
		System.out.println("Welcome to RPS 101! Please enter your choice.");
		while (userPoints < 5 || aiPoints < 5 || !userChoice.equals("0"))
		{
			userChoice = input.next();
			decideChoices();
			decideOutcome();
			System.out.println("Enter your next choice.");
		}
	}
}
