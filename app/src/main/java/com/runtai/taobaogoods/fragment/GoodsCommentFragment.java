package com.runtai.taobaogoods.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.runtai.taobaogoods.MainActivity;
import com.runtai.taobaogoods.R;

/**
 * item页ViewPager里的评价Fragment
 */
public class GoodsCommentFragment extends Fragment{
    public TextView tv_comment_count, tv_good_comment;
    public MainActivity activity;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.activity = (MainActivity) context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_goods_comment, null);
        initView(rootView);
        return rootView;
    }

    private void initView(View rootView) {
        tv_comment_count = (TextView) rootView.findViewById(R.id.tv_comment_count);
        tv_good_comment = (TextView) rootView.findViewById(R.id.tv_good_comment);
    }
}
