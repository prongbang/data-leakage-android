# data-leakage-android

Safe Data Leakage for Android.

[![](https://jitpack.io/v/prongbang/data-leakage-android.svg)](https://jitpack.io/#prongbang/data-leakage-android)

## Setup

- `build.gradle`

```groovy
buildscript {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}
```

- `settings.gradle`

```groovy
dependencyResolutionManagement {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}
```

- `app/build.gradle`

```groovy
implementation 'com.github.prongbang:data-leakage-android:1.0.0'
```

## How to use

```kotlin
import com.prongbang.dataleakage.DataLeakageAndroid

class MainActivity : AppCompatActivity() {

    private val dataLeakageAndroid by lazy { DataLeakageAndroid() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataLeakageAndroid.setFlagSecure(window)
        setContentView(R.layout.activity_main)
    }
}
```