package com.marcellov7;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaWebView;
import org.json.JSONArray;
import org.json.JSONException;
import android.webkit.WebView;
import android.view.View;

public class HideScrollbars extends CordovaPlugin {
    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("hide")) {
            this.hide(callbackContext);
            return true;
        }
        return false;
    }

    private void hide(CallbackContext callbackContext) {
        cordova.getActivity().runOnUiThread(new Runnable() {
            public void run() {
                CordovaWebView cordovaWebView = webView;
                View view = cordovaWebView.getView();
                if (view instanceof WebView) {
                    WebView webView = (WebView) view;
                    webView.setVerticalScrollBarEnabled(false);
                    webView.setHorizontalScrollBarEnabled(false);
                    callbackContext.success();
                } else {
                    callbackContext.error("Unable to access WebView");
                }
            }
        });
    }
}