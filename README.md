# Compose Navigation Example

This project demonstrates how to implement navigation in an Android app using Jetpack Compose Navigation.

## Table of Contents

- [Introduction](#introduction)
- [Setup](#setup)
  - [Step 1: Add Compose Navigation Library](#step-1-add-compose-navigation-library)
  - [Step 2: Create a NavHostController](#step-2-create-a-navhostcontroller)
  - [Step 3: Define NavHost Graph](#step-3-define-navhost-graph)
- [Usage](#usage)
  - [Define Screens and Destinations](#define-screens-and-destinations)
  - [Navigation Actions](#navigation-actions)
- [Explanation](#explanation)

## Introduction

Jetpack Compose Navigation simplifies the navigation between composables in an Android app. This project serves as a basic example to showcase the implementation of navigation using Compose.

## Setup

### Step 1: Add Compose Navigation Library

Add the following dependency to your app's `build.gradle` file to include the Compose Navigation library:

```groovy
// Navigation
implementation("androidx.navigation:navigation-compose:2.7.6")
```

## Step 2: Create a NavHostController

In your `Main.kt` file, create a `NavHostController` using `rememberNavController()`:

```kotlin
val navController = rememberNavController()
```
## Step 3: Define NavHost Graph

Create a NavHost graph within your `Main.kt` file. This graph is responsible for managing the navigation flow between different screens:

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
# Usage

## Define Screens and Destinations

Define each screen as a composable function (`HomeScreen`, `SecondScreen`, `LastScreen`) and specify their respective routes using a sealed class or enum (`Screen` in this example).

## Navigation Actions

Within each screen, use the `NavHostController` to navigate to other destinations using `navController.navigate(destinationRoute)` and handle back navigation using `navController.popBackStack()`.

## Explanation

Jetpack Compose Navigation simplifies the navigation between composables in an Android app.

- `NavHostController` is a controller used to navigate through different destinations in the app.
- `NavHost` represents the navigation host that manages the navigation within the app and holds the navigation graph.
- The navigation graph (`NavHost`) is defined by composing different destinations (`composable`) associated with their respective routes.

By following these steps, you can create a structured and manageable navigation flow within your Jetpack Compose app.
