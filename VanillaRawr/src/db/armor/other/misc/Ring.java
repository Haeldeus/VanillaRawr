package db.armor.other.misc;

public class Ring {

  private static Object[][] rings = {
    {12947, "INV_Gizmo_BronzeFramework_01", "Alex's Ring of Audacity"},
    {21695, "INV_Jewelry_Ring_AhnQiraj_04", "Angelista's Touch"},
    {19376, "INV_Jewelry_Ring_40", "Archimtiros' Ring of Reckoning"},
    {17063, "INV_Jewelry_Ring_15", "Band of Accuria"},
    {19434, "INV_Jewelry_Ring_24", "Band of Dark Dominion"},
    {19403, "INV_Jewelry_Ring_34", "Band of Forced Concentration"},
    {21526, "INV_Jewelry_Ring_35", "Band of Icy Depths"},
    {22961, "INV_Jewelry_Ring_49Naxxramas", "Band of Reanimation"},
    {22721, "INV_Jewelry_Ring_16", "Band of Servitude"},
    {19138, "INV_Jewelry_Ring_36", "Band of Sulfuras"},
    {22939, "INV_Jewelry_Ring_50Naxxramas", "Band of Unanswered Prayers"},
    {21408, "INV_Jewelry_Ring_AhnQiraj_03", "Band of Unending Life"},
    {21414, "INV_Jewelry_Ring_AhnQiraj_03", "Band of Vaulted Secrets"},
    {21405, "INV_Jewelry_Ring_AhnQiraj_03", "Band of Veiled Shadows"},
    {23060, "INV_Jewelry_Ring_51Naxxramas", "Bonescythe Ring"},
    {19140, "INV_Jewelry_Ring_39", "Cauterizing Band"},
    {19432, "INV_Jewelry_Ring_37", "Circle of Applied Force"},
    {19325, "INV_Jewelry_Ring_35", "Don Julio's Band"},
    {21563, "INV_Jewelry_Ring_34", "Don Rodrigo's Band"},
    {18403, "INV_Jewelry_Ring_27", "Dragonslayer's Signet"},
    {20682, "INV_Jewelry_Ring_23", "Elemental Focus Band"},
    {942, "INV_Jewelry_Ring_07", "Freezing Band"},
    {23062, "INV_Jewelry_Ring_51Naxxramas", "Frostfire Ring"},
    {23028, "INV_Jewelry_Ring_35", "Hailstone Band"},
    {18879, "INV_Jewelry_Ring_14", "Heavy Dark Iron Ring"},
    {20600, "INV_Jewelry_Ring_37", "Malfurion's Signet Ring"},
    {13143, "INV_Jewelry_Ring_17", "Mark of the Dragon Lord"},
    {19384, "INV_Jewelry_Ring_41", "Master Dragonslayer's Ring"},
    {21189, "INV_Jewelry_Ring_41", "Might of Cenarius"},
    {20632, "INV_Jewelry_Ring_04", "Mindtear Band"},
    {2246, "INV_Jewelry_Ring_05", "Myrmidon's Signet"},
    {23063, "INV_Jewelry_Ring_51Naxxramas", "Plagueheart Ring"},
    {19382, "INV_Jewelry_Ring_42", "Pure Elementium Band"},
    {18821, "INV_Jewelry_Ring_07", "Quick Strike Ring"},
    {22707, "INV_Jewelry_Ring_35", "Ramaladni's Icy Grasp"},
    {23067, "INV_Jewelry_Ring_51Naxxramas", "Ring of  the Cryptstalker"},
    {18813, "INV_Jewelry_Ring_13", "Ring of Binding"},
    {19397, "INV_Jewelry_Ring_43", "Ring of Blackrock"},
    {18970, "INV_Jewelry_Ring_26", "Ring of Critical Testing 2"},
    {21601, "INV_jewelry_ring_AhnQiraj_01", "Ring of Emperor Vek'lor"},
    {18543, "INV_Jewelry_Ring_20", "Ring of Entropy"},
    {21396, "INV_Jewelry_Ring_AhnQiraj_03", "Ring of Eternal Justice"},
    {23061, "INV_Jewelry_Ring_51Naxxramas", "Ring of Faith"},
    {21411, "INV_Jewelry_Ring_AhnQiraj_03", "Ring of Infinite Wisdom"},
    {23066, "INV_Jewelry_Ring_51Naxxramas", "Ring of Redemption"},
    {1447, "INV_Belt_27", "Ring of Saviors"},
    {19147, "INV_Jewelry_Ring_38", "Ring of Spell Power"},
    {23037, "INV_Jewelry_Ring_52Naxxramas", "Ring of Spiritual Fervor"},
    {21707, "INV_Jewelry_Ring_AhnQiraj_04", "Ring of Swarming Thought"},
    {21681, "INV_Jewelry_Ring_AhnQiraj_05", "Ring of the Devoured"},
    {23059, "INV_Jewelry_Ring_51Naxxramas", "Ring of the Dreadnaught"},
    {23064, "INV_Jewelry_Ring_51Naxxramas", "Ring of The Dreamwalker"},
    {23065, "INV_Jewelry_Ring_51Naxxramas", "Ring of the Earthshatterer"},
    {23237, "INV_Jewelry_Ring_48Naxxramas", "Ring of the Eternal Flame"},
    {21709, "INV_Jewelry_Ring_AhnQiraj_02", "Ring of the Fallen God"},
    {21399, "INV_Jewelry_Ring_AhnQiraj_03", "Ring of the Gathering Storm"},
    {21596, "INV_Jewelry_Ring_AhnQiraj_06", "Ring of the Godslayer"},
    {21620, "INV_jewelry_ring_AhnQiraj_01", "Ring of the Martyr"},
    {21677, "INV_jewelry_ring_AhnQiraj_01", "Ring of the Qiraji Fury"},
    {20624, "INV_Jewelry_Ring_38", "Ring of the Unliving"},
    {21417, "INV_Jewelry_Ring_AhnQiraj_03", "Ring of Unspoken Names"},
    {21836, "INV_Jewelry_Ring_34", "Ritssyn's Ring of Chaos"},
    {17110, "INV_Jewelry_Ring_21", "Seal of the Archmagus"},
    {23025, "INV_Jewelry_Ring_48Naxxramas", "Seal of the Damned"},
    {22722, "INV_Jewelry_Ring_20", "Seal of the Gurubashi Berserker"},
    {23018, "INV_Jewelry_Ring_50Naxxramas", "Signet of the Fallen Defender"},
    {21402, "INV_Jewelry_Ring_AhnQiraj_03", "Signet of the Unseen Path"},
    {21393, "INV_Jewelry_Ring_AhnQiraj_03", "Signet of Unyielding Strength"},
    {21196, "INV_Jewelry_Ring_40", "Signet Ring of the Bronze Dragonflight"},
    {21197, "INV_Jewelry_Ring_40", "Signet Ring of the Bronze Dragonflight"},
    {21198, "INV_Jewelry_Ring_40", "Signet Ring of the Bronze Dragonflight"},
    {21199, "INV_Jewelry_Ring_40", "Signet Ring of the Bronze Dragonflight"},
    {21200, "INV_Jewelry_Ring_40", "Signet Ring of the Bronze Dragonflight"},
    {21201, "INV_Jewelry_Ring_40", "Signet Ring of the Bronze Dragonflight"},
    {21202, "INV_Jewelry_Ring_40", "Signet Ring of the Bronze Dragonflight"},
    {21203, "INV_Jewelry_Ring_40", "Signet Ring of the Bronze Dragonflight"},
    {21204, "INV_Jewelry_Ring_40", "Signet Ring of the Bronze Dragonflight"},
    {21205, "INV_Jewelry_Ring_40", "Signet Ring of the Bronze Dragonflight"},
    {21206, "INV_Jewelry_Ring_40", "Signet Ring of the Bronze Dragonflight"},
    {21207, "INV_Jewelry_Ring_40", "Signet Ring of the Bronze Dragonflight"},
    {21208, "INV_Jewelry_Ring_40", "Signet Ring of the Bronze Dragonflight"},
    {21209, "INV_Jewelry_Ring_40", "Signet Ring of the Bronze Dragonflight"},
    {21210, "INV_Jewelry_Ring_40", "Signet Ring of the Bronze Dragonflight"},
    {21687, "INV_Jewelry_Ring_24", "Ukko's Ring of Darkness"},
    {1980, "INV_Jewelry_Ring_15", "Underworld Band"},
    {21190, "INV_Jewelry_Ring_40", "Wrath of Cenarius"},
    {19518, "INV_Jewelry_Ring_20", "Advisor's Ring"},
    {19519, "INV_Jewelry_Ring_20", "Advisor's Ring"},
    {19520, "INV_Jewelry_Ring_20", "Advisor's Ring"},
    {19521, "INV_Jewelry_Ring_20", "Advisor's Ring"},
    {20426, "INV_Jewelry_Ring_20", "Advisor's Ring"},
    {6693, "INV_Misc_Bone_05", "Agamaggan's Clutch"},
    {22326, "INV_Jewelry_Ring_19", "Amalgam's Band"},
    {11118, "INV_Stone_15", "Archaedic Stone"},
    {13095, "INV_Jewelry_Ring_04", "Assault Band"},
    {18585, "INV_Jewelry_Ring_09", "Band of Allegiance"},
    {22725, "INV_Jewelry_Ring_11", "Band of Cenarius"},
    {21182, "INV_Jewelry_Ring_19", "Band of Earthen Might"},
    {21179, "INV_Jewelry_Ring_18", "Band of Earthen Wrath"},
    {13373, "INV_Misc_Bone_04", "Band of Flesh"},
    {19925, "INV_Jewelry_Ring_44", "Band of Jin"},
    {22334, "INV_Jewelry_Ring_05", "Band of Mending"},
    {22681, "INV_Jewelry_Ring_33", "Band of Piety"},
    {12996, "INV_Jewelry_Ring_31", "Band of Purification"},
    {22680, "INV_Jewelry_Ring_01", "Band of Resolution"},
    {18103, "INV_Jewelry_Ring_16", "Band of Rumination"},
    {20721, "INV_Jewelry_Ring_27", "Band of the Cultist"},
    {13096, "INV_Jewelry_Ring_17", "Band of the Hierophant"},
    {18522, "INV_Jewelry_Ring_32", "Band of the Ogre King"},
    {22331, "INV_Jewelry_Ring_33", "Band of the Steadfast Hero"},
    {6332, "INV_Jewelry_Ring_05", "Black Pearl Ring"},
    {17713, "INV_Jewelry_Ring_17", "Blackstone Ring"},
    {17045, "INV_Jewelry_Ring_25", "Blood of the Martyr"},
    {22257, "INV_Jewelry_Ring_36", "Bloodclot Band"},
    {13093, "INV_Jewelry_Ring_25", "Blush Ember Ring"},
    {6440, "INV_Belt_30", "Brainlash"},
    {9461, "INV_Misc_Gear_01", "Charged Gear"},
    {20505, "INV_Jewelry_Ring_43", "Chivalrous Signet"},
    {20006, "INV_Jewelry_Ring_32", "Circle of Hope"},
    {11824, "INV_Jewelry_Ring_08", "Cyclopean Band"},
    {19302, "INV_Jewelry_Ring_34", "Darkmoon Ring"},
    {6463, "INV_Jewelry_Ring_15", "Deep Fathom Ring"},
    {19109, "INV_Jewelry_Ring_35", "Deep Rooted Ring"},
    {18684, "INV_Jewelry_Ring_15", "Dimly Opalescent Ring"},
    {22433, "INV_Jewelry_Ring_16", "Don Mauricio's Band of Domination"},
    {10710, "INV_Jewelry_Ring_04", "Dragonclaw Ring"},
    {10795, "INV_Jewelry_Ring_04", "Drakeclaw Band"},
    {9447, "INV_Misc_Gear_04", "Electrocutioner Lagnut"},
    {18395, "INV_Jewelry_Ring_11", "Emerald Flame Ring"},
    {11934, "INV_Jewelry_Ring_24", "Emperor's Seal"},
    {5266, "INV_Jewelry_Ring_05", "Eye of Adaegus"},
    {12545, "INV_Jewelry_Ring_05", "Eye of Orgrimmar"},
    {12926, "Spell_Holy_InnerFire", "Flaming Band"},
    {16058, "INV_Jewelry_Ring_19", "Fordring's Seal"},
    {18701, "INV_Jewelry_Ring_24", "Innervating Band"},
    {7686, "INV_Jewelry_Ring_04", "Ironspine's Eye"},
    {1156, "INV_Jewelry_Ring_09", "Lavishly Jeweled Ring"},
    {19510, "INV_Jewelry_Ring_21", "Legionnaire's Band"},
    {19511, "INV_Jewelry_Ring_21", "Legionnaire's Band"},
    {19512, "INV_Jewelry_Ring_21", "Legionnaire's Band"},
    {19513, "INV_Jewelry_Ring_21", "Legionnaire's Band"},
    {20429, "INV_Jewelry_Ring_21", "Legionnaire's Band"},
    {18586, "INV_Jewelry_Ring_13", "Lonetree's Circle"},
    {19522, "INV_Jewelry_Ring_28", "Lorekeeper's Ring"},
    {19523, "INV_Jewelry_Ring_28", "Lorekeeper's Ring"},
    {19524, "INV_Jewelry_Ring_28", "Lorekeeper's Ring"},
    {19525, "INV_Jewelry_Ring_28", "Lorekeeper's Ring"},
    {20431, "INV_Jewelry_Ring_28", "Lorekeeper's Ring"},
    {22255, "INV_Jewelry_Ring_04", "Magma Forged Band"},
    {12548, "INV_Jewelry_Ring_05", "Magni's Will"},
    {13283, "Spell_Holy_InnerFire", "Magus Ring"},
    {13001, "INV_Jewelry_Ring_12", "Maiden's Circle"},
    {2262, "INV_Jewelry_Ring_15", "Mark of Kern"},
    {9533, "INV_Jewelry_Ring_03", "Masons Fraternity Ring"},
    {10634, "INV_Jewelry_Ring_10", "Mindseye Circle"},
    {11669, "INV_Jewelry_Ring_05", "Naglering"},
    {18760, "INV_Jewelry_Ring_09", "Necromantic Band"},
    {9588, "INV_Jewelry_Ring_03", "Nogg's Gold Ring"},
    {18399, "INV_Jewelry_Ring_28", "Ocean's Breeze"},
    {19873, "INV_Jewelry_Ring_39", "Overlord's Crimson Band"},
    {19912, "INV_Jewelry_Ring_39", "Overlord's Onyx Band"},
    {13098, "INV_Jewelry_Ring_18", "Painweaver Band"},
    {2039, "INV_Jewelry_Ring_02", "Plains Ring"},
    {19920, "INV_Jewelry_Ring_47", "Primalist's Band"},
    {19863, "INV_Jewelry_Ring_47", "Primalist's Seal"},
    {19514, "INV_Jewelry_Ring_10", "Protector's Band"},
    {19515, "INV_Jewelry_Ring_10", "Protector's Band"},
    {19516, "INV_Jewelry_Ring_10", "Protector's Band"},
    {19517, "INV_Jewelry_Ring_10", "Protector's Band"},
    {20439, "INV_Jewelry_Ring_10", "Protector's Band"},
    {17982, "INV_Jewelry_Ring_25", "Ragnaros Core"},
    {12985, "INV_Jewelry_Ring_28", "Ring of Defense"},
    {18314, "INV_Jewelry_Ring_31", "Ring of Demonic Guile"},
    {18315, "INV_Jewelry_Ring_28", "Ring of Demonic Potency"},
    {21477, "INV_Jewelry_Ring_AhnQiraj_04", "Ring of Fury"},
    {1491, "INV_Jewelry_Ring_14", "Ring of Precision"},
    {15855, "INV_Jewelry_Ring_26", "Ring of Protection"},
    {21483, "INV_Jewelry_Ring_AhnQiraj_05", "Ring of the Desert Winds"},
    {2951, "INV_Jewelry_Ring_12", "Ring of the Underwood"},
    {13178, "INV_Jewelry_Ring_22", "Rosewine Circle"},
    {16999, "INV_Jewelry_Ring_30", "Royal Seal of Alexis"},
    {18022, "INV_Jewelry_Ring_30", "Royal Seal of Alexis"},
    {22339, "INV_Jewelry_Ring_35", "Rune Band of Wizardry"},
    {862, "INV_Belt_34", "Runed Ring"},
    {12344, "INV_Jewelry_Ring_01", "Seal of Ascension"},
    {19898, "INV_Jewelry_Ring_44", "Seal of Jin"},
    {13345, "INV_Jewelry_Ring_16", "Seal of Rivendare"},
    {6414, "INV_Jewelry_Ring_15", "Seal of Sylvanas"},
    {2933, "INV_Jewelry_Ring_05", "Seal of Wrynn"},
    {6321, "INV_Belt_29", "Silverlaine's Family Seal"},
    {12543, "INV_Jewelry_Ring_05", "Songstone of Ironforge"},
    {9538, "INV_Jewelry_Ring_03", "Talvash's Gold Ring"},
    {18500, "INV_Jewelry_Ring_13", "Tarnished Elven Ring"},
    {13392, "INV_Jewelry_Ring_23", "The Postmaster's Seal"},
    {13094, "INV_Jewelry_Ring_26", "The Queen's Jewel"},
    {12544, "INV_Jewelry_Ring_05", "Thrall's Resolve"},
    {13097, "INV_Jewelry_Ring_09", "Thunderbrow Ring"},
    {18398, "INV_Jewelry_Ring_10", "Tidal Loop"},
    {19905, "INV_Jewelry_Ring_46", "Zanzil's Band"},
    {19893, "INV_Jewelry_Ring_46", "Zanzil's Seal"},
    {11968, "INV_Jewelry_Ring_14", "Amber Hoop"},
    {11971, "INV_Jewelry_Ring_15", "Amethyst Band"},
    {11974, "INV_Jewelry_Ring_01", "Aquamarine Ring"},
    {12014, "INV_Jewelry_Ring_07", "Arctic Ring"},
    {4999, "INV_Belt_29", "Azora's Will"},
    {6678, "INV_Belt_32", "Band of Elven Grace"},
    {17694, "INV_Jewelry_Ring_02", "Band of the Fist"},
    {9642, "INV_Jewelry_Ring_10", "Band of the Great Tortoise"},
    {13217, "INV_Jewelry_Ring_30", "Band of the Penitent"},
    {3760, "INV_Jewelry_Ring_03", "Band of the Undercity"},
    {7553, "INV_Jewelry_Ring_11", "Band of the Unicorn"},
    {5007, "INV_Misc_Root_01", "Band of Thorns"},
    {18302, "INV_Jewelry_Ring_20", "Band of Vigor"},
    {11996, "INV_Jewelry_Ring_13", "Basalt Ring"},
    {6199, "INV_Misc_MonsterSpiderCarapace_01", "Black Widow Band"},
    {4998, "INV_Jewelry_Ring_04", "Blood Ring"},
    {4135, "INV_Misc_Bone_05", "Bloodbone Band"},
    {5351, "INV_Jewelry_Ring_01", "Bounty Hunter's Ring"},
    {9362, "INV_Jewelry_Ring_03", "Brilliant Gold Ring"},
    {11972, "INV_Jewelry_Ring_02", "Carnelian Loop"},
    {11985, "INV_Jewelry_Ring_08", "Cerulean Ring"},
    {15702, "INV_Misc_Bone_05", "Chemist's Ring"},
    {11868, "INV_Jewelry_Ring_15", "Choking Band"},
    {11983, "INV_Jewelry_Ring_05", "Chrome Ring"},
    {11993, "INV_Jewelry_Ring_14", "Clay Ring"},
    {5622, "INV_Belt_33", "Clergy Ring"},
    {11984, "INV_Jewelry_Ring_10", "Cobalt Ring"},
    {4550, "INV_Jewelry_Ring_10", "Coldwater Ring"},
    {11994, "INV_Jewelry_Ring_10", "Coral Band"},
    {13475, "INV_Jewelry_Ring_03", "Dalson Family Wedding Ring"},
    {11945, "INV_Jewelry_Ring_15", "Dark Iron Ring"},
    {1077, "INV_Jewelry_Ring_14", "Defias Mage Ring"},
    {1076, "INV_Jewelry_Ring_02", "Defias Renegade Ring"},
    {12054, "INV_Jewelry_Ring_04", "Demon Band"},
    {12058, "INV_Jewelry_Ring_01", "Demonic Bone Ring"},
    {12013, "INV_Jewelry_Ring_14", "Desert Ring"},
    {12057, "INV_Jewelry_Ring_14", "Dragonscale Band"},
    {17001, "INV_Jewelry_Ring_29", "Elemental Circle"},
    {7552, "INV_Jewelry_Ring_10", "Falcon's Hook"},
    {12010, "INV_Jewelry_Ring_04", "Fen Ring"},
    {12011, "INV_Jewelry_Ring_12", "Forest Hoop"},
    {18679, "INV_Jewelry_Ring_29", "Frigid Ring"},
    {18402, "INV_Jewelry_Ring_21", "Glowing Crystal Ring"},
    {10298, "INV_Jewelry_Ring_10", "Gnomeregan Band"},
    {18464, "INV_Jewelry_Ring_06", "Gordok Nose Ring"},
    {12005, "INV_Jewelry_Ring_01", "Granite Ring"},
    {11997, "INV_Jewelry_Ring_08", "Greenstone Circle"},
    {18674, "INV_Jewelry_Ring_14", "Hardened Stone Band"},
    {5001, "INV_Jewelry_Ring_04", "Heart Ring"},
    {11973, "INV_Jewelry_Ring_03", "Hematite Link"},
    {17692, "INV_Jewelry_Ring_02", "Horn Ring"},
    {15467, "INV_Jewelry_Ring_22", "Inventor's League Ring"},
    {11987, "INV_Jewelry_Ring_15", "Iridium Circle"},
    {4535, "INV_Jewelry_Ring_13", "Ironforge Memorial Ring"},
    {11995, "INV_Jewelry_Ring_05", "Ivory Band"},
    {11969, "INV_Jewelry_Ring_09", "Jacinth Circle"},
    {6757, "INV_Jewelry_Ring_05", "Jaina's Signet Ring"},
    {11978, "INV_Jewelry_Ring_04", "Jasper Link"},
    {11998, "INV_Jewelry_Ring_01", "Jet Loop"},
    {12016, "INV_Jewelry_Ring_08", "Jungle Ring"},
    {12038, "INV_Jewelry_Ring_03", "Lagrave's Seal"},
    {11981, "INV_Jewelry_Ring_01", "Lead Band"},
    {11999, "INV_Jewelry_Ring_02", "Lodestone Hoop"},
    {12002, "INV_Jewelry_Ring_04", "Marble Circle"},
    {10780, "INV_Jewelry_Ring_05", "Mark of Hakkar"},
    {12012, "INV_Jewelry_Ring_08", "Marsh Ring"},
    {12006, "INV_Jewelry_Ring_12", "Meadow Ring"},
    {5009, "INV_Jewelry_Ring_15", "Mindbender Loop"},
    {1449, "INV_Jewelry_Ring_13", "Minor Channeling Ring"},
    {6748, "INV_Jewelry_Ring_14", "Monkey Ring"},
    {20692, "INV_Jewelry_Ring_03", "Multicolored Band"},
    {18345, "INV_Jewelry_Ring_15", "Murmuring Ring"},
    {12004, "INV_Jewelry_Ring_01", "Obsidian Band"},
    {1993, "INV_Belt_35", "Ogremind Ring"},
    {12001, "INV_Jewelry_Ring_01", "Onyx Ring"},
    {11980, "INV_Jewelry_Ring_05", "Opal Ring"},
    {1189, "INV_Jewelry_Ring_03", "Overseer's Ring"},
    {11979, "INV_Jewelry_Ring_14", "Peridot Circle"},
    {18343, "INV_Jewelry_Ring_14", "Petrified Band"},
    {12007, "INV_Jewelry_Ring_02", "Prairie Ring"},
    {12017, "INV_Jewelry_Ring_09", "Prismatic Band"},
    {11965, "INV_Jewelry_Ring_05", "Quartz Ring"},
    {11991, "INV_Jewelry_Ring_01", "Quicksilver Ring"},
    {9622, "INV_Belt_33", "Reedknot Ring"},
    {6790, "INV_Jewelry_Ring_02", "Ring of Calm"},
    {2043, "INV_Jewelry_Ring_01", "Ring of Forlorn Spirits"},
    {10739, "INV_Jewelry_Ring_11", "Ring of Fortitude"},
    {1319, "INV_Belt_31", "Ring of Iron Will"},
    {18400, "INV_Jewelry_Ring_19", "Ring of Living Stone"},
    {1116, "INV_Jewelry_Ring_01", "Ring of Pure Silver"},
    {3235, "INV_Jewelry_Ring_15", "Ring of Scorn"},
    {19038, "INV_Jewelry_Ring_03", "Ring of Subtlety"},
    {12102, "INV_Jewelry_Ring_15", "Ring of the Aristocrat"},
    {12056, "INV_Jewelry_Ring_10", "Ring of the Heavens"},
    {12052, "INV_Jewelry_Ring_05", "Ring of the Moon"},
    {1462, "INV_Jewelry_Ring_15", "Ring of the Shadow"},
    {6669, "INV_Jewelry_Ring_12", "Sacred Band"},
    {11976, "INV_Jewelry_Ring_04", "Sardonyx Knuckle"},
    {12008, "INV_Jewelry_Ring_03", "Savannah Ring"},
    {4549, "INV_Jewelry_Ring_04", "Seafire Band"},
    {9655, "INV_Jewelry_Ring_12", "Seedtime Hoop"},
    {11990, "INV_Jewelry_Ring_04", "Selenium Loop"},
    {11977, "INV_Jewelry_Ring_12", "Serpentine Loop"},
    {11869, "INV_Jewelry_Ring_06", "Sha'ni's Ring"},
    {3739, "INV_Belt_12", "Skull Ring"},
    {6750, "INV_Jewelry_Ring_06", "Snake Hoop"},
    {11970, "INV_Jewelry_Ring_11", "Spinel Ring"},
    {12055, "INV_Jewelry_Ring_15", "Stardust Band"},
    {6743, "INV_Jewelry_Ring_08", "Sustaining Ring"},
    {12015, "INV_Jewelry_Ring_12", "Swamp Ring"},
    {11988, "INV_Jewelry_Ring_12", "Tellurium Band"},
    {11986, "INV_Jewelry_Ring_06", "Thallium Hoop"},
    {8350, "INV_Jewelry_Ring_03", "The 1 Ring"},
    {6749, "INV_Jewelry_Ring_13", "Tiger Band"},
    {11975, "INV_Jewelry_Ring_07", "Topaz Ring"},
    {5313, "INV_Misc_Root_02", "Totemic Clan Ring"},
    {15689, "INV_Jewelry_Ring_27", "Trader's Ring"},
    {2917, "INV_Jewelry_Ring_07", "Tranquil Ring"},
    {12009, "INV_Jewelry_Ring_05", "Tundra Ring"},
    {11989, "INV_Jewelry_Ring_08", "Vanadium Loop"},
    {11992, "INV_Jewelry_Ring_09", "Vermilion Band"},
    {11982, "INV_Jewelry_Ring_13", "Viridian Band"},
    {12053, "INV_Jewelry_Ring_01", "Volcanic Rock Ring"},
    {1996, "INV_Jewelry_Ring_15", "Voodoo Band"},
    {5011, "INV_Jewelry_Ring_12", "Welken Ring"},
    {11862, "INV_Misc_Bone_05", "White Bone Band"},
    {17768, "INV_Jewelry_Ring_18", "Woodseed Hoop"},
    {11967, "INV_Jewelry_Ring_07", "Zircon Band"},
    {7341, "INV_Jewelry_Ring_05", "Cubic Zirconia Ring"},
    {7340, "INV_Jewelry_Ring_10", "Flawless Diamond Solitaire"},
    {7339, "INV_Jewelry_Ring_07", "Miniscule Diamond Ring"},
    {7338, "INV_Jewelry_Ring_12", "Mood Ring"},
    {7342, "INV_Belt_33", "Silver Piffeny Band"},
    {7337, "INV_Jewelry_Ring_31", "The Rock"}
  };
  
  public static int[] getIDs() {
    int[] res = new int[rings.length];
    for (int i = 0; i < rings.length; i++) {
      res[i] = (int)rings[i][0];
    }
    return res;
  }
  
  public static String[] getIcons() {
    String[] res = new String[rings.length];
    for (int i = 0; i < rings.length; i++) {
      res[i] = (String)rings[i][1];
    }
    return res;
  }
  
  public static String[] getNames() {
    String[] res = new String[rings.length];
    for (int i = 0; i < rings.length; i++) {
      res[i] = (String)rings[i][2];
    }
    return res;
  }
  
  public static void main(String[] args) {
    int[] t1 = getIDs();
    String[] t2 = getIcons();
    String[] t3 = getNames();
    for (int i = 0; i < t1.length; i++) {
      System.out.println(t1[i] + ", " + t2[i] + ", " + t3[i]);
    }
  }
}
