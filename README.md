 Anytime CarWash
An eco-friendly on-demand car wash mobile app built with React Native and Firebase.

Anytime CarWash lets users book, track, and pay for car washes from their phones.
It’s designed to promote sustainability through real-time tracking, dynamic pricing, and eco-tracking features.


Opening the Project in Android Studio
	1.	Clone the Repository

git clone  https://github.com/LeahAphane/AnyTime-Carwash-App.git


	2.	Open Android Studio →
Select “Open an existing project” → Choose the cloned anytime-carwash folder.
	3.	Wait for Gradle sync to finish (it may take a few minutes).
	4.	Confirm that your SDK Path and Gradle JDK version are correct under
File > Project Structure > SDK Location.



Firebase Setup
	1.	Go to Firebase Console → Create a new project (e.g., “AnytimeCarWash”).
	2.	Add a new Android app to Firebase using your app’s package name (found in android/app/src/main/AndroidManifest.xml).
	3.	Download the google-services.json file from Firebase → place it inside

android/app/google-services.json


	4.	Enable these Firebase features:
	•	Authentication → Email/Password
	•	Firestore Database → Start in test mode
	•	Storage (optional for images)
	5.	Add the Firebase dependencies to your Gradle files (if not already present):
android/build.gradle

buildscript {
    dependencies {
        classpath 'com.google.gms:google-services:4.4.0'
    }
}

android/app/build.gradle

apply plugin: 'com.google.gms.google-services'


	6.	Sync the project after saving changes.



Running the App on an Emulator or Device

 Option 1 – Using Android Studio Emulator
	1.	Open Device Manager → Create a new virtual device (Pixel 6 recommended).
	2.	Start the emulator.
	3.	Click Run ▶ in Android Studio (or press Shift + F10).
	4.	The Metro Bundler (React Native packager) will start automatically.

 Option 2 – Using a Physical Device
	1.	Enable Developer Options > USB Debugging on your Android phone.
	2.	Connect it via USB to your computer.
	3.	When prompted on the phone, allow USB debugging.
	4.	In Android Studio, select your device and click Run.

⸻

 Environment Variables

If your Firebase keys and Stripe keys are externalized, create a .env file in the project root:

API_KEY=your_firebase_api_key
AUTH_DOMAIN=your_auth_domain
PROJECT_ID=your_project_id
STORAGE_BUCKET=your_storage_bucket
MESSAGING_SENDER_ID=your_messaging_sender_id
APP_ID=your_app_id
STRIPE_PUBLISHABLE_KEY=your_stripe_key

Make sure your Firebase config file (firebaseConfig.js) uses these environment variables.

⸻

📂 Project Structure

anytime-carwash/
│
├── android/                # Native Android project
├── ios/                    # iOS project (if applicable)
├── src/
│   ├── components/         # Reusable UI components
│   ├── screens/            # App screens (Login, Booking, Map, Payment)
│   ├── services/           # Firebase & API logic
│   ├── navigation/         # React Navigation setup
│   ├── utils/              # Helper functions
│   └── assets/             # Icons & images
│
├── App.js                  # Root React Native component
├── firebaseConfig.js       # Firebase initialization
├── package.json
└── README.md




Troubleshooting

Issue	Possible Fix
Metro Bundler stuck or not starting	Run npx react-native start --reset-cache
Build fails on Android	Ensure Android SDK 33+ is installed and Gradle JDK = 11/17
Firebase Auth/Firestore errors	Check your google-services.json file and Firestore rules
App crashes after launch	Run cd android && ./gradlew clean then rebuild




 Developer 

Leah Aphane
Software Developer Student | Mobile App Development
