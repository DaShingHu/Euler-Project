
(defn fibonacci-up-to
"Just call this with your value of x"
  ([x]
   (fibonacci-up-to x [1 1]))
  ([x a]
   (if (and (< (last a) x) (< (+ (last a) (get a (- (count a) 2))) x))
     (fibonacci-up-to x (conj a (+ (last a) (get a (- (count a) 2)))))
     a)))
