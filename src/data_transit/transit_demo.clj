(ns data-transit.transit-demo
  (require [clojure.java.io :as io]
    [cognitect.transit :as transit]))

(def data-file (io/file (io/resource "transit_data.json")))

(defn write-object [object]
  (with-open [o (io/output-stream data-file)]
    (let [writer (transit/writer o :json)]
      (transit/write writer object))))

(defn read-object []
  (with-open [xin (io/input-stream data-file)]
    (let [reader (transit/reader xin :json)]
      (transit/read reader))))

