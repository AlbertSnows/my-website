(ns cljs.user
  (:require [my-website.core]
            [my-website.system :as system]))

(def go system/go)
(def reset system/reset)
(def stop system/stop)
(def start system/start)
