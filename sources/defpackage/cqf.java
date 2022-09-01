package defpackage;

import android.content.ContentValues;
import android.content.Context;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: PG */
/* renamed from: cqf  reason: default package */
/* loaded from: classes.dex */
public final class cqf implements isc {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/expression/history/ExpressionDataPrunePeriodicTask");
    public final ino b;
    public final idk c;
    private final Context d;
    private final mks e = gxo.c(19);

    public cqf(Context context) {
        ino K = ino.K(context, null);
        ieh j = ieh.j();
        this.d = context;
        this.b = K;
        this.c = j;
    }

    public static iso c() {
        isn a2 = iso.a("ExpressionDataPrunePeriodicTask", cqf.class.getName());
        a2.m = ((Boolean) cqc.c.c()).booleanValue();
        a2.l = ((Boolean) cqc.d.c()).booleanValue();
        a2.e(TimeUnit.SECONDS.toMillis(((Long) cqc.b.c()).longValue()));
        a2.b();
        return a2.a();
    }

    @Override // defpackage.isc
    public final isb a(jls jlsVar) {
        ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/expression/history/ExpressionDataPrunePeriodicTask", "onStopTask", 139, "ExpressionDataPrunePeriodicTask.java")).w("%s is stopped unexpectedly", "ExpressionDataPrunePeriodicTask");
        return isb.FINISHED_NEED_RESCHEDULE;
    }

