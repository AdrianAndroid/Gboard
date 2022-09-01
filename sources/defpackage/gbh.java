package defpackage;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: gbh  reason: default package */
/* loaded from: classes.dex */
public final class gbh implements fwk {
    private final gau a;

    public gbh(gau gauVar) {
        this.a = gauVar;
    }

    public static gen c(final Context context, final Executor executor, final fwm fwmVar) {
        final fxa fxaVar = new fxa();
        executor.execute(new Runnable(context, fxaVar, executor, fwmVar, null) { // from class: gbd
            public final /* synthetic */ Context a;
            public final /* synthetic */ Executor b;
            public final /* synthetic */ fwm c;
            public final /* synthetic */ fxa d;

            @Override // java.lang.Runnable
            public final void run() {
                boolean z;
                Context context2 = this.a;
                fxa fxaVar2 = this.d;
                Executor executor2 = this.b;
                fwm fwmVar2 = this.c;
                synchronized (fwd.a) {
                    z = fwd.b;
                }
                if (!z) {
                    Class<?> cls = context2.getApplicationContext().getClass();
                    if (!cls.equals(Application.class) && !"android.support.multidex.MultiDexApplication".equals(cls.getName())) {
                        String name = cls.getName();
                        fxaVar2.e(new fnx(new Status(10, "Cannot create in-app trainer: android.app.Application class has been subclassed (" + name + ") and BrellaInit.myAppCanHandleMultipleProcesses() was not called")));
                        return;
                    }
                }
                try {
                    gau gauVar = (gau) gaf.a(context2, "com.google.android.gms.learning.dynamite.training.InAppTrainerImpl", gbb.c);
                    gbe gbeVar = new gbe(fxaVar2, gauVar, null);
                    try {
                        if (gauVar.initY2022W24(ftl.b(context2), ftl.b(executor2), fwmVar2, gbeVar)) {
                            return;
                        }
                        if (gbh.d(fwmVar2.l) || gbh.d(fwmVar2.j) || gbh.d(fwmVar2.g)) {
                            fxaVar2.e(new fnx(new Status(10, "appdata Uri scheme is not supported.")));
                            return;
                        }
                        try {
                            if (gauVar.initY2020W36(ftl.b(context2), ftl.b(executor2), fwmVar2, gbeVar)) {
                                return;
                            }
                            if (fwmVar2.l != null) {
                                fxaVar2.e(new fnx(new Status(10, "local computation plan with TensorflowSpec is not supported.")));
                                return;
                            }
                            try {
                                if (gauVar.initY2020W30(ftl.b(context2), ftl.b(executor2), fwmVar2, gbeVar)) {
                                    return;
                                }
                                if (fwmVar2.c().length > 0) {
                                    fxaVar2.e(new fnx(new Status(10, "Context data is not supported.")));
                                    return;
                                }
                                try {
                                    if (gauVar.initY2020W18(ftl.b(context2), ftl.b(executor2), fwmVar2, gbeVar)) {
                                        return;
                                    }
                                    if (fwmVar2.e == null || fwmVar2.k == null) {
                                        try {
                                            if (gauVar.initW24(ftl.b(context2), ftl.b(executor2), fwmVar2, gbeVar)) {
                                                return;
                                            }
                                            int i = fwmVar2.f;
                                            if (i == 0 || i == 1) {
                                                try {
                                                    if (gauVar.initV26(ftl.b(context2), ftl.b(executor2), fwmVar2, gbeVar)) {
                                                        return;
                                                    }
                                                    fxaVar2.e(new fnx(new Status(17, "Failed to init impl")));
                                                    return;
                                                } catch (RemoteException e) {
                                                    fxaVar2.e(new fnx(new Status(8, lgf.a(e))));
                                                    return;
                                                }
                                            }
                                            fxaVar2.e(new fnx(new Status(10, "Unsupported AttestationMode")));
                                            return;
                                        } catch (RemoteException e2) {
                                            fxaVar2.e(new fnx(new Status(8, lgf.a(e2))));
                                            return;
                                        }
                                    }
                                    fxaVar2.e(new fnx(new Status(10, "Training interval is not supported for federated computation.")));
                                } catch (RemoteException e3) {
                                    fxaVar2.e(new fnx(new Status(8, lgf.a(e3))));
                                }
                            } catch (RemoteException e4) {
                                fxaVar2.e(new fnx(new Status(8, lgf.a(e4))));
                            }
                        } catch (RemoteException e5) {
                            fxaVar2.e(new fnx(new Status(8, lgf.a(e5))));
                        }
                    } catch (RemoteException e6) {
                        fxaVar2.e(new fnx(new Status(8, lgf.a(e6))));
                    }
                } catch (gad e7) {
                    fxaVar2.e(new fnx(new Status(17, "Cannot create in-app trainer: ".concat(String.valueOf(e7.getMessage())))));
                }
            }
        });
        return (gen) fxaVar.a;
    }

    public static boolean d(Uri uri) {
        return uri != null && "appdir".equals(uri.getScheme());
    }

    @Override // defpackage.fwk
    public final gen a() {
        fxa fxaVar = new fxa();
        try {
            this.a.stop(new gbg(fxaVar, null));
        } catch (RemoteException e) {
            fxaVar.e(new fnx(new Status(8, lgf.a(e))));
        }
        return (gen) fxaVar.a;
    }

    @Override // defpackage.fwk
    public final gen b() {
        fxa fxaVar = new fxa();
        try {
            this.a.start(0, new gbf(fxaVar, null));
        } catch (RemoteException e) {
            fxaVar.e(new fnx(new Status(8, lgf.a(e))));
        }
        return (gen) fxaVar.a;
    }
}
