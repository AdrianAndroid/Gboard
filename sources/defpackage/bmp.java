package defpackage;

import android.util.Log;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.Queue;

/* compiled from: PG */
/* renamed from: bmp  reason: default package */
/* loaded from: classes.dex */
public final class bmp extends bly {
    private static final ltg e = ltg.j("com/google/android/apps/gsa/shared/io/QueueDataSource");
    public final Object a = new Object();
    public final Queue b = new ArrayDeque();
    public final Queue c = new ArrayDeque();
    public ByteBuffer d;
    private final bll f;
    private blj g;

    public bmp(bll bllVar) {
        this.f = bllVar;
    }

    private final void i() {
        while (!this.b.isEmpty() && h()) {
            if (this.c.isEmpty()) {
                j();
            }
            ((mld) this.b.remove()).c((blj) this.c.remove());
        }
        boolean z = false;
        if (this.g != null) {
            while (!this.b.isEmpty()) {
                ((mld) this.b.remove()).c(this.g);
            }
            jdg.F(this.d == null);
        }
        if (this.b.isEmpty() || !h()) {
            z = true;
        }
        jdg.F(z);
    }

    private final void j() {
        boolean z = true;
        jdg.F(this.g == null);
        ByteBuffer byteBuffer = this.d;
        jdg.u(byteBuffer);
        if (byteBuffer.position() <= 0) {
            z = false;
        }
        jdg.F(z);
        if (byteBuffer.isDirect()) {
            this.c.add(this.f.a(byteBuffer));
            this.d = null;
            return;
        }
        byteBuffer.flip();
        while (byteBuffer.hasRemaining()) {
            ByteBuffer b = this.f.b();
            bvq.j(byteBuffer, b);
            this.c.add(this.f.a(b));
        }
        byteBuffer.clear();
        this.d = byteBuffer;
    }

    private final void k() {
        jdg.u(this.d);
        boolean z = true;
        jdg.F(this.d.position() == 0);
        jdg.u(this.d);
        if (this.d.isDirect()) {
            this.f.d(this.d);
        } else {
            bll bllVar = this.f;
            byte[] array = this.d.array();
            if (array.length == 32768) {
                Map map = bllVar.g;
                if (map != null) {
                    if (map.remove(new blk(array)) == null) {
                        z = false;
                    }
                    jdg.F(z);
                }
                synchronized (bllVar.a) {
                    if (bllVar.b.size() < 4) {
                        bllVar.b.add(array);
                        bllVar.d.incrementAndGet();
                    } else {
                        bllVar.e.incrementAndGet();
                    }
                }
            } else {
                bllVar.f.incrementAndGet();
            }
        }
        this.d = null;
    }

    @Override // defpackage.blw
    public final int a() {
        return -1;
    }

    @Override // defpackage.blw
    public final mko b() {
        mld e2;
        synchronized (this.a) {
            e2 = mld.e();
            this.b.add(e2);
            i();
        }
        return e2;
    }

    @Override // defpackage.blw
    public final void c() {
        synchronized (this.a) {
            while (!this.c.isEmpty()) {
                ((blj) this.c.remove()).b();
            }
            ByteBuffer byteBuffer = this.d;
            if (byteBuffer != null) {
                byteBuffer.clear();
                k();
            }
            this.g = new blj(new blb(262182));
            i();
        }
    }

    public final void f(blj bljVar) {
        synchronized (this.a) {
            boolean z = false;
            if (this.g != null) {
                if (this.d == null) {
                    z = true;
                }
                jdg.F(z);
                bljVar.b();
                return;
            }
            if (this.b.isEmpty() || !h()) {
                z = true;
            }
            jdg.F(z);
            ByteBuffer byteBuffer = this.d;
            if (byteBuffer != null && byteBuffer.position() > 0) {
                j();
            }
            if (bljVar.c == 1) {
                this.c.add(bljVar);
            } else {
                this.g = bljVar;
                if (this.d != null) {
                    k();
                }
            }
            i();
        }
    }

    public final boolean h() {
        if (this.c.isEmpty()) {
            ByteBuffer byteBuffer = this.d;
            return byteBuffer != null && byteBuffer.position() > 0;
        }
        return true;
    }

    public final void g(int i, bmo bmoVar) {
        byte[] bArr;
        synchronized (this.a) {
            boolean z = true;
            if (this.g != null) {
                if (this.d != null) {
                    z = false;
                }
                jdg.F(z);
                return;
            }
            ByteBuffer byteBuffer = this.d;
            if (byteBuffer != null && byteBuffer.position() > 0 && i > this.d.remaining()) {
                j();
            }
            if (this.d == null) {
                ByteBuffer b = this.f.b();
                if (!b.hasArray()) {
                    this.f.d(b);
                    bll bllVar = this.f;
                    synchronized (bllVar.a) {
                        bArr = (byte[]) bllVar.b.poll();
                    }
                    if (bArr == null) {
                        bArr = new byte[32768];
                    }
                    jdg.F(bArr.length == 32768);
                    bllVar.c.incrementAndGet();
                    Map map = bllVar.g;
                    if (map != null) {
                        map.put(new blk(bArr), Log.getStackTraceString(new Throwable()));
                    }
                    b = ByteBuffer.wrap(bArr);
                }
                jdg.F(b.position() == 0);
                jdg.F(b.limit() == b.capacity());
                jdg.F(b.hasArray());
                this.d = b;
            }
            if (i > this.d.capacity()) {
                ((ltd) ((ltd) e.d()).k("com/google/android/apps/gsa/shared/io/QueueDataSource", "ensureWriteBufferHasSpaceFor", 269, "QueueDataSource.java")).u("Requested buffer that's too large: %d bytes.", i);
                k();
                this.d = ByteBuffer.wrap(new byte[(i * 3) / 2]);
            }
            if (this.d.remaining() < i) {
                z = false;
            }
            jdg.F(z);
            jdg.u(this.d);
            ByteBuffer byteBuffer2 = this.d;
            byteBuffer2.limit(byteBuffer2.position() + i);
            bmoVar.a(this.d);
            ByteBuffer byteBuffer3 = this.d;
            byteBuffer3.limit(byteBuffer3.capacity());
            i();
        }
    }
}
