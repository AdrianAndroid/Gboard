package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: imc  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class imc implements ilx {
    private final /* synthetic */ int c;
    public static final /* synthetic */ imc b = new imc(1);
    public static final /* synthetic */ imc a = new imc(0);

    private /* synthetic */ imc(int i) {
        this.c = i;
    }

    @Override // defpackage.hit
    public final Object a(Object obj, Object obj2) {
        return this.c != 0 ? new imb((Context) obj, (ilz) obj2) : new imd((Context) obj, (ilz) obj2);
    }
}
