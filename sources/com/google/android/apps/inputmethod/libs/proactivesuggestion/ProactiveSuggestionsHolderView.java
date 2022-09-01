package com.google.android.apps.inputmethod.libs.proactivesuggestion;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ProactiveSuggestionsHolderView extends FrameLayout implements dye {
    final LinearLayout a;
    private boolean b;
    private final dye c;
    private iou d;

    public ProactiveSuggestionsHolderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View inflate;
        if (Build.VERSION.SDK_INT >= 30) {
            inflate = LayoutInflater.from(context).inflate(R.layout.f144740_resource_name_obfuscated_res_0x7f0e0500, this);
        } else {
            inflate = LayoutInflater.from(context).inflate(R.layout.f144730_resource_name_obfuscated_res_0x7f0e04ff, this);
        }
        this.a = (LinearLayout) inflate.findViewById(R.id.f67580_resource_name_obfuscated_res_0x7f0b0876);
        this.c = Build.VERSION.SDK_INT >= 30 ? (dye) inflate.findViewById(R.id.f67570_resource_name_obfuscated_res_0x7f0b0875) : null;
    }

    @Override // defpackage.dye
    public final int b(iou iouVar) {
        dye dyeVar;
        if (this.d == iouVar) {
            return this.a.getChildCount();
        }
        this.d = iouVar;
        llp llpVar = iouVar.b;
        if (llpVar == null || llpVar.isEmpty()) {
            return 0;
        }
        if (Build.VERSION.SDK_INT < 30 || (dyeVar = this.c) == null) {
            this.a.removeAllViews();
            int size = llpVar.size();
            for (int i = 0; i < size; i++) {
                View view = (View) llpVar.get(i);
                ViewParent parent = view.getParent();
                if (parent != null) {
                    ((ViewGroup) parent).removeView(view);
                }
                this.a.addView(view);
            }
            return this.a.getChildCount();
        }
        return dyeVar.b(iouVar);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        boolean z = this.b;
        if (motionEvent.getAction() == 2) {
            if (!this.b) {
                z = true;
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            z = false;
        }
        if (this.b) {
            motionEvent.setAction(3);
        }
        this.b = z;
        return onTouchEvent;
    }

    @Override // defpackage.dye
    public final void c() {
        dye dyeVar;
        this.d = null;
        if (Build.VERSION.SDK_INT < 30 || (dyeVar = this.c) == null) {
            this.a.removeAllViews();
        } else {
            dyeVar.c();
        }
    }
}
