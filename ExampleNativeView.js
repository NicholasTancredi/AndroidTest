//  Created by react-native-create-bridge

import React, { Component } from 'react'
import { requireNativeComponent } from 'react-native'

const Example = requireNativeComponent('Example', null)

export default class ExampleView extends Component {
  render () {
    return <Example 
        style={{ flex: 1, backgroundColor: 'blue' }} 
    />
  }
}

// ExampleView.propTypes = {
//   exampleProp: React.PropTypes.any
// }
