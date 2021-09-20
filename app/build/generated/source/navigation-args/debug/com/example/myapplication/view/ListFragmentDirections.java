package com.example.myapplication.view;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.NavDirections;
import com.example.myapplication.R;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class ListFragmentDirections {
  private ListFragmentDirections() {
  }

  @NonNull
  public static ActionListFragmentToVideoPlayFragment actionListFragmentToVideoPlayFragment(
      @Nullable String name) {
    return new ActionListFragmentToVideoPlayFragment(name);
  }

  public static class ActionListFragmentToVideoPlayFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionListFragmentToVideoPlayFragment(@Nullable String name) {
      this.arguments.put("name", name);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionListFragmentToVideoPlayFragment setName(@Nullable String name) {
      this.arguments.put("name", name);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("name")) {
        String name = (String) arguments.get("name");
        __result.putString("name", name);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_ListFragment_to_VideoPlayFragment;
    }

    @SuppressWarnings("unchecked")
    @Nullable
    public String getName() {
      return (String) arguments.get("name");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionListFragmentToVideoPlayFragment that = (ActionListFragmentToVideoPlayFragment) object;
      if (arguments.containsKey("name") != that.arguments.containsKey("name")) {
        return false;
      }
      if (getName() != null ? !getName().equals(that.getName()) : that.getName() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getName() != null ? getName().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionListFragmentToVideoPlayFragment(actionId=" + getActionId() + "){"
          + "name=" + getName()
          + "}";
    }
  }
}
