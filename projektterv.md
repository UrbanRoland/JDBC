# `MINTA` Projektterv 2019

## 1. Összefoglaló 
A kiválasztott feladat egy vasúti információszolgáltató és jegykiadó rendszer oldal létrehozása, mely magában foglalja a projekt főbb
életciklusait, kezdve a tervezési fázistól, egészen a számítógépes implementációig. Az oldal mintájául at elvira.hu, közismert online információszolgáltató és jegykiadó rendszert vettük. Természetesen, törekedünk a funkcionalitás teljes tárházát nyújtani, de ez jelen körülmények között nem megoldható.

## 2. Verziók


| Verzió |    Szerző    |     Dátum    |     Státusz     |                      Megjegyzés                     |
|:------:|:------------:|:------------:|:---------------:|:---------------------------------------------------:|
|  `0.1` | `Teszt Elek` | `2019-09-10` |    `Tervezet`   |                   `Legelső verzió`                  |
|  `0.2` | `Remek Elek` | `2019-09-15` | `Előterjesztés` |         `A projekt menedzsere jónak találta`        |
|  `1.0` |   `Lev Elek`  | `2019-09-25` |   `Elfogadott`  |                `Apróbb átszervezések`               |
|  `1.1` |  `Hot Elek`  | `2019-10-01` | `Előterjesztés` | `képernyőtervek, személyes felelősségek bevezetése` |
|  `2.0` |  `Ebéd Elek` | `2019-10-05` |   `Elfogadott`  |         `Módosított változat véglegesítése`         |

Státusz osztályozás:
 - Tervezet: befejezetlen dokumentum
 - Előterjesztés: a projekt menedzser bírálatával
 - Elfogadott: a megrendelő által elfogadva

## 3. A projekt bemutatása
Ez a projektterv a `MINTA` projektet mutatja be, mely `2019.09.02-től 2018.12.06-ig` tart. A projekt célja `…`

### 3.1. Rendszerspecifikáció
`Ide írd le részletesen, hogy mit fog tudni a rendszer (funkcionalitás, célok), amit a projekt keretében megvalósítotok. Mik a megrendelő és a felhasználók igényei? Miért van szükség a projektre? (5-7 mondat)`

### 3.2. Funkcionális követelmények
`Ide kerülnek a rendszerrel szemben támasztott funkcionális igények: mit kell a rendszernek tudnia`

### 3.3. Nem funkcionális követelmények
`A rendszer nem funkcionális követelményei, pl.: milyen környezetben fusson, milyen teljesítményt kell produkálnia, milyen megjelenéssel kell rendelkeznie`

## 4. Költség- és erőforrás-szükségletek
Az erőforrásigényünk kb. `X` személynap.
A rendelkezésünkre áll `Y` pont.
`(Becsült sarokszámok, a rendelkezésre álló erőforrás fejenként 8-10 személynap)`

## 5. Szervezeti felépítés és felelősségmegosztás
A projekt megrendelője `Gyakvezető`. A `MINTA` projektet a projektcsapat fogja végrehajtani, amely `…`

### 5.1 Projektcsapat
A projekt a következő emberekből áll:

|                                              |        Név        |  E-mail cím (stud-os) |
|:--------------------------------------------:|:-----------------:|:---------------------:|
|                  Megrendelő                  | `Gyakorlatvezető` | `gyv@inf.u-szeged.hu` |
|               Projekt menedzser              |                   |                       |
| `Adatbázisért és adatkapcsolatokért felelős` |                   |                       |
|      `Felhasználói felületekért felelős`     |                   |                       |
|   `A rendszer működési logikájáért felelős`  |                   |                       |
|           `Dokumentációért felelős`          |                   |                       |
|           `Prezentációért felelős`           |                   |                       |
|                 `Projekt tag`                |                   |                       |

## 6. A munka feltételei
### 6.1. Munkakörnyezet
A projekt a következő munkaállomásokat fogja használni a munka során:
 - `Milyen és hány gépet használ a projekt, milyen szoftverkörnyezetben, stb.`

### 6.2. Rizikómenedzsment
 - `Rizikótényező (hatás):
(Leírni, mit jelent, megbecsülni a besorolást (valószínűség/hatás), ami lehet kis, közepes és nagy). (pl. betegség, szoftver-hardver probléma, stb..)`

## 7. Jelentések
### 7.1. Munka menedzsment
`A munkát xy menedzseli…
(Ki menedzseli a munkát (általában a project menedzser). Le kell írni, hogy mik a feladatai, és azokat hogyan hajtja végre.)`

### 7.2. Csoportgyűlések

