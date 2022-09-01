package defpackage;

import android.content.Context;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* compiled from: PG */
/* renamed from: fwr  reason: default package */
/* loaded from: classes.dex */
public final class fwr implements jnv {
    private final Context a;
    private final fwo b;
    private final jns c;
    private Future d;
    private boolean e;

    public fwr(Context context, fwo fwoVar, jns jnsVar) {
        this.a = context;
        this.b = fwoVar;
        this.c = jnsVar;
    }

    private final void d(job jobVar, Exception exc) {
        this.c.f(exc, "Error loading native library");
        if (!this.e) {
            this.b.e(jobVar);
            this.e = true;
        }
    }

    private final boolean e() {
        synchronized (this) {
            if (!this.d.isDone()) {
                return false;
            }
            try {
                kcu.S(this.d);
                return false;
            } catch (CancellationException | ExecutionException unused) {
                return true;
            }
        }
    }

    @Override // defpackage.jnv
    public final void a(job jobVar) {
        synchronized (this) {
            jdg.G(this.d != null, "finishLoadNativeLibrary called but library loading future is null");
            try {
                this.d.get();
            } catch (InterruptedException e) {
                this.c.j(e, "Interrupted while waiting for library loading");
                Thread.currentThread().interrupt();
                throw e;
            } catch (CancellationException e2) {
                d(jobVar, e2);
                throw e2;
            } catch (ExecutionException e3) {
                d(jobVar, e3);
                if (e3.getCause() instanceof jnu) {
                    throw new jnu(e3.getCause());
                }
                if (!(e3.getCause() instanceof Error)) {
                    throw new mll(e3.getCause());
                }
                throw new mjm((Error) e3.getCause());
            }
        }
    }

    @Override // defpackage.jnv
    public final void b(ExecutorService executorService) {
        aty atyVar = new aty(this, 5);
        synchronized (this) {
            if (this.d == null || e()) {
                this.d = ((mil) executorService).submit(atyVar);
            }
        }
    }

    public final /* synthetic */ void c() {
        try {
            Context context = this.a;
            gaf.b(context).a(context);
        } catch (gad | UnsatisfiedLinkError e) {
            throw new jnu(e);
        }
    }
}
