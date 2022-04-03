package es.ramonhg.whatscheck;

import java.util.Arrays;
import java.util.List;

/**
 * The Constants class holds a list of {@link es.ramonhg.whatscheck.Country} instances that each represent a country.
 *
 * The list was obtained online from Wikipedia and the flags were obtained via Flagpedia.net.
 * It was easy to create the code for this class using a combination of .csv files and MS Notepad's Replace feature
 * Some flags weren't present and addition to the list will be highly appreciated.
 * */
public class Constants {

    public static final List<Country> countries = Arrays.asList(
            new Country("Afghanistan","AF","93",R.mipmap.af),
            new Country("Aland Islands","AX","358",R.mipmap.ax),
            new Country("Albania","AL","355",R.mipmap.al),
            new Country("Algeria","DZ","213",R.mipmap.dz),
            new Country("American Samoa","AS","1684",R.mipmap.as),
            new Country("Andorra","AD","376",R.mipmap.ad),
            new Country("Angola","AO","244",R.mipmap.ao),
            new Country("Anguilla","AI","1264",R.mipmap.ai),
            new Country("Antarctica","AQ","672",R.mipmap.aq),
            new Country("Antigua and Barbuda","AG","1268",R.mipmap.ag),
            new Country("Argentina","AR","54",R.mipmap.ar),
            new Country("Armenia","AM","374",R.mipmap.am),
            new Country("Aruba","AW","297",R.mipmap.aw),
            new Country("Australia","AU","61",R.mipmap.au),
            new Country("Austria","AT","43",R.mipmap.at),
            new Country("Azerbaijan","AZ","994",R.mipmap.az),
            new Country("Bahamas","BS","1242",R.mipmap.bs),
            new Country("Bahrain","BH","973",R.mipmap.bh),
            new Country("Bangladesh","BD","880",R.mipmap.bd),
            new Country("Barbados","BB","1246",R.mipmap.bb),
            new Country("Belarus","BY","375",R.mipmap.by),
            new Country("Belgium","BE","32",R.mipmap.be),
            new Country("Belize","BZ","501",R.mipmap.bz),
            new Country("Benin","BJ","229",R.mipmap.bj),
            new Country("Bermuda","BM","1441",R.mipmap.bm),
            new Country("Bhutan","BT","975",R.mipmap.bt),
            new Country("Bolivia","BO","591",R.mipmap.bo),
            new Country("Bonaire","BQ","599",R.mipmap.bq),
            new Country("Bosnia and Herzegovina","BA","387",R.mipmap.ba),
            new Country("Botswana","BW","267",R.mipmap.bw),
            new Country("Bouvet Island","BV","55",R.mipmap.bv),
            new Country("Brazil","BR","55",R.mipmap.br),
            new Country("British Indian Ocean Territory","IO","246",R.mipmap.io),
            new Country("British Virgin Islands","VG","1284",R.mipmap.vg),
            new Country("Brunei","BN","673",R.mipmap.bn),
            new Country("Bulgaria","BG","359",R.mipmap.bg),
            new Country("Burkina Faso","BF","226",R.mipmap.bf),
            new Country("Burundi","BI","257",R.mipmap.bi),
            new Country("Cambodia","KH","855",R.mipmap.kh),
            new Country("Cameroon","CM","237",R.mipmap.cm),
            new Country("Canada","CA","1",R.mipmap.ca),
            new Country("Cape Verde","CV","238",R.mipmap.cv),
            new Country("Cayman Islands","KY","1345",R.mipmap.ky),
            new Country("Central African Republic","CF","236",R.mipmap.cf),
            new Country("Chad","TD","235",R.mipmap.td),
            new Country("Chile","CL","56",R.mipmap.cl),
            new Country("China","CN","86",R.mipmap.cn),
            new Country("Christmas Island","CX","61",R.mipmap.cx),
            new Country("Cocos Islands","CC","61",R.mipmap.cc),
            new Country("Colombia","CO","57",R.mipmap.co),
            new Country("Comoros","KM","269",R.mipmap.km),
            new Country("Congo","CG","242",R.mipmap.cg),
            new Country("Cook Islands","CK","682",R.mipmap.ck),
            new Country("Costa Rica","CR","506",R.mipmap.cr),
            new Country("Croatia","HR","385",R.mipmap.hr),
            new Country("Cuba","CU","53",R.mipmap.cu),
            new Country("Curacao","CW","599",R.mipmap.cw),
            new Country("Cyprus","CY","357",R.mipmap.cy),
            new Country("Czech Republic","CZ","420",R.mipmap.cz),
            new Country("Democratic Republic of Congo","CD","243",R.mipmap.cd),
            new Country("Denmark","DK","45",R.mipmap.dk),
            new Country("Djibouti","DJ","253",R.mipmap.dj),
            new Country("Dominica","DM","1767",R.mipmap.dm),
            new Country("Dominican Republic","DO","1809",R.mipmap.f_do),
            new Country("Ecuador","EC","593",R.mipmap.ec),
            new Country("Egypt","EG","20",R.mipmap.eg),
            new Country("El Salvador","SV","503",R.mipmap.sv),
            new Country("England","ENG","44",0),
            new Country("Equatorial Guinea","GQ","240",R.mipmap.gq),
            new Country("Eritrea","ER","291",R.mipmap.er),
            new Country("Estonia","EE","372",R.mipmap.ee),
            new Country("Ethiopia","ET","251",R.mipmap.et),
            new Country("Falkland Islands","FK","500",R.mipmap.fk),
            new Country("Faroe Islands","FO","298",R.mipmap.fo),
            new Country("Fiji","FJ","679",R.mipmap.fj),
            new Country("Finland","FI","358",R.mipmap.fi),
            new Country("France","FR","33",R.mipmap.fr),
            new Country("French Guiana","GF","594",R.mipmap.gf),
            new Country("French Polynesia","PF","689",R.mipmap.pf),
            new Country("French Southern Territories","TF","262",R.mipmap.tf),
            new Country("Gabon","GA","241",R.mipmap.ga),
            new Country("Gambia","GM","220",R.mipmap.gm),
            new Country("Georgia","GE","995",R.mipmap.ge),
            new Country("Germany","DE","49",R.mipmap.de),
            new Country("Ghana","GH","233",R.mipmap.gh),
            new Country("Gibraltar","GI","350",R.mipmap.gi),
            new Country("Greece","GR","30",R.mipmap.gr),
            new Country("Greenland","GL","299",R.mipmap.gl),
            new Country("Grenada","GD","1473",R.mipmap.gd),
            new Country("Guadeloupe","GP","590",R.mipmap.gp),
            new Country("Guam","GU","1671",R.mipmap.gu),
            new Country("Guatemala","GT","502",R.mipmap.gt),
            new Country("Guernsey","GG","44",R.mipmap.gg),
            new Country("Guinea","GN","224",R.mipmap.gn),
            new Country("Guinea-Bissau","GW","245",R.mipmap.gw),
            new Country("Guyana","GY","592",R.mipmap.gy),
            new Country("Haiti","HT","509",R.mipmap.ht),
            new Country("Heard Island and McDonald Islands","HM","672",R.mipmap.hm),
            new Country("Honduras","HN","504",R.mipmap.hn),
            new Country("Hong Kong","HK","852",R.mipmap.hk),
            new Country("Hungary","HU","36",R.mipmap.hu),
            new Country("Iceland","IS","354",R.mipmap.is),
            new Country("India","IN","91",R.mipmap.in),
            new Country("Indonesia","ID","62",R.mipmap.id),
            new Country("Iran","IR","98",R.mipmap.ir),
            new Country("Iraq","IQ","964",R.mipmap.iq),
            new Country("Ireland","IE","353",R.mipmap.ie),
            new Country("Isle of Man","IM","44",R.mipmap.im),
            new Country("Israel","IL","972",R.mipmap.il),
            new Country("Italy","IT","39",R.mipmap.it),
            new Country("Ivory Coast","CI","225",R.mipmap.ci),
            new Country("Jamaica","JM","1876",R.mipmap.jm),
            new Country("Japan","JP","81",R.mipmap.jp),
            new Country("Jersey","JE","44",R.mipmap.je),
            new Country("Jordan","JO","962",R.mipmap.jo),
            new Country("Kazakhstan","KZ","7",R.mipmap.kz),
            new Country("Kenya","KE","254",R.mipmap.ke),
            new Country("Kiribati","KI","686",R.mipmap.ki),
            new Country("Kosovo","XK","383",R.mipmap.xk),
            new Country("Kuwait","KW","965",R.mipmap.kw),
            new Country("Kyrgyzstan","KG","996",R.mipmap.kg),
            new Country("Laos","LA","856",R.mipmap.la),
            new Country("Latvia","LV","371",R.mipmap.lv),
            new Country("Lebanon","LB","961",R.mipmap.lb),
            new Country("Lesotho","LS","266",R.mipmap.ls),
            new Country("Liberia","LR","231",R.mipmap.lr),
            new Country("Libya","LY","218",R.mipmap.ly),
            new Country("Liechtenstein","LI","423",R.mipmap.li),
            new Country("Lithuania","LT","370",R.mipmap.lt),
            new Country("Luxembourg","LU","352",R.mipmap.lu),
            new Country("Macau","MO","853",R.mipmap.mo),
            new Country("Macedonia","MK","389",R.mipmap.mk),
            new Country("Madagascar","MG","261",R.mipmap.mg),
            new Country("Malawi","MW","265",R.mipmap.mw),
            new Country("Malaysia","MY","60",R.mipmap.my),
            new Country("Maldives","MV","960",R.mipmap.mv),
            new Country("Mali","ML","223",R.mipmap.ml),
            new Country("Malta","MT","356",R.mipmap.mt),
            new Country("Marshall Islands","MH","692",R.mipmap.mh),
            new Country("Martinique","MQ","596",R.mipmap.mq),
            new Country("Mauritania","MR","222",R.mipmap.mr),
            new Country("Mauritius","MU","230",R.mipmap.mu),
            new Country("Mayotte","YT","262",R.mipmap.yt),
            new Country("Mexico","MX","52",R.mipmap.mx),
            new Country("Micronesia","FM","691",R.mipmap.fm),
            new Country("Moldova","MD","373",R.mipmap.md),
            new Country("Monaco","MC","377",R.mipmap.mc),
            new Country("Mongolia","MN","976",R.mipmap.mn),
            new Country("Montenegro","ME","382",R.mipmap.me),
            new Country("Montserrat","MS","1664",R.mipmap.ms),
            new Country("Morocco","MA","212",R.mipmap.ma),
            new Country("Mozambique","MZ","258",R.mipmap.mz),
            new Country("Myanmar","MM","95",R.mipmap.mm),
            new Country("Namibia","NA","264",R.mipmap.na),
            new Country("Nauru","NR","674",R.mipmap.nr),
            new Country("Nepal","NP","977",R.mipmap.np),
            new Country("Netherlands","NL","31",R.mipmap.nl),
            new Country("Netherlands Antilles","AN","599",0),
            new Country("New Caledonia","NC","687",R.mipmap.nc),
            new Country("New Zealand","NZ","64",R.mipmap.nz),
            new Country("Nicaragua","NI","505",R.mipmap.ni),
            new Country("Niger","NE","227",R.mipmap.ne),
            new Country("Nigeria","NG","234",R.mipmap.ng),
            new Country("Niue","NU","683",R.mipmap.nu),
            new Country("Norfolk Island","NF","672",R.mipmap.nf),
            new Country("North Korea","KP","850",R.mipmap.kp),
            new Country("Northern Ireland","NIR","44",0),
            new Country("Northern Mariana Islands","MP","1670",R.mipmap.mp),
            new Country("Norway","NO","47",R.mipmap.no),
            new Country("Oman","OM","968",R.mipmap.om),
            new Country("Pakistan","PK","92",R.mipmap.pk),
            new Country("Palau","PW","680",R.mipmap.pw),
            new Country("Palestine","PS","970",R.mipmap.ps),
            new Country("Panama","PA","507",R.mipmap.pa),
            new Country("Papua New Guinea","PG","675",R.mipmap.pg),
            new Country("Paraguay","PY","595",R.mipmap.py),
            new Country("Peru","PE","51",R.mipmap.pe),
            new Country("Philippines","PH","63",R.mipmap.ph),
            new Country("Pitcairn Islands","PN","64",R.mipmap.pn),
            new Country("Poland","PL","48",R.mipmap.pl),
            new Country("Portugal","PT","351",R.mipmap.pt),
            new Country("Puerto Rico","PR","1787",R.mipmap.pr),
            new Country("Qatar","QA","974",R.mipmap.qa),
            new Country("Reunion","RE","262",R.mipmap.re),
            new Country("Romania","RO","40",R.mipmap.ro),
            new Country("Russia","RU","7",R.mipmap.ru),
            new Country("Rwanda","RW","250",R.mipmap.rw),
            new Country("Saint Barthelemy","BL","590",R.mipmap.bl),
            new Country("Saint Helena Ascension and Tristan da Cunha","SH","290",R.mipmap.sh),
            new Country("Saint Kitts and Nevis","KN","1869",R.mipmap.kn),
            new Country("Saint Lucia","LC","1758",R.mipmap.lc),
            new Country("Saint Martin","MF","590",R.mipmap.mf),
            new Country("Saint Pierre and Miquelon","PM","508",R.mipmap.pm),
            new Country("Saint Vincent and the Grenadines","VC","1784",R.mipmap.vc),
            new Country("Samoa","WS","685",R.mipmap.ws),
            new Country("San Marino","SM","378",R.mipmap.sm),
            new Country("Sao Tome and Principe","ST","239",R.mipmap.st),
            new Country("Saudi Arabia","SA","966",R.mipmap.sa),
            new Country("Scotland","SCT","44",0),
            new Country("Senegal","SN","221",R.mipmap.sn),
            new Country("Serbia","RS","381",R.mipmap.rs),
            new Country("Seychelles","SC","248",R.mipmap.sc),
            new Country("Sierra Leone","SL","232",R.mipmap.sl),
            new Country("Singapore","SG","65",R.mipmap.sg),
            new Country("Sint Maarten","SX","1721",R.mipmap.sx),
            new Country("Slovakia","SK","421",R.mipmap.sk),
            new Country("Slovenia","SI","386",R.mipmap.si),
            new Country("Solomon Islands","SB","677",R.mipmap.sb),
            new Country("Somalia","SO","252",R.mipmap.so),
            new Country("South Africa","ZA","27",R.mipmap.za),
            new Country("South Georgia and the South Sandwich Islands","GS","500",R.mipmap.gs),
            new Country("South Korea","KR","82",R.mipmap.kr),
            new Country("South Sudan","SS","211",R.mipmap.ss),
            new Country("Spain","ES","34",R.mipmap.es),
            new Country("Sri Lanka","LK","94",R.mipmap.lk),
            new Country("Sudan","SD","249",R.mipmap.sd),
            new Country("Suriname","SR","597",R.mipmap.sr),
            new Country("Svalbard and Jan Mayen","SJ","47",R.mipmap.sj),
            new Country("Swaziland","SZ","268",R.mipmap.sz),
            new Country("Sweden","SE","46",R.mipmap.se),
            new Country("Switzerland","CH","41",R.mipmap.ch),
            new Country("Syria","SY","963",R.mipmap.sy),
            new Country("Taiwan","TW","886",R.mipmap.tw),
            new Country("Tajikistan","TJ","992",R.mipmap.tj),
            new Country("Tanzania","TZ","255",R.mipmap.tz),
            new Country("Thailand","TH","66",R.mipmap.th),
            new Country("Timor-Leste","TL","670",R.mipmap.tl),
            new Country("Togo","TG","228",R.mipmap.tg),
            new Country("Tokelau","TK","690",R.mipmap.tk),
            new Country("Tonga","TO","676",R.mipmap.to),
            new Country("Trinidad and Tobago","TT","1868",R.mipmap.tt),
            new Country("Tunisia","TN","216",R.mipmap.tn),
            new Country("Turkey","TR","90",R.mipmap.tr),
            new Country("Turkmenistan","TM","993",R.mipmap.tm),
            new Country("Turks and Caicos Islands","TC","1649",R.mipmap.tc),
            new Country("Tuvalu","TV","688",R.mipmap.tv),
            new Country("UAE","AE","971",R.mipmap.ae),
            new Country("Uganda","UG","256",R.mipmap.ug),
            new Country("UK","GB","44",R.mipmap.gb),
            new Country("Ukraine","UA","380",R.mipmap.ua),
            new Country("Uruguay","UY","598",R.mipmap.uy),
            new Country("US Minor Outlying Islands","UM","1",R.mipmap.um),
            new Country("US Virgin Islands","VI","1340",R.mipmap.vi),
            new Country("USA","US","1",R.mipmap.us),
            new Country("Uzbekistan","UZ","998",R.mipmap.uz),
            new Country("Vanuatu","VU","678",R.mipmap.vu),
            new Country("Vatican City","VA","379",R.mipmap.va),
            new Country("Venezuela","VE","58",R.mipmap.ve),
            new Country("Vietnam","VN","84",R.mipmap.vn),
            new Country("Wales","WLS","44",0),
            new Country("Wallis and Futuna","WF","681",R.mipmap.wf),
            new Country("Western Sahara","EH","212",R.mipmap.eh),
            new Country("Yemen","YE","967",R.mipmap.ye),
            new Country("Zambia","ZM","260",R.mipmap.zm),
            new Country("Zimbabwe","ZW","263",R.mipmap.zw)
    );

    /**The size attribute might come in handy more than once. Let's just make it into a static constant, shall we?*/
    public static final String size = String.valueOf(countries.size());
}