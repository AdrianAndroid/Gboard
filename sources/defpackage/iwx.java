package defpackage;

import android.database.Cursor;
import android.database.DatabaseUtils;
import android.text.TextUtils;
import android.util.LruCache;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: iwx  reason: default package */
/* loaded from: classes.dex */
public final class iwx implements ixe {
    private static final ltg a = ltg.j("com/google/android/libraries/inputmethod/trainingcache/storage/StorageAdapter");
    private final iws b;
    private final iww c;
    private final idk d;
    private final LruCache e = new iwu();
    private final AtomicBoolean f = new AtomicBoolean(false);
    private final boe g;

    public iwx(iws iwsVar, boe boeVar, iww iwwVar, idk idkVar, byte[] bArr, byte[] bArr2) {
        this.b = iwsVar;
        this.g = boeVar;
        this.c = iwwVar;
        this.d = idkVar;
    }

    private final ixh q(ipl iplVar, ipz ipzVar) {
        return new iwn(this.b.a(iplVar.d(), ipzVar), iplVar.c(), iplVar.b(), this.g.w(iplVar));
    }

    private final llp r(ipl iplVar, ipz ipzVar, lmz lmzVar) {
        iph a2 = this.b.a(iplVar.d(), ipzVar);
        try {
            ArrayList arrayList = new ArrayList();
            while (a2.hasNext()) {
                Object next = a2.next();
                byte[] bArr = ((ipb) next).d;
                if (bArr == null) {
                    ngz ngzVar = ((ipb) next).c;
                    if (ngzVar == null) {
                        throw new IllegalArgumentException("DataItem#protoBytes() and DataItem#message() should not be null at the same time.");
                    }
                    bArr = ngzVar.q();
                }
                byte[] bArr2 = bArr;
                long a3 = ((ipb) next).b.a("_timestamp_", 0L);
                long a4 = ((ipb) next).b.a("_session_id", 0L);
                Class c = iplVar.c();
                ngz b = iplVar.b();
                boe j = ipt.j();
                j.B(((ipb) next).b, lmzVar);
                arrayList.add(ixg.a(a3, a4, c, b, bArr2, j.A()));
            }
            llp o = llp.o(arrayList);
            a2.close();
            return o;
        } catch (Throwable th) {
            try {
                a2.close();
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.Map, java.lang.Object] */
    private final void s(ipl iplVar, byte[] bArr, ngz ngzVar, ipt iptVar, long j, long j2) {
        if (j2 == Long.MIN_VALUE) {
            ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/trainingcache/storage/StorageAdapter", "logToCacheInternal", 456, "StorageAdapter.java")).t("Failed to log, because sessionId is invalid, which may indicate the session has not begun.");
            return;
        }
        iws iwsVar = this.b;
        osr a2 = ipb.a();
        a2.b = bArr;
        a2.c = ngzVar;
        a2.a = iplVar.d();
        boe x = a2.x();
        if (iptVar != null) {
            x.a.putAll(iptVar.a);
        }
        a2.s("_session_id", j2);
        a2.s("_timestamp_", j);
        iwt iwtVar = (iwt) iwsVar;
        if (!iwtVar.e.z(llp.r(a2.r()))) {
            return;
        }
        kcu.U(kcu.N(new ihi(iwtVar, 12), iwtVar.d), new ivq(10), iwtVar.d);
    }

    private final boolean t(ipl iplVar) {
        if (((llw) this.g.a).containsKey(iplVar)) {
            return false;
        }
        ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/trainingcache/storage/StorageAdapter", "tableNotRegistered", 541, "StorageAdapter.java")).w("Table with name %s not registered.", iplVar.d());
        return true;
    }

    @Override // defpackage.ixi
    public final double a(ipl iplVar, ngz ngzVar, ixd ixdVar, String str) {
        if (t(iplVar)) {
            return 0.0d;
        }
        ipz a2 = ixdVar.a(ngzVar, this.b.b("session"));
        iwt iwtVar = (iwt) this.b;
        iwtVar.c();
        ipr iprVar = (ipr) ((ipm) iwtVar.c).c.get("session");
        if (iprVar != null) {
            String str2 = iprVar.b;
            StringBuilder sb = new StringBuilder("SELECT SUM(");
            sb.append(str);
            sb.append(") FROM ");
            sb.append(str2);
            if (!TextUtils.isEmpty(a2.d)) {
                sb.append(" WHERE ");
                sb.append(a2.d);
            }
            if (!TextUtils.isEmpty(a2.f)) {
                sb.append(" ORDER BY ");
                sb.append(a2.f);
            }
            if (!TextUtils.isEmpty(a2.g)) {
                sb.append(" LIMIT ");
                sb.append(a2.g);
            }
            Cursor rawQuery = iprVar.d.rawQuery(sb.toString(), a2.e);
            try {
                if (rawQuery.moveToFirst()) {
                    double d = rawQuery.getDouble(0);
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    return d;
                } else if (rawQuery == null) {
                    return 0.0d;
                } else {
                    rawQuery.close();
                    return 0.0d;
                }
            } catch (Throwable th) {
                if (rawQuery != null) {
                    try {
                        rawQuery.close();
                    } catch (Throwable th2) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        } catch (Exception unused) {
                        }
                    }
                }
                throw th;
            }
        }
        ((ltd) ((ltd) ipm.a.c()).k("com/google/android/libraries/inputmethod/protoxdb/ProtoXDB", "selectFieldSum", 147, "ProtoXDB.java")).w("Failed to select field sum because given table name [%s] not exists", "session");
        return 0.0d;
    }

