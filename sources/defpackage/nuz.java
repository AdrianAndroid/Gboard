package defpackage;

import java.net.URI;

/* compiled from: PG */
/* renamed from: nuz  reason: default package */
/* loaded from: classes2.dex */
final class nuz extends nut {
    final /* synthetic */ nvb a;

    public nuz(nvb nvbVar) {
        this.a = nvbVar;
    }

    @Override // defpackage.nut
    public final nux a(URI uri, nur nurVar) {
        nuy nuyVar = (nuy) this.a.b().get(uri.getScheme());
        if (nuyVar == null) {
            return null;
        }
        return nuyVar.a(uri, nurVar);
    }

    @Override // defpackage.nut
    public final String b() {
        String str;
        synchronized (this.a) {
            str = this.a.b;
        }
        return str;
    }
}
