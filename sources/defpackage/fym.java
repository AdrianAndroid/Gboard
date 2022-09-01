package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.learning.dynamite.training.InAppTrainerCancellerImpl;
import java.io.IOException;

/* compiled from: PG */
/* renamed from: fym  reason: default package */
/* loaded from: classes.dex */
public final class fym implements fyz {
    final /* synthetic */ InAppTrainerCancellerImpl a;
    private final int b;

    public fym(InAppTrainerCancellerImpl inAppTrainerCancellerImpl, int i) {
        this.a = inAppTrainerCancellerImpl;
        this.b = i;
    }

    @Override // defpackage.fyz
    public final mko a() {
        try {
            int i = this.b;
            if (i != 0 && i != 1 && i != 2 && i != 3) {
                return kcu.K(new Status(10, "Unknown InAppTrainerType!"));
            }
            final Context applicationContext = this.a.a.getApplicationContext();
            jnk b = jnk.b(applicationContext);
            fwo fwoVar = (fwo) b.c(fwo.class);
            final fwe fweVar = (fwe) b.c(fwe.class);
            if (this.a.b(fwoVar, fweVar)) {
                mko K = kcu.K(new Status(17, "InAppTraining API not enabled!"));
                if (b != null) {
                    b.close();
                }
                return K;
            }
            fwoVar.e(job.IN_APP_TRAINING_CANCEL_TASKS_BY_TYPE_CALLED);
            jnk b2 = fweVar.ar() ? jnk.b(applicationContext) : null;
            final gbx gbxVar = (gbx) b.c(gbx.class);
            int i2 = this.b;
            final int i3 = i2 != 0 ? i2 != 1 ? i2 != 3 ? 1 : 6 : 5 : 4;
            mko g = mhu.g(mhu.g(mio.g(mkh.q(gbxVar.c(i2)), new ego(gbxVar, i3, 6), mjl.a), IOException.class, new ego(gbxVar, i3, 7), mjl.a), RuntimeException.class, new leq() { // from class: fyl
                @Override // defpackage.leq
                public final Object a(Object obj) {
                    gbx gbxVar2 = gbx.this;
                    int i4 = i3;
                    fwe fweVar2 = fweVar;
                    Context context = applicationContext;
                    RuntimeException runtimeException = (RuntimeException) obj;
                    gbxVar2.o(i4, lfb.g(mge.ERROR_REASON_RUNTIME_EXCEPTION), ldu.a);
                    if (fweVar2.aK()) {
                        fyb.y(context, runtimeException);
                    }
                    throw runtimeException;
                }
            }, mjl.a);
            g.d(new fqa(b2, 4), this.a.b);
            if (b != null) {
                b.close();
            }
            return g;
        } catch (Throwable th) {
            fyb.y(this.a.a.getApplicationContext(), th);
            throw th;
        }
    }
}
