package defpackage;

import android.content.Context;
import com.google.android.inputmethod.latin.R;
import j$.util.Collection$EL;
import java.util.List;
import java.util.Random;

/* compiled from: PG */
/* renamed from: cio  reason: default package */
/* loaded from: classes.dex */
public final class cio extends cih {
    private final Context a;
    private final cke b;
    private final ckm c;
    private final idk d;
    private final Random e;
    private final cip f;

    public cio(Context context, cke ckeVar, ckm ckmVar, idk idkVar, Random random, cip cipVar) {
        this.a = context;
        this.b = ckeVar;
        this.c = ckmVar;
        this.d = idkVar;
        this.e = random;
        this.f = cipVar;
    }

    private final llp i(String str, List list) {
        llp c = this.c.c(str);
        if (!c.isEmpty()) {
            llp n = fgy.n(c, new cjm(list, 1));
            if (!n.isEmpty()) {
                return n;
            }
            c.size();
            this.d.e(ciu.CONTENT_CACHE_RESPONSE, 4);
            return llp.q();
        }
        this.d.e(ciu.CONTENT_CACHE_RESPONSE, 3);
        return llp.q();
    }

    @Override // defpackage.cih
    public final lfb b(List list, mse mseVar) {
        llp i = i((String) this.f.a.a(mseVar), list);
        return i.isEmpty() ? ldu.a : h(mseVar, (cqp) eju.k(this.e, i));
    }

    @Override // defpackage.cih
    public final llp d(List list, mse mseVar) {
        return (llp) Collection$EL.stream(i((String) this.f.a.a(mseVar), list)).map(new cig(this, mseVar, 3)).filter(ccj.e).map(byw.k).collect(ljr.a);
    }

    @Override // defpackage.cka
    public final ckc e() {
        return this.f.c;
    }

    @Override // defpackage.cka
    public final boolean f(mse mseVar) {
        int i = this.f.d;
        int b = msc.b(mseVar.c);
        if (b == 0) {
            b = 1;
        }
        return i == b;
    }

    @Override // defpackage.cka
    public final boolean g(List list) {
        if ((this.f.d != 20 || !((Boolean) cit.m.c()).booleanValue()) && ((this.f.d != 18 || !((Boolean) cit.k.c()).booleanValue()) && !j())) {
            return false;
        }
        if (!this.c.d()) {
            return true;
        }
        this.d.e(ciu.CONTENT_CACHE_RESPONSE, 2);
        return false;
    }

    public final lfb h(mse mseVar, cqp cqpVar) {
        cqo h = cqpVar.h();
        if (this.f.b.e()) {
            h.e((mbr) this.f.b.a());
        }
        if (j()) {
            h.f = this.a.getString(R.string.f150850_resource_name_obfuscated_res_0x7f1401cb);
        }
        lfb j = eju.j(this.a, this.b, mseVar, h.a());
        if (!j.e()) {
            this.f.a.a(mseVar);
            this.d.e(ciu.CONTENT_CACHE_RESPONSE, 5);
        }
        this.d.e(ciu.CONTENT_CACHE_RESPONSE, 1);
        return j;
    }

    private final boolean j() {
        int i = this.f.d;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 3 || i2 == 26) {
                return ((Boolean) cit.i.c()).booleanValue();
            }
            if (i2 == 28) {
                return ((Boolean) cit.j.c()).booleanValue();
            }
            return false;
        }
        throw null;
    }
}
