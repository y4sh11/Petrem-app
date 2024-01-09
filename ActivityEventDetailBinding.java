// Generated by view binder compiler. Do not edit!
package com.example.petreminder.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import com.example.petreminder.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityEventDetailBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button eventDetailChangeEndDateButton;

  @NonNull
  public final Button eventDetailChangeStartDateButton;

  @NonNull
  public final EditText eventDetailDetail;

  @NonNull
  public final TextView eventDetailDetailText;

  @NonNull
  public final TextView eventDetailEndDate;

  @NonNull
  public final TextView eventDetailEndDateText;

  @NonNull
  public final EditText eventDetailEventName;

  @NonNull
  public final TextView eventDetailEventNameText;

  @NonNull
  public final Guideline eventDetailHorizontalEndGuideline;

  @NonNull
  public final Guideline eventDetailHorizontalGuideline;

  @NonNull
  public final EditText eventDetailLocation;

  @NonNull
  public final Button eventDetailLocationButton;

  @NonNull
  public final Button eventDetailLocationShareButton;

  @NonNull
  public final TextView eventDetailLocationText;

  @NonNull
  public final Spinner eventDetailReminderFreq;

  @NonNull
  public final TextView eventDetailReminderFreqText;

  @NonNull
  public final Spinner eventDetailReminderType;

  @NonNull
  public final TextView eventDetailReminderTypeText;

  @NonNull
  public final TextView eventDetailStartDate;

  @NonNull
  public final TextView eventDetailStartDateText;

  @NonNull
  public final EditText eventDetailType;

  @NonNull
  public final TextView eventDetailTypeText;

  @NonNull
  public final Guideline eventDetailVerticalEndGuideline;

  @NonNull
  public final Guideline eventDetailVerticalGuideline;

  private ActivityEventDetailBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button eventDetailChangeEndDateButton,
      @NonNull Button eventDetailChangeStartDateButton, @NonNull EditText eventDetailDetail,
      @NonNull TextView eventDetailDetailText, @NonNull TextView eventDetailEndDate,
      @NonNull TextView eventDetailEndDateText, @NonNull EditText eventDetailEventName,
      @NonNull TextView eventDetailEventNameText,
      @NonNull Guideline eventDetailHorizontalEndGuideline,
      @NonNull Guideline eventDetailHorizontalGuideline, @NonNull EditText eventDetailLocation,
      @NonNull Button eventDetailLocationButton, @NonNull Button eventDetailLocationShareButton,
      @NonNull TextView eventDetailLocationText, @NonNull Spinner eventDetailReminderFreq,
      @NonNull TextView eventDetailReminderFreqText, @NonNull Spinner eventDetailReminderType,
      @NonNull TextView eventDetailReminderTypeText, @NonNull TextView eventDetailStartDate,
      @NonNull TextView eventDetailStartDateText, @NonNull EditText eventDetailType,
      @NonNull TextView eventDetailTypeText, @NonNull Guideline eventDetailVerticalEndGuideline,
      @NonNull Guideline eventDetailVerticalGuideline) {
    this.rootView = rootView;
    this.eventDetailChangeEndDateButton = eventDetailChangeEndDateButton;
    this.eventDetailChangeStartDateButton = eventDetailChangeStartDateButton;
    this.eventDetailDetail = eventDetailDetail;
    this.eventDetailDetailText = eventDetailDetailText;
    this.eventDetailEndDate = eventDetailEndDate;
    this.eventDetailEndDateText = eventDetailEndDateText;
    this.eventDetailEventName = eventDetailEventName;
    this.eventDetailEventNameText = eventDetailEventNameText;
    this.eventDetailHorizontalEndGuideline = eventDetailHorizontalEndGuideline;
    this.eventDetailHorizontalGuideline = eventDetailHorizontalGuideline;
    this.eventDetailLocation = eventDetailLocation;
    this.eventDetailLocationButton = eventDetailLocationButton;
    this.eventDetailLocationShareButton = eventDetailLocationShareButton;
    this.eventDetailLocationText = eventDetailLocationText;
    this.eventDetailReminderFreq = eventDetailReminderFreq;
    this.eventDetailReminderFreqText = eventDetailReminderFreqText;
    this.eventDetailReminderType = eventDetailReminderType;
    this.eventDetailReminderTypeText = eventDetailReminderTypeText;
    this.eventDetailStartDate = eventDetailStartDate;
    this.eventDetailStartDateText = eventDetailStartDateText;
    this.eventDetailType = eventDetailType;
    this.eventDetailTypeText = eventDetailTypeText;
    this.eventDetailVerticalEndGuideline = eventDetailVerticalEndGuideline;
    this.eventDetailVerticalGuideline = eventDetailVerticalGuideline;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityEventDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityEventDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_event_detail, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityEventDetailBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.event_detail_change_end_date_button;
      Button eventDetailChangeEndDateButton = rootView.findViewById(id);
      if (eventDetailChangeEndDateButton == null) {
        break missingId;
      }

      id = R.id.event_detail_change_start_date_button;
      Button eventDetailChangeStartDateButton = rootView.findViewById(id);
      if (eventDetailChangeStartDateButton == null) {
        break missingId;
      }

      id = R.id.event_detail_detail;
      EditText eventDetailDetail = rootView.findViewById(id);
      if (eventDetailDetail == null) {
        break missingId;
      }

      id = R.id.event_detail_detail_text;
      TextView eventDetailDetailText = rootView.findViewById(id);
      if (eventDetailDetailText == null) {
        break missingId;
      }

      id = R.id.event_detail_end_date;
      TextView eventDetailEndDate = rootView.findViewById(id);
      if (eventDetailEndDate == null) {
        break missingId;
      }

      id = R.id.event_detail_end_date_text;
      TextView eventDetailEndDateText = rootView.findViewById(id);
      if (eventDetailEndDateText == null) {
        break missingId;
      }

      id = R.id.event_detail_event_name;
      EditText eventDetailEventName = rootView.findViewById(id);
      if (eventDetailEventName == null) {
        break missingId;
      }

      id = R.id.event_detail_event_name_text;
      TextView eventDetailEventNameText = rootView.findViewById(id);
      if (eventDetailEventNameText == null) {
        break missingId;
      }

      id = R.id.event_detail_horizontal_end_guideline;
      Guideline eventDetailHorizontalEndGuideline = rootView.findViewById(id);
      if (eventDetailHorizontalEndGuideline == null) {
        break missingId;
      }

      id = R.id.event_detail_horizontal_guideline;
      Guideline eventDetailHorizontalGuideline = rootView.findViewById(id);
      if (eventDetailHorizontalGuideline == null) {
        break missingId;
      }

      id = R.id.event_detail_location;
      EditText eventDetailLocation = rootView.findViewById(id);
      if (eventDetailLocation == null) {
        break missingId;
      }

      id = R.id.event_detail_location_button;
      Button eventDetailLocationButton = rootView.findViewById(id);
      if (eventDetailLocationButton == null) {
        break missingId;
      }

      id = R.id.event_detail_location_share_button;
      Button eventDetailLocationShareButton = rootView.findViewById(id);
      if (eventDetailLocationShareButton == null) {
        break missingId;
      }

      id = R.id.event_detail_location_text;
      TextView eventDetailLocationText = rootView.findViewById(id);
      if (eventDetailLocationText == null) {
        break missingId;
      }

      id = R.id.event_detail_reminder_freq;
      Spinner eventDetailReminderFreq = rootView.findViewById(id);
      if (eventDetailReminderFreq == null) {
        break missingId;
      }

      id = R.id.event_detail_reminder_freq_text;
      TextView eventDetailReminderFreqText = rootView.findViewById(id);
      if (eventDetailReminderFreqText == null) {
        break missingId;
      }

      id = R.id.event_detail_reminder_type;
      Spinner eventDetailReminderType = rootView.findViewById(id);
      if (eventDetailReminderType == null) {
        break missingId;
      }

      id = R.id.event_detail_reminder_type_text;
      TextView eventDetailReminderTypeText = rootView.findViewById(id);
      if (eventDetailReminderTypeText == null) {
        break missingId;
      }

      id = R.id.event_detail_start_date;
      TextView eventDetailStartDate = rootView.findViewById(id);
      if (eventDetailStartDate == null) {
        break missingId;
      }

      id = R.id.event_detail_start_date_text;
      TextView eventDetailStartDateText = rootView.findViewById(id);
      if (eventDetailStartDateText == null) {
        break missingId;
      }

      id = R.id.event_detail_type;
      EditText eventDetailType = rootView.findViewById(id);
      if (eventDetailType == null) {
        break missingId;
      }

      id = R.id.event_detail_type_text;
      TextView eventDetailTypeText = rootView.findViewById(id);
      if (eventDetailTypeText == null) {
        break missingId;
      }

      id = R.id.event_detail_vertical_end_guideline;
      Guideline eventDetailVerticalEndGuideline = rootView.findViewById(id);
      if (eventDetailVerticalEndGuideline == null) {
        break missingId;
      }

      id = R.id.event_detail_vertical_guideline;
      Guideline eventDetailVerticalGuideline = rootView.findViewById(id);
      if (eventDetailVerticalGuideline == null) {
        break missingId;
      }

      return new ActivityEventDetailBinding((ConstraintLayout) rootView,
          eventDetailChangeEndDateButton, eventDetailChangeStartDateButton, eventDetailDetail,
          eventDetailDetailText, eventDetailEndDate, eventDetailEndDateText, eventDetailEventName,
          eventDetailEventNameText, eventDetailHorizontalEndGuideline,
          eventDetailHorizontalGuideline, eventDetailLocation, eventDetailLocationButton,
          eventDetailLocationShareButton, eventDetailLocationText, eventDetailReminderFreq,
          eventDetailReminderFreqText, eventDetailReminderType, eventDetailReminderTypeText,
          eventDetailStartDate, eventDetailStartDateText, eventDetailType, eventDetailTypeText,
          eventDetailVerticalEndGuideline, eventDetailVerticalGuideline);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}