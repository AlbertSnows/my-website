(ns my-website.page.sidebar
  (:require
    [reagent.core :as r]
    [my-website.page.current :as c]))

(defn sidebar []
  [:div#sidebar-wrapper
   [:ul#sidebar-entries.sidebar-nav
    [:li.sidebar-brand>a {:on-click
                            #(reset! c/current-page (c/outer-box "home"))
                          :href
                          "#"} "Home"]
    [:li>a {:on-click
              #(reset! c/current-page (c/outer-box "about"))
            :href
              "#"} "About"]
    [:li>a {:on-click
              #(reset! c/current-page (c/outer-box "contact"))
            :href
            "#"} "Contact"]
    [:li>a {:on-click
              #(reset! c/current-page (c/outer-box "projects"))
            :href
            "#"} "Projects"]]])

(defn toggle-class [atom key old-class new-class]
  (if (= (@atom key) old-class)
    (swap! atom assoc key new-class)
    (swap! atom assoc key old-class)))

(defn menu-toggle [state]
    [:div
     {:id "sidebar-toggle-button"
      :on-click #(toggle-class state :state "closed" "toggled")}
     [:p "["]])

(def sidebar-state (r/atom {:state "closed"}))

(defn build-sidebar []
    [:div
     {:id "sidebar"
      :class (@sidebar-state :state)}
     [:div#toggle-wrapper
      (menu-toggle sidebar-state)]
     [sidebar]])


