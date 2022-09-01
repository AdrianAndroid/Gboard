package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: kzp  reason: default package */
/* loaded from: classes.dex */
public final class kzp {
    private static final Map m = new HashMap();
    public final Context a;
    public boolean f;
    public final Intent g;
    public ServiceConnection j;
    public IInterface k;
    public final jlt l;
    public final List c = new ArrayList();
    public final Set d = new HashSet();
    public final Object e = new Object();
    public final IBinder.DeathRecipient i = new IBinder.DeathRecipient() { // from class: kzi
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            kzp kzpVar = kzp.this;
            kzpVar.l.g("reportBinderDeath", new Object[0]);
            kzl kzlVar = (kzl) kzpVar.h.get();
            if (kzlVar == null) {
                kzpVar.l.g("%s : Binder has died.", kzpVar.b);
                for (kzg kzgVar : kzpVar.c) {
                    kzgVar.a(kzpVar.a());
                }
                kzpVar.c.clear();
            } else {
                kzpVar.l.g("calling onBinderDied", new Object[0]);
                kzlVar.a();
            }
            kzpVar.b();
        }
    };
    private final AtomicInteger n = new AtomicInteger(0);
    public final String b = "SplitInstallService";
    public final WeakReference h = new WeakReference(null);

    public kzp(Context context, jlt jltVar, Intent intent, byte[] bArr, byte[] bArr2) {
        this.a = context;
        this.l = jltVar;
        this.g = intent;
    }

    public final RemoteException a() {
        return new RemoteException(String.valueOf(this.b).concat(" : Binder has died."));
    }

    public final void b() {
        synchronized (this.e) {
            for (fxa fxaVar : this.d) {
                fxaVar.e(a());
            }
            this.d.clear();
        }
    }

    public final void c(kzg kzgVar) {
        Handler handler;
        Map map = m;
        synchronized (map) {
            if (!map.containsKey(this.b)) {
                HandlerThread handlerThread = new HandlerThread(this.b, 10);
                handlerThread.start();
                map.put(this.b, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) map.get(this.b);
        }
        handler.post(kzgVar);
    }

    public final void e(kzg kzgVar, final fxa fxaVar) {
        synchronized (this.e) {
            this.d.add(fxaVar);
            ((gen) fxaVar.a).i(new gej(fxaVar, null) { // from class: kzh
                public final /* synthetic */ fxa b;

                @Override // defpackage.gej
                public final void a(gen genVar) {
                    kzp kzpVar = kzp.this;
                    fxa fxaVar2 = this.b;
                    synchronized (kzpVar.e) {
                        kzpVar.d.remove(fxaVar2);
                    }
                }
            });
        }
        synchronized (this.e) {
            this.n.getAndIncrement();
        }
        c(new kzj(this, kzgVar.a, kzgVar, null));
    }

    public final void f(fxa fxaVar) {
        synchronized (this.e) {
            this.d.remove(fxaVar);
        }
        synchronized (this.e) {
            if (this.n.get() <= 0 || this.n.decrementAndGet() <= 0) {
                c(new kzk(this));
            } else {
                this.l.g("Leaving the connection open for other ongoing calls.", new Object[0]);
            }
        }
    }
}
