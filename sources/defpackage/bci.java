package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: PG */
/* renamed from: bci  reason: default package */
/* loaded from: classes.dex */
public final class bci implements avc {
    private static final aqr d = new aqr(null, null, null);
    private final Context a;
    private final List b;
    private final bek c;
    private final aqr e;

    public bci(Context context, List list, axp axpVar, axn axnVar) {
        aqr aqrVar = d;
        this.a = context.getApplicationContext();
        this.b = list;
        this.c = new bek(axpVar, axnVar);
        this.e = aqrVar;
    }

    @Override // defpackage.avc
    public final /* bridge */ /* synthetic */ axh a(Object obj, int i, int i2, ava avaVar) {
        aui auiVar;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        auj i3 = this.e.i(byteBuffer);
        try {
            bge.b();
            if (i3.b == null) {
                throw new IllegalStateException("You must call setData() before parseHeader()");
            }
            bcm bcmVar = null;
            int i4 = 0;
            if (i3.e()) {
                auiVar = i3.c;
            } else {
                StringBuilder sb = new StringBuilder();
                for (int i5 = 0; i5 < 6; i5++) {
                    sb.append((char) i3.a());
                }
                if (sb.toString().startsWith("GIF")) {
                    i3.c.f = i3.b();
                    i3.c.g = i3.b();
                    int a = i3.a();
                    aui auiVar2 = i3.c;
                    auiVar2.h = (a & 128) != 0;
                    auiVar2.i = (int) Math.pow(2.0d, (a & 7) + 1);
                    i3.c.j = i3.a();
                    i3.c.k = i3.a();
                    if (i3.c.h && !i3.e()) {
                        aui auiVar3 = i3.c;
                        auiVar3.a = i3.f(auiVar3.i);
                        aui auiVar4 = i3.c;
                        auiVar4.l = auiVar4.a[auiVar4.j];
                    }
                } else {
                    i3.c.b = 1;
                }
                if (!i3.e()) {
                    while (!i3.e()) {
                        int i6 = i3.c.c;
                        int a2 = i3.a();
                        if (a2 == 33) {
                            int a3 = i3.a();
                            if (a3 == 1) {
                                i3.d();
                            } else if (a3 == 249) {
                                i3.c.d = new auh();
                                i3.a();
                                int a4 = i3.a();
                                auh auhVar = i3.c.d;
                                int i7 = (a4 & 28) >> 2;
                                auhVar.g = i7;
                                if (i7 == 0) {
                                    auhVar.g = 1;
                                }
                                auhVar.f = 1 == (a4 & 1);
                                int b = i3.b();
                                if (b < 2) {
                                    b = 10;
                                }
                                auh auhVar2 = i3.c.d;
                                auhVar2.i = b * 10;
                                auhVar2.h = i3.a();
                                i3.a();
                            } else if (a3 == 254) {
                                i3.d();
                            } else if (a3 == 255) {
                                i3.c();
                                StringBuilder sb2 = new StringBuilder();
                                for (int i8 = 0; i8 < 11; i8++) {
                                    sb2.append((char) i3.a[i8]);
                                }
                                if (sb2.toString().equals("NETSCAPE2.0")) {
                                    do {
                                        i3.c();
                                        byte[] bArr = i3.a;
                                        if (bArr[0] == 1) {
                                            i3.c.m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
                                        }
                                        if (i3.d > 0) {
                                        }
                                    } while (!i3.e());
                                } else {
                                    i3.d();
                                }
                            } else {
                                i3.d();
                            }
                        } else if (a2 == 44) {
                            aui auiVar5 = i3.c;
                            if (auiVar5.d == null) {
                                auiVar5.d = new auh();
                            }
                            auiVar5.d.a = i3.b();
                            i3.c.d.b = i3.b();
                            i3.c.d.c = i3.b();
                            i3.c.d.d = i3.b();
                            int a5 = i3.a();
                            int i9 = a5 & 128;
                            int pow = (int) Math.pow(2.0d, (a5 & 7) + 1);
                            auh auhVar3 = i3.c.d;
                            auhVar3.e = (a5 & 64) != 0;
                            if (i9 == 0) {
                                auhVar3.k = null;
                            } else {
                                auhVar3.k = i3.f(pow);
                            }
                            i3.c.d.j = i3.b.position();
                            i3.a();
                            i3.d();
                            if (!i3.e()) {
                                aui auiVar6 = i3.c;
                                auiVar6.c++;
                                auiVar6.e.add(auiVar6.d);
                            }
                        } else if (a2 == 59) {
                            break;
                        } else {
                            i3.c.b = 1;
                        }
                    }
                    aui auiVar7 = i3.c;
                    if (auiVar7.c < 0) {
                        auiVar7.b = 1;
                    }
                }
                auiVar = i3.c;
            }
            aui auiVar8 = auiVar;
            if (auiVar8.c > 0 && auiVar8.b == 0) {
                Bitmap.Config config = avaVar.b(bcr.a) == aun.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int min = Math.min(auiVar8.g / i2, auiVar8.f / i);
                if (min != 0) {
                    i4 = Integer.highestOneBit(min);
                }
                auk aukVar = new auk(this.c, auiVar8, byteBuffer, Math.max(1, i4), null, null);
                if (config != Bitmap.Config.ARGB_8888 && config != Bitmap.Config.RGB_565) {
                    throw new IllegalArgumentException("Unsupported format: " + String.valueOf(config) + ", must be one of " + String.valueOf(Bitmap.Config.ARGB_8888) + " or " + String.valueOf(Bitmap.Config.RGB_565));
                }
                aukVar.i = config;
                aukVar.b();
                Bitmap a6 = aukVar.a();
                if (a6 != null) {
                    bcmVar = new bcm(new bck(new bcj(new bcq(atb.b(this.a), aukVar, i, i2, bak.b, a6))));
                }
            }
            return bcmVar;
        } finally {
            this.e.j(i3);
        }
    }

    @Override // defpackage.avc
    public final /* bridge */ /* synthetic */ boolean b(Object obj, ava avaVar) {
        return !((Boolean) avaVar.b(bcr.b)).booleanValue() && cf.i(this.b, (ByteBuffer) obj) == ImageHeaderParser$ImageType.GIF;
    }
}
