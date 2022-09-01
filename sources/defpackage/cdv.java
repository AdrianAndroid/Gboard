package defpackage;

import android.content.Context;
import com.google.android.keyboard.client.delight5.LanguageIdentifier;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: cdv  reason: default package */
/* loaded from: classes.dex */
public final class cdv implements AutoCloseable {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/delight5/langid/LanguageIdentifierWrapper");
    private static volatile cdv t;
    public final Context b;
    public LanguageIdentifier j;
    public mkr k;
    public idk l;
    public Locale m;
    public hqy n;
    public cdr o;
    public cdm p;
    public gck r;
    public gjz s;
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final AtomicBoolean f = new AtomicBoolean(false);
    public final AtomicBoolean g = new AtomicBoolean(false);
    public final AtomicBoolean h = new AtomicBoolean(false);
    public final Map i = new HashMap();
    public WeakReference q = null;
    public final jan c = jan.b;

    private cdv(Context context) {
        this.b = context;
    }

    public static cdv a(Context context) {
        cdv cdvVar;
        synchronized (cdv.class) {
            if (t == null) {
                t = new cdv(context.getApplicationContext());
            }
            cdvVar = t;
        }
        return cdvVar;
    }

    public static boolean e() {
        return ((Boolean) cas.a.c()).booleanValue();
    }

    private final void f(boolean z) {
        kcu.U(this.k.hQ(new bof(this, 7)), new igj(this, z, 1), this.k);
        this.f.set(false);
    }

    public final void b(boolean z) {
        if (z) {
            this.l.e(cap.LANG_ID_FAILED_TO_SAVE_STATE, new Object[0]);
            f(false);
            return;
        }
        this.l.e(cap.LANG_ID_FAILED_TO_SAVE_STATE_ON_RETRY, new Object[0]);
    }

    public final boolean c() {
        return this.f.get() && ((long) this.r.b()) < ((Long) cas.n.c()).longValue();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        hkx.b("LangIdWrapper");
        if (this.f.get()) {
            f(true);
            this.o.close();
        }
    }

    public final boolean d() {
        return this.e.get() && this.f.get();
    }
}
