package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;

/* compiled from: PG */
/* renamed from: oyk  reason: default package */
/* loaded from: classes2.dex */
public final class oyk extends InputStream implements InputStreamRetargetInterface {
    private InputStream a;
    private final oxv b;
    private final int c;
    private final oyv d;
    private final oys e;
    private final boolean f;
    private oxx g = null;
    private final oyx k = new oyx();
    private boolean h = false;
    private IOException i = null;
    private final byte[] j = new byte[1];

    public oyk(InputStream inputStream, int i, boolean z, byte[] bArr, oxv oxvVar) {
        int i2 = 0;
        this.b = oxvVar;
        this.a = inputStream;
        this.c = i;
        this.f = z;
        while (true) {
            byte[] bArr2 = oym.a;
            if (i2 >= 6) {
                if (ols.t(bArr, 6, 2, 8)) {
                    try {
                        oyv s = ols.s(bArr, 6);
                        this.d = s;
                        this.e = oys.c(s.a);
                        return;
                    } catch (oyl unused) {
                        throw new oyl("Unsupported options in XZ Stream Header");
                    }
                }
                throw new oxz("XZ Stream Header is corrupt");
            } else if (bArr[i2] != oym.a[i2]) {
                throw new oyn();
            } else {
                i2++;
            }
        }
    }

    public final void a(boolean z) {
        if (this.a != null) {
            oxx oxxVar = this.g;
            if (oxxVar != null) {
                oxxVar.close();
                this.g = null;
            }
            if (z) {
                try {
                    this.a.close();
                } finally {
                    this.a = null;
                }
            }
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        if (this.a != null) {
            IOException iOException = this.i;
            if (iOException == null) {
                oxx oxxVar = this.g;
                if (oxxVar != null) {
                    return oxxVar.available();
                }
                return 0;
            }
            throw iOException;
        }
        throw new oyo("Stream closed");
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a(true);
    }

    @Override // java.io.InputStream
    public final int read() {
        if (read(this.j, 0, 1) == -1) {
            return -1;
        }
        return this.j[0] & 255;
    }

    @Override // j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3;
        if (i < 0 || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        if (this.a != null) {
            IOException iOException = this.i;
            if (iOException == null) {
                if (this.h) {
                    return -1;
                }
                int i4 = i;
                int i5 = i2;
                int i6 = 0;
                while (i5 > 0) {
                    try {
                        if (this.g == null) {
                            try {
                                this.g = new oxx(this.a, this.e, this.f, this.c, this.b);
                            } catch (oyf unused) {
                                oyx oyxVar = this.k;
                                InputStream inputStream = this.a;
                                CRC32 crc32 = new CRC32();
                                crc32.update(0);
                                CheckedInputStream checkedInputStream = new CheckedInputStream(inputStream, crc32);
                                if (ols.r(checkedInputStream) != oyxVar.e) {
                                    throw new oxz("XZ Block Header or the start of XZ Index is corrupt");
                                }
                                oyx oyxVar2 = new oyx();
                                for (long j = 0; j < oyxVar.e; j++) {
                                    try {
                                        oyxVar2.c(ols.r(checkedInputStream), ols.r(checkedInputStream));
                                        if (oyxVar2.b > oyxVar.b || oyxVar2.c > oyxVar.c || oyxVar2.d > oyxVar.d) {
                                            throw new oxz("XZ Index is corrupt");
                                        }
                                    } catch (oyo unused2) {
                                        throw new oxz("XZ Index is corrupt");
                                    }
                                }
                                if (oyxVar2.b != oyxVar.b || oyxVar2.c != oyxVar.c || oyxVar2.d != oyxVar.d || !Arrays.equals(oyxVar2.f.b(), oyxVar.f.b())) {
                                    throw new oxz("XZ Index is corrupt");
                                }
                                DataInputStream dataInputStream = new DataInputStream(checkedInputStream);
                                for (int b = (int) ((4 - oyxVar.b()) & 3); b > 0; b--) {
                                    if (dataInputStream.readUnsignedByte() != 0) {
                                        throw new oxz("XZ Index is corrupt");
                                    }
                                }
                                long value = crc32.getValue();
                                for (int i7 = 0; i7 < 4; i7++) {
                                    if (((value >>> (i7 * 8)) & 255) != dataInputStream.readUnsignedByte()) {
                                        throw new oxz("XZ Index is corrupt");
                                    }
                                }
                                byte[] bArr2 = new byte[12];
                                new DataInputStream(this.a).readFully(bArr2);
                                if (bArr2[10] != oym.b[0] || bArr2[11] != oym.b[1]) {
                                    throw new oxz("XZ Stream Footer is corrupt");
                                }
                                if (!ols.t(bArr2, 4, 6, 0)) {
                                    throw new oxz("XZ Stream Footer is corrupt");
                                }
                                try {
                                    oyv s = ols.s(bArr2, 8);
                                    s.b = 0L;
                                    for (int i8 = 0; i8 < 4; i8++) {
                                        s.b |= (bArr2[i8 + 4] & 255) << (i8 * 8);
                                    }
                                    s.b = (s.b + 1) * 4;
                                    if (this.d.a != s.a || this.k.a() != s.b) {
                                        throw new oxz("XZ Stream Footer does not match Stream Header");
                                    }
                                    this.h = true;
                                    if (i6 <= 0) {
                                        return -1;
                                    }
                                    return i6;
                                } catch (oyl unused3) {
                                    throw new oyl("Unsupported options in XZ Stream Footer");
                                }
                            }
                        }
                        int read = this.g.read(bArr, i4, i5);
                        if (read > 0) {
                            i6 += read;
                            i4 += read;
                            i5 -= read;
                        } else if (read == -1) {
                            oyx oyxVar3 = this.k;
                            oxx oxxVar = this.g;
                            oyxVar3.c(oxxVar.c + oxxVar.a.a + oxxVar.b.a, oxxVar.d);
                            this.g = null;
                        }
                    } catch (IOException e) {
                        this.i = e;
                        if (i6 == 0) {
                            throw e;
                        }
                    }
                }
                return i6;
            }
            throw iOException;
        }
        throw new oyo("Stream closed");
    }
}
