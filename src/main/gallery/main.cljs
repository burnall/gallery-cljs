(ns gallery.main
  (:require [reagent.core :as reagent])
  (:require [reagent.dom :as reagentDom])

  )

(defn app [] [:h1 "Gallery"])

(defn mount! []
  (reagentDom/render [app]
                  (.getElementById js/document "app")))

(defn main! []
  (mount!))

(defn reload! []
  (mount!))