`A projekt hetente ülésezik, hogy megvitassák az azt megelőző hét problémáit, ill. megbeszéljék a következő hét feladatait. A megbeszélésről minden esetben MEMO készül, mely tartalmazza a következőket: jelenlévők listája, megbeszélés helye és ideje, megbeszélt tevékenységek, felmerült kérdések, igények, azaz hogy betekintést kapjunk hogyan szerveződnek, zajlanak a csoportgyűlések)`

### 7.3. Minőségbiztosítás
Az elkészült terveket a terveken nem dolgozó csapattársak közül átnézik, hogy megfelel-e a specifikációnak és az egyes diagramtípusok összhangban vannak-e egymással. A meglévő rendszerünk helyes működését a prototípusok bemutatása előtt a tesztelési dokumentumban leírtak végrehajtása alapján ellenőrizzük és összevetjük a specifikációval, hogy az elvárt eredményt kapjuk-e. További tesztelési lehetőségek: unit tesztek írása az egyes modulokhoz vagy a kód közös átnézése (code review) egy, a vizsgált modul programozásában nem résztvevő csapattaggal. Szoftverünk minőségét a végső leadás előtt javítani kell a rendszerünkre lefuttatott kódelemzés során kapott metrikaértékek és szabálysértések figyelembevételével.
Az alábbi lehetőségek vannak a szoftver megfelelő minőségének biztosítására:
- Specifikáció és tervek átnézése (kötelező)
- Teszttervek végrehajtása (kötelező)
- Unit tesztek írása (választható)
- Kód átnézése (választható)

### 7.4. Átadás, eredmények elfogadása
A projekt eredményeit `Gyakorlatvezető` fogja elfogadni. A projektterven változásokat csak  `Gyakorlatvezető` írásos kérés esetén `Gyakorlatvezető`engedélyével lehet tenni. A projekt eredményesnek bizonyul, ha specifikáció helyes és határidőn belül készül el. Az esetleges késések pontlevonást eredményeznek.
Az elfogadás feltételeire és beadás formájára vonatkozó részletes leírás Kertész Attila fő gyakorlatvezető honlapján olvasható.

### 7.5. Státuszjelentés
Minden leadásnál a projektmenedzser jelentést tesz a projekt haladásáról, és ha szükséges változásokat indítványoz a projektterven. Ezen kívül a megrendelő felszólítására a menedzser 3 munkanapon belül köteles leadni a jelentést. A gyakorlatvezetővel folytatott csapatmegbeszéléseken a megadott sablon alapján emlékeztetőt készít a csapat, amit a következő megbeszélésen áttekintenek és felmérik az eredményeket és teendőket. Továbbá gazdálkodnak az erőforrásokkal és szükség esetén a megrendelővel egyeztetnek a projektterv módosításáról.

## 8. A munka tartalma
### 8.1. Tervezett szoftverfolyamat modell és architektúra
`Milyen szoftverfolyamat modellt követve állítja elő a csapat a specifikációnak megfelelő prototípusokat? Miért ezt választja? (gyakorlatvezetővel megbeszélve)
A gyakorlatvezetővel egyeztetve a csapat milyen architektúrát választ a projekt megvalósításához? Milyen nyelven? Milyen rétegek (logikai, adat, GUI)?`

### 8.2. Átadandók és határidők
A főbb átadandók és határidők a projekt időtartama alatt a következők:

| Szállítandó |                 Neve                |   Határideje  |
|:-----------:|:-----------------------------------:|:-------------:|
|      D1     |       Projektterv és útmutató       |  `2019-09-20` |
|    P1+D2    | UML és adatbázis tervek és bemutató | `2019-10-11 ` |
|    P1+D3    |      Prototípus I. és bemutató      | `2019-11-05 ` |
|    P2+D4    |      Prototípus Ii. és bemutató     | `2019-12-02 ` |

## 9. Feladatlista

A `MINTA projekt 2019. szeptember 02-án` indult. A következőkben a tervezett feladatok részletes összefoglalása található:

### 9.1. Projektterv (1. mérföldkő)
`Ennek a feladatnak az a célja, hogy… 
Felelősök: …
Tartam: ? hét
Erőforrásigény: ? személynap`

### 9.2. UML és adatbázis tervek (2. mérföldkő)
`Ennek a feladatnak az a célja, hogy… `
Részfeladatai a következők:

#### 9.2.1. Use Case diagram
`Felelősök: …
Tartam: ? hét
Erőforrásigény: ? személynap`

#### 9.2.2. Class diagram
`Felelősök: …
Tartam: ? hét
Erőforrásigény: ? személynap`

