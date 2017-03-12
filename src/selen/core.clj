(ns selen.core
  (:gen-class)
  (:import
   org.openqa.selenium.htmlunit.HtmlUnitDriver
   [org.openqa.selenium WebDriver WebElement]
   [org.openqa.selenium.support.ui ExpectedCondition WebDriverWait]))

(defn get-url
  "Loads a web page and returns the HTML"
  [url]
  (let [driver (HtmlUnitDriver.)]
    (.setJavascriptEnabled driver true)
    (.get driver url)
    (println (str "title: " (.getTitle driver)))
    ;(doto (WebDriverWait. driver 10)
    ;(.until))
    (.getPageSource driver)
  )
)

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (get-url "https://wikipedia.org"))
  (println "Hello, World!"))