    @Override // defpackage.ixi
    public final long b(ipl iplVar, ngz ngzVar, ixd ixdVar) {
        if (t(iplVar)) {
            return 0L;
        }
        ipz a2 = ixdVar.a(ngzVar, this.b.b("session"));
        iwt iwtVar = (iwt) this.b;
        iwtVar.c();
        ipr iprVar = (ipr) ((ipm) iwtVar.c).c.get("session");
        if (iprVar != null) {
            long queryNumEntries = DatabaseUtils.queryNumEntries(iprVar.d, iprVar.b, a2.d, a2.e);
            String str = a2.g;
            return str != null ? Math.min(queryNumEntries, Long.parseLong(str)) : queryNumEntries;
        }
        ((ltd) ((ltd) ipm.a.c()).k("com/google/android/libraries/inputmethod/protoxdb/ProtoXDB", "selectDataItemCount", 132, "ProtoXDB.java")).w("Failed to select data item count because given table name [%s] not exists", "session");
        return 0L;
    }

    @Override // defpackage.ixi
    public final ipu c(String str) {
        iwt iwtVar = (iwt) this.b;
        iwtVar.c();
        return new ips(((ipm) iwtVar.c).e.rawQuery(str, null));
    }

    @Override // defpackage.ixe, java.lang.AutoCloseable
    public final void close() {
        if (this.f.compareAndSet(false, true)) {
            this.c.a();
            this.e.evictAll();
        }
    }

    @Override // defpackage.ixi
    public final ixg d(ipl iplVar) {
        if (t(iplVar)) {
            return null;
        }
        osr a2 = ipz.a();
        a2.o("_timestamp_", true);
        a2.n(1);
        llp r = r(iplVar, a2.k(), this.g.w(iplVar));
        if (r.isEmpty()) {
            return null;
        }
        return (ixg) r.get(0);
    }

    @Override // defpackage.ixi
    public final ixh e(ipl iplVar) {
        if (t(iplVar)) {
            return new iwr();
        }
        osr a2 = ipz.a();
        a2.q("_timestamp_");
        return q(iplVar, a2.k());
    }

    @Override // defpackage.ixi
    public final ixh f(ipl iplVar, ipz ipzVar) {
        return t(iplVar) ? new iwr() : q(iplVar, ipzVar);
    }

    @Override // defpackage.ixi
    public final ixh g(ipl iplVar, ngz ngzVar, ixd ixdVar) {
        return t(iplVar) ? new iwr() : q(iplVar, ixdVar.a(ngzVar, this.b.b(iplVar.d())));
    }

    @Override // defpackage.ixi
    public final ixh h(ipl iplVar, long j, long j2) {
        if (t(iplVar)) {
            return new iwr();
        }
        osr a2 = ipz.a();
        a2.p("_timestamp_", ipy.BETWEEN, String.valueOf(j), String.valueOf(j2));
        a2.q("_timestamp_");
        return q(iplVar, a2.k());
    }

    @Override // defpackage.ixi
    public final List i(ipl iplVar, long j) {
        if (t(iplVar)) {
            return llp.q();
        }
        osr c = ipz.c("_session_id", ipy.EQUAL, String.valueOf(j));
        c.q("_timestamp_");
        return r(iplVar, c.k(), this.g.w(iplVar));
    }

    @Override // defpackage.ixe
    public final void j() {
        System.currentTimeMillis();
        iwt iwtVar = (iwt) this.b;
        iwtVar.c();
        ipk ipkVar = iwtVar.c;
        try {
            ((ipm) ipkVar).e.beginTransaction();
            lsz it = ((ipm) ipkVar).c.values().iterator();
            while (it.hasNext()) {
                ipr iprVar = (ipr) it.next();
                if (iprVar.c.e.b > 0) {
                    gjz gjzVar = iprVar.l;
                    ipz k = ipz.c("_timestamp_", ipy.LESS, String.valueOf(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(iprVar.c.e.b))).k();
                    iprVar.d.delete(iprVar.b, k.d, k.e);
                }
                iprVar.d();
            }
            ((ipm) ipkVar).e.setTransactionSuccessful();
            ((ipm) ipkVar).e.endTransaction();
            this.e.evictAll();
            System.currentTimeMillis();
        } catch (Throwable th) {
            ((ipm) ipkVar).e.endTransaction();
            throw th;
        }
    }

