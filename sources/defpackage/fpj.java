package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: fpj  reason: default package */
/* loaded from: classes.dex */
public final class fpj implements Handler.Callback {
    public static final Status a = new Status(4, "Sign-out occurred while this API call was in progress.");
    public static final Status b = new Status(4, "The user must be signed in to make this API call.");
    public static final Object c = new Object();
    private static fpj p;
    public final Context f;
    public final fmx g;
    public final Handler m;
    public volatile boolean n;
    public final ita o;
    private fru q;
    private fsb s;
    public long d = 10000;
    public boolean e = false;
    public final AtomicInteger h = new AtomicInteger(1);
    public final AtomicInteger i = new AtomicInteger(0);
    public final Map j = new ConcurrentHashMap(5, 0.75f, 1);
    public fpd k = null;
    public final Set l = new qq();
    private final Set r = new qq();

    private fpj(Context context, Looper looper, fmx fmxVar) {
        boolean z = true;
        this.n = true;
        this.f = context;
        gco gcoVar = new gco(looper, this);
        this.m = gcoVar;
        this.g = fmxVar;
        this.o = new ita(fmxVar);
        PackageManager packageManager = context.getPackageManager();
        if (fyb.c == null) {
            fyb.c = Boolean.valueOf((!fyb.t() || !packageManager.hasSystemFeature("android.hardware.type.automotive")) ? false : z);
        }
        if (fyb.c.booleanValue()) {
            this.n = false;
        }
        gcoVar.sendMessage(gcoVar.obtainMessage(6));
    }

    public static Status a(Cfor cfor, fmt fmtVar) {
        Object obj = cfor.a.a;
        String valueOf = String.valueOf(fmtVar);
        return new Status(1, 17, "API: " + ((String) obj) + " is not available on this device. Connection failed with: " + valueOf, fmtVar.d, fmtVar);
    }

    public static fpj c(Context context) {
        fpj fpjVar;
        HandlerThread handlerThread;
        synchronized (c) {
            if (p == null) {
                synchronized (frc.a) {
                    handlerThread = frc.b;
                    if (handlerThread == null) {
                        frc.b = new HandlerThread("GoogleApiHandler", 9);
                        frc.b.start();
                        handlerThread = frc.b;
                    }
                }
                p = new fpj(context.getApplicationContext(), handlerThread.getLooper(), fmx.a);
            }
            fpjVar = p;
        }
        return fpjVar;
    }

    private final fpg j(fnz fnzVar) {
        Cfor cfor = fnzVar.e;
        fpg fpgVar = (fpg) this.j.get(cfor);
        if (fpgVar == null) {
            fpgVar = new fpg(this, fnzVar);
            this.j.put(cfor, fpgVar);
        }
        if (fpgVar.o()) {
            this.r.add(cfor);
        }
        fpgVar.d();
        return fpgVar;
    }

    private final void k() {
        fru fruVar = this.q;
        if (fruVar != null) {
            if (fruVar.a > 0 || g()) {
                l().a(fruVar);
            }
            this.q = null;
        }
    }

