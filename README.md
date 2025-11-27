# Dungeon Crawler – Gioco di Ruolo Testuale in Java

Questo progetto consiste nella creazione di un semplice **gioco di ruolo testuale** in stile *Dungeon Crawler* sviluppato in **Java**.  
Il giocatore esplora un dungeon, combatte mostri, interagisce con PNG e gestisce un inventario, con l'obiettivo finale di sconfiggere il Drago.

## 🎮 Funzionalità Principali

- Esplorazione casuale del dungeon.
- Combattimenti a turni con diverse azioni disponibili.
- Interazione con PNG (Mercante, Fabbro, Guaritore).
- Gestione dell'inventario e uso di oggetti.
- Sistema di livelli ed esperienza.
- Evento finale: battaglia contro il Drago.
- Riepilogo completo della partita al termine.

## 🧩 Organizzazione del Codice

Il progetto è strutturato in **package logici** per mantenere ordine, leggibilità e manutenibilità.  
Tutte le eccezioni sono gestite per evitare crash anche in caso di input non validi.

## 🧙‍♂️ Entità del Gioco

### ✔ Creature (classe base)
Ogni creatura possiede un **nome**.

### ✔ Eroi (controllati dal giocatore)
Tre classi disponibili:
- **Guerriero**
- **Mago** (possiede attacco magico)
- **Elfo** (possiede attacco magico)

**Attributi principali:**
- Livello  
- Inventario (lista di oggetti)  
- Punti vita  
- Punti attacco  
- Attacco magico (solo Mago ed Elfo)

### ✔ Mostri
Tipi di mostri presenti:
- Goblin  
- Orco  
- Scheletro  
- Drago  

**Attributi:**
- Bottino (oggetto casuale)
- Punti vita
- Punti attacco

### ✔ PNG (Personaggi Non Giocanti)
Ogni PNG ha un dialogo ed una funzione specifica:
- **Mercante:** scambia monete con oggetti  
- **Guaritore:** aumenta i punti vita massimi e cura completamente l’eroe  
- **Fabbro:** aumenta permanentemente l’attacco dell’eroe  

## 🎒 Oggetti di Gioco

Oggetti disponibili:
- **Pozione:** +25 punti vita  
- **Bomba:** 35 danni al mostro  
- **Moneta:** valuta usata con il mercante  

Gli oggetti trovati, ottenuti dai mostri o venduti dai PNG vengono generati **casualmente**.

## 🧭 Esplorazione del Dungeon

Ogni turno il giocatore sceglie una delle **3 porte**, ognuna delle quali genera un evento casuale:

| Evento | Probabilità |
|--------|-------------|
| Incontro con Mostro | 25% |
| Trappola (-1 HP) | 20% |
| Incontro con PNG | 15% |
| Stanza vuota | 25% |
| Tesoro (oggetto casuale) | 15% |

## ⚔️ Sistema di Combattimento

Quando avviene un incontro con un mostro, parte un **combattimento a turni**.  
L’eroe agisce per primo e può scegliere tra:

- **Attacca:** danno = attacco fisico + livello  
- **Difendi:** dimezza il danno subito nel turno successivo  
- **Usa Oggetto:**  
  - Pozione: +25 HP  
  - Bomba: 35 danni al mostro  
- **Scappa:** fuga possibile, ma l’eroe subisce 0–10 danni  
- **Lancia Incantesimo:** (solo Mago/Elfo)  
  - danno = attacco magico + livello  

Se l'eroe vince:
- Guarisce il bottino del mostro  
- Aumenta di 1 livello  
- Incrementa il contatore dei mostri sconfitti

## 🐉 Obiettivo Finale

Il Drago può apparire casualmente come qualsiasi mostro.  
Tuttavia, dopo aver sconfitto **10 mostri minori**, il successivo incontro sarà garantito essere il **Drago**.

Il gioco termina:
- **Con vittoria:** se l’eroe sconfigge il Drago  
- **Con sconfitta:** se i suoi punti vita scendono a 0  

## 📜 Riepilogo di Fine Partita

Alla conclusione della partita, viene mostrato un riepilogo completo:

- Nome e classe dell'eroe  
- Punti vita rimanenti  
- Numero totale di mostri sconfitti  
- Elenco dei mostri sconfitti  
- Messaggio finale di vittoria o sconfitta  

## ▶️ Avvio del Gioco

All’avvio, il giocatore sceglie:
1. **Nome dell’eroe**
2. **Classe (Guerriero, Mago o Elfo)**

Dopo la selezione inizia l'esplorazione del dungeon.
