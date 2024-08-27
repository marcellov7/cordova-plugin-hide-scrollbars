# Cordova Hide Scrollbars Plugin

This Cordova plugin allows you to hide scrollbars on both iOS and Android devices.

## Installation

```bash
cordova plugin add https://github.com/marcellov7/cordova-plugin-hide-scrollbars.git
```

## Usage

Once the plugin is installed, you can use it in your JavaScript code as follows:

```javascript
document.addEventListener('deviceready', onDeviceReady, false);

function onDeviceReady() {
    cordova.plugins.hideScrollbars.hide(
        function() {
            console.log('Scrollbars hidden successfully');
        },
        function(error) {
            console.error('Error: ' + error);
        }
    );
}
```

## API

### hide()

This method hides the scrollbars on both platforms (iOS and Android).

```javascript
cordova.plugins.hideScrollbars.hide(successCallback, errorCallback);
```

- `successCallback`: Function called when the scrollbars have been hidden successfully.
- `errorCallback`: Function called if an error occurs during the process.

## Supported Platforms

- iOS
- Android

## Notes

- On iOS, this plugin uses `UIScrollView.appearance` to hide scroll indicators globally.
- On Android, the plugin disables scrollbars on the main WebView.

## License

This project is released under the MIT License. See the `LICENSE` file for more details.

## Contributing

Contributions are welcome! Please open an issue or submit a pull request on GitHub.

## Support

If you encounter any problems or have questions, please open an issue on GitHub.

## Requirements

- Cordova CLI: 9.0.0 or higher
- iOS: 11.0 or higher
- Android: API 21 (Android 5.0) or higher

## Limitations

- This plugin hides all scrollbars globally. It does not provide fine-grained control over individual scrollable elements.
- On some Android devices, the effect might vary depending on the manufacturer's UI modifications.

## Troubleshooting

If the scrollbars are still visible after applying the plugin:

1. Ensure the plugin is properly installed. Check your `config.xml` file for the plugin entry.
2. On Android, try clearing the app data or reinstalling the app.
3. On iOS, ensure you're not using any CSS that explicitly shows scrollbars.

For any other issues, please check the existing GitHub issues or open a new one.