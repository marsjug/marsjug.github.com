---
title:  Ce que j'ai appris en utilisant des agents IA sur des vrais projets
layout: reunion
speakers:
  - sstormacq
inscription: https://www.meetup.com/marseille-java-user-group-meetup/events/314162749
location: tricentis
date: 2026-04-22 19:00:00 +0200
---
Je ne vous parle pas ici d'un retour d'expérience sur des Proofs of Concept. Ces derniers mois, j'ai utilisé des agents de programmation IA pour développer et déployer de vrais logiciels, déployés en production, couvrant plusieurs langages, plateformes et projets de différentes tailles. Certaines choses ont parfaitement fonctionné, d'autres moins. Je souhaite partager mon expérience.

Je détaillerai le cycle de vie complet : comment je réfléchis avec l'agent avant même d'écrire la moindre ligne de code, pourquoi je spécifie chaque fonctionnalité avant de le laisser travailler, comment choisir le modèle et les compétences adaptés à chaque tâche, et pourquoi des boucles de rétroaction rapides sont primordiales. J'aborderai également la question de la mise à l'échelle : la gestion des fenêtres de contexte, l'exécution de plusieurs agents en parallèle avec des répertoires de travail Git, et pourquoi les serveurs MCP sont parfois surdimensionnés.

Vous repartirez avec un guide pratique et argumenté. Commencez par un brainstorming. Spécifiez tout. Une fonctionnalité par branche. Relisez tout le code. Privilégiez un ensemble d'outils minimaliste. Que vous débutiez dans le développement assisté par l'IA ou que vous soyez déjà un expert, vous trouverez ici des informations utiles.