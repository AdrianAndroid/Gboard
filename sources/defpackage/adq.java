package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
/* renamed from: adq  reason: default package */
/* loaded from: classes.dex */
public final class adq {
    public static final Object a = new Object();
    public static volatile adq b;
    public final ReadWriteLock c;
    public final Set d;
    public int e;
    public final Handler f = new Handler(Looper.getMainLooper());
    public final adm g;
    final adp h;
    public final ado i;

    public adq(adn adnVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.c = reentrantReadWriteLock;
        this.e = 3;
        this.h = adnVar.a;
        this.i = adnVar.c;
        qq qqVar = new qq();
        this.d = qqVar;
        Set set = adnVar.b;
        if (set != null && !set.isEmpty()) {
            qqVar.addAll(set);
        }
        adl adlVar = new adl(this);
        this.g = adlVar;
        reentrantReadWriteLock.writeLock().lock();
        try {
            this.e = 0;
            reentrantReadWriteLock.writeLock().unlock();
            if (a() != 0) {
                return;
            }
            try {
                adl adlVar2 = adlVar;
                opu opuVar = new opu(adlVar);
                adl adlVar3 = adlVar;
                adp adpVar = adlVar.c.h;
                synchronized (((adv) adpVar).a) {
                    if (((adv) adpVar).b == null) {
                        ((adv) adpVar).c = new HandlerThread("emojiCompat", 10);
                        ((adv) adpVar).c.start();
                        ((adv) adpVar).b = new Handler(((adv) adpVar).c.getLooper());
                    }
                    ((adv) adpVar).b.post(new bw((adv) adpVar, opuVar, 14, null, null, null, null));
                }
            } catch (Throwable th) {
                adlVar.c.d(th);
            }
        } catch (Throwable th2) {
            this.c.writeLock().unlock();
            throw th2;
        }
    }

    public static adq b() {
        adq adqVar;
        synchronized (a) {
            nq.d(b != null, "EmojiCompat is not initialized. Please call EmojiCompat.init() first");
            adqVar = b;
        }
        return adqVar;
    }

    public final int a() {
        this.c.readLock().lock();
        try {
            return this.e;
        } finally {
            this.c.readLock().unlock();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x016d, code lost:
        ((defpackage.aee) r17).b();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a4 A[Catch: all -> 0x0175, TryCatch #0 {all -> 0x0175, blocks: (B:105:0x0071, B:108:0x0076, B:110:0x007a, B:112:0x0089, B:26:0x0094, B:28:0x009e, B:32:0x00a4, B:34:0x00b0, B:36:0x00b3, B:40:0x00c1, B:46:0x00d0, B:47:0x00de, B:50:0x00f7, B:71:0x0103, B:76:0x010f, B:77:0x0114, B:63:0x011f, B:66:0x0126, B:53:0x012b, B:55:0x0136, B:79:0x013d, B:83:0x0147, B:86:0x0153, B:87:0x0158, B:24:0x008f), top: B:104:0x0071 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00fe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0153 A[Catch: all -> 0x0175, TryCatch #0 {all -> 0x0175, blocks: (B:105:0x0071, B:108:0x0076, B:110:0x007a, B:112:0x0089, B:26:0x0094, B:28:0x009e, B:32:0x00a4, B:34:0x00b0, B:36:0x00b3, B:40:0x00c1, B:46:0x00d0, B:47:0x00de, B:50:0x00f7, B:71:0x0103, B:76:0x010f, B:77:0x0114, B:63:0x011f, B:66:0x0126, B:53:0x012b, B:55:0x0136, B:79:0x013d, B:83:0x0147, B:86:0x0153, B:87:0x0158, B:24:0x008f), top: B:104:0x0071 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v14, types: [java.lang.CharSequence] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.CharSequence c(java.lang.CharSequence r17, int r18, int r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adq.c(java.lang.CharSequence, int, int, int, int):java.lang.CharSequence");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.c.writeLock().lock();
        try {
            this.e = 2;
            arrayList.addAll(this.d);
            this.d.clear();
            this.c.writeLock().unlock();
            this.f.post(new amh(arrayList, this.e, 1));
        } catch (Throwable th2) {
            this.c.writeLock().unlock();
            throw th2;
        }
    }

    public final boolean e() {
        return a() == 1;
    }
}
