package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: dac  reason: default package */
/* loaded from: classes.dex */
public final class dac extends idb {
    public static final ido[] a = {cta.EMOJIFY_RESULTS_GENERATED, cta.EMOJIFY_RESULT_ACCEPTED, ctd.EMOJI_OR_TEXT_SHARE, ctd.IMAGE_SHARE, ctd.IMPRESSION};
    private static final ltg f = ltg.j("com/google/android/apps/inputmethod/libs/expression/trainingcache/processor/ExpressionTrainingCacheMetricsProcessorHelper");
    private final dab g;

    public dac(dab dabVar) {
        this.g = dabVar;
    }

    @Override // defpackage.idb
    protected final boolean a(ido idoVar, Object[] objArr) {
        if (cta.EMOJIFY_RESULTS_GENERATED == idoVar) {
            dab dabVar = this.g;
            ixj ixjVar = dabVar.a;
            iuy iuyVar = iuy.b;
            hso hsoVar = dabVar.b;
            long j = dabVar.c.c;
            nfh b = dad.b(j, hsoVar);
            b.eQ("conv2query/emojify_generation_request_input", mhb.n(((maz) objArr[0]).i));
            jav c = hqp.c();
            nfh t = oxo.b.t();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            oxr oxrVar = (oxr) b.cz();
            oxrVar.getClass();
            ((oxo) t.b).a = oxrVar;
            ixjVar.n(iuyVar, dad.a((oxo) t.cz(), j, c != null ? c.n : null, jam.e(hsoVar.getApplicationContext())), null, dabVar.c.c, 0L);
            return true;
        } else if (cta.EMOJIFY_RESULT_ACCEPTED == idoVar) {
            dab dabVar2 = this.g;
            ixj ixjVar2 = dabVar2.a;
            iuy iuyVar2 = iuy.b;
            hso hsoVar2 = dabVar2.b;
            long j2 = dabVar2.c.c;
            nfh b2 = dad.b(j2, hsoVar2);
            b2.eQ("conv2query/emojify_accept_request_input", mhb.n(((maz) objArr[0]).i));
            jav c2 = hqp.c();
            nfh t2 = oxo.b.t();
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            oxr oxrVar2 = (oxr) b2.cz();
            oxrVar2.getClass();
            ((oxo) t2.b).a = oxrVar2;
            ixjVar2.n(iuyVar2, dad.a((oxo) t2.cz(), j2, c2 != null ? c2.n : null, jam.e(hsoVar2.getApplicationContext())), null, dabVar2.c.c, 0L);
            return true;
        } else {
            int i = 2;
            if (ctd.EMOJI_OR_TEXT_SHARE == idoVar) {
                dab dabVar3 = this.g;
                String str = (String) objArr[0];
                mbc mbcVar = (mbc) objArr[1];
                if (TextUtils.isEmpty(str)) {
                    return true;
                }
                mdl mdlVar = mbcVar.k;
                if (mdlVar == null) {
                    mdlVar = mdl.h;
                }
                int i2 = lxj.i(mdlVar.b);
                if (i2 == 0) {
                    i2 = 1;
                }
                int i3 = i2 - 1;
                if (i3 == 1) {
                    dabVar3.a(3, str, mbcVar.j, mbcVar);
                    return true;
                } else if (i3 != 2) {
                    return true;
                } else {
                    mbb mbbVar = mbcVar.e;
                    if (mbbVar == null) {
                        mbbVar = mbb.g;
                    }
                    dabVar3.a(4, str, mbbVar.b, mbcVar);
                    return true;
                }
            } else if (ctd.IMAGE_SHARE == idoVar) {
                dab dabVar4 = this.g;
                mbc mbcVar2 = (mbc) objArr[0];
                cqp cqpVar = ((crc) objArr[1]).a;
                String uri = cqpVar.d().toString();
                String str2 = mbcVar2.j;
                mbb mbbVar2 = mbcVar2.e;
                if (mbbVar2 == null) {
                    mbbVar2 = mbb.g;
                }
                String str3 = mbbVar2.b;
                if (cqpVar.x()) {
                    dabVar4.a(1, uri, str2, mbcVar2);
                }
                if (!cqpVar.v()) {
                    return true;
                }
                if (true == TextUtils.isEmpty(str2)) {
                    str2 = str3;
                }
                dabVar4.a(2, uri, str2, mbcVar2);
                return true;
            } else if (ctd.IMPRESSION == idoVar) {
                dab dabVar5 = this.g;
                mbc mbcVar3 = (mbc) objArr[0];
                int n = lwm.n(mbcVar3.c);
                if (n == 0 || n != 16) {
                    return true;
                }
                ixj ixjVar3 = dabVar5.a;
                iuy iuyVar3 = iuy.b;
                hso hsoVar3 = dabVar5.b;
                long j3 = dabVar5.c.c;
                nfh b3 = dad.b(j3, hsoVar3);
                int e = lxj.e(mbcVar3.b);
                if (e == 0) {
                    e = 1;
                }
                b3.eQ("conv2query/impression_tab", mhb.l(e - 1));
                int n2 = lwm.n(mbcVar3.c);
                if (n2 == 0) {
                    n2 = 1;
                }
                b3.eQ("conv2query/impression_source", mhb.l(n2 - 1));
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                Iterator it = mbcVar3.o.iterator();
                while (it.hasNext()) {
                    mbt mbtVar = (mbt) it.next();
                    Iterator it2 = it;
                    if ((mbtVar.a & i) != 0) {
                        int d = lwm.d(mbtVar.c);
                        if (d == 0) {
                            d = 1;
                        }
                        hso hsoVar4 = hsoVar3;
                        arrayList.add(Long.valueOf(d - 1));
                        mbq mbqVar = mbtVar.d;
                        if (mbqVar == null) {
                            mbqVar = mbq.e;
                        }
                        arrayList2.add(mbqVar.c);
                        arrayList3.add(Long.valueOf(mbqVar.b));
                        mbp mbpVar = mbqVar.d;
                        if (mbpVar == null) {
                            mbpVar = mbp.e;
                        }
                        arrayList4.add(mbpVar.b);
                        mbp mbpVar2 = mbqVar.d;
                        if (mbpVar2 == null) {
                            mbpVar2 = mbp.e;
                        }
                        arrayList5.add(mbpVar2.c);
                        mbp mbpVar3 = mbqVar.d;
                        if (mbpVar3 == null) {
                            mbpVar3 = mbp.e;
                        }
                        arrayList6.add(mbpVar3.d);
                        it = it2;
                        hsoVar3 = hsoVar4;
                        i = 2;
                    } else {
                        it = it2;
                    }
                }
                hso hsoVar5 = hsoVar3;
                b3.eQ("conv2query/impression_sticker_types", mhb.m(arrayList));
                b3.eQ("conv2query/impression_sticker_urls", mhb.o(arrayList2));
                b3.eQ("conv2query/impression_sticker_positions", mhb.m(arrayList3));
                b3.eQ("conv2query/impression_concepts_to_generate_sticker", mhb.o(arrayList4));
                b3.eQ("conv2query/impression_keywords_to_generate_sticker", mhb.o(arrayList5));
                b3.eQ("conv2query/impression_emojis_to_generate_sticker", mhb.o(arrayList6));
                jav c3 = hqp.c();
                nfh t3 = oxo.b.t();
                if (t3.c) {
                    t3.cD();
                    t3.c = false;
                }
                oxr oxrVar3 = (oxr) b3.cz();
                oxrVar3.getClass();
                ((oxo) t3.b).a = oxrVar3;
                ixjVar3.n(iuyVar3, dad.a((oxo) t3.cz(), j3, c3 != null ? c3.n : null, jam.e(hsoVar5.getApplicationContext())), null, dabVar5.c.c, 0L);
                return true;
            } else {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/trainingcache/processor/ExpressionTrainingCacheMetricsProcessorHelper", "doProcessMetrics", 44, "ExpressionTrainingCacheMetricsProcessorHelper.java")).w("unhandled metricsType: %s", idoVar);
                return false;
            }
        }
    }
}
