//  Created by react-native-create-bridge

import { NativeModules } from 'react-native'

const { Example } = NativeModules

export default {
  exampleMethod () {
    return Example.exampleMethod()
  },

  EXAMPLE_CONSTANT: Example.EXAMPLE_CONSTANT
}
