package defpackage;

import android.content.Context;
import android.os.SystemClock;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ibt  reason: default package */
/* loaded from: classes.dex */
public final class ibt {
    public final Set a;
    public final mko b;
    final /* synthetic */ ibu c;
    private final String d;

    public ibt(final ibu ibuVar, final Context context, final String str, ibr ibrVar, final jls jlsVar, final hek hekVar, mkr mkrVar, byte[] bArr, byte[] bArr2) {
        mko h;
        this.c = ibuVar;
        Set n = lvw.n();
        this.a = n;
        this.d = str;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (ibrVar != null) {
            n.add(ibrVar);
        }
        final long elapsedRealtime2 = SystemClock.elapsedRealtime();
        gwo gwoVar = ibuVar.c;
        Object obj = gwoVar.e.get(str);
        if (obj == null) {
            h = mio.h(mhu.g(gwoVar.d.a(str, mkrVar), Throwable.class, new ebi(str, 19), mjl.a), new jlg(gwoVar, SystemClock.elapsedRealtime(), str, 1), mjl.a);
        } else {
            h = kcu.K(obj);
        }
        mko g = mio.g(mhu.g(h, Throwable.class, hwy.h, mjl.a), new leq(elapsedRealtime2, context, this, str, jlsVar, hekVar, null, null) { // from class: ibp
            public final /* synthetic */ long b;
            public final /* synthetic */ Context c;
            public final /* synthetic */ ibt d;
            public final /* synthetic */ String e;
            public final /* synthetic */ jls f;
            public final /* synthetic */ hek g;

            /* JADX WARN: Removed duplicated region for block: B:24:0x00ca  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x00e6  */
            @Override // defpackage.leq
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object a(java.lang.Object r17) {
                /*
                    Method dump skipped, instructions count: 302
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ibp.a(java.lang.Object):java.lang.Object");
            }
        }, mkrVar);
        this.b = g;
        kcu.U(g, new ibs(this, elapsedRealtime), gyc.b);
    }

    public final void a(ibm ibmVar) {
        for (ibr ibrVar : this.a) {
            ibrVar.b(ibmVar);
        }
        String str = this.d;
        if (str == null || this.c.d.get(str) != this) {
            return;
        }
        this.c.d.remove(this.d);
    }

    public final boolean b() {
        mko mkoVar = this.b;
        if (mkoVar != null) {
            return mkoVar.isCancelled();
        }
        return false;
    }
}
