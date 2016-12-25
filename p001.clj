(defn get-first-thou-mult
  ([n]
   (get-first-thou-mult 0 n []))

  ([i n arr]
   (if (< i 1000)
     (get-first-thou-mult (+ i n) n (conj arr i))
     arr)))

(defn euler-one
  []
  (reduce +
   (set
    (concat (get-first-thou-mult 3) (get-first-thou-mult 5)))))
