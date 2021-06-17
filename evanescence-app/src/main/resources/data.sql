INSERT INTO public.t_address(id, road, zip_code, city_name)
VALUES 
(-1, '2 Jeantille Peear', '75015', 'Paris'),
(-2, '118 boulevard Raspail', '75015', 'Paris'),
(-3, '23 rue Depay Gill', '51100', 'Reims'),
(-4, '2 impasse Villa des Colombes', '92000', 'Nanterre'),
(-5, '11 rue de la plage Pigalle', '92000', 'Nanterre'),
(-6, '10 avenue Gouverneur de la rosée', '97200', 'Fort de France'),
(-7, '47 rue du Général Mangin', '97200', 'Fort de France'),
(-8, 'Carrefour de insurrection', '92170', 'Vanves'),
(-9, '2 chemin des papayes', '97230', 'Sainte Marie'),
(-10, '12 place des anciennes platations', '97130', 'Capesterre-Belle-Eau'),
(-11, '20 Boulevard des criquets', '95130', 'Franconville'),
(-12, '5 rue Gaston Thali', '95130', 'Franconville'),
(-13, '52 Boulevard Vaugirard', '95130', 'Franconville'),
(-14, '45 rue des Bougainvilliers', '97100', 'Saint-Claude'),
(-15, '30 Boulevard Vaugirard', '75015', 'Paris'),
(-16, '1 place Aimé Césaire', '97200', 'Fort de France'),
(-17, '18 impasse des écoliers', '97232', 'Lamentin'),
(-18, '34 rue des colibris', '97231', 'Carbet'),
(-19, '7 rue de la paix','75018','Paris'),
(-20, '1 place des arbres voyageurs','97500','Saint Pierre'),
(-21, '3 avenue Louis Ecureuil','75018','Paris'),
(-22, '41 chemin de la Montagne Pelée','97260','Morne Rouge'),
(-23, '2 rue Paille Mare Quartier place Armes','97232','Lamentin'),
(-24, '1 rue des longues cannes à sucres, Quartier Long pré','97232','Lamentin'),
(-25, '1 rue Fouchier Lepeltier','92130','Issy les Moulineaux');

INSERT INTO public.t_customer (id , customer_identifier , end_date_subscription , start_date_subscription)
VALUES
(-1,  '15r78e1d5f7rD', null, '2020-01-05'),
(-2, '15r78e5d5f7rD', '2020-06-05', '2020-01-13'),
(-3, '15978e1d5f7rD', null, '2020-01-24'),
(-4, '1pt78e1d5f7rD', '2020-06-05', '2020-02-08'),
(-5, '15r78e1d5klrD', null, '2020-03-18'),
(-6, '15r78e1d567mk', '2020-09-05', '2020-03-21'),
(-7, '15r78e1ddg7rD', null, '2020-03-27'),
(-8, '15r72e1dhf7rD', null, '2020-03-27'),
(-9, '15r7fe1d5f8rD', '2020-07-05', '2020-04-05'),
(-10, '15r78e115f7rD', null, '2020-04-07'),
(-11, '15r78efd5f7rD', null, '2020-04-09'),
(-12, '15r78e1iof7rD', null, '2020-04-07'),
(-13, '15r78e11mf7rD', null, '2020-06-05'),
(-14, '15r78eopd5f7r', null, '2020-06-05'),
(-15, '15r78e1M5f7rD', null, '2020-06-05'),
(-16, '15r78e2yd5f7r', '2020-08-05', '2020-06-05'),
(-17, '15rmpe1d5f7rD', null, '2020-06-05'),
(-18, '12r78e1d5f7rD', '2020-09-05', '2020-06-05'),
(-19, '11r78z1d5f7rD', null, '2020-06-05'),
(-20, '10r78e2d5f7rD', null, '2020-06-05'),
(-21, '22r78e1r5f7rD', null, '2020-06-05'),
(-22, '15r78e1d5f7rU', '2020-06-29', '2020-06-05'),
(-23, '15r78e1d5f7rO', '2020-09-05', '2020-06-05'),
(-24, '15r78e1d5f7rJ', null, '2020-06-05'),
(-25, '15r78e1d5f7rR', null, '2020-06-05');

