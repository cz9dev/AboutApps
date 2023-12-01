# AboutApps library
[![GitHub license](https://img.shields.io/badge/license-Apache%20License%202.0-blue.svg?style=flat)](https://www.apache.org/licenses/LICENSE-2.0)

## Installing

* Step 1. Add the JitPack repository to your build file
Add it in your root build.gradle at the end of repositories:
```groovy
    repositories{
        mavenCentral()
        maven { url 'https://jitpack.io' }
    }
```
* Step 2. Add the dependency
```groovy
dependencies {
   implementation 'com.github.cz9dev:AboutApps:-SNAPSHOT'
}
```

## Usage:
In layout
```xml

<cu.tiaris.aboutlibrary.view.AboutLayout
        android:id="@+id/my_component"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintBottom_toBottomOf="parent"/>

```

In Classs
```kotlin
    // App Logo
    binding.myComponent.setLogoApp(getDrawable(R.drawable.logo_app)!!)
    // Developer avatar
    binding.myComponent.setAvatarDev(getDrawable(R.drawable.avatar_dev)!!)
    // App Name
    binding.myComponent.setNameApp("AboutApps!")
    // App version
    binding.myComponent.setVersionNameApp("1.5.9")
    // App Description
    binding.myComponent.setDescriptionApp("Esta es una apps para prueba, con ella podemos testear detalles de la librería")
    // Developer name
    binding.myComponent.setNameDev("Manuel Angulo Desdin")
    // Developer username
    binding.myComponent.setUserDev("madev")
    // Developer Description
    binding.myComponent.setDescriptionDev("Desarrollador amante a las tic, el deporte. En mi tiempo libre miro las estrellas.")
    // Link of the app and the developer
    binding.myComponent.everyLink(
        Uri.parse("https://apklis.cu/developer/czaldivarp"),
        Uri.parse("https://apklis.cu/developer/czaldivarp"),
        null,
        Uri.parse("https://apklis.cu/developer/czaldivarp"),
        Uri.parse("https://apklis.cu/developer/czaldivarp"),
        Uri.parse("https://apklis.cu/developer/czaldivarp"),
        Uri.parse("https://apklis.cu/developer/czaldivarp"),
        Uri.parse("https://apklis.cu/developer/czaldivarp"),
        Uri.parse("https://apklis.cu/developer/czaldivarp"),
        Uri.parse("https://apklis.cu/developer/czaldivarp"),
        Uri.parse("https://apklis.cu/developer/czaldivarp"),
        null
    )
```

Another way to show links to social networks would be:

```kotlin
    binding.myComponent.setUriGithubApp(Uri.parse("https://apklis.cu/developer/czaldivarp"))
    binding.myComponent.setUriWebSiteApp(Uri.parse("https://apklis.cu/developer/czaldivarp"))
    binding.myComponent.setUriApklisApp(Uri.parse("https://apklis.cu/developer/czaldivarp"))
    binding.myComponent.setUriTodusApp(Uri.parse("https://apklis.cu/developer/czaldivarp"))
    binding.myComponent.setUriGitHubDev(Uri.parse("https://apklis.cu/developer/czaldivarp"))
    binding.myComponent.setUriWebSiteDev(Uri.parse("https://apklis.cu/developer/czaldivarp"))
    binding.myComponent.setUriApklisDev(Uri.parse("https://apklis.cu/developer/czaldivarp"))
    binding.myComponent.setUriTodusDev(Uri.parse("https://apklis.cu/developer/czaldivarp"))
    binding.myComponent.setUriLinkedInDev(Uri.parse("https://apklis.cu/developer/czaldivarp"))
    binding.myComponent.setUriFacebookDev(Uri.parse("https://apklis.cu/developer/czaldivarp"))
    binding.myComponent.setUriXDev(Uri.parse("https://apklis.cu/developer/czaldivarp"))
    binding.myComponent.setEMailDev("czaldivarp@nauta.cu")
```
## Compatibility
minSdk = 24

## Developers
cz9dev

## License
```
Copyright 2023 cz9dev

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
   
```