(ns my-website.page.about
  (:require [reagent.core :as r]))

(def image-dir "../images/")
(def classes "href-item-container")
(def about-page-header [:div {:id "about-header"} "About me"])

(defn date [time]
  [:div {:id time :class "about-header"}
   [:p {:class "date"} time]])

(defn timeline-container [id class header body]
  [:div {:id id :class (str "box timeline-container" class)} header body])

(defn timeline-body [left middle right]
  [:div.about-body left middle right])

(defn div-container [id class contents]
  [:div {:id id :class class} contents])

(defn left-side [id contents]
  (div-container id "left-side" contents))

(defn right-side [id contents]
  (div-container id "right-side" contents))

(defn middle [id contents]
  (div-container id "middle" contents))

(defn image-container [id class src alt]
  [:img {:id id :class class :src (str image-dir src) :alt alt}])

(defn image-href-container [id class href image-container]
  [:div {:id id :class class}
   [:a {:href href :target "__blank" :rel "noopener noreferrer"}
    image-container]])

(def about-page-body
  (seq
    {:end-node-key
     (timeline-container
       "end-node" ""
       (date "2020")
       (timeline-body
         (left-side ""
                    (image-href-container
                      "my-website-link"
                      classes
                      "https://github.com/AlbertSnows/MyWebsite"
                      (image-container
                        "this-website-img"
                        "placeholder"
                        (str image-dir "this_website.PNG")
                        "This Website")))
         (middle ""
                 (image-container
                   "end-node-raw"
                   "raw-img"
                   "end-node.PNG"
                   "end of the road, cowboy"))
         (right-side "" [:div "right"])))
     }))
     ;^{:key "segment-2-key"}
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
     ;^{:key "segment-3-key"}
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
