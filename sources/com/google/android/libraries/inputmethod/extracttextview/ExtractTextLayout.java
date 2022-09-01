package com.google.android.libraries.inputmethod.extracttextview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ExtractTextLayout extends LinearLayout {
    public Button a;
    public View b;
    public View.OnClickListener c;

    public ExtractTextLayout(Context context) {
        super(context);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.b = findViewById(R.id.f56660_resource_name_obfuscated_res_0x7f0b029b);
        this.a = (Button) findViewById(R.id.f56670_resource_name_obfuscated_res_0x7f0b029c);
    }

    public ExtractTextLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ExtractTextLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ExtractTextLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
