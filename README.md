# kotlin-di-toothpick-example
playground to explore toothpick dependency injection

Why toothpick?

- DI without reflection
- app startup is damn fast
- might be useful for FaSS deployments - where startup time might matter a lot
- and testing ... its nice not having to wait 5 mins to build up a test context

## based on
- introduction: https://hackernoon.com/java-libraries-with-kotlin-the-case-of-dependency-injection-frameworks-3366f1d6cf48
- toothpick-kotlin-extensions: https://github.com/sporttotal-tv/toothpick-kotlin-extensions
- toothpick-di: https://github.com/stephanenicolas/toothpick
- example: https://github.com/wongcain/okuki/tree/master/okuki-toothpick
- example: https://github.com/ekamp/KotlinWeather

## compile

    $ ./gradlew clean build
    
## note

    I did not manage to configure the idea plugin the right way.
    Build in Intellij does not run the kapt processor.    
