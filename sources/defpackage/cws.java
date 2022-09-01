package defpackage;

import j$.util.Objects;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: cws  reason: default package */
/* loaded from: classes.dex */
public final class cws {
    public final cuh f;
    public volatile cwt g = cwt.a;
    private final cxm i;
    private final mkr j;
    private final mks k;
    private static final lfy h = lfy.c(',').b().h();
    public static final hhl a = hhq.a("enable_header_featured_pack", false);
    public static final hhl b = hhq.a("enable_browse_featured_pack", false);
    public static final hhl c = hhq.h("featured_category_sticker_pack_id_override", "");
    public static final hhl d = hhq.h("featured_browse_sticker_pack_ids_override", "");
    public static final hhl e = hhq.f("featured_recommendations_max_recommended", 0);

    public cws(cuh cuhVar, cxm cxmVar, mkr mkrVar, mks mksVar) {
        this.f = cuhVar;
        this.i = cxmVar;
        this.j = mkrVar;
        this.k = mksVar;
    }

    public static cwt a(int i, llp llpVar) {
        lfb o;
        if (!((Boolean) a.c()).booleanValue()) {
            o = ldu.a;
        } else {
            o = dip.o((String) c.c());
            if (!o.e() && !llpVar.isEmpty()) {
                o = lfb.g((String) llpVar.get(0));
            }
        }
        return cwt.a(i, o, !((Boolean) b.c()).booleanValue() ? ldu.a : dip.n(llpVar));
    }

    public final hiz b(final mko mkoVar, final dpe dpeVar) {
        hiz u;
        hiz c2;
        if (hsu.f()) {
            c2 = hiz.n(cwt.a);
        } else {
            String str = (String) d.c();
            if (!str.isEmpty()) {
                c2 = hiz.n(a(1, llp.o(h.k(str))));
            } else {
                final int intValue = ((Long) e.c()).intValue();
                if (intValue <= 0) {
                    c2 = hiz.n(cwt.a);
                } else {
                    cxm cxmVar = this.i;
                    if (!((Boolean) cxm.a.c()).booleanValue()) {
                        u = hiz.n(lrr.a);
                    } else {
                        u = hiz.k(cxmVar.c.c.a()).u(cuv.l, cxmVar.d);
                    }
                    final hiz hizVar = u;
                    c2 = hiz.M(mkoVar, hizVar).e(new mix(mkoVar, dpeVar, hizVar, intValue, null, null) { // from class: cwr
                        public final /* synthetic */ mko b;
                        public final /* synthetic */ hiz c;
                        public final /* synthetic */ int d;
                        public final /* synthetic */ dpe e;

                        @Override // defpackage.mix
                        public final mko a() {
                            hiz u2;
                            cws cwsVar = cws.this;
                            mko mkoVar2 = this.b;
                            dpe dpeVar2 = this.e;
                            hiz hizVar2 = this.c;
                            final int i = this.d;
                            llp p = fgy.p((Iterable) kcu.S(mkoVar2), cuv.i);
                            Objects.requireNonNull(dpeVar2);
                            final llp i2 = llp.i(fhr.x((Iterable) kcu.S(mkoVar2), new cjm(dpeVar2, 8, null, null), cuv.i));
                            cuh cuhVar = cwsVar.f;
                            final llp n = fgy.n(p, new cjm((lmz) kcu.S(hizVar2), 9));
                            cue cueVar = cuhVar.h;
                            long currentTimeMillis = System.currentTimeMillis();
                            if (hji.d(cueVar.c) || currentTimeMillis >= cueVar.a || cueVar.b != i) {
                                final hiz hizVar3 = cuhVar.a().a;
                                das dasVar = cuhVar.g;
                                if (((Boolean) das.a.c()).booleanValue()) {
                                    u2 = hiz.k(dasVar.c.a()).u(dar.a, dasVar.b);
                                } else {
                                    u2 = hiz.n(lrq.b);
                                }
                                final hiz hizVar4 = u2;
                                mko a2 = kcu.Z(hizVar3, hizVar4).a(new Callable() { // from class: cud
                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        mko mkoVar3 = mko.this;
                                        hiz hizVar5 = hizVar3;
                                        List<String> list = i2;
                                        List<String> list2 = n;
                                        int i3 = i;
                                        llw llwVar = (llw) kcu.S(mkoVar3);
                                        dpe dpeVar3 = (dpe) kcu.S(hizVar5);
                                        float floatValue = ((Double) cuh.d.c()).floatValue();
                                        lls llsVar = new lls();
                                        float floatValue2 = ((Double) cuh.c.c()).floatValue();
                                        float f = 1.0f;
                                        for (String str2 : list) {
                                            llsVar.a(str2, Float.valueOf(f));
                                            f *= floatValue2;
                                        }
                                        llw l = llsVar.l();
                                        TreeSet treeSet = new TreeSet(xr.f);
                                        for (String str3 : list2) {
                                            if (!l.containsKey(str3)) {
                                                float j = (dpeVar3.j(str3, l) * ((Double) cuh.b.c()).floatValue()) + (dpeVar3.j(str3, llwVar) * ((Double) cuh.a.c()).floatValue());
                                                if (j > floatValue) {
                                                    treeSet.add(new cuf(str3, Float.valueOf(j)));
                                                }
                                                if (treeSet.size() > i3) {
                                                    treeSet.pollFirst();
                                                }
                                            }
                                        }
                                        return fgy.p(treeSet.descendingSet(), cli.t);
                                    }
                                }, cuhVar.f);
                                cuhVar.h = new cue(System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(((Long) cuh.e.c()).longValue()), i, a2);
                                return a2;
                            }
                            return cuhVar.h.c;
                        }
                    }, this.j).u(cuv.j, this.j).w(2L, TimeUnit.SECONDS, this.k).c(cwt.a);
                }
            }
        }
        return c2.u(new cus(this, 3), mjl.a).w(cva.e, TimeUnit.MILLISECONDS, this.k);
    }
}
