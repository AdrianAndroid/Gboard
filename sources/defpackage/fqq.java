package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: fqq  reason: default package */
/* loaded from: classes.dex */
public abstract class fqq {
    private static final fmv[] s = new fmv[0];
    public final Context a;
    public final fmy b;
    public final Handler c;
    public fql f;
    public final int i;
    public volatile String j;
    public frl o;
    lfy p;
    public final opu q;
    public final opu r;
    private final frc u;
    private IInterface v;
    private fqm w;
    private final String x;
    private volatile String t = null;
    public final Object d = new Object();
    public final Object e = new Object();
    public final ArrayList g = new ArrayList();
    public int h = 1;
    public fmt k = null;
    public boolean l = false;
    public volatile fqu m = null;
    public final AtomicInteger n = new AtomicInteger(0);

    /* JADX INFO: Access modifiers changed from: protected */
    public fqq(Context context, Looper looper, frc frcVar, fmy fmyVar, int i, opu opuVar, opu opuVar2, String str, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        fyb.aH(context, "Context must not be null");
        this.a = context;
        fyb.aH(looper, "Looper must not be null");
        fyb.aH(frcVar, "Supervisor must not be null");
        this.u = frcVar;
        fyb.aH(fmyVar, "API availability must not be null");
        this.b = fmyVar;
        this.c = new fqj(this, looper);
        this.i = i;
        this.r = opuVar;
        this.q = opuVar2;
        this.x = str;
    }

    public final boolean A(int i, int i2, IInterface iInterface) {
        synchronized (this.d) {
            if (this.h != i) {
                return false;
            }
            z(i2, iInterface);
            return true;
        }
    }

    public final boolean B() {
        return this.m != null;
    }

    public fmv[] C() {
        throw null;
    }

    protected void E() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void F(int i, int i2) {
        Handler handler = this.c;
        handler.sendMessage(handler.obtainMessage(7, i2, -1, new fqp(this, i)));
    }

    protected final void G() {
        if (this.x == null) {
            this.a.getClass().getName();
        }
    }

    public int a() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract IInterface b(IBinder iBinder);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract String c();

    protected abstract String d();

    public boolean e() {
        return false;
    }

    public void f(String str) {
        this.t = str;
        l();
    }

    protected boolean g() {
        return false;
    }

    public fmv[] h() {
        return s;
    }

    public final String i() {
        return this.t;
    }

    public final void k(fql fqlVar) {
        fyb.aH(fqlVar, "Connection progress callbacks cannot be null.");
        this.f = fqlVar;
        z(2, null);
    }

    public void l() {
        this.n.incrementAndGet();
        synchronized (this.g) {
            int size = this.g.size();
            for (int i = 0; i < size; i++) {
                ((fqk) this.g.get(i)).e();
            }
            this.g.clear();
        }
        synchronized (this.e) {
            this.o = null;
        }
        z(1, null);
    }

    public final boolean m() {
        boolean z;
        synchronized (this.d) {
            z = this.h == 4;
        }
        return z;
    }

