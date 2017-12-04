;; build.clj
(require '[cljs.build.api :as b])

;(b/build "src"
;  {:output-to   "out/main.js"
;   :output-dir  "out"
;   :optimizations :none
;   :main 'example.core
;   :npm-deps {:left-pad "1.1.3"} ;; NEW
;   :install-deps true ;; NEW
;})


;(b/build "src"
;  {:output-to   "out/main.js"
;   :output-dir  "out"
;   :optimizations :simple
;   :main 'example.core
;   :npm-deps {:left-pad "1.1.3"} ;; NEW
;   :install-deps true ;; NEW
;})

(b/build "src"
  {:output-to   "out/main.js"
   :output-dir  "out"
   :optimizations :advanced
   :main 'example.core
   :npm-deps {:left-pad "1.1.3"} ;; NEW
   :install-deps true ;; NEW
})
