package com.example.modalbottomsheet;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class MainActivity extends AppCompatActivity {

    Button btnShowBottomSheet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnShowBottomSheet = findViewById(R.id.btn_show_bottm_sheet);

        btnShowBottomSheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickOpenBottomSheetDialog();
            }
        });
    }

    private void clickOpenBottomSheetDialog() {
        View viewDialog = getLayoutInflater().inflate(R.layout.layout_bottom_sheet, null);

        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(this);
        bottomSheetDialog.setContentView(viewDialog);
        bottomSheetDialog.show();
        bottomSheetDialog.setCancelable(false);

        Button btnCancel = viewDialog.findViewById(R.id.btn_cancel);
        Button btnPayment = viewDialog.findViewById(R.id.btn_payment);

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bottomSheetDialog.dismiss();
            }
        });

        btnPayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Click Payment", Toast.LENGTH_SHORT).show();
            }
        });

        // Kéo BottomSheet hết màn hình
//        BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.from((View) viewDialog.getParent());
//        bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
//
//        bottomSheetBehavior.addBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {
//            @Override
//            public void onStateChanged(@NonNull View bottomSheet, int newState) {
//
//            }
//
//            @Override
//            public void onSlide(@NonNull View bottomSheet, float slideOffset) {
//
//            }
//        });
    }
}