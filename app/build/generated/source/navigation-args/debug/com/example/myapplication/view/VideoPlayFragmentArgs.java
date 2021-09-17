package com.example.myapplication.view;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class VideoPlayFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private VideoPlayFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private VideoPlayFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static VideoPlayFragmentArgs fromBundle(@NonNull Bundle bundle) {
    VideoPlayFragmentArgs __result = new VideoPlayFragmentArgs();
    bundle.setClassLoader(VideoPlayFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("name")) {
      String name;
      name = bundle.getString("name");
      __result.arguments.put("name", name);
    } else {
      throw new IllegalArgumentException("Required argument \"name\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @Nullable
  public String getName() {
    return (String) arguments.get("name");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("name")) {
      String name = (String) arguments.get("name");
      __result.putString("name", name);
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    VideoPlayFragmentArgs that = (VideoPlayFragmentArgs) object;
    if (arguments.containsKey("name") != that.arguments.containsKey("name")) {
      return false;
    }
    if (getName() != null ? !getName().equals(that.getName()) : that.getName() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getName() != null ? getName().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "VideoPlayFragmentArgs{"
        + "name=" + getName()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(VideoPlayFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(@Nullable String name) {
      this.arguments.put("name", name);
    }

    @NonNull
    public VideoPlayFragmentArgs build() {
      VideoPlayFragmentArgs result = new VideoPlayFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setName(@Nullable String name) {
      this.arguments.put("name", name);
      return this;
    }

    @SuppressWarnings("unchecked")
    @Nullable
    public String getName() {
      return (String) arguments.get("name");
    }
  }
}
