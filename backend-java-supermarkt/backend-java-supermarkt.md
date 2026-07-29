
# Inleiding

Je hebt deze week geleerd over methodes, klassen en de if-statement. In deze opdracht ga je dit allemaal toepassen.


## Opdrachtbeschrijving

In deze opdracht gaan we shoppen bij een supermarkt.
Om dat voor elkaar te krijgen, hebben we een `SuperMarket`-klasse en een `Product`-klasse nodig.
In de `Main`-klasse gaan we...
- of een `Scanner`-object maken waarmee je de gebruiker vraagt welk product deze wil kopen en hoeveel
- of je gebruikt `IO.readln`. In dat geval kun je `Integer.parseInt(<string>)` gebruiken om een Integer te maken van de uitkomst van readline.

Er moet natuurlijk ook betaald worden, dus we laten de gebruiker ook even weten wat het geheel dan wel kost.
Als de gebruiker meer wil kopen dan wat de winkel op voorraad heeft, dan kan dat natuurlijk niet, dus dat laten we de gebruiker dan weten.

## Minimale vereisten

| Klasse      | Attributen                                                                      | Methodes  |
|-------------|---------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------|
| Product     | name, price, amount                                                             | constructor(name, price, amount)  |
| SuperMarket | bread, fruit, cheese, toiletPaper                                               | constructor(bread, fruit, cheese, toiletPaper), buyBread(amount), buyFruit(amount), buycheese(amount), buyToilerPaper(amount), buyItem(product, amount) |
| Customer    | name, supermarket                                                               | constructor(name), goToSupermarket(supermarket), buyItem(productName, amount)   |
|Main| bread, fruit, cheese, toilerPaper, superMarket, customer, scanner, name, amount | main|



## Stappenplan

### Stap 1
Maak een `Product` klasse.  
Deze klasse heeft de volgende attributen: 
- name
- price
- amount  
Bepaal zelf welke datatypes bij deze attributen passen.

Maak een constructor waarin je deze attributen invult.

### Stap 2
Maak een `SuperMarket` klasse.  
Deze klasse heeft de 4 attributen van het type `Product`.  

De Producten die onze SuperMarket heeft, zijn:
- bread
- fruit
- toiletPaper
- cheese

Maak een constructor waarin je al deze attributen invult.

### Stap 3
Geef de `SuperMarket` klasse een `buyItem` methode waarmee je een specifieke hoeveelheid van een specifiek item kunt kopen uit de winkel.  

Deze methode heeft 2 parameters: 
- product
- amount  

In de body van de methode check je met een `if-statement` of het opgegeven amount uit de amount-parameter niet meer is dan het amount in het product. 
- Als dat klopt, dan haal je dit amount van het product af en print je succes bericht als: `"You bought [amount] [name] for [total price] euro"`
- Klopt dit niet, dan print je alleen een error bericht als: `"You cannot buy [amount] [name], we only have [amount] [name] in stock."`

### Stap 4
We gaan de `buyItem` methode, die je zojuist gemaakt hebt, niet direct aanroepen. Het is een "helper methode". De methodes die we wel direct gaan aanroepen zijn: 
- buyBread(int amount)
- buyFruit(int amount)
- buyCheese(int amount)
- buyToiletPaper(int amount)

Deze 4 methodes roepen in hun body de `buyItem` methode aan met het de juiste parameters. Voor `buyBread` is de body dus `buyItem(this.bread, amount)`

### Stap 5
Maak een `Customer` klasse.  
Deze klasse heeft 2 attributen: 
- name
- supermarket  
- 
De name vul je in via de constructor, maar de superMarket niet. 

Voor superMarket maak je een `goToSuperMarket` methode met een parameter van `SuperMarket superMarket` en in de body komt `this.superMarket = superMarket`. 


### Stap 6
Verder heeft Customer een `buyItem` methode. Deze is anders dan de buyItem-methode in SuperMarket. 

Deze methode krijgt 2 parameters: 
- productName
- amount

In de body schrijf je een `if-statment` met diverse `else if` branches waarin je checkt de `productName` overeen komt met een van je producten. Als dat zo is, dan roep je die buy-methode aan in je SuperMarket.

__Bijvoorbeeld:__  
- als productName gelijk is aan "bread"
- roep dan superMarket.buyBread aan

> Tip: De eerste van de if-statements moet checken of 'this.superMarket` null is. Als dat zo is, dan print je de waarschuwing "Select a supermarket to go to first" en return je de methode.

### Stap 7
Alles komt samen in de Main klasse.  
Maak een `public static void main` methode, als die er nog niet is.  
Maak de volgende Product instances: 
- bread
- fruit
- cheese
- toiletPaper  
Je mag zelf weten welke argumenten je mee geeft.

Maak ook de volgende variabelen:
- Supermarker supermarket
- Customer customer
- Scanner scanner  (optioneel)

Gebruik de scanner of readln om twee variabelen te maken:
- productName (als antwoord op de vraag `"Which product do you want to buy?"`)
- amount  (als antwoord op de vraag `"How many do you want to buy?"`)

Roep als laatste de `goToSupermarket` en `buyItem` methodes van `customer` aan.

Je kunt nu item kopen uit de supermarkt.

Voer de applicatie een paar keer uit, met verschillende `productNames` en verschillende `amounts`, om te zien wat er gebeurd.


## BONUS
Een product kan altijd `null` zijn.  
De constructor van `SuperMarket` vraagt nu om 4 `Producten`.
Als we daar 4 keer `null` invullen, dan crasht de applicatie. 
We roepen namelijk de attributen van producten aan, maar `null` heeft die attributen niet. 

Pas de constructor aan zodat je geen `null` waardes kunt invullen. 

> Tip: Check voor al je producten of er een null waarde is ingevuld. Als dat zo is, zet daar dan een "fake" product neer, zoals `new Product("fake", 0, 0)`

