package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: jyn  reason: default package */
/* loaded from: classes.dex */
public abstract class jyn extends jyb {
    private jyh d;

    protected jzm c(Context context) {
        throw null;
    }

    protected mks d() {
        throw null;
    }

    protected List e() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.jyb
    public final void g() {
        k().c(jyo.a, true, null);
    }

    @Override // defpackage.jyb
    protected final void i() {
        k().d(jyo.a);
    }

    final jyh k() {
        if (this.d == null) {
            Context applicationContext = getApplicationContext();
            lzh lzhVar = jws.a;
            ArrayList arrayList = new ArrayList();
            mks d = d();
            kcu.s(e(), arrayList);
            jws r = kcu.r(d, arrayList);
            r.e.c(jyt.a(jzg.d));
            osr a = jyj.a();
            a.a = jvi.e(jvl.b(applicationContext));
            a.i(d());
            a.b = null;
            a.j(c(applicationContext));
            a.c = r;
            this.d = jyh.a(a.h(), new jym(this, 0));
        }
        return this.d;
    }
}
