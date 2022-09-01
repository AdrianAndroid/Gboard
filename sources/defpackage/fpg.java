package defpackage;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: fpg  reason: default package */
/* loaded from: classes.dex */
public final class fpg implements fob, foc {
    public final fnw b;
    public final Cfor c;
    public final int e;
    public boolean f;
    public final /* synthetic */ fpj i;
    public final ijk j;
    private final fqb l;
    public final Queue a = new LinkedList();
    private final Set k = new HashSet();
    public final Map d = new HashMap();
    public final List g = new ArrayList();
    private fmt m = null;
    public int h = 0;

    public fpg(fpj fpjVar, fnz fnzVar) {
        this.i = fpjVar;
        Looper looper = fpjVar.m.getLooper();
        fqs a = fnzVar.f().a();
        fnw f = ((fgy) fnzVar.j.b).f(fnzVar.b, looper, a, fnzVar.d, this, this);
        String str = fnzVar.c;
        if (str != null) {
            ((fqq) f).j = str;
        }
        this.b = f;
        this.c = fnzVar.e;
        this.j = new ijk((byte[]) null);
        this.e = fnzVar.g;
        if (f.o()) {
            this.l = new fqb(fpjVar.f, fpjVar.m, fnzVar.f().a());
        } else {
            this.l = null;
        }
    }

    private final fmv p(fmv[] fmvVarArr) {
        if (fmvVarArr != null) {
            fmv[] p = this.b.p();
            if (p == null) {
                p = new fmv[0];
            }
            qo qoVar = new qo(p.length);
            for (fmv fmvVar : p) {
                qoVar.put(fmvVar.a, Long.valueOf(fmvVar.a()));
            }
            for (int i = 0; i <= 0; i++) {
                fmv fmvVar2 = fmvVarArr[i];
                Long l = (Long) qoVar.get(fmvVar2.a);
                if (l == null || l.longValue() < fmvVar2.a()) {
                    return fmvVar2;
                }
            }
        }
        return null;
    }

    private final Status q(fmt fmtVar) {
        return fpj.a(this.c, fmtVar);
    }

    private final void r(fmt fmtVar) {
        Iterator it = this.k.iterator();
        if (it.hasNext()) {
            fhr fhrVar = (fhr) it.next();
            if (fyb.aJ(fmtVar, fmt.a)) {
                this.b.q();
            }
            throw null;
        }
        this.k.clear();
    }

