# TP 1 : Le Design Pattern Observer

**1/** Récupérer le code source.
##
**2/** Ouvrir le code obtenu en utilisant votre IDE préféré.

   Remarquez que le projet est constitué de trois (04) modules, remarquez que vous avez une interface définissant le service **TimerService** ainsi que de deux interfaces dans le même modules permettant d’implémenter le mécanisme de l’observer.  Une implémentation de base de ce service vous a été octroyée.
##
**3/** Nous souhaitons maintenant compléter le code de la classe **Horloge** afin qu’elle affiche sur console l’heure à chaque seconde. Pour y parvenir, il faut faire ce qui suit :
1.	Dans la classe amorce (main) instanciez d’abord le **TimerServiceProvider**, puis injectez l’instance dans une instance de Horloge après avoir fait les modifications nécessaires de cette dernière. 
2.	Dans horloge assurez vous de vous inscrire en tant que observer du TimerService.
3.	Notez que Horloge ne doit pas dépendre de l’implémentation de TimerService mais uniquement de l’abstraction.
4.	Instanciez plusieurs Horloges et vérifier leurs fonctionnement.
##
**4/** Ajoutez dans le module timer-service-client deux instances une classe **CompteARebours**, similaire à la classe Horloge mais qui prend un entier en paramètre qu’elle décrémente à chaque seconde, jusqu’à 0.
1.	instanciez cette classe avec le parametre 5 et vérifiez son fonctionnement. 
2.	Ajouter une fonctionnalité à cette classe lui permettant de se désinscrire du compte à rebours lorsque ce dernier arrive à 0. 
3.	instancier plusieurs (10) **compteARebours** avec des valeurs aléatoires initiales comprises entre 10 et 20. 
4.	Vous allez remarquer que l’exécution précédente engendre souvent des Bogues.  Pourquoi ?
##
**5/** Afin de résoudre les problèmes relatifs à notre observer, nous allons déléguer son travail à une instance de la classe : **PropertyChangeSupport**.
   NB.  Pensez à faire hériter notre interface **TimerChangeListener** de la classe **PropertyChangeListener**

Avez-vous résolu le problème ?

**Bonus** : en utilisant ce service, créer une application permettant d’afficher l’heure sur une interface graphique.
