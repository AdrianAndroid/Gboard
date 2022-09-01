package com.google.android.apps.inputmethod.libs.search.richsymbol;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class RichSymbolRecyclerView extends RecyclerView {
    public static final ltg S = ltg.j("com/google/android/apps/inputmethod/libs/search/richsymbol/RichSymbolRecyclerView");
    public final int T;
    private final int U;

    public RichSymbolRecyclerView(Context context) {
        super(context);
        this.U = context.getResources().getInteger(R.integer.f132660_resource_name_obfuscated_res_0x7f0c00ef);
        this.T = context.getResources().getDimensionPixelSize(R.dimen.f41560_resource_name_obfuscated_res_0x7f070622);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        getContext();
        ab(new GridLayoutManager(this.U));
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (this.C == 1) {
            motionEvent.setAction(3);
        }
        return onTouchEvent;
    }

    public RichSymbolRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.U = context.getResources().getInteger(R.integer.f132660_resource_name_obfuscated_res_0x7f0c00ef);
        this.T = context.getResources().getDimensionPixelSize(R.dimen.f41560_resource_name_obfuscated_res_0x7f070622);
    }

    public RichSymbolRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.U = context.getResources().getInteger(R.integer.f132660_resource_name_obfuscated_res_0x7f0c00ef);
        this.T = context.getResources().getDimensionPixelSize(R.dimen.f41560_resource_name_obfuscated_res_0x7f070622);
    }
}
