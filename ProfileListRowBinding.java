// Generated by view binder compiler. Do not edit!
package com.example.petreminder.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import com.example.petreminder.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ProfileListRowBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final TextView nameTvw;

  @NonNull
  public final CardView profileListRowFrameLayout;

  @NonNull
  public final CircleImageView profilePicImageview;

  private ProfileListRowBinding(@NonNull CardView rootView, @NonNull TextView nameTvw,
      @NonNull CardView profileListRowFrameLayout, @NonNull CircleImageView profilePicImageview) {
    this.rootView = rootView;
    this.nameTvw = nameTvw;
    this.profileListRowFrameLayout = profileListRowFrameLayout;
    this.profilePicImageview = profilePicImageview;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ProfileListRowBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ProfileListRowBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.profile_list_row, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ProfileListRowBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.name_tvw;
      TextView nameTvw = rootView.findViewById(id);
      if (nameTvw == null) {
        break missingId;
      }

      CardView profileListRowFrameLayout = (CardView) rootView;

      id = R.id.profile_pic_imageview;
      CircleImageView profilePicImageview = rootView.findViewById(id);
      if (profilePicImageview == null) {
        break missingId;
      }

      return new ProfileListRowBinding((CardView) rootView, nameTvw, profileListRowFrameLayout,
          profilePicImageview);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}