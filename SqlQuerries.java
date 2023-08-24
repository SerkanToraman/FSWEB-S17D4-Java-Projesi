public class SqlQuerries {

            1.  SELECT * FROM ogrenci
            2.  SELECT ograd, ogrsoyad FROM ogrenci
            3.  SELECT * FROM ogrenci WHERE cinsiyet='K'
            4.  SELECT DISTINCT sinif FROM ogrenci
            5.  SELECT * FROM ogrenci WHERE sinif="10A" AND cinsiyet="K"
            6.  SELECT ograd, ogrsoyad FROM ogrenci WHERE sinif IN ('10A','10B')
            7.  SELECT ograd, ogrsoyad, ogrno as okulNumarasi FROM ogrenci
            8.  SELECT CONCAT(ograd,' ',ogrsoyad) as adSoyad from ogrenci
            9.  SELECT * from ogrenci where ograd LIKE 'a%'
            10. SELECT kitapadi, sayfasayisi FROM kitap WHERE sayfasayisi BETWEEN 50 AND 200
            11  SELECT * FROM ogrenci where ograd IN('Fidan','İsmail','Leyla')
            12  SELECT * FROM ogrenci where ograd REGEXP '^[ADKadk]'
    SELECT * FROM ogrenci where ograd LIKE 'a%' OR ograd LIKE 'd%' OR  ograd LIKE 'k%'
            13 SELECT * FROM ogrenci where (sinif='9A' AND cinsiyet='E') OR (sinif='9B' AND cinsiyet='K')
    SELECT * FROM ogrenci WHERE (sinif, cinsiyet) IN (('9A', 'E'), ('9B', 'K'));
            14.SELECT * FROM ogrenci where cinsiyet='E' AND (sinif='10A' OR sinif='10B')
    SELECT * FROM ogrenci WHERE cinsiyet = 'E' AND sinif IN ('10A', '10B');
            15 SELECT * FROM ogrenci WHERE dtarih LIKE '1989%'
            16 SELECT * FROM ogrenci WHERE cinsiyet ='K' AND ogrno BETWEEN 30 AND 50
            17 SELECT * FROM ogrenci ORDER BY ograd
            18 SELECT * FROM ogrenci ORDER BY ograd,ogrsoyad
            19 SELECT * FROM ogrenci WHERE sinif ="10A" ORDER BY ogrno DESC
            20 SELECT * FROM ogrenci LIMIT 10
            21 SELECT ograd, ogrsoyad, dtarih FROM ogrenci LIMIT 10
            22 SELECT * FROM kitap ORDER BY sayfasayisi DESC LIMIT 1
            23 SELECT * FROM ogrenci  WHERE dtarih IS NOT NULL ORDER BY dtarih LIMIT 1
            24 SELECT * FROM ogrenci  WHERE sinif='10A' and dtarih IS NOT NULL ORDER BY dtarih DESC LIMIT 1
            25 SELECT * FROM kitap WHERE kitapadi LIKE '_n%'
            26 SELECT sinif FROM ogrenci GROUP BY sinif
            27  SELECT * FROM ogrenci ORDER BY rand()
            28 SELECT * FROM ogrenci ORDER BY rand() LIMIT 1
            29 SELECT ograd, ogrsoyad , ogrno  FROM ogrenci WHERE sinif="10A" ORDER BY rand() LIMIT 1
            30 SELECT ograd, COUNT(*) from ogrenci GROUP BY ograd


}
