package com.example.android;

import android.os.Bundle;
import android.widget.ImageButton;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.PopupMenu;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.layout);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.scrollView), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, 0);
            return insets;
        });

        ImageButton notificationsButton = findViewById(R.id.notificationsButton);
        notificationsButton.setOnClickListener(view -> new MaterialAlertDialogBuilder(this)
                .setMessage(R.string.no_notifications)
                .setPositiveButton(R.string.dialog_ok, null)
                .show());

        findViewById(R.id.bookAppointmentButton).setOnClickListener(view ->
                new MaterialAlertDialogBuilder(this)
                        .setTitle(R.string.booking_demo_title)
                        .setItems(R.array.booking_options, (dialog, which) -> {
                            String choice = getResources().getStringArray(R.array.booking_options)[which];
                            new MaterialAlertDialogBuilder(this)
                                    .setTitle(R.string.booking_confirmation_title)
                                    .setMessage(getString(R.string.booking_confirmation_message, choice))
                                    .setPositiveButton(R.string.dialog_ok, null)
                                    .show();
                        })
                        .setNegativeButton(R.string.booking_cancel, null)
                        .show());

        ImageButton appointmentOptionsButton = findViewById(R.id.appointmentOptionsButton);
        appointmentOptionsButton.setOnClickListener(view -> {
            PopupMenu popupMenu = new PopupMenu(this, view);
            popupMenu.inflate(R.menu.appointment_options_menu);
            popupMenu.setOnMenuItemClickListener(item -> {
                if (item.getItemId() == R.id.action_view_appointment_details) {
                    new MaterialAlertDialogBuilder(this)
                            .setTitle(R.string.appointment_details_title)
                            .setMessage(R.string.appointment_details_development)
                            .setPositiveButton(R.string.dialog_ok, null)
                            .show();
                    return true;
                }
                return false;
            });
            popupMenu.show();
        });
    }
}
