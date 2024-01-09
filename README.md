# Compose Navigation Example

This project demonstrates how to implement navigation in an Android app using Jetpack Compose Navigation.

## Step 1: Add Compose Navigation Library

Add the following dependency to your app's `build.gradle` file to include the Compose Navigation library:

```groovy
// Navigation
implementation("androidx.navigation:navigation-compose:2.7.6")
```
##Step 2: Create a NavHostController
In your Main.kt file, create a NavHostController using rememberNavController():

```kotlin
val navController = rememberNavController()
```
##Step 3: Define NavHost Graph
Create a NavHost graph within your Main.kt file. This graph is responsible for managing the navigation flow between different screens:

```kotlin
NavHost(
    navController = navController,
    startDestination = Screen.Home.route
){
    composable(Screen.Home.route){
        HomeScreen(navController)
    }
    composable(Screen.Second.route){
        SecondScreen(navController)
    }
    composable(Screen.Last.route){
        LastScreen(navController)
    }
}
```
##Step 4: Define Screens and Destinations
Define each screen as a composable function (HomeScreen, SecondScreen, LastScreen) and specify their respective routes using a sealed class or enum (Screen in this example). You can use the Screen.kt file for this purpose:

```kotlin
sealed class Screen(val route: String) {
    object Home: Screen("home")
    object Second: Screen("screen")
    object Last: Screen("last")
}
```
##Step 5: Usage - Navigation Actions
Within each screen, use the NavHostController to navigate to other destinations using navController.navigate(destinationRoute) and handle back navigation using navController.popBackStack().

##Step 6: Explanation
Jetpack Compose Navigation simplifies the navigation between composables in an Android app.

NavHostController is a controller used to navigate through different destinations in the app.
NavHost represents the navigation host that manages the navigation within the app and holds the navigation graph.
The navigation graph (NavHost) is defined by composing different destinations (composable) associated with their respective routes.
By following these steps and organizing screens with the Screen sealed class, you can create a structured and manageable navigation flow within your Jetpack Compose app.

