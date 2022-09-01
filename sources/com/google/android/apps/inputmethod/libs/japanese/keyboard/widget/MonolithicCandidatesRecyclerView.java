package com.google.android.apps.inputmethod.libs.japanese.keyboard.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MonolithicCandidatesRecyclerView extends RecyclerView implements jdb {
    private static final ltg aa = ltg.j("com/google/android/apps/inputmethod/libs/japanese/keyboard/widget/MonolithicCandidatesRecyclerView");
    public final int S;
    public float T;
    public final int U;
    public final int V;
    public final deb W;

    public MonolithicCandidatesRecyclerView(Context context) {
        this(context, null);
    }

    @Override // defpackage.jdb
    public final void A(jdr jdrVar) {
        this.W.h = jdrVar;
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (this.C == 1) {
            motionEvent.setAction(3);
        }
        return onTouchEvent;
    }

    @Override // defpackage.jdb
    public final void t(gqc gqcVar) {
        this.W.i = gqcVar;
    }

    @Override // defpackage.jdb
    public final void y(float f, float f2) {
        deb debVar = this.W;
        debVar.g = f;
        debVar.f = f2;
        this.T = f;
    }

    public MonolithicCandidatesRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MonolithicCandidatesRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.T = 1.0f;
        TypedArray typedArray = null;
        try {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dkp.c, 0, 0);
            try {
                this.S = obtainStyledAttributes.getDimensionPixelSize(1, 0);
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 1);
                if (dimensionPixelSize <= 0) {
                    ((ltd) aa.a(hip.a).k("com/google/android/apps/inputmethod/libs/japanese/keyboard/widget/MonolithicCandidatesRecyclerView", "<init>", 69, "MonolithicCandidatesRecyclerView.java")).u("mMinCandidateWidth [%d] <= 0", dimensionPixelSize);
                    this.V = 1;
                } else {
                    this.V = dimensionPixelSize;
                }
                this.U = obtainStyledAttributes.getInt(2, 0);
                if (obtainStyledAttributes != null) {
                    obtainStyledAttributes.recycle();
                }
                this.W = new deb(context, new dec(attributeSet), null);
            } catch (Throwable th) {
                th = th;
                typedArray = obtainStyledAttributes;
                if (typedArray != null) {
                    typedArray.recycle();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
