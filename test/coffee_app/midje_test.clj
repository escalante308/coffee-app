(ns coffee-app.midje-test
  (:require [coffee-app.core :refer [price-menu]]
            [coffee-app.utils :refer :all]
            [midje.sweet :refer [=> fact provided unfinished]]))

(fact (calculate-coffee-price price-menu :latte 3) => 1.5)


(fact "Message about number of bought coffees should include currency symbol"
      (get-bought-coffee-message-with-currency :latte 3 1.5 :euro) => "Buying 3 latte coffees for total: €1.5"
      (provided (get-currency test-currency) => "€"))