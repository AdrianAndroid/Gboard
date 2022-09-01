package defpackage;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ffz  reason: default package */
/* loaded from: classes.dex */
public final class ffz implements gnx {
    public volatile WeakReference a;
    private gon b;

    private final gnx e() {
        WeakReference weakReference = this.a;
        if (weakReference == null) {
            return null;
        }
        return (gnx) weakReference.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized gon a(Context context, Executor executor) {
        String str;
        String str2;
        if (this.b == null) {
            Context applicationContext = context.getApplicationContext();
            nfh t = mox.g.t();
            if (((Boolean) ffa.k.c()).booleanValue()) {
                str = (String) fbh.s.c();
            } else {
                str = (String) fbh.p.c();
            }
            ffv.b(str);
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mox moxVar = (mox) t.b;
            str.getClass();
            moxVar.a |= 1;
            moxVar.b = str;
            mox.b(moxVar);
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mox.c((mox) t.b);
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mox.d((mox) t.b);
            mox moxVar2 = (mox) t.cz();
            nfh t2 = mox.g.t();
            if (((Boolean) ffa.k.c()).booleanValue()) {
                str2 = (String) fbh.q.c();
            } else {
                str2 = (String) fbh.r.c();
            }
            ffv.b(str2);
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            mox moxVar3 = (mox) t2.b;
            str2.getClass();
            moxVar3.a |= 1;
            moxVar3.b = str2;
            mox.b(moxVar3);
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            mox moxVar4 = (mox) t2.b;
            int i = moxVar4.a | 4;
            moxVar4.a = i;
            moxVar4.e = "c548_232a_f5c8_05ff";
            moxVar4.a = i | 32;
            moxVar4.f = 1024;
            mox.c(moxVar4);
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            mox.d((mox) t2.b);
            mox moxVar5 = (mox) t2.cz();
            nfh t3 = mpa.d.t();
            if (t3.c) {
                t3.cD();
                t3.c = false;
            }
            mpa mpaVar = (mpa) t3.b;
            moxVar2.getClass();
            mpaVar.b = moxVar2;
            int i2 = mpaVar.a | 1;
            mpaVar.a = i2;
            moxVar5.getClass();
            mpaVar.c = moxVar5;
            mpaVar.a = i2 | 2;
            this.b = new gon(applicationContext, this, jdg.o((mpa) t3.cz()), executor, blg.b, blg.a);
        }
        return this.b;
    }

    @Override // defpackage.gnx
    public final void b(bna bnaVar) {
        gnx e = e();
        if (e != null) {
            e.b(bnaVar);
        }
    }

    @Override // defpackage.gnx
    public final void c(bna bnaVar) {
        gnx e = e();
        if (e != null) {
            e.c(bnaVar);
        }
    }

    @Override // defpackage.gnx
    public final void d(nkt nktVar) {
        gnx e = e();
        if (e != null) {
            e.d(nktVar);
        }
    }
}