    @Override // defpackage.isc
    public final mko b(jls jlsVar) {
        if (!((Boolean) cqc.a.c()).booleanValue()) {
            this.c.e(ctf.EXPRESSION_DATA_PRUNE_EVENT, ctb.TASK_SKIPPED);
            if (!ism.a(this.d).b(c())) {
                this.c.e(ctf.EXPRESSION_DATA_PRUNE_EVENT, ctb.TASK_CANCEL_FAILURE);
            }
            return q;
        } else if (!irx.b()) {
            final long l = fgy.l(System.currentTimeMillis(), -((Long) cqc.e.c()).intValue());
            if (l <= this.b.I("last_pruned_truncated_timestamp")) {
                this.c.e(ctf.EXPRESSION_DATA_PRUNE_EVENT, ctb.TASK_SKIPPED);
                return q;
            }
            this.c.e(ctf.EXPRESSION_DATA_PRUNE_EVENT, ctb.TASK_STARTED);
            cqh a2 = cqh.a();
            hiz a3 = a2.a.b.a(new krr() { // from class: cpt
                @Override // defpackage.krr
                public final void a(jma jmaVar) {
                    int i = r3;
                    String str = "Removed %d rows from %s";
                    String str2 = "deleteDataBetween";
                    if (i == 0) {
                        String str3 = str2;
                        long j = l;
                        StringBuilder sb = new StringBuilder();
                        ArrayList arrayList = new ArrayList();
                        sb.append("SELECT emoji, base_variant_emoji, -1 AS truncated_timestamp_millis, MAX(last_event_millis) AS last_event_millis, SUM(shares) AS shares FROM emoji_shares WHERE truncated_timestamp_millis < ? GROUP BY emoji, base_variant_emoji");
                        arrayList.add(Long.valueOf(j));
                        llp a4 = cpw.a(jmaVar, kws.m(sb, arrayList));
                        int i2 = ((lrl) a4).c;
                        int i3 = 0;
                        while (i3 < i2) {
                            cpw cpwVar = (cpw) a4.get(i3);
                            String str4 = cpwVar.a;
                            String str5 = cpwVar.b;
                            long j2 = cpwVar.d;
                            llp llpVar = a4;
                            String str6 = str3;
                            long j3 = cpwVar.c;
                            long j4 = j;
                            long j5 = cpwVar.e;
                            StringBuilder sb2 = new StringBuilder();
                            ArrayList arrayList2 = new ArrayList();
                            sb2.append("UPDATE OR IGNORE emoji_shares SET shares = ?, last_event_millis = ? WHERE emoji = ? AND base_variant_emoji = ? AND truncated_timestamp_millis = ?");
                            arrayList2.add(Long.valueOf(j5));
                            arrayList2.add(Long.valueOf(j2));
                            arrayList2.add(str4);
                            arrayList2.add(str5);
                            arrayList2.add(Long.valueOf(j3));
                            if (jco.o(jmaVar, kws.m(sb2, arrayList2)) == 0) {
                                jco.n(jmaVar, "emoji_shares", cpu.a(str4, str5, j3, j2, j5));
                            }
                            i3++;
                            str3 = str6;
                            a4 = llpVar;
                            j = j4;
                        }
                        ((ltd) ((ltd) cpu.a.b()).k("com/google/android/apps/inputmethod/libs/expression/history/EmojiSharesHistory", str3, 658, "EmojiSharesHistory.java")).C(str, jmaVar.d("emoji_shares", "0", String.valueOf(j)), "emoji_shares");
                    } else if (i == 1) {
                        long j6 = l;
                        StringBuilder sb3 = new StringBuilder();
                        ArrayList arrayList3 = new ArrayList();
                        sb3.append("SELECT animated_emoji, -1 AS truncated_timestamp_millis, MAX(last_event_millis) AS last_event_millis, SUM(usage) AS usage FROM animated_emoji_usage WHERE truncated_timestamp_millis < ? GROUP BY animated_emoji");
                        arrayList3.add(Long.valueOf(j6));
                        llp a5 = cpm.a(jmaVar, kws.m(sb3, arrayList3));
                        int i4 = ((lrl) a5).c;
                        int i5 = 0;
                        while (i5 < i4) {
                            cpm cpmVar = (cpm) a5.get(i5);
                            String str7 = cpmVar.a;
                            long j7 = cpmVar.c;
                            long j8 = cpmVar.b;
                            int i6 = cpmVar.d;
                            llp llpVar2 = a5;
                            StringBuilder sb4 = new StringBuilder();
                            int i7 = i4;
                            ArrayList arrayList4 = new ArrayList();
                            sb4.append("UPDATE OR IGNORE animated_emoji_usage SET usage = ?, last_event_millis = ? WHERE animated_emoji = ? AND truncated_timestamp_millis = ?");
                            String str8 = str;
                            String str9 = str2;
                            Long valueOf = Long.valueOf(i6);
                            arrayList4.add(valueOf);
                            Long valueOf2 = Long.valueOf(j7);
                            arrayList4.add(valueOf2);
                            arrayList4.add(str7);
                            Long valueOf3 = Long.valueOf(j8);
                            arrayList4.add(valueOf3);
                            if (jco.o(jmaVar, kws.m(sb4, arrayList4)) == 0) {
                                ContentValues contentValues = new ContentValues();
                                contentValues.put("animated_emoji", str7);
                                contentValues.put("truncated_timestamp_millis", valueOf3);
                                contentValues.put("last_event_millis", valueOf2);
                                contentValues.put("usage", valueOf);
                                jco.n(jmaVar, "animated_emoji_usage", contentValues);
                            }
                            i5++;
                            str = str8;
                            a5 = llpVar2;
                            i4 = i7;
                            str2 = str9;
                        }
                        ((ltd) ((ltd) cpl.a.b()).k("com/google/android/apps/inputmethod/libs/expression/history/AnimatedEmojiUsageHistory", str2, 349, "AnimatedEmojiUsageHistory.java")).C(str, jmaVar.d("animated_emoji_usage", "0", String.valueOf(j6)), "animated_emoji_usage");
                    } else {
                        long j9 = l;
                        StringBuilder sb5 = new StringBuilder();
                        ArrayList arrayList5 = new ArrayList();
                        sb5.append("SELECT emoticon, -1 AS truncated_timestamp_millis, MAX(last_event_millis) AS last_event_millis, SUM(shares) AS shares FROM emoticon_shares WHERE truncated_timestamp_millis < ? GROUP BY emoticon");
                        arrayList5.add(Long.valueOf(j9));
                        llp a6 = cqb.a(jmaVar, kws.m(sb5, arrayList5));
                        int i8 = ((lrl) a6).c;
                        int i9 = 0;
                        while (i9 < i8) {
                            cqb cqbVar = (cqb) a6.get(i9);
                            String str10 = cqbVar.a;
                            long j10 = j9;
                            long j11 = cqbVar.c;
                            long j12 = cqbVar.b;
                            int i10 = i8;
                            long j13 = cqbVar.d;
                            StringBuilder sb6 = new StringBuilder();
                            llp llpVar3 = a6;
                            ArrayList arrayList6 = new ArrayList();
                            sb6.append("UPDATE OR IGNORE emoticon_shares SET shares = ?, last_event_millis = ? WHERE emoticon = ? AND truncated_timestamp_millis = ?");
                            arrayList6.add(Long.valueOf(j13));
                            arrayList6.add(Long.valueOf(j11));
                            arrayList6.add(str10);
                            arrayList6.add(Long.valueOf(j12));
                            if (jco.o(jmaVar, kws.m(sb6, arrayList6)) == 0) {
                                jco.n(jmaVar, "emoticon_shares", cqa.b(str10, j12, j11, j13));
                            }
                            i9++;
                            j9 = j10;
                            i8 = i10;
                            a6 = llpVar3;
                        }
                        ((ltd) ((ltd) cqa.a.b()).k("com/google/android/apps/inputmethod/libs/expression/history/EmoticonSharesHistory", str2, 398, "EmoticonSharesHistory.java")).C(str, jmaVar.d("emoticon_shares", "0", String.valueOf(j9)), "emoticon_shares");
                    }
                }
            });
            Level level = Level.INFO;
            Long valueOf = Long.valueOf(l);
            a3.J(level, "Successfully prune emoticon shares history older than %d", valueOf);
            a3.H(Level.WARNING, "Failed to prune emoticon shares history older than %d", valueOf);
            hiz a4 = a2.b.b.a(new krr() { // from class: cpt
                @Override // defpackage.krr
                public final void a(jma jmaVar) {
                    int i = r3;
                    String str = "Removed %d rows from %s";
                    String str2 = "deleteDataBetween";
                    if (i == 0) {
                        String str3 = str2;
                        long j = l;
                        StringBuilder sb = new StringBuilder();
                        ArrayList arrayList = new ArrayList();
                        sb.append("SELECT emoji, base_variant_emoji, -1 AS truncated_timestamp_millis, MAX(last_event_millis) AS last_event_millis, SUM(shares) AS shares FROM emoji_shares WHERE truncated_timestamp_millis < ? GROUP BY emoji, base_variant_emoji");
                        arrayList.add(Long.valueOf(j));
                        llp a42 = cpw.a(jmaVar, kws.m(sb, arrayList));
                        int i2 = ((lrl) a42).c;
                        int i3 = 0;
                        while (i3 < i2) {
                            cpw cpwVar = (cpw) a42.get(i3);
                            String str4 = cpwVar.a;
                            String str5 = cpwVar.b;
                            long j2 = cpwVar.d;
                            llp llpVar = a42;
                            String str6 = str3;
                            long j3 = cpwVar.c;
                            long j4 = j;
                            long j5 = cpwVar.e;
                            StringBuilder sb2 = new StringBuilder();
                            ArrayList arrayList2 = new ArrayList();
                            sb2.append("UPDATE OR IGNORE emoji_shares SET shares = ?, last_event_millis = ? WHERE emoji = ? AND base_variant_emoji = ? AND truncated_timestamp_millis = ?");
                            arrayList2.add(Long.valueOf(j5));
                            arrayList2.add(Long.valueOf(j2));
                            arrayList2.add(str4);
                            arrayList2.add(str5);
                            arrayList2.add(Long.valueOf(j3));
                            if (jco.o(jmaVar, kws.m(sb2, arrayList2)) == 0) {
                                jco.n(jmaVar, "emoji_shares", cpu.a(str4, str5, j3, j2, j5));
                            }
                            i3++;
                            str3 = str6;
                            a42 = llpVar;
                            j = j4;
                        }
                        ((ltd) ((ltd) cpu.a.b()).k("com/google/android/apps/inputmethod/libs/expression/history/EmojiSharesHistory", str3, 658, "EmojiSharesHistory.java")).C(str, jmaVar.d("emoji_shares", "0", String.valueOf(j)), "emoji_shares");
                    } else if (i == 1) {
                        long j6 = l;
                        StringBuilder sb3 = new StringBuilder();
                        ArrayList arrayList3 = new ArrayList();
                        sb3.append("SELECT animated_emoji, -1 AS truncated_timestamp_millis, MAX(last_event_millis) AS last_event_millis, SUM(usage) AS usage FROM animated_emoji_usage WHERE truncated_timestamp_millis < ? GROUP BY animated_emoji");
                        arrayList3.add(Long.valueOf(j6));
                        llp a5 = cpm.a(jmaVar, kws.m(sb3, arrayList3));
                        int i4 = ((lrl) a5).c;
                        int i5 = 0;
                        while (i5 < i4) {
                            cpm cpmVar = (cpm) a5.get(i5);
                            String str7 = cpmVar.a;
                            long j7 = cpmVar.c;
                            long j8 = cpmVar.b;
                            int i6 = cpmVar.d;
                            llp llpVar2 = a5;
                            StringBuilder sb4 = new StringBuilder();
                            int i7 = i4;
                            ArrayList arrayList4 = new ArrayList();
                            sb4.append("UPDATE OR IGNORE animated_emoji_usage SET usage = ?, last_event_millis = ? WHERE animated_emoji = ? AND truncated_timestamp_millis = ?");
                            String str8 = str;
                            String str9 = str2;
                            Long valueOf2 = Long.valueOf(i6);
                            arrayList4.add(valueOf2);
                            Long valueOf22 = Long.valueOf(j7);
                            arrayList4.add(valueOf22);
                            arrayList4.add(str7);
                            Long valueOf3 = Long.valueOf(j8);
                            arrayList4.add(valueOf3);
                            if (jco.o(jmaVar, kws.m(sb4, arrayList4)) == 0) {
                                ContentValues contentValues = new ContentValues();
                                contentValues.put("animated_emoji", str7);
                                contentValues.put("truncated_timestamp_millis", valueOf3);
                                contentValues.put("last_event_millis", valueOf22);
                                contentValues.put("usage", valueOf2);
                                jco.n(jmaVar, "animated_emoji_usage", contentValues);
                            }
                            i5++;
                            str = str8;
                            a5 = llpVar2;
                            i4 = i7;
                            str2 = str9;
                        }
                        ((ltd) ((ltd) cpl.a.b()).k("com/google/android/apps/inputmethod/libs/expression/history/AnimatedEmojiUsageHistory", str2, 349, "AnimatedEmojiUsageHistory.java")).C(str, jmaVar.d("animated_emoji_usage", "0", String.valueOf(j6)), "animated_emoji_usage");
                    } else {
                        long j9 = l;
                        StringBuilder sb5 = new StringBuilder();
                        ArrayList arrayList5 = new ArrayList();
                        sb5.append("SELECT emoticon, -1 AS truncated_timestamp_millis, MAX(last_event_millis) AS last_event_millis, SUM(shares) AS shares FROM emoticon_shares WHERE truncated_timestamp_millis < ? GROUP BY emoticon");
                        arrayList5.add(Long.valueOf(j9));
                        llp a6 = cqb.a(jmaVar, kws.m(sb5, arrayList5));
                        int i8 = ((lrl) a6).c;
                        int i9 = 0;
                        while (i9 < i8) {
                            cqb cqbVar = (cqb) a6.get(i9);
                            String str10 = cqbVar.a;
                            long j10 = j9;
                            long j11 = cqbVar.c;
                            long j12 = cqbVar.b;
                            int i10 = i8;
                            long j13 = cqbVar.d;
                            StringBuilder sb6 = new StringBuilder();
                            llp llpVar3 = a6;
                            ArrayList arrayList6 = new ArrayList();
                            sb6.append("UPDATE OR IGNORE emoticon_shares SET shares = ?, last_event_millis = ? WHERE emoticon = ? AND truncated_timestamp_millis = ?");
                            arrayList6.add(Long.valueOf(j13));
                            arrayList6.add(Long.valueOf(j11));
                            arrayList6.add(str10);
                            arrayList6.add(Long.valueOf(j12));
                            if (jco.o(jmaVar, kws.m(sb6, arrayList6)) == 0) {
                                jco.n(jmaVar, "emoticon_shares", cqa.b(str10, j12, j11, j13));
                            }
                            i9++;
                            j9 = j10;
                            i8 = i10;
                            a6 = llpVar3;
                        }
                        ((ltd) ((ltd) cqa.a.b()).k("com/google/android/apps/inputmethod/libs/expression/history/EmoticonSharesHistory", str2, 398, "EmoticonSharesHistory.java")).C(str, jmaVar.d("emoticon_shares", "0", String.valueOf(j9)), "emoticon_shares");
                    }
                }
            });
            a4.J(Level.INFO, "Successfully prune emoji shares history older than %d", valueOf);
            a4.H(Level.WARNING, "Failed to prune emoji shares history older than %d", valueOf);
            hiz a5 = a2.c.b.a(new krr() { // from class: cpt
                @Override // defpackage.krr
                public final void a(jma jmaVar) {
                    int i = r3;
                    String str = "Removed %d rows from %s";
                    String str2 = "deleteDataBetween";
                    if (i == 0) {
                        String str3 = str2;
                        long j = l;
                        StringBuilder sb = new StringBuilder();
                        ArrayList arrayList = new ArrayList();
                        sb.append("SELECT emoji, base_variant_emoji, -1 AS truncated_timestamp_millis, MAX(last_event_millis) AS last_event_millis, SUM(shares) AS shares FROM emoji_shares WHERE truncated_timestamp_millis < ? GROUP BY emoji, base_variant_emoji");
                        arrayList.add(Long.valueOf(j));
                        llp a42 = cpw.a(jmaVar, kws.m(sb, arrayList));
                        int i2 = ((lrl) a42).c;
                        int i3 = 0;
                        while (i3 < i2) {
                            cpw cpwVar = (cpw) a42.get(i3);
                            String str4 = cpwVar.a;
                            String str5 = cpwVar.b;
                            long j2 = cpwVar.d;
                            llp llpVar = a42;
                            String str6 = str3;
                            long j3 = cpwVar.c;
                            long j4 = j;
                            long j5 = cpwVar.e;
                            StringBuilder sb2 = new StringBuilder();
                            ArrayList arrayList2 = new ArrayList();
                            sb2.append("UPDATE OR IGNORE emoji_shares SET shares = ?, last_event_millis = ? WHERE emoji = ? AND base_variant_emoji = ? AND truncated_timestamp_millis = ?");
                            arrayList2.add(Long.valueOf(j5));
                            arrayList2.add(Long.valueOf(j2));
                            arrayList2.add(str4);
                            arrayList2.add(str5);
                            arrayList2.add(Long.valueOf(j3));
                            if (jco.o(jmaVar, kws.m(sb2, arrayList2)) == 0) {
                                jco.n(jmaVar, "emoji_shares", cpu.a(str4, str5, j3, j2, j5));
                            }
                            i3++;
                            str3 = str6;
                            a42 = llpVar;
                            j = j4;
                        }
                        ((ltd) ((ltd) cpu.a.b()).k("com/google/android/apps/inputmethod/libs/expression/history/EmojiSharesHistory", str3, 658, "EmojiSharesHistory.java")).C(str, jmaVar.d("emoji_shares", "0", String.valueOf(j)), "emoji_shares");
                    } else if (i == 1) {
                        long j6 = l;
                        StringBuilder sb3 = new StringBuilder();
                        ArrayList arrayList3 = new ArrayList();
                        sb3.append("SELECT animated_emoji, -1 AS truncated_timestamp_millis, MAX(last_event_millis) AS last_event_millis, SUM(usage) AS usage FROM animated_emoji_usage WHERE truncated_timestamp_millis < ? GROUP BY animated_emoji");
                        arrayList3.add(Long.valueOf(j6));
                        llp a52 = cpm.a(jmaVar, kws.m(sb3, arrayList3));
                        int i4 = ((lrl) a52).c;
                        int i5 = 0;
                        while (i5 < i4) {
                            cpm cpmVar = (cpm) a52.get(i5);
                            String str7 = cpmVar.a;
                            long j7 = cpmVar.c;
                            long j8 = cpmVar.b;
                            int i6 = cpmVar.d;
                            llp llpVar2 = a52;
                            StringBuilder sb4 = new StringBuilder();
                            int i7 = i4;
                            ArrayList arrayList4 = new ArrayList();
                            sb4.append("UPDATE OR IGNORE animated_emoji_usage SET usage = ?, last_event_millis = ? WHERE animated_emoji = ? AND truncated_timestamp_millis = ?");
                            String str8 = str;
                            String str9 = str2;
                            Long valueOf2 = Long.valueOf(i6);
                            arrayList4.add(valueOf2);
                            Long valueOf22 = Long.valueOf(j7);
                            arrayList4.add(valueOf22);
                            arrayList4.add(str7);
                            Long valueOf3 = Long.valueOf(j8);
                            arrayList4.add(valueOf3);
                            if (jco.o(jmaVar, kws.m(sb4, arrayList4)) == 0) {
                                ContentValues contentValues = new ContentValues();
                                contentValues.put("animated_emoji", str7);
                                contentValues.put("truncated_timestamp_millis", valueOf3);
                                contentValues.put("last_event_millis", valueOf22);
                                contentValues.put("usage", valueOf2);
                                jco.n(jmaVar, "animated_emoji_usage", contentValues);
                            }
                            i5++;
                            str = str8;
                            a52 = llpVar2;
                            i4 = i7;
                            str2 = str9;
                        }
                        ((ltd) ((ltd) cpl.a.b()).k("com/google/android/apps/inputmethod/libs/expression/history/AnimatedEmojiUsageHistory", str2, 349, "AnimatedEmojiUsageHistory.java")).C(str, jmaVar.d("animated_emoji_usage", "0", String.valueOf(j6)), "animated_emoji_usage");
                    } else {
                        long j9 = l;
                        StringBuilder sb5 = new StringBuilder();
                        ArrayList arrayList5 = new ArrayList();
                        sb5.append("SELECT emoticon, -1 AS truncated_timestamp_millis, MAX(last_event_millis) AS last_event_millis, SUM(shares) AS shares FROM emoticon_shares WHERE truncated_timestamp_millis < ? GROUP BY emoticon");
                        arrayList5.add(Long.valueOf(j9));
                        llp a6 = cqb.a(jmaVar, kws.m(sb5, arrayList5));
                        int i8 = ((lrl) a6).c;
                        int i9 = 0;
                        while (i9 < i8) {
                            cqb cqbVar = (cqb) a6.get(i9);
                            String str10 = cqbVar.a;
                            long j10 = j9;
                            long j11 = cqbVar.c;
                            long j12 = cqbVar.b;
                            int i10 = i8;
                            long j13 = cqbVar.d;
                            StringBuilder sb6 = new StringBuilder();
                            llp llpVar3 = a6;
                            ArrayList arrayList6 = new ArrayList();
                            sb6.append("UPDATE OR IGNORE emoticon_shares SET shares = ?, last_event_millis = ? WHERE emoticon = ? AND truncated_timestamp_millis = ?");
                            arrayList6.add(Long.valueOf(j13));
                            arrayList6.add(Long.valueOf(j11));
                            arrayList6.add(str10);
                            arrayList6.add(Long.valueOf(j12));
                            if (jco.o(jmaVar, kws.m(sb6, arrayList6)) == 0) {
                                jco.n(jmaVar, "emoticon_shares", cqa.b(str10, j12, j11, j13));
                            }
                            i9++;
                            j9 = j10;
                            i8 = i10;
                            a6 = llpVar3;
                        }
                        ((ltd) ((ltd) cqa.a.b()).k("com/google/android/apps/inputmethod/libs/expression/history/EmoticonSharesHistory", str2, 398, "EmoticonSharesHistory.java")).C(str, jmaVar.d("emoticon_shares", "0", String.valueOf(j9)), "emoticon_shares");
                    }
                }
            });
            a5.J(Level.INFO, "Successfully prune animated emoji usage history older than %d", valueOf);
            a5.H(Level.WARNING, "Failed to prune animated emoji usage history older than %d", valueOf);
            hiz f = hiz.L(a3, a4, a5).f();
            afp afpVar = afp.STARTED;
            boolean z = jam.b;
            llk e = llp.e();
            llk e2 = llp.e();
            llk e3 = llp.e();
            e.h(new hiu() { // from class: cqe
                @Override // defpackage.hiu
                public final void a(Object obj) {
                    cqf cqfVar = cqf.this;
                    Void r5 = (Void) obj;
                    cqfVar.b.V("last_pruned_truncated_timestamp", Long.valueOf(l));
                    cqfVar.c.e(ctf.EXPRESSION_DATA_PRUNE_EVENT, ctb.TASK_FINISHED_SUCCESS);
                }
            });
            e2.h(new bxj(this, 10));
            e3.h(new bxj(this, 11));
            f.E(hjg.a(this.e, null, afpVar, z, e, e2, e3));
            return f.v(cex.d, this.e);
        } else {
            this.c.e(ctf.EXPRESSION_DATA_PRUNE_EVENT, ctb.TASK_RESCHEDULED_SCREEN_ON);
            return p;
        }
    }
}
