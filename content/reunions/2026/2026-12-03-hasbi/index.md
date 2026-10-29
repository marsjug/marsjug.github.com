---
title: "Combien pèse vraiment un objet Java ? Layout mémoire et Compact Object Headers"
layout: reunion
speakers:
  - ahasbi
inscription: ""
location: tricentis
date: 2026-12-03 19:00:00 +0100
---

La performance des applications Java est étroitement liée à leur empreinte mémoire : plus une application consomme de heap, plus elle exerce de pression sur le garbage collector, le cache CPU, les temps de pause et les coûts d’infrastructure. Pourtant, une partie de cette mémoire est consommée avant même de stocker nos données métier : chaque objet Java porte avec lui un en-tête, invisible dans le code, mais bien réel en production.

Dans cette session, nous explorerons l’organisation des objets dans la heap. Nous verrons comment la JVM dispose les objets en mémoire, quelles règles gouvernent leur alignement, leur padding, leurs champs, leurs références et leurs en-têtes.

Enfin, nous étudierons l’apport du Projet Lilliput et des Compact Object Headers : introduits comme fonctionnalité expérimentale avec la JEP 450 dans le JDK 24, puis standardisés avec la JEP 519 dans le JDK 25, les Compact Object Headers sont désormais activés par défaut dans le JDK 27 avec la JEP 534. Cette évolution réduit la taille des en-têtes d’objets dans HotSpot de 96 ou 128 bits à 64 bits sur les architectures 64 bits, avec des gains observés sur l’empreinte mémoire et la pression GC.

Pour rendre ces concepts concrets, nous nous appuierons sur JOL, la bibliothèque Java Object Layout d’OpenJDK, afin d’observer directement la représentation mémoire de différents objets selon plusieurs contextes d’exécution : avec ou sans compression des références, avec différentes configurations d’alignement mémoire et avec les Compact Object Headers.

Vous repartirez avec une meilleure compréhension de ce que coûte réellement un objet Java en mémoire, des outils pour le mesurer, et des clés pour comprendre pourquoi quelques octets gagnés par objet peuvent avoir un impact majeur à l’échelle d’une application.
