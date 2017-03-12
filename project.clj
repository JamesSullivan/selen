(defproject selen "0.1.0-SNAPSHOT"
  :description "Startup Clojure template for Selenium"
  :url "http://github.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.seleniumhq.selenium/selenium-java "3.3.1" :exclusions [org.seleniumhq.selenium/selenium-support]]
                 [org.seleniumhq.selenium/selenium-api "3.3.1"]
                 [org.seleniumhq.selenium/selenium-support "3.3.1"]
                 [org.seleniumhq.selenium/htmlunit-driver "2.25" :exclusions [org.seleniumhq.selenium/selenium-api org.seleniumhq.selenium/selenium-support]]]
  :main ^:skip-aot selen.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
  :jvm-opts ["-Xmx2g"]
