package defpackage;

import android.content.BroadcastReceiver;
import android.database.sqlite.SQLiteDatabase;
import android.os.Process;
import android.util.Log;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: joq  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class joq implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ joq(BroadcastReceiver.PendingResult pendingResult, int i) {
        this.b = i;
        this.a = pendingResult;
    }

    public /* synthetic */ joq(ExecutionException executionException, int i) {
        this.b = i;
        this.a = executionException;
    }

    public /* synthetic */ joq(jol jolVar, int i) {
        this.b = i;
        this.a = jolVar;
    }

    public /* synthetic */ joq(jom jomVar, int i) {
        this.b = i;
        this.a = jomVar;
    }

    public /* synthetic */ joq(kbe kbeVar, int i) {
        this.b = i;
        this.a = kbeVar;
    }

    public /* synthetic */ joq(kdz kdzVar, int i) {
        this.b = i;
        this.a = kdzVar;
    }

    public /* synthetic */ joq(khg khgVar, int i) {
        this.b = i;
        this.a = khgVar;
    }

    public /* synthetic */ joq(kkl kklVar, int i) {
        this.b = i;
        this.a = kklVar;
    }

    public /* synthetic */ joq(kkq kkqVar, int i) {
        this.b = i;
        this.a = kkqVar;
    }

    public /* synthetic */ joq(knq knqVar, int i) {
        this.b = i;
        this.a = knqVar;
    }

    public /* synthetic */ joq(krj krjVar, int i) {
        this.b = i;
        this.a = krjVar;
    }

    public /* synthetic */ joq(mko mkoVar, int i) {
        this.b = i;
        this.a = mkoVar;
    }

    public joq(okf okfVar, int i) {
        this.b = i;
        this.a = okfVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object, okf] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, okf] */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object, okf] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object, okf] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object, okf] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object, knq] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object, knq] */
    /* JADX WARN: Type inference failed for: r0v50, types: [android.content.ComponentCallbacks, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((jol) this.a).close();
                return;
            case 1:
                for (File file : ((jom) this.a).b) {
                    file.delete();
                }
                return;
            case 2:
                kbe kbeVar = (kbe) this.a;
                kbeVar.a.b(new jiz(kbeVar, 5), 3000L, TimeUnit.MILLISECONDS);
                return;
            case 3:
                ((kdz) this.a).a();
                return;
            case 4:
                Object obj = this.a;
                try {
                    ((khg) obj).b.set(((khg) obj).c.d(((khe) ((khg) obj).a.a()).b() ? ((khe) ((khg) obj).a.a()).a : 0.0f));
                    return;
                } catch (Throwable unused) {
                    khg khgVar = (khg) obj;
                    khgVar.b.set(khgVar.c.d(0.0f));
                    return;
                }
            case 5:
                ((BroadcastReceiver.PendingResult) this.a).finish();
                return;
            case 6:
                ((kkl) this.a).c();
                return;
            case 7:
                ((kkl) this.a).b();
                return;
            case 8:
                kkl kklVar = (kkl) this.a;
                if (kklVar.c.equals("")) {
                    return;
                }
                kjj kjjVar = kklVar.a;
                mko b = kko.b(kjjVar).b(new jkz(kklVar.b, 4), kjjVar.e());
                b.d(new kht(kklVar, b, 5), kklVar.a.e());
                return;
            case 9:
                try {
                    kcu.S(this.a);
                    return;
                } catch (ExecutionException e) {
                    kki.j(new joq(e, 10));
                    return;
                }
            case 10:
                throw new RuntimeException(((ExecutionException) this.a).getCause());
            case 11:
                if (!((Boolean) ((kkq) this.a).a.a()).booleanValue()) {
                    return;
                }
                Log.i("PhenotypeProcessReaper", "Killing process to refresh experiment configuration");
                Process.killProcess(Process.myPid());
                System.exit(0);
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                this.a.a();
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                this.a.a();
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                this.a.a();
                return;
            case 15:
                this.a.a();
                return;
            case 16:
                this.a.a();
                return;
            case 17:
                this.a.b();
                return;
            case 18:
                this.a.a();
                return;
            case 19:
                Object obj2 = this.a;
                synchronized (((krj) obj2).i) {
                    if (((krj) obj2).l == 0) {
                        ((krj) obj2).e();
                    }
                }
                return;
            default:
                ?? r0 = this.a;
                krj krjVar = (krj) r0;
                synchronized (krjVar.i) {
                    mko mkoVar = ((krj) r0).k;
                    if (((krj) r0).l == 0 && mkoVar != null) {
                        ((krj) r0).k = null;
                        if (!mkoVar.cancel(true)) {
                            try {
                                ((SQLiteDatabase) kcu.S(mkoVar)).close();
                            } catch (ExecutionException unused2) {
                            }
                        }
                        krjVar.b.unregisterComponentCallbacks(r0);
                        Iterator it = krjVar.h.iterator();
                        while (it.hasNext()) {
                            if (((WeakReference) it.next()).get() == null) {
                                it.remove();
                            }
                        }
                        return;
                    }
                    return;
                }
        }
    }
}
