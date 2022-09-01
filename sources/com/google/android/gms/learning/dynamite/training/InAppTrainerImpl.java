package com.google.android.gms.learning.dynamite.training;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class InAppTrainerImpl extends gat {
    public Context c;
    public fwm d;
    private Executor f;
    private String g;
    private static final jns e = jnl.b("brella", "InAppTrainerImpl");
    public static final llp a = llp.t("android.permission.RECEIVE_BOOT_COMPLETED", "android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE");
    public static final llp b = llp.r("android.permission.RECEIVE_BOOT_COMPLETED");

    /* renamed from: $r8$lambda$5HHqCQZXMi-PcfVT5zSZ_MIHgVo */
    public static /* synthetic */ mko m24$r8$lambda$5HHqCQZXMiPcfVT5zSZ_MIHgVo(InAppTrainerImpl inAppTrainerImpl) {
        Context applicationContext = inAppTrainerImpl.c.getApplicationContext();
        try {
            jnk b2 = jnk.b(applicationContext);
            fwo fwoVar = (fwo) b2.c(fwo.class);
            fwe fweVar = (fwe) b2.c(fwe.class);
            if (inAppTrainerImpl.b(fwoVar, fweVar)) {
                mko K = kcu.K(new Status(17, "InAppTraining API not enabled!"));
                if (b2 == null) {
                    return K;
                }
                b2.close();
                return K;
            }
            fwoVar.e(job.TRAINER_STOP_CALLED);
            jnk b3 = fweVar.ar() ? jnk.b(applicationContext) : null;
            gbx gbxVar = (gbx) b2.c(gbx.class);
            mko g = mhu.g(mhu.g(mio.g(mkh.q(gbxVar.e(inAppTrainerImpl.g)), new fyn(inAppTrainerImpl, gbxVar, 5), mjl.a), IOException.class, new fyn(inAppTrainerImpl, gbxVar, 0), mjl.a), RuntimeException.class, new eiy(inAppTrainerImpl, gbxVar, fweVar, applicationContext, 2), mjl.a);
            ((mik) g).d(new fqa(b3, 5), inAppTrainerImpl.f);
            if (b2 != null) {
                b2.close();
            }
            return g;
        } catch (Throwable th) {
            fyb.y(applicationContext, th);
            throw th;
        }
    }

    /* renamed from: $r8$lambda$U2P-TYx74xA0uwh_ZgdyuLN6f5c */
    public static /* synthetic */ mko m25$r8$lambda$U2PTYx74xA0uwh_ZgdyuLN6f5c(InAppTrainerImpl inAppTrainerImpl) {
        mko K;
        Context applicationContext = inAppTrainerImpl.c.getApplicationContext();
        try {
            jnk b2 = jnk.b(applicationContext);
            fwo fwoVar = (fwo) b2.c(fwo.class);
            fwe fweVar = (fwe) b2.c(fwe.class);
            if (inAppTrainerImpl.b(fwoVar, fweVar)) {
                K = kcu.K(new Status(17, "InAppTraining API not enabled!"));
                if (b2 == null) {
                    return K;
                }
            } else if (c(fwoVar, fweVar, inAppTrainerImpl.d)) {
                K = kcu.K(new Status(17, "InApp Personalization is not enabled."));
                if (b2 == null) {
                    return K;
                }
            } else {
                fwoVar.e(job.TRAINER_START_CALLED);
                jnk b3 = fweVar.ar() ? jnk.b(applicationContext) : null;
                gbx gbxVar = (gbx) b2.c(gbx.class);
                mko g = mhu.g(mhu.g(mhu.g(mio.g(mkh.q(gbxVar.d(inAppTrainerImpl.d)), new fyn(inAppTrainerImpl, gbxVar, 2), mjl.a), gbv.class, new fyn(inAppTrainerImpl, gbxVar, 3), mjl.a), IOException.class, new fyn(inAppTrainerImpl, gbxVar, 4), mjl.a), RuntimeException.class, new eiy(inAppTrainerImpl, gbxVar, fweVar, applicationContext, 3), mjl.a);
                ((mik) g).d(new fqa(b3, 6), inAppTrainerImpl.f);
                if (b2 != null) {
                    b2.close();
                }
                return g;
            }
            b2.close();
            return K;
        } catch (Throwable th) {
            fyb.y(applicationContext, th);
            throw th;
        }
    }

    public static boolean c(fwo fwoVar, fwe fweVar, fwm fwmVar) {
        if (fwmVar.g == null || fweVar.ak()) {
            return false;
        }
        fwoVar.e(job.IN_APP_PERSONALIZATION_REQUESTED_BUT_DISABLED);
        return true;
    }

    public final boolean b(fwo fwoVar, fwe fweVar) {
        if (!fweVar.az(this.c.getApplicationContext().getPackageName())) {
            fwoVar.e(job.IN_APP_TRAINING_API_DISABLED);
            return true;
        }
        return false;
    }

    @Override // defpackage.gau
    public boolean initV26(ftm ftmVar, ftm ftmVar2, fwm fwmVar, fpo fpoVar) {
        return initW24(ftmVar, ftmVar2, fwmVar, fpoVar);
    }

    @Override // defpackage.gau
    public boolean initW24(ftm ftmVar, ftm ftmVar2, fwm fwmVar, fpo fpoVar) {
        return initY2020W18(ftmVar, ftmVar2, fwmVar, fpoVar);
    }

    @Override // defpackage.gau
    public boolean initY2020W18(ftm ftmVar, ftm ftmVar2, fwm fwmVar, fpo fpoVar) {
        return initY2020W30(ftmVar, ftmVar2, fwmVar, fpoVar);
    }

    @Override // defpackage.gau
    public boolean initY2020W30(ftm ftmVar, ftm ftmVar2, fwm fwmVar, fpo fpoVar) {
        return initY2020W36(ftmVar, ftmVar2, fwmVar, fpoVar);
    }

    @Override // defpackage.gau
    public boolean initY2020W36(ftm ftmVar, ftm ftmVar2, fwm fwmVar, fpo fpoVar) {
        return initY2021W30(ftmVar, ftmVar2, fwmVar, fpoVar);
    }

    @Override // defpackage.gau
    public boolean initY2021W30(ftm ftmVar, ftm ftmVar2, fwm fwmVar, fpo fpoVar) {
        return initY2022W24(ftmVar, ftmVar2, fwmVar, fpoVar);
    }

    @Override // defpackage.gau
    public boolean initY2022W24(ftm ftmVar, ftm ftmVar2, fwm fwmVar, fpo fpoVar) {
        this.c = (Context) ftl.c(ftmVar);
        try {
            if (lfd.e(fwmVar.b)) {
                gni.i(fpoVar, new Status(10, "Invalid session name"), e);
            } else if (fwmVar.c != 0) {
                if (fwmVar.g != null || !lfd.e(fwmVar.e)) {
                    if (fwmVar.g != null) {
                        if (!lfd.e(fwmVar.e)) {
                            gni.i(fpoVar, new Status(10, "Cannot set options for both federation and local computation"), e);
                        } else if (fwmVar.l == null) {
                            gni.i(fpoVar, new Status(10, "Missing input directory"), e);
                        } else if (fwmVar.j == null) {
                            gni.i(fpoVar, new Status(10, "Missing output directory"), e);
                        } else if (fwmVar.k == null) {
                            gni.i(fpoVar, new Status(10, "Missing training interval"), e);
                        }
                    }
                    this.f = (Executor) ftl.c(ftmVar2);
                    this.d = fwmVar;
                    this.g = fwmVar.b;
                    gni.j(new fyo(this, 3), fpoVar, this.f, e, this.c);
                    return true;
                }
                gni.i(fpoVar, new Status(10, "Missing population name or plan URI"), e);
            } else {
                gni.i(fpoVar, new Status(10, "Invalid job ID"), e);
            }
            return true;
        } catch (Error | RuntimeException e2) {
            fyb.y(this.c, e2);
            throw e2;
        }
    }

    @Override // defpackage.gau
    public void start(int i, fpo fpoVar) {
        gni.j(new fyo(this, 0), fpoVar, this.f, e, this.c);
    }

    @Override // defpackage.gau
    public void stop(fpo fpoVar) {
        gni.j(new fyo(this, 2), fpoVar, this.f, e, this.c);
    }
}