    private final void s(Status status, Exception exc, boolean z) {
        fyb.aA(this.i.m);
        boolean z2 = false;
        boolean z3 = status == null;
        if (exc == null) {
            z2 = true;
        }
        if (z3 == z2) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            foq foqVar = (foq) it.next();
            if (!z || foqVar.c == 2) {
                if (status != null) {
                    foqVar.d(status);
                } else {
                    foqVar.e(exc);
                }
                it.remove();
            }
        }
    }

    private final void t(foq foqVar) {
        foqVar.g(this.j, o());
        try {
            foqVar.f(this);
        } catch (DeadObjectException unused) {
            a(1);
            this.b.f("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    private final boolean u(foq foqVar) {
        if (!(foqVar instanceof fok)) {
            t(foqVar);
            return true;
        }
        fok fokVar = (fok) foqVar;
        fmv p = p(fokVar.b(this));
        if (p == null) {
            t(foqVar);
            return true;
        }
        String name = this.b.getClass().getName();
        String str = p.a;
        long a = p.a();
        Log.w("GoogleApiManager", name + " could not execute call because it requires feature (" + str + ", " + a + ").");
        if (!this.i.n || !fokVar.a(this)) {
            fokVar.e(new foj(p));
            return true;
        }
        fph fphVar = new fph(this.c, p);
        int indexOf = this.g.indexOf(fphVar);
        if (indexOf >= 0) {
            fph fphVar2 = (fph) this.g.get(indexOf);
            this.i.m.removeMessages(15, fphVar2);
            Handler handler = this.i.m;
            handler.sendMessageDelayed(Message.obtain(handler, 15, fphVar2), 5000L);
            return false;
        }
        this.g.add(fphVar);
        Handler handler2 = this.i.m;
        handler2.sendMessageDelayed(Message.obtain(handler2, 15, fphVar), 5000L);
        Handler handler3 = this.i.m;
        handler3.sendMessageDelayed(Message.obtain(handler3, 16, fphVar), 120000L);
        fmt fmtVar = new fmt(2, null);
        if (v(fmtVar)) {
            return false;
        }
        this.i.h(fmtVar, this.e);
        return false;
    }

    private final boolean v(fmt fmtVar) {
        synchronized (fpj.c) {
            fpj fpjVar = this.i;
            if (fpjVar.k == null || !fpjVar.l.contains(this.c)) {
                return false;
            }
            fpd fpdVar = this.i.k;
            krm krmVar = new krm(fmtVar, this.e);
            AtomicReference atomicReference = fpdVar.b;
            while (true) {
                if (!atomicReference.compareAndSet(null, krmVar)) {
                    if (atomicReference.get() != null) {
                        break;
                    }
                } else {
                    fpdVar.c.post(new fow(fpdVar, krmVar, null));
                    break;
                }
            }
            return true;
        }
    }

    @Override // defpackage.fpb
    public final void a(int i) {
        if (Looper.myLooper() == this.i.m.getLooper()) {
            k(i);
        } else {
            this.i.m.post(new dob(this, i, 6));
        }
    }

    @Override // defpackage.fpb
    public final void b() {
        if (Looper.myLooper() == this.i.m.getLooper()) {
            h();
        } else {
            this.i.m.post(new fci(this, 19));
        }
    }

    public final void c() {
        fyb.aA(this.i.m);
        this.m = null;
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [gdu, fnw] */
    public final void d() {
        fyb.aA(this.i.m);
        if (this.b.m() || this.b.n()) {
            return;
        }
        try {
            fpj fpjVar = this.i;
            ita itaVar = fpjVar.o;
            Context context = fpjVar.f;
            fnw fnwVar = this.b;
            fyb.ax(context);
            fyb.ax(fnwVar);
            fnwVar.r();
            int a = fnwVar.a();
            int f = itaVar.f(a);
            if (f == -1) {
                int i = 0;
                while (true) {
                    if (i >= ((SparseIntArray) itaVar.b).size()) {
                        f = -1;
                        break;
                    }
                    int keyAt = ((SparseIntArray) itaVar.b).keyAt(i);
                    if (keyAt > a && ((SparseIntArray) itaVar.b).get(keyAt) == 0) {
                        f = 0;
                        break;
                    }
                    i++;
                }
                if (f == -1) {
                    f = ((fmy) itaVar.a).f(context, a);
                }
                ((SparseIntArray) itaVar.b).put(a, f);
            }
            if (f != 0) {
                fmt fmtVar = new fmt(f, null);
                String name = this.b.getClass().getName();
                String obj = fmtVar.toString();
                Log.w("GoogleApiManager", "The service for " + name + " is not available: " + obj);
                i(fmtVar);
                return;
            }
            fpj fpjVar2 = this.i;
            fnw fnwVar2 = this.b;
            fpi fpiVar = new fpi(fpjVar2, fnwVar2, this.c);
            if (fnwVar2.o()) {
                fqb fqbVar = this.l;
                fyb.ax(fqbVar);
                gdu gduVar = fqbVar.e;
                if (gduVar != null) {
                    gduVar.l();
                }
                fqbVar.d.g = Integer.valueOf(System.identityHashCode(fqbVar));
                fgy fgyVar = fqbVar.g;
                Context context2 = fqbVar.a;
                Looper looper = fqbVar.b.getLooper();
                fqs fqsVar = fqbVar.d;
                fqbVar.e = fgyVar.f(context2, looper, fqsVar, fqsVar.f, fqbVar, fqbVar);
                fqbVar.f = fpiVar;
                Set set = fqbVar.c;
                if (set == null || set.isEmpty()) {
                    fqbVar.b.post(new fqa(fqbVar, 0));
                } else {
                    fqq fqqVar = (fqq) fqbVar.e;
                    fqqVar.k(new fqn(fqqVar));
                }
            }
            try {
                this.b.k(fpiVar);
            } catch (SecurityException e) {
                j(new fmt(10), e);
            }
        } catch (IllegalStateException e2) {
            j(new fmt(10), e2);
        }
    }

    public final void e(foq foqVar) {
        fyb.aA(this.i.m);
        if (this.b.m()) {
            if (u(foqVar)) {
                l();
                return;
            } else {
                this.a.add(foqVar);
                return;
            }
        }
        this.a.add(foqVar);
        fmt fmtVar = this.m;
        if (fmtVar == null || !fmtVar.a()) {
            d();
        } else {
            i(fmtVar);
        }
    }

    public final void f(Status status) {
        fyb.aA(this.i.m);
        s(status, null, false);
    }

    public final void g() {
        ArrayList arrayList = new ArrayList(this.a);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            foq foqVar = (foq) arrayList.get(i);
            if (!this.b.m()) {
                return;
            }
            if (u(foqVar)) {
                this.a.remove(foqVar);
            }
        }
    }

    public final void h() {
        c();
        r(fmt.a);
        n();
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            fws fwsVar = (fws) it.next();
            if (p(((fpx) fwsVar.b).b) != null) {
                it.remove();
            } else {
                try {
                    ((fpx) fwsVar.b).b(this.b, new fxa());
                } catch (DeadObjectException unused) {
                    a(3);
                    this.b.f("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                    it.remove();
                }
            }
        }
        g();
        l();
    }

    @Override // defpackage.fpw
    public final void i(fmt fmtVar) {
        j(fmtVar, null);
    }

    public final void j(fmt fmtVar, Exception exc) {
        gdu gduVar;
        fyb.aA(this.i.m);
        fqb fqbVar = this.l;
        if (fqbVar != null && (gduVar = fqbVar.e) != null) {
            gduVar.l();
        }
        c();
        this.i.o.e();
        r(fmtVar);
        if ((this.b instanceof fsc) && fmtVar.c != 24) {
            fpj fpjVar = this.i;
            fpjVar.e = true;
            Handler handler = fpjVar.m;
            handler.sendMessageDelayed(handler.obtainMessage(19), 300000L);
        }
        if (fmtVar.c == 4) {
            f(fpj.b);
        } else if (this.a.isEmpty()) {
            this.m = fmtVar;
        } else if (exc != null) {
            fyb.aA(this.i.m);
            s(null, exc, false);
        } else if (!this.i.n) {
            f(q(fmtVar));
        } else {
            s(q(fmtVar), null, true);
            if (this.a.isEmpty() || v(fmtVar) || this.i.h(fmtVar, this.e)) {
                return;
            }
            if (fmtVar.c == 18) {
                this.f = true;
            }
            if (this.f) {
                Handler handler2 = this.i.m;
                handler2.sendMessageDelayed(Message.obtain(handler2, 9, this.c), 5000L);
                return;
            }
            f(q(fmtVar));
        }
    }

    public final void k(int i) {
        c();
        this.f = true;
        ijk ijkVar = this.j;
        String i2 = this.b.i();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (i2 != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(i2);
        }
        ijkVar.r(true, new Status(20, sb.toString()));
        Handler handler = this.i.m;
        handler.sendMessageDelayed(Message.obtain(handler, 9, this.c), 5000L);
        Handler handler2 = this.i.m;
        handler2.sendMessageDelayed(Message.obtain(handler2, 11, this.c), 120000L);
        this.i.o.e();
        for (fws fwsVar : this.d.values()) {
            Object obj = fwsVar.c;
        }
    }

    public final void l() {
        this.i.m.removeMessages(12, this.c);
        Handler handler = this.i.m;
        handler.sendMessageDelayed(handler.obtainMessage(12, this.c), this.i.d);
    }

    public final void m() {
        fyb.aA(this.i.m);
        f(fpj.a);
        this.j.r(false, fpj.a);
        for (fps fpsVar : (fps[]) this.d.keySet().toArray(new fps[0])) {
            e(new fop(fpsVar, new fxa(), null));
        }
        r(new fmt(4));
        if (this.b.m()) {
            this.b.t(new opu(this));
        }
    }

    public final void n() {
        if (this.f) {
            this.i.m.removeMessages(11, this.c);
            this.i.m.removeMessages(9, this.c);
            this.f = false;
        }
    }

    public final boolean o() {
        return this.b.o();
    }
}
