package com.google.android.libraries.inputmethod.emoji.picker;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public class EmojiPickerBodyRecyclerView extends RecyclerView {
    public static final ltg S = ltg.j("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerBodyRecyclerView");
    public int T;
    public dz U;

    public EmojiPickerBodyRecyclerView(Context context) {
        super(context);
    }

    public final void a(boolean z) {
        ly lyVar = this.m;
        if (lyVar instanceof EmojiPickerLayoutManager) {
            ((EmojiPickerLayoutManager) lyVar).G = z;
        } else {
            ((ltd) ((ltd) S.d()).k("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerBodyRecyclerView", "setScrollable", 90, "EmojiPickerBodyRecyclerView.java")).w("Called setScrollable() with %s, but this only works when the LayoutManager of this RecyclerView is an EmojiPickerLayoutManager", lyVar == null ? "null" : lyVar.getClass().getName());
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (this.C == 1) {
            motionEvent.setAction(3);
        }
        return onTouchEvent;
    }

    public EmojiPickerBodyRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public EmojiPickerBodyRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
