package com.google.android.apps.inputmethod.libs.search.widget;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SuggestionListRecyclerView extends RecyclerView {
    public static final int[] S = {R.color.f31240_resource_name_obfuscated_res_0x7f060907, R.color.f31250_resource_name_obfuscated_res_0x7f060908, R.color.f31260_resource_name_obfuscated_res_0x7f060909, R.color.f31270_resource_name_obfuscated_res_0x7f06090a, R.color.f31280_resource_name_obfuscated_res_0x7f06090b, R.color.f31290_resource_name_obfuscated_res_0x7f06090c, R.color.f31300_resource_name_obfuscated_res_0x7f06090d};
    public elk T;

    public SuggestionListRecyclerView(Context context) {
        super(context);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        elk elkVar = new elk(getContext());
        this.T = elkVar;
        aa(elkVar);
        getContext();
        ab(new LinearLayoutManager(0));
        setVisibility(8);
    }

    public SuggestionListRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SuggestionListRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
