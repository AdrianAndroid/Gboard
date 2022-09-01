package defpackage;

import android.util.Log;
import j$.util.DesugarCollections;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: bll  reason: default package */
/* loaded from: classes.dex */
public final class bll {
    public final Map g;
    private final Map p;
    private final blc q;
    private final Object h = new Object();
    public final Object a = new Object();
    private final Queue i = new ArrayDeque();
    public final Queue b = new ArrayDeque();
    private final AtomicInteger j = new AtomicInteger(0);
    private final AtomicInteger k = new AtomicInteger(0);
    private final AtomicInteger l = new AtomicInteger(0);
    private final AtomicInteger m = new AtomicInteger(0);
    public final AtomicInteger c = new AtomicInteger(0);
    public final AtomicInteger d = new AtomicInteger(0);
    public final AtomicInteger e = new AtomicInteger(0);
    public final AtomicInteger f = new AtomicInteger(0);
    private final AtomicInteger n = new AtomicInteger(0);
    private final AtomicInteger o = new AtomicInteger(0);

    public bll(blc blcVar) {
        Map synchronizedMap;
        this.q = blcVar;
        Map map = null;
        if (!blcVar.a()) {
            blcVar.b();
            synchronizedMap = null;
        } else {
            synchronizedMap = DesugarCollections.synchronizedMap(new HashMap());
        }
        this.g = synchronizedMap;
        if (!blcVar.a()) {
            blcVar.b();
        } else {
            map = DesugarCollections.synchronizedMap(new IdentityHashMap());
        }
        this.p = map;
    }

    public final blj a(ByteBuffer byteBuffer) {
        jdg.v(byteBuffer.isDirect());
        boolean z = true;
        jdg.v(byteBuffer.position() > 0);
        jdg.v(byteBuffer.limit() == 32768);
        byteBuffer.flip();
        this.n.incrementAndGet();
        this.o.addAndGet(byteBuffer.remaining());
        if (!this.q.a()) {
            this.q.b();
            z = false;
        }
        return new blj(this, byteBuffer, z);
    }

    public final ByteBuffer b() {
        ByteBuffer byteBuffer;
        synchronized (this.h) {
            byteBuffer = (ByteBuffer) this.i.poll();
        }
        String str = "";
        if (byteBuffer == null) {
            byteBuffer = ByteBuffer.allocateDirect(32768);
        } else {
            Map map = this.p;
            if (map != null) {
                String str2 = (String) map.remove(byteBuffer);
                jdg.u(str2);
                str = "Buffer recycled at: ".concat(str2);
            }
        }
        jdg.G(byteBuffer.isDirect(), str);
        boolean z = true;
        jdg.G(byteBuffer.capacity() == 32768, str);
        jdg.G(byteBuffer.position() == 0, str);
        if (byteBuffer.limit() != 32768) {
            z = false;
        }
        jdg.G(z, str);
        this.j.incrementAndGet();
        Map map2 = this.g;
        if (map2 != null) {
            map2.put(new blk(byteBuffer), Log.getStackTraceString(new Throwable()));
        }
        return byteBuffer;
    }

    public final void c(ByteBuffer byteBuffer) {
        if (byteBuffer.capacity() != 32768 || !byteBuffer.isDirect()) {
            this.m.incrementAndGet();
            return;
        }
        Map map = this.g;
        if (map != null) {
            jdg.F(map.remove(new blk(byteBuffer)) != null);
        }
        this.l.incrementAndGet();
    }

    public final void d(ByteBuffer byteBuffer) {
        if (byteBuffer.capacity() != 32768 || !byteBuffer.isDirect()) {
            this.m.incrementAndGet();
            return;
        }
        Map map = this.g;
        if (map != null) {
            jdg.F(map.remove(new blk(byteBuffer)) != null);
        }
        byteBuffer.clear();
        synchronized (this.h) {
            if (this.i.size() < 28) {
                this.i.add(byteBuffer);
                this.k.incrementAndGet();
                Map map2 = this.p;
                if (map2 != null) {
                    map2.put(byteBuffer, Log.getStackTraceString(new Throwable()));
                }
            } else {
                this.l.incrementAndGet();
            }
        }
    }
}
