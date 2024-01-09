// Generated by view binder compiler. Do not edit!
package com.example.petreminder.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import com.example.petreminder.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityRemindersBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final CoordinatorLayout chRootLayout;

  @NonNull
  public final FloatingActionButton newReminderFab;

  private ActivityRemindersBinding(@NonNull CoordinatorLayout rootView,
      @NonNull CoordinatorLayout chRootLayout, @NonNull FloatingActionButton newReminderFab) {
    this.rootView = rootView;
    this.chRootLayout = chRootLayout;
    this.newReminderFab = newReminderFab;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRemindersBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRemindersBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_reminders, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRemindersBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      CoordinatorLayout chRootLayout = (CoordinatorLayout) rootView;

      id = R.id.new_reminder_fab;
      FloatingActionButton newReminderFab = rootView.findViewById(id);
      if (newReminderFab == null) {
        break missingId;
      }

      return new ActivityRemindersBinding((CoordinatorLayout) rootView, chRootLayout,
          newReminderFab);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
