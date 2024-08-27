var exec = require('cordova/exec');

exports.hide = function(success, error) {
    exec(success, error, 'HideScrollbars', 'hide', []);
};