(ns my-website.page.examples.sidebar
  ;(:require [reagent.my-website.entrance :as r])
  )

;old
;(defn menu-toggle-render []
;  [:div#sidebar-toggle-button
;   {:on-click (toggle-class a k "#wrapper" "toggled")}
;   "["])


;(defn menu-toggle-did-mount [this]
;  (.click (js/$ (r/dom-node this))
;          (fn [e]
;            (.preventDefault e)
;            ;#wrapper will be the id of a div in our home component
;            (.toggleClass (js/$ "#wrapper") "toggled"))))

;(defn menu-toggle []
;  (r/create-class
;    { :reagent-render menu-toggle-render
;      ;:component-did-mount menu-toggle-did-mount
;     }))
;;;;;;;;;;;;;;;;;;;;;;;

; works

;(def menu-toggle
;  [:div
;   {:id "sidebar-toggle-button"
;    }
;   "["]
;  )

;(defn add-toggler [id old-class new-class contents]                               ; empty, toggled
;  (let [local-state (r/atom {:btn-class old-class})]
;    (fn []
;      [:div
;       {:id id
;        :class (@local-state :btn-class)
;        :on-click #(toggle-class local-state :btn-class old-class new-class)}
;       contents]))
;  )
;
;(def build-sidebar
;  (add-toggler
;    "sidebar"
;    "empty"
;    "toggled"
;    (seq
;      [[:div#toggle-wrapper menu-toggle]
;       [sidebar]])))
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;[:div
;
; {:id "sidebar"}
; [:div#toggle-wrapper menu-toggle]
; [sidebar]]

;(let [local-state (r/atom {:btn-class "btn peepee"})]
;  (fn []
;    [:div#sidebar
;     [:div
;      {:id ""
;       ;:class (@local-state :btn-class)
;       ;:on-click #(toggle-class local-state :btn-class "btn peepee" "btn poopoo")
;       }
;      "click me"
;      ]
;
;     ]
;    )
;  )

;(let [local-state (r/atom {:btn-class "sidebar-toggle-button"})]
;  [:div#sidebar
;   (fn []
;     [:div
;      {:id "toggle-wrapper"
;       :class (@local-state :btn-class)
;       :on-click #(toggle-class local-state :btn-class "example" "toggled")
;       }
;      "click-me"
;      ;[menu-toggle]
;      ]
;     )
;   ;[sidebar]
;   ]
;  )
;)














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

