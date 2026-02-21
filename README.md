# 🍓 Fruit Hub - Jetpack Compose Android App

A modern Android application built using **Jetpack Compose** that showcases fruit salad combos with a clean UI and smooth navigation flow.

This project contains **3 screens**:

1. Splash Screen
2. Welcome Screen
3. Home Screen

---

## 📱 Screenshots

### 🚀 Splash Screen

![Splash Screen](./screenshots/splash.png)

### 👋 Welcome Screen

![Welcome Screen](./screenshots/welcome.png)

### 🏠 Home Screen

![Home Screen](./screenshots/home.png)

> 💡 Place your screenshots inside a folder named `screenshots` in your project root and rename them:
>
> * splash.png
> * welcome.png
> * home.png

---

# 🧠 What I Learned From This Project

This project helped me understand and practice the following Jetpack Compose concepts:

---

## 🔹 1. Jetpack Compose Basics

* `@Composable` functions
* `Column`, `Row`, `Box` layouts
* `Modifier` usage
* `padding`, `fillMaxSize`, `background`, `size`
* `Alignment` and `Arrangement`

---

## 🔹 2. Navigation in Compose

* Using `NavController`
* Setting up `NavHost`
* Creating routes
* Navigating between screens
* Clearing back stack using `popUpTo`
* Managing screen flow (Splash → Welcome → Home)

---

## 🔹 3. Splash Screen Logic

* Using `LaunchedEffect`
* Coroutine `delay()`
* Animations using:

    * `Animatable`
    * `tween`
    * `OvershootInterpolator`
* Scale animation on logo

---

## 🔹 4. Gradient UI Design

* Using `Brush.verticalGradient`
* Creating modern gradient backgrounds
* Using `colorStops`
* Applying gradients with `.background(brush)`

---

## 🔹 5. UI Components

* `Card`
* `LazyRow`
* Custom Search Bar UI
* Icons from `Icons.Default`
* Rounded shapes using `RoundedCornerShape`
* Circle background using `CircleShape`

---

## 🔹 6. Data Modeling in Kotlin

* Creating a `data class`
* Using `listOf()` and `mutableListOf()`
* Passing model data into composables
* Rendering dynamic UI using `LazyRow`

---

## 🔹 7. State & Recomposition

* Understanding `remember`
* Animating state values
* Handling recomposition properly

---

## 🔹 8. Clean UI Structure

* Separating screens into different files
* Organizing project structure
* Reusable composables (`RecommendedComboCard`)

---

# 📂 Project Structure

```
com.ezhar.jetpack_compose_android
│
├── MainActivity.kt
│
├── screens/
│   ├── SplashScreen.kt
│   ├── WelcomeScreen.kt
│   └── HomeScreen.kt
│
├── model/
│   └── FruitCombo.kt
│
└── ui/theme/
```

---

# 🔄 App Flow

```
App Launch
   ↓
Splash Screen (2 seconds delay + animation)
   ↓
Welcome Screen (Button Click)
   ↓
Home Screen
```

---

# 🎨 UI Highlights

* Modern gradient splash screen
* Clean onboarding layout
* Card-based product listing
* Horizontal scrolling combos
* Minimal & modern design style

---

# 🛠️ Built With

* Kotlin
* Jetpack Compose
* Navigation Compose
* Material 3
* Android Studio

---

# 🚀 Future Improvements

* Add ViewModel (MVVM Architecture)
* Add Cart functionality
* Add Favorites state handling
* Add Search functionality
* Add animations between screens
* Add backend / Firebase integration

---

# 👨‍💻 Author

Ezhar – Android Developer (Jetpack Compose Learner 🚀)
