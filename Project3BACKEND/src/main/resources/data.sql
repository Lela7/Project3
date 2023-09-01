INSERT INTO korisnik (id, e_mail, korisnicko_ime, lozinka, ime, prezime, uloga)
              VALUES (1,'miroslav@maildrop.cc','miroslav','$2y$12$NH2KM2BJaBl.ik90Z1YqAOjoPgSd0ns/bF.7WedMxZ54OhWQNNnh6','Miroslav','Simic','ADMIN');
INSERT INTO korisnik (id, e_mail, korisnicko_ime, lozinka, ime, prezime, uloga)
              VALUES (2,'tamara@maildrop.cc','tamara','$2y$12$DRhCpltZygkA7EZ2WeWIbewWBjLE0KYiUO.tHDUaJNMpsHxXEw9Ky','Tamara','Milosavljevic','KORISNIK');
INSERT INTO korisnik (id, e_mail, korisnicko_ime, lozinka, ime, prezime, uloga)
             VALUES (3,'petar@maildrop.cc','petar','$2y$12$i6/mU4w0HhG8RQRXHjNCa.tG2OwGSVXb0GYUnf8MZUdeadE4voHbC','Petar','Jovic','KORISNIK');


INSERT INTO drzava(id, naziv, oznaka) VALUES(1, 'Serbia', 'SRB');
INSERT INTO drzava(id, naziv, oznaka) VALUES(2, 'The United States of America', 'USA');
INSERT INTO drzava(id, naziv, oznaka) VALUES(3, 'Jamaica', 'JME');
INSERT INTO drzava(id, naziv, oznaka) VALUES(4, 'Spain', 'SPA');
INSERT INTO drzava(id, naziv, oznaka) VALUES(5, 'Croatia', 'CRO');

INSERT INTO takmicar(id, ime_prezime, broj_medalja, datum_rodjenja, drzava_id) VALUES(1, 'Novak Djokovic', 105, '1987 May 22', 1);
INSERT INTO takmicar(id, ime_prezime, broj_medalja, datum_rodjenja, drzava_id) VALUES(2, 'Ivana Spanovic', 52, '1990 May 10', 1);
INSERT INTO takmicar(id, ime_prezime, broj_medalja, datum_rodjenja, drzava_id) VALUES(3, 'Marin Cilic', 38, '1998 September 28',5);
INSERT INTO takmicar(id, ime_prezime, broj_medalja, datum_rodjenja, drzava_id) VALUES(4, 'Kishane Tomphson', 12, '2001 July 17', 3);
INSERT INTO takmicar(id, ime_prezime, broj_medalja, datum_rodjenja, drzava_id) VALUES(5, 'Carloz Alcaraz', 98, '2003 May 5', 4);

INSERT INTO prijava(id, datum_prijave, disciplina, takmicar_id) VALUES(1, '2023/09/22', 'singl mec', 1);
INSERT INTO prijava(id, datum_prijave, disciplina, takmicar_id) VALUES(2, '2023/08/15', 'sprint100', 2);
INSERT INTO prijava(id, datum_prijave, disciplina, takmicar_id) VALUES(3, '2023/01/31', 'singl mec', 5);
INSERT INTO prijava(id, datum_prijave, disciplina, takmicar_id) VALUES(4, '2023/08/16', 'sprint200', 2);
INSERT INTO prijava(id, datum_prijave, disciplina, takmicar_id) VALUES(5, '2023/04/08', 'singl mec', 3);
INSERT INTO prijava(id, datum_prijave, disciplina, takmicar_id) VALUES(6, '2023/04/08', 'sprint200', 4);
