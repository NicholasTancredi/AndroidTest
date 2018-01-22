//  Created by react-native-create-bridge

import React, { Component } from 'react'
import { requireNativeComponent } from 'react-native'

const Example = requireNativeComponent('Example', null)

export default class ExampleView extends Component {
  state = { exampleProp: "TEST MOUNTED"}
  componentDidMount() {
    setTimeout(() => {
      this.setState({exampleProp: "TEST componentDidMount"})
    }, 500)
  }
  render () {
    return <Example 
        exampleProp={this.state.exampleProp}
        style={{ flex: 1, backgroundColor: 'orange' }} 
    />
  }
}

// ExampleView.propTypes = {
//   exampleProp: React.PropTypes.string
// }
