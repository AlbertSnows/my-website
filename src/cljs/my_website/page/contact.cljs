(ns my-website.page.contact)

(def contact-page-header
  [:p {:id "contact-header"} "Reach Out"])
(def contact-page-body
  [:div {:id "contact-body"}
   [:div {:id "contact-items" :class "box"}
    [:div {:id "email" :class "image-container item"}
     [:a {:href "ajsnow2012@gmail.com" :target "__blank" :rel "noopener noreferrer"}
      [:img {:src "../images/mail.PNG" :alt "email"}]]]
    [:div {:id "github" :class "image-container item"}
     [:a {:href "https://github.com/AlbertSnows" :target "__blank" :rel "noopener noreferrer"}
      [:img {:src "../images/github.PNG" :alt "github"}]]]]
   [:div {:class "small-text"} "Email for social media"]])
