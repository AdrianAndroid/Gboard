package defpackage;

import android.net.TrafficStats;
import android.util.Log;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.CronetException;
import org.chromium.net.InlineExecutionProhibitedException;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: oxa  reason: default package */
/* loaded from: classes2.dex */
public final class oxa extends oxe {
    public static final String a = "oxa";
    public final owy b;
    public final Executor c;
    public final String d;
    public final boolean h;
    public String i;
    public oxj j;
    public Executor k;
    public String m;
    public ReadableByteChannel n;
    public oxh o;
    public String p;
    public HttpURLConnection q;
    public ows r;
    public final Map e = new TreeMap(String.CASE_INSENSITIVE_ORDER);
    public final List f = new ArrayList();
    public final AtomicInteger g = new AtomicInteger(0);
    private final AtomicBoolean s = new AtomicBoolean(false);
    public volatile int l = -1;

    public oxa(UrlRequest.Callback callback, Executor executor, Executor executor2, String str, String str2, boolean z, boolean z2, int i, boolean z3, int i2) {
        this.h = z;
        this.b = new owy(this, callback, executor2);
        this.c = new owz(new owu(executor, !z2 ? TrafficStats.getThreadStatsTag() : i, z3, i2));
        this.m = str;
        this.d = str2;
    }

    public final Runnable a(oxb oxbVar) {
        return new owt(this, oxbVar, 3);
    }

    public final Runnable b(oxb oxbVar) {
        return new owt(this, oxbVar, 1);
    }

    public final void c() {
        int i = this.g.get();
        if (i == 0) {
            return;
        }
        throw new IllegalStateException("Request is already started. State is: " + i);
    }

    @Override // org.chromium.net.UrlRequest
    public final void cancel() {
        int andSet = this.g.getAndSet(8);
        if (andSet == 1 || andSet == 2 || andSet == 3 || andSet == 4 || andSet == 5) {
            h();
            g();
            owy owyVar = this.b;
            oxh oxhVar = this.o;
            owyVar.d.d();
            owyVar.b.execute(new owt(owyVar, oxhVar, 5));
        }
    }

    public final void d() {
        this.c.execute(new owv(this, 1));
    }

    public final void e(CronetException cronetException) {
        int i;
        do {
            i = this.g.get();
            if (i == 0) {
                throw new IllegalStateException("Can't enter error state before start");
            }
            if (i == 6 || i == 7 || i == 8) {
                return;
            }
        } while (!this.g.compareAndSet(i, 6));
        h();
        g();
        owy owyVar = this.b;
        oxh oxhVar = this.o;
        owyVar.d.d();
        owx owxVar = new owx(owyVar, oxhVar, cronetException, 0);
        try {
            owyVar.b.execute(owxVar);
        } catch (InlineExecutionProhibitedException unused) {
            Executor executor = owyVar.c;
            if (executor == null) {
                return;
            }
            executor.execute(owxVar);
        }
    }

    public final void f(Throwable th) {
        e(new owh("Exception received from UploadDataProvider", th));
    }

    @Override // org.chromium.net.UrlRequest
    public final void followRedirect() {
        k(3, 1, new owv(this, 2));
    }

    public final void g() {
        if (this.j == null || !this.s.compareAndSet(false, true)) {
            return;
        }
        try {
            this.k.execute(b(new owq(this, 5)));
        } catch (RejectedExecutionException e) {
            Log.e(a, "Exception when closing uploadDataProvider", e);
        }
    }

    @Override // org.chromium.net.UrlRequest
    public final void getStatus(UrlRequest.StatusListener statusListener) {
        int i = this.g.get();
        int i2 = this.l;
        switch (i) {
            case 0:
            case 6:
            case 7:
            case 8:
                i2 = -1;
                break;
            case 1:
                break;
            case 2:
            case 3:
            case 4:
                i2 = 0;
                break;
            case 5:
                i2 = 14;
                break;
            default:
                throw new IllegalStateException("Switch is exhaustive: " + i);
        }
        this.b.b.execute(new dob(new oxl(statusListener), i2, 18));
    }

    public final void h() {
        this.c.execute(new obv(this, 20));
    }

    public final void i() {
        this.l = 13;
        this.c.execute(a(new owq(this, 4)));
    }

    @Override // org.chromium.net.UrlRequest
    public final boolean isDone() {
        int i = this.g.get();
        return i == 7 || i == 6 || i == 8;
    }

    public final void j() {
        this.c.execute(a(new owq(this, 6)));
    }

    public final void k(int i, int i2, Runnable runnable) {
        if (!this.g.compareAndSet(i, i2)) {
            int i3 = this.g.get();
            if (i3 == 8 || i3 == 6) {
                return;
            }
            throw new IllegalStateException("Invalid state transition - expected " + i + " but was " + i3);
        }
        runnable.run();
    }

    @Override // org.chromium.net.UrlRequest
    public final void read(ByteBuffer byteBuffer) {
        if (byteBuffer.isDirect()) {
            if (byteBuffer.hasRemaining()) {
                k(4, 5, new owt(this, byteBuffer, 0));
                return;
            }
            throw new IllegalArgumentException("ByteBuffer is already full.");
        }
        throw new IllegalArgumentException("byteBuffer must be a direct ByteBuffer.");
    }

    @Override // org.chromium.net.UrlRequest
    public final void start() {
        this.l = 10;
        k(0, 1, new owv(this, 0));
    }
}
