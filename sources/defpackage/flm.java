package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: flm  reason: default package */
/* loaded from: classes.dex */
public final class flm {
    public final flo a;
    public final lgb b;
    boolean c = false;
    public ArrayList d = null;
    public ArrayList e = null;
    public String f = null;
    public String g;
    public final int h;
    public final nfj i;
    public gkd j;

    public flm(flo floVar, lgb lgbVar) {
        nfj nfjVar = (nfj) nol.j.t();
        this.i = nfjVar;
        this.a = floVar;
        this.g = floVar.j;
        this.h = floVar.k;
        long currentTimeMillis = System.currentTimeMillis();
        if (nfjVar.c) {
            nfjVar.cD();
            nfjVar.c = false;
        }
        nol nolVar = (nol) nfjVar.b;
        nolVar.a |= 1;
        nolVar.b = currentTimeMillis;
        long f = ffb.f(((nol) nfjVar.b).b);
        if (nfjVar.c) {
            nfjVar.cD();
            nfjVar.c = false;
        }
        nol nolVar2 = (nol) nfjVar.b;
        nolVar2.a |= 65536;
        nolVar2.g = f;
        if (gkm.c(floVar.e)) {
            if (nfjVar.c) {
                nfjVar.cD();
                nfjVar.c = false;
            }
            nol nolVar3 = (nol) nfjVar.b;
            nolVar3.a |= 8388608;
            nolVar3.h = true;
        }
        if (SystemClock.elapsedRealtime() != 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (nfjVar.c) {
                nfjVar.cD();
                nfjVar.c = false;
            }
            nol nolVar4 = (nol) nfjVar.b;
            nolVar4.a |= 2;
            nolVar4.c = elapsedRealtime;
        }
        this.b = lgbVar;
    }

    public final fof a() {
        if (this.c) {
            throw new IllegalStateException("do not reuse LogEventBuilder");
        }
        this.c = true;
        return this.a.d.a(this);
    }

    public final void b(int i) {
        nfj nfjVar = this.i;
        if (nfjVar.c) {
            nfjVar.cD();
            nfjVar.c = false;
        }
        nol nolVar = (nol) nfjVar.b;
        nol nolVar2 = nol.j;
        nolVar.a |= 16;
        nolVar.e = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClearcutLogger.LogEventBuilder[uploadAccount: ");
        sb.append(this.f);
        sb.append(", logSourceName: ");
        sb.append(this.g);
        sb.append(", qosTier: ");
        int i = this.h;
        int i2 = i - 1;
        String str = null;
        if (i != 0) {
            sb.append(i2);
            sb.append(", SourceExtensionByteStringProvider: ");
            sb.append(this.b);
            sb.append(", veMessage: null, testCodes: null, mendelPackages: ");
            ArrayList arrayList = this.d;
            sb.append(arrayList != null ? flo.e(arrayList) : null);
            sb.append(", experimentIds: ");
            ArrayList arrayList2 = this.e;
            if (arrayList2 != null) {
                str = flo.e(arrayList2);
            }
            sb.append(str);
            sb.append(", experimentTokens: null, experimentTokensBytes: null, addPhenotype: true, logVerifier: ");
            String[] strArr = flo.a;
            sb.append(this.j);
            sb.append("]");
            return sb.toString();
        }
        throw null;
    }
}
