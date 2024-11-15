# Angkotin - Malang Public Transportation App 🚍

**Angkotin** is a mobile application designed to make navigating the public transportation system in Malang, East Java, Indonesia, easier and more convenient. This app provides route suggestions, bus schedules, and real-time navigation, helping users find the best public transit routes to their destinations. Built with Jetpack Compose, Google Maps API, and an AI-powered recommendation system, Angkotin is your guide to Malang's public transportation network.

## 📱 Features

- **Interactive Map and Route Visualization**: View routes directly on a map, with route details displayed in a visually engaging format.
- **Smart Route Suggestions**: Get the best route recommendations based on your current location and destination, powered by a custom machine learning model.
- **Detailed Route Information**: See all stops along a route, including street names and landmarks.
- **Real-time Navigation**: Access Google Maps for turn-by-turn directions and live location tracking.
- **Route Details Page**: View an expanded page for each route, with detailed stop information and interactive bottom sheets.
- **Favorite Routes**: Mark frequently used routes for quick access.
- **Dynamic Bottom Sheet**: Drag the route details up or down to view route information while still seeing the map.

## 🛠️ Technology Stack

- **Kotlin** with **Jetpack Compose** for UI
- **Google Maps API** for map functionality and route visualization
- **Machine Learning Model** for route recommendations
- **Android Navigation Component** for smooth navigation between screens
- **Jetpack Room** for offline storage of route and stop information
- **GeoApiContext** for handling map and route data
- **Material Design 3** for a modern UI experience

## 🔄 How It Works

1. **Route Suggestions**: Input your current location and desired destination. The app suggests the best routes based on available bus routes.
2. **Route Details**: Click on any route to view detailed information, including street names, stop locations, and arrival times.
3. **Interactive Map**: The map shows the route, with each stop marked. A draggable bottom sheet provides detailed stop information.
4. **Favorite and Plan Trips**: Save preferred routes, set reminders, and plan trips in advance for easier commuting.

## 🚀 Getting Started

### Prerequisites

- Android Studio Dolphin or later
- API Key for Google Maps (add your key in `res/values/strings.xml` under `google_map_api_key`)

### Installation

1. **Clone the repository**:
   ```bash
   git clone https://github.com/YourUsername/Angkotin.git
   ```
2. **Open the project in Android Studio**.

3. **Add API Key**:
   - Open `res/values/strings.xml`.
   - Add your Google Maps API key:
     ```xml
     <string name="google_map_api_key">YOUR_API_KEY_HERE</string>
     ```

4. **Build and Run**:
   - Connect an Android device or start an emulator.
   - Press **Run** to install the app on your device.

## 📂 Project Structure

- **ui/screens/**: Contains all screens like `HomePage`, `RouteDetailPage`, and `MapView`.
- **data/models/**: Holds data models such as `RouteEntity` and `Stop`.
- **utils/**: Utility functions, helper classes, and route recommendations logic.
- **navigation/**: Navigation configurations and route management.

## 📸 Screenshots

- **Route Suggestions**: Displays routes based on user location and destination.
- **Route Details Page**: Interactive map with draggable bottom sheet containing detailed route and stop information.

## 🚧 Future Enhancements

- **Real-time Updates**: Integrate with APIs for live arrival times.
- **Push Notifications**: Notify users of route changes, delays, or updates.
- **Offline Mode**: Allow offline access to route information.
- **User Feedback Integration**: Gather and display user reviews for each route.


## 📄 License
