// Generated by view binder compiler. Do not edit!
package com.example.petreminder.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import com.example.petreminder.R;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityDetailsBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final TextView ageTvw;

  @NonNull
  public final TextView breedTvw;

  @NonNull
  public final CollapsingToolbarLayout collapsingToolbar;

  @NonNull
  public final TextView dobTvw;

  @NonNull
  public final TextView genderTvw;

  @NonNull
  public final Toolbar pToolbar;

  @NonNull
  public final ImageView profileImageview;

  @NonNull
  public final NestedScrollView scrollableView;

  @NonNull
  public final CardView setSchedule;

  @NonNull
  public final TextView weightTvw;

  private ActivityDetailsBinding(@NonNull CoordinatorLayout rootView, @NonNull TextView ageTvw,
      @NonNull TextView breedTvw, @NonNull CollapsingToolbarLayout collapsingToolbar,
      @NonNull TextView dobTvw, @NonNull TextView genderTvw, @NonNull Toolbar pToolbar,
      @NonNull ImageView profileImageview, @NonNull NestedScrollView scrollableView,
      @NonNull CardView setSchedule, @NonNull TextView weightTvw) {
    this.rootView = rootView;
    this.ageTvw = ageTvw;
    this.breedTvw = breedTvw;
    this.collapsingToolbar = collapsingToolbar;
    this.dobTvw = dobTvw;
    this.genderTvw = genderTvw;
    this.pToolbar = pToolbar;
    this.profileImageview = profileImageview;
    this.scrollableView = scrollableView;
    this.setSchedule = setSchedule;
    this.weightTvw = weightTvw;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_details, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDetailsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.age_tvw;
      TextView ageTvw = rootView.findViewById(id);
      if (ageTvw == null) {
        break missingId;
      }

      id = R.id.breed_tvw;
      TextView breedTvw = rootView.findViewById(id);
      if (breedTvw == null) {
        break missingId;
      }

      id = R.id.collapsing_toolbar;
      CollapsingToolbarLayout collapsingToolbar = rootView.findViewById(id);
      if (collapsingToolbar == null) {
        break missingId;
      }

      id = R.id.dob_tvw;
      TextView dobTvw = rootView.findViewById(id);
      if (dobTvw == null) {
        break missingId;
      }

      id = R.id.gender_tvw;
      TextView genderTvw = rootView.findViewById(id);
      if (genderTvw == null) {
        break missingId;
      }

      id = R.id.p_toolbar;
      Toolbar pToolbar = rootView.findViewById(id);
      if (pToolbar == null) {
        break missingId;
      }

      id = R.id.profile_imageview;
      ImageView profileImageview = rootView.findViewById(id);
      if (profileImageview == null) {
        break missingId;
      }

      id = R.id.scrollableView;
      NestedScrollView scrollableView = rootView.findViewById(id);
      if (scrollableView == null) {
        break missingId;
      }

      id = R.id.setSchedule;
      CardView setSchedule = rootView.findViewById(id);
      if (setSchedule == null) {
        break missingId;
      }

      id = R.id.weight_tvw;
      TextView weightTvw = rootView.findViewById(id);
      if (weightTvw == null) {
        break missingId;
      }

      return new ActivityDetailsBinding((CoordinatorLayout) rootView, ageTvw, breedTvw,
          collapsingToolbar, dobTvw, genderTvw, pToolbar, profileImageview, scrollableView,
          setSchedule, weightTvw);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
