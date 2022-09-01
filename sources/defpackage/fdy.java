package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: fdy  reason: default package */
/* loaded from: classes.dex */
public final class fdy {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/OnDevicePackDownloadNotice");
    public static final long b = TimeUnit.MINUTES.toMillis(1);
    public final ino c;
    public final ino d;
    public final fbr e;
    public final fdw f;
    private boolean h = false;
    public final fdx g = new fdx(this);

    public fdy(Context context, fdw fdwVar) {
        this.f = fdwVar;
        this.c = ino.K(context, null);
        this.d = ino.M(context);
        this.e = new fbr(context);
    }

    public static boolean c(ino inoVar) {
        return inoVar.al("has_shown_ondevice_notice", false, false);
    }

    public final void a(Executor executor) {
        if (!this.h) {
            this.g.g(executor);
            this.h = true;
        }
    }

    public final void b() {
        if (this.h) {
            this.g.h();
        }
    }

    protected final void finalize() {
        b();
        super.finalize();
    }
}
