package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: oxx  reason: default package */
/* loaded from: classes2.dex */
final class oxx extends InputStream implements InputStreamRetargetInterface {
    public final oya a;
    public final oys b;
    public final int c;
    private final DataInputStream e;
    private InputStream f;
    private final boolean g;
    private long h;
    private long i;
    private long j;
    public long d = 0;
    private boolean k = false;
    private final byte[] l = new byte[1];

    public oxx(InputStream inputStream, oys oysVar, boolean z, int i, oxv oxvVar) {
        this.h = -1L;
        this.i = -1L;
        this.b = oysVar;
        this.g = z;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.e = dataInputStream;
        byte[] bArr = new byte[1024];
        dataInputStream.readFully(bArr, 0, 1);
        byte b = bArr[0];
        if (b != 0) {
            int i2 = ((b & 255) + 1) * 4;
            this.c = i2;
            dataInputStream.readFully(bArr, 1, i2 - 1);
            int i3 = i2 - 4;
            if (!ols.t(bArr, 0, i3, i3)) {
                throw new oxz("XZ Block Header is corrupt");
            }
            int i4 = bArr[1];
            if ((i4 & 60) == 0) {
                int i5 = (i4 & 3) + 1;
                long[] jArr = new long[i5];
                byte[][] bArr2 = new byte[i5];
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr, 2, i2 - 6);
                try {
                    this.j = (9223372036854775804L - i2) - oysVar.a;
                    if ((bArr[1] & 64) != 0) {
                        long r = ols.r(byteArrayInputStream);
                        this.i = r;
                        if (r == 0 || r > this.j) {
                            throw new oxz();
                        }
                        this.j = r;
                    }
                    if ((bArr[1] & 128) != 0) {
                        this.h = ols.r(byteArrayInputStream);
                    }
                    for (int i6 = 0; i6 < i5; i6++) {
                        jArr[i6] = ols.r(byteArrayInputStream);
                        long r2 = ols.r(byteArrayInputStream);
                        if (r2 <= byteArrayInputStream.available()) {
                            byte[] bArr3 = new byte[(int) r2];
                            bArr2[i6] = bArr3;
                            byteArrayInputStream.read(bArr3);
                        } else {
                            throw new oxz();
                        }
                    }
                    for (int available = byteArrayInputStream.available(); available > 0; available--) {
                        if (byteArrayInputStream.read() != 0) {
                            throw new oyl("Unsupported options in XZ Block Header");
                        }
                    }
                    oye[] oyeVarArr = new oye[i5];
                    for (int i7 = 0; i7 < i5; i7++) {
                        long j = jArr[i7];
                        if (j == 33) {
                            oyeVarArr[i7] = new oyg(bArr2[i7]);
                        } else if (j == 3) {
                            oyeVarArr[i7] = new oyb(bArr2[i7]);
                        } else if (j >= 4 && j <= 9) {
                            oyeVarArr[i7] = new oxw(j, bArr2[i7]);
                        } else {
                            throw new oyl("Unknown Filter ID " + jArr[i7]);
                        }
                    }
                    int i8 = 0;
                    while (true) {
                        int i9 = i5 - 1;
                        if (i8 < i9) {
                            if (!oyeVarArr[i8].c()) {
                                throw new oyl("Unsupported XZ filter chain");
                            }
                            i8++;
                        } else if (oyeVarArr[i9].b()) {
                            int i10 = 0;
                            for (int i11 = 0; i11 < i5; i11++) {
                                if (oyeVarArr[i11].a()) {
                                    i10++;
                                }
                            }
                            if (i10 <= 3) {
                                if (i >= 0) {
                                    int i12 = 0;
                                    for (int i13 = 0; i13 < i5; i13++) {
                                        i12 += oyeVarArr[i13].d();
                                    }
                                    if (i12 > 0) {
                                        throw new oyi(i12);
                                    }
                                }
                                oya oyaVar = new oya(inputStream);
                                this.a = oyaVar;
                                this.f = oyaVar;
                                while (i9 >= 0) {
                                    this.f = oyeVarArr[i9].e(this.f);
                                    i9--;
                                }
                                return;
                            }
                            throw new oyl("Unsupported XZ filter chain");
                        } else {
                            throw new oyl("Unsupported XZ filter chain");
                        }
                    }
                } catch (IOException unused) {
                    throw new oxz("XZ Block Header is corrupt");
                }
            } else {
                throw new oyl("Unsupported options in XZ Block Header");
            }
        } else {
            throw new oyf();
        }
    }

    private final void a() {
        long j = this.a.a;
        long j2 = this.i;
        if (j2 == -1 || j2 == j) {
            long j3 = this.h;
            if (j3 == -1 || j3 == this.d) {
                while (true) {
                    long j4 = 1 + j;
                    if ((j & 3) != 0) {
                        if (this.e.readUnsignedByte() != 0) {
                            throw new oxz();
                        }
                        j = j4;
                    } else {
                        byte[] bArr = new byte[this.b.a];
                        this.e.readFully(bArr);
                        if (!this.g || Arrays.equals(this.b.b(), bArr)) {
                            return;
                        }
                        throw new oxz("Integrity check (" + this.b.b + ") does not match");
                    }
                }
            }
        }
        throw new oxz();
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.f.close();
        } catch (IOException unused) {
        }
        this.f = null;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (read(this.l, 0, 1) == -1) {
            return -1;
        }
        return this.l[0] & 255;
    }

    @Override // j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (this.k) {
            return -1;
        }
        int read = this.f.read(bArr, i, i2);
        if (read > 0) {
            if (this.g) {
                this.b.a(bArr, i, read);
            }
            long j = this.d + read;
            this.d = j;
            long j2 = this.a.a;
            if (j2 >= 0 && j2 <= this.j && j >= 0) {
                long j3 = this.h;
                if (j3 == -1 || j <= j3) {
                    if (read < i2 || j == j3) {
                        if (this.f.read() != -1) {
                            throw new oxz();
                        }
                        a();
                        this.k = true;
                    }
                }
            }
            throw new oxz();
        } else if (read == -1) {
            a();
            this.k = true;
            return -1;
        }
        return read;
    }
}
