package defpackage;

import android.view.View;

/* compiled from: PG */
/* renamed from: jcv  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jcv implements leq {
    public final /* synthetic */ int a;
    private final /* synthetic */ int b;

    public /* synthetic */ jcv(int i, int i2) {
        this.b = i2;
        this.a = i;
    }

    @Override // defpackage.leq
    public final Object a(Object obj) {
        if (this.b == 0) {
            ((View) obj).setLayoutDirection(this.a);
            return null;
        }
        ((View) obj).setLayoutDirection(this.a);
        return null;
    }
}
