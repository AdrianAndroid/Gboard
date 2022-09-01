package com.google.android.libraries.inputmethod.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CheckBox;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PreferenceCheckBox extends CheckBox {
    public String a;
    private boolean b;

    public PreferenceCheckBox(Context context) {
        super(context);
    }

    private final void a(Context context, AttributeSet attributeSet) {
        this.a = jgd.k(context, attributeSet, null, "pref_key");
        this.b = jgd.o(context, attributeSet, null, "default", false);
    }

    private final void b() {
        ino M = ino.M(getContext());
        String str = this.a;
        boolean z = this.b;
        setChecked(M.al(str, z, z));
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        setOnCheckedChangeListener(new aix(this, 5));
        b();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            b();
        }
    }

    public PreferenceCheckBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public PreferenceCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet);
    }
}
