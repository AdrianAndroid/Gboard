package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: ayg  reason: default package */
/* loaded from: classes.dex */
public final class ayg implements aye {
    private final File a;
    private auc b;
    private final azp d = new azp((byte[]) null);
    private final azp c = new azp();

    @Deprecated
    public ayg(File file) {
        this.a = file;
    }

    private final synchronized auc c() {
        if (this.b == null) {
            File file = this.a;
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    auc.e(file2, file3, false);
                }
            }
            auc aucVar = new auc(file);
            if (aucVar.b.exists()) {
                try {
                    aucVar.c();
                    auc.b(aucVar.c);
                    Iterator it = aucVar.g.values().iterator();
                    while (it.hasNext()) {
                        aub aubVar = (aub) it.next();
                        if (aubVar.f == null) {
                            for (int i = 0; i < aucVar.d; i = 1) {
                                aucVar.e += aubVar.b[0];
                            }
                        } else {
                            aubVar.f = null;
                            for (int i2 = 0; i2 < aucVar.d; i2 = 1) {
                                auc.b(aubVar.c());
                                auc.b(aubVar.d());
                            }
                            it.remove();
                        }
                    }
                } catch (IOException e) {
                    System.out.println("DiskLruCache " + file.toString() + " is corrupt: " + e.getMessage() + ", removing");
                    aucVar.close();
                    auf.b(aucVar.a);
                }
                this.b = aucVar;
            }
            file.mkdirs();
            aucVar = new auc(file);
            aucVar.d();
            this.b = aucVar;
        }
        return this.b;
    }

    @Override // defpackage.aye
    public final File a(auw auwVar) {
        try {
            aqq j = c().j(this.c.f(auwVar));
            if (j == null) {
                return null;
            }
            return ((File[]) j.a)[0];
        } catch (IOException e) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, auo] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.concurrent.locks.Lock, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.util.Map, java.lang.Object] */
    @Override // defpackage.aye
    public final void b(auw auwVar, fws fwsVar) {
        otj otjVar;
        azp azpVar;
        auc c;
        File d;
        String f = this.c.f(auwVar);
        azp azpVar2 = this.d;
        synchronized (azpVar2) {
            otjVar = (otj) azpVar2.a.get(f);
            if (otjVar == null) {
                Object obj = azpVar2.b;
                synchronized (((aqr) obj).a) {
                    otjVar = (otj) ((aqr) obj).a.poll();
                }
                if (otjVar == null) {
                    otjVar = new otj((byte[]) null);
                }
                azpVar2.a.put(f, otjVar);
            }
            otjVar.a++;
        }
        otjVar.b.lock();
        try {
            try {
                c = c();
            } catch (Throwable th) {
                this.d.g(f);
                throw th;
            }
        } catch (IOException e) {
            if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e);
            }
        }
        if (c.j(f) == null) {
            aua h = c.h(f);
            if (h != null) {
                try {
                    synchronized (h.d) {
                        aub aubVar = h.a;
                        if (aubVar.f == h) {
                            if (!aubVar.e) {
                                h.b[0] = true;
                            }
                            d = aubVar.d();
                            h.d.a.mkdirs();
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    if (fwsVar.a.a(fwsVar.b, d, (ava) fwsVar.c)) {
                        h.d.a(h, true);
                        h.c = true;
                    }
                    azpVar = this.d;
                    azpVar.g(f);
                } finally {
                    h.b();
                }
            }
            throw new IllegalStateException("Had two simultaneous puts for: " + f);
        }
        azpVar = this.d;
        azpVar.g(f);
    }
}
