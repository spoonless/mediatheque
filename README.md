# mediatheque
projet d'exemple dans le cadre de la formation Java (avril 2018)

Les usagers empruntent des exemplaires.

Un usager a un historique de ses prêts/retours

Prêt concerne un exemplaire avec une date d'emprunt et une date de retour. 
La date d'un prêt peut être dépassée

Un exemplaire a un code de la médiathèque

Un exemplaire est un document et parmi les documents, on trouve :
* livre (titre, auteur, éditeur, date d'édition, ISBN)
* revue (titre, éditeur, date d'édition, ISSN)
* film (titre, réalisateur, distributeur, date de distribution, ISBN)

Règles pour l'emprunt

* Un usager ne peut pas emprunter plus de 6 exemplaires.
* Un usager ne peut pas emprunter plus de 3 films (exception particulière)
* Un usager peut emprunter des exemplaires suivant son âge :
	* Jeunesse :jusqu'à de 0 ans
	* Adulte : à partir de 14 ans
	* Tout public : quel que soit l'âge

Idées TODO

implémenter la méthode pour retourner un exemplaire
on ne peut pas ramener un exemplaire le dimanche ou le lundi 
rechercher la liste des exemplaires disponibles pour un document selon son titre (méthode sur Mediatheque)
un usager ne peut plus emprunter d'exemplaires si un de ses prêts est en retard
un exemplaire peut avoir les états (énumération) suivants :
  * disponible
  * emprunté
  * perdu

Evolution
Section : ajouter la section adolescent :  jeunesse, adolescent (15-17), adulte (18 et +)

Nouvelle fonctionnalité
Ajouter la classe Bibliothecaire (qui N'EST PAS un usager). Les Bibliothécaires et les Usagers peuvent donner leur avis sur une document.
Un avis est constitué d'une date, d'une note sur 5, d'un commentaire et d'un auteur. Pour l'auteur on peut utiliser une interface.

