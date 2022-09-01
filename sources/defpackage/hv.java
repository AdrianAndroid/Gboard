package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewDebug;
import android.view.ViewGroup;

/* compiled from: PG */
/* renamed from: hv  reason: default package */
/* loaded from: classes.dex */
public final class hv extends kw {
    @ViewDebug.ExportedProperty
    public boolean a;
    @ViewDebug.ExportedProperty
    public int b;
    @ViewDebug.ExportedProperty
    public int c;
    @ViewDebug.ExportedProperty
    public boolean d;
    @ViewDebug.ExportedProperty
    public boolean e;
    public boolean f;

    public hv() {
        super(-2);
        this.a = false;
    }

    public hv(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public hv(hv hvVar) {
        super(hvVar);
        this.a = hvVar.a;
    }

    public hv(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }
}
