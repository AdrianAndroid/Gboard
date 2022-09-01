package defpackage;

import android.text.TextUtils;
import java.util.regex.Matcher;

/* compiled from: PG */
/* renamed from: dab  reason: default package */
/* loaded from: classes.dex */
public final class dab implements idm {
    public final ixj a;
    public final hso b;
    public final idb c = new dac(this);

    public dab(ixj ixjVar, hso hsoVar) {
        this.a = ixjVar;
        this.b = hsoVar;
    }

    public final void a(int i, String str, String str2, mbc mbcVar) {
        bxd q = ffb.q();
        String str3 = "";
        String d = q.e() ? q.d(((Long) dad.a.c()).intValue()) : str3;
        bxd q2 = ffb.q();
        long j = this.c.c;
        hso hsoVar = this.b;
        nfh b = dad.b(j, hsoVar);
        if (!TextUtils.isEmpty(d)) {
            b.eQ("conv2query/words", mhb.o(q2.a(d.toLowerCase(hqp.e()))));
        }
        if (!TextUtils.isEmpty(str2)) {
            b.eQ("conv2query/suggested_query", mhb.n(str2.replaceAll("\\s+", " ").toLowerCase(hqp.e())));
        }
        if (mbcVar != null) {
            int e = lxj.e(mbcVar.b);
            if (e == 0) {
                e = 1;
            }
            b.eQ("conv2query/share_tab", mhb.l(e - 1));
            int n = lwm.n(mbcVar.c);
            if (n == 0) {
                n = 1;
            }
            b.eQ("conv2query/share_source", mhb.l(n - 1));
            int f = lxj.f(mbcVar.l);
            if (f == 0) {
                f = 1;
            }
            b.eQ("conv2query/share_suggestion_source", mhb.l(f - 1));
        }
        int i2 = i - 1;
        if (i2 == 0) {
            b.eQ("conv2query/sticker_urls", mhb.n(str));
            Matcher matcher = dad.c.matcher(str);
            if (matcher.find() && matcher.groupCount() > 0) {
                str3 = matcher.group(1);
            }
            if (!TextUtils.isEmpty(str3)) {
                b.eQ("conv2query/sticker_packs", mhb.n(str3));
            }
            if (mbcVar != null && (mbcVar.a & 128) != 0) {
                mbs mbsVar = mbcVar.h;
                if (mbsVar == null) {
                    mbsVar = mbs.h;
                }
                if ((mbsVar.a & 16) != 0) {
                    mbr b2 = mbr.b(mbsVar.f);
                    if (b2 == null) {
                        b2 = mbr.UNKNOWN_CONTENT_TYPE;
                    }
                    b.eQ("conv2query/sticker_content_type", mhb.l(b2.l));
                }
                if ((mbsVar.a & 1) != 0) {
                    b.eQ("conv2query/sticker_position", mhb.l(mbsVar.b));
                }
                if ((mbsVar.a & 32) != 0) {
                    mbp mbpVar = mbsVar.g;
                    if (mbpVar == null) {
                        mbpVar = mbp.e;
                    }
                    if ((1 & mbpVar.a) != 0) {
                        b.eQ("conv2query/concept_to_generate_sticker", mhb.n(mbpVar.b));
                    }
                    if ((mbpVar.a & 2) != 0) {
                        b.eQ("conv2query/keyword_to_generate_sticker", mhb.n(mbpVar.c));
                    }
                    if ((mbpVar.a & 4) != 0) {
                        b.eQ("conv2query/emoji_to_generate_sticker", mhb.n(mbpVar.d));
                    }
                }
            }
        } else if (i2 == 1) {
            b.eQ("conv2query/gif_urls", mhb.n(str));
        } else if (i2 != 2) {
            b.eQ("conv2query/emoticon", mhb.n(str));
        } else {
            b.eQ("conv2query/emoji", mhb.n(str));
        }
        jav c = hqp.c();
        nfh t = oxo.b.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        oxr oxrVar = (oxr) b.cz();
        oxrVar.getClass();
        ((oxo) t.b).a = oxrVar;
        this.a.n(iuy.b, dad.a((oxo) t.cz(), j, c != null ? c.n : null, jam.e(hsoVar.getApplicationContext())), null, this.c.c, 0L);
    }

    @Override // defpackage.idj
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.idj
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.idm
    public final void p(ido idoVar, idu iduVar, long j, long j2, Object... objArr) {
        if (!irs.d()) {
            return;
        }
        this.c.b(idoVar, iduVar, j, j2, objArr);
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
        return dac.a;
    }
}
