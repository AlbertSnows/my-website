(ns my-website.page.examples.sidebar
  ;(:require [reagent.my-website.entrance :as r])
  )

;; https://gist.g ithub.com/kirked/7aefc94d1a45435a038728d26fd9b373
;(cljss.my-website.entrance/defstyles sidebar-contents-style [width]
;  {:height "100%"
;   :width width
;   :position "fixed"
;   :z-index "1"
;   :top "0"
;   :right "0"
;   :background-color "#111"
;   :overflow-x "hidden"
;   :transition "0.5s"
;   :padding-top "2%"})
;
;(def sidebar-contents
;  (r/atom
;   [:ul {:id "sidebar-ul"}
;    [:li.sidebar-brand>a {:href "#"} "Front"]
;    [:li>a {:href "#"} "About"]
;    [:li>a {:href "#"} "Projects"]
;    [:li>a {:href "#"} "Contact"]
;    [:li>a {:href "#"} "History"]]))
;
;(defn the-sidebar [style]
;  [:div {:id "sidebar-div" :class style} @sidebar-contents])
;
;(def open (the-sidebar (sidebar-contents-style "11em")))
;(def close (the-sidebar (sidebar-contents-style "0em")))
;
;(defn isopen [x]
;  (= x
;; (-> js/document
;;          (.width js/document
;;                  (.style js/document
;;                          (.getElementById js/document "sidebar-div"))))
;     "11em"))