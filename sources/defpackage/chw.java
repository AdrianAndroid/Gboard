package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Printer;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* renamed from: chw  reason: default package */
/* loaded from: classes.dex */
public final class chw implements chv, gvl {
    private final chx a;

    public chw(chx chxVar) {
        this.a = chxVar;
    }

    @Override // defpackage.gvl
    public final String c() {
        return "expression_history";
    }

    @Override // defpackage.gvl
    public final String d() {
        return "expression_history";
    }

    @Override // defpackage.gzv
    public final /* synthetic */ void dump(Printer printer, boolean z) {
    }

    @Override // defpackage.gvl
    public final void e(gvk gvkVar) {
        hiz u;
        hiz u2;
        hiz u3;
        ieh.j().e(chu.BACKUP_ATTEMPT, new Object[0]);
        chx chxVar = this.a;
        if (!((Boolean) cht.g.c()).booleanValue()) {
            u = hiz.n(chk.b);
        } else {
            chs chsVar = (chs) chxVar;
            cpu cpuVar = chsVar.c.b;
            iqx iqxVar = cpuVar.b;
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList = new ArrayList();
            sb.append("SELECT emoji, base_variant_emoji, -1 AS truncated_timestamp_millis, MAX(last_event_millis) AS last_event_millis, SUM(shares) AS shares FROM emoji_shares GROUP BY emoji, base_variant_emoji");
            u = iqxVar.b(kws.m(sb, arrayList), cps.a, cpuVar.b.b).u(bou.h, chsVar.a);
        }
        hiz hizVar = u;
        if (!((Boolean) cht.f.c()).booleanValue()) {
            u2 = hiz.n(chm.b);
        } else {
            chs chsVar2 = (chs) chxVar;
            cqa cqaVar = chsVar2.c.a;
            iqx iqxVar2 = cqaVar.b;
            StringBuilder sb2 = new StringBuilder();
            ArrayList arrayList2 = new ArrayList();
            sb2.append("SELECT emoticon, -1 AS truncated_timestamp_millis, MAX(last_event_millis) AS last_event_millis, SUM(shares) AS shares FROM emoticon_shares GROUP BY emoticon");
            u2 = iqxVar2.b(kws.m(sb2, arrayList2), cps.e, cqaVar.b.b).u(bou.g, chsVar2.a);
        }
        hiz hizVar2 = u2;
        if (!((Boolean) cht.b.c()).booleanValue()) {
            u3 = hiz.n(cho.b);
        } else {
            chs chsVar3 = (chs) chxVar;
            u3 = hiz.k(chsVar3.d.k(2)).u(bou.i, chsVar3.a);
        }
        hiz hizVar3 = u3;
        ArrayList arrayList3 = new ArrayList();
        if (((Boolean) cht.b.c()).booleanValue()) {
            arrayList3.add(((chs) chxVar).b(3));
        }
        if (((Boolean) cht.e.c()).booleanValue()) {
            arrayList3.add(((chs) chxVar).b(4));
        }
        if (((Boolean) cht.c.c()).booleanValue()) {
            arrayList3.add(((chs) chxVar).b(2));
        }
        if (((Boolean) cht.d.c()).booleanValue()) {
            arrayList3.add(((chs) chxVar).b(5));
        }
        hiz n = hiz.n(arrayList3);
        chs chsVar4 = (chs) chxVar;
        try {
            File file = (File) hiz.M(hizVar, hizVar2, hizVar3, n).d(new eid(hizVar, hizVar2, hizVar3, n, 1), chsVar4.a).s(new cij(chsVar4, 1), chsVar4.a).get(100L, TimeUnit.SECONDS);
            try {
                gvkVar.b("expression_history", "expression_history_backup", file);
                ieh.j().e(chu.FILE_BACKUP_SUCCESS, chs.a(file));
            } finally {
                jan.b.e(file);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IOException("Fail to retrieve proto file due to time out.", e);
        } catch (ExecutionException e2) {
            e = e2;
            throw new IOException("Fail to retrieve proto file due to time out.", e);
        } catch (TimeoutException e3) {
            e = e3;
            throw new IOException("Fail to retrieve proto file due to time out.", e);
        }
    }

    @Override // defpackage.gvj
    public final /* synthetic */ boolean f(boolean z, boolean z2) {
        return hgw.h(z, z2);
    }

    @Override // defpackage.gvl
    public final Collection g(Map map) {
        File file;
        cri b;
        ieh.j().e(chu.RESTORE_ATTEMPT, new Object[0]);
        ArrayList arrayList = new ArrayList();
        File file2 = (File) map.get("expression_history_backup");
        if (file2 != null) {
            chx chxVar = this.a;
            chn chnVar = (chn) jan.b.a(file2, (nhf) chn.f.N(7));
            if (chnVar != null) {
                if ((chnVar.a & 2) != 0) {
                    chk chkVar = chnVar.c;
                    if (chkVar == null) {
                        chkVar = chk.b;
                    }
                    nga ngaVar = chkVar.a;
                    llk e = llp.e();
                    for (Iterator it = ngaVar.iterator(); it.hasNext(); it = it) {
                        chj chjVar = (chj) it.next();
                        e.h(new cpw(chjVar.b, chjVar.c, chjVar.d, chjVar.e, chjVar.f));
                        file2 = file2;
                    }
                    file = file2;
                    cpu cpuVar = ((chs) chxVar).c.b;
                    final llp g = e.g();
                    cpuVar.b.a(new krr() { // from class: cpy
                        @Override // defpackage.krr
                        public final void a(jma jmaVar) {
                            int i = 0;
                            if (r2 != 0) {
                                llp llpVar = g;
                                int i2 = ((lrl) llpVar).c;
                                while (i < i2) {
                                    cpw cpwVar = (cpw) llpVar.get(i);
                                    cpu.d(jmaVar, cpwVar.a, cpwVar.b, cpwVar.d, cpwVar.c, cpwVar.e);
                                    i++;
                                }
                                return;
                            }
                            llp llpVar2 = g;
                            int i3 = ((lrl) llpVar2).c;
                            while (i < i3) {
                                cqb cqbVar = (cqb) llpVar2.get(i);
                                cqa.e(jmaVar, cqbVar.a, cqbVar.c, cqbVar.b, cqbVar.d);
                                i++;
                            }
                        }
                    });
                } else {
                    file = file2;
                }
                if ((chnVar.a & 4) != 0) {
                    chm chmVar = chnVar.d;
                    if (chmVar == null) {
                        chmVar = chm.b;
                    }
                    nga<chl> ngaVar2 = chmVar.a;
                    llk e2 = llp.e();
                    for (chl chlVar : ngaVar2) {
                        e2.h(new cqb(chlVar.b, chlVar.c, chlVar.d, chlVar.e));
                    }
                    cqa cqaVar = ((chs) chxVar).c.a;
                    final llp g2 = e2.g();
                    cqaVar.b.a(new krr() { // from class: cpy
                        @Override // defpackage.krr
                        public final void a(jma jmaVar) {
                            int i = 0;
                            if (r2 != 0) {
                                llp llpVar = g2;
                                int i2 = ((lrl) llpVar).c;
                                while (i < i2) {
                                    cpw cpwVar = (cpw) llpVar.get(i);
                                    cpu.d(jmaVar, cpwVar.a, cpwVar.b, cpwVar.d, cpwVar.c, cpwVar.e);
                                    i++;
                                }
                                return;
                            }
                            llp llpVar2 = g2;
                            int i3 = ((lrl) llpVar2).c;
                            while (i < i3) {
                                cqb cqbVar = (cqb) llpVar2.get(i);
                                cqa.e(jmaVar, cqbVar.a, cqbVar.c, cqbVar.b, cqbVar.d);
                                i++;
                            }
                        }
                    });
                }
                if ((chnVar.a & 1) != 0) {
                    cho choVar = chnVar.b;
                    if (choVar == null) {
                        choVar = cho.b;
                    }
                    dpe dpeVar = ((chs) chxVar).f;
                    for (String str : choVar.a) {
                        ((kcq) dpeVar.b).c(str, true, false);
                    }
                }
                if (chnVar.e.size() > 0) {
                    for (chq chqVar : chnVar.e) {
                        int p = efq.p(chqVar.b);
                        if (p == 0) {
                            p = 1;
                        }
                        nga<chp> ngaVar3 = chqVar.c;
                        int i = p - 1;
                        if (i == 1) {
                            b = cri.b(((chs) chxVar).e, "recent_gifs_shared");
                        } else if (i == 2) {
                            b = cri.b(((chs) chxVar).e, "recent_sticker_shared");
                        } else if (i == 3) {
                            b = cri.b(((chs) chxVar).e, "recent_bitmoji_shared");
                        } else if (i == 4) {
                            b = cri.b(((chs) chxVar).e, "recent_content_suggestion_shared");
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (chp chpVar : ngaVar3) {
                            cqo t = cqp.t();
                            t.n(chpVar.b);
                            t.f(chpVar.c);
                            t.h(Uri.parse(chpVar.d));
                            t.b = chpVar.e;
                            t.c = chpVar.f;
                            t.f = chpVar.g;
                            t.l(chpVar.h);
                            t.g(chpVar.i);
                            mbr b2 = mbr.b(chpVar.j);
                            if (b2 == null) {
                                b2 = mbr.UNKNOWN_CONTENT_TYPE;
                            }
                            t.e(b2);
                            arrayList2.add(t.a());
                        }
                        b.j(arrayList2);
                    }
                }
            } else {
                file = file2;
            }
            arrayList.add("expression_history_backup");
            ieh.j().e(chu.FILE_RESTORED_SUCCESS, chs.a(file));
        }
        return arrayList;
    }

    @Override // defpackage.gzv
    public final /* synthetic */ String getDumpableTag() {
        return hqs.i(this);
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
    }

    @Override // defpackage.ifw
    public final void gn() {
    }
}
