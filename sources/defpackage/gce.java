package defpackage;

import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.micore.learning.base.ErrorStatusException;
import java.io.Closeable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* renamed from: gce  reason: default package */
/* loaded from: classes.dex */
public final class gce implements Closeable {
    public final /* synthetic */ gcf b;
    private final fxm d;
    private final ServiceConnection e;
    private boolean c = false;
    public final AtomicBoolean a = new AtomicBoolean(false);
    private final fxo f = new fxo(this);

    public gce(gcf gcfVar, fxm fxmVar, ServiceConnection serviceConnection) {
        this.b = gcfVar;
        this.d = fxmVar;
        this.e = serviceConnection;
    }

    private final void b() {
        mld e = mld.e();
        this.b.l.a.set(e);
        this.d.e(new gcd(e));
        try {
            e.get(this.b.h, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (CancellationException e2) {
            this.b.c.j(e2, "Closing iterator failed due to dead process");
            this.b.b(job.IN_APP_EXAMPLE_STORE_ITERATOR_CLOSE_CONNECTION_DIED);
        } catch (ExecutionException e3) {
            throw new mll(e3);
        } catch (TimeoutException e4) {
            gcf gcfVar = this.b;
            gcfVar.c.k(e4, "Closing iterator timed out (%ss)", Long.valueOf(gcfVar.h));
            this.b.b(job.IN_APP_EXAMPLE_STORE_ITERATOR_CLOSE_TIMEOUT);
        }
    }

    public final ijk a() {
        job jobVar;
        mld e = mld.e();
        this.b.l.a.set(e);
        fxo fxoVar = this.f;
        fxoVar.d = e;
        fxoVar.a.clear();
        fxoVar.b.set(0);
        AtomicLong atomicLong = fxoVar.c;
        kdr kdrVar = fxoVar.e.b.o;
        atomicLong.set(kdrVar != null ? ((lgh) kdrVar.d).a() : 0L);
        try {
            fxm fxmVar = this.d;
            fxo fxoVar2 = this.f;
            int i = mhq.i(this.b.b.d(), 0, 204800);
            if (i <= 0) {
                i = 51200;
            }
            fxmVar.f(fxoVar2, i);
            try {
                lfc lfcVar = (lfc) e.get(this.b.h, TimeUnit.SECONDS);
                if (lfcVar.b != null) {
                    this.b.b(job.IN_APP_EXAMPLE_STORE_ITERATOR_NEXT_CLIENT_FAILURE);
                    close();
                    throw ErrorStatusException.b(14, gcf.c("onIteratorNextFailure", this.b.f, (Status) lfcVar.b), new Object[0]);
                }
                ijk ijkVar = (ijk) lfcVar.a;
                if (ijkVar == null) {
                    close();
                }
                return ijkVar;
            } catch (CancellationException unused) {
                this.b.b(job.IN_APP_EXAMPLE_STORE_ITERATOR_NEXT_CONNECTION_DIED);
                close();
                throw ErrorStatusException.b(14, "next() failed due to dead process", new Object[0]);
            } catch (ExecutionException e2) {
                throw new mll(e2);
            } catch (TimeoutException unused2) {
                this.b.b(job.IN_APP_EXAMPLE_STORE_ITERATOR_NEXT_TIMEOUT);
                close();
                throw ErrorStatusException.b(14, "next() timed out (%ss)", Long.valueOf(this.b.h));
            }
        } catch (RemoteException e3) {
            if (e3 instanceof DeadObjectException) {
                jobVar = job.IN_APP_EXAMPLE_STORE_ITERATOR_NEXT_CONNECTION_DIED;
            } else {
                jobVar = job.IN_APP_EXAMPLE_STORE_ITERATOR_NEXT_REMOTE_EXC;
            }
            this.b.b(jobVar);
            close();
            throw ErrorStatusException.c(14, e3, "Failed to call next()", new Object[0]);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        job jobVar;
        if (this.c) {
            return;
        }
        this.c = true;
        if (this.d != null) {
            if (this.a.get()) {
                this.b.d.g(job.IN_APP_EXAMPLE_STORE_ACTUALLY_DID_CHUNK_EXAMPLE, this.b.e);
            } else {
                this.b.d.g(job.IN_APP_EXAMPLE_STORE_ACTUALLY_DID_NOT_CHUNK_EXAMPLE, this.b.e);
            }
        }
        try {
            gcf gcfVar = this.b;
            gbi j = gcfVar.d.j(4, gcfVar.g);
            b();
            j.close();
        } catch (RemoteException e) {
            if (e instanceof DeadObjectException) {
                jobVar = job.IN_APP_EXAMPLE_STORE_ITERATOR_CLOSE_CONNECTION_DIED;
            } else {
                jobVar = job.IN_APP_EXAMPLE_STORE_ITERATOR_CLOSE_REMOTE_EXC;
            }
            this.b.b(jobVar);
            this.b.c.j(e, "Exception during call to IExampleStoreIterator.close");
        }
        this.b.a.unbindService(this.e);
    }
}
