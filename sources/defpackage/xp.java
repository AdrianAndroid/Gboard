package defpackage;

import android.text.TextUtils;
import android.util.Pair;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* renamed from: xp  reason: default package */
/* loaded from: classes2.dex */
public final class xp {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(Locale locale) {
        return TextUtils.getLayoutDirectionFromLocale(locale);
    }

    public static X509Certificate[][] b(String str) {
        Pair d;
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            if (randomAccessFile.length() < 22) {
                d = null;
            } else {
                d = xu.d(randomAccessFile, 0);
                if (d == null) {
                    d = xu.d(randomAccessFile, 65535);
                }
            }
            if (d != null) {
                ByteBuffer byteBuffer = (ByteBuffer) d.first;
                long longValue = ((Long) d.second).longValue();
                long j = (-20) + longValue;
                if (j >= 0) {
                    randomAccessFile.seek(j);
                    if (randomAccessFile.readInt() == 1347094023) {
                        throw new asv("ZIP64 APK not supported");
                    }
                }
                xu.e(byteBuffer);
                long c = xu.c(byteBuffer, byteBuffer.position() + 16);
                if (c < longValue) {
                    xu.e(byteBuffer);
                    if (c + xu.c(byteBuffer, byteBuffer.position() + 12) != longValue) {
                        throw new asv("ZIP Central Directory is not immediately followed by End of Central Directory");
                    }
                    if (c >= 32) {
                        ByteBuffer allocate = ByteBuffer.allocate(24);
                        allocate.order(ByteOrder.LITTLE_ENDIAN);
                        randomAccessFile.seek(c - allocate.capacity());
                        randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
                        if (allocate.getLong(8) != 2334950737559900225L || allocate.getLong(16) != 3617552046287187010L) {
                            throw new asv("No APK Signing Block before ZIP Central Directory");
                        }
                        long j2 = allocate.getLong(0);
                        if (j2 < allocate.capacity() || j2 > 2147483639) {
                            throw new asv("APK Signing Block size out of range: " + j2);
                        }
                        int i = (int) (8 + j2);
                        long j3 = c - i;
                        if (j3 < 0) {
                            throw new asv("APK Signing Block offset out of range: " + j3);
                        }
                        ByteBuffer allocate2 = ByteBuffer.allocate(i);
                        allocate2.order(ByteOrder.LITTLE_ENDIAN);
                        randomAccessFile.seek(j3);
                        long j4 = c;
                        randomAccessFile.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
                        long j5 = allocate2.getLong(0);
                        if (j5 != j2) {
                            throw new asv("APK Signing Block sizes in header and footer do not match: " + j5 + " vs " + j2);
                        }
                        Pair create = Pair.create(allocate2, Long.valueOf(j3));
                        ByteBuffer byteBuffer2 = (ByteBuffer) create.first;
                        long longValue2 = ((Long) create.second).longValue();
                        if (byteBuffer2.order() == ByteOrder.LITTLE_ENDIAN) {
                            int capacity = byteBuffer2.capacity() - 24;
                            if (capacity < 8) {
                                throw new IllegalArgumentException("end < start: " + capacity + " < 8");
                            }
                            int capacity2 = byteBuffer2.capacity();
                            if (capacity > byteBuffer2.capacity()) {
                                throw new IllegalArgumentException("end > capacity: " + capacity + " > " + capacity2);
                            }
                            int limit = byteBuffer2.limit();
                            int position = byteBuffer2.position();
                            byteBuffer2.position(0);
                            byteBuffer2.limit(capacity);
                            byteBuffer2.position(8);
                            ByteBuffer slice = byteBuffer2.slice();
                            slice.order(byteBuffer2.order());
                            byteBuffer2.position(0);
                            byteBuffer2.limit(limit);
                            byteBuffer2.position(position);
                            int i2 = 0;
                            while (slice.hasRemaining()) {
                                i2++;
                                if (slice.remaining() >= 8) {
                                    long j6 = slice.getLong();
                                    if (j6 >= 4 && j6 <= 2147483647L) {
                                        int i3 = (int) j6;
                                        int position2 = slice.position() + i3;
                                        if (i3 <= slice.remaining()) {
                                            if (slice.getInt() != 1896449818) {
                                                long j7 = j4;
                                                slice.position(position2);
                                                j4 = j7;
                                            } else {
                                                X509Certificate[][] l = l(randomAccessFile.getChannel(), new asu(f(slice, i3 - 4), longValue2, j4, longValue, byteBuffer));
                                                randomAccessFile.close();
                                                try {
                                                    randomAccessFile.close();
                                                } catch (IOException unused) {
                                                }
                                                return l;
                                            }
                                        } else {
                                            throw new asv("APK Signing Block entry #" + i2 + " size out of range: " + i3 + ", available: " + slice.remaining());
                                        }
                                    } else {
                                        throw new asv("APK Signing Block entry #" + i2 + " size out of range: " + j6);
                                    }
                                } else {
                                    throw new asv("Insufficient data to read size of APK Signing Block entry #" + i2);
                                }
                            }
                            throw new asv("No APK Signature Scheme v2 block in APK Signing Block");
                        }
                        throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
                    }
                    throw new asv("APK too small for APK Signing Block. ZIP Central Directory offset: " + c);
                }
                throw new asv("ZIP Central Directory offset out of range: " + c + ". ZIP End of Central Directory offset: " + longValue);
            }
            throw new asv("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile.length() + " bytes");
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    private static int c(int i) {
        if (i != 1) {
            if (i == 2) {
                return 64;
            }
            throw new IllegalArgumentException("Unknown content digest algorthm: " + i);
        }
        return 32;
    }

    private static int d(int i) {
        if (i != 513) {
            if (i == 514) {
                return 2;
            }
            if (i == 769) {
                return 1;
            }
            switch (i) {
                case 257:
                case 259:
                    return 1;
                case 258:
                case 260:
                    return 2;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
            }
        }
        return 1;
    }

    private static String e(int i) {
        if (i != 1) {
            if (i == 2) {
                return "SHA-512";
            }
            throw new IllegalArgumentException("Unknown content digest algorthm: " + i);
        }
        return "SHA-256";
    }

    private static ByteBuffer f(ByteBuffer byteBuffer, int i) {
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        int i2 = i + position;
        if (i2 < position || i2 > limit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i2);
        try {
            ByteBuffer slice = byteBuffer.slice();
            slice.order(byteBuffer.order());
            byteBuffer.position(i2);
            return slice;
        } finally {
            byteBuffer.limit(limit);
        }
    }

    private static ByteBuffer g(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < 4) {
            throw new IOException("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + byteBuffer.remaining());
        }
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i > byteBuffer.remaining()) {
            throw new IOException("Length-prefixed field longer than remaining buffer. Field length: " + i + ", remaining: " + byteBuffer.remaining());
        }
        return f(byteBuffer, i);
    }

    private static void h(Map map, FileChannel fileChannel, long j, long j2, long j3, ByteBuffer byteBuffer) {
        if (!map.isEmpty()) {
            ast astVar = new ast(fileChannel, 0L, j);
            ast astVar2 = new ast(fileChannel, j2, j3 - j2);
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.order(ByteOrder.LITTLE_ENDIAN);
            xu.e(duplicate);
            int position = duplicate.position() + 16;
            if (j < 0 || j > 4294967295L) {
                throw new IllegalArgumentException("uint32 value of out range: " + j);
            }
            duplicate.putInt(duplicate.position() + position, (int) j);
            asr asrVar = new asr(duplicate);
            int size = map.size();
            int[] iArr = new int[size];
            int i = 0;
            for (Integer num : map.keySet()) {
                iArr[i] = num.intValue();
                i++;
            }
            try {
                byte[][] k = k(iArr, new ass[]{astVar, astVar2, asrVar});
                for (int i2 = 0; i2 < size; i2++) {
                    int i3 = iArr[i2];
                    if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i3)), k[i2])) {
                        throw new SecurityException(e(i3).concat(" digest of contents did not verify"));
                    }
                }
                return;
            } catch (DigestException e) {
                throw new SecurityException("Failed to compute digest(s) of contents", e);
            }
        }
        throw new SecurityException("No digests provided");
    }

    private static byte[] i(ByteBuffer byteBuffer) {
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IOException("Negative length");
        }
        if (i > byteBuffer.remaining()) {
            throw new IOException("Underflow while reading length-prefixed value. Length: " + i + ", available: " + byteBuffer.remaining());
        }
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
        r11 = d(r4);
        r12 = d(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
        if (r11 == 1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
        if (r12 == 1) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.security.cert.X509Certificate[] j(java.nio.ByteBuffer r22, java.util.Map r23, java.security.cert.CertificateFactory r24) {
        /*
            Method dump skipped, instructions count: 676
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xp.j(java.nio.ByteBuffer, java.util.Map, java.security.cert.CertificateFactory):java.security.cert.X509Certificate[]");
    }

    private static byte[][] k(int[] iArr, ass[] assVarArr) {
        long j;
        int i;
        int length;
        MessageDigest messageDigest;
        long j2 = 0;
        long j3 = 0;
        int i2 = 0;
        while (true) {
            j = 1048576;
            if (i2 >= 3) {
                break;
            }
            j3 += (assVarArr[i2].a() + 1048575) / 1048576;
            i2++;
        }
        if (j3 >= 2097151) {
            throw new DigestException("Too many chunks: " + j3);
        }
        int i3 = (int) j3;
        byte[][] bArr = new byte[iArr.length];
        int i4 = 0;
        while (true) {
            length = iArr.length;
            if (i4 >= length) {
                break;
            }
            byte[] bArr2 = new byte[(c(iArr[i4]) * i3) + 5];
            bArr2[0] = 90;
            m(i3, bArr2);
            bArr[i4] = bArr2;
            i4++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        for (int i5 = 0; i5 < iArr.length; i5++) {
            String e = e(iArr[i5]);
            try {
                messageDigestArr[i5] = MessageDigest.getInstance(e);
            } catch (NoSuchAlgorithmException e2) {
                throw new RuntimeException(e.concat(" digest not supported"), e2);
            }
        }
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (i = 3; i6 < i; i = 3) {
            ass assVar = assVarArr[i6];
            long j4 = j2;
            int i9 = i6;
            long a = assVar.a();
            while (a > j2) {
                int min = (int) Math.min(a, j);
                m(min, bArr3);
                for (int i10 = 0; i10 < length; i10++) {
                    messageDigestArr[i10].update(bArr3);
                }
                long j5 = j4;
                try {
                    assVar.b(messageDigestArr, j5, min);
                    int i11 = 0;
                    while (i11 < iArr.length) {
                        int i12 = iArr[i11];
                        ass assVar2 = assVar;
                        byte[] bArr4 = bArr[i11];
                        int c = c(i12);
                        byte[] bArr5 = bArr3;
                        MessageDigest[] messageDigestArr2 = messageDigestArr;
                        int digest = messageDigestArr[i11].digest(bArr4, (i7 * c) + 5, c);
                        if (digest != c) {
                            throw new RuntimeException("Unexpected output size of " + messageDigest.getAlgorithm() + " digest: " + digest);
                        }
                        i11++;
                        assVar = assVar2;
                        bArr3 = bArr5;
                        messageDigestArr = messageDigestArr2;
                    }
                    ass assVar3 = assVar;
                    long j6 = min;
                    long j7 = j5 + j6;
                    a -= j6;
                    i7++;
                    j2 = 0;
                    j = 1048576;
                    assVar = assVar3;
                    j4 = j7;
                    bArr3 = bArr3;
                } catch (IOException e3) {
                    throw new DigestException("Failed to digest chunk #" + i7 + " of section #" + i8, e3);
                }
            }
            i8++;
            i6 = i9 + 1;
            j2 = 0;
            j = 1048576;
        }
        byte[][] bArr6 = new byte[iArr.length];
        for (int i13 = 0; i13 < iArr.length; i13++) {
            int i14 = iArr[i13];
            byte[] bArr7 = bArr[i13];
            String e4 = e(i14);
            try {
                bArr6[i13] = MessageDigest.getInstance(e4).digest(bArr7);
            } catch (NoSuchAlgorithmException e5) {
                throw new RuntimeException(e4.concat(" digest not supported"), e5);
            }
        }
        return bArr6;
    }

    private static X509Certificate[][] l(FileChannel fileChannel, asu asuVar) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer g = g(asuVar.a);
                int i = 0;
                while (g.hasRemaining()) {
                    i++;
                    try {
                        arrayList.add(j(g(g), hashMap, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e) {
                        throw new SecurityException("Failed to parse/verify signer #" + i + " block", e);
                    }
                }
                if (i <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (!hashMap.isEmpty()) {
                    h(hashMap, fileChannel, asuVar.b, asuVar.c, asuVar.d, asuVar.e);
                    return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()]);
                }
                throw new SecurityException("No content digests found");
            } catch (IOException e2) {
                throw new SecurityException("Failed to read list of signers", e2);
            }
        } catch (CertificateException e3) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e3);
        }
    }

    private static void m(int i, byte[] bArr) {
        bArr[1] = (byte) (i & 255);
        bArr[2] = (byte) ((i >>> 8) & 255);
        bArr[3] = (byte) ((i >>> 16) & 255);
        bArr[4] = (byte) (i >> 24);
    }
}
