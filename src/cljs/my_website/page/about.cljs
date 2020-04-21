(ns my-website.page.about
  (:require [reagent.core :as r]))

(def about-page-header [:div {:id "about-header"} "About me"])

(defn new-class-container [name contents]
  [:div {:class name} contents])
(defn new-id-container [name contents]
  [:div {:class name} contents])

(defn left-side [contents] (new-class-container "left-side" (seq contents)))
(defn right-side [contents] (new-class-container "right-side" (seq contents)))
(defn time-line [contents] (new-class-container "node" (seq contents)))

(defn general-container [left-contents node right-contents]
  [:div {:class "general-container"}
   (left-side left-contents)
   (time-line node)
   (right-side right-contents)
   ])

(def about-page-head
  [:div {:id "25_01_2020" :class "box"}
   [:p {:class "date"} "25/01/2020"]
   (general-container
     [:div]
     [:div]
     [:div]
     )])
;[:div {:id "paycom" :class "image-container"}
     ; [:img {:src "../images/WITH_OUR_THREE_POWERS_COMBINED.png" :alt "I play games I KNOW I'M SORRY"}]]
     ;[:div {:id "ok-city" :class "image-container"}
     ; [:img {:src "../images/the-thinker.png" :alt "But really, what even IS a rock anyways!?!?!?!"}]]
     ;[[:id "end-node" :img {:src "../images/end-node.png" :alt "End of the road, cowboy"}]]
     ;[[:div {:id "KSU" :class "image-container"}
     ;  [:img {:src "../images/tubes.png" :alt "Youtube is my Netflix, sadly"}]]]

(def about-page-body
  [:div {:id "about-body"}
   about-page-head])

; how to get a sample swapping thing working
;(def atum (r/atom [:div "a"]))
;(defn o-o-c [a] (if (= a [:div "a"]) [:div "e"] [:div "a"]))
;(def swapper1 #(swap! atum o-o-c))
;; https://www.w3schools.com/howto/tryit.asp?filename=tryhow_js_sidenav_push
;(defn sidebar-button []
;  [:div {:id "toggle-sidebar-test"} @atum
;   [:button {:type "button"
;             :id "toggle-sidebar"
;             :on-click swapper1
;             } "my-website"]
;   ]
;  )j