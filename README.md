https://youtrack.jetbrains.com/issue/KT-17242

Code listed in [runMe.kt](src/runMe.kt) leads to error:
```
Exception in thread "main" java.lang.NoSuchMethodError: RunMeKt$main$1$1$SomeClass.<init>(LRunMeKt$main$$inlined$createRunnable$1$lambda$1;Ljava/lang/String;)V
	at RunMeKt$main$$inlined$createRunnable$1$lambda$1.run(runMe.kt:6)
	at RunMeKt$main$$inlined$createRunnable$1.run(runMe.kt:23)
	at RunMeKt.main(runMe.kt:19)
```

As I noticed, this happens for `inner` classes declared inside of cross-inlined code.
