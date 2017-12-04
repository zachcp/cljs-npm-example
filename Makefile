build:
	lein trampoline run -m clojure.main build.clj

clean:
	rm -rf rm -rf node_modules/ out/ target/
	rm -rf package*