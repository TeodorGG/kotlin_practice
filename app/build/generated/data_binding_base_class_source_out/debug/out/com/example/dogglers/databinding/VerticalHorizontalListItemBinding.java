// Generated by view binder compiler. Do not edit!
package com.example.dogglers.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.example.dogglers.R;
import com.google.android.material.card.MaterialCardView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class VerticalHorizontalListItemBinding implements ViewBinding {
  @NonNull
  private final MaterialCardView rootView;

  @NonNull
  public final ImageView ivDog;

  @NonNull
  public final TextView tvDogAge;

  @NonNull
  public final TextView tvDogHobbies;

  @NonNull
  public final TextView tvDogName;

  private VerticalHorizontalListItemBinding(@NonNull MaterialCardView rootView,
      @NonNull ImageView ivDog, @NonNull TextView tvDogAge, @NonNull TextView tvDogHobbies,
      @NonNull TextView tvDogName) {
    this.rootView = rootView;
    this.ivDog = ivDog;
    this.tvDogAge = tvDogAge;
    this.tvDogHobbies = tvDogHobbies;
    this.tvDogName = tvDogName;
  }

  @Override
  @NonNull
  public MaterialCardView getRoot() {
    return rootView;
  }

  @NonNull
  public static VerticalHorizontalListItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static VerticalHorizontalListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.vertical_horizontal_list_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static VerticalHorizontalListItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ivDog;
      ImageView ivDog = rootView.findViewById(id);
      if (ivDog == null) {
        break missingId;
      }

      id = R.id.tvDogAge;
      TextView tvDogAge = rootView.findViewById(id);
      if (tvDogAge == null) {
        break missingId;
      }

      id = R.id.tvDogHobbies;
      TextView tvDogHobbies = rootView.findViewById(id);
      if (tvDogHobbies == null) {
        break missingId;
      }

      id = R.id.tvDogName;
      TextView tvDogName = rootView.findViewById(id);
      if (tvDogName == null) {
        break missingId;
      }

      return new VerticalHorizontalListItemBinding((MaterialCardView) rootView, ivDog, tvDogAge,
          tvDogHobbies, tvDogName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
