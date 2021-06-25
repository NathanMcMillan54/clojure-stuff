(ns imports-2.core)
(require 'imports-2.other_file '[imports-2.other_file :as other_file])


(defn -main []
  (other_file/imported_function)
  (println "Main function calling an imported function"))
