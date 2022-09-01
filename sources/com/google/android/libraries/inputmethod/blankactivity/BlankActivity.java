package com.google.android.libraries.inputmethod.blankactivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public class BlankActivity extends Activity {
    private LinearLayout a;

    private static void a(View view) {
        if (view.getBackground() != null) {
            view.getBackground().setCallback(null);
        }
        if (view instanceof ViewGroup) {
            int i = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i < viewGroup.getChildCount()) {
                    a(viewGroup.getChildAt(i));
                    i++;
                } else {
                    try {
                        viewGroup.removeAllViews();
                        return;
                    } catch (UnsupportedOperationException unused) {
                        return;
                    }
                }
            }
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LinearLayout linearLayout = new LinearLayout(this);
        this.a = linearLayout;
        setContentView(linearLayout);
    }

    @Override // android.app.Activity
    protected final void onDestroy() {
        super.onDestroy();
        LinearLayout linearLayout = this.a;
        if (linearLayout != null) {
            a(linearLayout);
        }
    }
}
