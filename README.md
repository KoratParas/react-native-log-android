
# react-native-log-android

## Getting started

`$ npm install react-native-log-android --save`

### Mostly automatic installation

`$ react-native link react-native-log-android`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-log-android` and add `RNLogAndroid.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNLogAndroid.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNLogAndroidPackage;` to the imports at the top of the file
  - Add `new RNLogAndroidPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-log-android'
  	project(':react-native-log-android').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-log-android/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-log-android')
  	```

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNLogAndroid.sln` in `node_modules/react-native-log-android/windows/RNLogAndroid.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using Log.Android.RNLogAndroid;` to the usings at the top of the file
  - Add `new RNLogAndroidPackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNLogAndroid from 'react-native-log-android';

// example
RNLogAndroid.print(RNLogAndroid.WARN, "REACT-NATIVE", "demo done")

types:
VERBOSE	Priority constant for Log.v
DEBUG	Priority constant for Log.d
INFO	Priority constant for Log.i
WARN	Priority constant for Log.w
ERROR	Priority constant for Log.e
SUPPRESS
```
  