    public final boolean n() {
        boolean z;
        synchronized (this.d) {
            int i = this.h;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    public boolean o() {
        return false;
    }

    public final fmv[] p() {
        fqu fquVar = this.m;
        if (fquVar == null) {
            return null;
        }
        return fquVar.b;
    }

    public final void q() {
        if (!m() || this.p == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
    }

    public final void r() {
    }

    public final void s(frg frgVar, Set set) {
        Bundle v = v();
        int i = this.i;
        String str = this.j;
        int i2 = fmy.c;
        Scope[] scopeArr = fqz.a;
        Bundle bundle = new Bundle();
        fmv[] fmvVarArr = fqz.b;
        fqz fqzVar = new fqz(6, i, i2, null, null, scopeArr, bundle, null, fmvVarArr, fmvVarArr, true, 0, false, str);
        fqzVar.f = this.a.getPackageName();
        fqzVar.i = v;
        if (set != null) {
            fqzVar.h = (Scope[]) set.toArray(new Scope[0]);
        }
        if (o()) {
            Account u = u();
            if (u == null) {
                u = new Account("<<default account>>", "com.google");
            }
            fqzVar.j = u;
            if (frgVar != null) {
                fqzVar.g = frgVar.a;
            }
        }
        fqzVar.k = C();
        fqzVar.l = h();
        if (e()) {
            fqzVar.o = true;
        }
        try {
            synchronized (this.e) {
                frl frlVar = this.o;
                if (frlVar != null) {
                    frk frkVar = new frk(this, this.n.get());
                    Parcel obtain = Parcel.obtain();
                    Parcel obtain2 = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(frkVar);
                    obtain.writeInt(1);
                    fmq.a(fqzVar, obtain, 0);
                    frlVar.a.transact(46, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            Handler handler = this.c;
            handler.sendMessage(handler.obtainMessage(6, this.n.get(), 3));
        } catch (RemoteException e2) {
            e = e2;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            y(8, null, null, this.n.get());
        } catch (SecurityException e3) {
            throw e3;
        } catch (RuntimeException e4) {
            e = e4;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            y(8, null, null, this.n.get());
        }
    }

    public final void t(opu opuVar) {
        ((fpg) opuVar.a).i.m.post(new fci(opuVar, 20, null, null, null, null, null));
    }

    public Account u() {
        throw null;
    }

    protected Bundle v() {
        return new Bundle();
    }

    public final IInterface w() {
        IInterface iInterface;
        synchronized (this.d) {
            if (this.h == 5) {
                throw new DeadObjectException();
            }
            if (m()) {
                iInterface = this.v;
                fyb.aH(iInterface, "Client is connected but service is null");
            } else {
                throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
            }
        }
        return iInterface;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Set x() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void y(int i, IBinder iBinder, Bundle bundle, int i2) {
        Handler handler = this.c;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, new fqo(this, i, iBinder, bundle)));
    }

    public final void z(int i, IInterface iInterface) {
        lfy lfyVar;
        boolean z = false;
        if ((i == 4) == (iInterface != null)) {
            z = true;
        }
        fyb.ay(z);
        synchronized (this.d) {
            this.h = i;
            this.v = iInterface;
            if (i == 1) {
                fqm fqmVar = this.w;
                if (fqmVar != null) {
                    frc frcVar = this.u;
                    lfy lfyVar2 = this.p;
                    Object obj = lfyVar2.d;
                    Object obj2 = lfyVar2.c;
                    int i2 = lfyVar2.b;
                    G();
                    frcVar.e((String) obj, fqmVar, this.p.a);
                    this.w = null;
                }
            } else if (i == 2 || i == 3) {
                fqm fqmVar2 = this.w;
                if (fqmVar2 != null && (lfyVar = this.p) != null) {
                    Object obj3 = lfyVar.d;
                    Object obj4 = lfyVar.c;
                    Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + ((String) obj3) + " on " + ((String) obj4));
                    frc frcVar2 = this.u;
                    lfy lfyVar3 = this.p;
                    Object obj5 = lfyVar3.d;
                    Object obj6 = lfyVar3.c;
                    int i3 = lfyVar3.b;
                    G();
                    frcVar2.e((String) obj5, fqmVar2, this.p.a);
                    this.n.incrementAndGet();
                }
                fqm fqmVar3 = new fqm(this, this.n.get());
                this.w = fqmVar3;
                lfy lfyVar4 = new lfy(d(), g());
                this.p = lfyVar4;
                if (lfyVar4.a && a() < 17895000) {
                    throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat((String) lfyVar4.d));
                }
                frc frcVar3 = this.u;
                Object obj7 = lfyVar4.d;
                Object obj8 = lfyVar4.c;
                int i4 = lfyVar4.b;
                G();
                boolean z2 = this.p.a;
                E();
                if (!frcVar3.d(new frb((String) obj7, z2), fqmVar3)) {
                    lfy lfyVar5 = this.p;
                    Object obj9 = lfyVar5.d;
                    Object obj10 = lfyVar5.c;
                    Log.w("GmsClient", "unable to connect to service: " + ((String) obj9) + " on " + ((String) obj10));
                    F(16, this.n.get());
                }
            } else if (i == 4) {
                fyb.ax(iInterface);
                System.currentTimeMillis();
            }
        }
    }
}
