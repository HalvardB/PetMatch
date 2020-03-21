CREATE TABLE USER(
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  first_name VARCHAR (20),
  last_name VARCHAR(30),
  password VARCHAR(50),
  email VARCHAR(50),
  want_newsletter BOOLEAN,
  municipality ENUM ('AGDER', 'INNLANDET', 'MORE_OG_ROMSDAL', 'NORDLAND',
  'OSLO', 'ROGALAND', 'VESTFOLD_OG_TELEMARK', 'TROMS_OG_FINNMARK', 'TRONDELAG',
  'VESTLAND', 'VIKEN'),
  user_type ENUM ('BUYER', 'SELLER'),
  bio VARCHAR(500),
  user_img VARCHAR(100)
);

CREATE TABLE BUYER(
  id BIGINT,
  animal_type ENUM ('DOG', 'CAT'),
  home_type ENUM ('APARTMENT', 'HOUSE'),
  is_previous_animal_owner BOOLEAN,
  has_children BOOLEAN,
  FOREIGN KEY (id) REFERENCES USER(id)
);


CREATE TABLE ANIMAL(
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  animal_type ENUM ('DOG', 'CAT'),
  name VARCHAR (20),
  age INT(2),
  is_chipped BOOLEAN,
  is_vaccinated BOOLEAN,
  is_sterilized BOOLEAN,
  is_child_friendly BOOLEAN,
  is_active BOOLEAN,
  is_available BOOLEAN,
  animal_size ENUM ('SMALL', 'MEDIUM', 'LARGE'),
  is_female BOOLEAN,
  owner_id BIGINT,
  bio VARCHAR(500),
  animal_img1 VARCHAR(100) default null,
  animal_img2 VARCHAR(100) default null,
  animal_img3 VARCHAR(100) default null,
  FOREIGN KEY (owner_id) REFERENCES USER(id)
);

CREATE TABLE DOG(
  id BIGINT,
  breed ENUM ('ALASKA_HUSKY', 'BEAGLE', 'BORDER_COLLIE', 'CHINESE_CRESTED',
    'DALMATINER', 'DVERGPINCHER', 'JACK_RUSSEL', 'NORSK_ELGHUND', 'SCHAFER',
    'STAFFORDSHIRE_BULL_TERRIER', 'TIBETANSK_SPANIEL', 'WHIPPET'),
	FOREIGN KEY (id) REFERENCES ANIMAL(id)
);

CREATE TABLE CAT(
  id BIGINT,
  breed ENUM ('BENGAL', 'DEVON_REX', 'HELLIG_BIRMA', 'MAINE_COON', 'NEVA_MASQUERADE',
    'NORSK_SKOGKATT', 'PERSER', 'RAGDOLL', 'SCOTTISH_STRAIGHT', 'SHENGO_SIDDIS',
    'SIBIRKATT', 'SPHYNX'),
    FOREIGN KEY (id) REFERENCES ANIMAL(id)
);

CREATE TABLE MATCH(
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  animal_id BIGINT,
  user_id BIGINT,
  approved BOOLEAN default false,
  FOREIGN KEY (animal_id) REFERENCES ANIMAL(id),
  FOREIGN KEY (user_id) REFERENCES USER(id)
);