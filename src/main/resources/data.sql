INSERT INTO User(first_name, last_name, password, email, want_newsletter, municipality, user_type, bio, user_img)
VALUES ('Christer', 'Falck', 'Chris123', 'Falcken@gmail.com', true, 'TRONDELAG', 'SELLER', 'Etter jeg flyttet til Trondheim for å åpne platesjappe har jeg ikke tid til hund lenger.
Derfor leter jeg etter et nytt hjem for min kjære følgesvenn de siste årene.', 'https://petmatch-academy.herokuapp.com/Sellers/Christer_Falck.jpg'),
('Eduardo', 'Martinez', 'Eddi1712', 'eduardo_12@gmail.com', false, 'OSLO', 'SELLER', 'Ved siden av jobben min hjelper jeg personer å distribuere sine kattunger og hunder.
Derfor har jeg lagt ut et par annonser her. Ta kontakt om du finner noen av de interessante:)', 'https://petmatch-academy.herokuapp.com/Sellers/Eduardo_Martinez.jpg'),
('Geir', 'Pettersen', 'Geir123', 'geir.p@gmail.com', true, 'VIKEN', 'SELLER', 'Jeg og kona har noen katter som har fått unger. Disse ønsker vi oss et nytt hjem til,
da vi ikke har så god kapasitet for gi alle ungene like mye kjærlighet og omsorg som en kattunge trenger.', 'https://petmatch-academy.herokuapp.com/Sellers/Geir_Pettersen.jpg'),
('Josefine', 'Kristiansen', 'JK12345', 'Yousofine@hotmail.com', true, 'VESTFOLD_OG_TELEMARK', 'SELLER', 'Katten vår hjemme har nettopp fått unger og vi ønsker ny eier for en fin liten kattepus.', 'https://petmatch-academy.herokuapp.com/Sellers/Josefine_Kristiansen.jpg'),
('William', 'Stange', 'Will123', 'william.s@gmail.com', true, 'OSLO', 'SELLER', 'Jeg jobber ved Dyrebeskyttelsen i Norge og vi har et par hunder og katter som trenger et nytt hjem:)', 'https://petmatch-academy.herokuapp.com/Sellers/William_Stange.jpg'),
('William', 'Stange', 'Will123', 'will@gmail.com', true, 'OSLO', 'BUYER', 'Jeg jobber ved Dyrebeskyttelsen i Norge og vi har et par hunder og katter som trenger et nytt hjem:)', 'https://petmatch-academy.herokuapp.com/Sellers/William_Stange.jpg');

INSERT INTO Animal (animal_type, name, age, is_chipped, is_vaccinated, is_sterilized, is_child_friendly, is_active, is_available, animal_size, is_female, owner_id, bio, animal_img1, animal_img2, animal_img3)
VAlUES ('DOG', 'Kafka', 1, true, true, true, true, false, true, 'MEDIUM', false, 1, 'Kafka ble funnet på gata i Spania, nå ser han etter et nytt hjem i Norge.', 'https://petmatch-academy.herokuapp.com/Dogs/Alaska_Husky_1.jpg', 'https://petmatch-academy.herokuapp.com/Dogs/Alaska_husky_2.jpg', 'https://petmatch-academy.herokuapp.com/Dogs/Alaska_Husky_3.jpg'),
('DOG', 'Ask', 4, false, true, false, true, true, true, 'SMALL', false, 2, 'Vi ser oss nødt til og få omplassert gogutten vår «ASK» på grunn av jobbsituasjonen vår.
Han er 4 år gammel. Vi ønsker å finne ett hjem som er i aktivitet rundt ham om dagene.
Han trives ikke å være aleine for lenge.', 'https://petmatch-academy.herokuapp.com/Dogs/Beagle_1.jpg', 'https://petmatch-academy.herokuapp.com/Dogs/Beagle_2.jpg', 'https://petmatch-academy.herokuapp.com/Dogs/Beagle_3.jpg'),
('DOG', 'Blazy', 9, true, false, true, true, true, true,'LARGE', false, 2, 'Jeg heter Blazy og er en 9 år gammel hund.
Jeg er en blanding av border collie og Irsk setter og er fortsatt glad i aktivitet, turer og lek.
Jeg er glad i barn, men litt utrygg på enkelte hunder.', 'https://petmatch-academy.herokuapp.com/Dogs/Border_Collie_1.jpg', 'https://petmatch-academy.herokuapp.com/Dogs/Border_Collie_2.jpg', ''),
('DOG', 'Lars', 1, true, true, true, false , false, true, 'SMALL', false , 2, 'På grunn av dvs omstendigheter så må Lars ha nytt hjem. Han er en chinese crested på 1 år, kastrert, frisk og rask. Vaksinert og chippet.
Lars kan markere inne, men det løser seg med bellyband eller bleie.', 'https://petmatch-academy.herokuapp.com/Dogs/Chinese_Crested_1.jpg', 'https://petmatch-academy.herokuapp.com/Dogs/Chinese_Crested_2.jpg', 'https://petmatch-academy.herokuapp.com/Dogs/Chinese_Crested_3.jpg'),
('DOG', 'Chico', 1, true, true, true, true, true, true, 'LARGE', true, 5, 'Vi gir bort Chico til et hyggelig hjem som kan ta vare på søte Chico.
gis bort grunnet corona gjør at vi ikke har kapasitet til å ha ta vare på henne.', 'https://petmatch-academy.herokuapp.com/Dogs/Dalmatiner_1.jpg', 'https://petmatch-academy.herokuapp.com/Dogs/Dalmatiner.jpg', ''),
 ('DOG', 'Ozzy', 4, true, false, false, false, false, true, 'SMALL', false, 5, 'Dette er IKKE en kosehund. Han trenger mye forståelse og trening. Han kan opptre aggresivt mot fremmede. Gis ikke bort til noen som ikke forstår hva det innebærer, han biter når han føler seg redd.
Ozzy er på jakt etter et nytt hjem pga astma og allergi påvist på vår sønn.', 'https://petmatch-academy.herokuapp.com/Dogs/Dvergpincher_1.jpg', 'https://petmatch-academy.herokuapp.com/Dogs/Dvergpincher_2.jpg', 'https://petmatch-academy.herokuapp.com/Dogs/Dvergpincher_3.jpg'),
('DOG', 'Nila', 2, true, false, true, true, true, true, 'LARGE', true, 5, 'Hun går overens med barn og andre hunder.
Hun er chippet og har pass (men mangler rabiesvaksinen for at passet skal være gyldig).', 'https://petmatch-academy.herokuapp.com/Dogs/Jack_Russel_1.jpg', 'https://petmatch-academy.herokuapp.com/Dogs/Jack_Russel_1.jpg', 'https://petmatch-academy.herokuapp.com/Dogs/Jack_Russel_1.jpg'),
('DOG', 'Tor', 1, true, true, true, true, true, true, 'MEDIUM', false, 5, 'Vi ønsker å finne ett hjem som er i aktivitet rundt ham om dagene. Han trives ikke å være aleine for lenge.
Han elsker lange turer og og har masse glede å gi.', 'https://petmatch-academy.herokuapp.com/Dogs/Norsk_Elghund_1.jpg', 'https://petmatch-academy.herokuapp.com/Dogs/Norsk_Elghund_2.jpg', 'https://petmatch-academy.herokuapp.com/Dogs/Norsk_Elghund_3.jpg'),
('DOG', 'Storm', 8, true, true , true, true, false, true, 'LARGE', false, 2,  'Det er med et tungt hjerte å omplassere hunden Storm.
Storm er snart 9 år, han er en blandingsrase (husky, border collie, Schafer og pointer). Han er kastrert og chippet.', 'https://petmatch-academy.herokuapp.com/Dogs/Schafer_1.jpg', 'https://petmatch-academy.herokuapp.com/Dogs/Schafer_2.jpg', ''),
('DOG', 'Leo', 2, true, true, true, true, true, true, 'MEDIUM', false, 2, 'En veldig aktiv og sporty hund.
Han har gått på valpekurs, kan de vanlige kommandoene, er kjempe villig til å lære så lenge en belønning finner sted etterpå.', 'https://petmatch-academy.herokuapp.com/Dogs/Staffordshire_Bull_Terrier_1.jpg', 'https://petmatch-academy.herokuapp.com/Dogs/Staffordshire_Bull_Terrier_2.jpg', 'https://petmatch-academy.herokuapp.com/Dogs/Staffordshire_Bull_Terrier_3.jpg'),
('DOG', 'Mitch', 4, true, true, true, false, false, true, 'SMALL', false, 5, 'Mitch er en sosial og glad hund, er vandt til katt og barn. Trives best når han får kos og blir klødd på brystet. Liker seg like godt foran vedovnen som ute i skogen.
Han er vandt til å være alene hjemme på dagtid mens jeg er på jobb.', 'https://petmatch-academy.herokuapp.com/Dogs/Tibetansk_Spaniel_1.jpg', 'https://petmatch-academy.herokuapp.com/Dogs/Tibetansk_Spaniel_2.jpg', ''),
('DOG', 'Prins', 3, true, true, true, true, true, true, 'SMALL', true, 5, 'Den er forholdsvis aktiv, og har et særdeles godt gemytt. Hunden er svært sosial og er veldig glad i mennesker, særlig barn.
Den er godt oppdratt og reagerer fint på andre hunder og ukjente mennesker. Hunden har aldri vist tegn til aggresjon og er neppe en god vakthund.', 'https://petmatch-academy.herokuapp.com/Dogs/Whippet_1.jpg', 'https://petmatch-academy.herokuapp.com/Dogs/Whippet_2.jpg', '');

INSERT INTO Animal (animal_type, name, age, is_chipped, is_vaccinated, is_sterilized, is_child_friendly, is_active, is_available, animal_size, is_female, owner_id, bio, animal_img1, animal_img2, animal_img3)
VAlUES ('CAT', 'Kitty', 3, true, true, true, true, false, true, 'Large', false, 3, 'Kan ikke ha katten lenger på grun av familiendring skriv og spør om det er noe..', 'https://petmatch-academy.herokuapp.com/Cats/Bengal_1.jpg', 'https://petmatch-academy.herokuapp.com/Cats/Bengal_2.jpg', 'https://petmatch-academy.herokuapp.com/Cats/Bengal_1.jpg'),
('CAT', 'Nusse', 2, false, true, false, false, true, true, 'LARGE', false, 2, 'Nusse (katten) 2 år gammel søker en kjærlig familie.Han er kjælen, trygg og god. Fantastisk gemytt, fin med barn. Fanger gjerne mus og jordrotter.
Han er sterilisert men ikke chippet, har fått alle vaksiner.', 'https://petmatch-academy.herokuapp.com/Cats/Devon_Rex_1.jpg', 'https://petmatch-academy.herokuapp.com/Cats/Devon_Rex_2.jpg', 'https://petmatch-academy.herokuapp.com/Cats/Devon_Rex_3.jpg'),
('CAT', 'Sjanten', 1, true, false, true, true, false, true,'SMALL', true, 2, 'Gis bort grunnet allergi.', 'https://petmatch-academy.herokuapp.com/Cats/Hellig_Birma_1.jpg', 'https://petmatch-academy.herokuapp.com/Cats/Hellig_Birma_2.jpg', 'https://petmatch-academy.herokuapp.com/Cats/Hellig_Birma_3.jpg'),
('CAT', 'Leila', 1, true, true, true, true, false, true, 'SMALL', false , 5, 'Leila kom inn til oss sammen med sine to små kattunger. Kattungene var dessverre syke og måtte rett til behandling, og er nå i et fosterhjem.
Leila derimot virker noe nedfor fra og være borte fra sine to små, samt finner seg ikke helt til rette i de nye omgivelsene her på senteret.', 'https://petmatch-academy.herokuapp.com/Cats/Maine_Coon_1.jpg', 'https://petmatch-academy.herokuapp.com/Cats/Maine_Coon_2.jpg', 'https://petmatch-academy.herokuapp.com/Cats/Maine_Coon_3.jpg'),
('CAT', 'Daisy', 1, false, false, false, false, true, true, 'SMALL', true, 3, 'Neva Masquerade er en god familiekatt. De er kjærlige og lekne. De er lojale og knytter seg til eieren sin.
De liker å være der det skjer, og koser seg som familiens midtpunkt. ', 'https://petmatch-academy.herokuapp.com/Cats/Neva_Masquerade_1.jpg', 'https://petmatch-academy.herokuapp.com/Cats/Neva_Masquerade_2.jpg', 'https://petmatch-academy.herokuapp.com/Cats/Neva_Masquerade_3.jpg'),
 ('CAT', 'Zooey', 2, true, true, true, true, true, true, 'LARGE', true, 3, 'Dette er en en svart jente som heter Zooey. Hun er utrolig herlig og sosial.
Hun er godt vant med hunder, da vi selv har hund og datteren vår har en hund de jevnlig har møtt gjennom oppveksten. De er godt vant med folk i alle aldre, og at det er mye liv og røre i huset vårt.', 'https://petmatch-academy.herokuapp.com/Cats/Norsk_Skogkatt_1.jpg', 'https://petmatch-academy.herokuapp.com/Cats/Norsk_Skogkatt_2.jpg', 'https://petmatch-academy.herokuapp.com/Cats/Norsk_Skogkatt_3.jpg'),
('CAT', 'Alex', 2, true, true, true, false, false, true, 'MEDIUM', true, 4, 'Vi har vakre perser kattunger til overs, passer bra som kosekatt.', 'https://petmatch-academy.herokuapp.com/Cats/Perser_1.jpg', 'https://petmatch-academy.herokuapp.com/Cats/Perser_2.jpg', 'https://petmatch-academy.herokuapp.com/Cats/Perser_3.jpg'),
('CAT', 'Musa', 6, true, true, true, true, true, true, 'LARGE', false, 5, 'Det er med klump i halsen at  ser meg nødt til å omplassere den lille ragdoll-pusen, Musa.
Sønnen min har utviklet allergi, og etter en periode med testing av ulike tiltak, med varierende suksess , innser jeg at at dette blir det eneste riktige nå..', 'https://petmatch-academy.herokuapp.com/Cats/Ragdoll_1.jpg', 'https://petmatch-academy.herokuapp.com/Cats/Ragdoll_2.jpg', 'https://petmatch-academy.herokuapp.com/Cats/Ragdoll_3.jpg'),
('CAT', 'Angel', 1, false, false, false, true, true, true, 'SMALL', false, 5, 'Sjelden Scottish straight gutt, kalt Angel gis bort.
Kattungen er veldig rasetypisk, fordi den har en veldig sjelden farge, med rundt hode, fine små ører, store runde og fine øyner som gjør at kattungen ligner på en bamse/ engler.', 'https://petmatch-academy.herokuapp.com/Cats/Scottish_Straight_1.jpg', 'https://petmatch-academy.herokuapp.com/Cats/Scottish_Straight_2.jpg', 'https://petmatch-academy.herokuapp.com/Cats/Scottish_Straight_3.jpg'),
('CAT', 'Siko', 2, true, true, true, false, false, true, 'MEDIUM', true, 2, 'Ble funnet sammen med flere andre skjønninger i en koloni på Jørpeland. Der levde vi ute i en usikker verden. Uten kjærlighet og omsorg. Vi ble heldigvis reddet og kjørt til dyrenes hus av dyrevenner. Tross at jeg ikke hadde hatt menneskelig kontakt ble jeg fort trygg.
Er en nyskjerrig og leken krabat som har blitt en skikkelig kosepus. Leken og nyskjerrig som alle andre kattunger.', 'https://petmatch-academy.herokuapp.com/Cats/Shengo_Siddis_1.jpg', 'https://petmatch-academy.herokuapp.com/Cats/Shengo_Siddis_2.jpg', 'https://petmatch-academy.herokuapp.com/Cats/Shengo_Siddis_3.jpg'),
('CAT', 'Pus', 5, true, true, true, true, false, true, 'MEDIUM', false, 5, 'Brownie er ei ung sibirdame som ønsker seg nytt hjem. Hun blir 5 år i juli. Hun ønsker et hjem hvor hun kan ha mulighet til å gå ut som hun vil, i trygge omgivelser.
Men hun må også ha mulighet til å være inne så mye hun vil.', 'https://petmatch-academy.herokuapp.com/Cats/Sibirkatt_1.jpg', 'https://petmatch-academy.herokuapp.com/Cats/Sibirkatt_2.jpg', 'https://petmatch-academy.herokuapp.com/Cats/Sibirkatt_3.jpg'),
('CAT', 'Gunnar', 2, false, false, false, true, false, true, 'SMALL', false, 3, 'Han er litt over et år, og vurderes gi bort om jeg finner rett hjem. Lyder navnet Gunnar ikke kastrert eller stamtavle.
Kjempe kosete og skal helst følge deg overalt.', 'https://petmatch-academy.herokuapp.com/Cats/Sphynx_1.jpg', 'https://petmatch-academy.herokuapp.com/Cats/Sphynx_2.jpg', '');

INSERT INTO Dog (id, breed)
VALUES (1, 'ALASKA_HUSKY'), (2, 'BEAGLE'), (3, 'BORDER_COLLIE'), (4, 'CHINESE_CRESTED'), (5, 'DALMATINER'), (6, 'DVERGPINCHER'),
(7, 'JACK_RUSSEL'), (8, 'NORSK_ELGHUND'), (9, 'SCHAFER'), (10, 'STAFFORDSHIRE_BULL_TERRIER'), (11, 'TIBETANSK_SPANIEL'), (12, 'WHIPPET');

INSERT INTO Cat (id, breed)
VALUES (13, 'BENGAL'), (14, 'DEVON_REX'), (15, 'HELLIG_BIRMA'), (16, 'MAINE_COON'), (17, 'NEVA_MASQUERADE'), (18, 'NORSK_SKOGKATT'),
(19, 'PERSER'), (20, 'RAGDOLL'), (21, 'SCOTTISH_STRAIGHT'), (22, 'SHENGO_SIDDIS'), (23, 'SIBIRKATT'), (24, 'SPHYNX');

INSERT INTO Matches(animal_id, user_id)
VALUES (1,2), (2,3), (3,1), (4,2), (1,3), (13, 1), (13, 5), (13,4);

INSERT INTO Buyer(id, animal_type, home_type, is_previous_animal_owner, has_children)
VALUES (6,'DOG', 'HOUSE', TRUE, FALSE);

INSERT INTO User (first_name, last_name, email, password, user_img, user_type)
VALUES ('Hal', 'Bas', 'hb@gmail.com', 123, 'https://petmatch-academy.herokuapp.com/Sellers/William_Stange.jpg', 'BUYER');

INSERT INTO Matches(animal_id, user_id, approved)
VALUES (1, 7, TRUE);