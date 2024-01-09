// Generated by view binder compiler. Do not edit!
package com.example.petreminder.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.example.petreminder.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityDailyPlanBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final FloatingActionButton dailyPlanAddFab;

  @NonNull
  public final TextView dailyPlanTitle;

  @NonNull
  public final TextView emptyView;

  @NonNull
  public final RecyclerView recyclerView;

  private ActivityDailyPlanBinding(@NonNull ConstraintLayout rootView,
      @NonNull FloatingActionButton dailyPlanAddFab, @NonNull TextView dailyPlanTitle,
      @NonNull TextView emptyView, @NonNull RecyclerView recyclerView) {
    this.rootView = rootView;
    this.dailyPlanAddFab = dailyPlanAddFab;
    this.dailyPlanTitle = dailyPlanTitle;
    this.emptyView = emptyView;
    this.recyclerView = recyclerView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDailyPlanBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDailyPlanBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_daily_plan, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDailyPlanBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.daily_plan_add_fab;
      FloatingActionButton dailyPlanAddFab = rootView.findViewById(id);
      if (dailyPlanAddFab == null) {
        break missingId;
      }

      id = R.id.daily_plan_title;
      TextView dailyPlanTitle = rootView.findViewById(id);
      if (dailyPlanTitle == null) {
        break missingId;
      }

      id = R.id.empty_view;
      TextView emptyView = rootView.findViewById(id);
      if (emptyView == null) {
        break missingId;
      }

      id = R.id.recycler_view;
      RecyclerView recyclerView = rootView.findViewById(id);
      if (recyclerView == null) {
        break missingId;
      }

      return new ActivityDailyPlanBinding((ConstraintLayout) rootView, dailyPlanAddFab,
          dailyPlanTitle, emptyView, recyclerView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
