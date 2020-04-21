(ns my-website.entrance
  (:require
    ;[re-frame.core :as re-frame]
    ;[reagent.core :as reagent :refer [atom]]
    [my-website.page.current :as main]
    [my-website.page.sidebar :as sidebar]))

(defn main-panel []
  [:div {:id "page"}
   [main/get-current-page]
   [sidebar/build-sidebar]])


;(let [name (re-frame/subscribe [:name])]
;  (fn []
;    [:div {:class "outer-text"} "hey the name is " @name]
;
;    ))
