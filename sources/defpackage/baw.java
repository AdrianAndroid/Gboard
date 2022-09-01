package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* compiled from: PG */
/* renamed from: baw  reason: default package */
/* loaded from: classes.dex */
public final class baw implements auq {
    static final byte[] a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));
    private static final int[] b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    private static final int e(bau bauVar, axn axnVar) {
        int i;
        ByteOrder byteOrder;
        short e;
        int d;
        int i2;
        int i3;
        short e2;
        short d2;
        try {
            int a2 = bauVar.a();
            if ((a2 & 65496) != 65496 && a2 != 19789 && a2 != 18761) {
                return -1;
            }
            while (bauVar.d() == 255 && (d2 = bauVar.d()) != 218 && d2 != 217) {
                i = bauVar.a() - 2;
                if (d2 == 225) {
                    break;
                }
                long j = i;
                if (bauVar.c(j) != j) {
                    break;
                }
            }
            i = -1;
            if (i == -1) {
                return -1;
            }
            byte[] bArr = (byte[]) axnVar.a(i, byte[].class);
            if (bauVar.b(bArr, i) == i && i > a.length) {
                int i4 = 0;
                while (true) {
                    byte[] bArr2 = a;
                    if (i4 < bArr2.length) {
                        if (bArr[i4] != bArr2[i4]) {
                            break;
                        }
                        i4++;
                    } else {
                        ByteBuffer byteBuffer = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
                        short e3 = cz.e(6, byteBuffer);
                        if (e3 != 18761) {
                            byteOrder = e3 != 19789 ? ByteOrder.BIG_ENDIAN : ByteOrder.BIG_ENDIAN;
                        } else {
                            byteOrder = ByteOrder.LITTLE_ENDIAN;
                        }
                        byteBuffer.order(byteOrder);
                        int d3 = cz.d(10, byteBuffer) + 6;
                        short e4 = cz.e(d3, byteBuffer);
                        for (int i5 = 0; i5 < e4; i5++) {
                            int i6 = d3 + 2 + (i5 * 12);
                            if (cz.e(i6, byteBuffer) == 274 && (e = cz.e(i6 + 2, byteBuffer)) > 0 && e <= 12 && (d = cz.d(i6 + 4, byteBuffer)) >= 0 && (i2 = d + b[e]) <= 4 && (i3 = i6 + 8) >= 0 && i3 <= byteBuffer.remaining() && i2 >= 0 && i2 + i3 <= byteBuffer.remaining()) {
                                e2 = cz.e(i3, byteBuffer);
                                break;
                            }
                        }
                    }
                }
            }
            e2 = -1;
            axnVar.c(bArr);
            return e2;
        } catch (bat unused) {
            return -1;
        }
    }

    private static final ImageHeaderParser$ImageType f(bau bauVar) {
        try {
            int a2 = bauVar.a();
            if (a2 == 65496) {
                return ImageHeaderParser$ImageType.JPEG;
            }
            int d = (a2 << 8) | bauVar.d();
            if (d == 4671814) {
                return ImageHeaderParser$ImageType.GIF;
            }
            int d2 = (d << 8) | bauVar.d();
            if (d2 == -1991225785) {
                bauVar.c(21L);
                try {
                    return bauVar.d() >= 3 ? ImageHeaderParser$ImageType.PNG_A : ImageHeaderParser$ImageType.PNG;
                } catch (bat unused) {
                    return ImageHeaderParser$ImageType.PNG;
                }
            } else if (d2 != 1380533830) {
                if (((bauVar.a() << 16) | bauVar.a()) == 1718909296) {
                    int a3 = (bauVar.a() << 16) | bauVar.a();
                    if (a3 != 1635150182 && a3 != 1635150195) {
                        bauVar.c(4L);
                        int i = d2 - 16;
                        if (i % 4 == 0) {
                            int i2 = 0;
                            while (i2 < 5 && i > 0) {
                                int a4 = (bauVar.a() << 16) | bauVar.a();
                                if (a4 != 1635150182 && a4 != 1635150195) {
                                    i2++;
                                    i -= 4;
                                }
                            }
                        }
                    }
                    return ImageHeaderParser$ImageType.AVIF;
                }
                return ImageHeaderParser$ImageType.UNKNOWN;
            } else {
                bauVar.c(4L);
                if (((bauVar.a() << 16) | bauVar.a()) != 1464156752) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int a5 = (bauVar.a() << 16) | bauVar.a();
                if ((a5 & (-256)) != 1448097792) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int i3 = a5 & 255;
                if (i3 != 88) {
                    if (i3 == 76) {
                        bauVar.c(4L);
                        return (bauVar.d() & 8) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
                    }
                    return ImageHeaderParser$ImageType.WEBP;
                }
                bauVar.c(4L);
                short d3 = bauVar.d();
                if ((d3 & 2) != 0) {
                    return ImageHeaderParser$ImageType.ANIMATED_WEBP;
                }
                if ((d3 & 16) != 0) {
                    return ImageHeaderParser$ImageType.WEBP_A;
                }
                return ImageHeaderParser$ImageType.WEBP;
            }
        } catch (bat unused2) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    @Override // defpackage.auq
    public final int a(InputStream inputStream, axn axnVar) {
        ce.m(inputStream);
        bav bavVar = new bav(inputStream, 0);
        ce.m(axnVar);
        return e(bavVar, axnVar);
    }

    @Override // defpackage.auq
    public final int b(ByteBuffer byteBuffer, axn axnVar) {
        ce.m(byteBuffer);
        bav bavVar = new bav(byteBuffer, 1);
        ce.m(axnVar);
        return e(bavVar, axnVar);
    }

    @Override // defpackage.auq
    public final ImageHeaderParser$ImageType c(InputStream inputStream) {
        ce.m(inputStream);
        return f(new bav(inputStream, 0));
    }

    @Override // defpackage.auq
    public final ImageHeaderParser$ImageType d(ByteBuffer byteBuffer) {
        ce.m(byteBuffer);
        return f(new bav(byteBuffer, 1));
    }
}
