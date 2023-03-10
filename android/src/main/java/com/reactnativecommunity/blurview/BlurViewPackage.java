package com.reactnativecommunity.blurview;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nonnull;

public class BlurViewPackage implements ReactPackage {

  @Override
  @Nonnull
  public List<NativeModule> createNativeModules(
    @Nonnull ReactApplicationContext reactApplicationContext
  ) {
    return new ArrayList<>();
  }

  @SuppressWarnings("unused")
  public List<Class<? extends JavaScriptModule>> createJSModules() {
    return Collections.emptyList();
  }

  @Override
  @Nonnull
  public List<ViewManager> createViewManagers(
    @Nonnull ReactApplicationContext reactContext
  ) {
    return Collections.<ViewManager>singletonList(new BlurViewManager(reactContext));
  }
}
