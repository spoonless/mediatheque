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
