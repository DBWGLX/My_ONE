package com.example.my_one;

import android.content.Intent;
import android.content.IntentFilter;

import androidx.fragment.app.Fragment;

public class YourFragment extends Fragment {
    private BaseActivity.ForceOfflineReceiver receiver;

    @Override
    public void onResume() {
        super.onResume();
        IntentFilter filter = new IntentFilter("your_custom_action");
        receiver = new BaseActivity.ForceOfflineReceiver();
        requireContext().registerReceiver(receiver, filter);
    }

    @Override
    public void onPause() {
        super.onPause();
        if (receiver != null) {
            requireContext().unregisterReceiver(receiver);
            receiver = null;
        }
    }
    private void sendCustomBroadcast(Intent intent) {
        requireContext().sendBroadcast(intent);
    }
}

