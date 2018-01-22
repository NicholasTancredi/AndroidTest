//  Created by react-native-create-bridge

import { NativeModules } from 'react-native'

const { ExampleModule } = NativeModules

export default {
  exampleMethod () {
    return ExampleModule.exampleMethod()
  },

  EXAMPLE_CONSTANT: ExampleModule.EXAMPLE_CONSTANT
}
