//  Created by react-native-create-bridge

import React, { Component } from 'react'
import { requireNativeComponent } from 'react-native'

const Example = requireNativeComponent('Example', ExampleView)

export default class ExampleView extends Component {
  render () {
    return <Example {...this.props} />
  }
}

ExampleView.propTypes = {
  exampleProp: React.PropTypes.any
}
