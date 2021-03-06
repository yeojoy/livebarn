package me.yeojoy.livebarn

import me.yeojoy.livebarn.model.LbSurface
import kotlin.random.Random

class DummyMaker {
    fun getDummyData(): List<LbSurface> {
        return listOf(
            LbSurface(39,"Rink #1","Bellerive Ice Center","Hockey","OK",null, null, false),
            LbSurface(776,"BAY Rink","Bethlehem Area YMCA","Hockey","OK",null, null, false),
            LbSurface(689,"Biddeford Ice Arena","Biddeford Arena \u0026 Expo Center","Hockey","OK",null, null, false),
            LbSurface(48,"Rink #1","Bill Gray\u0027s Regional Iceplex","Hockey","OK",null, null, false),
            LbSurface(49,"Rink #2","Bill Gray\u0027s Regional Iceplex","Hockey","OK",null, null, false),
            LbSurface(51,"Rink #4","Bill Gray\u0027s Regional Iceplex","Hockey","OK",null, null, false),
            LbSurface(894,"Rink 1","Bloomington Ice Center","Hockey","OK",null, null, false),
            LbSurface(1286,"Rink #2","Boston Sports Institute (Wellesley)","Hockey","OK",null, null, false),
            LbSurface(351,"\u002799 Rink","Brewster Ice Arena","Hockey","OK",null, null, false),
            LbSurface(133,"East Rink","Bridgewater Ice Arena","Hockey","OK",null, null, false),
            LbSurface(134,"West Rink","Bridgewater Ice Arena","Hockey","OK",null, null, false),
            LbSurface(193,"Rink #1","Bucks County Ice","Hockey","OK",null, null, false),
            LbSurface(453,"Rink #1","Buffalo RiverWorks","Hockey","OK",null, null, false),
            LbSurface(434,"Rink #1","Buffone Arena","Hockey","OK",null, null, false),
            LbSurface(1219,"Gary R. Harker Rink","Burnsville Ice Center","Hockey","OK",null, null, false),
            LbSurface(766,"Main Rink","Camden National Bank Ice Vault","Hockey","OK",null, null, false),
            LbSurface(1361,"Rink #1","Campion Ice House","Hockey","OK",null, null, false),
            LbSurface(41,"South Rink","Canlan Ice Sports West Dundee (formerly Leafs Ice Centre)","Hockey","OK",null, null, false),
            LbSurface(372,"Main Rink","Carlson Ice Arena","Hockey","OK",null, null, false),
            LbSurface(1011,"East Rink","Center Ice Arena","Hockey","OK",null, null, false),
            LbSurface(1012,"West Rink","Center Ice Arena","Hockey","OK",null, null, false),
            LbSurface(563,"American Rink","Center Ice of DuPage","Hockey","OK",null, null, false),
            LbSurface(564,"International Rink","Center Ice of DuPage","Hockey","OK",null, null, false),
            LbSurface(540,"Katok #1","Center for Physical Education, Sport and Health","Hockey","OK",null, null, false),
            LbSurface(229,"Glace Olympique","Centre Bruno-Verret","Hockey","OK",null, null, false),
            LbSurface(1149,"Rink #2","Centre Ice Arena Traverse City","Hockey","OK",null, null, false),
            LbSurface(933,"Main Rink","Centre Ice Rink","Hockey","OK",null, null, false),
            LbSurface(226,"Guy Scott","Centre Multi Sport Chateauguay","Hockey","OK",null, null, false),
            LbSurface(28,"Kim St-Pierre","Centre Multi Sport Chateauguay","Hockey","OK",null, null, false),
            LbSurface(27,"Leo Crepin","Centre Multi Sport Chateauguay","Hockey","OK",null, null, false),
            LbSurface(777,"Main Rink","Centre R??cr??atif G??rard Couillard","Hockey","OK",null, null, false),
            LbSurface(17,"Rink #1","Centre Sportif La Prairie","Hockey","OK",null, null, false),
            LbSurface(337,"Glace Desjardins","Centre d\u0027Excellence Sports Rousseau","Hockey","OK",null, null, false),
            LbSurface(338,"Glace Rousseau","Centre d\u0027Excellence Sports Rousseau","Hockey","OK",null, null, false),
            LbSurface(191,"Rink #1","Chaparral Ice Center","Hockey","OK",null, null, false),
            LbSurface(655,"Rink #1","Chaska Community Center Ice Rink","Hockey","OK",null, null, false),
            LbSurface(480,"Rink #1","Chelmsford Forum","Hockey","OK",null, null, false),
            LbSurface(221,"Red Rink","Chestermere Regional Community Association","Hockey","OK",null, null, false),
            LbSurface(483,"Green Rink","Children\u0027s Health StarCenter Euless","Hockey","OK",null, null, false),
            LbSurface(485,"Tom Gaglardi Rink","Children\u0027s Health StarCenter Farmers Branch","Hockey","OK",null, null, false),
            LbSurface(763,"Brenden Morrow Rink","Children\u0027s Health StarCenter Mansfield","Hockey","OK",null, null, false),
            LbSurface(486,"North Rink","Children\u0027s Health StarCenter McKinney","Hockey","OK",null, null, false),
            LbSurface(487,"South Rink","Children\u0027s Health StarCenter McKinney","Hockey","OK",null, null, false),
            LbSurface(421,"Blue Rink","Children\u0027s Health StarCenter Richardson","Hockey","OK",null, null, false),
            LbSurface(422,"Red Rink","Children\u0027s Health StarCenter Richardson","Hockey","OK",null, null, false),
            LbSurface(153,"Norman Green","Children\u0027s Health StarCenter Valley Ranch","Hockey","OK",null, null, false),
            LbSurface(918,"Gerald Owen Rink","Chilled Ponds","Hockey","OK",null, null, false),
            LbSurface(919,"LTD Rink","Chilled Ponds","Hockey","OK",null, null, false),
            LbSurface(929,"Rink #1","City Ice Pavilion","Hockey","OK",null, null, false),
            LbSurface(42,"Rink #1","Colis??e de Laval","Hockey","OK",null, null, false),
            LbSurface(1040,"Main Rink","Columbia Ice Rink","Hockey","OK",null, null, false),
            LbSurface(138,"Honco","Complexe 2 Glaces Honco","Hockey","OK",null, null, false),
            LbSurface(137,"Valero","Complexe 2 Glaces Honco","Hockey","OK",null, null, false),
            LbSurface(21,"Rink #1","Complexe Branchaud-Bri??re","Hockey","OK",null, null, false),
            LbSurface(22,"Rink #2","Complexe Branchaud-Bri??re","Hockey","OK",null, null, false),
            LbSurface(359,"Glace #1","Complexe JC Perreault","Hockey","OK",null, null, false),
            LbSurface(15,"Rink #3","Complexe Sportif Guimond","Hockey","OK",null, null, false),
            LbSurface(895,"Glace A","Complexe Sportif L\u0027Ancienne-Lorette","Hockey","OK",null, null, false),
            LbSurface(896,"Glace B","Complexe Sportif L\u0027Ancienne-Lorette","Hockey","OK",null, null, false),
            LbSurface(474,"Rink #1","Connery Rink","Hockey","OK",null, null, false),
            LbSurface(353,"Rink 1","Conway Arena","Hockey","OK",null, null, false),
            LbSurface(592,"Ice Rink","Cool Sports","Hockey","OK",null, null, false),
            LbSurface(751,"Kenan Rink","Cornerstone CFCU Arena","Hockey","OK",null, null, false),
            LbSurface(439,"Rink #1","Cronin Rink","Hockey","OK",null, null, false),
            LbSurface(62,"Blue Rink","Crowchild Twin Arena","Hockey","OK",null, null, false),
            LbSurface(61,"Red Rink","Crowchild Twin Arena","Hockey","OK",null, null, false),
            LbSurface(334,"South Arena","Crystal Fieldhouse","Hockey","OK",null, null, false),
            LbSurface(124,"Rink #1","Cyclones Arena","Hockey","OK",null, null, false),
            LbSurface(125,"Rink #2","Cyclones Arena","Hockey","OK",null, null, false),
            LbSurface(746,"Patriot Rink","Danbury Ice Arena","Hockey","OK",null, null, false),
            LbSurface(268,"Rink #1","Darien Ice House","Hockey","OK",null, null, false),
            LbSurface(660,"Norris Rink","Darien Sportsplex","Hockey","OK",null, null, false),
            LbSurface(1156,"Rink #1","Daytona Ice Arena","Hockey","OK",null, null, false),
            LbSurface(1177,"Rink #1","Dee Stadium","Hockey","OK",null, null, false),
            LbSurface(457,"Rink #1","Delano Area Sports Arena","Hockey","OK",null, null, false),
            LbSurface(470,"Rink #1","Driscoll Arena","Hockey","OK",null, null, false),
            LbSurface(303,"The Dome","Eagle River Recreation Association","Hockey","OK",null, null, false),
            LbSurface(431,"North Rink","Ellenton Ice and Sports Complex","Hockey","OK",null, null, false),
            LbSurface(430,"South Rink","Ellenton Ice and Sports Complex","Hockey","OK",null, null, false),
            LbSurface(329,"Rink #2","Essex Sports Center","Hockey","OK",null, null, false),
            LbSurface(286,"Main Rink","Extreme Ice Center","Hockey","OK",null, null, false),
            LbSurface(285,"Training Rink","Extreme Ice Center","Hockey","OK",null, null, false),
            LbSurface(1053,"Rink #1","Family Ice Center","Hockey","OK",null, null, false),
            LbSurface(569,"Hamilton","Family Sports Ice Arena","Hockey","OK",null, null, false),
            LbSurface(666,"Chicago Mission Rink","Fifth Third Arena","Hockey","OK",null, null, false),
            LbSurface(473,"Rink #1","Fitzpatrick Arena","Hockey","OK",null, null, false),
            LbSurface(899,"Nova Rink","Floyd Hall Arena","Hockey","OK",null, null, false),
            LbSurface(724,"Rink #1","Flynn Rink","Hockey","OK",null, null, false),
            LbSurface(1271,"Rink #1","Ford Ice Center Antioch","Hockey","OK",null, null, false),
            LbSurface(1272,"Rink #2","Ford Ice Center Antioch","Hockey","OK",null, null, false),
            LbSurface(1274,"Rink #2","Ford Ice Center Bellevue","Hockey","OK",null, null, false),
            LbSurface(755,"Main Arena","Franklin Park Ice Arena","Hockey","OK",null, null, false),
            LbSurface(479,"Rink #1","Gardner Veterans Arena","Hockey","OK",null, null, false),
            LbSurface(92,"North Rink","Glacier Ice Arena IL","Hockey","OK",null, null, false),
            LbSurface(91,"South Rink","Glacier Ice Arena IL","Hockey","OK",null, null, false),
            LbSurface(272,"Rink A","Granby Multi-Sports","Hockey","OK",null, null, false),
            LbSurface(19,"Rink B","Granby Multi-Sports","Hockey","OK",null, null, false),
            LbSurface(20,"Rink C","Granby Multi-Sports","Hockey","OK",null, null, false),
            LbSurface(697,"Rink #1","Great Falls Ice Plex","Hockey","OK",null, null, false),
            LbSurface(1010,"Rink #1","Greensboro Ice House","Hockey","OK",null, null, false),
            LbSurface(1044,"Rink #1","Hagerstown Ice and Sports Complex","Hockey","OK",null, null, false),
            LbSurface(29,"Grey Sheet","Hatfield Ice","Hockey","OK",null, null, false),
            LbSurface(53,"Blue Rink","Haverhill Valley Forum","Hockey","OK",null, null, false),
            LbSurface(1265,"Ressler Rink","Haynes Pavilion","Hockey","OK",null, null, false),
            LbSurface(1051,"Rink #1","Hockeytown USA","Hockey","OK",null, null, false),
            LbSurface(1073,"Olympic Rink","Hollydell Ice Arena","Hockey","OK",null, null, false),
            LbSurface(475,"Rink #1","Horgan Arena","Hockey","OK",null, null, false),
            LbSurface(1157,"Roadside Rink","Ice Castle Arena","Hockey","OK",null, null, false),
            LbSurface(686,"Apex Rink","Ice Den Scottsdale","Hockey","OK",null, null, false),
            LbSurface(643,"Rink #4","Ice House","Hockey","OK",null, null, false),
            LbSurface(1320,"Main Rink","Ice Hutch","Hockey","OK",null, null, false),
            LbSurface(641,"Rink A Black Bear","Ice Land Skating Center","Hockey","OK",null, null, false),
            LbSurface(642,"Rink B Phantom","Ice Land Skating Center","Hockey","OK",null, null, false),
            LbSurface(47,"Rink #3","Ice Line","Hockey","OK",null, null, false),
            LbSurface(217,"Rink #4","Ice Line","Hockey","OK",null, null, false),
            LbSurface(998,"Rink #1","Ice Pond at Waunakee","Hockey","OK",null, null, false),
            LbSurface(228,"South Rink","Ice-Plex Escondido","Hockey","OK",null, null, false),
            LbSurface(986,"Rink #2","IceWorks Skating Complex","Hockey","OK",null, null, false),
            LbSurface(981,"South Rink","Iceland Sports Complex","Hockey","OK",null, null, false),
            LbSurface(753,"Red Rink","Igloo at Mt. Laurel","Hockey","OK",null, null, false),
            LbSurface(1357,"Ion Rink","Ion International Training Center","Hockey","OK",null, null, false),
            LbSurface(556,"Chambly Honda","Isatis Sport Chambly","Hockey","OK",null, null, false),
            LbSurface(554,"Desjardins","Isatis Sport Chambly","Hockey","OK",null, null, false),
            LbSurface(557,"Banque Nationale","Isatis Sport St-Constant","Hockey","OK",null, null, false),
            LbSurface(559,"Zero-C","Isatis Sport St-Constant","Hockey","OK",null, null, false),
            LbSurface(562,"Antonio Moreau","Isatis Sport St-Hyacinthe","Hockey","OK",null, null, false),
            LbSurface(728,"Campion Rink","James W. Campion III Rink","Hockey","OK",null, null, false),
            LbSurface(717,"Red Rink","Jersey Shore Arena","Hockey","OK",null, null, false),
            LbSurface(413,"Rink #1","Jim Roche Community Arena","Hockey","OK",null, null, false),
            LbSurface(588,"Johnny\u0027s East","Johnny\u0027s IceHouse East","Hockey","OK",null, null, false),
            LbSurface(595,"Johnny\u0027s West","Johnny\u0027s IceHouse West","Hockey","OK",null, null, false),
            LbSurface(1169,"Sailun Tire Rink (North Rink)","Jonathan Toews Sportsplex","Hockey","OK",null, null, false),
            LbSurface(293,"Rink #1","Keene Ice","Hockey","OK",null, null, false),
            LbSurface(1276,"Rink #1","Kent Valley Ice Centre","Hockey","OK",null, null, false),
            LbSurface(703,"Main Rink","Kiwanis Ice Arena","Hockey","OK",null, null, false),
            LbSurface(1181,"Rink #1","LA Kings Ice at Pickwick Gardens","Hockey","OK",null, null, false),
            LbSurface(159,"Rink B","LA Kings Icetown","Hockey","OK",null, null, false),
            LbSurface(1252,"Glacier Rink","LA Kings Valley Ice Center","Hockey","OK",null, null, false),
            LbSurface(1176,"Rink #1","Lakeland Ice Arena - Florida","Hockey","OK",null, null, false),
            LbSurface(1137,"Main Rink","Lancerlot Sports Complex","Hockey","OK",null, null, false),
            LbSurface(73,"Rink #2","Langley Sportsplex","Hockey","OK",null, null, false),
            LbSurface(182,"Rink #4","Langley Sportsplex","Hockey","OK",null, null, false),
            LbSurface(760,"Main Rink","Malone Civic Center","Hockey","OK",null, null, false),
            LbSurface(757,"Main Rink","Massena Arena","Hockey","OK",null, null, false),
            LbSurface(632,"Rink #1","McCann Ice Arena","Hockey","OK",null, null, false),
            LbSurface(791,"Rink #1","Merrill Fay Arena","Hockey","OK",null, null, false),
            LbSurface(775,"MRC Rink","MidCoast Recreation Center","Hockey","OK",null, null, false),
            LbSurface(1263,"Madhouse","Midwest Training and Ice Center","Hockey","OK",null, null, false),
            LbSurface(1055,"West Rink","Monument Ice Rinks","Hockey","OK",null, null, false),
            LbSurface(327,"North Rink","Mount Prospect Ice Arena","Hockey","OK",null, null, false),
            LbSurface(399,"Rink #1","Mullett Ice Center","Hockey","OK",null, null, false),
            LbSurface(145,"Dave Torrey Arena","Municipal Athletic Complex (MAC)","Hockey","OK",null, null, false),
            LbSurface(873,"Rink #1","NTPRD Chiller","Hockey","OK",null, null, false),
            LbSurface(1245,"Main Rink","Naga-Waukee Ice Arena","Hockey","OK",null, null, false),
            LbSurface(412,"Rink #1","Navin Arena","Hockey","OK",null, null, false),
            LbSurface(88,"Red Rink","Newington Arena","Hockey","OK",null, null, false),
            LbSurface(903,"Arena 1","NexSource Centre","Hockey","OK",null, null, false),
            LbSurface(970,"Main Rink","North Buffalo Ice Rink","Hockey","OK",null, null, false),
            LbSurface(183,"Red Rink","Northford Ice Pavilion","Hockey","OK",null, null, false),
            LbSurface(347,"Rink #1","Northland Ice Center","Hockey","OK",null, null, false),
            LbSurface(294,"Riley Rink","Northshire Civic Center","Hockey","OK",null, null, false),
            LbSurface(707,"Rink C","Northstar Ice Sports","Hockey","OK",null, null, false),
            LbSurface(368,"Olympic Rink","Northtown Center at Amherst","Hockey","OK",null, null, false),
            LbSurface(536,"NHL Rink","Oakland Ice Center","Hockey","OK",null, null, false),
            LbSurface(537,"Olympic Rink","Oakland Ice Center","Hockey","OK",null, null, false),
            LbSurface(239,"Main Rink","Oakton Ice Arena","Hockey","OK",null, null, false),
            LbSurface(657,"Rink #1","Ocean Ice Palace","Hockey","OK",null, null, false),
            LbSurface(765,"Rink #1","Oceanside Ice Arena","Hockey","OK",null, null, false),
            LbSurface(865,"Rink #2","OhioHealth Chiller Dublin","Hockey","OK",null, null, false),
            LbSurface(734,"Rink #1","Oilers Ice Center","Hockey","OK",null, null, false),
            LbSurface(77,"Rink #2","Olympia Ice Center","Hockey","OK",null, null, false),
            LbSurface(761,"Main Rink","Olympicview Arena","Hockey","OK",null, null, false),
            LbSurface(198,"Rink #1","Onyx Rochester Ice Arena","Hockey","OK",null, null, false),
            LbSurface(199,"Rink #2","Onyx Rochester Ice Arena","Hockey","OK",null, null, false),
            LbSurface(1225,"Rink #1","Orbit Ice Arena","Hockey","OK",null, null, false),
            LbSurface(1129,"Main Rink","Oshkosh Community YMCA","Hockey","OK",null, null, false),
            LbSurface(264,"Rink #1","Palm Beach Skate Zone","Hockey","OK",null, null, false),
            LbSurface(265,"Rink #2","Palm Beach Skate Zone","Hockey","OK",null, null, false),
            LbSurface(1226,"Rink #3","Palm Beach Skate Zone","Hockey","OK",null, null, false),
            LbSurface(990,"Rink #1","Patinoire de la Gl??ne","Hockey","OK",null, null, false),
            LbSurface(115,"Olympic Rink","Patriot Ice Center (formerly Pond Ice Arena)","Hockey","OK",null, null, false),
            LbSurface(223,"Rink #1","Piney Orchard Ice Arena","Hockey","OK",null, null, false),
            LbSurface(1167,"Rink #2","Piney Orchard Ice Arena","Hockey","OK",null, null, false),
            LbSurface(433,"Rink #1","Pirelli Veterans Arena","Hockey","OK",null, null, false),
            LbSurface(331,"Black Arena","Pittsburgh Ice Arena","Hockey","OK",null, null, false),
            LbSurface(786,"Main Rink","Polar Ice House Cary","Hockey","OK",null, null, false),
            LbSurface(541,"Forest Rink","Polar Ice House Wake Forest","Hockey","OK",null, null, false),
            LbSurface(542,"Wake Rink","Polar Ice House Wake Forest","Hockey","OK",null, null, false),
            LbSurface(1139,"Rink #1","Polar Ice Plex","Hockey","OK",null, null, false),
            LbSurface(1232,"Rink #1","Pop Whalen Ice Center","Hockey","OK",null, null, false),
            LbSurface(1166,"NHL Rink","Protec Ponds Ice Center","Hockey","OK",null, null, false),
            LbSurface(585,"Rink #1","Richfield Ice Arena","Hockey","OK",null, null, false),
            LbSurface(586,"Rink #2","Richfield Ice Arena","Hockey","OK",null, null, false),
            LbSurface(427,"Rink #1","Robert Hartley Sports Complex","Hockey","OK",null, null, false),
            LbSurface(691,"Colonials Rink","Robert Morris RMU Island Sports Center","Hockey","OK",null, null, false),
            LbSurface(692,"Olympic Rink","Robert Morris RMU Island Sports Center","Hockey","OK",null, null, false),
            LbSurface(441,"Lake Placid","Rocket Ice Skating Rink","Hockey","OK",null, null, false),
            LbSurface(371,"Rink #1","Rockland Ice Rink","Hockey","OK",null, null, false),
            LbSurface(102,"Rink #1","Rockville Ice Arena","Hockey","OK",null, null, false),
            LbSurface(101,"Rink #2","Rockville Ice Arena","Hockey","OK",null, null, false),
            LbSurface(225,"Rink #3","Rockville Ice Arena","Hockey","OK",null, null, false),
            LbSurface(32,"JetSpeed (NHL)","Rodman Arena","Hockey","OK",null, null, false),
            LbSurface(280,"RCC Rink","Runestone Community Center","Hockey","OK",null, null, false),
            LbSurface(756,"Ice Rink","S\u0026T Bank Arena","Hockey","OK",null, null, false),
            LbSurface(288,"Stampede (North) Rink","SCHEELS IcePlex","Hockey","OK",null, null, false),
            LbSurface(290,"Zueger Leadership (South) Rink","SCHEELS IcePlex","Hockey","OK",null, null, false),
            LbSurface(354,"Rink #1","Schenectady County Recreation Facility","Hockey","OK",null, null, false),
            LbSurface(948,"Rink #1","Serpentini Arena Winterhurst","Hockey","OK",null, null, false),
            LbSurface(949,"Rink #2","Serpentini Arena Winterhurst","Hockey","OK",null, null, false),
            LbSurface(330,"NHL Rink","Seven Bridges Ice Arena","Hockey","OK",null, null, false),
            LbSurface(629,"William G. Allyn Ice Arena","Skaneateles YMCA and Community Center","Hockey","OK",null, null, false),
            LbSurface(732,"Olympic Rink","SkateQuest","Hockey","OK",null, null, false),
            LbSurface(67,"East Rink","Sky Rink at Chelsea Piers","Hockey","OK",null, null, false),
            LbSurface(104,"West Rink","Sky Rink at Chelsea Piers","Hockey","OK",null, null, false),
            LbSurface(424,"Forum Rink","Skylands Ice World","Hockey","OK",null, null, false),
            LbSurface(435,"Rink #1","Smead Arena","Hockey","OK",null, null, false),
            LbSurface(1049,"Rink #1","Sno-King Kirkland","Hockey","OK",null, null, false),
            LbSurface(1047,"Rink #1","Sno-King Renton","Hockey","OK",null, null, false),
            LbSurface(1048,"Rink #2","Sno-King Renton","Hockey","OK",null, null, false),
            LbSurface(745,"Training Rink","SoNo Ice House","Hockey","OK",null, null, false),
            LbSurface(545,"Fremont","Solar4America Ice at Fremont","Hockey","OK",null, null, false),
            LbSurface(549,"Center Rink","Solar4America Ice at San Jose","Hockey","OK",null, null, false),
            LbSurface(548,"East Rink","Solar4America Ice at San Jose","Hockey","OK",null, null, false),
            LbSurface(547,"South Rink","Solar4America Ice at San Jose","Hockey","OK",null, null, false),
            LbSurface(1269,"Rink #1","Somerville Veterans Memorial Rink","Hockey","OK",null, null, false),
            LbSurface(553,"Delio","South Suburban Ice Arena","Hockey","OK",null, null, false),
            LbSurface(429,"Rink #1","Space Coast Iceplex","Hockey","OK",null, null, false),
            LbSurface(343,"Rink #1","Sportplexe Pierrefonds","Hockey","OK",null, null, false),
            LbSurface(344,"Rink #2","Sportplexe Pierrefonds","Hockey","OK",null, null, false),
            LbSurface(345,"Rink #3","Sportplexe Pierrefonds","Hockey","OK",null, null, false),
            LbSurface(346,"Rink #4","Sportplexe Pierrefonds","Hockey","OK",null, null, false),
            LbSurface(167,"Totem 2","Spray Lake Sawmills Family Sports Centre","Hockey","OK",null, null, false),
            LbSurface(168,"Totem 3","Spray Lake Sawmills Family Sports Centre","Hockey","OK",null, null, false),
            LbSurface(451,"East Rink","Stamford Twin Rinks","Hockey","OK",null, null, false),
            LbSurface(452,"West Rink","Stamford Twin Rinks","Hockey","OK",null, null, false),
            LbSurface(242,"Blue Rink","StoneRidge Ice Centre","Hockey","OK",null, null, false),
            LbSurface(169,"Rink #2","Suburban Ice East Lansing","Hockey","OK",null, null, false),
            LbSurface(196,"Gatorade Rink","Suburban Ice Farmington Hills","Hockey","OK",null, null, false),
            LbSurface(66,"Rink #1","Suburban Ice Macomb","Hockey","OK",null, null, false),
            LbSurface(38,"Rink B","Sugar Land Ice and Sports Center","Hockey","OK",null, null, false),
            LbSurface(1065,"NHL Rink","Summit Sports and Ice Complex","Hockey","OK",null, null, false),
            LbSurface(1064,"Olympic Rink","Summit Sports and Ice Complex","Hockey","OK",null, null, false),
            LbSurface(55,"Rink #1","Superior Ice Rink","Hockey","OK",null, null, false),
            LbSurface(1037,"South Rink","Tacoma Twin Rinks","Hockey","OK",null, null, false),
            LbSurface(369,"Rink #1","The Bog Ice Arena","Hockey","OK",null, null, false),
            LbSurface(100,"Lower Rink","The Edge Sports Center","Hockey","OK",null, null, false),
            LbSurface(99,"Upper Rink","The Edge Sports Center","Hockey","OK",null, null, false),
            LbSurface(574,"East Rink","The Edge on Jefferson","Hockey","OK",null, null, false),
            LbSurface(783,"LHA Rink","The Ice Ranch","Hockey","OK",null, null, false),
            LbSurface(784,"TBird","The Ice Ranch","Hockey","OK",null, null, false),
            LbSurface(211,"Rink #1","The Pond Ice Rink","Hockey","OK",null, null, false),
            LbSurface(106,"Supreme","The Rinks at Exeter","Hockey","OK",null, null, false),
            LbSurface(105,"Vapor","The Rinks at Exeter","Hockey","OK",null, null, false),
            LbSurface(491,"Lower Rink","The Rinks at Shelton","Hockey","OK",null, null, false),
            LbSurface(492,"Upper Rink","The Rinks at Shelton","Hockey","OK",null, null, false),
            LbSurface(71,"East Rink","The Rinks at Summit Centre","Hockey","OK",null, null, false),
            LbSurface(70,"West Rink","The Rinks at Summit Centre","Hockey","OK",null, null, false),
            LbSurface(1256,"Rink #1","Thorncliffe Greenview Community Arena","Hockey","OK",null, null, false),
            LbSurface(727,"Main Rink","Toyota Arena","Hockey","OK",null, null, false),
            LbSurface(404,"Teifer Arena","Trenton Kennedy Recreation Center","Hockey","OK",null, null, false),
            LbSurface(349,"South Rink","Tri-Town Ice Arena","Hockey","OK",null, null, false),
            LbSurface(571,"Rink #1","Twin Oaks Ice Rink","Hockey","OK",null, null, false),
            LbSurface(121,"Pond #1","Twin Ponds East","Hockey","OK",null, null, false),
            LbSurface(567,"Rink #1","URI Boss Arena","Hockey","OK",null, null, false),
            LbSurface(282,"Rink #1","UTC Ice Sports Center","Hockey","OK",null, null, false),
            LbSurface(736,"Rink #1","Uihlein Ice Arena","Hockey","OK",null, null, false),
            LbSurface(355,"Rink #1","Veterans Memorial Skating Rink","Hockey","OK",null, null, false),
            LbSurface(481,"Rink #1","Wallace Civic Center","Hockey","OK",null, null, false),
            LbSurface(157,"Rink #1","West Warwick Civic Center","Hockey","OK",null, null, false),
            LbSurface(902,"Olympic Rink","Wichita Ice Center","Hockey","OK",null, null, false),
            LbSurface(1159,"Main Rink","Willowbrook Ice Arena","Hockey","OK",null, null, false),
            LbSurface(490,"Gray Rink","Worcester Ice Center","Hockey","OK",null, null, false),
            LbSurface(922,"HPAC #2","Henry S Parker Athletic Complex","Baseball","OK",null, null, false)
        )
    }

    fun getDummyDataWithSize(size: Int): List<LbSurface> {
        var rawData = getDummyData().toMutableList()
        val resultData = mutableListOf<LbSurface>()
        val collectionSize = if (size > rawData.size) rawData.size else size

        var index = 0
        while (true) {
            if (index == collectionSize) {
                break
            }
            val i = Random(0).nextInt(rawData.size)
            println("Index : $i / rawData size : ${rawData.size}")
            resultData.add(rawData.removeAt(i))
            index++
        }

        return resultData
    }
}