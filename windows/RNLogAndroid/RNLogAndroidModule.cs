using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace Log.Android.RNLogAndroid
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNLogAndroidModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNLogAndroidModule"/>.
        /// </summary>
        internal RNLogAndroidModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNLogAndroid";
            }
        }
    }
}
