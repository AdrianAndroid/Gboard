package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* renamed from: now  reason: default package */
/* loaded from: classes2.dex */
public final class now implements Closeable {
    private static final Logger c = Logger.getLogger(now.class.getName());
    private static final byte[] d = new byte[4096];
    final RandomAccessFile a;
    int b;
    private int e;
    private not f;
    private not g;
    private final byte[] h;

    public now(File file) {
        byte[] bArr = new byte[16];
        this.h = bArr;
        if (!file.exists()) {
            File file2 = new File(String.valueOf(file.getPath()).concat(".tmp"));
            RandomAccessFile m = m(file2);
            try {
                m.setLength(4096L);
                m.seek(0L);
                byte[] bArr2 = new byte[16];
                q(bArr2, 0, 4096);
                m.write(bArr2);
                m.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th) {
                m.close();
                throw th;
            }
        }
        RandomAccessFile m2 = m(file);
        this.a = m2;
        m2.seek(0L);
        m2.readFully(bArr);
        int k = k(bArr, 0);
        this.b = k;
        if (k > m2.length()) {
            throw new IOException("File is truncated. Expected length: " + this.b + ", Actual length: " + m2.length());
        } else if (this.b > 0) {
            this.e = k(bArr, 4);
            int k2 = k(bArr, 8);
            int k3 = k(bArr, 12);
            this.f = l(k2);
            this.g = l(k3);
        } else {
            throw new IOException("File is corrupt; length stored in header (" + this.b + ") is invalid.");
        }
    }

    private static int k(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    private final not l(int i) {
        if (i == 0) {
            return not.a;
        }
        e(i, this.h, 0, 4);
        return new not(i, k(this.h, 0));
    }

    private static RandomAccessFile m(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    private final void n(int i, int i2) {
        while (i2 > 0) {
            byte[] bArr = d;
            int length = bArr.length;
            int min = Math.min(i2, 4096);
            r(i, bArr, min);
            i2 -= min;
            i += min;
        }
    }

    private final void o(int i) {
        this.a.setLength(i);
        this.a.getChannel().force(true);
    }

    private final void p(int i, int i2, int i3, int i4) {
        q(this.h, 0, i);
        q(this.h, 4, i2);
        q(this.h, 8, i3);
        q(this.h, 12, i4);
        this.a.seek(0L);
        this.a.write(this.h);
    }

    private static void q(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    private final void r(int i, byte[] bArr, int i2) {
        int b = b(i);
        int i3 = this.b;
        if (b + i2 <= i3) {
            this.a.seek(b);
            this.a.write(bArr, 0, i2);
            return;
        }
        int i4 = i3 - b;
        this.a.seek(b);
        this.a.write(bArr, 0, i4);
        this.a.seek(16L);
        this.a.write(bArr, i4, i2 - i4);
    }

    public final synchronized int a() {
        return this.e;
    }

    public final int b(int i) {
        int i2 = this.b;
        return i < i2 ? i : (i + 16) - i2;
    }

    public final synchronized void c() {
        p(4096, 0, 0, 0);
        this.a.seek(16L);
        this.a.write(d, 0, 4080);
        this.e = 0;
        not notVar = not.a;
        this.f = notVar;
        this.g = notVar;
        if (this.b > 4096) {
            o(4096);
        }
        this.b = 4096;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.a.close();
    }

    public final synchronized void d() {
        j();
    }

    public final void e(int i, byte[] bArr, int i2, int i3) {
        int b = b(i);
        int i4 = this.b;
        if (b + i3 <= i4) {
            this.a.seek(b);
            this.a.readFully(bArr, i2, i3);
            return;
        }
        int i5 = i4 - b;
        this.a.seek(b);
        this.a.readFully(bArr, i2, i5);
        this.a.seek(16L);
        this.a.readFully(bArr, i2 + i5, i3 - i5);
    }

    public final synchronized boolean f() {
        return this.e == 0;
    }

    @Deprecated
    public final synchronized void g(nos nosVar) {
        i(new nor(nosVar));
    }

    public final synchronized void h(byte[] bArr, int i) {
        int i2;
        if (i < 0 || i > 1024) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = i + 4;
        int i4 = this.b;
        int i5 = 16;
        if (this.e == 0) {
            i2 = 16;
        } else {
            not notVar = this.g;
            int i6 = notVar.b;
            int i7 = this.f.b;
            i2 = i6 >= i7 ? (i6 - i7) + 4 + notVar.c + 16 : (((i6 + 4) + notVar.c) + i4) - i7;
        }
        int i8 = i4 - i2;
        if (i8 < i3) {
            do {
                i8 += i4;
                i4 += i4;
            } while (i8 < i3);
            o(i4);
            not notVar2 = this.g;
            int b = b(notVar2.b + 4 + notVar2.c);
            if (b <= this.f.b) {
                FileChannel channel = this.a.getChannel();
                channel.position(this.b);
                int i9 = b - 16;
                long j = i9;
                if (channel.transferTo(16L, j, channel) != j) {
                    throw new AssertionError("Copied insufficient number of bytes!");
                }
                n(16, i9);
            }
            int i10 = this.g.b;
            int i11 = this.f.b;
            if (i10 < i11) {
                int i12 = (this.b + i10) - 16;
                p(i4, this.e, i11, i12);
                this.g = new not(i12, this.g.c);
            } else {
                p(i4, this.e, i11, i10);
            }
            this.b = i4;
        }
        boolean f = f();
        if (!f) {
            not notVar3 = this.g;
            i5 = b(notVar3.b + 4 + notVar3.c);
        }
        not notVar4 = new not(i5, i);
        q(this.h, 0, i);
        r(notVar4.b, this.h, 4);
        r(notVar4.b + 4, bArr, i);
        p(this.b, this.e + 1, f ? notVar4.b : this.f.b, notVar4.b);
        this.g = notVar4;
        this.e++;
        if (!f) {
            return;
        }
        this.f = notVar4;
    }

    public final synchronized void i(nov novVar) {
        int i = this.f.b;
        for (int i2 = 0; i2 < this.e; i2++) {
            not l = l(i);
            novVar.a(new nou(this, l), l.c);
            i = b(l.b + 4 + l.c);
        }
    }

    public final synchronized void j() {
        if (!f()) {
            int i = this.e;
            if (i == 1) {
                c();
                return;
            } else if (i <= 0) {
                throw new IllegalArgumentException("Cannot remove more elements (1) than present in queue (" + this.e + ").");
            } else {
                not notVar = this.f;
                int i2 = notVar.b;
                int i3 = notVar.c;
                int i4 = i2;
                int i5 = 0;
                for (int i6 = 0; i6 <= 0; i6++) {
                    i5 += i3 + 4;
                    i4 = b(i4 + 4 + i3);
                    e(i4, this.h, 0, 4);
                    i3 = k(this.h, 0);
                }
                p(this.b, this.e - 1, i4, this.g.b);
                this.e--;
                this.f = new not(i4, i3);
                n(i2, i5);
                return;
            }
        }
        throw new NoSuchElementException();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[fileLength=");
        sb.append(this.b);
        sb.append(", size=");
        sb.append(this.e);
        sb.append(", first=");
        sb.append(this.f);
        sb.append(", last=");
        sb.append(this.g);
        sb.append(", element lengths=[");
        try {
            g(new nos(sb));
        } catch (IOException e) {
            c.log(Level.WARNING, "read error", (Throwable) e);
        }
        sb.append("]]");
        return sb.toString();
    }
}
