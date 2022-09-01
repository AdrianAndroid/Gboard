package defpackage;

import android.content.ContentValues;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.logging.Level;

/* compiled from: PG */
/* renamed from: cqa  reason: default package */
/* loaded from: classes.dex */
public final class cqa {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/expression/history/EmoticonSharesHistory");
    public final iqx b;

    public cqa(iqx iqxVar) {
        this.b = iqxVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ContentValues a(String str, long j, long j2) {
        return b(str, j, j2, 1L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ContentValues b(String str, long j, long j2, long j3) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("emoticon", str);
        contentValues.put("truncated_timestamp_millis", Long.valueOf(j));
        contentValues.put("last_event_millis", Long.valueOf(j2));
        contentValues.put("shares", Long.valueOf(j3));
        return contentValues;
    }

    public static void e(jma jmaVar, String str, long j, long j2, long j3) {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        sb.append("UPDATE OR IGNORE emoticon_shares SET shares = shares + ?, last_event_millis = MAX(last_event_millis, ?) WHERE emoticon = ? AND truncated_timestamp_millis = ?");
        arrayList.add(Long.valueOf(j3));
        arrayList.add(Long.valueOf(j));
        arrayList.add(str);
        arrayList.add(Long.valueOf(j2));
        if (jco.o(jmaVar, kws.m(sb, arrayList)) == 0) {
            jco.n(jmaVar, "emoticon_shares", a(str, j2, j));
        }
    }

    public final void c(final String str) {
        boolean z = !TextUtils.isEmpty(str);
        dau.e(z, "Emoticon is empty");
        if (!z) {
            hiz.m(new IllegalArgumentException());
        } else if (irs.d()) {
            final long currentTimeMillis = System.currentTimeMillis();
            final long k = fgy.k(currentTimeMillis);
            hiz a2 = this.b.a(new krr() { // from class: cpz
                @Override // defpackage.krr
                public final void a(jma jmaVar) {
                    cqa.e(jmaVar, str, currentTimeMillis, k, 1L);
                }
            });
            a2.J(Level.FINEST, "Added emoticon share to history", new Object[0]);
            a2.H(Level.WARNING, "Failed to add emoticon share to history", new Object[0]);
        } else {
            hiz.n(null);
        }
    }

    public final hiz d() {
        if (!irs.d()) {
            return hiz.n(lrq.b);
        }
        iqx iqxVar = this.b;
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        sb.append("SELECT emoticon, SUM(shares) as total_shares, MAX(last_event_millis) as last_shared_timestamp FROM emoticon_shares GROUP BY emoticon ORDER BY last_shared_timestamp DESC LIMIT ?");
        arrayList.add(1000L);
        return iqxVar.b(kws.m(sb, arrayList), cps.d, this.b.b);
    }
}
