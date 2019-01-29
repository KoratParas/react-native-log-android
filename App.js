import React, { Component } from "react";
import { Text, View } from "react-native";
import RNLogAndroid from "./index";

export default class App extends Component {
  render() {
    RNLogAndroid.print(RNLogAndroid.WARN, "REACT-NATIVE", "demo done");
    return (
      <View>
        <Text> textInComponent </Text>
      </View>
    );
  }
}
