# Exercice 2 : Jeu de Devinettes (Jeu de Devinettes) - Java

## Description du Projet
Ce projet consiste en la création d'un jeu interactif où l'utilisateur doit deviner un nombre secret généré aléatoirement par l'ordinateur[cite: 33, 36]. [cite_start]Cet exercice permet de mettre en pratique les structures de contrôle (boucles), les conditions et la gestion des entrées utilisateur via la console en Java[cite: 37, 38].

## Fonctionnalités
- [cite_start]**Génération Aléatoire** : Le programme choisit un nombre entre 1 et 100 au début de chaque partie.
- [cite_start]**Gestion des Essais** : L'utilisateur dispose de **10 tentatives** maximum pour trouver le bon nombre.
- [cite_start]**Indices Dynamiques** : Après chaque tentative, le programme indique si le nombre secret est **supérieur** ou **inférieur** à la proposition faite[cite: 45].
- **Conditions de Fin** : 
    - [cite_start]**Victoire** : Si l'utilisateur trouve le nombre, le jeu s'arrête et affiche un message de succès.
    - [cite_start]**Défaite** : Si les 10 essais sont épuisés sans succès, le jeu révèle le nombre secret et annonce la défaite.

## Structure du Code
Le code est entièrement contenu dans la classe `Main.java` et utilise :
- [cite_start]`java.util.Random` pour la génération du nombre.
- [cite_start]`java.util.Scanner` pour la lecture des entrées clavier.
- [cite_start]Une boucle `while` pour gérer les tentatives répétées.

## Installation et Utilisation
1. [cite_start]Clonez ce dépôt GitHub sur votre machine locale.
2. [cite_start]Importez le projet dans un IDE comme IntelliJ IDEA.
3. [cite_start]Exécutez la classe `Main.java` et suivez les instructions dans la console.

## Auteur
- **Ali (Ouattara Fétigué Ali)** - Étudiant en L3 Réseaux et Génie Logiciel à Pigier Côte d'Ivoire.
