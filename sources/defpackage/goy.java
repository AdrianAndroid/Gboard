package defpackage;

import android.content.Context;
import android.os.Environment;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;

/* compiled from: PG */
/* renamed from: goy  reason: default package */
/* loaded from: classes.dex */
public final class goy implements gpc {
    private final InputStream a;
    private final byte[] b;
    private boolean c;
    private final /* synthetic */ int d;
    private bvq e;

    public goy(InputStream inputStream, int i, int i2) {
        int i3;
        knd kndVar;
        InputStream inputStream2 = inputStream;
        this.d = i2;
        int i4 = i - 1;
        ldu lduVar = ldu.a;
        if (i4 != 0) {
            if (i4 == 2) {
                lduVar.a();
                lduVar.a();
            } else if (i4 != 3 && i4 != 9) {
                if (i4 != 10) {
                    throw new IllegalArgumentException("Unrecognized encoding: " + ndb.ac(i) + ". Please add this encoding to CodecConfig if needed.");
                }
                lduVar.a();
                lduVar.a();
                lduVar.a();
                long intValue = ((Integer) lduVar.a()).intValue();
                if (((Integer) lduVar.a()).intValue() == 1) {
                    long min = Math.min(intValue, 24000L);
                    if (intValue != min) {
                        ((ltd) ((ltd) kne.a.d()).k("com/google/android/libraries/speech/encoding/AudioEncodingUtils", "maybeReduceOggOpusBitRate", 442, "AudioEncodingUtils.java")).J("OggOpus bitrate reduced from %d to %d, as channel count was %d.", Long.valueOf(intValue), Long.valueOf(min), 1);
                    }
                    intValue = min;
                }
                if (((Integer) lduVar.a()).intValue() != intValue) {
                    ((ltd) ((ltd) kng.a.d()).k("com/google/android/libraries/speech/encoding/CodecConfig$Builder", "validateAndBuild", 134, "CodecConfig.java")).F("Opus encoder requested with bitrate %d instead of recommended bitrate %d. Is this an oversight when constructing the CodecConfig?", lduVar.a(), intValue);
                }
            }
        }
        kng kngVar = new kng(i, lduVar, lduVar, lduVar);
        int i5 = kngVar.e;
        int i6 = i5 - 1;
        if (i5 != 0) {
            if (i6 != 0) {
                if (i6 == 2) {
                    kndVar = new knd(inputStream, "audio/flac", ((Integer) kngVar.c.a()).intValue(), 30000, ((Integer) kngVar.d.a()).intValue());
                } else if (i6 == 3) {
                    try {
                        inputStream2 = new knc(inputStream2);
                    } catch (Exception unused) {
                        try {
                            synchronized (kne.class) {
                                if (kne.b == null) {
                                    kne.b = Class.forName("android.media.AmrInputStream").getConstructor(InputStream.class);
                                }
                                inputStream2 = (InputStream) kne.b.newInstance(inputStream2);
                            }
                        } catch (Exception e) {
                            throw new RuntimeException("Exception while instantiating AmrInputStream", e);
                        }
                    }
                } else if (i6 == 9) {
                    kndVar = new knd(inputStream, "audio/amr-wb", 16000, 23850, 1);
                } else if (i6 != 10) {
                    throw new IllegalArgumentException("unsupported encoding: ".concat(ndb.ac(i5)));
                } else {
                    inputStream2 = kne.a(inputStream2, ((Integer) kngVar.b.a()).intValue(), ((Integer) kngVar.c.a()).intValue(), ((Integer) kngVar.d.a()).intValue());
                }
                inputStream2 = kndVar;
            }
            if (i4 != 0) {
                if (i4 == 3) {
                    i3 = 384;
                    Environment.getExternalStorageDirectory().getPath();
                    this.a = inputStream2;
                    this.b = new byte[i3];
                    return;
                } else if (i4 != 9) {
                    throw new RuntimeException("Unsupported AMR encoding:".concat(ndb.ad(i)));
                }
            }
            i3 = 224;
            Environment.getExternalStorageDirectory().getPath();
            this.a = inputStream2;
            this.b = new byte[i3];
            return;
        }
        throw null;
    }

    private final void c() {
        if (!this.c) {
            this.c = true;
            lyq.a(this.a);
        }
    }

    private final void d() {
        if (!this.c) {
            this.c = true;
            lyq.a(this.a);
        }
    }

    @Override // defpackage.gpc
    public final void b() {
    }

    @Override // defpackage.gpc, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.d != 0) {
            d();
        } else {
            c();
        }
    }

    @Override // defpackage.gpc
    public final nks hK() {
        if (this.d == 0) {
            if (this.e == null) {
                this.e = bvq.m();
            }
            try {
                if (this.c) {
                    return null;
                }
                int a = lyp.a(this.a, this.b, 0, 224);
                if (a > 0) {
                    return bnt.a(this.b, a);
                }
                c();
                return null;
            } catch (IOException e) {
                c();
                throw new bmy(e);
            }
        }
        if (this.e == null) {
            this.e = bvq.m();
        }
        try {
            if (this.c) {
                return null;
            }
            InputStream inputStream = this.a;
            byte[] bArr = this.b;
            int a2 = lyp.a(inputStream, bArr, 0, bArr.length);
            if (a2 > 0) {
                return bnt.a(this.b, a2);
            }
            d();
            return null;
        } catch (IOException e2) {
            d();
            throw new bmy(e2);
        }
    }

    public goy(InputStream inputStream, Context context, int i) {
        this.d = i;
        Environment.getExternalStorageDirectory().getPath();
        ce.g(context, "ogg_opus_encoder", new HashSet(), knh.a);
        kni.b = true;
        this.a = kne.a(inputStream, 24000, 16000, 1);
        this.b = new byte[224];
    }
}