#### 9.2.3. Sequence diagram
`Felelősök: …
Tartam: ? hét
Erőforrásigény: ? személynap`

#### 9.2.4. Egyed-kapcsolat diagram adatbázishoz
`Felelősök: …
Tartam: ? hét
Erőforrásigény: ? személynap`

#### 9.2.5. Package diagram
`Felelősök: …
Tartam: ? hét
Erőforrásigény: ? személynap`

#### 9.2.6. Képernyőtervek
`Felelősök: …
Tartam: ? hét
Erőforrásigény: ? személynap`

#### 9.2.7. Tesztesetek, teszttervek
`Felelősök: …
Tartam: ? hét
Erőforrásigény: ? személynap`

#### 9.2.8. Bemutató elkészítése és bemutatása
`Felelősök: …
Tartam: ? hét
Erőforrásigény: ? személynap`

### 9.3. Prototípus I. (3. mérföldkő)
`Ennek a feladatnak az a célja, hogy… `
Részfeladatai a következők:

#### 9.3.1. Prototípus
`Felelősök: …
Tartam: ? hét
Erőforrásigény: ? személynap`

#### 9.3.2. Tesztelési dokumentum
`Felelősök: …
Tartam: ? hét
Erőforrásigény: ? személynap`

#### 9.3.3. Bemutató elkészítése és bemutatása
`Felelősök: …
Tartam: ? hét
Erőforrásigény: ? személynap`

### 9.4. Prototípus II. (4. mérföldkő)
`Ennek a feladatnak az a célja, hogy… `
Részfeladatai a következők:

#### 9.4.1. Dokumentációk, tervek új funkciókkal
`Felelősök: …
Tartam: ? hét
Erőforrásigény: ? személynap`

#### 9.4.2. Javított minőségű prototípus új funkciókkal
`Felelősök: …
Tartam: ? hét
Erőforrásigény: ? személynap`

#### 9.4.3. Tesztelési dokumentum új funkciókhoz
`Felelősök: …
Tartam: ? hét
Erőforrásigény: ? személynap`

#### 9.4.4. Bemutató elkészítése és bemutatása
`Felelősök: …
Tartam: ? hét
Erőforrásigény: ? személynap`

 `(Részletesebb leírás minden egyes számozott feladatról, feltüntetve hogy ki a felelőse. Ha az eredmény egy átadandó, akkor azt fel kell tüntetni. Részfeladatokat is fel lehet sorolni egy listában. Meg kell hogy feleljen az esetleges Gantt-chartban szereplőkkel.)`

## 10. Részletes időbeosztás
`(Szöveges: feladat sorszáma, mettől-meddig. Ide kell berakni a Gantt chartot pl.:`)

## 11. Projekt költségvetés
### 11.1. Részletes költségvetés
`(Az egyes leadások alkalmával teljesíthető pontszámot kell beírni minden emberre külön-külön.)`

|                     Név                    | 1. leadás - Projektterv | 2. leadás - UML és adatbázis | 3. leadás - Prototípus I. | 4. leadás - Prototípus II. | Összesen |
|:------------------------------------------:|:----------------------:|:--------------------------:|:-----------------------:|:------------------------:|:--------:|
| Min. és max. kapható  pontszám százalékban |          5-10%         |           15-40%           |          20-40%         |          20-40%          |          |
|                     `X`                    |           `X`          |             `X`            |           `X`           |            `X`           |    60    |
|                     `X`                    |           `X`          |             `X`            |           `X`           |            `X`           |    60    |
|                     `X`                    |           `X`          |             `X`            |           `X`           |            `X`           |    60    |
|                     `X`                    |           `X`          |             `X`            |           `X`           |            `X`           |    60    |
|                     `X`                    |           `X`          |             `X`            |           `X`           |            `X`           |    60    |

### 11.2. Átvétel
A projektet a megrendelő a következő eredménnyel vette át:

|                     Név                    | 1. leadás - Projektterv | 2. leadás - UML és adatbázis | 3. leadás - Prototípus I. | 4. leadás - Prototípus II. | Összesen |
|:------------------------------------------:|:----------------------:|:--------------------------:|:-----------------------:|:------------------------:|:--------:|
|                                            |                        |                            |                         |                          |    60    |
|                                            |                        |                            |                         |                          |    60    |
|                                            |                        |                            |                         |                          |    60    |
|                                            |                        |                            |                         |                          |    60    |
|                                            |                        |                            |                         |                          |    60    |

Szeged, `2019. hónap nap`.

#### &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp; Az átadó részéről &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp; Az átvevő részéről 

 
