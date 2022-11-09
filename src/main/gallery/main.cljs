(ns gallery.main
  (:require [reagent.core :as r])
  (:require [reagent.dom :as reagentDom])

  )

(defn galleryPage[] )

(defn app [] 
  [:main.container.mx-auto.pt-5
   [:p "Gallery"]
   [:p "Hey"]])



(defn mount! []
  (reagentDom/render [app]
                     (.getElementById js/document "app")))

(defn main! []
  (mount!))

(defn reload! []
  (mount!))
