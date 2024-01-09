// Generated by view binder compiler. Do not edit!
package com.example.petreminder.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import com.example.petreminder.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ReminderListItemBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final CardView reminderListItemCardView;

  @NonNull
  public final TextView reminderListItemReminderDate;

  private ReminderListItemBinding(@NonNull LinearLayout rootView,
      @NonNull CardView reminderListItemCardView, @NonNull TextView reminderListItemReminderDate) {
    this.rootView = rootView;
    this.reminderListItemCardView = reminderListItemCardView;
    this.reminderListItemReminderDate = reminderListItemReminderDate;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ReminderListItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ReminderListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.reminder_list_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ReminderListItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.reminder_list_item_card_view;
      CardView reminderListItemCardView = rootView.findViewById(id);
      if (reminderListItemCardView == null) {
        break missingId;
      }

      id = R.id.reminder_list_item_reminder_date;
      TextView reminderListItemReminderDate = rootView.findViewById(id);
      if (reminderListItemReminderDate == null) {
        break missingId;
      }

      return new ReminderListItemBinding((LinearLayout) rootView, reminderListItemCardView,
          reminderListItemReminderDate);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
