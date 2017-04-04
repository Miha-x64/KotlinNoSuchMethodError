Code listed in [src/runMe.kt] leads to this error:
```
Exception in thread "main" java.lang.NoSuchMethodError: RunMeKt$main$1$1$SomeClass.<init>(LRunMeKt$main$$inlined$createRunnable$1$lambda$1;Ljava/lang/String;)V
	at RunMeKt$main$$inlined$createRunnable$1$lambda$1.run(runMe.kt:6)
	at RunMeKt$main$$inlined$createRunnable$1.run(runMe.kt:23)
	at RunMeKt.main(runMe.kt:19)
```

As I noticed, this happens for `inner` classes declared inside of cross-inlined code.