    private final fsb l() {
        if (this.s == null) {
            this.s = new fsb(this.f, frv.b);
        }
        return this.s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final fpg b(Cfor cfor) {
        return (fpg) this.j.get(cfor);
    }

    public final void d(fmt fmtVar, int i) {
        if (!h(fmtVar, i)) {
            Handler handler = this.m;
            handler.sendMessage(handler.obtainMessage(5, i, 0, fmtVar));
        }
    }

    public final void e() {
        Handler handler = this.m;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void f(fpd fpdVar) {
        synchronized (c) {
            if (this.k != fpdVar) {
                this.k = fpdVar;
                this.l.clear();
            }
            this.l.addAll(fpdVar.e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean g() {
        if (this.e) {
            return false;
        }
        frt frtVar = frs.a().a;
        if (frtVar != null && !frtVar.b) {
            return false;
        }
        int f = this.o.f(203400000);
        return f == -1 || f == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean h(fmt fmtVar, int i) {
        fmx fmxVar = this.g;
        Context context = this.f;
        if (fyb.s(context)) {
            return false;
        }
        PendingIntent h = fmtVar.a() ? fmtVar.d : fmxVar.h(context, fmtVar.c, null);
        if (h == null) {
            return false;
        }
        fmxVar.c(context, fmtVar.c, gcm.a(context, GoogleApiActivity.a(context, h, i, true), gcm.a | 134217728));
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v58, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.util.Map, java.lang.Object] */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        Status status;
        fmv[] b2;
        long j = 300000;
        fpg fpgVar = null;
        switch (message.what) {
            case 1:
                if (true == ((Boolean) message.obj).booleanValue()) {
                    j = 10000;
                }
                this.d = j;
                this.m.removeMessages(12);
                for (Cfor cfor : this.j.keySet()) {
                    Handler handler = this.m;
                    handler.sendMessageDelayed(handler.obtainMessage(12, cfor), this.d);
                }
                break;
            case 2:
                fhr fhrVar = (fhr) message.obj;
                throw null;
            case 3:
                for (fpg fpgVar2 : this.j.values()) {
                    fpgVar2.c();
                    fpgVar2.d();
                }
                break;
            case 4:
            case 8:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                nwo nwoVar = (nwo) message.obj;
                fpg fpgVar3 = (fpg) this.j.get(((fnz) nwoVar.b).e);
                if (fpgVar3 == null) {
                    fpgVar3 = j((fnz) nwoVar.b);
                }
                if (!fpgVar3.o() || this.i.get() == nwoVar.a) {
                    fpgVar3.e((foq) nwoVar.c);
                    break;
                } else {
                    ((foq) nwoVar.c).d(a);
                    fpgVar3.m();
                    break;
                }
            case 5:
                int i = message.arg1;
                fmt fmtVar = (fmt) message.obj;
                Iterator it = this.j.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        fpg fpgVar4 = (fpg) it.next();
                        if (fpgVar4.e == i) {
                            fpgVar = fpgVar4;
                        }
                    }
                }
                if (fpgVar != null) {
                    if (fmtVar.c != 13) {
                        fpgVar.f(a(fpgVar.c, fmtVar));
                        break;
                    } else {
                        int i2 = fnn.c;
                        String str = fmtVar.e;
                        fpgVar.f(new Status(17, "Error resolution was canceled by the user, original error message: " + fnn.i() + ": " + str));
                        break;
                    }
                } else {
                    Log.wtf("GoogleApiManager", "Could not find API instance " + i + " while trying to fail enqueued calls.", new Exception());
                    break;
                }
            case 6:
                if (this.f.getApplicationContext() instanceof Application) {
                    fot.b((Application) this.f.getApplicationContext());
                    fot.a.a(new fpf(this));
                    fot fotVar = fot.a;
                    if (!fotVar.c.get()) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!fotVar.c.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            fotVar.b.set(true);
                        }
                    }
                    if (!fotVar.c()) {
                        this.d = 300000L;
                        break;
                    }
                }
                break;
            case 7:
                j((fnz) message.obj);
                break;
            case 9:
                if (this.j.containsKey(message.obj)) {
                    fpg fpgVar5 = (fpg) this.j.get(message.obj);
                    fyb.aA(fpgVar5.i.m);
                    if (fpgVar5.f) {
                        fpgVar5.d();
                        break;
                    }
                }
                break;
            case 10:
                for (Cfor cfor2 : this.r) {
                    fpg fpgVar6 = (fpg) this.j.remove(cfor2);
                    if (fpgVar6 != null) {
                        fpgVar6.m();
                    }
                }
                this.r.clear();
                break;
            case 11:
                if (this.j.containsKey(message.obj)) {
                    fpg fpgVar7 = (fpg) this.j.get(message.obj);
                    fyb.aA(fpgVar7.i.m);
                    if (fpgVar7.f) {
                        fpgVar7.n();
                        fpj fpjVar = fpgVar7.i;
                        if (fpjVar.g.e(fpjVar.f) == 18) {
                            status = new Status(21, "Connection timed out waiting for Google Play services update to complete.");
                        } else {
                            status = new Status(22, "API failed to connect while resuming due to an unknown error.");
                        }
                        fpgVar7.f(status);
                        fpgVar7.b.f("Timing out connection while resuming.");
                        break;
                    }
                }
                break;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                if (this.j.containsKey(message.obj)) {
                    fpg fpgVar8 = (fpg) this.j.get(message.obj);
                    fyb.aA(fpgVar8.i.m);
                    if (fpgVar8.b.m() && fpgVar8.d.size() == 0) {
                        ijk ijkVar = fpgVar8.j;
                        if (!ijkVar.b.isEmpty() || !ijkVar.a.isEmpty()) {
                            fpgVar8.l();
                            break;
                        } else {
                            fpgVar8.b.f("Timing out service connection.");
                            break;
                        }
                    }
                }
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                fhr fhrVar2 = (fhr) message.obj;
                throw null;
            case 15:
                fph fphVar = (fph) message.obj;
                if (this.j.containsKey(fphVar.a)) {
                    fpg fpgVar9 = (fpg) this.j.get(fphVar.a);
                    if (fpgVar9.g.contains(fphVar) && !fpgVar9.f) {
                        if (!fpgVar9.b.m()) {
                            fpgVar9.d();
                            break;
                        } else {
                            fpgVar9.g();
                            break;
                        }
                    }
                }
                break;
            case 16:
                fph fphVar2 = (fph) message.obj;
                if (this.j.containsKey(fphVar2.a)) {
                    fpg fpgVar10 = (fpg) this.j.get(fphVar2.a);
                    if (fpgVar10.g.remove(fphVar2)) {
                        fpgVar10.i.m.removeMessages(15, fphVar2);
                        fpgVar10.i.m.removeMessages(16, fphVar2);
                        fmv fmvVar = fphVar2.b;
                        ArrayList arrayList = new ArrayList(fpgVar10.a.size());
                        for (foq foqVar : fpgVar10.a) {
                            if ((foqVar instanceof fok) && (b2 = ((fok) foqVar).b(fpgVar10)) != null) {
                                int i3 = 0;
                                while (true) {
                                    if (i3 > 0) {
                                        break;
                                    } else if (!fyb.aJ(b2[i3], fmvVar)) {
                                        i3++;
                                    } else if (i3 >= 0) {
                                        arrayList.add(foqVar);
                                    }
                                }
                            }
                        }
                        int size = arrayList.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            foq foqVar2 = (foq) arrayList.get(i4);
                            fpgVar10.a.remove(foqVar2);
                            foqVar2.e(new foj(fmvVar));
                        }
                        break;
                    }
                }
                break;
            case 17:
                k();
                break;
            case 18:
                fpv fpvVar = (fpv) message.obj;
                if (fpvVar.c == 0) {
                    l().a(new fru(fpvVar.b, Arrays.asList(fpvVar.a)));
                    break;
                } else {
                    fru fruVar = this.q;
                    if (fruVar != null) {
                        List list = fruVar.b;
                        if (fruVar.a != fpvVar.b || (list != null && list.size() >= fpvVar.d)) {
                            this.m.removeMessages(17);
                            k();
                        } else {
                            fru fruVar2 = this.q;
                            fro froVar = fpvVar.a;
                            if (fruVar2.b == null) {
                                fruVar2.b = new ArrayList();
                            }
                            fruVar2.b.add(froVar);
                        }
                    }
                    if (this.q == null) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(fpvVar.a);
                        this.q = new fru(fpvVar.b, arrayList2);
                        Handler handler2 = this.m;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), fpvVar.c);
                        break;
                    }
                }
                break;
            case 19:
                this.e = false;
                break;
            default:
                int i5 = message.what;
                Log.w("GoogleApiManager", "Unknown message id: " + i5);
                return false;
        }
        return true;
    }

    public final void i(fxa fxaVar, int i, fnz fnzVar) {
        boolean z;
        if (i != 0) {
            Cfor cfor = fnzVar.e;
            fpu fpuVar = null;
            if (g()) {
                frt frtVar = frs.a().a;
                if (frtVar == null) {
                    z = true;
                } else if (frtVar.b) {
                    z = frtVar.c;
                    fpg b2 = b(cfor);
                    if (b2 != null) {
                        fnw fnwVar = b2.b;
                        if (fnwVar instanceof fqq) {
                            fqq fqqVar = (fqq) fnwVar;
                            if (fqqVar.B() && !fqqVar.n()) {
                                fqv b3 = fpu.b(b2, fqqVar, i);
                                if (b3 != null) {
                                    b2.h++;
                                    z = b3.c;
                                }
                            }
                        }
                    }
                }
                long j = 0;
                long currentTimeMillis = z ? System.currentTimeMillis() : 0L;
                if (z) {
                    j = SystemClock.elapsedRealtime();
                }
                fpuVar = new fpu(this, i, cfor, currentTimeMillis, j);
            }
            if (fpuVar == null) {
                return;
            }
            Object obj = fxaVar.a;
            Handler handler = this.m;
            Objects.requireNonNull(handler);
            ((gen) obj).g(new glh(handler, 1), fpuVar);
        }
    }
}