    @Override // defpackage.ixe
    public final void k() {
        iwt iwtVar = (iwt) this.b;
        iwtVar.e.y();
        ipk ipkVar = iwtVar.c;
        try {
            ((ipm) ipkVar).e.beginTransaction();
            lsz it = ((ipm) ipkVar).c.values().iterator();
            while (it.hasNext()) {
                ipr iprVar = (ipr) it.next();
                ipf.e(iprVar.d, iprVar.b);
            }
            ((ipm) ipkVar).e.setTransactionSuccessful();
            ((ipm) ipkVar).e.endTransaction();
            this.e.evictAll();
        } catch (Throwable th) {
            ((ipm) ipkVar).e.endTransaction();
            throw th;
        }
    }

    @Override // defpackage.ixj
    public final void l() {
        this.b.c();
    }

    @Override // defpackage.ixe
    public final void m() {
        long j;
        idk idkVar = this.d;
        iwc iwcVar = iwc.DB_SIZE;
        iwt iwtVar = (iwt) this.b;
        iwtVar.c();
        idkVar.e(iwcVar, Long.valueOf(((ipm) iwtVar.c).f.length() / 1024));
        lsz it = lmz.o(lre.ab(((llw) this.g.a).keySet(), iuu.k)).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            iwt iwtVar2 = (iwt) this.b;
            iwtVar2.c();
            ipr iprVar = (ipr) ((ipm) iwtVar2.c).c.get(str);
            if (iprVar != null) {
                j = DatabaseUtils.queryNumEntries(iprVar.d, iprVar.b);
            } else {
                ((ltd) ((ltd) ipm.a.c()).k("com/google/android/libraries/inputmethod/protoxdb/ProtoXDB", "getTableCount", 208, "ProtoXDB.java")).w("Failed to get table size because given table name [%s] not exists", str);
                j = 0;
            }
            iws iwsVar = this.b;
            osr a2 = ipz.a();
            a2.q("_timestamp_");
            a2.n(1);
            iph a3 = iwsVar.a(str, a2.k());
            try {
                int i = -1;
                if (a3.hasNext()) {
                    long a4 = ((ipb) a3.next()).b.a("_timestamp_", 0L);
                    if (a4 != 0) {
                        i = (int) TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis() - a4);
                    }
                }
                a3.close();
                this.d.e(iwc.TABLE_STATS, str, Long.valueOf(j), Integer.valueOf(i));
            } catch (Throwable th) {
                try {
                    a3.close();
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                }
                throw th;
            }
        }
    }

    @Override // defpackage.ixj
    public final void n(ipl iplVar, ngz ngzVar, ipt iptVar, long j, long j2) {
        if (t(iplVar)) {
            return;
        }
        s(iplVar, null, ngzVar, iptVar, j, j2);
    }

    @Override // defpackage.ixi
    public final ixg o(ipl iplVar, int i) {
        if (t(iplVar)) {
            return null;
        }
        ipq ipqVar = (ipq) ((llw) this.g.a).get(iplVar);
        if (ipqVar == null || !TextUtils.equals(ipqVar.d, "_hash_")) {
            throw new IllegalArgumentException("Data type to be queried is not set unique on hash.");
        }
        String format = String.format(Locale.getDefault(), "%s-%d", iplVar.d(), Integer.valueOf(i));
        iwv iwvVar = (iwv) this.e.get(format);
        if (iwvVar == null) {
            osr c = ipz.c("_hash_", ipy.EQUAL, String.valueOf(i));
            c.q("_timestamp_");
            c.n(1);
            ixg ixgVar = (ixg) lre.ao(r(iplVar, c.k(), this.g.w(iplVar)));
            if (ixgVar == null) {
                return null;
            }
            this.e.put(format, new iwv(ixgVar.a, ixgVar.b, ixgVar.c, ixgVar.d));
            return ixgVar;
        }
        return ixg.a(iwvVar.a, iwvVar.b, iplVar.c(), iplVar.b(), iwvVar.c, iwvVar.d);
    }

    @Override // defpackage.ixj
    public final void p(ipl iplVar, byte[] bArr, long j, long j2) {
        if (t(iplVar)) {
            return;
        }
        s(iplVar, bArr, null, null, j, j2);
    }
}
