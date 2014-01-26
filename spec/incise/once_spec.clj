(ns incise.once-spec
  (:require [incise.once :refer [once]]
            [stefon.util :refer [temp-dir]]
            [clojure.java.io :refer [file]]
            [speclj.core :refer :all]))

(def spec-temp-dir (partial temp-dir "incise-once-spec"))

(describe "once"
  (with-all out-dir (spec-temp-dir))
  (with-all out-dir-path (.getCanonicalPath @out-dir))
  (with once-result (once :in-dir "resources/spec"
                          :precompiles []
                          :out-dir @out-dir-path))
  (it "returns files parsed"
    (doseq [filename-title ["example"]]
      (should-contain (file @out-dir-path filename-title "index.html")
                      @once-result))))

(run-specs)
