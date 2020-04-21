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

(defn menu-toggle-render []
  [:div#sidebar-toggle-button "["])


(defn menu-toggle-did-mount [this]
  (.click (js/$ (r/dom-node this))
          (fn [e]
            (.preventDefault e)
            ;#wrapper will be the id of a div in our home component
            (.toggleClass (js/$ "#wrapper") "toggled"))))

(defn menu-toggle []
  (r/create-class
    { :reagent-render menu-toggle-render
      :component-did-mount menu-toggle-did-mount}))

(defn build-sidebar []
  [:div#wrapper
   [:div#toggle-wrapper
    [menu-toggle]]
   [sidebar]])