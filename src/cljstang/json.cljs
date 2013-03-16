(ns cljstang.json)

(defn ^:export stringify [o]
  (.stringify js/JSON o))

(defn ^:export parse [s]
  (.parse js/JSON s))
