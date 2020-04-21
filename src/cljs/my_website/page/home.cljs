(ns my-website.page.home)

(def home-page-header [:p {:id "home-header"} "What am I up to?"])
(def home-page-body
  [:div {:id "home-body"}
   [:div {:id "25_01_2020" :class "box"}
    [:p {:class "date"} "25/01/2020"]
    [:div {:class "general-container"}
     [:div {:class "left-side"}
      [:div {:id "table-role-video" :class "href-image-container"}
       [:a {:href "https://en.wikipedia.org/wiki/Gaming" :target "__blank" :rel "noopener noreferrer"}
        [:img {:src "../images/WITH_OUR_THREE_POWERS_COMBINED.png" :alt "I play games I KNOW I'M SORRY"}]]]
      [:div {:id "thonker" :class "href-image-container padding-right"}
       [:a {:href "https://www.whatisitliketobeaphilosopher.com/" :target "__blank" :rel "noopener noreferrer"}
        [:img {:src "../images/the-thinker.png" :alt "But really, what even IS a rock anyways!?!?!?!"}]
        ]]]

     [:div {:class "middle padding-bottom"} [:p {:class "enlarge-text"} "Mostly this stuff"]
      [:p {:class "small-text"} "(check out my projects for novel things)"]]

     [:div {:class "right-side"}
      [:div {:id "tuber" :class "href-image-container"}
       [:a {:href "https://www.youtube.com/" :target "__blank" :rel "noopener noreferrer"}
        [:img {:src "../images/tubes.png" :alt "Youtube is my Netflix, sadly"}]]]
      [:div {:id "sudo-apt-get-gf" :class "href-image-container"}
       [:a {:href "https://en.wikipedia.org/wiki/Programmer" :target "__blank" :rel "noopener noreferrer"}
        [:img {:src "../images/meirl.png" :alt "g! 'How to print newline in cljs'"}]]]]]]])
