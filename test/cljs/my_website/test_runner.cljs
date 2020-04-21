(ns my-website.test-runner
  (:require
   [doo.runner :refer-macros [doo-tests]]
   [my-website.core-test]
   [my-website.common-test]))

(enable-console-print!)

(doo-tests 'my-website.core-test
           'my-website.common-test)
