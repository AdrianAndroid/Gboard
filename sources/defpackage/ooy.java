package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* renamed from: ooy  reason: default package */
/* loaded from: classes2.dex */
public final class ooy {
    public final ovn a;
    boolean b;
    final /* synthetic */ opc c;
    private final oqy d;
    private final ovn e;

    public ooy(opc opcVar, oqy oqyVar) {
        this.c = opcVar;
        this.d = oqyVar;
        ovn a = oqyVar.a(1);
        this.e = a;
        this.a = new oox(this, a, oqyVar);
    }

    public final void a() {
        synchronized (this.c) {
            if (this.b) {
                return;
            }
            this.b = true;
            this.c.c++;
            oqs.r(this.e);
            try {
                this.d.b();
            } catch (IOException unused) {
            }
        }
    }
}