INSERT INTO public.t_establishment(id, business_name, siret_number, email_address, phone_number, address_establishment_id, customer_establishment_id)
VALUES 
(-1, 'POUNOUTE', '23234677012397', 'pounoute.residence@vandeo.com', '0934561083', -1, -1),
(-2, 'FAM SENIORS', '12345671023454', 'famseniors.residence@alivianresi.com', '0798325465', -2, -2),
(-3, 'AGALYNE', '23234672313211', 'agalyne.residence@vandeo.com', '0932137854', -3, -3),
(-4, 'ANALIBIA', '12345678912347', 'analibia.resi.edpad@gmail.com', '0998453617', -4, -4),
(-5, 'SENIOR AGE', '23234677013456', 'seniorage@yahoo.fr', '0789561087', -5, -5),
(-6, 'VIVALI', '23234677054324', 'vivali@yahoo.fr', '0987235413', -6, -6),
(-7, 'RESI HOME', '12345098762345', 'resihome@gmail.com', '0987652309', -7, -7),
(-8, 'HOME PEACE', '12345098708642', 'peacehome@gmail.com', '6576342534', -8, -8),
(-9, 'FAFALIANE', '13579098762345', 'fafaliane@residence.fr', '0998645309', -9, -9),
(-10, 'KORIAN HOME', '12335782762345', 'korianhome@gmail.com', '0909345678', -10, -10),
(-11, 'ANGILINE', '12345123459875', 'angiline@residencehome.com', '0789236754', -11, -11),
(-12, 'PIHULINE HOME', '65341098762345', 'pihulinehome@homegroup.com', '0798763256', -12, -12),
(-13, 'RESILIANCIA', '21324543892345', 'resiliancia@resihome.fr', '0989234576', -13, -13),
(-14, 'JOYCE HOME', '54322098762345', 'joycehome@gmail.com', '0987874367', -14, -14),
(-15, 'LES LOZAIRS', '34345065762345', 'leslozairs@arepa.com', '0989652354', -15, -15),
(-16, 'ZAILIA RESI', '43675098762345', 'zailiaresidence@operia.com', '0789012356', -16, -16),
(-17, 'JAVALIANCE RESI', '32455098762345', 'javalianceresidence@arepa.com', '0987437609', -17, -17),
(-18, 'DOMICO RESI', '32455098745891', 'domicoresidence@arepa.com', '0987652109', -18, -18),
(-19, 'ROSELIAN HOME', '32455098754670', 'reselianhome@arepa.com', '0987873412', -19, -19),
(-20, 'PLANTE GROW', '32455546789323', 'plantegrow@operia.com', '0790235416', -20, -20),
(-21, 'EUROPHIA HOME', '65345546789323', 'europhia@operia.com', '0791452354', -21, -21),
(-22, 'BANDANIANE', '45205546789323', 'bandaniane@operia.com', '0745238909', -22, -22),
(-23, 'LUMINIA', '54982301226743', 'luminia@operia.com', '0723456699', -23, -23),
(-24, 'KATAMOUN', '65341126365488', 'katamoun@operia.com', '0923440012', -24, -24),
(-25, 'ANANAS HOME', '32455546782234', 'ananashome@operia.com', '0712330922', -25, -25);

INSERT INTO public.t_role (id, role, description)
VALUES
(-1, 'ROLE_CONTRACTMANAGER','Customer contract user'),
(-2, 'ROLE_MANAGER', 'head of retirement home');

INSERT INTO public.t_client(id, username, password, establishment_id)
VALUES
(-1, 'lilia.nia@evanescence.com' ,'$2y$10$vvN/Po3mChPRMQhhjbzDm.DzLH2roaNssmQUUOmg8CFloa1e.1WSi', -1),
(-2, 'contract2@evanescence.com' ,'$2y$10$vvN/Po3mChPRMQhhjbzDm.DzLH2roaNssmQUUOmg8CFloa1e.1WSi', -2),
(-3, 'manager1@evanescence.com' ,'$2y$10$vvN/Po3mChPRMQhhjbzDm.DzLH2roaNssmQUUOmg8CFloa1e.1WSi', -3),
(-4, 'manager2@evanescence.com' ,'$2y$10$vvN/Po3mChPRMQhhjbzDm.DzLH2roaNssmQUUOmg8CFloa1e.1WSi', -4),
(-5, 'jiny.tenon@arepa.com' ,'$2a$04$WsaxwyrQQBYhChtMzy2qnep3SkHWEdrBymKarTrUGjsXqVVsXkg0a', -5);

INSERT INTO public.t_clients_roles (id_client, id_role) 
VALUES
(-1, -1),
(-2, -1),
(-3, -2),
(-4, -2),
(-5, -2);


