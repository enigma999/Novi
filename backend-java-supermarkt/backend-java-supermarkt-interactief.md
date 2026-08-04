
# Inleiding

Deze week hebben we geleerd over collecties en herhalingsstructuren. De opdracht van deze week gaat verder op de supermarkt opdracht van vorige week door deze nieuwe onderwerpen er bij in te bouwen.

Heb je de opdracht van vorige week niet of niet helemaal gemaakt? Clone dan de [uitwerkingen repo](https://github.com/hogeschoolnovi/backend-java-supermarkt-uitwerkingen) van vorige week.


## Opdrachtbeschrijving

In deze opdracht gaan we opnieuw shoppen bij een supermarkt.
Maar deze keer maken we het meer interactief en meer effectief.
Om dat voor elkaar te krijgen, gaan we de `SuperMarket`-klasse, de `Main`-klasse en de `Customer`-klasse aanpassen op bepaalde punten.

We laten de `Product` klasse met rust, maar alle instances van Pruduct komen in lijsten te staan. Zowel in Main als in SuperMarket en ook in de constructor. Een enkel Product kan soms nog wel als parameter van een methode worden gebruikt.

Van `SuperMarket` gaan we 3 instances maken en die zetten we in een Map.  

In `Main` gaan we de logica in een `while`-loop zetten, zodat de applicatie herhaaldelijk gebruikt kan blijven worden. Ook zorgen we met een `switch`-statement voor extra functionaliteit, namelijk: 
- Een supermarkt kiezen
- Een item kopen
- Een item aanvullen
- Afsluiten

Zorg er voor dat dit geheel in een goede structuur geleid wordt door begeleidende print-statements.

Om deze extra functionaliteiten te faciliteren, hebben we natuurlijk ook extra methodes nodig en zijn andere methodes overbodig geworden. Zie de [minimale vereisten](#minimale-vereisten)

## Minimale vereisten

| Klasse      | Attributen                                                              | Methodes                                                                                   |
|-------------|-------------------------------------------------------------------------|--------------------------------------------------------------------------------------------|
| Product     | name, price, amount                                                     | constructor(name, price, amount)                                                           |
| SuperMarket | name, productList                                                       | constructor(name, productList), buyItem(product, amount), restockItem(productName, amount) |
| Customer    | name, supermarket                                                       | constructor(name), goToSupermarket(supermarket), buyItem(productName, amount)              |
|Main| various products, various superMarkets, customer, scanner, name, amount | main                                                                                       |



## Stappenplan

### Stap 1 
De `Product`-klasse blijft hetzelfde als in de vorige opdracht.

In `Main` moeten al deze producten echter in een `ArrayList` komen te staan.
Maak 3 van dit soort product-lijsten. Elke lijst moet ten minste 4 producten hebben.

### Stap 2
De `SuperMarket` klasse heeft wel wat aanpassingen nodig.  
Deze klasse heeft nu niet 4 attributen van het type `Product`, maar 1 attribuut van het type `List<Product> products`.  
Naast deze lijst, heeft SuperMarket ook een `String name`

Pas de constructor aan, zodat je al deze attributen invult.

> Tip: check of de List-parameter van de constructor niet `null` is. Is dat wel zo, zet er dan een `new ArrayList()` neer. Dit voorkomt mogelijke `NullPointerExceptions`

### Stap 3
In `Main` maak je 3 `SuperMarket` instanties aan. Om juridische problemen te voorkomen, mag je deze de volgende namen geven: 
- Halbert Eijn
- Dumbo
- Caldi

Zet ze alle drie in een `HashMap` met de naam als key en de klasse als value, bijvoorbeeld:  
`("halbert eijn", new SuperMarket("Halbert Eijn", productsHalbertEijn))`

### Stap 4
We gaan de diverse `buyItem` methodes aanpassen. 

In de `SuperMarket.buyItem` blijft staan zoals het nu staat, maar de methodes `buyBread`, `buyCheese`, `buyToiletPaper` en `buyFruit` mag je verwijderen. Die hebben we straks niet meer nodig.

In `Customer.buyItem` gaan we het `if-statement` vervangen door een `for-loop`. 
- Deze methode heeft 2 parameters, `productName` en `amount`.
- We zorgen er als eerst voor dat we zeker weten dat `Customer.supermarket` niet null is. Als het goed is staat daar al een check voor. 
- Daarna gaan we door alle `Product product` in `supermarket.products` loopen.
- Als we een `product` vinden waarvan de naam overeen komt met `productName`
- Dan roepen we `superMarket.buyItem` aan met dat product (en amount) als argument en returnen daarna de methode (zodat er niet een tweede product gevonden kan worden)

Als de loop klaar is en er is niks gevonden, dan printen we een berichtgeving als: `"[supermarket] does not sell [product]"`

> Tip: gebruik `equalsIgnoreCase` om de namen hier te vergelijken

### Stap 5
`SuperMarket` krijgt een extra functionaliteit, namelijk een `restockItem` methode.  

Deze methode lijkt op `Customer.buyItem`. Het heeft dezelfde parameters (`String productName` en `int amount`).  
Het heeft ook een vergelijkbare for-loop (maar iets anders).
- loop door `Product products` in `this.products`.
- Als `product.name` overeenkomt met `productName`
- Dan tellen we `amount` bij `product.amount` op en returnen we de methode.

Eindig de for-loop met een return wanneer het item ge-restocked is. 
Als restock niet lukt, omdat deze supermarkt dit item niet in de productenlijst heeft staan bijvoorbeeld, print daar dan een berichtje voor.


### Stap 6
In `Main` staan nu 3 lijst, 1 map, 1 customer en 1 scanner.  
Alle logica gaan we in een eindeloze `while`-loop zetten.  
Als eerste vragen we welke functionaliteit de gebruiker wil uitvoeren. Dit kan op de volgende manier: 
```java
            System.out.println("\nWhat do you want to do?");
            System.out.println("1 - Pick a supermarket");
            System.out.println("2 - buy a product");
            System.out.println("3 - restock a product");
            System.out.println("4 - exit");
            int choice = scanner.nextInt();
            scanner.nextLine();
```

Vervolgens maken we een `switch`-statement met een `case` voor elk van deze keuzes (en een `default`). Hieronder staat per case beschreven hoe je dit kunt implementer.
- Case 1: 
  - Als eerst vraag je de gebruiker welke supermarkt deze wil.
      ```java
          System.out.println("Which supermarket do you want to go to?");
          System.out.println("Pick one of the following:");
          System.out.println("- Halbert Eijn");
          System.out.println("- Dumbo");
          System.out.println("- Caldi");
          String superMarketChoice = scanner.nextLine().toLowerCase();
      ```
  - Vervolgens haal je met `superMarketChoice` als key, die supermarkt uit de Map.
  - En die supermarkt zet je vervolgens in `customer` met de `goToSupermaket` methode.
- Case 2: 
  - Als eerst moeten we hier garanderen dat `Customer.supermarket` niet null is.
  ```java
    if(customer.superMarket == null) {
        System.out.println("Pick a supermarket first.");
        break;
    }
    ```
  - Gebruik de scanner om te vragen `"Which product do you want to buy from [supermarket]?"`
  - Gebruik de scanner om te vragen `"How many do you want to buy?"`
  - Roep `customer.buyItem` aan.
- Case 3: 
  - Vraag nogmaals welke supermarkt de gebruiker wil
  ```java
     System.out.println("Which supermarket do you want to restock?");
     System.out.println("Pick one of the following:");
     System.out.println("- Halbert Eijn");
     System.out.println("- Dumbo");
     System.out.println("- Caldi");
     superMarketChoice = scanner.nextLine().toLowerCase();
    ```
  - Vervolgens haal je met `superMarketChoice` als key, die supermarkt uit de Map.
  - Gebruik de scanner om te vragen `"Which product do you want to restock in [supermarket]?"`
  - Gebruik de scanner om te vragen `"How many do you want to add?"`
  - Roep `superMarket.restockItem` aan.
- Case 4: 
  - Print een vaarwel berichtje
  - stop de while loop of return de methode
- Case default:
  - Print een berichtje dat dit geen geldige input is
  - break

    
Je kunt nu op een interactieve manier items kopen uit de supermarkt en ook weer aanvullen.

Voer de applicatie een paar keer uit, met verschillende inputs, om te zien wat er gebeurd.


## BONUS
In de `switch` in `main`, staan 2 keer (bijna) dezelfde regels code om een supermarkt te kiezen en om die vervolgens uit de Map te halen.  
Als goede programmeurs houden we er niet van om code te moeten herhalen. Wanneer je herhaling ziet, dan probeer je dat in een helper-methode te extraheren.  
Probeer dat ook voor deze regels code te doen.  
Zet het in een helper-methode en roep die methode op deze 2 plekken aan. Je code ziet er dan een stuk schoner uit.
Let daar bij op de subtiele verschillen tussen de twee varianten.  

> Tip: In plaats van `.get`, kun je `.getOrDefault` gebruiken om een item uit een Map te halen. Wanneer je dan een key gebruikt die niet bestaat, kun je een default value kiezen om terug te geven in plaats van null

## BONUSBONUS
Voeg extra functionaliteit toe, zoals het aanpassen van de prijs van een product, een nieuw product toevoegen of zelfs een hele nieuwe winkel toevoegen.

