(ns coffee-app.expectation-test
    (:require [coffee-app.core :refer [price-menu]]
              [coffee-app.utils :refer :all]
              [expectations :refer [expect in]]))

;; Test returned Value
(expect 1.5 (calculate-coffee-price price-menu :latte 3))
 
;; Test returned Class
(expect Number (calculate-coffee-price price-menu :latte 2))

;; Test if the method returns an Exception
(expect ClassCastException (calculate-coffee-price price-menu :latte "1"))
 
;; Test if response has a map
(expect {:latte 0.5} (in price-menu))