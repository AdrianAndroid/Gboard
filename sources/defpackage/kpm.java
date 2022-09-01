package defpackage;

import android.net.Uri;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: kpm  reason: default package */
/* loaded from: classes.dex */
public final class kpm implements koo {
    private boolean a = false;

    static {
        new AtomicInteger();
    }

    private kpm() {
    }

    public static kpm b() {
        return new kpm();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kpt] */
    @Override // defpackage.koo
    public final /* bridge */ /* synthetic */ Object a(kon konVar) {
        if (this.a) {
            if (!konVar.b()) {
                return konVar.a.d((Uri) konVar.e);
            }
            throw new kpa("Short circuit would skip transforms.");
        }
        koz kozVar = new koz(kpo.b().a(konVar));
        try {
            Closeable closeable = kozVar.a;
            if (closeable instanceof kov) {
                File a = ((kov) closeable).a();
                kozVar.close();
                return a;
            }
            throw new IOException("Not convertible and fallback to pipe is disabled.");
        } catch (Throwable th) {
            try {
                kozVar.close();
            } catch (Throwable th2) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                } catch (Exception unused) {
                }
            }
            throw th;
        }
    }

    public final void c() {
        this.a = true;
    }
}
