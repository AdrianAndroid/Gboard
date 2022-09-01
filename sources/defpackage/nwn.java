package defpackage;

import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* renamed from: nwn  reason: default package */
/* loaded from: classes2.dex */
public abstract class nwn implements IBinder.DeathRecipient, nwz {
    public static final Logger e = Logger.getLogger(nwn.class.getName());
    public static final nrx f = nrx.a("internal:remote-uid");
    public static final nrx g = nrx.a("internal:server-authority");
    public static final nrx h = nrx.a("internal:inbound-parcelable-policy");
    private final oda a;
    private final ntm b;
    public final ScheduledExecutorService i;
    public nry k;
    public nvu l;
    public nxf m;
    private long p;
    private final LinkedHashSet d = new LinkedHashSet();
    private int q = 1;
    private final nxa c = new nxa(this);
    protected final ConcurrentHashMap j = new ConcurrentHashMap();
    private final nwt n = new nwt();
    private final AtomicLong o = new AtomicLong();

    public nwn(oda odaVar, nry nryVar, ntm ntmVar) {
        this.a = odaVar;
        this.k = nryVar;
        this.b = ntmVar;
        this.i = (ScheduledExecutorService) odaVar.a();
    }

    private static nvu a(RemoteException remoteException) {
        if ((remoteException instanceof DeadObjectException) || (remoteException instanceof TransactionTooLargeException)) {
            return nvu.l.e(remoteException);
        }
        return nvu.k.e(remoteException);
    }

    private final void j() {
        nxf nxfVar = this.m;
        if (nxfVar != null) {
            try {
                nxfVar.b.unlinkToDeath(this, 0);
            } catch (NoSuchElementException unused) {
            }
            try {
                nxj c = nxj.c();
                c.a().writeInt(0);
                this.m.a(2, c);
                c.close();
            } catch (RemoteException unused2) {
            }
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final synchronized void binderDied() {
        p(nvu.l.f("binderDied"), true);
    }

    public final ntm c() {
        return this.b;
    }

    protected void e(Parcel parcel) {
    }

    protected void f(Parcel parcel) {
    }

    public abstract void g(nvu nvuVar);

    public abstract void h();

    public void i() {
        this.a.b(this.i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void l(nwy nwyVar) {
        q(nwyVar.d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n(nxf nxfVar) {
        try {
            nxj c = nxj.c();
            c.a().writeInt(1);
            c.a().writeStrongBinder(this.c);
            nxfVar.a(1, c);
            c.close();
        } catch (RemoteException e2) {
            p(a(e2), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o(int i, nxj nxjVar) {
        int dataSize = nxjVar.a().dataSize();
        try {
            this.m.a(i, nxjVar);
            if (!this.n.b(dataSize)) {
                return;
            }
            e.logp(Level.FINE, "io.grpc.binder.internal.BinderTransport", "sendTransaction", "transmit window now full ".concat(toString()));
        } catch (RemoteException e2) {
            throw a(e2).g();
        }
    }

    public final void p(nvu nvuVar, boolean z) {
        if (!s()) {
            this.l = nvuVar;
            u(4);
            g(nvuVar);
        }
        if (!v(5)) {
            if (!z && !this.j.isEmpty()) {
                return;
            }
            this.c.a();
            u(5);
            j();
            ArrayList arrayList = new ArrayList(this.j.values());
            this.j.clear();
            this.i.execute(new kme(this, arrayList, nvuVar, 4));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void q(int i) {
        if (this.j.remove(Integer.valueOf(i)) == null || !this.j.isEmpty()) {
            return;
        }
        this.i.execute(new kvl(this, 16));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean r() {
        return !this.n.a;
    }

    public final boolean s() {
        return v(4) || v(5);
    }

    public final boolean t(nxf nxfVar) {
        this.m = nxfVar;
        try {
            nxfVar.b.linkToDeath(this, 0);
            return true;
        } catch (RemoteException unused) {
            return false;
        }
    }

    public final void u(int i) {
        int i2 = this.q;
        int i3 = i - 1;
        boolean z = false;
        if (i3 == 1) {
            if (i2 == 1) {
                z = true;
            }
            jdg.F(z);
        } else if (i3 == 2) {
            if (i2 == 1 || i2 == 2) {
                z = true;
            }
            jdg.F(z);
        } else if (i3 != 3) {
            if (i2 == 4) {
                z = true;
            }
            jdg.F(z);
        } else {
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                z = true;
            }
            jdg.F(z);
        }
        this.q = i;
    }

    public final boolean v(int i) {
        return this.q == i;
    }

    protected nwy x(int i) {
        return null;
    }

    @Override // defpackage.nwz
    public final boolean y(int i, Parcel parcel) {
        nxj c;
        nwy x;
        nxi nxiVar;
        ofj ofjVar;
        if (i < 1001) {
            synchronized (this) {
                if (i == 1) {
                    f(parcel);
                } else if (i == 2) {
                    p(nvu.l.f("transport shutdown by peer"), true);
                } else if (i != 3) {
                    if (i == 4) {
                        int readInt = parcel.readInt();
                        if (this.q == 3) {
                            try {
                                c = nxj.c();
                                try {
                                    c.a().writeInt(readInt);
                                    this.m.a(5, c);
                                    c.close();
                                } finally {
                                }
                            } catch (RemoteException unused) {
                            }
                        }
                    } else if (i != 5) {
                        return false;
                    } else {
                        e(parcel);
                    }
                } else if (this.n.a(parcel.readLong())) {
                    e.logp(Level.FINE, "io.grpc.binder.internal.BinderTransport", "handleAcknowledgedBytes", "handleAcknowledgedBytes: Transmit Window No-Longer Full. Unblock calls: ".concat(toString()));
                    this.d.addAll(this.j.keySet());
                    Iterator it = this.d.iterator();
                    while (r() && it.hasNext()) {
                        nwy nwyVar = (nwy) this.j.get(it.next());
                        it.remove();
                        if (nwyVar != null) {
                            synchronized (nwyVar) {
                                nxiVar = nwyVar.e;
                                ofjVar = nwyVar.g;
                            }
                            if (ofjVar != null) {
                                ofjVar.e();
                            }
                            if (nxiVar != null) {
                                try {
                                    synchronized (nxiVar) {
                                        nxiVar.g();
                                    }
                                } catch (nvv e2) {
                                    synchronized (nwyVar) {
                                        nwyVar.h(e2.a);
                                    }
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
                return true;
            }
        }
        int dataSize = parcel.dataSize();
        ConcurrentHashMap concurrentHashMap = this.j;
        Integer valueOf = Integer.valueOf(i);
        nwy nwyVar2 = (nwy) concurrentHashMap.get(valueOf);
        if (nwyVar2 == null) {
            synchronized (this) {
                if (!s() && ((x = x(i)) == null || (nwyVar2 = (nwy) this.j.putIfAbsent(valueOf, x)) == null)) {
                    nwyVar2 = x;
                }
            }
        }
        if (nwyVar2 != null) {
            nwyVar2.k(parcel);
        }
        if (this.o.addAndGet(dataSize) - this.p > 16384) {
            synchronized (this) {
                nxf nxfVar = this.m;
                jdg.u(nxfVar);
                long j = this.o.get();
                this.p = j;
                try {
                    c = nxj.c();
                    try {
                        c.a().writeLong(j);
                        nxfVar.a(3, c);
                        c.close();
                    } finally {
                    }
                } catch (RemoteException e3) {
                    p(a(e3), true);
                }
            }
        }
        return true;
    }
}
