package defpackage;

import android.os.SystemClock;
import com.google.android.libraries.assistant.trainingcache.bindings.EkhoWriter;
import com.google.android.libraries.inputmethod.nativelib.NativeLibHelper;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: PG */
/* renamed from: evq  reason: default package */
/* loaded from: classes.dex */
public final class evq implements ewd {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/trainingcache/ekho/BackgroundEkhoWriter");
    public final lgb b;
    public final idk c;
    public EkhoWriter d;
    private final mkr f;
    private final ConcurrentLinkedQueue e = new ConcurrentLinkedQueue();
    private boolean g = false;

    public evq(lgb lgbVar, mkr mkrVar, idk idkVar) {
        this.b = lgbVar;
        this.f = mkrVar;
        this.c = idkVar;
    }

    private final mko e() {
        return this.f.hQ(new evl(this, 3));
    }

    private final void f(String str, lfr lfrVar) {
        this.e.add(mhu.g(mio.g(e(), new ebi(lfrVar, 9), this.f), Throwable.class, new ebi(str, 10), this.f));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final EkhoWriter a() {
        if (this.g) {
            throw new UnsatisfiedLinkError("Previously failed to load native library.");
        }
        try {
            NativeLibHelper.a("gboard_soda_jni", true);
            return new EkhoWriter();
        } catch (UnsatisfiedLinkError e) {
            this.g = true;
            throw e;
        }
    }

    @Override // defpackage.ewd
    public final mko b() {
        this.c.e(evu.CLEAR_START, new Object[0]);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        mko g = mio.g(e(), eki.c, this.f);
        kcu.U(g, new evm(this, elapsedRealtime, 2), this.f);
        return g;
    }

    @Override // defpackage.ewd
    public final void c(final int i, final nni nniVar, final lfr lfrVar) {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        f(String.format("cacheEvent() %s", nniVar.name()), new lfr() { // from class: evo
            @Override // defpackage.lfr
            public final void a(Object obj) {
                evq evqVar = evq.this;
                nni nniVar2 = nniVar;
                int i2 = i;
                lfr lfrVar2 = lfrVar;
                long j = elapsedRealtime;
                gil gilVar = new gil((EkhoWriter) obj, nniVar2);
                gilVar.b = i2;
                lfrVar2.a(gilVar);
                long a2 = ((EkhoWriter) gilVar.c).a();
                int i3 = ((nni) gilVar.d).aq;
                int i4 = gilVar.b;
                int i5 = i4 - 1;
                if (i4 == 0) {
                    throw null;
                }
                EkhoWriter.nativeCacheEvent(a2, i3, i5, gilVar.a, null, null);
                evqVar.c.g(evx.CACHE_EVENT, SystemClock.elapsedRealtime() - j);
            }
        });
    }

    @Override // defpackage.ewd
    public final void d() {
        f("beginSession()", new lfr() { // from class: evp
            @Override // defpackage.lfr
            public final void a(Object obj) {
                EkhoWriter.nativeBeginSession(((EkhoWriter) obj).a(), 200);
            }
        });
    }
}
