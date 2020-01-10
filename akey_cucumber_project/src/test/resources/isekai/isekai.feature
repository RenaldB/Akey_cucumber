#Author: Rénald BOOZ
Feature: Isekai no Dev
  
  C'est l'histoire de romain qui a était invoqué dans un autre monde, pour affronter le roi démon.

  Background: 
    Given Romain veut avoir un harem

  Scenario: Get the power
    When la jeune dark elfe loli, Emma, l'aide à avoir du pouvoir.
    Then elle propose à Romain de boire son jus d'amour pour le rendre plus fort.

  Scenario Outline: Obtention des pouvoir
    When elle donne son jus d'amour à <to>
    And il répond "<message>" sah quel plaisir
    Then il boit goulument son jus et hurle de toute ses forces "<expected>"

    Examples: 
      | to     | message  | expected    |
      | Romain | kimmochi | kimmochi !! |
