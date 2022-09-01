package com.google.android.apps.inputmethod.libs.search.emoticon;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import com.google.android.inputmethod.latin.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class EmoticonRecyclerView extends RecyclerView {
    private static final ltg S = ltg.j("com/google/android/apps/inputmethod/libs/search/emoticon/EmoticonRecyclerView");
    private final int T;
    private final int U;

    public EmoticonRecyclerView(Context context) {
        super(context);
        this.T = aE(context);
        this.U = context.getResources().getDimensionPixelSize(R.dimen.f33850_resource_name_obfuscated_res_0x7f070168);
    }

    private static int aE(Context context) {
        if (cuz.a.i(context)) {
            return context.getResources().getInteger(context.getResources().getConfiguration().orientation == 2 ? R.integer.f131270_resource_name_obfuscated_res_0x7f0c0026 : R.integer.f131280_resource_name_obfuscated_res_0x7f0c0027);
        }
        return context.getResources().getInteger(R.integer.f131260_resource_name_obfuscated_res_0x7f0c0025);
    }

    public final void a(List list) {
        ls lsVar = this.l;
        ebk ebkVar = lsVar instanceof ebk ? (ebk) lsVar : null;
        if (ebkVar != null) {
            ebkVar.d = list;
            ebkVar.fc();
            Y(0);
            return;
        }
        ((ltd) S.a(hip.a).k("com/google/android/apps/inputmethod/libs/search/emoticon/EmoticonRecyclerView", "setEmoticons", 72, "EmoticonRecyclerView.java")).t("Emoticon adapter is null.");
    }

    public final void aD(jdr jdrVar, gqc gqcVar) {
        Context context = getContext();
        Context context2 = getContext();
        TypedValue typedValue = new TypedValue();
        context2.getResources().getValue(true != cuz.a.j(context2, ebe.a) ? R.dimen.f33860_resource_name_obfuscated_res_0x7f070169 : R.dimen.f42630_resource_name_obfuscated_res_0x7f0706e6, typedValue, true);
        aa(new ebk(context, jdrVar, gqcVar, typedValue.getFloat(), this.U));
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        getContext();
        ab(new GridLayoutManager(this.T));
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (this.C == 1) {
            motionEvent.setAction(3);
        }
        return onTouchEvent;
    }

    public EmoticonRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.T = aE(context);
        this.U = context.getResources().getDimensionPixelSize(R.dimen.f33850_resource_name_obfuscated_res_0x7f070168);
    }

    public EmoticonRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.T = aE(context);
        this.U = context.getResources().getDimensionPixelSize(R.dimen.f33850_resource_name_obfuscated_res_0x7f070168);
    }
}
