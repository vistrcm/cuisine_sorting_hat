(defproject cuisine_sorting_hat "0.1.0-SNAPSHOT"
  :description "cuisine_sorting_hat helps to decide what to try today"
  :url "https://github.com/vistrcm/cuisine_sorting_hat"
  :license {:name "MIT License"
            :url "https://github.com/vistrcm/cuisine_sorting_hat/blob/main/LICENSE"}
  :dependencies [[org.clojure/clojure "1.10.1"]]
  :main ^:skip-aot cuisine-sorting-hat.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
