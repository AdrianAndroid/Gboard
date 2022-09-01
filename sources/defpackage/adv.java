package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: adv  reason: default package */
/* loaded from: classes.dex */
public final class adv implements adp {
    public final Object a = new Object();
    public Handler b;
    public HandlerThread c;
    public ezd d;
    public opu e;
    private final Context f;
    private final xd g;
    private ContentObserver h;
    private Runnable i;

    public adv(Context context, xd xdVar) {
        this.f = context.getApplicationContext();
        this.g = xdVar;
    }

    private final void b() {
        this.e = null;
        ContentObserver contentObserver = this.h;
        if (contentObserver != null) {
            this.f.getContentResolver().unregisterContentObserver(contentObserver);
            this.h = null;
        }
        synchronized (this.a) {
            this.b.removeCallbacks(this.i);
            HandlerThread handlerThread = this.c;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            this.b = null;
            this.c = null;
        }
    }

    public final void a() {
        long j;
        long j2;
        long min;
        if (this.e != null) {
            try {
                try {
                    krm a = xc.a(this.f, this.g);
                    if (a.a != 0) {
                        throw new RuntimeException("fetchFonts failed (" + a.a + ")");
                    }
                    Object obj = a.b;
                    if (obj == null || ((gjk[]) obj).length == 0) {
                        throw new RuntimeException("fetchFonts failed (empty result)");
                    }
                    gjk gjkVar = ((gjk[]) obj)[0];
                    int i = gjkVar.d;
                    if (i == 2) {
                        synchronized (this.a) {
                            ezd ezdVar = this.d;
                            if (ezdVar != null) {
                                if (ezdVar.a == 0) {
                                    ezdVar.a = SystemClock.uptimeMillis();
                                    min = 0;
                                } else {
                                    long uptimeMillis = SystemClock.uptimeMillis() - ezdVar.a;
                                    min = uptimeMillis > 600000 ? -1L : Math.min(Math.max(uptimeMillis, 1000L), 600000 - uptimeMillis);
                                }
                                if (min >= 0) {
                                    Object obj2 = gjkVar.e;
                                    synchronized (this.a) {
                                        if (this.h == null) {
                                            adu aduVar = new adu(this, this.b);
                                            this.h = aduVar;
                                            this.f.getContentResolver().registerContentObserver((Uri) obj2, false, aduVar);
                                        }
                                        if (this.i == null) {
                                            this.i = new od(this, 11);
                                        }
                                        this.b.postDelayed(this.i, min);
                                    }
                                    return;
                                }
                            }
                            i = 2;
                        }
                    }
                    if (i == 0) {
                        Typeface e = vu.e(this.f, new gjk[]{gjkVar}, 0);
                        ByteBuffer f = lc.f(this.f, (Uri) gjkVar.e);
                        if (f != null) {
                            opu opuVar = this.e;
                            ByteBuffer duplicate = f.duplicate();
                            duplicate.order(ByteOrder.BIG_ENDIAN);
                            ut.e(4, duplicate);
                            char c = (char) duplicate.getShort();
                            if (c > 'd') {
                                throw new IOException("Cannot read metadata.");
                            }
                            ut.e(6, duplicate);
                            int i2 = 0;
                            while (true) {
                                if (i2 >= c) {
                                    j = -1;
                                    j2 = -1;
                                    break;
                                }
                                int i3 = duplicate.getInt();
                                ut.e(4, duplicate);
                                j2 = ut.d(duplicate);
                                ut.e(4, duplicate);
                                if (i3 == 1835365473) {
                                    j = -1;
                                    break;
                                }
                                i2++;
                            }
                            if (j2 != j) {
                                ut.e((int) (j2 - duplicate.position()), duplicate);
                                ut.e(12, duplicate);
                                long d = ut.d(duplicate);
                                for (int i4 = 0; i4 < d; i4++) {
                                    int i5 = duplicate.getInt();
                                    long d2 = ut.d(duplicate);
                                    ut.d(duplicate);
                                    if (i5 != 1164798569 && i5 != 1701669481) {
                                    }
                                    duplicate.position((int) (d2 + j2));
                                    ajj ajjVar = new ajj();
                                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                                    ajjVar.d(duplicate.getInt(duplicate.position()) + duplicate.position(), duplicate);
                                    bhc bhcVar = new bhc(e, ajjVar);
                                    Object obj3 = opuVar.a;
                                    ((adl) obj3).a = bhcVar;
                                    ((adl) obj3).b = new bek(((adl) obj3).a, ((adl) obj3).c.i, null, null);
                                    adq adqVar = ((adl) obj3).c;
                                    ArrayList arrayList = new ArrayList();
                                    adqVar.c.writeLock().lock();
                                    adqVar.e = 1;
                                    arrayList.addAll(adqVar.d);
                                    adqVar.d.clear();
                                    adqVar.c.writeLock().unlock();
                                    adqVar.f.post(new amh(arrayList, adqVar.e, 1));
                                    b();
                                    return;
                                }
                            }
                            throw new IOException("Cannot read metadata.");
                        }
                        throw new RuntimeException("Unable to open file.");
                    }
                    throw new RuntimeException("fetchFonts result is not OK. (" + i + ")");
                } catch (PackageManager.NameNotFoundException e2) {
                    throw new RuntimeException("provider not found", e2);
                }
            } catch (Throwable th) {
                ((adl) this.e.a).c.d(th);
                b();
            }
        }
    }
}
