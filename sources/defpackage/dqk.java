package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: dqk  reason: default package */
/* loaded from: classes.dex */
public final class dqk extends idb {
    public static final ido[] a = {ifs.MIGRATION_LINK_RECEIVING_USAGE};
    private static final ltg f = ltg.j("com/google/android/apps/inputmethod/libs/migration/MigrationMetricsProcessorHelper");
    private final dqj g;

    public dqk(dqj dqjVar) {
        this.g = dqjVar;
    }

    @Override // defpackage.idb
    protected final boolean a(ido idoVar, Object[] objArr) {
        int i;
        int i2 = 0;
        if (ifs.MIGRATION_LINK_RECEIVING_USAGE == idoVar) {
            dqj dqjVar = this.g;
            mcn mcnVar = (mcn) objArr[0];
            mcp mcpVar = (mcp) objArr[1];
            List<hqt> list = (List) objArr[2];
            nfh t = mcq.e.t();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mcq mcqVar = (mcq) t.b;
            mcqVar.c = mcnVar.d;
            int i3 = mcqVar.a | 4;
            mcqVar.a = i3;
            mcqVar.b = mcpVar.e;
            mcqVar.a = i3 | 1;
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (hqt hqtVar : list) {
                    String str = hqtVar.i().n;
                    String p = hqtVar.p();
                    nfh t2 = mbw.k.t();
                    if (t2.c) {
                        t2.cD();
                        t2.c = false;
                    }
                    mbw mbwVar = (mbw) t2.b;
                    str.getClass();
                    int i4 = mbwVar.a | 1;
                    mbwVar.a = i4;
                    mbwVar.b = str;
                    mbwVar.a = i4 | 2;
                    mbwVar.c = p;
                    arrayList.add((mbw) t2.cz());
                }
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                mcq mcqVar2 = (mcq) t.b;
                nga ngaVar = mcqVar2.d;
                if (!ngaVar.c()) {
                    mcqVar2.d = nfm.H(ngaVar);
                }
                ndt.cs(arrayList, mcqVar2.d);
            }
            nfh nfhVar = dqjVar.c;
            if (nfhVar.c) {
                nfhVar.cD();
                nfhVar.c = false;
            }
            mbh mbhVar = (mbh) nfhVar.b;
            mcq mcqVar3 = (mcq) t.cz();
            mbh mbhVar2 = mbh.aT;
            mcqVar3.getClass();
            mbhVar.am = mcqVar3;
            mbhVar.c |= 134217728;
            dqjVar.b.f((mbh) dqjVar.c.cz(), 196, dqjVar.a().c, dqjVar.a().d);
            int ordinal = mcpVar.ordinal();
            String str2 = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? "" : "Indic" : "Japanese" : "Handwriting";
            if (str2.isEmpty()) {
                ((ltd) ((ltd) dqj.a.c()).k("com/google/android/apps/inputmethod/libs/migration/MigrationMetricsProcessor", "processMigrationLinkReceivingUsage", 102, "MigrationMetricsProcessor.java")).u("processMigrationLinkReceivingUsage() : Unknown source IME %d", mcpVar.e);
            } else {
                String concat = "MigrationCompleted.".concat(str2);
                idi idiVar = dqjVar.b;
                int ordinal2 = mcnVar.ordinal();
                if (ordinal2 == 1) {
                    i = 1;
                } else if (ordinal2 != 2) {
                    ((ltd) dqj.a.a(hip.a).k("com/google/android/apps/inputmethod/libs/migration/MigrationMetricsProcessor", "getMigrationCompletedAnchorViewEnumValue", 177, "MigrationMetricsProcessor.java")).u("Unknown migration completed anchor view type %d.", mcnVar.d);
                    i = 0;
                } else {
                    i = 2;
                }
                idiVar.d(concat, i);
                String concat2 = concat.concat(".UserType");
                idi idiVar2 = dqjVar.b;
                if (!gva.d()) {
                    i2 = 2;
                } else if (gva.b() != 1) {
                    i2 = 1;
                }
                idiVar2.d(concat2, i2);
            }
            return true;
        }
        ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/migration/MigrationMetricsProcessorHelper", "doProcessMetrics", 32, "MigrationMetricsProcessorHelper.java")).w("unhandled metricsType: %s", idoVar);
        return false;
    }
}
