(ns my-website.events
  (:require [re-frame.core :as re-frame]
            [my-website.db :as db]))

(re-frame/reg-event-db
 :initialize-db
 (fn  [_ _]
   db/default-db))
