INSERT INTO USER(first_name, last_name, password, email, want_newsletter, municipality, user_type, bio)
VALUES ('Christer', 'Falck', 'Chris123', 'Falcken@gmail.com', true, 'TRONDELAG', 'SELLER', 'Etter jeg flyttet til Trondheim for å åpne platesjappe har jeg ikke tid til hund lenger.
Derfor leter jeg etter et nytt hjem for min kjære følgesvenn de siste årene.'),
('Eduardo', 'Martinez', 'Eddi1712', 'eduardo_12@gmail.com', false, 'OSLO', 'SELLER', 'Ved siden av jobben min hjelper jeg personer å distribuere sine kattunger.
Derfor har jeg lagt ut et par annonser her. Ta kontakt om du finner noen av de interessante:)'),
('Geir', 'Pettersen', 'Geir123', 'geir.p@gmail.com', true, 'VIKEN', 'SELLER', 'Jeg og kona har noen katter som har fått unger. Disse ønsker vi oss et nytt hjem til,
da vi ikke har så god kapasitet for gi alle ungene like mye kjærlighet og omsorg som en kattunge trenger.'),
('Josefine', 'Kristiansen', 'JK12345', 'Yousofine@hotmail.com', true, 'VESTFOLD_OG_TELEMARK', 'SELLER', 'Katten vår hjemme har nettopp fått unger og vi ønsker ny eier for en fin liten kattepus.'),
('William', 'Stange', 'Will123', 'william.s@gmail.com', true, 'OSLO', 'SELLER', 'Jeg jobber ved Dyrebeskyttelsen i Norge og vi har et par hunder som trenger et nytt hjem:)');

INSERT INTO animal (animal_type, name, age, is_chipped, is_vaccinated, is_sterilized, is_child_friendly, is_active, is_available, animal_size, is_female, owner_id, bio)
VAlUES ('DOG', 'Kafka', 1, true, true, true, true, false, true, 'MEDIUM', false, 1, 'Kafka ble funnet på gata i Spania, nå ser han etter et nytt hjem i Norge.'),
('DOG', 'Ask', 4, false, true, false, true, true, true, 'SMALL', false, 2, 'Vi ser oss nødt til og få omplassert gogutten vår «ASK» på grunn av jobbsituasjonen vår.
Han er 4 år gammel. Vi ønsker å finne ett hjem som er i aktivitet rundt ham om dagene.
Han trives ikke å være aleine for lenge.'),
('DOG', 'Blazy', 9, true, false, true, true, true, true,'LARGE', false, 2, 'Jeg heter Blazy og er en 9 år gammel hund.
Jeg er en blanding av border collie og Irsk setter og er fortsatt glad i aktivitet, turer og lek.
Jeg er glad i barn, men litt utrygg på enkelte hunder.'),
('DOG', 'Lars', 1, true, true, true, false , false, true, 'SMALL', false , 2, 'På grunn av dvs omstendigheter så må Lars ha nytt hjem. Han er en chinese crested på 1 år, kastrert, frisk og rask. Vaksinert og chippet.
Lars kan markere inne, men det løser seg med bellyband eller bleie.'),
('DOG', 'Chico', 1, true, true, true, true, true, true, 'LARGE', true, 5, 'Vi gir bort Chico til et hyggelig hjem som kan ta vare på søte Chico.
gis bort grunnet corona gjør at vi ikke har kapasitet til å ha ta vare på henne.'),
 ('DOG', 'Ozzy', 4, true, false, false, false, false, true, 'SMALL', false, 5, 'Dette er IKKE en kosehund. Han trenger mye forståelse og trening. Han kan opptre aggresivt mot fremmede. Gis ikke bort til noen som ikke forstår hva det innebærer, han biter når han føler seg redd.
Ozzy er på jakt etter et nytt hjem pga astma og allergi påvist på vår sønn.'),
('DOG', 'Nila', 2, true, false, true, true, true, true, 'LARGE', true, 5, 'Hun går overens med barn og andre hunder.
Hun er chippet og har pass (men mangler rabiesvaksinen for at passet skal være gyldig).'),
('DOG', 'Tor', 1, true, true, true, true, true, true, 'MEDIUM', false, 5, 'Vi ønsker å finne ett hjem som er i aktivitet rundt ham om dagene. Han trives ikke å være aleine for lenge.
Han elsker lange turer og og har masse glede å gi.'),
('DOG', 'Storm', 8, true, true , true, true, false, true, 'LARGE', false, 2,  'Det er med et tungt hjerte å omplassere hunden Storm.
Storm er snart 9 år, han er en blandingsrase (husky, border collie, Schafer og pointer). Han er kastrert og chippet.'),
('DOG', 'Leo', 2, true, true, true, true, true, true, 'MEDIUM', false, 2, 'En veldig aktiv og sporty hund.
Han har gått på valpekurs, kan de vanlige kommandoene, er kjempe villig til å lære så lenge en belønning finner sted etterpå.'),
('DOG', 'Mitch', 4, true, true, true, false, false, true, 'SMALL', false, 5, 'Mitch er en sosial og glad hund, er vandt til katt og barn. Trives best når han får kos og blir klødd på brystet. Liker seg like godt foran vedovnen som ute i skogen.
Han er vandt til å være alene hjemme på dagtid mens jeg er på jobb.'),
('DOG', 'Prins', 3, true, true, true, true, true, true, 'SMALL', true, 5, 'Den er forholdsvis aktiv, og har et særdeles godt gemytt. Hunden er svært sosial og er veldig glad i mennesker, særlig barn.
Den er godt oppdratt og reagerer fint på andre hunder og ukjente mennesker. Hunden har aldri vist tegn til aggresjon og er neppe en god vakthund.');











INSERT INTO animal (animal_type, name, age, bio, is_chipped, is_vaccinated, is_sterilized, is_child_friendly, is_Active, is_Available, animal_size, is_female)
VALUES ('DOG', 'Kafka', 1, 'Kafka ble funnet på gata i Spania, nå ser han etter et nytt hjem i Norge.
', true, true, true, true, true, true, 'MEDIUM', false);
INSERT INTO dog (id, breed)
VALUES (1, 'ALASKA_HUSKY');
