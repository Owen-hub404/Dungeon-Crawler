# Dungeon Crawler – Gioco di Ruolo Testuale in Java

![Java](https://img.shields.io/badge/Java-17+-red?style=for-the-badge)
![Status](https://img.shields.io/badge/Project-Active-green?style=for-the-badge)
![Type](https://img.shields.io/badge/Text%20RPG-Dungeon%20Crawler-blue?style=for-the-badge)

Un semplice **gioco di ruolo testuale** in stile *Dungeon Crawler* sviluppato in **Java**.  
Esplora un dungeon, combatti mostri, interagisci con PNG e potenzia il tuo eroe per sconfiggere il Drago.

---

## ▶️ Avvio del Gioco

All’inizio della partita il giocatore sceglie:
1. **Nome dell’eroe**
2. **Classe**: Guerriero, Mago o Elfo

Una volta confermate le scelte, inizia immediatamente l'esplorazione del dungeon.

---

## 🎮 Funzionalità

- Esplorazione del dungeon con eventi casuali
- Combattimenti a turni
- Interazione con PNG (Mercante, Fabbro, Guaritore)
- Gestione dell’inventario e utilizzo di oggetti
- Sistema di livelli ed esperienza
- Boss finale: Drago
- Riepilogo dettagliato della partita

---

## 🧙‍♂️ Entità del Gioco

### Eroe (Giocatore)
Tre classi disponibili:
- **Guerriero**
- **Mago** *(attacco magico)*
- **Elfo** *(attacco magico)*

Attributi principali:  
Livello • Punti vita • Punti attacco • Attacco magico (se presente) • Inventario

### Mostri
Tipi disponibili:
Goblin • Orco • Scheletro • **Drago**  
Ogni mostro possiede: punti vita, attacco e bottino casuale.

### PNG
- **Fabbro** → +1 attacco permanente  
- **Guaritore** → +1 vita massima e cura completa  
- **Mercante** → scambia oggetti in cambio di monete  

---

## 🧭 Esplorazione

Ogni turno il giocatore sceglie una delle **3 porte**, ognuna conduce a un evento casuale:

  | Evento | Probabilità |
  |--------|-------------|
  | Incontro con Mostro | 25% |
  | Trappola (-1 HP) | 20% |
  | Incontro con PNG | 15% |
  | Stanza vuota | 25% |
  | Tesoro (oggetto casuale) | 15% |

---

## ⚔️ Combattimento

Sistema a turni, l’eroe agisce per primo.  
Azioni disponibili:

- **Attacco** → danno = attacco fisico + livello  
- **Difesa** → dimezza il danno subito al turno successivo  
- **Usa oggetto**  
  - Pozione: +25 HP  
  - Bomba: 35 danni  
- **Fuga** → l’eroe subisce 0–10 danni  
- **Incantesimo** (Mago/Elfo) → danno = attacco magico + livello  

In caso di vittoria:  
l’eroe ottiene il bottino e sale di livello.

---

## 🎒 Oggetti

- **Pozione** → +25 HP  
- **Bomba** → 35 danni al nemico  
- **Moneta** → valuta per il mercante  

Oggetti ottenuti in modo **casuale** (tesori, mostri, PNG).

---

## 🐉 Obiettivo Finale

Il gioco termina quando:
- l’eroe **sconfigge il Drago** (vittoria)  
- i suoi punti vita scendono a 0 (sconfitta)

Il Drago può apparire casualmente,  
ma dopo **10 mostri minori sconfitti**, il suo incontro è garantito.

---

## 📜 Riepilogo di Fine Partita

Alla fine viene mostrato un resoconto con:
- Nome e classe dell’eroe
- Punti vita rimanenti
- Numero totale di mostri sconfitti
- Lista dei mostri eliminati
- Messaggio finale (vittoria o sconfitta)

---
