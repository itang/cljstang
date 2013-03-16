(ns cljstang.core)

(defn ^:export ends-with [str suffix]
  (not= -1
        (.indexOf str suffix
          (- (.-length str)
             (.-length suffix)))))
