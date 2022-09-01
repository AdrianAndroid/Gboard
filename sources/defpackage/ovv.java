package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: ovv  reason: default package */
/* loaded from: classes2.dex */
public final class ovv extends InputStream implements InputStreamRetargetInterface {
    public long a;
    private final byte[] b;
    private final byte[] c;
    private final int d;
    private final int e;
    private boolean f;
    private long g;
    private long h;
    private final InputStream i;
    private ovw j;
    private final owa k;
    private List l;
    private Map m;

    public ovv() {
        this.b = new byte[1];
        this.a = 0L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final void i(Map map) {
        char c;
        ovw ovwVar = this.j;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            switch (str.hashCode()) {
                case -1916861932:
                    if (str.equals("SCHILY.devmajor")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case -1916619760:
                    if (str.equals("SCHILY.devminor")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case -277496563:
                    if (str.equals("GNU.sparse.realsize")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case -160380561:
                    if (str.equals("GNU.sparse.size")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 102338:
                    if (str.equals("gid")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 115792:
                    if (str.equals("uid")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 3433509:
                    if (str.equals("path")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 3530753:
                    if (str.equals("size")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 98496370:
                    if (str.equals("gname")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 104223930:
                    if (str.equals("mtime")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 111425664:
                    if (str.equals("uname")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 530706950:
                    if (str.equals("SCHILY.filetype")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case 1195018015:
                    if (str.equals("linkpath")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    ovwVar.a(str2);
                    break;
                case 1:
                case 3:
                case 5:
                    break;
                case 2:
                    Long.parseLong(str2);
                    break;
                case 4:
                    Long.parseLong(str2);
                    break;
                case 6:
                    long parseLong = Long.parseLong(str2);
                    if (parseLong < 0) {
                        throw new IllegalArgumentException("Size is out of range: " + parseLong);
                    }
                    ovwVar.b = parseLong;
                    break;
                case 7:
                    Double.parseDouble(str2);
                    break;
                case '\b':
                    int parseInt = Integer.parseInt(str2);
                    if (parseInt < 0) {
                        throw new IllegalArgumentException("Minor device number is out of range: " + parseInt);
                    }
                    break;
                case '\t':
                    int parseInt2 = Integer.parseInt(str2);
                    if (parseInt2 < 0) {
                        throw new IllegalArgumentException("Major device number is out of range: " + parseInt2);
                    }
                    break;
                case '\n':
                    Integer.parseInt((String) map.get("GNU.sparse.size"));
                    if (map.containsKey("GNU.sparse.name")) {
                        ovwVar.a = (String) map.get("GNU.sparse.name");
                        break;
                    } else {
                        break;
                    }
                case 11:
                    Integer.parseInt((String) map.get("GNU.sparse.realsize"));
                    ovwVar.a = (String) map.get("GNU.sparse.name");
                    break;
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    if ("sparse".equals(str2) && map.containsKey("SCHILY.realsize")) {
                        Long.parseLong((String) map.get("SCHILY.realsize"));
                        break;
                    }
                    break;
                default:
                    ovwVar.f.put(str, str2);
                    break;
            }
        }
    }

    private final boolean j() {
        ovw ovwVar = this.j;
        return ovwVar != null && ovwVar.b();
    }

    private final byte[] k() {
        byte[] h = h();
        boolean f = f(h);
        this.f = f;
        if (f) {
            if (h == null) {
                return null;
            }
            boolean markSupported = this.i.markSupported();
            if (markSupported) {
                this.i.mark(this.d);
            }
            try {
                if (!f(h()) && markSupported) {
                    c(this.d);
                    this.i.reset();
                }
                long j = this.a;
                long j2 = this.e;
                long j3 = j % j2;
                if (j3 > 0) {
                    b(owc.b(this.i, j2 - j3));
                }
                return null;
            } catch (Throwable th) {
                if (markSupported) {
                    c(this.d);
                    this.i.reset();
                }
                throw th;
            }
        }
        return h;
    }

    protected final void a(int i) {
        b(i);
    }

    @Override // java.io.InputStream
    public final int available() {
        if (j()) {
            return 0;
        }
        long j = this.g - this.h;
        if (j <= 2147483647L) {
            return (int) j;
        }
        return Integer.MAX_VALUE;
    }

    protected final void b(long j) {
        if (j != -1) {
            this.a += j;
        }
    }

    protected final void c(long j) {
        this.a -= j;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.i.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0073, code lost:
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map d(java.io.InputStream r10) {
        /*
            r9 = this;
            java.util.HashMap r0 = new java.util.HashMap
            java.util.Map r1 = r9.m
            r0.<init>(r1)
            r1 = 0
        L8:
            r2 = 0
            r3 = 0
        La:
            int r4 = r10.read()
            r5 = -1
            if (r4 == r5) goto L73
            r6 = 1
            int r2 = r2 + r6
            r7 = 10
            if (r4 != r7) goto L18
            goto L8
        L18:
            r7 = 32
            if (r4 != r7) goto L6d
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream
            r4.<init>()
        L21:
            int r7 = r10.read()
            if (r7 == r5) goto L73
            int r2 = r2 + r6
            r8 = 61
            if (r7 != r8) goto L68
            java.lang.String r5 = "UTF-8"
            java.lang.String r4 = r4.toString(r5)
            int r3 = r3 - r2
            if (r3 != r6) goto L39
            r0.remove(r4)
            goto L8
        L39:
            byte[] r2 = new byte[r3]
            int r6 = defpackage.owc.a(r10, r2)
            if (r6 != r3) goto L4c
            java.lang.String r6 = new java.lang.String
            int r3 = r3 + (-1)
            r6.<init>(r2, r1, r3, r5)
            r0.put(r4, r6)
            goto L8
        L4c:
            java.io.IOException r10 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to read Paxheader. Expected "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = " bytes, read "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        L68:
            byte r7 = (byte) r7
            r4.write(r7)
            goto L21
        L6d:
            int r3 = r3 * 10
            int r4 = r4 + (-48)
            int r3 = r3 + r4
            goto La
        L73:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ovv.d(java.io.InputStream):java.util.Map");
    }

    public final ovw e() {
        if (this.f) {
            return null;
        }
        if (this.j != null) {
            owc.b(this, Long.MAX_VALUE);
            if (!j()) {
                long j = this.g;
                if (j > 0) {
                    long j2 = this.d;
                    if (j % j2 != 0) {
                        b(owc.b(this.i, (((j / j2) + 1) * j2) - j));
                    }
                }
            }
        }
        byte[] k = k();
        if (k == null) {
            this.j = null;
            return null;
        }
        try {
            ovw ovwVar = new ovw(k, this.k);
            this.j = ovwVar;
            this.h = 0L;
            this.g = ovwVar.b;
            if (ovwVar.c == 75) {
                byte[] g = g();
                if (g == null) {
                    return null;
                }
                this.k.a(g);
            }
            if (this.j.c == 76) {
                byte[] g2 = g();
                if (g2 == null) {
                    return null;
                }
                this.j.a(this.k.a(g2));
            }
            if (this.j.c()) {
                this.m = d(this);
                e();
            }
            if (this.j.d()) {
                Map d = d(this);
                e();
                i(d);
            } else if (!this.m.isEmpty()) {
                i(this.m);
            }
            ovw ovwVar2 = this.j;
            if (ovwVar2.c == 83) {
                List list = this.l;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(ovwVar2.e);
                list.addAll(arrayList);
                if (this.j.d) {
                    while (true) {
                        byte[] k2 = k();
                        if (k2 == null) {
                            this.j = null;
                            break;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (int i = 0; i < 504; i += 24) {
                            oll r = oll.r(k2, i);
                            if (r != null) {
                                arrayList2.add(r);
                            }
                        }
                        boolean d2 = ovy.d(k2, 504);
                        List list2 = this.l;
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.addAll(arrayList2);
                        list2.addAll(arrayList3);
                        if (!d2) {
                            break;
                        }
                    }
                }
            }
            ovw ovwVar3 = this.j;
            this.g = ovwVar3.b;
            return ovwVar3;
        } catch (IllegalArgumentException e) {
            throw new IOException("Error detected parsing the header", e);
        }
    }

    protected final boolean f(byte[] bArr) {
        if (bArr != null) {
            int i = this.d;
            for (int i2 = 0; i2 < i; i2++) {
                if (bArr[i2] != 0) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    protected final byte[] g() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = read(this.c);
            if (read < 0) {
                break;
            }
            byteArrayOutputStream.write(this.c, 0, read);
        }
        e();
        if (this.j == null) {
            return null;
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        while (length > 0) {
            int i = length - 1;
            if (byteArray[i] != 0) {
                break;
            }
            length = i;
        }
        if (length == byteArray.length) {
            return byteArray;
        }
        byte[] bArr = new byte[length];
        System.arraycopy(byteArray, 0, bArr, 0, length);
        return bArr;
    }

    protected final byte[] h() {
        byte[] bArr = new byte[this.d];
        int a = owc.a(this.i, bArr);
        a(a);
        if (a != this.d) {
            return null;
        }
        return bArr;
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (read(this.b, 0, 1) == -1) {
            return -1;
        }
        return this.b[0] & 255;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        if (j <= 0 || j()) {
            return 0L;
        }
        long b = owc.b(this.i, Math.min(j, this.g - this.h));
        b(b);
        this.h += b;
        return b;
    }

    @Override // j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    public ovv(InputStream inputStream) {
        this.b = new byte[1];
        this.a = 0L;
        this.c = new byte[256];
        this.m = new HashMap();
        this.i = inputStream;
        this.f = false;
        this.k = owb.a(null);
        this.d = 512;
        this.e = 10240;
        this.l = new ArrayList();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (this.f || j() || this.h >= this.g) {
            return -1;
        }
        if (this.j == null) {
            throw new IllegalStateException("No current tar entry");
        }
        int min = Math.min(i2, available());
        int read = this.i.read(bArr, i, min);
        if (read != -1) {
            a(read);
            this.h += read;
        } else if (min > 0) {
            throw new IOException("Truncated TAR archive");
        } else {
            this.f = true;
        }
        return read;
    }
}
