package defpackage;

import android.app.Service;

/* compiled from: PG */
@Deprecated
/* renamed from: moq  reason: default package */
/* loaded from: classes2.dex */
public final class moq extends nxt {
    public static final ltg a = ltg.j("com/google/frameworks/client/data/android/binder/AndroidServiceServerBuilder");
    public final Service b;
    public final oev c;
    public final oir f;
    public final oda d = off.c(oao.p);
    public oqv g = nwg.b();
    public final nwe e = nwe.a;

    public moq(Service service, nwc nwcVar, oir oirVar, byte[] bArr) {
        this.b = service;
        this.f = oirVar;
        oev oevVar = new oev(new mop(this, nwcVar, oirVar, (byte[]) null));
        this.c = oevVar;
        oevVar.f = nsy.b();
        oevVar.g = nsk.a();
        oevVar.i = false;
        oevVar.l = false;
    }

    @Override // defpackage.nxt
    public final nxo a() {
        return this.c;
    }
}
