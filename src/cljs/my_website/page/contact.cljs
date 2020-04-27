(ns my-website.page.contact)

(def contact-page-header
  [:p {:id "contact-header"} "Reach Out"])
(def contact-page-body
  [:div {:id "contact-body"}
   [:div {:id "contact-items" :class "box"}
    [:div {:id "email" :class "href-image-container"}
     [:span {:class "popup"} [:img {:id "email-secure" :src "../images/mail_secure.PNG" :alt "for security reasons"}]]
     [:a [:img {:src "../images/mailV2.PNG" :alt "email"}]]]
    [:div {:id "github" :class "href-image-container"}
     [:a {:href "https://github.com/AlbertSnows" :target "__blank" :rel "noopener noreferrer"}
      [:img {:src "../images/github.PNG" :alt "github"}]]]
    ]
   [:div {:class "very-small-text"} "Email for social media"]])
