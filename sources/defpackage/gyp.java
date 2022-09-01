package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: gyp  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class gyp implements gys {
    private final /* synthetic */ int d;
    public static final /* synthetic */ gyp b = new gyp(1);
    public static final /* synthetic */ gyp a = new gyp(0);

    private /* synthetic */ gyp(int i) {
        this.d = i;
    }

    @Override // defpackage.gys
    public final Context a(Context context) {
        if (this.d != 0) {
            return hqs.d(context);
        }
        int i = gyq.a;
        return context;
    }
}
