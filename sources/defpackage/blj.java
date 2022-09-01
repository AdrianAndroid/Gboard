package defpackage;

import java.nio.ByteBuffer;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: blj  reason: default package */
/* loaded from: classes.dex */
public final class blj {
    public final Object b;
    public final int c;
    public ByteBuffer d;
    public final blb e;
    private bll g;
    private final boolean h;
    private volatile RuntimeException i;
    private static final ltg f = ltg.j("com/google/android/apps/gsa/shared/io/Chunk");
    public static final blj a = new blj();

    private blj() {
        this.b = new Object();
        this.c = 3;
        this.g = null;
        this.d = null;
        this.e = null;
        this.h = false;
    }

    public blj(blb blbVar) {
        this.b = new Object();
        this.c = 2;
        this.g = null;
        this.d = null;
        this.e = blbVar;
        this.h = false;
    }

    public blj(bll bllVar, ByteBuffer byteBuffer, boolean z) {
        this.b = new Object();
        boolean z2 = true;
        this.c = 1;
        this.g = bllVar;
        jdg.u(byteBuffer);
        this.d = byteBuffer;
        jdg.v(byteBuffer.isDirect());
        jdg.v(byteBuffer.position() != 0 ? false : z2);
        jdg.v(byteBuffer.hasRemaining());
        this.e = null;
        this.h = z;
        if (z) {
            this.i = new RuntimeException("Chunk leaked.");
        }
    }

    public final int a() {
        int remaining;
        int i = this.c;
        boolean z = false;
        if (i != 1) {
            if (i == 2 || i == 3) {
                return 0;
            }
            throw new AssertionError("Unexpected chunk type: " + i);
        }
        synchronized (this.b) {
            if (this.d != null) {
                z = true;
            }
            jdg.G(z, "Chunk already released.");
            remaining = this.d.remaining();
        }
        return remaining;
    }

    public final void b() {
        ByteBuffer byteBuffer;
        bll bllVar;
        boolean z = true;
        if (this.c != 1) {
            return;
        }
        synchronized (this.b) {
            jdg.F(this.d != null);
            if (this.g == null) {
                z = false;
            }
            jdg.F(z);
            byteBuffer = this.d;
            bllVar = this.g;
            this.d = null;
            this.g = null;
        }
        bllVar.d(byteBuffer);
        this.i = null;
    }

    protected final void finalize() {
        try {
            if (this.h && this.i != null) {
                ((ltd) ((ltd) ((ltd) f.d()).i(this.i)).k("com/google/android/apps/gsa/shared/io/Chunk", "finalize", 141, "Chunk.java")).t("finalize() without release().");
            }
        } finally {
            super.finalize();
        }
    }

    public final String toString() {
        String format;
        int i = this.c;
        if (i == 1) {
            synchronized (this.b) {
                format = this.d != null ? String.format(Locale.US, "Chunk(pos=%d, remaining=%d)", Integer.valueOf(this.d.position()), Integer.valueOf(this.d.remaining())) : "Chunk(released)";
            }
            return format;
        } else if (i != 2) {
            return i != 3 ? "Chunk(unknown type)" : "Chunk(EOF)";
        } else {
            String valueOf = String.valueOf(this.e);
            return "Chunk(" + valueOf + ")";
        }
    }
}
