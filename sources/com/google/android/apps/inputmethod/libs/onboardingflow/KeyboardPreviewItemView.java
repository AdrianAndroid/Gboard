package com.google.android.apps.inputmethod.libs.onboardingflow;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class KeyboardPreviewItemView extends LinearLayout implements dlm {
    public static final lug a = lug.i("KeyboardPreviewCardView");
    public final String b;
    public final String c;
    public final String d;
    public hqt e;
    private final String f;

    public KeyboardPreviewItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = jgd.k(context, attributeSet, null, "language_tag");
        this.c = jgd.k(context, attributeSet, null, "variant");
        this.d = jgd.k(context, attributeSet, null, "keyboard_type");
        this.f = jgd.k(context, attributeSet, null, "layout_name");
        a(context);
    }

    protected final void a(Context context) {
        View findViewById;
        inflate(context, R.layout.f143270_resource_name_obfuscated_res_0x7f0e044f, this);
        int i = 0;
        if (gqa.a(context).g && (findViewById = findViewById(R.id.f65460_resource_name_obfuscated_res_0x7f0b0768)) != null) {
            findViewById.setFocusable(false);
            findViewById.setClickable(false);
        }
        ((AppCompatTextView) findViewById(R.id.f65470_resource_name_obfuscated_res_0x7f0b0769)).setText(this.f);
        setContentDescription(this.f);
        boolean x = ino.M(context).x(R.string.f161450_resource_name_obfuscated_res_0x7f1406b2, false);
        View findViewById2 = findViewById(R.id.f68340_resource_name_obfuscated_res_0x7f0b08de);
        if (true == x) {
            i = 8;
        }
        findViewById2.setVisibility(i);
        ImageView imageView = (ImageView) findViewById(R.id.f65480_resource_name_obfuscated_res_0x7f0b076a);
        imageView.setOnClickListener(new dwx(this, 8));
        if (TextUtils.isEmpty(this.b) || TextUtils.isEmpty(this.c)) {
            return;
        }
        kcu.U(hrx.y(context).e(jav.f(this.b), this.c), new cvt(this, context, imageView, 3), gyc.b);
    }

    @Override // defpackage.dlm
    public final void b(String str, Drawable drawable) {
        ((ImageView) findViewById(R.id.f65480_resource_name_obfuscated_res_0x7f0b076a)).setImageDrawable(drawable);
        findViewById(R.id.f68340_resource_name_obfuscated_res_0x7f0b08de).setVisibility(8);
    }

    @Override // android.view.View
    public final String toString() {
        lfa S = jdg.S(this);
        S.b("languageTag", this.b);
        S.b("variant", this.c);
        S.b("keyboardType", this.d);
        S.b("layoutName", this.f);
        return S.toString();
    }

    protected KeyboardPreviewItemView(Context context, AttributeSet attributeSet, String str, String str2, String str3, String str4) {
        super(context, attributeSet);
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.f = str4;
        a(context);
    }
}
