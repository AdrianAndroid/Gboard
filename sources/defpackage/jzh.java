package defpackage;

import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.util.Map;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: jzh  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jzh implements miy {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ jzh(IOException iOException, int i) {
        this.b = i;
        this.a = iOException;
    }

    public /* synthetic */ jzh(Map map, int i) {
        this.b = i;
        this.a = map;
    }

    public /* synthetic */ jzh(juu juuVar, int i) {
        this.b = i;
        this.a = juuVar;
    }

    public /* synthetic */ jzh(kkl kklVar, int i) {
        this.b = i;
        this.a = kklVar;
    }

    public /* synthetic */ jzh(kle kleVar, int i) {
        this.b = i;
        this.a = kleVar;
    }

    public /* synthetic */ jzh(kqd kqdVar, int i) {
        this.b = i;
        this.a = kqdVar;
    }

    public /* synthetic */ jzh(kqp kqpVar, int i) {
        this.b = i;
        this.a = kqpVar;
    }

    public /* synthetic */ jzh(kqr kqrVar, int i) {
        this.b = i;
        this.a = kqrVar;
    }

    public /* synthetic */ jzh(leq leqVar, int i) {
        this.b = i;
        this.a = leqVar;
    }

    public /* synthetic */ jzh(lzi lziVar, int i) {
        this.b = i;
        this.a = lziVar;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kqd] */
    /* JADX WARN: Type inference failed for: r0v25, types: [leq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v48, types: [mko, java.lang.Object] */
    @Override // defpackage.miy
    public final mko a(Object obj) {
        mko mkoVar;
        switch (this.b) {
            case 0:
                ((luc) ((luc) ((luc) jsh.a.c()).i((Throwable) obj)).k("com/google/android/libraries/micore/superpacks/scheduling/ScheduledDownloadTask", "lambda$download$1", 120, "ScheduledDownloadTask.java")).w("Download %s failed to stop", ((juu) this.a).f().f());
                return kcu.K(jtx.a(null));
            case 1:
                ?? r0 = this.a;
                r0.putAll((Map) obj);
                return kcu.K(r0);
            case 2:
                return ((kle) this.a).c((klf) obj);
            case 3:
                Object obj2 = this.a;
                kka kkaVar = (kka) obj;
                if (kkaVar.a == 29501) {
                    kkl kklVar = (kkl) obj2;
                    Log.w("MobStoreFlagStore", "Failed to commit due to stale snapshot for " + kklVar.b + ", triggering flag update.", kkaVar);
                    kklVar.c();
                }
                return kcu.J(kkaVar);
            case 4:
                return ((kle) this.a).c((klf) obj);
            case 5:
                return this.a.b((ngz) obj);
            case 6:
                kqp kqpVar = (kqp) this.a;
                kqpVar.c((Uri) kcu.S(kqpVar.b), obj);
                return mkk.a;
            case 7:
                Object obj3 = this.a;
                Uri uri = (Uri) obj;
                Uri g = kvj.g(uri, ".bak");
                try {
                    if (((kqp) obj3).g.v(g)) {
                        ((kqp) obj3).g.u(g, uri);
                    }
                    return mkk.a;
                } catch (IOException e) {
                    return kcu.J(e);
                }
            case 8:
                Void r7 = (Void) obj;
                kqp kqpVar2 = (kqp) this.a;
                return kcu.K(kqpVar2.b((Uri) kcu.S(kqpVar2.b)));
            case 9:
                Object obj4 = this.a;
                synchronized (((kqp) obj4).e) {
                    mkoVar = ((kqp) obj4).f;
                }
                return mkoVar;
            case 10:
                return ((kqp) ((kqr) this.a).b).a();
            case 11:
                opu opuVar = (opu) obj;
                return ((kqr) this.a).c.c();
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return kcu.K(this.a.a(obj));
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                Object obj5 = this.a;
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(obj5, (IOException) obj);
                } catch (Exception unused) {
                }
                throw ((Throwable) obj5);
            default:
                Object obj6 = this.a;
                ((lzi) obj6).g++;
                try {
                    return ((lzi) obj6).b.a();
                } catch (Exception e2) {
                    ((mik) obj6).n(e2);
                    return kcu.K(null);
                }
        }
    }
}
