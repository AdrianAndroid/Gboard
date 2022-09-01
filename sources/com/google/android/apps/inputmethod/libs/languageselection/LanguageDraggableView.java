package com.google.android.apps.inputmethod.libs.languageselection;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LanguageDraggableView extends RelativeLayout {
    public AppCompatTextView a;
    public CheckBox b;
    public AppCompatTextView c;
    public ImageView d;
    public dmv e;

    public LanguageDraggableView(Context context) {
        super(context);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (AppCompatTextView) findViewById(R.id.f65390_resource_name_obfuscated_res_0x7f0b075a);
        this.c = (AppCompatTextView) findViewById(R.id.f65400_resource_name_obfuscated_res_0x7f0b075b);
        this.b = (CheckBox) findViewById(R.id.f65360_resource_name_obfuscated_res_0x7f0b0757);
        this.d = (ImageView) findViewById(R.id.f65380_resource_name_obfuscated_res_0x7f0b0759);
    }

    public LanguageDraggableView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LanguageDraggableView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
