#Author: Mahdi Hadj Daoud
Feature: disque ssd

  Scenario: Commander un produit
    Given utilisateut et sur la page disque ssd
    When utilisateur Verifier et commander un produit en stock "Disque Dur Team Group MS30 SSD M.2 2280 / 128 Go"
    Then utilisateur Verifier la commande "Disque Dur Team Group MS30 SSD M.2 2280 / 128 Go"
