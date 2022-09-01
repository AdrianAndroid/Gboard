package defpackage;

import android.content.ContentValues;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.logging.Level;

/* compiled from: PG */
/* renamed from: cpu  reason: default package */
/* loaded from: classes.dex */
public final class cpu {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/expression/history/EmojiSharesHistory");
    public final iqx b;
    public final hbd c;
    public final cpp d = new cpp();

    public cpu(iqx iqxVar, hbd hbdVar) {
        this.b = iqxVar;
        this.c = hbdVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ContentValues a(String str, String str2, long j, long j2, long j3) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("emoji", str);
        contentValues.put("base_variant_emoji", str2);
        contentValues.put("truncated_timestamp_millis", Long.valueOf(j));
        contentValues.put("last_event_millis", Long.valueOf(j2));
        contentValues.put("shares", Long.valueOf(j3));
        return contentValues;
    }

    public static void d(jma jmaVar, String str, String str2, long j, long j2, long j3) {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        sb.append("UPDATE OR IGNORE emoji_shares SET shares = shares +  ? ,last_event_millis = MAX(last_event_millis, ?) WHERE emoji = ? AND base_variant_emoji = ? AND truncated_timestamp_millis = ?");
        arrayList.add(Long.valueOf(j3));
        arrayList.add(Long.valueOf(j));
        arrayList.add(str);
        arrayList.add(str2);
        arrayList.add(Long.valueOf(j2));
        if (jco.o(jmaVar, kws.m(sb, arrayList)) == 0) {
            jco.n(jmaVar, "emoji_shares", a(str, str2, j2, j, j3));
        }
    }

    public final hiz b(long j) {
        lfb g;
        boolean z = j > 0;
        dau.e(z, "Invalid limit");
        if (!z) {
            return hiz.m(new IllegalArgumentException());
        }
        if (irs.d()) {
            cpp cppVar = this.d;
            synchronized (cppVar.b) {
                if (j > cppVar.c) {
                    cppVar.b.size();
                    g = ldu.a;
                } else {
                    llp a2 = llp.o(cppVar.b.snapshot().keySet()).a();
                    if (a2.size() > j) {
                        a2 = a2.subList(0, (int) j);
                    }
                    a2.size();
                    g = lfb.g(a2);
                }
            }
            if (g.e()) {
                return hiz.n((llp) g.a());
            }
            iqx iqxVar = this.b;
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList = new ArrayList();
            sb.append("SELECT emoji, SUM(shares) as total_shares, MAX(last_event_millis) as last_shared_timestamp FROM emoji_shares GROUP BY emoji ORDER BY last_shared_timestamp DESC LIMIT ?");
            arrayList.add(Long.valueOf(j));
            hiz u = iqxVar.b(kws.m(sb, arrayList), cps.c, this.b.b).u(new cxo(this, j, 1), mjl.a);
            u.H(Level.SEVERE, "Failed to get recent emoji", new Object[0]);
            return u;
        }
        return hiz.n(llp.q());
    }

    public final void c(final String str) {
        boolean z = !TextUtils.isEmpty(str);
        dau.e(z, "Emoji is empty");
        if (!z) {
            hiz.m(new IllegalArgumentException());
        } else if (irs.d()) {
            final long currentTimeMillis = System.currentTimeMillis();
            final long k = fgy.k(currentTimeMillis);
            this.b.a(new krr() { // from class: cpq
                @Override // defpackage.krr
                public final void a(jma jmaVar) {
                    cpu cpuVar = cpu.this;
                    String str2 = str;
                    cpu.d(jmaVar, str2, cpuVar.c.g().b(str2), currentTimeMillis, k, 1L);
                }
            }).g(new hiu() { // from class: cpr
                @Override // defpackage.hiu
                public final void a(Object obj) {
                    cpu cpuVar = cpu.this;
                    String str2 = str;
                    long j = currentTimeMillis;
                    long j2 = k;
                    Void r13 = (Void) obj;
                    cpp cppVar = cpuVar.d;
                    synchronized (cppVar.b) {
                        cppVar.b.put(str2, cpp.a);
                        cppVar.c = Math.max(cppVar.b.size(), cppVar.c);
                        cppVar.b.size();
                    }
                    if (str2 == null) {
                        throw new NullPointerException("Null emoji");
                    }
                    String b = cpuVar.c.g().b(str2);
                    if (b != null) {
                        ijl.b().g(new cpn(str2, b, j, j2));
                        return;
                    }
                    throw new NullPointerException("Null baseVariantEmoji");
                }
            }, mjl.a).H(Level.SEVERE, "Failed to add emoji share", new Object[0]);
        } else {
            hiz.n(null);
        }
    }
}
