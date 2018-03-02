(ns unrepl.core)

(def ^:once ^:private loaded-by "unrepl.repl")

(def ^:once ^:dynamic *string-length* 80)
(def ^:once ^:dynamic ^{:arglists '([x])} write "Atomically machine-prints its input to the output stream.")

(defn ^:once non-eliding-write "use with care" [x]
  (binding [*print-length* Long/MAX_VALUE
            *print-level* Long/MAX_VALUE
            *string-length* Long/MAX_VALUE]
    (write x)))