INSERT INTO public.t_personal_data (id, last_name, first_name, gender, birthdate, birthplace, marital_status, native_language, otherslanguages_sproken)
VALUES 
(-1, 'TANILDA', 'Maryse', 'femme', '18 juillet 1942', 'Paris', 'Veuve, depuis 2008', 'Français', 'Espagnol'),
(-2, 'BOUCHER', 'Jean', 'homme', '01 mars 1938', 'Paris', 'Veuve, depuis 1998', 'Français', null),
(-3, 'BILOTIN', 'Gérard', 'homme', '31 juillet 1947', 'Clichy', 'Marié, depuis 1978', 'Français', 'Anglais');


INSERT INTO public.t_individualized_project (id, where_come_from, is_your_decision, religion, last_profession_exercised,
iso_resource_groups, wash_habit, clothing_habit, dietary_habit, mobilty_habit,
breathing_habit, elimination_habit, sleep_habit, communication_habit, culture_and_hobbies_habit,
people_present, creation_date, personal_data_id)
VALUES
(-1, 
'Maison de repos les lilas', 
'oui, sur les conseils de ma fille année. Apres ma chute du 21 novembre dernier.', 'Protestante',
     'assistante de gestion',
    'GIR4',
     'Madame fait sa toilettes seule. Elle la fait tous les jours. Elle utilise du gros savon marseille.',
    'Fait sa lessive seule. Préfère les pantalons au jupe',
   'Madame mange sans sel ',
   'Madame se déplace seule. Elle n"a besoin d"une aide. ',
    'Petit problème d"essouflement lorsqu"elle effectue une effort intense. Par exemple monter les escalier.',
  'Elemination correcte. Protection la nuit',
     'Nuit courte depuis de nombres années suite au décès de son mari. Horaire couché 22h. Levée à 4h-4h30',
   'Rien d"anormal',
  'Madame lit beaucoup. Notamment la bible. Je rends culte tous les dimanches avec sa fille année. Va au cinéma de la ville lorsqu"il y a films d"époque à l"affiche. Aime assisté au match de volley ball',
    'M le directeur, le résident, sa fille année',
    '2020-01-05',
    -1), 
    (-2, 'Maison de repos les lilas', 'oui, sur les conseils de ma fille année. Apres ma chute du 21 novembre dernier.', 'Protestante',
     'assistante de gestion',
    'GIR4',
     'Madame fait sa toilettes seule. Elle la fait tous les jours. Elle utilise du gros savon marseille.',
    'Fait sa lessive seule. Préfère les pantalons au jupe',
   'Madame mange sans sel ',
   'Madame se déplace seule. Elle n"a besoin d"une aide. ',
    'Petit problème d"essouflement lorsqu"elle effectue une effort intense. Par exemple monter les escalier.',
  'Elemination correcte. Protection la nuit',
     'Nuit courte depuis de nombres années suite au décès de son mari. Horaire couché 22h. Levée à 4h-4h30',
   'Rien d"anormal',
  'Madame lit beaucoup. Notamment la bible. Je rends culte tous les dimanches avec sa fille année. Va au cinéma de la ville lorsqu"il y a films d"époque à l"affiche. Aime assisté au match de volley ball',
    'M le directeur, le résident, sa fille année', '2020-01-05', -2),
     (-3, 'Maison de repos les lilas', 'oui, sur les conseils de ma fille année. Apres ma chute du 21 novembre dernier.', 'Protestante',
     'assistante de gestion',
    'GIR4',
     'Madame fait sa toilettes seule. Elle la fait tous les jours. Elle utilise du gros savon marseille.',
    'Fait sa lessive seule. Préfère les pantalons au jupe',
   'Madame mange sans sel ',
   'Madame se déplace seule. Elle n"a besoin d"une aide. ',
    'Petit problème d"essouflement lorsqu"elle effectue une effort intense. Par exemple monter les escalier.',
  'Elemination correcte. Protection la nuit',
     'Nuit courte depuis de nombres années suite au décès de son mari. Horaire couché 22h. Levée à 4h-4h30',
   'Rien d"anormal',
  'Madame lit beaucoup. Notamment la bible. Je rends culte tous les dimanches avec sa fille année. Va au cinéma de la ville lorsqu"il y a films d"époque à l"affiche. Aime assisté au match de volley ball',
    'M le directeur, le résident, sa fille année', '2020-01-05', -3);

INSERT INTO public.t_establishments_individualized_projects (id_establishment, id_individualized_project) 
VALUES
(-1, -1),
(-1, -2),
(-1, -3);




