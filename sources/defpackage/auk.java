package defpackage;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: auk  reason: default package */
/* loaded from: classes.dex */
public final class auk implements aug {
    public ByteBuffer a;
    public byte[] b;
    public byte[] c;
    public int[] d;
    public int e;
    public Bitmap g;
    public Boolean h;
    public final bek j;
    private int[] k;
    private short[] m;
    private byte[] n;
    private byte[] o;
    private boolean p;
    private int q;
    private int r;
    private int s;
    private int t;
    private final int[] l = new int[256];
    public Bitmap.Config i = Bitmap.Config.ARGB_8888;
    public aui f = new aui();

    public auk(bek bekVar, aui auiVar, ByteBuffer byteBuffer, int i, byte[] bArr, byte[] bArr2) {
        this.j = bekVar;
        c(auiVar, byteBuffer, i);
    }

    private final int d() {
        return this.a.get() & 255;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [axp, java.lang.Object] */
    private final Bitmap e() {
        Bitmap.Config config;
        Boolean bool = this.h;
        if (bool == null || bool.booleanValue()) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = this.i;
        }
        bek bekVar = this.j;
        Bitmap b = bekVar.a.b(this.t, this.s, config);
        b.setHasAlpha(true);
        return b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b2, code lost:
        if (r10.j == r5.h) goto L66;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0472 A[Catch: all -> 0x04b0, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000a, B:8:0x0010, B:13:0x001a, B:15:0x0023, B:16:0x002b, B:18:0x003d, B:19:0x0049, B:21:0x004d, B:22:0x0051, B:24:0x0055, B:28:0x0059, B:30:0x005d, B:32:0x0070, B:34:0x0074, B:35:0x007a, B:37:0x007e, B:39:0x0082, B:40:0x0087, B:43:0x008f, B:45:0x0093, B:47:0x0097, B:49:0x009c, B:52:0x00a2, B:54:0x00a6, B:56:0x00ae, B:58:0x00b5, B:60:0x00cd, B:62:0x00d2, B:64:0x00d7, B:68:0x00dd, B:70:0x00e1, B:72:0x00f3, B:74:0x00fc, B:75:0x010b, B:77:0x010f, B:79:0x011a, B:81:0x0122, B:82:0x0126, B:84:0x012c, B:85:0x0130, B:87:0x0136, B:88:0x013c, B:90:0x0150, B:92:0x0159, B:96:0x0177, B:143:0x019c, B:101:0x01a8, B:103:0x01ca, B:109:0x01f5, B:114:0x0206, B:117:0x0210, B:119:0x0219, B:120:0x0221, B:122:0x0227, B:126:0x0234, B:129:0x0241, B:297:0x0184, B:144:0x025d, B:146:0x0269, B:149:0x0270, B:151:0x0286, B:154:0x0293, B:156:0x0299, B:158:0x02a3, B:160:0x02a7, B:162:0x02ab, B:167:0x02b4, B:170:0x02ba, B:172:0x02be, B:176:0x02d2, B:177:0x046e, B:179:0x0472, B:183:0x0479, B:185:0x047d, B:186:0x0483, B:187:0x0496, B:190:0x02c7, B:197:0x02da, B:199:0x02ff, B:202:0x0307, B:209:0x032b, B:210:0x0332, B:212:0x0335, B:215:0x0342, B:218:0x034f, B:220:0x035a, B:222:0x0368, B:225:0x0361, B:232:0x0448, B:233:0x037d, B:235:0x0386, B:236:0x0397, B:238:0x039c, B:241:0x03a5, B:243:0x03b2, B:245:0x03c7, B:248:0x03d0, B:249:0x03d4, B:251:0x03d9, B:254:0x03e0, B:256:0x03eb, B:258:0x0400, B:265:0x041d, B:267:0x042b, B:270:0x0424, B:274:0x0409, B:291:0x045a, B:295:0x0468, B:296:0x0464, B:300:0x0112, B:301:0x0105, B:305:0x000e), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x047d A[Catch: all -> 0x04b0, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000a, B:8:0x0010, B:13:0x001a, B:15:0x0023, B:16:0x002b, B:18:0x003d, B:19:0x0049, B:21:0x004d, B:22:0x0051, B:24:0x0055, B:28:0x0059, B:30:0x005d, B:32:0x0070, B:34:0x0074, B:35:0x007a, B:37:0x007e, B:39:0x0082, B:40:0x0087, B:43:0x008f, B:45:0x0093, B:47:0x0097, B:49:0x009c, B:52:0x00a2, B:54:0x00a6, B:56:0x00ae, B:58:0x00b5, B:60:0x00cd, B:62:0x00d2, B:64:0x00d7, B:68:0x00dd, B:70:0x00e1, B:72:0x00f3, B:74:0x00fc, B:75:0x010b, B:77:0x010f, B:79:0x011a, B:81:0x0122, B:82:0x0126, B:84:0x012c, B:85:0x0130, B:87:0x0136, B:88:0x013c, B:90:0x0150, B:92:0x0159, B:96:0x0177, B:143:0x019c, B:101:0x01a8, B:103:0x01ca, B:109:0x01f5, B:114:0x0206, B:117:0x0210, B:119:0x0219, B:120:0x0221, B:122:0x0227, B:126:0x0234, B:129:0x0241, B:297:0x0184, B:144:0x025d, B:146:0x0269, B:149:0x0270, B:151:0x0286, B:154:0x0293, B:156:0x0299, B:158:0x02a3, B:160:0x02a7, B:162:0x02ab, B:167:0x02b4, B:170:0x02ba, B:172:0x02be, B:176:0x02d2, B:177:0x046e, B:179:0x0472, B:183:0x0479, B:185:0x047d, B:186:0x0483, B:187:0x0496, B:190:0x02c7, B:197:0x02da, B:199:0x02ff, B:202:0x0307, B:209:0x032b, B:210:0x0332, B:212:0x0335, B:215:0x0342, B:218:0x034f, B:220:0x035a, B:222:0x0368, B:225:0x0361, B:232:0x0448, B:233:0x037d, B:235:0x0386, B:236:0x0397, B:238:0x039c, B:241:0x03a5, B:243:0x03b2, B:245:0x03c7, B:248:0x03d0, B:249:0x03d4, B:251:0x03d9, B:254:0x03e0, B:256:0x03eb, B:258:0x0400, B:265:0x041d, B:267:0x042b, B:270:0x0424, B:274:0x0409, B:291:0x045a, B:295:0x0468, B:296:0x0464, B:300:0x0112, B:301:0x0105, B:305:0x000e), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00cd A[Catch: all -> 0x04b0, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000a, B:8:0x0010, B:13:0x001a, B:15:0x0023, B:16:0x002b, B:18:0x003d, B:19:0x0049, B:21:0x004d, B:22:0x0051, B:24:0x0055, B:28:0x0059, B:30:0x005d, B:32:0x0070, B:34:0x0074, B:35:0x007a, B:37:0x007e, B:39:0x0082, B:40:0x0087, B:43:0x008f, B:45:0x0093, B:47:0x0097, B:49:0x009c, B:52:0x00a2, B:54:0x00a6, B:56:0x00ae, B:58:0x00b5, B:60:0x00cd, B:62:0x00d2, B:64:0x00d7, B:68:0x00dd, B:70:0x00e1, B:72:0x00f3, B:74:0x00fc, B:75:0x010b, B:77:0x010f, B:79:0x011a, B:81:0x0122, B:82:0x0126, B:84:0x012c, B:85:0x0130, B:87:0x0136, B:88:0x013c, B:90:0x0150, B:92:0x0159, B:96:0x0177, B:143:0x019c, B:101:0x01a8, B:103:0x01ca, B:109:0x01f5, B:114:0x0206, B:117:0x0210, B:119:0x0219, B:120:0x0221, B:122:0x0227, B:126:0x0234, B:129:0x0241, B:297:0x0184, B:144:0x025d, B:146:0x0269, B:149:0x0270, B:151:0x0286, B:154:0x0293, B:156:0x0299, B:158:0x02a3, B:160:0x02a7, B:162:0x02ab, B:167:0x02b4, B:170:0x02ba, B:172:0x02be, B:176:0x02d2, B:177:0x046e, B:179:0x0472, B:183:0x0479, B:185:0x047d, B:186:0x0483, B:187:0x0496, B:190:0x02c7, B:197:0x02da, B:199:0x02ff, B:202:0x0307, B:209:0x032b, B:210:0x0332, B:212:0x0335, B:215:0x0342, B:218:0x034f, B:220:0x035a, B:222:0x0368, B:225:0x0361, B:232:0x0448, B:233:0x037d, B:235:0x0386, B:236:0x0397, B:238:0x039c, B:241:0x03a5, B:243:0x03b2, B:245:0x03c7, B:248:0x03d0, B:249:0x03d4, B:251:0x03d9, B:254:0x03e0, B:256:0x03eb, B:258:0x0400, B:265:0x041d, B:267:0x042b, B:270:0x0424, B:274:0x0409, B:291:0x045a, B:295:0x0468, B:296:0x0464, B:300:0x0112, B:301:0x0105, B:305:0x000e), top: B:3:0x0003 }] */
    @Override // defpackage.aug
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized android.graphics.Bitmap a() {
        /*
            Method dump skipped, instructions count: 1205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.auk.a():android.graphics.Bitmap");
    }

    @Override // defpackage.aug
    public final void b() {
        this.e = (this.e + 1) % this.f.c;
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [axn, java.lang.Object] */
    public final synchronized void c(aui auiVar, ByteBuffer byteBuffer, int i) {
        int[] iArr;
        if (i <= 0) {
            throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
        }
        int highestOneBit = Integer.highestOneBit(i);
        this.q = 0;
        this.f = auiVar;
        this.e = -1;
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.a = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.a.order(ByteOrder.LITTLE_ENDIAN);
        this.p = false;
        Iterator it = auiVar.e.iterator();
        while (true) {
            if (it.hasNext()) {
                if (((auh) it.next()).g == 3) {
                    this.p = true;
                    break;
                }
            } else {
                break;
            }
        }
        this.r = highestOneBit;
        int i2 = auiVar.f;
        this.t = i2 / highestOneBit;
        int i3 = auiVar.g;
        this.s = i3 / highestOneBit;
        this.c = this.j.g(i2 * i3);
        bek bekVar = this.j;
        int i4 = this.t * this.s;
        ?? r3 = bekVar.b;
        if (r3 == 0) {
            iArr = new int[i4];
        } else {
            iArr = (int[]) r3.a(i4, int[].class);
        }
        this.d = iArr;
    }
}
