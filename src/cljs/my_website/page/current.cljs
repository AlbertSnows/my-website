(ns my-website.page.current
  (:require
    [cljs.core.match :refer-macros [match]]
    [my-website.page.home :as home]
    [my-website.page.about :as about]
    [my-website.page.contact :as contact]
    [my-website.page.timeline :as timeline]
    [my-website.page.projects :as projects]
    [reagent.core :as r]))

(defn get-inner-content [request]
   (match [request]
     ["home"] home/home-page-body
     ["about"] about/about-page-body
     ["projects"] projects/project-page-body
     ["contact"] contact/contact-page-body
     ))

(defn inner-box [request]
  [:div {:id "inner-box"}
   (get-inner-content request)])

(defn get-header [request]
  (match [request]
    ["home"] home/home-page-header
    ["about"] about/about-page-header
    ["projects"] projects/project-page-header
    ["contact"] contact/contact-page-header
    ))

(defn outer-box [request]
  [:div {:id "outer-box" :class "outer-bottom-padding" :nonsense "HEY WHAT DO YOU THINK YOU'RE DOING LOOKING IN HERE. "}
   [:div {:id "outer-text"} (get-header request)]
   (inner-box request)
   ])

(def current-page
  (r/atom [outer-box "home"]))

(defn get-current-page [] @current-page)