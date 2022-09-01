package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* renamed from: emk  reason: default package */
/* loaded from: classes.dex */
public final class emk implements idm {
    private static final ltg f = ltg.j("com/google/android/apps/inputmethod/libs/sharing/SharingMetricsProcessor");
    public final Context a;
    public boolean b;
    public boolean c;
    public long d;
    private final idi g;
    private idb i;
    private final nfh h = mbh.aT.t();
    public int e = 3;

    public emk(Context context, idi idiVar) {
        this.a = context;
        this.g = idiVar;
    }

    private static List c(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            hqt hqtVar = (hqt) it.next();
            nfh t = mbw.k.t();
            String str = hqtVar.i().n;
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mbw mbwVar = (mbw) t.b;
            str.getClass();
            mbwVar.a |= 1;
            mbwVar.b = str;
            String p = hqtVar.p();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mbw mbwVar2 = (mbw) t.b;
            mbwVar2.a |= 2;
            mbwVar2.c = p;
            arrayList.add((mbw) t.cz());
        }
        return arrayList;
    }

    private final void d(mbh mbhVar, int i) {
        this.g.f(mbhVar, i, g().c, g().d);
    }

    private final idb g() {
        if (this.i == null) {
            this.i = new eml(this);
        }
        return this.i;
    }

    public final void a(mdu mduVar, mdt mdtVar, Collection collection, int i) {
        nfh t = mdv.f.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mdv mdvVar = (mdv) t.b;
        mdvVar.c = mdtVar.f;
        int i2 = 2;
        int i3 = mdvVar.a | 2;
        mdvVar.a = i3;
        mdvVar.b = mduVar.e;
        mdvVar.a = i3 | 1;
        if (collection != null) {
            List c = c(collection);
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mdv mdvVar2 = (mdv) t.b;
            nga ngaVar = mdvVar2.d;
            if (!ngaVar.c()) {
                mdvVar2.d = nfm.H(ngaVar);
            }
            ndt.cs(c, mdvVar2.d);
        }
        if (i > 0) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mdv mdvVar3 = (mdv) t.b;
            mdvVar3.a |= 4;
            mdvVar3.e = i;
        }
        nfh nfhVar = this.h;
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mbh mbhVar = (mbh) nfhVar.b;
        mdv mdvVar4 = (mdv) t.cz();
        mbh mbhVar2 = mbh.aT;
        mdvVar4.getClass();
        mbhVar.ai = mdvVar4;
        mbhVar.c |= 2097152;
        d((mbh) this.h.cz(), 178);
        mdy mdyVar = mdy.EVENT_UNKNOWN;
        mdx mdxVar = mdx.ENTRYPOINT_UNKNOWN;
        int ordinal = mduVar.ordinal();
        String str = "";
        String str2 = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? str : "LinkReceiving.EnableDialog" : "LinkReceiving.FirstrunDonePage" : "LinkReceiving.EnablePage";
        if (!TextUtils.isEmpty(str2)) {
            int b = ino.M(this.a).b("link_type", 0);
            if (b == 0) {
                str = "Sharing";
            } else if (b == 1) {
                str = "ForumPosting";
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            idi idiVar = this.g;
            String concat = str.concat(str2);
            int ordinal2 = mdtVar.ordinal();
            if (ordinal2 == 1) {
                i2 = 1;
            } else if (ordinal2 != 2) {
                if (ordinal2 == 3) {
                    i2 = 3;
                } else if (ordinal2 != 4) {
                    ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/sharing/SharingMetricsProcessor", "getSharingLinkReceiverEventEnumValue", 345, "SharingMetricsProcessor.java")).u("Unknown event type %d.", mdtVar.f);
                    i2 = -1;
                } else {
                    i2 = 4;
                }
            }
            idiVar.d(concat, i2);
            return;
        }
        ((ltd) ((ltd) f.c()).k("com/google/android/apps/inputmethod/libs/sharing/SharingMetricsProcessor", "processSharingLinkReceivingUsageInternal", 241, "SharingMetricsProcessor.java")).u("processSharingLinkReceivingUsage() : Unknown receiverView %d", mduVar.e);
    }

    public final void b(mdx mdxVar, mdy mdyVar, Collection collection, int i) {
        nfh t = mdz.f.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mdz mdzVar = (mdz) t.b;
        mdzVar.c = mdyVar.f;
        int i2 = 2;
        int i3 = mdzVar.a | 2;
        mdzVar.a = i3;
        mdzVar.b = mdxVar.f;
        mdzVar.a = i3 | 1;
        if (collection != null) {
            List c = c(collection);
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mdz mdzVar2 = (mdz) t.b;
            nga ngaVar = mdzVar2.d;
            if (!ngaVar.c()) {
                mdzVar2.d = nfm.H(ngaVar);
            }
            ndt.cs(c, mdzVar2.d);
        }
        if (i > 0) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mdz mdzVar3 = (mdz) t.b;
            mdzVar3.a |= 4;
            mdzVar3.e = i;
        }
        nfh nfhVar = this.h;
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mbh mbhVar = (mbh) nfhVar.b;
        mdz mdzVar4 = (mdz) t.cz();
        mbh mbhVar2 = mbh.aT;
        mdzVar4.getClass();
        mbhVar.ah = mdzVar4;
        mbhVar.c |= 1048576;
        d((mbh) this.h.cz(), 177);
        mdt mdtVar = mdt.EVENT_UNKNOWN;
        mdu mduVar = mdu.VIEW_UNKNOWN;
        int ordinal = mdxVar.ordinal();
        String str = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? "" : "Sharing.ReceivePage" : "Sharing.SuggestionBar" : "Sharing.AccessPoint" : "Sharing.Settings";
        if (TextUtils.isEmpty(str)) {
            ((ltd) ((ltd) f.c()).k("com/google/android/apps/inputmethod/libs/sharing/SharingMetricsProcessor", "processSharingUsageInternal", 176, "SharingMetricsProcessor.java")).u("processSharingUsage() : Unknown entrypoint %d", mdxVar.f);
            return;
        }
        idi idiVar = this.g;
        int ordinal2 = mdyVar.ordinal();
        if (ordinal2 == 1) {
            i2 = 1;
        } else if (ordinal2 != 2) {
            if (ordinal2 == 3) {
                i2 = 3;
            } else if (ordinal2 != 4) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/sharing/SharingMetricsProcessor", "getSharingEventEnumValue", 305, "SharingMetricsProcessor.java")).u("Unknown event type %d.", mdyVar.f);
                i2 = -1;
            } else {
                i2 = 4;
            }
        }
        idiVar.d(str, i2);
    }

    @Override // defpackage.idj
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.idj
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.idm
    public final void p(ido idoVar, idu iduVar, long j, long j2, Object... objArr) {
        this.d = j;
        g().b(idoVar, iduVar, j, j2, objArr);
    }

    @Override // defpackage.idm
    public final /* synthetic */ void r(idl idlVar) {
    }

    @Override // defpackage.idj
    public final /* synthetic */ boolean s() {
        return true;
    }

    @Override // defpackage.idm
    public final ido[] t() {
        g();
        return eml.a;
    }
}
