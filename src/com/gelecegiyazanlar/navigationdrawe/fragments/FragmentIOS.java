package com.gelecegiyazanlar.navigationdrawe.fragments;

import com.gelecegiyazanlar.navigationdrawer.R;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentIOS extends Fragment {

	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view = inflater.inflate(R.layout.layout_iosfragment, container,false);
		return view;
	}
}
