package com.app.mywild.fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.mywild.R;
import com.app.mywild.tools.Utils;
import android.widget.Button;

public class FragmentAbout extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_about, container, false);

        Button readMoreButton = rootView.findViewById(R.id.bt_read);
        Button websiteButton = rootView.findViewById(R.id.bt_read2);

        readMoreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Utils.rateAction(getActivity());
            }
        });

        websiteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://donate.stripe.com/aEU8yle0n8c7b96cMN"; // Replace with the desired website URL
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });

        return rootView;
    }
}
