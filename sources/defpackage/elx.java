package defpackage;

import android.content.Context;
import android.widget.CompoundButton;

/* compiled from: PG */
/* renamed from: elx  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class elx implements CompoundButton.OnCheckedChangeListener {
    public static final /* synthetic */ elx a = new elx();

    private /* synthetic */ elx() {
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        Context context = compoundButton.getContext();
        gzm.m(hrx.y(context), context);
    }
}
