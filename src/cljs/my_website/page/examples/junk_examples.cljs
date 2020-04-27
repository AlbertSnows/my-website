(ns my-website.page.examples.junk-examples
  ;(:require [reagent.my-website.entrance :as r])
  )

;id fukin k man
;(timeline-body
;  (left-side
;    ""
;    (image-href-container
;      "my-website-link"
;      classes
;      "https://github.com/AlbertSnows/MyWebsite"
;      (image-container
;        "this-website-img"
;        "placeholder"
;        (str image-dir "this_website.PNG")
;        "This Website")))
;  (middle
;    ""
;    (image-container
;      "end-node-raw"
;      "raw-img"
;      "end-node.PNG"
;      "end of the road, cowboy"))
;     (right-side "" [:div "right"]))

;@(timeline-container "one" "two" [:div "first"] [:div "second"])
;@(example "poop")

;'(timeline-container "one" "two"
;                     '[:div "five"]
;                     '[:div "four"])
;(timeline-container "end-node" ""
;  (date "2020")
;  '[:div]
;  )
; ]
;
;))

;(timeline-body
;  (left-side
;    "" [:div "left"]
;    ;(image-href-container
;    ;  "my-website-link"
;    ;  classes
;    ;  "https://github.com/AlbertSnows/MyWebsite"
;    ;  (image-container
;    ;    "this-website-img"
;    ;    "placeholder"
;    ;    (str image-dir "this_website.PNG")
;    ;    "This Website"))
;    )
;  (middle
;    "" [:div "middle"]
;    ;(image-container
;    ;  "end-node-raw"
;    ;  "raw-img"
;    ;  "end-node.PNG"
;    ;  "end of the road, cowboy")
;    )
;  (right-side "" [:div "right"]))
;)
;^{:key (gen-key)}
;[:div "Goodbye"]
; ]

;)

;(seq
;  ^{:key (gen-key)
;    }
;  ;'[
;   ;^{:key (gen-key)
;   ;  }
;   (div-container "test" "class" "hello")
;
;    ;]
;
;  )

;(timeline-container
;     "end-node" ""
;     (date "2020") [:div]
;(timeline-body
;  (left-side
;    "" [:div "left"]
;    ;(image-href-container
;    ;  "my-website-link"
;    ;  classes
;    ;  "https://github.com/AlbertSnows/MyWebsite"
;    ;  (image-container
;    ;    "this-website-img"
;    ;    "placeholder"
;    ;    (str image-dir "this_website.PNG")
;    ;    "This Website"))
;    )
;  (middle
;    "" [:div "middle"]
;    ;(image-container
;    ;  "end-node-raw"
;    ;  "raw-img"
;    ;  "end-node.PNG"
;    ;  "end of the road, cowboy")
;    )
;  (right-side "" [:div "right"]))
;)
;]
;)
;:segment-1-key
;[:div "entry 2"]

;}
;)
;)

;(timeline-container
;  "segment-2" ""
;  (date "2019")
;  (timeline-body
;    (left-side ""
;      [:div "left"])
;    (middle ""
;      (image-container
;        "segment-2-raw"
;        "segment"
;        "middle-node-ltr.PNG"
;        "almost end of the road, cowboy"))
;    (right-side "" [:div "right"])))

;(timeline-container
;  "segment-3" ""
;  (date "2018")
;  (timeline-body
;    (left-side "" [:div "left"])
;    (middle ""
;      (image-container
;        "segment-2-raw"
;        "segment"
;        "middle-node-rtl.PNG"
;        "beginning of the road, cowboy"))
;    (right-side "" [:div "right"])))








; about page stuff
;
;(defn new-class-container [name contents]
;  [:div {:class name} contents])
;(defn new-id-container [name contents]
;  [:div {:class name} contents])
;
;(defn left-side [contents] (new-class-container "left-side" (seq contents)))
;(defn right-side [contents] (new-class-container "right-side" (seq contents)))
;(defn time-line [contents] (new-class-container "node" (seq contents)))
;
;(defn general-container [left-contents node right-contents]
;  [:div {:class "general-container"}
;   (left-side left-contents)
;   (time-line node)
;   (right-side right-contents)
;   ])
;
;(def about-page-head
;  [:div {:id "25_01_2020" :class "box"}
;   [:p {:class "date"} "25/01/2020"]
;   ])
;[:div {:id "paycom" :class "image-container"}
; [:img {:src "../images/WITH_OUR_THREE_POWERS_COMBINED.png" :alt "I play games I KNOW I'M SORRY"}]]
;[:div {:id "ok-city" :class "image-container"}
; [:img {:src "../images/the-thinker.png" :alt "But really, what even IS a rock anyways!?!?!?!"}]]
;[[:id "end-node" :img {:src "../images/end-node.PNG" :alt "End of the road, cowboy"}]]
;[[:div {:id "KSU" :class "image-container"}
;  [:img {:src "../images/tubes.png" :alt "Youtube is my Netflix, sadly"}]]]

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
;  )




;(general-container
; "end-node"
; (date "2020")
; [:div "example"]
;(seq
;  [

;(timeline-body
;  (left-side "" [:div "left"])
;  (middle "segment-2" [:div "middle"])
;  (right-side "" [:div "right"]))
;])

;)
;)


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

