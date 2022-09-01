package defpackage;

import android.content.Context;
import java.io.File;

/* compiled from: PG */
/* renamed from: feg  reason: default package */
/* loaded from: classes.dex */
public final class feg {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/SodaRecognizer");
    public static Boolean b = false;
    public final Context c;
    public final File d;
    public final fds e;
    public final ffe f;
    public final String g;
    public final File h;
    public final fdn i;
    public volatile feh j;
    public int k;
    public volatile hjf l;

    public feg(Context context, File file, File file2) {
        Context applicationContext = context.getApplicationContext();
        fds fdsVar = fds.a;
        fdn fdnVar = fdn.b;
        if (fdnVar == null) {
            synchronized (fdn.class) {
                fdnVar = fdn.b;
                if (fdnVar == null) {
                    fdnVar = new fdn();
                    fdn.b = fdnVar;
                }
            }
        }
        ffe ffeVar = new ffe(context);
        this.k = 0;
        this.c = applicationContext;
        this.d = file;
        this.h = file2;
        this.e = fdsVar;
        this.i = fdnVar;
        this.f = ffeVar;
        this.g = context.getCacheDir().getAbsolutePath() + File.separator + "soda" + File.separator;
    }

    public final void a() {
        synchronized (this) {
            int i = this.k;
            if (i == 1 || i == 2) {
                this.i.close();
            }
            this.k = 3;
        }
    }
}
