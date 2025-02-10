package com.solver.ingomatourism.utils;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.solver.ingomatourism.R;

public final class HDetailCollapseToolbarView extends LinearLayout {

    private FrameLayout backPress;
    private LinearLayout lytShare;
    private ImageView shareIcon;
    private TextView shareText;

    public interface OnToolbarActionListener {
        void onBackPressed();
        void onShareClick();
    }

    public HDetailCollapseToolbarView(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater inflater = LayoutInflater.from(context);
        // Inflate the layout manually
        inflater.inflate(R.layout.lyt_h_detail_toolbar_saaafiii, this, true);

        // Initialize views manually using findViewById
        backPress = findViewById(R.id.back_press);
        lytShare = findViewById(R.id.lyt_share);
        shareIcon = findViewById(R.id.share);
        shareText = findViewById(R.id.share_txt);
    }

    public void bindToolbarData(HToolbarCollapsedData toolbarData, OnToolbarActionListener actionListener) {
        ToolBarCollapsedIconData iconData = toolbarData.getIconData();
        boolean isNoneIcon = iconData instanceof ToolBarCollapsedIconData.None;

        // Show or hide the share icon based on the icon data
        if (isNoneIcon) {
            lytShare.setVisibility(GONE);  // Hide the entire share section if None
        } else if (iconData instanceof ToolBarCollapsedIconData.ShareData) {
            lytShare.setVisibility(VISIBLE);  // Show the share section
            shareIcon.setOnClickListener(v -> actionListener.onShareClick());
        }

        // Set a click listener for back press
        backPress.setOnClickListener(v -> actionListener.onBackPressed());
    }
}
