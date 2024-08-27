#import "HideScrollbars.h"

@implementation HideScrollbars

- (void)hide:(CDVInvokedUrlCommand*)command
{
    dispatch_async(dispatch_get_main_queue(), ^{
        UIScrollView.appearance.showsHorizontalScrollIndicator = NO;
        UIScrollView.appearance.showsVerticalScrollIndicator = NO;
        
        CDVPluginResult* pluginResult = [CDVPluginResult resultWithStatus:CDVCommandStatus_OK];
        [self.commandDelegate sendPluginResult:pluginResult callbackId:command.callbackId];
    });
}

@end