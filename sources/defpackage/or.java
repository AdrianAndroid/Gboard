package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* renamed from: or  reason: default package */
/* loaded from: classes2.dex */
public abstract class or extends on {
    private final int a;
    private final int b;

    public or(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // defpackage.on
    public int d(RecyclerView recyclerView, mo moVar) {
        return f(this.b, this.a);
    }
}
