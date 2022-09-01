package defpackage;

import android.util.AttributeSet;

/* compiled from: PG */
/* renamed from: jfi  reason: default package */
/* loaded from: classes.dex */
public final class jfi extends jfd {
    private final String a;
    private final boolean b;

    public jfi(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    @Override // defpackage.jfd
    protected final String a() {
        return String.valueOf(this.b);
    }

    @Override // defpackage.jfn
    public final String c() {
        return this.a;
    }

    @Override // defpackage.jfn
    public final boolean d(AttributeSet attributeSet, int i) {
        return attributeSet.getAttributeBooleanValue(i, false) == this.b;
    }
}
